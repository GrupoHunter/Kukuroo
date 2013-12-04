package org.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.miniGobstones.HayBolitas
import org.miniGobstones.If
import org.miniGobstones.Model
import org.miniGobstones.Mover
import org.miniGobstones.MoverN
import org.miniGobstones.Poner
import org.miniGobstones.PonerN
import org.miniGobstones.PuedeMover

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MiniGobstonesGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var model = resource.contents.head as Model
		fsa.generateFile('''«model.packageName»/«model.eResource.className».java''', toJavaCode(model));
	}

	def packageName(Model model) {
		return '''miniGobstones/runner'''
	}

	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.')).toFirstUpper
	}

	def toJavaCode(Model model) {
		'''
			package «model.packageName.replace('/', '.')»;
			
			import modeloMiniGobstones.*;
			
			/**
				Generates code from your model «model.eResource.className».mbgs
			**/
			public class «model.eResource.className» {
				private static Cabezal cabezal = new Cabezal();
				
				public static void main(String[] args) {
					«model.compile»
					
					cabezal.imprimirTablero();
				}
			}
		'''
	}

	def compile(Model model) {'''
			«FOR command : model.main.commands»
				«command.genCompile»
			«ENDFOR»
		'''
	}

	def dispatch String genCompile(Poner poner) {'''
			cabezal.poner(Color.«poner.color»);
		'''
	}

	def dispatch String genCompile(Mover mover) {'''
			cabezal.mover(Direccion.«mover.dir»);
		'''
	}

	def dispatch String genCompile(If ifthen) {'''
			if(«ifthen.expr.genExpr»){
				«FOR command : ifthen.commandsThen»
					«command.genCompile»
				«ENDFOR»
			}«IF !ifthen.commandsElse.empty»
					else{
						«FOR command : ifthen.commandsElse»
							«command.genCompile»
						«ENDFOR»
					}
			«ENDIF»
		'''
	}

	def dispatch String genExpr(HayBolitas hayBolitas) {
		'''cabezal.hayBolitas(Color.«hayBolitas.color»)'''
	}
	
	def dispatch String genExpr(PuedeMover puedeMover) {
		'''cabezal.puedeMover(Direccion.«puedeMover.dir»)'''
	}

	def dispatch String genCompile(PonerN ponerN) {
		'''
			for (int i = 0; i < «ponerN.int»; i++)
				cabezal.poner(Color.«ponerN.color»);
				
		'''
	}

	def dispatch String genCompile(MoverN moverN) {
		'''
			for (int i = 0; i < «moverN.int»; i++)
				cabezal.mover(Direccion.«moverN.dir»);
				
		'''
	}
	
}
