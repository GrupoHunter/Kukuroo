package org.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.miniGobstones.Expression;
import org.miniGobstones.For;
import org.miniGobstones.HayBolitas;
import org.miniGobstones.If;
import org.miniGobstones.MiniGobstonesPackage;
import org.miniGobstones.Model;
import org.miniGobstones.Mover;
import org.miniGobstones.MoverN;
import org.miniGobstones.Operator;
import org.miniGobstones.Poner;
import org.miniGobstones.PonerN;
import org.miniGobstones.Procedure;
import org.miniGobstones.PuedeMover;
import org.miniGobstones.Variable;
import org.miniGobstones.While;
import org.services.MiniGobstonesGrammarAccess;

@SuppressWarnings("all")
public class MiniGobstonesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MiniGobstonesGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MiniGobstonesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MiniGobstonesPackage.EXPRESSION:
				if(context == grammarAccess.getTerminalExpressionRule()) {
					sequence_TerminalExpression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.FOR:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getForRule()) {
					sequence_For(context, (For) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.HAY_BOLITAS:
				if(context == grammarAccess.getBooleansRule() ||
				   context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getHayBolitasRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_HayBolitas(context, (HayBolitas) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.IF:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getIfRule()) {
					sequence_If(context, (If) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.MOVER:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getMoverRule()) {
					sequence_Mover(context, (Mover) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.MOVER_N:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getMoverNRule()) {
					sequence_MoverN(context, (MoverN) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.OPERATOR:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Expression(context, (Operator) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.PONER:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getPonerRule()) {
					sequence_Poner(context, (Poner) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.PONER_N:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getPonerNRule()) {
					sequence_PonerN(context, (PonerN) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.PROCEDURE:
				if(context == grammarAccess.getProcedureRule()) {
					sequence_Procedure(context, (Procedure) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.PUEDE_MOVER:
				if(context == grammarAccess.getBooleansRule() ||
				   context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getPuedeMoverRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_PuedeMover(context, (PuedeMover) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.VARIABLE:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case MiniGobstonesPackage.WHILE:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getWhileRule()) {
					sequence_While(context, (While) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (opNot='!'? left=TerminalExpression (op=Operator right=TerminalExpression)?)
	 */
	protected void sequence_Expression(EObject context, Operator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     varName=ID
	 */
	protected void sequence_For(EObject context, For semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     color=Color
	 */
	protected void sequence_HayBolitas(EObject context, HayBolitas semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expression commandsThen+=Command+ commandsElse+=Command*)
	 */
	protected void sequence_If(EObject context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     main=Procedure
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniGobstonesPackage.Literals.MODEL__MAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniGobstonesPackage.Literals.MODEL__MAIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getMainProcedureParserRuleCall_0(), semanticObject.getMain());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (int=INT dir=Direccion)
	 */
	protected void sequence_MoverN(EObject context, MoverN semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniGobstonesPackage.Literals.MOVER_N__INT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniGobstonesPackage.Literals.MOVER_N__INT));
			if(transientValues.isValueTransient(semanticObject, MiniGobstonesPackage.Literals.MOVER_N__DIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniGobstonesPackage.Literals.MOVER_N__DIR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMoverNAccess().getIntINTTerminalRuleCall_3_0(), semanticObject.getInt());
		feeder.accept(grammarAccess.getMoverNAccess().getDirDireccionEnumRuleCall_5_0(), semanticObject.getDir());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dir=Direccion
	 */
	protected void sequence_Mover(EObject context, Mover semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniGobstonesPackage.Literals.MOVER__DIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniGobstonesPackage.Literals.MOVER__DIR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMoverAccess().getDirDireccionEnumRuleCall_3_0(), semanticObject.getDir());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (int=INT color=Color)
	 */
	protected void sequence_PonerN(EObject context, PonerN semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniGobstonesPackage.Literals.PONER_N__INT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniGobstonesPackage.Literals.PONER_N__INT));
			if(transientValues.isValueTransient(semanticObject, MiniGobstonesPackage.Literals.PONER_N__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniGobstonesPackage.Literals.PONER_N__COLOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPonerNAccess().getIntINTTerminalRuleCall_3_0(), semanticObject.getInt());
		feeder.accept(grammarAccess.getPonerNAccess().getColorColorEnumRuleCall_5_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     color=Color
	 */
	protected void sequence_Poner(EObject context, Poner semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniGobstonesPackage.Literals.PONER__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniGobstonesPackage.Literals.PONER__COLOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPonerAccess().getColorColorEnumRuleCall_3_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID commands+=Command*)
	 */
	protected void sequence_Procedure(EObject context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dir=Direccion
	 */
	protected void sequence_PuedeMover(EObject context, PuedeMover semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=Booleans
	 */
	protected void sequence_TerminalExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     varName=ID
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniGobstonesPackage.Literals.VARIABLE__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniGobstonesPackage.Literals.VARIABLE__VAR_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getVarNameIDTerminalRuleCall_0_2_0(), semanticObject.getVarName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expression commands+=Command*)
	 */
	protected void sequence_While(EObject context, While semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
