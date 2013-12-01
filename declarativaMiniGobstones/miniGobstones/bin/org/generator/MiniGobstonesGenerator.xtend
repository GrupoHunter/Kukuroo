package org.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.miniGobstones.Model
import org.miniGobstones.Command
import org.miniGobstones.Poner
import org.miniGobstones.Mover

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MiniGobstonesGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(className(resource) + ".java", toJavaCode(resource));
	}

	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.')).toFirstUpper
	}

	def toJavaCode(Resource res) {
		var model = res.contents.head as Model
		model.toJavaCode
	}

	def toJavaCode(Model model) {'''
			package miniGobstones.main.«model.eResource.className»;
		
			import enums.Color;
			import enums.Direccion;			
			
			public class «model.eResource.className.toFirstUpper» {
				public static void main(String[] args) {	
					«model.compile»
				}
			}
		'''
	}

	def compile(Model model) {'''
			«FOR command : model.main.commands»
				«command.compile»
			«ENDFOR»
		'''
	}

	def compile(Command command) {
		return switch command.eClass.name {
			case "Poner" : '''Cabezal.getInstance().poner(«(command as Poner).color»);'''
			case "Mover" : '''Cabezal.getInstance().mover(«(command as Mover).dir»);'''
			default : ''''''
		}
	}
}
