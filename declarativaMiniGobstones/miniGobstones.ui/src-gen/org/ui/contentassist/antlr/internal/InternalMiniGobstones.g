/*
* generated by Xtext
*/
grammar InternalMiniGobstones;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.services.MiniGobstonesGrammarAccess;

}

@parser::members {
 
 	private MiniGobstonesGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(MiniGobstonesGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getMainAssignment()); }
(rule__Model__MainAssignment)
{ after(grammarAccess.getModelAccess().getMainAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleProcedure
entryRuleProcedure 
:
{ before(grammarAccess.getProcedureRule()); }
	 ruleProcedure
{ after(grammarAccess.getProcedureRule()); } 
	 EOF 
;

// Rule Procedure
ruleProcedure
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getProcedureAccess().getGroup()); }
(rule__Procedure__Group__0)
{ after(grammarAccess.getProcedureAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCommand
entryRuleCommand 
:
{ before(grammarAccess.getCommandRule()); }
	 ruleCommand
{ after(grammarAccess.getCommandRule()); } 
	 EOF 
;

// Rule Command
ruleCommand
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCommandAccess().getAlternatives()); }
(rule__Command__Alternatives)
{ after(grammarAccess.getCommandAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePonerN
entryRulePonerN 
:
{ before(grammarAccess.getPonerNRule()); }
	 rulePonerN
{ after(grammarAccess.getPonerNRule()); } 
	 EOF 
;

// Rule PonerN
rulePonerN
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPonerNAccess().getGroup()); }
(rule__PonerN__Group__0)
{ after(grammarAccess.getPonerNAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMoverN
entryRuleMoverN 
:
{ before(grammarAccess.getMoverNRule()); }
	 ruleMoverN
{ after(grammarAccess.getMoverNRule()); } 
	 EOF 
;

// Rule MoverN
ruleMoverN
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMoverNAccess().getGroup()); }
(rule__MoverN__Group__0)
{ after(grammarAccess.getMoverNAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePoner
entryRulePoner 
:
{ before(grammarAccess.getPonerRule()); }
	 rulePoner
{ after(grammarAccess.getPonerRule()); } 
	 EOF 
;

// Rule Poner
rulePoner
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPonerAccess().getGroup()); }
(rule__Poner__Group__0)
{ after(grammarAccess.getPonerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMover
entryRuleMover 
:
{ before(grammarAccess.getMoverRule()); }
	 ruleMover
{ after(grammarAccess.getMoverRule()); } 
	 EOF 
;

// Rule Mover
ruleMover
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMoverAccess().getGroup()); }
(rule__Mover__Group__0)
{ after(grammarAccess.getMoverAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleHayBolitas
entryRuleHayBolitas 
:
{ before(grammarAccess.getHayBolitasRule()); }
	 ruleHayBolitas
{ after(grammarAccess.getHayBolitasRule()); } 
	 EOF 
;

// Rule HayBolitas
ruleHayBolitas
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getHayBolitasAccess().getGroup()); }
(rule__HayBolitas__Group__0)
{ after(grammarAccess.getHayBolitasAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePuedeMover
entryRulePuedeMover 
:
{ before(grammarAccess.getPuedeMoverRule()); }
	 rulePuedeMover
{ after(grammarAccess.getPuedeMoverRule()); } 
	 EOF 
;

// Rule PuedeMover
rulePuedeMover
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPuedeMoverAccess().getGroup()); }
(rule__PuedeMover__Group__0)
{ after(grammarAccess.getPuedeMoverAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIf
entryRuleIf 
:
{ before(grammarAccess.getIfRule()); }
	 ruleIf
{ after(grammarAccess.getIfRule()); } 
	 EOF 
;

// Rule If
ruleIf
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIfAccess().getGroup()); }
(rule__If__Group__0)
{ after(grammarAccess.getIfAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBooleans
entryRuleBooleans 
:
{ before(grammarAccess.getBooleansRule()); }
	 ruleBooleans
{ after(grammarAccess.getBooleansRule()); } 
	 EOF 
;

// Rule Booleans
ruleBooleans
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBooleansAccess().getAlternatives()); }
(rule__Booleans__Alternatives)
{ after(grammarAccess.getBooleansAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule Color
ruleColor
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getColorAccess().getAlternatives()); }
(rule__Color__Alternatives)
{ after(grammarAccess.getColorAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule Direccion
ruleDireccion
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDireccionAccess().getAlternatives()); }
(rule__Direccion__Alternatives)
{ after(grammarAccess.getDireccionAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Command__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getPonerParserRuleCall_0()); }
	rulePoner
{ after(grammarAccess.getCommandAccess().getPonerParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getCommandAccess().getMoverParserRuleCall_1()); }
	ruleMover
{ after(grammarAccess.getCommandAccess().getMoverParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getCommandAccess().getPonerNParserRuleCall_2()); }
	rulePonerN
{ after(grammarAccess.getCommandAccess().getPonerNParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getCommandAccess().getMoverNParserRuleCall_3()); }
	ruleMoverN
{ after(grammarAccess.getCommandAccess().getMoverNParserRuleCall_3()); }
)

    |(
{ before(grammarAccess.getCommandAccess().getHayBolitasParserRuleCall_4()); }
	ruleHayBolitas
{ after(grammarAccess.getCommandAccess().getHayBolitasParserRuleCall_4()); }
)

    |(
{ before(grammarAccess.getCommandAccess().getPuedeMoverParserRuleCall_5()); }
	rulePuedeMover
{ after(grammarAccess.getCommandAccess().getPuedeMoverParserRuleCall_5()); }
)

    |(
{ before(grammarAccess.getCommandAccess().getIfParserRuleCall_6()); }
	ruleIf
{ after(grammarAccess.getCommandAccess().getIfParserRuleCall_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Booleans__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleansAccess().getHayBolitasParserRuleCall_0()); }
	ruleHayBolitas
{ after(grammarAccess.getBooleansAccess().getHayBolitasParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getBooleansAccess().getPuedeMoverParserRuleCall_1()); }
	rulePuedeMover
{ after(grammarAccess.getBooleansAccess().getPuedeMoverParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Color__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0()); }
(	'Verde' 
)
{ after(grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1()); }
(	'Rojo' 
)
{ after(grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2()); }
(	'Azul' 
)
{ after(grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getColorAccess().getNegroEnumLiteralDeclaration_3()); }
(	'Negro' 
)
{ after(grammarAccess.getColorAccess().getNegroEnumLiteralDeclaration_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Direccion__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0()); }
(	'Norte' 
)
{ after(grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1()); }
(	'Sur' 
)
{ after(grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2()); }
(	'Este' 
)
{ after(grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getDireccionAccess().getOesteEnumLiteralDeclaration_3()); }
(	'Oeste' 
)
{ after(grammarAccess.getDireccionAccess().getOesteEnumLiteralDeclaration_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Procedure__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Procedure__Group__0__Impl
	rule__Procedure__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Procedure__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); }

	'procedure' 

{ after(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Procedure__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Procedure__Group__1__Impl
	rule__Procedure__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Procedure__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureAccess().getNameAssignment_1()); }
(rule__Procedure__NameAssignment_1)
{ after(grammarAccess.getProcedureAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Procedure__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Procedure__Group__2__Impl
	rule__Procedure__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Procedure__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureAccess().getLBRACETerminalRuleCall_2()); }
	RULE_LBRACE
{ after(grammarAccess.getProcedureAccess().getLBRACETerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Procedure__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Procedure__Group__3__Impl
	rule__Procedure__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Procedure__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureAccess().getCommandsAssignment_3()); }
(rule__Procedure__CommandsAssignment_3)*
{ after(grammarAccess.getProcedureAccess().getCommandsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Procedure__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Procedure__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Procedure__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureAccess().getRBRACETerminalRuleCall_4()); }
	RULE_RBRACE
{ after(grammarAccess.getProcedureAccess().getRBRACETerminalRuleCall_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__PonerN__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PonerN__Group__0__Impl
	rule__PonerN__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PonerN__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerNAccess().getPonerNAction_0()); }
(

)
{ after(grammarAccess.getPonerNAccess().getPonerNAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PonerN__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PonerN__Group__1__Impl
	rule__PonerN__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PonerN__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerNAccess().getPonerNKeyword_1()); }

	'PonerN' 

{ after(grammarAccess.getPonerNAccess().getPonerNKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PonerN__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PonerN__Group__2__Impl
	rule__PonerN__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PonerN__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerNAccess().getLPARTerminalRuleCall_2()); }
	RULE_LPAR
{ after(grammarAccess.getPonerNAccess().getLPARTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PonerN__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PonerN__Group__3__Impl
	rule__PonerN__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PonerN__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerNAccess().getIntAssignment_3()); }
(rule__PonerN__IntAssignment_3)
{ after(grammarAccess.getPonerNAccess().getIntAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PonerN__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PonerN__Group__4__Impl
	rule__PonerN__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PonerN__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerNAccess().getCommaKeyword_4()); }

	',' 

{ after(grammarAccess.getPonerNAccess().getCommaKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PonerN__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PonerN__Group__5__Impl
	rule__PonerN__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__PonerN__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerNAccess().getColorAssignment_5()); }
(rule__PonerN__ColorAssignment_5)
{ after(grammarAccess.getPonerNAccess().getColorAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PonerN__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PonerN__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PonerN__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerNAccess().getRPARTerminalRuleCall_6()); }
	RULE_RPAR
{ after(grammarAccess.getPonerNAccess().getRPARTerminalRuleCall_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MoverN__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MoverN__Group__0__Impl
	rule__MoverN__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MoverN__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverNAccess().getMoverNAction_0()); }
(

)
{ after(grammarAccess.getMoverNAccess().getMoverNAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MoverN__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MoverN__Group__1__Impl
	rule__MoverN__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MoverN__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverNAccess().getMoverNKeyword_1()); }

	'MoverN' 

{ after(grammarAccess.getMoverNAccess().getMoverNKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MoverN__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MoverN__Group__2__Impl
	rule__MoverN__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MoverN__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverNAccess().getLPARTerminalRuleCall_2()); }
	RULE_LPAR
{ after(grammarAccess.getMoverNAccess().getLPARTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MoverN__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MoverN__Group__3__Impl
	rule__MoverN__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MoverN__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverNAccess().getIntAssignment_3()); }
(rule__MoverN__IntAssignment_3)
{ after(grammarAccess.getMoverNAccess().getIntAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MoverN__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MoverN__Group__4__Impl
	rule__MoverN__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MoverN__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverNAccess().getCommaKeyword_4()); }

	',' 

{ after(grammarAccess.getMoverNAccess().getCommaKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MoverN__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MoverN__Group__5__Impl
	rule__MoverN__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MoverN__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverNAccess().getDirAssignment_5()); }
(rule__MoverN__DirAssignment_5)
{ after(grammarAccess.getMoverNAccess().getDirAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MoverN__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MoverN__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MoverN__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverNAccess().getRPARTerminalRuleCall_6()); }
	RULE_RPAR
{ after(grammarAccess.getMoverNAccess().getRPARTerminalRuleCall_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Poner__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poner__Group__0__Impl
	rule__Poner__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Poner__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerAccess().getPonerAction_0()); }
(

)
{ after(grammarAccess.getPonerAccess().getPonerAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Poner__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poner__Group__1__Impl
	rule__Poner__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Poner__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerAccess().getPonerKeyword_1()); }

	'Poner' 

{ after(grammarAccess.getPonerAccess().getPonerKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Poner__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poner__Group__2__Impl
	rule__Poner__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Poner__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerAccess().getLPARTerminalRuleCall_2()); }
	RULE_LPAR
{ after(grammarAccess.getPonerAccess().getLPARTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Poner__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poner__Group__3__Impl
	rule__Poner__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Poner__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerAccess().getColorAssignment_3()); }
(rule__Poner__ColorAssignment_3)
{ after(grammarAccess.getPonerAccess().getColorAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Poner__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Poner__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Poner__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerAccess().getRPARTerminalRuleCall_4()); }
	RULE_RPAR
{ after(grammarAccess.getPonerAccess().getRPARTerminalRuleCall_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Mover__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mover__Group__0__Impl
	rule__Mover__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mover__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverAccess().getMoverAction_0()); }
(

)
{ after(grammarAccess.getMoverAccess().getMoverAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mover__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mover__Group__1__Impl
	rule__Mover__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mover__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverAccess().getMoverKeyword_1()); }

	'Mover' 

{ after(grammarAccess.getMoverAccess().getMoverKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mover__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mover__Group__2__Impl
	rule__Mover__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Mover__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverAccess().getLPARTerminalRuleCall_2()); }
	RULE_LPAR
{ after(grammarAccess.getMoverAccess().getLPARTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mover__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mover__Group__3__Impl
	rule__Mover__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Mover__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverAccess().getDirAssignment_3()); }
(rule__Mover__DirAssignment_3)
{ after(grammarAccess.getMoverAccess().getDirAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mover__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mover__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mover__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverAccess().getRPARTerminalRuleCall_4()); }
	RULE_RPAR
{ after(grammarAccess.getMoverAccess().getRPARTerminalRuleCall_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__HayBolitas__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HayBolitas__Group__0__Impl
	rule__HayBolitas__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HayBolitas__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0()); }

	'hayBolitas' 

{ after(grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HayBolitas__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HayBolitas__Group__1__Impl
	rule__HayBolitas__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HayBolitas__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHayBolitasAccess().getLPARTerminalRuleCall_1()); }
	RULE_LPAR
{ after(grammarAccess.getHayBolitasAccess().getLPARTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HayBolitas__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HayBolitas__Group__2__Impl
	rule__HayBolitas__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HayBolitas__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHayBolitasAccess().getColorAssignment_2()); }
(rule__HayBolitas__ColorAssignment_2)
{ after(grammarAccess.getHayBolitasAccess().getColorAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HayBolitas__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HayBolitas__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HayBolitas__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHayBolitasAccess().getRPARTerminalRuleCall_3()); }
	RULE_RPAR
{ after(grammarAccess.getHayBolitasAccess().getRPARTerminalRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__PuedeMover__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PuedeMover__Group__0__Impl
	rule__PuedeMover__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PuedeMover__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPuedeMoverAccess().getPuedeMoverKeyword_0()); }

	'puedeMover' 

{ after(grammarAccess.getPuedeMoverAccess().getPuedeMoverKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PuedeMover__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PuedeMover__Group__1__Impl
	rule__PuedeMover__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PuedeMover__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPuedeMoverAccess().getLPARTerminalRuleCall_1()); }
	RULE_LPAR
{ after(grammarAccess.getPuedeMoverAccess().getLPARTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PuedeMover__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PuedeMover__Group__2__Impl
	rule__PuedeMover__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PuedeMover__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPuedeMoverAccess().getDirAssignment_2()); }
(rule__PuedeMover__DirAssignment_2)
{ after(grammarAccess.getPuedeMoverAccess().getDirAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PuedeMover__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PuedeMover__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PuedeMover__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPuedeMoverAccess().getRPARTerminalRuleCall_3()); }
	RULE_RPAR
{ after(grammarAccess.getPuedeMoverAccess().getRPARTerminalRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__If__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__If__Group__0__Impl
	rule__If__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__If__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getIfAction_0()); }
(

)
{ after(grammarAccess.getIfAccess().getIfAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__If__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__If__Group__1__Impl
	rule__If__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__If__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getIfKeyword_1()); }

	'if' 

{ after(grammarAccess.getIfAccess().getIfKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__If__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__If__Group__2__Impl
	rule__If__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__If__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getLPARTerminalRuleCall_2()); }
	RULE_LPAR
{ after(grammarAccess.getIfAccess().getLPARTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__If__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__If__Group__3__Impl
	rule__If__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__If__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getExprAssignment_3()); }
(rule__If__ExprAssignment_3)
{ after(grammarAccess.getIfAccess().getExprAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__If__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__If__Group__4__Impl
	rule__If__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__If__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getRPARTerminalRuleCall_4()); }
	RULE_RPAR
{ after(grammarAccess.getIfAccess().getRPARTerminalRuleCall_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__If__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__If__Group__5__Impl
	rule__If__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__If__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getLBRACETerminalRuleCall_5()); }
	RULE_LBRACE
{ after(grammarAccess.getIfAccess().getLBRACETerminalRuleCall_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__If__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__If__Group__6__Impl
	rule__If__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__If__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getIfAccess().getCommandsThenAssignment_6()); }
(rule__If__CommandsThenAssignment_6)
{ after(grammarAccess.getIfAccess().getCommandsThenAssignment_6()); }
)
(
{ before(grammarAccess.getIfAccess().getCommandsThenAssignment_6()); }
(rule__If__CommandsThenAssignment_6)*
{ after(grammarAccess.getIfAccess().getCommandsThenAssignment_6()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__If__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__If__Group__7__Impl
	rule__If__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__If__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getRBRACETerminalRuleCall_7()); }
	RULE_RBRACE
{ after(grammarAccess.getIfAccess().getRBRACETerminalRuleCall_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__If__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__If__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__If__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getGroup_8()); }
(rule__If__Group_8__0)?
{ after(grammarAccess.getIfAccess().getGroup_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__If__Group_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__If__Group_8__0__Impl
	rule__If__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__If__Group_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getElseKeyword_8_0()); }

	'else' 

{ after(grammarAccess.getIfAccess().getElseKeyword_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__If__Group_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__If__Group_8__1__Impl
	rule__If__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__If__Group_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getLBRACETerminalRuleCall_8_1()); }
	RULE_LBRACE
{ after(grammarAccess.getIfAccess().getLBRACETerminalRuleCall_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__If__Group_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__If__Group_8__2__Impl
	rule__If__Group_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__If__Group_8__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getIfAccess().getCommandsElseAssignment_8_2()); }
(rule__If__CommandsElseAssignment_8_2)
{ after(grammarAccess.getIfAccess().getCommandsElseAssignment_8_2()); }
)
(
{ before(grammarAccess.getIfAccess().getCommandsElseAssignment_8_2()); }
(rule__If__CommandsElseAssignment_8_2)*
{ after(grammarAccess.getIfAccess().getCommandsElseAssignment_8_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__If__Group_8__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__If__Group_8__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__If__Group_8__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getRBRACETerminalRuleCall_8_3()); }
	RULE_RBRACE
{ after(grammarAccess.getIfAccess().getRBRACETerminalRuleCall_8_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__Model__MainAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getMainProcedureParserRuleCall_0()); }
	ruleProcedure{ after(grammarAccess.getModelAccess().getMainProcedureParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Procedure__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Procedure__CommandsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureAccess().getCommandsCommandParserRuleCall_3_0()); }
	ruleCommand{ after(grammarAccess.getProcedureAccess().getCommandsCommandParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PonerN__IntAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerNAccess().getIntINTTerminalRuleCall_3_0()); }
	RULE_INT{ after(grammarAccess.getPonerNAccess().getIntINTTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PonerN__ColorAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerNAccess().getColorColorEnumRuleCall_5_0()); }
	ruleColor{ after(grammarAccess.getPonerNAccess().getColorColorEnumRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MoverN__IntAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverNAccess().getIntINTTerminalRuleCall_3_0()); }
	RULE_INT{ after(grammarAccess.getMoverNAccess().getIntINTTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MoverN__DirAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverNAccess().getDirDireccionEnumRuleCall_5_0()); }
	ruleDireccion{ after(grammarAccess.getMoverNAccess().getDirDireccionEnumRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Poner__ColorAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPonerAccess().getColorColorEnumRuleCall_3_0()); }
	ruleColor{ after(grammarAccess.getPonerAccess().getColorColorEnumRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Mover__DirAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoverAccess().getDirDireccionEnumRuleCall_3_0()); }
	ruleDireccion{ after(grammarAccess.getMoverAccess().getDirDireccionEnumRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HayBolitas__ColorAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHayBolitasAccess().getColorColorEnumRuleCall_2_0()); }
	ruleColor{ after(grammarAccess.getHayBolitasAccess().getColorColorEnumRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PuedeMover__DirAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPuedeMoverAccess().getDirDireccionEnumRuleCall_2_0()); }
	ruleDireccion{ after(grammarAccess.getPuedeMoverAccess().getDirDireccionEnumRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__If__ExprAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getExprBooleansParserRuleCall_3_0()); }
	ruleBooleans{ after(grammarAccess.getIfAccess().getExprBooleansParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__If__CommandsThenAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getCommandsThenCommandParserRuleCall_6_0()); }
	ruleCommand{ after(grammarAccess.getIfAccess().getCommandsThenCommandParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__If__CommandsElseAssignment_8_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIfAccess().getCommandsElseCommandParserRuleCall_8_2_0()); }
	ruleCommand{ after(grammarAccess.getIfAccess().getCommandsElseCommandParserRuleCall_8_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_LPAR : '(';

RULE_RPAR : ')';

RULE_LBRACE : '{';

RULE_RBRACE : '}';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


