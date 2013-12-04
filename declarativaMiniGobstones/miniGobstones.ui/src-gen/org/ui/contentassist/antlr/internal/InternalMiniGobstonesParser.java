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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniGobstonesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LBRACE", "RULE_RBRACE", "RULE_LPAR", "RULE_RPAR", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Verde'", "'Rojo'", "'Azul'", "'Negro'", "'Norte'", "'Sur'", "'Este'", "'Oeste'", "'procedure'", "'PonerN'", "','", "'MoverN'", "'Poner'", "'Mover'", "'hayBolitas'", "'puedeMover'", "'if'", "'else'"
    };
    public static final int RULE_ID=8;
    public static final int T__29=29;
    public static final int RULE_RBRACE=5;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_LPAR=6;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=10;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_RPAR=7;
    public static final int RULE_INT=9;
    public static final int RULE_LBRACE=4;
    public static final int RULE_WS=13;

    // delegates
    // delegators


        public InternalMiniGobstonesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniGobstonesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniGobstonesParser.tokenNames; }
    public String getGrammarFileName() { return "../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:61:1: ( ruleModel EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:69:1: ruleModel : ( ( rule__Model__MainAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:73:2: ( ( ( rule__Model__MainAssignment ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:74:1: ( ( rule__Model__MainAssignment ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:74:1: ( ( rule__Model__MainAssignment ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:75:1: ( rule__Model__MainAssignment )
            {
             before(grammarAccess.getModelAccess().getMainAssignment()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:76:1: ( rule__Model__MainAssignment )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:76:2: rule__Model__MainAssignment
            {
            pushFollow(FOLLOW_rule__Model__MainAssignment_in_ruleModel94);
            rule__Model__MainAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMainAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProcedure"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:88:1: entryRuleProcedure : ruleProcedure EOF ;
    public final void entryRuleProcedure() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:89:1: ( ruleProcedure EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:90:1: ruleProcedure EOF
            {
             before(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure121);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getProcedureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:97:1: ruleProcedure : ( ( rule__Procedure__Group__0 ) ) ;
    public final void ruleProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:101:2: ( ( ( rule__Procedure__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:102:1: ( ( rule__Procedure__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:102:1: ( ( rule__Procedure__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:103:1: ( rule__Procedure__Group__0 )
            {
             before(grammarAccess.getProcedureAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:104:1: ( rule__Procedure__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:104:2: rule__Procedure__Group__0
            {
            pushFollow(FOLLOW_rule__Procedure__Group__0_in_ruleProcedure154);
            rule__Procedure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleCommand"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:116:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:117:1: ( ruleCommand EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:118:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand181);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:125:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:129:2: ( ( ( rule__Command__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:130:1: ( ( rule__Command__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:130:1: ( ( rule__Command__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:131:1: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:132:1: ( rule__Command__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:132:2: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_rule__Command__Alternatives_in_ruleCommand214);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRulePonerN"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:144:1: entryRulePonerN : rulePonerN EOF ;
    public final void entryRulePonerN() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:145:1: ( rulePonerN EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:146:1: rulePonerN EOF
            {
             before(grammarAccess.getPonerNRule()); 
            pushFollow(FOLLOW_rulePonerN_in_entryRulePonerN241);
            rulePonerN();

            state._fsp--;

             after(grammarAccess.getPonerNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePonerN248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePonerN"


    // $ANTLR start "rulePonerN"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:153:1: rulePonerN : ( ( rule__PonerN__Group__0 ) ) ;
    public final void rulePonerN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:157:2: ( ( ( rule__PonerN__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:158:1: ( ( rule__PonerN__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:158:1: ( ( rule__PonerN__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:159:1: ( rule__PonerN__Group__0 )
            {
             before(grammarAccess.getPonerNAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:160:1: ( rule__PonerN__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:160:2: rule__PonerN__Group__0
            {
            pushFollow(FOLLOW_rule__PonerN__Group__0_in_rulePonerN274);
            rule__PonerN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPonerNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePonerN"


    // $ANTLR start "entryRuleMoverN"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:172:1: entryRuleMoverN : ruleMoverN EOF ;
    public final void entryRuleMoverN() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:173:1: ( ruleMoverN EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:174:1: ruleMoverN EOF
            {
             before(grammarAccess.getMoverNRule()); 
            pushFollow(FOLLOW_ruleMoverN_in_entryRuleMoverN301);
            ruleMoverN();

            state._fsp--;

             after(grammarAccess.getMoverNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMoverN308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoverN"


    // $ANTLR start "ruleMoverN"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:181:1: ruleMoverN : ( ( rule__MoverN__Group__0 ) ) ;
    public final void ruleMoverN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:185:2: ( ( ( rule__MoverN__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:186:1: ( ( rule__MoverN__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:186:1: ( ( rule__MoverN__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:187:1: ( rule__MoverN__Group__0 )
            {
             before(grammarAccess.getMoverNAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:188:1: ( rule__MoverN__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:188:2: rule__MoverN__Group__0
            {
            pushFollow(FOLLOW_rule__MoverN__Group__0_in_ruleMoverN334);
            rule__MoverN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoverNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoverN"


    // $ANTLR start "entryRulePoner"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:200:1: entryRulePoner : rulePoner EOF ;
    public final void entryRulePoner() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:201:1: ( rulePoner EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:202:1: rulePoner EOF
            {
             before(grammarAccess.getPonerRule()); 
            pushFollow(FOLLOW_rulePoner_in_entryRulePoner361);
            rulePoner();

            state._fsp--;

             after(grammarAccess.getPonerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoner368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePoner"


    // $ANTLR start "rulePoner"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:209:1: rulePoner : ( ( rule__Poner__Group__0 ) ) ;
    public final void rulePoner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:213:2: ( ( ( rule__Poner__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:214:1: ( ( rule__Poner__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:214:1: ( ( rule__Poner__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:215:1: ( rule__Poner__Group__0 )
            {
             before(grammarAccess.getPonerAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:216:1: ( rule__Poner__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:216:2: rule__Poner__Group__0
            {
            pushFollow(FOLLOW_rule__Poner__Group__0_in_rulePoner394);
            rule__Poner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPonerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoner"


    // $ANTLR start "entryRuleMover"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:228:1: entryRuleMover : ruleMover EOF ;
    public final void entryRuleMover() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:229:1: ( ruleMover EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:230:1: ruleMover EOF
            {
             before(grammarAccess.getMoverRule()); 
            pushFollow(FOLLOW_ruleMover_in_entryRuleMover421);
            ruleMover();

            state._fsp--;

             after(grammarAccess.getMoverRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMover428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMover"


    // $ANTLR start "ruleMover"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:237:1: ruleMover : ( ( rule__Mover__Group__0 ) ) ;
    public final void ruleMover() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:241:2: ( ( ( rule__Mover__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:242:1: ( ( rule__Mover__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:242:1: ( ( rule__Mover__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:243:1: ( rule__Mover__Group__0 )
            {
             before(grammarAccess.getMoverAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:244:1: ( rule__Mover__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:244:2: rule__Mover__Group__0
            {
            pushFollow(FOLLOW_rule__Mover__Group__0_in_ruleMover454);
            rule__Mover__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMover"


    // $ANTLR start "entryRuleHayBolitas"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:256:1: entryRuleHayBolitas : ruleHayBolitas EOF ;
    public final void entryRuleHayBolitas() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:257:1: ( ruleHayBolitas EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:258:1: ruleHayBolitas EOF
            {
             before(grammarAccess.getHayBolitasRule()); 
            pushFollow(FOLLOW_ruleHayBolitas_in_entryRuleHayBolitas481);
            ruleHayBolitas();

            state._fsp--;

             after(grammarAccess.getHayBolitasRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHayBolitas488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHayBolitas"


    // $ANTLR start "ruleHayBolitas"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:265:1: ruleHayBolitas : ( ( rule__HayBolitas__Group__0 ) ) ;
    public final void ruleHayBolitas() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:269:2: ( ( ( rule__HayBolitas__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:270:1: ( ( rule__HayBolitas__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:270:1: ( ( rule__HayBolitas__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:271:1: ( rule__HayBolitas__Group__0 )
            {
             before(grammarAccess.getHayBolitasAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:272:1: ( rule__HayBolitas__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:272:2: rule__HayBolitas__Group__0
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__0_in_ruleHayBolitas514);
            rule__HayBolitas__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHayBolitasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHayBolitas"


    // $ANTLR start "entryRulePuedeMover"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:284:1: entryRulePuedeMover : rulePuedeMover EOF ;
    public final void entryRulePuedeMover() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:285:1: ( rulePuedeMover EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:286:1: rulePuedeMover EOF
            {
             before(grammarAccess.getPuedeMoverRule()); 
            pushFollow(FOLLOW_rulePuedeMover_in_entryRulePuedeMover541);
            rulePuedeMover();

            state._fsp--;

             after(grammarAccess.getPuedeMoverRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePuedeMover548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePuedeMover"


    // $ANTLR start "rulePuedeMover"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:293:1: rulePuedeMover : ( ( rule__PuedeMover__Group__0 ) ) ;
    public final void rulePuedeMover() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:297:2: ( ( ( rule__PuedeMover__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:298:1: ( ( rule__PuedeMover__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:298:1: ( ( rule__PuedeMover__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:299:1: ( rule__PuedeMover__Group__0 )
            {
             before(grammarAccess.getPuedeMoverAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:300:1: ( rule__PuedeMover__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:300:2: rule__PuedeMover__Group__0
            {
            pushFollow(FOLLOW_rule__PuedeMover__Group__0_in_rulePuedeMover574);
            rule__PuedeMover__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPuedeMoverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePuedeMover"


    // $ANTLR start "entryRuleIf"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:312:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:313:1: ( ruleIf EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:314:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf601);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:321:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:325:2: ( ( ( rule__If__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:326:1: ( ( rule__If__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:326:1: ( ( rule__If__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:327:1: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:328:1: ( rule__If__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:328:2: rule__If__Group__0
            {
            pushFollow(FOLLOW_rule__If__Group__0_in_ruleIf634);
            rule__If__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleBooleans"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:340:1: entryRuleBooleans : ruleBooleans EOF ;
    public final void entryRuleBooleans() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:341:1: ( ruleBooleans EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:342:1: ruleBooleans EOF
            {
             before(grammarAccess.getBooleansRule()); 
            pushFollow(FOLLOW_ruleBooleans_in_entryRuleBooleans661);
            ruleBooleans();

            state._fsp--;

             after(grammarAccess.getBooleansRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleans668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleans"


    // $ANTLR start "ruleBooleans"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:349:1: ruleBooleans : ( ( rule__Booleans__Alternatives ) ) ;
    public final void ruleBooleans() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:353:2: ( ( ( rule__Booleans__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:354:1: ( ( rule__Booleans__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:354:1: ( ( rule__Booleans__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:355:1: ( rule__Booleans__Alternatives )
            {
             before(grammarAccess.getBooleansAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:356:1: ( rule__Booleans__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:356:2: rule__Booleans__Alternatives
            {
            pushFollow(FOLLOW_rule__Booleans__Alternatives_in_ruleBooleans694);
            rule__Booleans__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleansAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleans"


    // $ANTLR start "ruleColor"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:369:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:373:1: ( ( ( rule__Color__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:374:1: ( ( rule__Color__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:374:1: ( ( rule__Color__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:375:1: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:376:1: ( rule__Color__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:376:2: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_rule__Color__Alternatives_in_ruleColor731);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleDireccion"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:388:1: ruleDireccion : ( ( rule__Direccion__Alternatives ) ) ;
    public final void ruleDireccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:392:1: ( ( ( rule__Direccion__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:393:1: ( ( rule__Direccion__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:393:1: ( ( rule__Direccion__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:394:1: ( rule__Direccion__Alternatives )
            {
             before(grammarAccess.getDireccionAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:395:1: ( rule__Direccion__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:395:2: rule__Direccion__Alternatives
            {
            pushFollow(FOLLOW_rule__Direccion__Alternatives_in_ruleDireccion767);
            rule__Direccion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDireccionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDireccion"


    // $ANTLR start "rule__Command__Alternatives"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:406:1: rule__Command__Alternatives : ( ( rulePoner ) | ( ruleMover ) | ( rulePonerN ) | ( ruleMoverN ) | ( ruleHayBolitas ) | ( rulePuedeMover ) | ( ruleIf ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:410:1: ( ( rulePoner ) | ( ruleMover ) | ( rulePonerN ) | ( ruleMoverN ) | ( ruleHayBolitas ) | ( rulePuedeMover ) | ( ruleIf ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            case 29:
                {
                alt1=5;
                }
                break;
            case 30:
                {
                alt1=6;
                }
                break;
            case 31:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:411:1: ( rulePoner )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:411:1: ( rulePoner )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:412:1: rulePoner
                    {
                     before(grammarAccess.getCommandAccess().getPonerParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePoner_in_rule__Command__Alternatives802);
                    rulePoner();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getPonerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:417:6: ( ruleMover )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:417:6: ( ruleMover )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:418:1: ruleMover
                    {
                     before(grammarAccess.getCommandAccess().getMoverParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMover_in_rule__Command__Alternatives819);
                    ruleMover();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getMoverParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:423:6: ( rulePonerN )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:423:6: ( rulePonerN )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:424:1: rulePonerN
                    {
                     before(grammarAccess.getCommandAccess().getPonerNParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePonerN_in_rule__Command__Alternatives836);
                    rulePonerN();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getPonerNParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:429:6: ( ruleMoverN )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:429:6: ( ruleMoverN )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:430:1: ruleMoverN
                    {
                     before(grammarAccess.getCommandAccess().getMoverNParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleMoverN_in_rule__Command__Alternatives853);
                    ruleMoverN();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getMoverNParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:435:6: ( ruleHayBolitas )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:435:6: ( ruleHayBolitas )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:436:1: ruleHayBolitas
                    {
                     before(grammarAccess.getCommandAccess().getHayBolitasParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleHayBolitas_in_rule__Command__Alternatives870);
                    ruleHayBolitas();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getHayBolitasParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:441:6: ( rulePuedeMover )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:441:6: ( rulePuedeMover )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:442:1: rulePuedeMover
                    {
                     before(grammarAccess.getCommandAccess().getPuedeMoverParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulePuedeMover_in_rule__Command__Alternatives887);
                    rulePuedeMover();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getPuedeMoverParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:447:6: ( ruleIf )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:447:6: ( ruleIf )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:448:1: ruleIf
                    {
                     before(grammarAccess.getCommandAccess().getIfParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleIf_in_rule__Command__Alternatives904);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getIfParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__Booleans__Alternatives"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:458:1: rule__Booleans__Alternatives : ( ( ruleHayBolitas ) | ( rulePuedeMover ) );
    public final void rule__Booleans__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:462:1: ( ( ruleHayBolitas ) | ( rulePuedeMover ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:463:1: ( ruleHayBolitas )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:463:1: ( ruleHayBolitas )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:464:1: ruleHayBolitas
                    {
                     before(grammarAccess.getBooleansAccess().getHayBolitasParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHayBolitas_in_rule__Booleans__Alternatives936);
                    ruleHayBolitas();

                    state._fsp--;

                     after(grammarAccess.getBooleansAccess().getHayBolitasParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:469:6: ( rulePuedeMover )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:469:6: ( rulePuedeMover )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:470:1: rulePuedeMover
                    {
                     before(grammarAccess.getBooleansAccess().getPuedeMoverParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePuedeMover_in_rule__Booleans__Alternatives953);
                    rulePuedeMover();

                    state._fsp--;

                     after(grammarAccess.getBooleansAccess().getPuedeMoverParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Booleans__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:480:1: rule__Color__Alternatives : ( ( ( 'Verde' ) ) | ( ( 'Rojo' ) ) | ( ( 'Azul' ) ) | ( ( 'Negro' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:484:1: ( ( ( 'Verde' ) ) | ( ( 'Rojo' ) ) | ( ( 'Azul' ) ) | ( ( 'Negro' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:485:1: ( ( 'Verde' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:485:1: ( ( 'Verde' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:486:1: ( 'Verde' )
                    {
                     before(grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:487:1: ( 'Verde' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:487:3: 'Verde'
                    {
                    match(input,15,FOLLOW_15_in_rule__Color__Alternatives986); 

                    }

                     after(grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:492:6: ( ( 'Rojo' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:492:6: ( ( 'Rojo' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:493:1: ( 'Rojo' )
                    {
                     before(grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:494:1: ( 'Rojo' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:494:3: 'Rojo'
                    {
                    match(input,16,FOLLOW_16_in_rule__Color__Alternatives1007); 

                    }

                     after(grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:499:6: ( ( 'Azul' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:499:6: ( ( 'Azul' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:500:1: ( 'Azul' )
                    {
                     before(grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:501:1: ( 'Azul' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:501:3: 'Azul'
                    {
                    match(input,17,FOLLOW_17_in_rule__Color__Alternatives1028); 

                    }

                     after(grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:506:6: ( ( 'Negro' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:506:6: ( ( 'Negro' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:507:1: ( 'Negro' )
                    {
                     before(grammarAccess.getColorAccess().getNegroEnumLiteralDeclaration_3()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:508:1: ( 'Negro' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:508:3: 'Negro'
                    {
                    match(input,18,FOLLOW_18_in_rule__Color__Alternatives1049); 

                    }

                     after(grammarAccess.getColorAccess().getNegroEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__Direccion__Alternatives"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:518:1: rule__Direccion__Alternatives : ( ( ( 'Norte' ) ) | ( ( 'Sur' ) ) | ( ( 'Este' ) ) | ( ( 'Oeste' ) ) );
    public final void rule__Direccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:522:1: ( ( ( 'Norte' ) ) | ( ( 'Sur' ) ) | ( ( 'Este' ) ) | ( ( 'Oeste' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:523:1: ( ( 'Norte' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:523:1: ( ( 'Norte' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:524:1: ( 'Norte' )
                    {
                     before(grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:525:1: ( 'Norte' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:525:3: 'Norte'
                    {
                    match(input,19,FOLLOW_19_in_rule__Direccion__Alternatives1085); 

                    }

                     after(grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:530:6: ( ( 'Sur' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:530:6: ( ( 'Sur' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:531:1: ( 'Sur' )
                    {
                     before(grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:532:1: ( 'Sur' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:532:3: 'Sur'
                    {
                    match(input,20,FOLLOW_20_in_rule__Direccion__Alternatives1106); 

                    }

                     after(grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:537:6: ( ( 'Este' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:537:6: ( ( 'Este' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:538:1: ( 'Este' )
                    {
                     before(grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:539:1: ( 'Este' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:539:3: 'Este'
                    {
                    match(input,21,FOLLOW_21_in_rule__Direccion__Alternatives1127); 

                    }

                     after(grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:544:6: ( ( 'Oeste' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:544:6: ( ( 'Oeste' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:545:1: ( 'Oeste' )
                    {
                     before(grammarAccess.getDireccionAccess().getOesteEnumLiteralDeclaration_3()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:546:1: ( 'Oeste' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:546:3: 'Oeste'
                    {
                    match(input,22,FOLLOW_22_in_rule__Direccion__Alternatives1148); 

                    }

                     after(grammarAccess.getDireccionAccess().getOesteEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direccion__Alternatives"


    // $ANTLR start "rule__Procedure__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:558:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:562:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:563:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__01181);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__01184);
            rule__Procedure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__0"


    // $ANTLR start "rule__Procedure__Group__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:570:1: rule__Procedure__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:574:1: ( ( 'procedure' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:575:1: ( 'procedure' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:575:1: ( 'procedure' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:576:1: 'procedure'
            {
             before(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Procedure__Group__0__Impl1212); 
             after(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__0__Impl"


    // $ANTLR start "rule__Procedure__Group__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:589:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:593:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:594:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__11243);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__11246);
            rule__Procedure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__1"


    // $ANTLR start "rule__Procedure__Group__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:601:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:605:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:606:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:606:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:607:1: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:608:1: ( rule__Procedure__NameAssignment_1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:608:2: rule__Procedure__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl1273);
            rule__Procedure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__1__Impl"


    // $ANTLR start "rule__Procedure__Group__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:618:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:622:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:623:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
            {
            pushFollow(FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__21303);
            rule__Procedure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__3_in_rule__Procedure__Group__21306);
            rule__Procedure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__2"


    // $ANTLR start "rule__Procedure__Group__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:630:1: rule__Procedure__Group__2__Impl : ( RULE_LBRACE ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:634:1: ( ( RULE_LBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:635:1: ( RULE_LBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:635:1: ( RULE_LBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:636:1: RULE_LBRACE
            {
             before(grammarAccess.getProcedureAccess().getLBRACETerminalRuleCall_2()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__Procedure__Group__2__Impl1333); 
             after(grammarAccess.getProcedureAccess().getLBRACETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__2__Impl"


    // $ANTLR start "rule__Procedure__Group__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:647:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl rule__Procedure__Group__4 ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:651:1: ( rule__Procedure__Group__3__Impl rule__Procedure__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:652:2: rule__Procedure__Group__3__Impl rule__Procedure__Group__4
            {
            pushFollow(FOLLOW_rule__Procedure__Group__3__Impl_in_rule__Procedure__Group__31362);
            rule__Procedure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__4_in_rule__Procedure__Group__31365);
            rule__Procedure__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__3"


    // $ANTLR start "rule__Procedure__Group__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:659:1: rule__Procedure__Group__3__Impl : ( ( rule__Procedure__CommandsAssignment_3 )* ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:663:1: ( ( ( rule__Procedure__CommandsAssignment_3 )* ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:664:1: ( ( rule__Procedure__CommandsAssignment_3 )* )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:664:1: ( ( rule__Procedure__CommandsAssignment_3 )* )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:665:1: ( rule__Procedure__CommandsAssignment_3 )*
            {
             before(grammarAccess.getProcedureAccess().getCommandsAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:666:1: ( rule__Procedure__CommandsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24||(LA5_0>=26 && LA5_0<=31)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:666:2: rule__Procedure__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Procedure__CommandsAssignment_3_in_rule__Procedure__Group__3__Impl1392);
            	    rule__Procedure__CommandsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProcedureAccess().getCommandsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__3__Impl"


    // $ANTLR start "rule__Procedure__Group__4"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:676:1: rule__Procedure__Group__4 : rule__Procedure__Group__4__Impl ;
    public final void rule__Procedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:680:1: ( rule__Procedure__Group__4__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:681:2: rule__Procedure__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group__4__Impl_in_rule__Procedure__Group__41423);
            rule__Procedure__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__4"


    // $ANTLR start "rule__Procedure__Group__4__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:687:1: rule__Procedure__Group__4__Impl : ( RULE_RBRACE ) ;
    public final void rule__Procedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:691:1: ( ( RULE_RBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:692:1: ( RULE_RBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:692:1: ( RULE_RBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:693:1: RULE_RBRACE
            {
             before(grammarAccess.getProcedureAccess().getRBRACETerminalRuleCall_4()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__Procedure__Group__4__Impl1450); 
             after(grammarAccess.getProcedureAccess().getRBRACETerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__4__Impl"


    // $ANTLR start "rule__PonerN__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:714:1: rule__PonerN__Group__0 : rule__PonerN__Group__0__Impl rule__PonerN__Group__1 ;
    public final void rule__PonerN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:718:1: ( rule__PonerN__Group__0__Impl rule__PonerN__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:719:2: rule__PonerN__Group__0__Impl rule__PonerN__Group__1
            {
            pushFollow(FOLLOW_rule__PonerN__Group__0__Impl_in_rule__PonerN__Group__01489);
            rule__PonerN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PonerN__Group__1_in_rule__PonerN__Group__01492);
            rule__PonerN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__0"


    // $ANTLR start "rule__PonerN__Group__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:726:1: rule__PonerN__Group__0__Impl : ( () ) ;
    public final void rule__PonerN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:730:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:731:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:731:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:732:1: ()
            {
             before(grammarAccess.getPonerNAccess().getPonerNAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:733:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:735:1: 
            {
            }

             after(grammarAccess.getPonerNAccess().getPonerNAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__0__Impl"


    // $ANTLR start "rule__PonerN__Group__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:745:1: rule__PonerN__Group__1 : rule__PonerN__Group__1__Impl rule__PonerN__Group__2 ;
    public final void rule__PonerN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:749:1: ( rule__PonerN__Group__1__Impl rule__PonerN__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:750:2: rule__PonerN__Group__1__Impl rule__PonerN__Group__2
            {
            pushFollow(FOLLOW_rule__PonerN__Group__1__Impl_in_rule__PonerN__Group__11550);
            rule__PonerN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PonerN__Group__2_in_rule__PonerN__Group__11553);
            rule__PonerN__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__1"


    // $ANTLR start "rule__PonerN__Group__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:757:1: rule__PonerN__Group__1__Impl : ( 'PonerN' ) ;
    public final void rule__PonerN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:761:1: ( ( 'PonerN' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:762:1: ( 'PonerN' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:762:1: ( 'PonerN' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:763:1: 'PonerN'
            {
             before(grammarAccess.getPonerNAccess().getPonerNKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__PonerN__Group__1__Impl1581); 
             after(grammarAccess.getPonerNAccess().getPonerNKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__1__Impl"


    // $ANTLR start "rule__PonerN__Group__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:776:1: rule__PonerN__Group__2 : rule__PonerN__Group__2__Impl rule__PonerN__Group__3 ;
    public final void rule__PonerN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:780:1: ( rule__PonerN__Group__2__Impl rule__PonerN__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:781:2: rule__PonerN__Group__2__Impl rule__PonerN__Group__3
            {
            pushFollow(FOLLOW_rule__PonerN__Group__2__Impl_in_rule__PonerN__Group__21612);
            rule__PonerN__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PonerN__Group__3_in_rule__PonerN__Group__21615);
            rule__PonerN__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__2"


    // $ANTLR start "rule__PonerN__Group__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:788:1: rule__PonerN__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__PonerN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:792:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:793:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:793:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:794:1: RULE_LPAR
            {
             before(grammarAccess.getPonerNAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__PonerN__Group__2__Impl1642); 
             after(grammarAccess.getPonerNAccess().getLPARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__2__Impl"


    // $ANTLR start "rule__PonerN__Group__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:805:1: rule__PonerN__Group__3 : rule__PonerN__Group__3__Impl rule__PonerN__Group__4 ;
    public final void rule__PonerN__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:809:1: ( rule__PonerN__Group__3__Impl rule__PonerN__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:810:2: rule__PonerN__Group__3__Impl rule__PonerN__Group__4
            {
            pushFollow(FOLLOW_rule__PonerN__Group__3__Impl_in_rule__PonerN__Group__31671);
            rule__PonerN__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PonerN__Group__4_in_rule__PonerN__Group__31674);
            rule__PonerN__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__3"


    // $ANTLR start "rule__PonerN__Group__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:817:1: rule__PonerN__Group__3__Impl : ( ( rule__PonerN__IntAssignment_3 ) ) ;
    public final void rule__PonerN__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:821:1: ( ( ( rule__PonerN__IntAssignment_3 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:822:1: ( ( rule__PonerN__IntAssignment_3 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:822:1: ( ( rule__PonerN__IntAssignment_3 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:823:1: ( rule__PonerN__IntAssignment_3 )
            {
             before(grammarAccess.getPonerNAccess().getIntAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:824:1: ( rule__PonerN__IntAssignment_3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:824:2: rule__PonerN__IntAssignment_3
            {
            pushFollow(FOLLOW_rule__PonerN__IntAssignment_3_in_rule__PonerN__Group__3__Impl1701);
            rule__PonerN__IntAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPonerNAccess().getIntAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__3__Impl"


    // $ANTLR start "rule__PonerN__Group__4"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:834:1: rule__PonerN__Group__4 : rule__PonerN__Group__4__Impl rule__PonerN__Group__5 ;
    public final void rule__PonerN__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:838:1: ( rule__PonerN__Group__4__Impl rule__PonerN__Group__5 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:839:2: rule__PonerN__Group__4__Impl rule__PonerN__Group__5
            {
            pushFollow(FOLLOW_rule__PonerN__Group__4__Impl_in_rule__PonerN__Group__41731);
            rule__PonerN__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PonerN__Group__5_in_rule__PonerN__Group__41734);
            rule__PonerN__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__4"


    // $ANTLR start "rule__PonerN__Group__4__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:846:1: rule__PonerN__Group__4__Impl : ( ',' ) ;
    public final void rule__PonerN__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:850:1: ( ( ',' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:851:1: ( ',' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:851:1: ( ',' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:852:1: ','
            {
             before(grammarAccess.getPonerNAccess().getCommaKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__PonerN__Group__4__Impl1762); 
             after(grammarAccess.getPonerNAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__4__Impl"


    // $ANTLR start "rule__PonerN__Group__5"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:865:1: rule__PonerN__Group__5 : rule__PonerN__Group__5__Impl rule__PonerN__Group__6 ;
    public final void rule__PonerN__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:869:1: ( rule__PonerN__Group__5__Impl rule__PonerN__Group__6 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:870:2: rule__PonerN__Group__5__Impl rule__PonerN__Group__6
            {
            pushFollow(FOLLOW_rule__PonerN__Group__5__Impl_in_rule__PonerN__Group__51793);
            rule__PonerN__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PonerN__Group__6_in_rule__PonerN__Group__51796);
            rule__PonerN__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__5"


    // $ANTLR start "rule__PonerN__Group__5__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:877:1: rule__PonerN__Group__5__Impl : ( ( rule__PonerN__ColorAssignment_5 ) ) ;
    public final void rule__PonerN__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:881:1: ( ( ( rule__PonerN__ColorAssignment_5 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:882:1: ( ( rule__PonerN__ColorAssignment_5 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:882:1: ( ( rule__PonerN__ColorAssignment_5 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:883:1: ( rule__PonerN__ColorAssignment_5 )
            {
             before(grammarAccess.getPonerNAccess().getColorAssignment_5()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:884:1: ( rule__PonerN__ColorAssignment_5 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:884:2: rule__PonerN__ColorAssignment_5
            {
            pushFollow(FOLLOW_rule__PonerN__ColorAssignment_5_in_rule__PonerN__Group__5__Impl1823);
            rule__PonerN__ColorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPonerNAccess().getColorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__5__Impl"


    // $ANTLR start "rule__PonerN__Group__6"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:894:1: rule__PonerN__Group__6 : rule__PonerN__Group__6__Impl ;
    public final void rule__PonerN__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:898:1: ( rule__PonerN__Group__6__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:899:2: rule__PonerN__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PonerN__Group__6__Impl_in_rule__PonerN__Group__61853);
            rule__PonerN__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__6"


    // $ANTLR start "rule__PonerN__Group__6__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:905:1: rule__PonerN__Group__6__Impl : ( RULE_RPAR ) ;
    public final void rule__PonerN__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:909:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:910:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:910:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:911:1: RULE_RPAR
            {
             before(grammarAccess.getPonerNAccess().getRPARTerminalRuleCall_6()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__PonerN__Group__6__Impl1880); 
             after(grammarAccess.getPonerNAccess().getRPARTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__Group__6__Impl"


    // $ANTLR start "rule__MoverN__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:936:1: rule__MoverN__Group__0 : rule__MoverN__Group__0__Impl rule__MoverN__Group__1 ;
    public final void rule__MoverN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:940:1: ( rule__MoverN__Group__0__Impl rule__MoverN__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:941:2: rule__MoverN__Group__0__Impl rule__MoverN__Group__1
            {
            pushFollow(FOLLOW_rule__MoverN__Group__0__Impl_in_rule__MoverN__Group__01923);
            rule__MoverN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoverN__Group__1_in_rule__MoverN__Group__01926);
            rule__MoverN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__0"


    // $ANTLR start "rule__MoverN__Group__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:948:1: rule__MoverN__Group__0__Impl : ( () ) ;
    public final void rule__MoverN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:952:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:953:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:953:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:954:1: ()
            {
             before(grammarAccess.getMoverNAccess().getMoverNAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:955:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:957:1: 
            {
            }

             after(grammarAccess.getMoverNAccess().getMoverNAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__0__Impl"


    // $ANTLR start "rule__MoverN__Group__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:967:1: rule__MoverN__Group__1 : rule__MoverN__Group__1__Impl rule__MoverN__Group__2 ;
    public final void rule__MoverN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:971:1: ( rule__MoverN__Group__1__Impl rule__MoverN__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:972:2: rule__MoverN__Group__1__Impl rule__MoverN__Group__2
            {
            pushFollow(FOLLOW_rule__MoverN__Group__1__Impl_in_rule__MoverN__Group__11984);
            rule__MoverN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoverN__Group__2_in_rule__MoverN__Group__11987);
            rule__MoverN__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__1"


    // $ANTLR start "rule__MoverN__Group__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:979:1: rule__MoverN__Group__1__Impl : ( 'MoverN' ) ;
    public final void rule__MoverN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:983:1: ( ( 'MoverN' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:984:1: ( 'MoverN' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:984:1: ( 'MoverN' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:985:1: 'MoverN'
            {
             before(grammarAccess.getMoverNAccess().getMoverNKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__MoverN__Group__1__Impl2015); 
             after(grammarAccess.getMoverNAccess().getMoverNKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__1__Impl"


    // $ANTLR start "rule__MoverN__Group__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:998:1: rule__MoverN__Group__2 : rule__MoverN__Group__2__Impl rule__MoverN__Group__3 ;
    public final void rule__MoverN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1002:1: ( rule__MoverN__Group__2__Impl rule__MoverN__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1003:2: rule__MoverN__Group__2__Impl rule__MoverN__Group__3
            {
            pushFollow(FOLLOW_rule__MoverN__Group__2__Impl_in_rule__MoverN__Group__22046);
            rule__MoverN__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoverN__Group__3_in_rule__MoverN__Group__22049);
            rule__MoverN__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__2"


    // $ANTLR start "rule__MoverN__Group__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1010:1: rule__MoverN__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__MoverN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1014:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1015:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1015:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1016:1: RULE_LPAR
            {
             before(grammarAccess.getMoverNAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__MoverN__Group__2__Impl2076); 
             after(grammarAccess.getMoverNAccess().getLPARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__2__Impl"


    // $ANTLR start "rule__MoverN__Group__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1027:1: rule__MoverN__Group__3 : rule__MoverN__Group__3__Impl rule__MoverN__Group__4 ;
    public final void rule__MoverN__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1031:1: ( rule__MoverN__Group__3__Impl rule__MoverN__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1032:2: rule__MoverN__Group__3__Impl rule__MoverN__Group__4
            {
            pushFollow(FOLLOW_rule__MoverN__Group__3__Impl_in_rule__MoverN__Group__32105);
            rule__MoverN__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoverN__Group__4_in_rule__MoverN__Group__32108);
            rule__MoverN__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__3"


    // $ANTLR start "rule__MoverN__Group__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1039:1: rule__MoverN__Group__3__Impl : ( ( rule__MoverN__IntAssignment_3 ) ) ;
    public final void rule__MoverN__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1043:1: ( ( ( rule__MoverN__IntAssignment_3 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1044:1: ( ( rule__MoverN__IntAssignment_3 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1044:1: ( ( rule__MoverN__IntAssignment_3 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1045:1: ( rule__MoverN__IntAssignment_3 )
            {
             before(grammarAccess.getMoverNAccess().getIntAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1046:1: ( rule__MoverN__IntAssignment_3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1046:2: rule__MoverN__IntAssignment_3
            {
            pushFollow(FOLLOW_rule__MoverN__IntAssignment_3_in_rule__MoverN__Group__3__Impl2135);
            rule__MoverN__IntAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMoverNAccess().getIntAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__3__Impl"


    // $ANTLR start "rule__MoverN__Group__4"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1056:1: rule__MoverN__Group__4 : rule__MoverN__Group__4__Impl rule__MoverN__Group__5 ;
    public final void rule__MoverN__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1060:1: ( rule__MoverN__Group__4__Impl rule__MoverN__Group__5 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1061:2: rule__MoverN__Group__4__Impl rule__MoverN__Group__5
            {
            pushFollow(FOLLOW_rule__MoverN__Group__4__Impl_in_rule__MoverN__Group__42165);
            rule__MoverN__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoverN__Group__5_in_rule__MoverN__Group__42168);
            rule__MoverN__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__4"


    // $ANTLR start "rule__MoverN__Group__4__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1068:1: rule__MoverN__Group__4__Impl : ( ',' ) ;
    public final void rule__MoverN__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1072:1: ( ( ',' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1073:1: ( ',' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1073:1: ( ',' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1074:1: ','
            {
             before(grammarAccess.getMoverNAccess().getCommaKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__MoverN__Group__4__Impl2196); 
             after(grammarAccess.getMoverNAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__4__Impl"


    // $ANTLR start "rule__MoverN__Group__5"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1087:1: rule__MoverN__Group__5 : rule__MoverN__Group__5__Impl rule__MoverN__Group__6 ;
    public final void rule__MoverN__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1091:1: ( rule__MoverN__Group__5__Impl rule__MoverN__Group__6 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1092:2: rule__MoverN__Group__5__Impl rule__MoverN__Group__6
            {
            pushFollow(FOLLOW_rule__MoverN__Group__5__Impl_in_rule__MoverN__Group__52227);
            rule__MoverN__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoverN__Group__6_in_rule__MoverN__Group__52230);
            rule__MoverN__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__5"


    // $ANTLR start "rule__MoverN__Group__5__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1099:1: rule__MoverN__Group__5__Impl : ( ( rule__MoverN__DirAssignment_5 ) ) ;
    public final void rule__MoverN__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1103:1: ( ( ( rule__MoverN__DirAssignment_5 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1104:1: ( ( rule__MoverN__DirAssignment_5 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1104:1: ( ( rule__MoverN__DirAssignment_5 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1105:1: ( rule__MoverN__DirAssignment_5 )
            {
             before(grammarAccess.getMoverNAccess().getDirAssignment_5()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1106:1: ( rule__MoverN__DirAssignment_5 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1106:2: rule__MoverN__DirAssignment_5
            {
            pushFollow(FOLLOW_rule__MoverN__DirAssignment_5_in_rule__MoverN__Group__5__Impl2257);
            rule__MoverN__DirAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMoverNAccess().getDirAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__5__Impl"


    // $ANTLR start "rule__MoverN__Group__6"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1116:1: rule__MoverN__Group__6 : rule__MoverN__Group__6__Impl ;
    public final void rule__MoverN__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1120:1: ( rule__MoverN__Group__6__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1121:2: rule__MoverN__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MoverN__Group__6__Impl_in_rule__MoverN__Group__62287);
            rule__MoverN__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__6"


    // $ANTLR start "rule__MoverN__Group__6__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1127:1: rule__MoverN__Group__6__Impl : ( RULE_RPAR ) ;
    public final void rule__MoverN__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1131:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1132:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1132:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1133:1: RULE_RPAR
            {
             before(grammarAccess.getMoverNAccess().getRPARTerminalRuleCall_6()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__MoverN__Group__6__Impl2314); 
             after(grammarAccess.getMoverNAccess().getRPARTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__Group__6__Impl"


    // $ANTLR start "rule__Poner__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1158:1: rule__Poner__Group__0 : rule__Poner__Group__0__Impl rule__Poner__Group__1 ;
    public final void rule__Poner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1162:1: ( rule__Poner__Group__0__Impl rule__Poner__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1163:2: rule__Poner__Group__0__Impl rule__Poner__Group__1
            {
            pushFollow(FOLLOW_rule__Poner__Group__0__Impl_in_rule__Poner__Group__02357);
            rule__Poner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__1_in_rule__Poner__Group__02360);
            rule__Poner__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__0"


    // $ANTLR start "rule__Poner__Group__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1170:1: rule__Poner__Group__0__Impl : ( () ) ;
    public final void rule__Poner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1174:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1175:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1175:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1176:1: ()
            {
             before(grammarAccess.getPonerAccess().getPonerAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1177:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1179:1: 
            {
            }

             after(grammarAccess.getPonerAccess().getPonerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__0__Impl"


    // $ANTLR start "rule__Poner__Group__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1189:1: rule__Poner__Group__1 : rule__Poner__Group__1__Impl rule__Poner__Group__2 ;
    public final void rule__Poner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1193:1: ( rule__Poner__Group__1__Impl rule__Poner__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1194:2: rule__Poner__Group__1__Impl rule__Poner__Group__2
            {
            pushFollow(FOLLOW_rule__Poner__Group__1__Impl_in_rule__Poner__Group__12418);
            rule__Poner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__2_in_rule__Poner__Group__12421);
            rule__Poner__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__1"


    // $ANTLR start "rule__Poner__Group__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1201:1: rule__Poner__Group__1__Impl : ( 'Poner' ) ;
    public final void rule__Poner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1205:1: ( ( 'Poner' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1206:1: ( 'Poner' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1206:1: ( 'Poner' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1207:1: 'Poner'
            {
             before(grammarAccess.getPonerAccess().getPonerKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Poner__Group__1__Impl2449); 
             after(grammarAccess.getPonerAccess().getPonerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__1__Impl"


    // $ANTLR start "rule__Poner__Group__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1220:1: rule__Poner__Group__2 : rule__Poner__Group__2__Impl rule__Poner__Group__3 ;
    public final void rule__Poner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1224:1: ( rule__Poner__Group__2__Impl rule__Poner__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1225:2: rule__Poner__Group__2__Impl rule__Poner__Group__3
            {
            pushFollow(FOLLOW_rule__Poner__Group__2__Impl_in_rule__Poner__Group__22480);
            rule__Poner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__3_in_rule__Poner__Group__22483);
            rule__Poner__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__2"


    // $ANTLR start "rule__Poner__Group__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1232:1: rule__Poner__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__Poner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1236:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1237:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1237:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1238:1: RULE_LPAR
            {
             before(grammarAccess.getPonerAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__Poner__Group__2__Impl2510); 
             after(grammarAccess.getPonerAccess().getLPARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__2__Impl"


    // $ANTLR start "rule__Poner__Group__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1249:1: rule__Poner__Group__3 : rule__Poner__Group__3__Impl rule__Poner__Group__4 ;
    public final void rule__Poner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1253:1: ( rule__Poner__Group__3__Impl rule__Poner__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1254:2: rule__Poner__Group__3__Impl rule__Poner__Group__4
            {
            pushFollow(FOLLOW_rule__Poner__Group__3__Impl_in_rule__Poner__Group__32539);
            rule__Poner__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__4_in_rule__Poner__Group__32542);
            rule__Poner__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__3"


    // $ANTLR start "rule__Poner__Group__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1261:1: rule__Poner__Group__3__Impl : ( ( rule__Poner__ColorAssignment_3 ) ) ;
    public final void rule__Poner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1265:1: ( ( ( rule__Poner__ColorAssignment_3 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1266:1: ( ( rule__Poner__ColorAssignment_3 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1266:1: ( ( rule__Poner__ColorAssignment_3 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1267:1: ( rule__Poner__ColorAssignment_3 )
            {
             before(grammarAccess.getPonerAccess().getColorAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1268:1: ( rule__Poner__ColorAssignment_3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1268:2: rule__Poner__ColorAssignment_3
            {
            pushFollow(FOLLOW_rule__Poner__ColorAssignment_3_in_rule__Poner__Group__3__Impl2569);
            rule__Poner__ColorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPonerAccess().getColorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__3__Impl"


    // $ANTLR start "rule__Poner__Group__4"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1278:1: rule__Poner__Group__4 : rule__Poner__Group__4__Impl ;
    public final void rule__Poner__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1282:1: ( rule__Poner__Group__4__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1283:2: rule__Poner__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Poner__Group__4__Impl_in_rule__Poner__Group__42599);
            rule__Poner__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__4"


    // $ANTLR start "rule__Poner__Group__4__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1289:1: rule__Poner__Group__4__Impl : ( RULE_RPAR ) ;
    public final void rule__Poner__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1293:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1294:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1294:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1295:1: RULE_RPAR
            {
             before(grammarAccess.getPonerAccess().getRPARTerminalRuleCall_4()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__Poner__Group__4__Impl2626); 
             after(grammarAccess.getPonerAccess().getRPARTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__Group__4__Impl"


    // $ANTLR start "rule__Mover__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1316:1: rule__Mover__Group__0 : rule__Mover__Group__0__Impl rule__Mover__Group__1 ;
    public final void rule__Mover__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1320:1: ( rule__Mover__Group__0__Impl rule__Mover__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1321:2: rule__Mover__Group__0__Impl rule__Mover__Group__1
            {
            pushFollow(FOLLOW_rule__Mover__Group__0__Impl_in_rule__Mover__Group__02665);
            rule__Mover__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__1_in_rule__Mover__Group__02668);
            rule__Mover__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__0"


    // $ANTLR start "rule__Mover__Group__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1328:1: rule__Mover__Group__0__Impl : ( () ) ;
    public final void rule__Mover__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1332:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1333:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1333:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1334:1: ()
            {
             before(grammarAccess.getMoverAccess().getMoverAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1335:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1337:1: 
            {
            }

             after(grammarAccess.getMoverAccess().getMoverAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__0__Impl"


    // $ANTLR start "rule__Mover__Group__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1347:1: rule__Mover__Group__1 : rule__Mover__Group__1__Impl rule__Mover__Group__2 ;
    public final void rule__Mover__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1351:1: ( rule__Mover__Group__1__Impl rule__Mover__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1352:2: rule__Mover__Group__1__Impl rule__Mover__Group__2
            {
            pushFollow(FOLLOW_rule__Mover__Group__1__Impl_in_rule__Mover__Group__12726);
            rule__Mover__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__2_in_rule__Mover__Group__12729);
            rule__Mover__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__1"


    // $ANTLR start "rule__Mover__Group__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1359:1: rule__Mover__Group__1__Impl : ( 'Mover' ) ;
    public final void rule__Mover__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1363:1: ( ( 'Mover' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1364:1: ( 'Mover' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1364:1: ( 'Mover' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1365:1: 'Mover'
            {
             before(grammarAccess.getMoverAccess().getMoverKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Mover__Group__1__Impl2757); 
             after(grammarAccess.getMoverAccess().getMoverKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__1__Impl"


    // $ANTLR start "rule__Mover__Group__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1378:1: rule__Mover__Group__2 : rule__Mover__Group__2__Impl rule__Mover__Group__3 ;
    public final void rule__Mover__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1382:1: ( rule__Mover__Group__2__Impl rule__Mover__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1383:2: rule__Mover__Group__2__Impl rule__Mover__Group__3
            {
            pushFollow(FOLLOW_rule__Mover__Group__2__Impl_in_rule__Mover__Group__22788);
            rule__Mover__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__3_in_rule__Mover__Group__22791);
            rule__Mover__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__2"


    // $ANTLR start "rule__Mover__Group__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1390:1: rule__Mover__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__Mover__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1394:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1395:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1395:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1396:1: RULE_LPAR
            {
             before(grammarAccess.getMoverAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__Mover__Group__2__Impl2818); 
             after(grammarAccess.getMoverAccess().getLPARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__2__Impl"


    // $ANTLR start "rule__Mover__Group__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1407:1: rule__Mover__Group__3 : rule__Mover__Group__3__Impl rule__Mover__Group__4 ;
    public final void rule__Mover__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1411:1: ( rule__Mover__Group__3__Impl rule__Mover__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1412:2: rule__Mover__Group__3__Impl rule__Mover__Group__4
            {
            pushFollow(FOLLOW_rule__Mover__Group__3__Impl_in_rule__Mover__Group__32847);
            rule__Mover__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__4_in_rule__Mover__Group__32850);
            rule__Mover__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__3"


    // $ANTLR start "rule__Mover__Group__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1419:1: rule__Mover__Group__3__Impl : ( ( rule__Mover__DirAssignment_3 ) ) ;
    public final void rule__Mover__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1423:1: ( ( ( rule__Mover__DirAssignment_3 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1424:1: ( ( rule__Mover__DirAssignment_3 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1424:1: ( ( rule__Mover__DirAssignment_3 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1425:1: ( rule__Mover__DirAssignment_3 )
            {
             before(grammarAccess.getMoverAccess().getDirAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1426:1: ( rule__Mover__DirAssignment_3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1426:2: rule__Mover__DirAssignment_3
            {
            pushFollow(FOLLOW_rule__Mover__DirAssignment_3_in_rule__Mover__Group__3__Impl2877);
            rule__Mover__DirAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMoverAccess().getDirAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__3__Impl"


    // $ANTLR start "rule__Mover__Group__4"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1436:1: rule__Mover__Group__4 : rule__Mover__Group__4__Impl ;
    public final void rule__Mover__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1440:1: ( rule__Mover__Group__4__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1441:2: rule__Mover__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Mover__Group__4__Impl_in_rule__Mover__Group__42907);
            rule__Mover__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__4"


    // $ANTLR start "rule__Mover__Group__4__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1447:1: rule__Mover__Group__4__Impl : ( RULE_RPAR ) ;
    public final void rule__Mover__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1451:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1452:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1452:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1453:1: RULE_RPAR
            {
             before(grammarAccess.getMoverAccess().getRPARTerminalRuleCall_4()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__Mover__Group__4__Impl2934); 
             after(grammarAccess.getMoverAccess().getRPARTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__Group__4__Impl"


    // $ANTLR start "rule__HayBolitas__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1474:1: rule__HayBolitas__Group__0 : rule__HayBolitas__Group__0__Impl rule__HayBolitas__Group__1 ;
    public final void rule__HayBolitas__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1478:1: ( rule__HayBolitas__Group__0__Impl rule__HayBolitas__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1479:2: rule__HayBolitas__Group__0__Impl rule__HayBolitas__Group__1
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__0__Impl_in_rule__HayBolitas__Group__02973);
            rule__HayBolitas__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HayBolitas__Group__1_in_rule__HayBolitas__Group__02976);
            rule__HayBolitas__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__0"


    // $ANTLR start "rule__HayBolitas__Group__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1486:1: rule__HayBolitas__Group__0__Impl : ( 'hayBolitas' ) ;
    public final void rule__HayBolitas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1490:1: ( ( 'hayBolitas' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1491:1: ( 'hayBolitas' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1491:1: ( 'hayBolitas' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1492:1: 'hayBolitas'
            {
             before(grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__HayBolitas__Group__0__Impl3004); 
             after(grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__0__Impl"


    // $ANTLR start "rule__HayBolitas__Group__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1505:1: rule__HayBolitas__Group__1 : rule__HayBolitas__Group__1__Impl rule__HayBolitas__Group__2 ;
    public final void rule__HayBolitas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1509:1: ( rule__HayBolitas__Group__1__Impl rule__HayBolitas__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1510:2: rule__HayBolitas__Group__1__Impl rule__HayBolitas__Group__2
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__1__Impl_in_rule__HayBolitas__Group__13035);
            rule__HayBolitas__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HayBolitas__Group__2_in_rule__HayBolitas__Group__13038);
            rule__HayBolitas__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__1"


    // $ANTLR start "rule__HayBolitas__Group__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1517:1: rule__HayBolitas__Group__1__Impl : ( RULE_LPAR ) ;
    public final void rule__HayBolitas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1521:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1522:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1522:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1523:1: RULE_LPAR
            {
             before(grammarAccess.getHayBolitasAccess().getLPARTerminalRuleCall_1()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__HayBolitas__Group__1__Impl3065); 
             after(grammarAccess.getHayBolitasAccess().getLPARTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__1__Impl"


    // $ANTLR start "rule__HayBolitas__Group__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1534:1: rule__HayBolitas__Group__2 : rule__HayBolitas__Group__2__Impl rule__HayBolitas__Group__3 ;
    public final void rule__HayBolitas__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1538:1: ( rule__HayBolitas__Group__2__Impl rule__HayBolitas__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1539:2: rule__HayBolitas__Group__2__Impl rule__HayBolitas__Group__3
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__2__Impl_in_rule__HayBolitas__Group__23094);
            rule__HayBolitas__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HayBolitas__Group__3_in_rule__HayBolitas__Group__23097);
            rule__HayBolitas__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__2"


    // $ANTLR start "rule__HayBolitas__Group__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1546:1: rule__HayBolitas__Group__2__Impl : ( ( rule__HayBolitas__ColorAssignment_2 ) ) ;
    public final void rule__HayBolitas__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1550:1: ( ( ( rule__HayBolitas__ColorAssignment_2 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1551:1: ( ( rule__HayBolitas__ColorAssignment_2 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1551:1: ( ( rule__HayBolitas__ColorAssignment_2 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1552:1: ( rule__HayBolitas__ColorAssignment_2 )
            {
             before(grammarAccess.getHayBolitasAccess().getColorAssignment_2()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1553:1: ( rule__HayBolitas__ColorAssignment_2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1553:2: rule__HayBolitas__ColorAssignment_2
            {
            pushFollow(FOLLOW_rule__HayBolitas__ColorAssignment_2_in_rule__HayBolitas__Group__2__Impl3124);
            rule__HayBolitas__ColorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHayBolitasAccess().getColorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__2__Impl"


    // $ANTLR start "rule__HayBolitas__Group__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1563:1: rule__HayBolitas__Group__3 : rule__HayBolitas__Group__3__Impl ;
    public final void rule__HayBolitas__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1567:1: ( rule__HayBolitas__Group__3__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1568:2: rule__HayBolitas__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__3__Impl_in_rule__HayBolitas__Group__33154);
            rule__HayBolitas__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__3"


    // $ANTLR start "rule__HayBolitas__Group__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1574:1: rule__HayBolitas__Group__3__Impl : ( RULE_RPAR ) ;
    public final void rule__HayBolitas__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1578:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1579:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1579:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1580:1: RULE_RPAR
            {
             before(grammarAccess.getHayBolitasAccess().getRPARTerminalRuleCall_3()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__HayBolitas__Group__3__Impl3181); 
             after(grammarAccess.getHayBolitasAccess().getRPARTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__Group__3__Impl"


    // $ANTLR start "rule__PuedeMover__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1599:1: rule__PuedeMover__Group__0 : rule__PuedeMover__Group__0__Impl rule__PuedeMover__Group__1 ;
    public final void rule__PuedeMover__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1603:1: ( rule__PuedeMover__Group__0__Impl rule__PuedeMover__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1604:2: rule__PuedeMover__Group__0__Impl rule__PuedeMover__Group__1
            {
            pushFollow(FOLLOW_rule__PuedeMover__Group__0__Impl_in_rule__PuedeMover__Group__03218);
            rule__PuedeMover__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PuedeMover__Group__1_in_rule__PuedeMover__Group__03221);
            rule__PuedeMover__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuedeMover__Group__0"


    // $ANTLR start "rule__PuedeMover__Group__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1611:1: rule__PuedeMover__Group__0__Impl : ( 'puedeMover' ) ;
    public final void rule__PuedeMover__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1615:1: ( ( 'puedeMover' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1616:1: ( 'puedeMover' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1616:1: ( 'puedeMover' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1617:1: 'puedeMover'
            {
             before(grammarAccess.getPuedeMoverAccess().getPuedeMoverKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__PuedeMover__Group__0__Impl3249); 
             after(grammarAccess.getPuedeMoverAccess().getPuedeMoverKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuedeMover__Group__0__Impl"


    // $ANTLR start "rule__PuedeMover__Group__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1630:1: rule__PuedeMover__Group__1 : rule__PuedeMover__Group__1__Impl rule__PuedeMover__Group__2 ;
    public final void rule__PuedeMover__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1634:1: ( rule__PuedeMover__Group__1__Impl rule__PuedeMover__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1635:2: rule__PuedeMover__Group__1__Impl rule__PuedeMover__Group__2
            {
            pushFollow(FOLLOW_rule__PuedeMover__Group__1__Impl_in_rule__PuedeMover__Group__13280);
            rule__PuedeMover__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PuedeMover__Group__2_in_rule__PuedeMover__Group__13283);
            rule__PuedeMover__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuedeMover__Group__1"


    // $ANTLR start "rule__PuedeMover__Group__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1642:1: rule__PuedeMover__Group__1__Impl : ( RULE_LPAR ) ;
    public final void rule__PuedeMover__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1646:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1647:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1647:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1648:1: RULE_LPAR
            {
             before(grammarAccess.getPuedeMoverAccess().getLPARTerminalRuleCall_1()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__PuedeMover__Group__1__Impl3310); 
             after(grammarAccess.getPuedeMoverAccess().getLPARTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuedeMover__Group__1__Impl"


    // $ANTLR start "rule__PuedeMover__Group__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1659:1: rule__PuedeMover__Group__2 : rule__PuedeMover__Group__2__Impl rule__PuedeMover__Group__3 ;
    public final void rule__PuedeMover__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1663:1: ( rule__PuedeMover__Group__2__Impl rule__PuedeMover__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1664:2: rule__PuedeMover__Group__2__Impl rule__PuedeMover__Group__3
            {
            pushFollow(FOLLOW_rule__PuedeMover__Group__2__Impl_in_rule__PuedeMover__Group__23339);
            rule__PuedeMover__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PuedeMover__Group__3_in_rule__PuedeMover__Group__23342);
            rule__PuedeMover__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuedeMover__Group__2"


    // $ANTLR start "rule__PuedeMover__Group__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1671:1: rule__PuedeMover__Group__2__Impl : ( ( rule__PuedeMover__DirAssignment_2 ) ) ;
    public final void rule__PuedeMover__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1675:1: ( ( ( rule__PuedeMover__DirAssignment_2 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1676:1: ( ( rule__PuedeMover__DirAssignment_2 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1676:1: ( ( rule__PuedeMover__DirAssignment_2 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1677:1: ( rule__PuedeMover__DirAssignment_2 )
            {
             before(grammarAccess.getPuedeMoverAccess().getDirAssignment_2()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1678:1: ( rule__PuedeMover__DirAssignment_2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1678:2: rule__PuedeMover__DirAssignment_2
            {
            pushFollow(FOLLOW_rule__PuedeMover__DirAssignment_2_in_rule__PuedeMover__Group__2__Impl3369);
            rule__PuedeMover__DirAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPuedeMoverAccess().getDirAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuedeMover__Group__2__Impl"


    // $ANTLR start "rule__PuedeMover__Group__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1688:1: rule__PuedeMover__Group__3 : rule__PuedeMover__Group__3__Impl ;
    public final void rule__PuedeMover__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1692:1: ( rule__PuedeMover__Group__3__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1693:2: rule__PuedeMover__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PuedeMover__Group__3__Impl_in_rule__PuedeMover__Group__33399);
            rule__PuedeMover__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuedeMover__Group__3"


    // $ANTLR start "rule__PuedeMover__Group__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1699:1: rule__PuedeMover__Group__3__Impl : ( RULE_RPAR ) ;
    public final void rule__PuedeMover__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1703:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1704:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1704:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1705:1: RULE_RPAR
            {
             before(grammarAccess.getPuedeMoverAccess().getRPARTerminalRuleCall_3()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__PuedeMover__Group__3__Impl3426); 
             after(grammarAccess.getPuedeMoverAccess().getRPARTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuedeMover__Group__3__Impl"


    // $ANTLR start "rule__If__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1724:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1728:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1729:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__03463);
            rule__If__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__03466);
            rule__If__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1736:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1740:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1741:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1741:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1742:1: ()
            {
             before(grammarAccess.getIfAccess().getIfAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1743:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1745:1: 
            {
            }

             after(grammarAccess.getIfAccess().getIfAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1755:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1759:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1760:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__13524);
            rule__If__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__13527);
            rule__If__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1767:1: rule__If__Group__1__Impl : ( 'if' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1771:1: ( ( 'if' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1772:1: ( 'if' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1772:1: ( 'if' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1773:1: 'if'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__If__Group__1__Impl3555); 
             after(grammarAccess.getIfAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1786:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1790:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1791:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__23586);
            rule__If__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__23589);
            rule__If__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1798:1: rule__If__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1802:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1803:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1803:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1804:1: RULE_LPAR
            {
             before(grammarAccess.getIfAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__If__Group__2__Impl3616); 
             after(grammarAccess.getIfAccess().getLPARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1815:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1819:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1820:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__33645);
            rule__If__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__33648);
            rule__If__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1827:1: rule__If__Group__3__Impl : ( ( rule__If__ExprAssignment_3 ) ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1831:1: ( ( ( rule__If__ExprAssignment_3 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1832:1: ( ( rule__If__ExprAssignment_3 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1832:1: ( ( rule__If__ExprAssignment_3 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1833:1: ( rule__If__ExprAssignment_3 )
            {
             before(grammarAccess.getIfAccess().getExprAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1834:1: ( rule__If__ExprAssignment_3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1834:2: rule__If__ExprAssignment_3
            {
            pushFollow(FOLLOW_rule__If__ExprAssignment_3_in_rule__If__Group__3__Impl3675);
            rule__If__ExprAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getExprAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1844:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1848:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1849:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__43705);
            rule__If__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__5_in_rule__If__Group__43708);
            rule__If__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1856:1: rule__If__Group__4__Impl : ( RULE_RPAR ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1860:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1861:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1861:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1862:1: RULE_RPAR
            {
             before(grammarAccess.getIfAccess().getRPARTerminalRuleCall_4()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__If__Group__4__Impl3735); 
             after(grammarAccess.getIfAccess().getRPARTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1873:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1877:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1878:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__53764);
            rule__If__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__6_in_rule__If__Group__53767);
            rule__If__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5"


    // $ANTLR start "rule__If__Group__5__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1885:1: rule__If__Group__5__Impl : ( RULE_LBRACE ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1889:1: ( ( RULE_LBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1890:1: ( RULE_LBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1890:1: ( RULE_LBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1891:1: RULE_LBRACE
            {
             before(grammarAccess.getIfAccess().getLBRACETerminalRuleCall_5()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__If__Group__5__Impl3794); 
             after(grammarAccess.getIfAccess().getLBRACETerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__If__Group__6"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1902:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1906:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1907:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__63823);
            rule__If__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__7_in_rule__If__Group__63826);
            rule__If__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6"


    // $ANTLR start "rule__If__Group__6__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1914:1: rule__If__Group__6__Impl : ( ( ( rule__If__CommandsThenAssignment_6 ) ) ( ( rule__If__CommandsThenAssignment_6 )* ) ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1918:1: ( ( ( ( rule__If__CommandsThenAssignment_6 ) ) ( ( rule__If__CommandsThenAssignment_6 )* ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1919:1: ( ( ( rule__If__CommandsThenAssignment_6 ) ) ( ( rule__If__CommandsThenAssignment_6 )* ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1919:1: ( ( ( rule__If__CommandsThenAssignment_6 ) ) ( ( rule__If__CommandsThenAssignment_6 )* ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1920:1: ( ( rule__If__CommandsThenAssignment_6 ) ) ( ( rule__If__CommandsThenAssignment_6 )* )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1920:1: ( ( rule__If__CommandsThenAssignment_6 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1921:1: ( rule__If__CommandsThenAssignment_6 )
            {
             before(grammarAccess.getIfAccess().getCommandsThenAssignment_6()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1922:1: ( rule__If__CommandsThenAssignment_6 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1922:2: rule__If__CommandsThenAssignment_6
            {
            pushFollow(FOLLOW_rule__If__CommandsThenAssignment_6_in_rule__If__Group__6__Impl3855);
            rule__If__CommandsThenAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getCommandsThenAssignment_6()); 

            }

            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1925:1: ( ( rule__If__CommandsThenAssignment_6 )* )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1926:1: ( rule__If__CommandsThenAssignment_6 )*
            {
             before(grammarAccess.getIfAccess().getCommandsThenAssignment_6()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1927:1: ( rule__If__CommandsThenAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24||(LA6_0>=26 && LA6_0<=31)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1927:2: rule__If__CommandsThenAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__If__CommandsThenAssignment_6_in_rule__If__Group__6__Impl3867);
            	    rule__If__CommandsThenAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getIfAccess().getCommandsThenAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6__Impl"


    // $ANTLR start "rule__If__Group__7"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1938:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1942:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1943:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__73900);
            rule__If__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__8_in_rule__If__Group__73903);
            rule__If__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7"


    // $ANTLR start "rule__If__Group__7__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1950:1: rule__If__Group__7__Impl : ( RULE_RBRACE ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1954:1: ( ( RULE_RBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1955:1: ( RULE_RBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1955:1: ( RULE_RBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1956:1: RULE_RBRACE
            {
             before(grammarAccess.getIfAccess().getRBRACETerminalRuleCall_7()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__If__Group__7__Impl3930); 
             after(grammarAccess.getIfAccess().getRBRACETerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7__Impl"


    // $ANTLR start "rule__If__Group__8"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1967:1: rule__If__Group__8 : rule__If__Group__8__Impl ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1971:1: ( rule__If__Group__8__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1972:2: rule__If__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__83959);
            rule__If__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__8"


    // $ANTLR start "rule__If__Group__8__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1978:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1982:1: ( ( ( rule__If__Group_8__0 )? ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1983:1: ( ( rule__If__Group_8__0 )? )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1983:1: ( ( rule__If__Group_8__0 )? )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1984:1: ( rule__If__Group_8__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_8()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1985:1: ( rule__If__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1985:2: rule__If__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl3986);
                    rule__If__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__8__Impl"


    // $ANTLR start "rule__If__Group_8__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2013:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2017:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2018:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
            {
            pushFollow(FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__04035);
            rule__If__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__04038);
            rule__If__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__0"


    // $ANTLR start "rule__If__Group_8__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2025:1: rule__If__Group_8__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2029:1: ( ( 'else' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2030:1: ( 'else' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2030:1: ( 'else' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2031:1: 'else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            match(input,32,FOLLOW_32_in_rule__If__Group_8__0__Impl4066); 
             after(grammarAccess.getIfAccess().getElseKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__0__Impl"


    // $ANTLR start "rule__If__Group_8__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2044:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl rule__If__Group_8__2 ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2048:1: ( rule__If__Group_8__1__Impl rule__If__Group_8__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2049:2: rule__If__Group_8__1__Impl rule__If__Group_8__2
            {
            pushFollow(FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__14097);
            rule__If__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__14100);
            rule__If__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__1"


    // $ANTLR start "rule__If__Group_8__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2056:1: rule__If__Group_8__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2060:1: ( ( RULE_LBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2061:1: ( RULE_LBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2061:1: ( RULE_LBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2062:1: RULE_LBRACE
            {
             before(grammarAccess.getIfAccess().getLBRACETerminalRuleCall_8_1()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__If__Group_8__1__Impl4127); 
             after(grammarAccess.getIfAccess().getLBRACETerminalRuleCall_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__1__Impl"


    // $ANTLR start "rule__If__Group_8__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2073:1: rule__If__Group_8__2 : rule__If__Group_8__2__Impl rule__If__Group_8__3 ;
    public final void rule__If__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2077:1: ( rule__If__Group_8__2__Impl rule__If__Group_8__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2078:2: rule__If__Group_8__2__Impl rule__If__Group_8__3
            {
            pushFollow(FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__24156);
            rule__If__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__24159);
            rule__If__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__2"


    // $ANTLR start "rule__If__Group_8__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2085:1: rule__If__Group_8__2__Impl : ( ( ( rule__If__CommandsElseAssignment_8_2 ) ) ( ( rule__If__CommandsElseAssignment_8_2 )* ) ) ;
    public final void rule__If__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2089:1: ( ( ( ( rule__If__CommandsElseAssignment_8_2 ) ) ( ( rule__If__CommandsElseAssignment_8_2 )* ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2090:1: ( ( ( rule__If__CommandsElseAssignment_8_2 ) ) ( ( rule__If__CommandsElseAssignment_8_2 )* ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2090:1: ( ( ( rule__If__CommandsElseAssignment_8_2 ) ) ( ( rule__If__CommandsElseAssignment_8_2 )* ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2091:1: ( ( rule__If__CommandsElseAssignment_8_2 ) ) ( ( rule__If__CommandsElseAssignment_8_2 )* )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2091:1: ( ( rule__If__CommandsElseAssignment_8_2 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2092:1: ( rule__If__CommandsElseAssignment_8_2 )
            {
             before(grammarAccess.getIfAccess().getCommandsElseAssignment_8_2()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2093:1: ( rule__If__CommandsElseAssignment_8_2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2093:2: rule__If__CommandsElseAssignment_8_2
            {
            pushFollow(FOLLOW_rule__If__CommandsElseAssignment_8_2_in_rule__If__Group_8__2__Impl4188);
            rule__If__CommandsElseAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getCommandsElseAssignment_8_2()); 

            }

            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2096:1: ( ( rule__If__CommandsElseAssignment_8_2 )* )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2097:1: ( rule__If__CommandsElseAssignment_8_2 )*
            {
             before(grammarAccess.getIfAccess().getCommandsElseAssignment_8_2()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2098:1: ( rule__If__CommandsElseAssignment_8_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24||(LA8_0>=26 && LA8_0<=31)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2098:2: rule__If__CommandsElseAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__If__CommandsElseAssignment_8_2_in_rule__If__Group_8__2__Impl4200);
            	    rule__If__CommandsElseAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getIfAccess().getCommandsElseAssignment_8_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__2__Impl"


    // $ANTLR start "rule__If__Group_8__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2109:1: rule__If__Group_8__3 : rule__If__Group_8__3__Impl ;
    public final void rule__If__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2113:1: ( rule__If__Group_8__3__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2114:2: rule__If__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__34233);
            rule__If__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__3"


    // $ANTLR start "rule__If__Group_8__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2120:1: rule__If__Group_8__3__Impl : ( RULE_RBRACE ) ;
    public final void rule__If__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2124:1: ( ( RULE_RBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2125:1: ( RULE_RBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2125:1: ( RULE_RBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2126:1: RULE_RBRACE
            {
             before(grammarAccess.getIfAccess().getRBRACETerminalRuleCall_8_3()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__If__Group_8__3__Impl4260); 
             after(grammarAccess.getIfAccess().getRBRACETerminalRuleCall_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__3__Impl"


    // $ANTLR start "rule__Model__MainAssignment"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2146:1: rule__Model__MainAssignment : ( ruleProcedure ) ;
    public final void rule__Model__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2150:1: ( ( ruleProcedure ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2151:1: ( ruleProcedure )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2151:1: ( ruleProcedure )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2152:1: ruleProcedure
            {
             before(grammarAccess.getModelAccess().getMainProcedureParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleProcedure_in_rule__Model__MainAssignment4302);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMainProcedureParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MainAssignment"


    // $ANTLR start "rule__Procedure__NameAssignment_1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2161:1: rule__Procedure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2165:1: ( ( RULE_ID ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2166:1: ( RULE_ID )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2166:1: ( RULE_ID )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2167:1: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_14333); 
             after(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__NameAssignment_1"


    // $ANTLR start "rule__Procedure__CommandsAssignment_3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2176:1: rule__Procedure__CommandsAssignment_3 : ( ruleCommand ) ;
    public final void rule__Procedure__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2180:1: ( ( ruleCommand ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2181:1: ( ruleCommand )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2181:1: ( ruleCommand )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2182:1: ruleCommand
            {
             before(grammarAccess.getProcedureAccess().getCommandsCommandParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__Procedure__CommandsAssignment_34364);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getCommandsCommandParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__CommandsAssignment_3"


    // $ANTLR start "rule__PonerN__IntAssignment_3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2191:1: rule__PonerN__IntAssignment_3 : ( RULE_INT ) ;
    public final void rule__PonerN__IntAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2195:1: ( ( RULE_INT ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2196:1: ( RULE_INT )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2196:1: ( RULE_INT )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2197:1: RULE_INT
            {
             before(grammarAccess.getPonerNAccess().getIntINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PonerN__IntAssignment_34395); 
             after(grammarAccess.getPonerNAccess().getIntINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__IntAssignment_3"


    // $ANTLR start "rule__PonerN__ColorAssignment_5"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2206:1: rule__PonerN__ColorAssignment_5 : ( ruleColor ) ;
    public final void rule__PonerN__ColorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2210:1: ( ( ruleColor ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2211:1: ( ruleColor )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2211:1: ( ruleColor )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2212:1: ruleColor
            {
             before(grammarAccess.getPonerNAccess().getColorColorEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__PonerN__ColorAssignment_54426);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getPonerNAccess().getColorColorEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PonerN__ColorAssignment_5"


    // $ANTLR start "rule__MoverN__IntAssignment_3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2221:1: rule__MoverN__IntAssignment_3 : ( RULE_INT ) ;
    public final void rule__MoverN__IntAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2225:1: ( ( RULE_INT ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2226:1: ( RULE_INT )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2226:1: ( RULE_INT )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2227:1: RULE_INT
            {
             before(grammarAccess.getMoverNAccess().getIntINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MoverN__IntAssignment_34457); 
             after(grammarAccess.getMoverNAccess().getIntINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__IntAssignment_3"


    // $ANTLR start "rule__MoverN__DirAssignment_5"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2236:1: rule__MoverN__DirAssignment_5 : ( ruleDireccion ) ;
    public final void rule__MoverN__DirAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2240:1: ( ( ruleDireccion ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2241:1: ( ruleDireccion )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2241:1: ( ruleDireccion )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2242:1: ruleDireccion
            {
             before(grammarAccess.getMoverNAccess().getDirDireccionEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDireccion_in_rule__MoverN__DirAssignment_54488);
            ruleDireccion();

            state._fsp--;

             after(grammarAccess.getMoverNAccess().getDirDireccionEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoverN__DirAssignment_5"


    // $ANTLR start "rule__Poner__ColorAssignment_3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2251:1: rule__Poner__ColorAssignment_3 : ( ruleColor ) ;
    public final void rule__Poner__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2255:1: ( ( ruleColor ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2256:1: ( ruleColor )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2256:1: ( ruleColor )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2257:1: ruleColor
            {
             before(grammarAccess.getPonerAccess().getColorColorEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__Poner__ColorAssignment_34519);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getPonerAccess().getColorColorEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poner__ColorAssignment_3"


    // $ANTLR start "rule__Mover__DirAssignment_3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2266:1: rule__Mover__DirAssignment_3 : ( ruleDireccion ) ;
    public final void rule__Mover__DirAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2270:1: ( ( ruleDireccion ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2271:1: ( ruleDireccion )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2271:1: ( ruleDireccion )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2272:1: ruleDireccion
            {
             before(grammarAccess.getMoverAccess().getDirDireccionEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDireccion_in_rule__Mover__DirAssignment_34550);
            ruleDireccion();

            state._fsp--;

             after(grammarAccess.getMoverAccess().getDirDireccionEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mover__DirAssignment_3"


    // $ANTLR start "rule__HayBolitas__ColorAssignment_2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2281:1: rule__HayBolitas__ColorAssignment_2 : ( ruleColor ) ;
    public final void rule__HayBolitas__ColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2285:1: ( ( ruleColor ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2286:1: ( ruleColor )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2286:1: ( ruleColor )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2287:1: ruleColor
            {
             before(grammarAccess.getHayBolitasAccess().getColorColorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__HayBolitas__ColorAssignment_24581);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getHayBolitasAccess().getColorColorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HayBolitas__ColorAssignment_2"


    // $ANTLR start "rule__PuedeMover__DirAssignment_2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2296:1: rule__PuedeMover__DirAssignment_2 : ( ruleDireccion ) ;
    public final void rule__PuedeMover__DirAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2300:1: ( ( ruleDireccion ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2301:1: ( ruleDireccion )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2301:1: ( ruleDireccion )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2302:1: ruleDireccion
            {
             before(grammarAccess.getPuedeMoverAccess().getDirDireccionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDireccion_in_rule__PuedeMover__DirAssignment_24612);
            ruleDireccion();

            state._fsp--;

             after(grammarAccess.getPuedeMoverAccess().getDirDireccionEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PuedeMover__DirAssignment_2"


    // $ANTLR start "rule__If__ExprAssignment_3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2311:1: rule__If__ExprAssignment_3 : ( ruleBooleans ) ;
    public final void rule__If__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2315:1: ( ( ruleBooleans ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2316:1: ( ruleBooleans )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2316:1: ( ruleBooleans )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2317:1: ruleBooleans
            {
             before(grammarAccess.getIfAccess().getExprBooleansParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBooleans_in_rule__If__ExprAssignment_34643);
            ruleBooleans();

            state._fsp--;

             after(grammarAccess.getIfAccess().getExprBooleansParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ExprAssignment_3"


    // $ANTLR start "rule__If__CommandsThenAssignment_6"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2326:1: rule__If__CommandsThenAssignment_6 : ( ruleCommand ) ;
    public final void rule__If__CommandsThenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2330:1: ( ( ruleCommand ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2331:1: ( ruleCommand )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2331:1: ( ruleCommand )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2332:1: ruleCommand
            {
             before(grammarAccess.getIfAccess().getCommandsThenCommandParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__If__CommandsThenAssignment_64674);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getIfAccess().getCommandsThenCommandParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__CommandsThenAssignment_6"


    // $ANTLR start "rule__If__CommandsElseAssignment_8_2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2341:1: rule__If__CommandsElseAssignment_8_2 : ( ruleCommand ) ;
    public final void rule__If__CommandsElseAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2345:1: ( ( ruleCommand ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2346:1: ( ruleCommand )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2346:1: ( ruleCommand )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2347:1: ruleCommand
            {
             before(grammarAccess.getIfAccess().getCommandsElseCommandParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__If__CommandsElseAssignment_8_24705);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getIfAccess().getCommandsElseCommandParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__CommandsElseAssignment_8_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MainAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__0_in_ruleProcedure154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePonerN_in_entryRulePonerN241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePonerN248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__0_in_rulePonerN274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoverN_in_entryRuleMoverN301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMoverN308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__0_in_ruleMoverN334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_entryRulePoner361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoner368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__0_in_rulePoner394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_entryRuleMover421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMover428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__0_in_ruleMover454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_entryRuleHayBolitas481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHayBolitas488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__0_in_ruleHayBolitas514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePuedeMover_in_entryRulePuedeMover541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePuedeMover548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__0_in_rulePuedeMover574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0_in_ruleIf634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleans_in_entryRuleBooleans661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleans668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Booleans__Alternatives_in_ruleBooleans694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Alternatives_in_ruleColor731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direccion__Alternatives_in_ruleDireccion767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_rule__Command__Alternatives802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_rule__Command__Alternatives819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePonerN_in_rule__Command__Alternatives836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoverN_in_rule__Command__Alternatives853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_rule__Command__Alternatives870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePuedeMover_in_rule__Command__Alternatives887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__Command__Alternatives904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_rule__Booleans__Alternatives936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePuedeMover_in_rule__Booleans__Alternatives953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Color__Alternatives986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Color__Alternatives1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Color__Alternatives1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Color__Alternatives1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Direccion__Alternatives1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Direccion__Alternatives1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Direccion__Alternatives1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Direccion__Alternatives1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__01181 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__01184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Procedure__Group__0__Impl1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__11243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__11246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__21303 = new BitSet(new long[]{0x00000000FD000020L});
    public static final BitSet FOLLOW_rule__Procedure__Group__3_in_rule__Procedure__Group__21306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__Procedure__Group__2__Impl1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__3__Impl_in_rule__Procedure__Group__31362 = new BitSet(new long[]{0x00000000FD000020L});
    public static final BitSet FOLLOW_rule__Procedure__Group__4_in_rule__Procedure__Group__31365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__CommandsAssignment_3_in_rule__Procedure__Group__3__Impl1392 = new BitSet(new long[]{0x00000000FD000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__4__Impl_in_rule__Procedure__Group__41423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__Procedure__Group__4__Impl1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__0__Impl_in_rule__PonerN__Group__01489 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PonerN__Group__1_in_rule__PonerN__Group__01492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__1__Impl_in_rule__PonerN__Group__11550 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PonerN__Group__2_in_rule__PonerN__Group__11553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PonerN__Group__1__Impl1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__2__Impl_in_rule__PonerN__Group__21612 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PonerN__Group__3_in_rule__PonerN__Group__21615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__PonerN__Group__2__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__3__Impl_in_rule__PonerN__Group__31671 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__PonerN__Group__4_in_rule__PonerN__Group__31674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__IntAssignment_3_in_rule__PonerN__Group__3__Impl1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__4__Impl_in_rule__PonerN__Group__41731 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__PonerN__Group__5_in_rule__PonerN__Group__41734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PonerN__Group__4__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__5__Impl_in_rule__PonerN__Group__51793 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PonerN__Group__6_in_rule__PonerN__Group__51796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__ColorAssignment_5_in_rule__PonerN__Group__5__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__6__Impl_in_rule__PonerN__Group__61853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__PonerN__Group__6__Impl1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__0__Impl_in_rule__MoverN__Group__01923 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MoverN__Group__1_in_rule__MoverN__Group__01926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__1__Impl_in_rule__MoverN__Group__11984 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MoverN__Group__2_in_rule__MoverN__Group__11987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MoverN__Group__1__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__2__Impl_in_rule__MoverN__Group__22046 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MoverN__Group__3_in_rule__MoverN__Group__22049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__MoverN__Group__2__Impl2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__3__Impl_in_rule__MoverN__Group__32105 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MoverN__Group__4_in_rule__MoverN__Group__32108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__IntAssignment_3_in_rule__MoverN__Group__3__Impl2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__4__Impl_in_rule__MoverN__Group__42165 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__MoverN__Group__5_in_rule__MoverN__Group__42168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MoverN__Group__4__Impl2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__5__Impl_in_rule__MoverN__Group__52227 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__MoverN__Group__6_in_rule__MoverN__Group__52230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__DirAssignment_5_in_rule__MoverN__Group__5__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__6__Impl_in_rule__MoverN__Group__62287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__MoverN__Group__6__Impl2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__0__Impl_in_rule__Poner__Group__02357 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Poner__Group__1_in_rule__Poner__Group__02360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__1__Impl_in_rule__Poner__Group__12418 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Poner__Group__2_in_rule__Poner__Group__12421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Poner__Group__1__Impl2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__2__Impl_in_rule__Poner__Group__22480 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__Poner__Group__3_in_rule__Poner__Group__22483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__Poner__Group__2__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__3__Impl_in_rule__Poner__Group__32539 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Poner__Group__4_in_rule__Poner__Group__32542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__ColorAssignment_3_in_rule__Poner__Group__3__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__4__Impl_in_rule__Poner__Group__42599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__Poner__Group__4__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__0__Impl_in_rule__Mover__Group__02665 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Mover__Group__1_in_rule__Mover__Group__02668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__1__Impl_in_rule__Mover__Group__12726 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Mover__Group__2_in_rule__Mover__Group__12729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Mover__Group__1__Impl2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__2__Impl_in_rule__Mover__Group__22788 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__Mover__Group__3_in_rule__Mover__Group__22791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__Mover__Group__2__Impl2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__3__Impl_in_rule__Mover__Group__32847 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Mover__Group__4_in_rule__Mover__Group__32850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__DirAssignment_3_in_rule__Mover__Group__3__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__4__Impl_in_rule__Mover__Group__42907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__Mover__Group__4__Impl2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__0__Impl_in_rule__HayBolitas__Group__02973 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__1_in_rule__HayBolitas__Group__02976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__HayBolitas__Group__0__Impl3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__1__Impl_in_rule__HayBolitas__Group__13035 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__2_in_rule__HayBolitas__Group__13038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__HayBolitas__Group__1__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__2__Impl_in_rule__HayBolitas__Group__23094 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__3_in_rule__HayBolitas__Group__23097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__ColorAssignment_2_in_rule__HayBolitas__Group__2__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__3__Impl_in_rule__HayBolitas__Group__33154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__HayBolitas__Group__3__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__0__Impl_in_rule__PuedeMover__Group__03218 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__1_in_rule__PuedeMover__Group__03221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PuedeMover__Group__0__Impl3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__1__Impl_in_rule__PuedeMover__Group__13280 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__2_in_rule__PuedeMover__Group__13283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__PuedeMover__Group__1__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__2__Impl_in_rule__PuedeMover__Group__23339 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__3_in_rule__PuedeMover__Group__23342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuedeMover__DirAssignment_2_in_rule__PuedeMover__Group__2__Impl3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__3__Impl_in_rule__PuedeMover__Group__33399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__PuedeMover__Group__3__Impl3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__03463 = new BitSet(new long[]{0x00000000FD000000L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__03466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__13524 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__13527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__If__Group__1__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__23586 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__23589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__If__Group__2__Impl3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__33645 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__33648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ExprAssignment_3_in_rule__If__Group__3__Impl3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__43705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__If__Group__5_in_rule__If__Group__43708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__If__Group__4__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__53764 = new BitSet(new long[]{0x00000000FD000000L});
    public static final BitSet FOLLOW_rule__If__Group__6_in_rule__If__Group__53767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__If__Group__5__Impl3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__63823 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__If__Group__7_in_rule__If__Group__63826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__CommandsThenAssignment_6_in_rule__If__Group__6__Impl3855 = new BitSet(new long[]{0x00000000FD000002L});
    public static final BitSet FOLLOW_rule__If__CommandsThenAssignment_6_in_rule__If__Group__6__Impl3867 = new BitSet(new long[]{0x00000000FD000002L});
    public static final BitSet FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__73900 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__If__Group__8_in_rule__If__Group__73903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__If__Group__7__Impl3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__83959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__04035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__04038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__If__Group_8__0__Impl4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__14097 = new BitSet(new long[]{0x00000000FD000000L});
    public static final BitSet FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__14100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__If__Group_8__1__Impl4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__24156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__24159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__CommandsElseAssignment_8_2_in_rule__If__Group_8__2__Impl4188 = new BitSet(new long[]{0x00000000FD000002L});
    public static final BitSet FOLLOW_rule__If__CommandsElseAssignment_8_2_in_rule__If__Group_8__2__Impl4200 = new BitSet(new long[]{0x00000000FD000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__34233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__If__Group_8__3__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_rule__Model__MainAssignment4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_14333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Procedure__CommandsAssignment_34364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PonerN__IntAssignment_34395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__PonerN__ColorAssignment_54426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MoverN__IntAssignment_34457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_rule__MoverN__DirAssignment_54488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Poner__ColorAssignment_34519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_rule__Mover__DirAssignment_34550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__HayBolitas__ColorAssignment_24581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_rule__PuedeMover__DirAssignment_24612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleans_in_rule__If__ExprAssignment_34643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__If__CommandsThenAssignment_64674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__If__CommandsElseAssignment_8_24705 = new BitSet(new long[]{0x0000000000000002L});

}