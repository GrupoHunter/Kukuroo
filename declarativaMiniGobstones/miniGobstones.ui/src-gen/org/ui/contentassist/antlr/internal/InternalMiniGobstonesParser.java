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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LBRACE", "RULE_RBRACE", "RULE_LPAR", "RULE_RPAR", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'and'", "'or'", "'=='", "'<'", "'>'", "'<='", "'>='", "'!='", "'+'", "'-'", "'Verde'", "'Rojo'", "'Azul'", "'Negro'", "'Norte'", "'Sur'", "'Este'", "'Oeste'", "'procedure'", "'PonerN'", "','", "'MoverN'", "'Poner'", "'Mover'", "'hayBolitas'", "'puedeMover'", "'var'", "'='", "'While'", "'repeat'", "'in'", "'to'", "'if'", "'else'", "'!'"
    };
    public static final int RULE_ID=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=8;
    public static final int RULE_LBRACE=4;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_RBRACE=5;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_LPAR=6;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=10;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_RPAR=7;
    public static final int T__38=38;
    public static final int T__39=39;
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


    // $ANTLR start "entryRuleVariable"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:312:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:313:1: ( ruleVariable EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:314:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable601);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable608); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:321:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:325:2: ( ( ( rule__Variable__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:326:1: ( ( rule__Variable__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:326:1: ( ( rule__Variable__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:327:1: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:328:1: ( rule__Variable__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:328:2: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_rule__Variable__Alternatives_in_ruleVariable634);
            rule__Variable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleWhile"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:340:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:341:1: ( ruleWhile EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:342:1: ruleWhile EOF
            {
             before(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile661);
            ruleWhile();

            state._fsp--;

             after(grammarAccess.getWhileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile668); 

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:349:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:353:2: ( ( ( rule__While__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:354:1: ( ( rule__While__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:354:1: ( ( rule__While__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:355:1: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:356:1: ( rule__While__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:356:2: rule__While__Group__0
            {
            pushFollow(FOLLOW_rule__While__Group__0_in_ruleWhile694);
            rule__While__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getGroup()); 

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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleFor"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:368:1: entryRuleFor : ruleFor EOF ;
    public final void entryRuleFor() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:369:1: ( ruleFor EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:370:1: ruleFor EOF
            {
             before(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor721);
            ruleFor();

            state._fsp--;

             after(grammarAccess.getForRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor728); 

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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:377:1: ruleFor : ( ( rule__For__Alternatives ) ) ;
    public final void ruleFor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:381:2: ( ( ( rule__For__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:382:1: ( ( rule__For__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:382:1: ( ( rule__For__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:383:1: ( rule__For__Alternatives )
            {
             before(grammarAccess.getForAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:384:1: ( rule__For__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:384:2: rule__For__Alternatives
            {
            pushFollow(FOLLOW_rule__For__Alternatives_in_ruleFor754);
            rule__For__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleIf"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:396:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:397:1: ( ruleIf EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:398:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf781);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf788); 

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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:405:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:409:2: ( ( ( rule__If__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:410:1: ( ( rule__If__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:410:1: ( ( rule__If__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:411:1: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:412:1: ( rule__If__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:412:2: rule__If__Group__0
            {
            pushFollow(FOLLOW_rule__If__Group__0_in_ruleIf814);
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


    // $ANTLR start "entryRuleExpression"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:424:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:425:1: ( ruleExpression EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:426:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression841);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression848); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:433:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:437:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:438:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:438:1: ( ( rule__Expression__Group__0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:439:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:440:1: ( rule__Expression__Group__0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:440:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression874);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:452:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:453:1: ( ruleTerminalExpression EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:454:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression901);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression908); 

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:461:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:465:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:466:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:466:1: ( ( rule__TerminalExpression__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:467:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:468:1: ( rule__TerminalExpression__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:468:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression934);
            rule__TerminalExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleBooleans"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:480:1: entryRuleBooleans : ruleBooleans EOF ;
    public final void entryRuleBooleans() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:481:1: ( ruleBooleans EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:482:1: ruleBooleans EOF
            {
             before(grammarAccess.getBooleansRule()); 
            pushFollow(FOLLOW_ruleBooleans_in_entryRuleBooleans961);
            ruleBooleans();

            state._fsp--;

             after(grammarAccess.getBooleansRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleans968); 

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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:489:1: ruleBooleans : ( ( rule__Booleans__Alternatives ) ) ;
    public final void ruleBooleans() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:493:2: ( ( ( rule__Booleans__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:494:1: ( ( rule__Booleans__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:494:1: ( ( rule__Booleans__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:495:1: ( rule__Booleans__Alternatives )
            {
             before(grammarAccess.getBooleansAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:496:1: ( rule__Booleans__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:496:2: rule__Booleans__Alternatives
            {
            pushFollow(FOLLOW_rule__Booleans__Alternatives_in_ruleBooleans994);
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


    // $ANTLR start "entryRuleOperator"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:508:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:509:1: ( ruleOperator EOF )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:510:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator1021);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator1028); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:517:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:521:2: ( ( ( rule__Operator__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:522:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:522:1: ( ( rule__Operator__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:523:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:524:1: ( rule__Operator__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:524:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator1054);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleColor"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:537:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:541:1: ( ( ( rule__Color__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:542:1: ( ( rule__Color__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:542:1: ( ( rule__Color__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:543:1: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:544:1: ( rule__Color__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:544:2: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_rule__Color__Alternatives_in_ruleColor1091);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:556:1: ruleDireccion : ( ( rule__Direccion__Alternatives ) ) ;
    public final void ruleDireccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:560:1: ( ( ( rule__Direccion__Alternatives ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:561:1: ( ( rule__Direccion__Alternatives ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:561:1: ( ( rule__Direccion__Alternatives ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:562:1: ( rule__Direccion__Alternatives )
            {
             before(grammarAccess.getDireccionAccess().getAlternatives()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:563:1: ( rule__Direccion__Alternatives )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:563:2: rule__Direccion__Alternatives
            {
            pushFollow(FOLLOW_rule__Direccion__Alternatives_in_ruleDireccion1127);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:574:1: rule__Command__Alternatives : ( ( rulePoner ) | ( ruleMover ) | ( rulePonerN ) | ( ruleMoverN ) | ( ruleHayBolitas ) | ( rulePuedeMover ) | ( ruleIf ) | ( ruleWhile ) | ( ruleFor ) | ( ruleVariable ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:578:1: ( ( rulePoner ) | ( ruleMover ) | ( rulePonerN ) | ( ruleMoverN ) | ( ruleHayBolitas ) | ( rulePuedeMover ) | ( ruleIf ) | ( ruleWhile ) | ( ruleFor ) | ( ruleVariable ) )
            int alt1=10;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:579:1: ( rulePoner )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:579:1: ( rulePoner )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:580:1: rulePoner
                    {
                     before(grammarAccess.getCommandAccess().getPonerParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePoner_in_rule__Command__Alternatives1162);
                    rulePoner();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getPonerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:585:6: ( ruleMover )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:585:6: ( ruleMover )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:586:1: ruleMover
                    {
                     before(grammarAccess.getCommandAccess().getMoverParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMover_in_rule__Command__Alternatives1179);
                    ruleMover();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getMoverParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:591:6: ( rulePonerN )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:591:6: ( rulePonerN )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:592:1: rulePonerN
                    {
                     before(grammarAccess.getCommandAccess().getPonerNParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePonerN_in_rule__Command__Alternatives1196);
                    rulePonerN();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getPonerNParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:597:6: ( ruleMoverN )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:597:6: ( ruleMoverN )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:598:1: ruleMoverN
                    {
                     before(grammarAccess.getCommandAccess().getMoverNParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleMoverN_in_rule__Command__Alternatives1213);
                    ruleMoverN();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getMoverNParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:603:6: ( ruleHayBolitas )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:603:6: ( ruleHayBolitas )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:604:1: ruleHayBolitas
                    {
                     before(grammarAccess.getCommandAccess().getHayBolitasParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleHayBolitas_in_rule__Command__Alternatives1230);
                    ruleHayBolitas();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getHayBolitasParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:609:6: ( rulePuedeMover )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:609:6: ( rulePuedeMover )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:610:1: rulePuedeMover
                    {
                     before(grammarAccess.getCommandAccess().getPuedeMoverParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulePuedeMover_in_rule__Command__Alternatives1247);
                    rulePuedeMover();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getPuedeMoverParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:615:6: ( ruleIf )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:615:6: ( ruleIf )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:616:1: ruleIf
                    {
                     before(grammarAccess.getCommandAccess().getIfParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleIf_in_rule__Command__Alternatives1264);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getIfParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:621:6: ( ruleWhile )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:621:6: ( ruleWhile )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:622:1: ruleWhile
                    {
                     before(grammarAccess.getCommandAccess().getWhileParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleWhile_in_rule__Command__Alternatives1281);
                    ruleWhile();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getWhileParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:627:6: ( ruleFor )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:627:6: ( ruleFor )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:628:1: ruleFor
                    {
                     before(grammarAccess.getCommandAccess().getForParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleFor_in_rule__Command__Alternatives1298);
                    ruleFor();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getForParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:633:6: ( ruleVariable )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:633:6: ( ruleVariable )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:634:1: ruleVariable
                    {
                     before(grammarAccess.getCommandAccess().getVariableParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__Command__Alternatives1315);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getVariableParserRuleCall_9()); 

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


    // $ANTLR start "rule__Variable__Alternatives"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:644:1: rule__Variable__Alternatives : ( ( ( rule__Variable__Group_0__0 ) ) | ( ruleBooleans ) | ( ruleExpression ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:648:1: ( ( ( rule__Variable__Group_0__0 ) ) | ( ruleBooleans ) | ( ruleExpression ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:649:1: ( ( rule__Variable__Group_0__0 ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:649:1: ( ( rule__Variable__Group_0__0 ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:650:1: ( rule__Variable__Group_0__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_0()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:651:1: ( rule__Variable__Group_0__0 )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:651:2: rule__Variable__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_0__0_in_rule__Variable__Alternatives1347);
                    rule__Variable__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:655:6: ( ruleBooleans )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:655:6: ( ruleBooleans )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:656:1: ruleBooleans
                    {
                     before(grammarAccess.getVariableAccess().getBooleansParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleans_in_rule__Variable__Alternatives1365);
                    ruleBooleans();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getBooleansParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:661:6: ( ruleExpression )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:661:6: ( ruleExpression )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:662:1: ruleExpression
                    {
                     before(grammarAccess.getVariableAccess().getExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleExpression_in_rule__Variable__Alternatives1382);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getExpressionParserRuleCall_2()); 

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
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__For__Alternatives"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:672:1: rule__For__Alternatives : ( ( ( rule__For__Group_0__0 ) ) | ( ( rule__For__Group_1__0 ) ) | ( ( rule__For__Group_2__0 ) ) );
    public final void rule__For__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:676:1: ( ( ( rule__For__Group_0__0 ) ) | ( ( rule__For__Group_1__0 ) ) | ( ( rule__For__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_LBRACE) ) {
                    alt3=3;
                }
                else if ( (LA3_2==46) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==46) ) {
                    alt3=2;
                }
                else if ( (LA3_3==RULE_LBRACE) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==RULE_LBRACE) ) {
                    alt3=3;
                }
                else if ( (LA3_4==46) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5==46) ) {
                    alt3=2;
                }
                else if ( (LA3_5==RULE_LBRACE) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:677:1: ( ( rule__For__Group_0__0 ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:677:1: ( ( rule__For__Group_0__0 ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:678:1: ( rule__For__Group_0__0 )
                    {
                     before(grammarAccess.getForAccess().getGroup_0()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:679:1: ( rule__For__Group_0__0 )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:679:2: rule__For__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__For__Group_0__0_in_rule__For__Alternatives1414);
                    rule__For__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getForAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:683:6: ( ( rule__For__Group_1__0 ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:683:6: ( ( rule__For__Group_1__0 ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:684:1: ( rule__For__Group_1__0 )
                    {
                     before(grammarAccess.getForAccess().getGroup_1()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:685:1: ( rule__For__Group_1__0 )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:685:2: rule__For__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__For__Group_1__0_in_rule__For__Alternatives1432);
                    rule__For__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getForAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:689:6: ( ( rule__For__Group_2__0 ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:689:6: ( ( rule__For__Group_2__0 ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:690:1: ( rule__For__Group_2__0 )
                    {
                     before(grammarAccess.getForAccess().getGroup_2()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:691:1: ( rule__For__Group_2__0 )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:691:2: rule__For__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__For__Group_2__0_in_rule__For__Alternatives1450);
                    rule__For__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getForAccess().getGroup_2()); 

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
    // $ANTLR end "rule__For__Alternatives"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:700:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__ExprAssignment_1 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:704:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__ExprAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_LPAR) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=39 && LA4_0<=40)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:705:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:705:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:706:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:707:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:707:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1483);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:711:6: ( ( rule__TerminalExpression__ExprAssignment_1 ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:711:6: ( ( rule__TerminalExpression__ExprAssignment_1 ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:712:1: ( rule__TerminalExpression__ExprAssignment_1 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getExprAssignment_1()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:713:1: ( rule__TerminalExpression__ExprAssignment_1 )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:713:2: rule__TerminalExpression__ExprAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__ExprAssignment_1_in_rule__TerminalExpression__Alternatives1501);
                    rule__TerminalExpression__ExprAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getExprAssignment_1()); 

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
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__Booleans__Alternatives"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:722:1: rule__Booleans__Alternatives : ( ( ruleHayBolitas ) | ( rulePuedeMover ) );
    public final void rule__Booleans__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:726:1: ( ( ruleHayBolitas ) | ( rulePuedeMover ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==39) ) {
                alt5=1;
            }
            else if ( (LA5_0==40) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:727:1: ( ruleHayBolitas )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:727:1: ( ruleHayBolitas )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:728:1: ruleHayBolitas
                    {
                     before(grammarAccess.getBooleansAccess().getHayBolitasParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHayBolitas_in_rule__Booleans__Alternatives1534);
                    ruleHayBolitas();

                    state._fsp--;

                     after(grammarAccess.getBooleansAccess().getHayBolitasParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:733:6: ( rulePuedeMover )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:733:6: ( rulePuedeMover )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:734:1: rulePuedeMover
                    {
                     before(grammarAccess.getBooleansAccess().getPuedeMoverParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePuedeMover_in_rule__Booleans__Alternatives1551);
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


    // $ANTLR start "rule__Operator__Alternatives"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:744:1: rule__Operator__Alternatives : ( ( 'and' ) | ( 'or' ) | ( '==' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) | ( '!=' ) | ( '+' ) | ( '-' ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:748:1: ( ( 'and' ) | ( 'or' ) | ( '==' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) | ( '!=' ) | ( '+' ) | ( '-' ) )
            int alt6=10;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            case 20:
                {
                alt6=6;
                }
                break;
            case 21:
                {
                alt6=7;
                }
                break;
            case 22:
                {
                alt6=8;
                }
                break;
            case 23:
                {
                alt6=9;
                }
                break;
            case 24:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:749:1: ( 'and' )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:749:1: ( 'and' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:750:1: 'and'
                    {
                     before(grammarAccess.getOperatorAccess().getAndKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__Operator__Alternatives1584); 
                     after(grammarAccess.getOperatorAccess().getAndKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:757:6: ( 'or' )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:757:6: ( 'or' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:758:1: 'or'
                    {
                     before(grammarAccess.getOperatorAccess().getOrKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__Operator__Alternatives1604); 
                     after(grammarAccess.getOperatorAccess().getOrKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:765:6: ( '==' )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:765:6: ( '==' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:766:1: '=='
                    {
                     before(grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_2()); 
                    match(input,17,FOLLOW_17_in_rule__Operator__Alternatives1624); 
                     after(grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:773:6: ( '<' )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:773:6: ( '<' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:774:1: '<'
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignKeyword_3()); 
                    match(input,18,FOLLOW_18_in_rule__Operator__Alternatives1644); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:781:6: ( '>' )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:781:6: ( '>' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:782:1: '>'
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_4()); 
                    match(input,19,FOLLOW_19_in_rule__Operator__Alternatives1664); 
                     after(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:789:6: ( '<=' )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:789:6: ( '<=' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:790:1: '<='
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_5()); 
                    match(input,20,FOLLOW_20_in_rule__Operator__Alternatives1684); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:797:6: ( '>=' )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:797:6: ( '>=' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:798:1: '>='
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                    match(input,21,FOLLOW_21_in_rule__Operator__Alternatives1704); 
                     after(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:805:6: ( '!=' )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:805:6: ( '!=' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:806:1: '!='
                    {
                     before(grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_7()); 
                    match(input,22,FOLLOW_22_in_rule__Operator__Alternatives1724); 
                     after(grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:813:6: ( '+' )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:813:6: ( '+' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:814:1: '+'
                    {
                     before(grammarAccess.getOperatorAccess().getPlusSignKeyword_8()); 
                    match(input,23,FOLLOW_23_in_rule__Operator__Alternatives1744); 
                     after(grammarAccess.getOperatorAccess().getPlusSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:821:6: ( '-' )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:821:6: ( '-' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:822:1: '-'
                    {
                     before(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_9()); 
                    match(input,24,FOLLOW_24_in_rule__Operator__Alternatives1764); 
                     after(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_9()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:834:1: rule__Color__Alternatives : ( ( ( 'Verde' ) ) | ( ( 'Rojo' ) ) | ( ( 'Azul' ) ) | ( ( 'Negro' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:838:1: ( ( ( 'Verde' ) ) | ( ( 'Rojo' ) ) | ( ( 'Azul' ) ) | ( ( 'Negro' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 28:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:839:1: ( ( 'Verde' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:839:1: ( ( 'Verde' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:840:1: ( 'Verde' )
                    {
                     before(grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:841:1: ( 'Verde' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:841:3: 'Verde'
                    {
                    match(input,25,FOLLOW_25_in_rule__Color__Alternatives1799); 

                    }

                     after(grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:846:6: ( ( 'Rojo' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:846:6: ( ( 'Rojo' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:847:1: ( 'Rojo' )
                    {
                     before(grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:848:1: ( 'Rojo' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:848:3: 'Rojo'
                    {
                    match(input,26,FOLLOW_26_in_rule__Color__Alternatives1820); 

                    }

                     after(grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:853:6: ( ( 'Azul' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:853:6: ( ( 'Azul' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:854:1: ( 'Azul' )
                    {
                     before(grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:855:1: ( 'Azul' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:855:3: 'Azul'
                    {
                    match(input,27,FOLLOW_27_in_rule__Color__Alternatives1841); 

                    }

                     after(grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:860:6: ( ( 'Negro' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:860:6: ( ( 'Negro' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:861:1: ( 'Negro' )
                    {
                     before(grammarAccess.getColorAccess().getNegroEnumLiteralDeclaration_3()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:862:1: ( 'Negro' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:862:3: 'Negro'
                    {
                    match(input,28,FOLLOW_28_in_rule__Color__Alternatives1862); 

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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:872:1: rule__Direccion__Alternatives : ( ( ( 'Norte' ) ) | ( ( 'Sur' ) ) | ( ( 'Este' ) ) | ( ( 'Oeste' ) ) );
    public final void rule__Direccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:876:1: ( ( ( 'Norte' ) ) | ( ( 'Sur' ) ) | ( ( 'Este' ) ) | ( ( 'Oeste' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 30:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            case 32:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:877:1: ( ( 'Norte' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:877:1: ( ( 'Norte' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:878:1: ( 'Norte' )
                    {
                     before(grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:879:1: ( 'Norte' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:879:3: 'Norte'
                    {
                    match(input,29,FOLLOW_29_in_rule__Direccion__Alternatives1898); 

                    }

                     after(grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:884:6: ( ( 'Sur' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:884:6: ( ( 'Sur' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:885:1: ( 'Sur' )
                    {
                     before(grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:886:1: ( 'Sur' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:886:3: 'Sur'
                    {
                    match(input,30,FOLLOW_30_in_rule__Direccion__Alternatives1919); 

                    }

                     after(grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:891:6: ( ( 'Este' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:891:6: ( ( 'Este' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:892:1: ( 'Este' )
                    {
                     before(grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:893:1: ( 'Este' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:893:3: 'Este'
                    {
                    match(input,31,FOLLOW_31_in_rule__Direccion__Alternatives1940); 

                    }

                     after(grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:898:6: ( ( 'Oeste' ) )
                    {
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:898:6: ( ( 'Oeste' ) )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:899:1: ( 'Oeste' )
                    {
                     before(grammarAccess.getDireccionAccess().getOesteEnumLiteralDeclaration_3()); 
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:900:1: ( 'Oeste' )
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:900:3: 'Oeste'
                    {
                    match(input,32,FOLLOW_32_in_rule__Direccion__Alternatives1961); 

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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:912:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:916:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:917:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__01994);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__01997);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:924:1: rule__Procedure__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:928:1: ( ( 'procedure' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:929:1: ( 'procedure' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:929:1: ( 'procedure' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:930:1: 'procedure'
            {
             before(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Procedure__Group__0__Impl2025); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:943:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:947:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:948:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12056);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12059);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:955:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:959:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:960:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:960:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:961:1: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:962:1: ( rule__Procedure__NameAssignment_1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:962:2: rule__Procedure__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl2086);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:972:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:976:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:977:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
            {
            pushFollow(FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22116);
            rule__Procedure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__3_in_rule__Procedure__Group__22119);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:984:1: rule__Procedure__Group__2__Impl : ( RULE_LBRACE ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:988:1: ( ( RULE_LBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:989:1: ( RULE_LBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:989:1: ( RULE_LBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:990:1: RULE_LBRACE
            {
             before(grammarAccess.getProcedureAccess().getLBRACETerminalRuleCall_2()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__Procedure__Group__2__Impl2146); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1001:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl rule__Procedure__Group__4 ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1005:1: ( rule__Procedure__Group__3__Impl rule__Procedure__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1006:2: rule__Procedure__Group__3__Impl rule__Procedure__Group__4
            {
            pushFollow(FOLLOW_rule__Procedure__Group__3__Impl_in_rule__Procedure__Group__32175);
            rule__Procedure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__4_in_rule__Procedure__Group__32178);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1013:1: rule__Procedure__Group__3__Impl : ( ( rule__Procedure__CommandsAssignment_3 )* ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1017:1: ( ( ( rule__Procedure__CommandsAssignment_3 )* ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1018:1: ( ( rule__Procedure__CommandsAssignment_3 )* )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1018:1: ( ( rule__Procedure__CommandsAssignment_3 )* )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1019:1: ( rule__Procedure__CommandsAssignment_3 )*
            {
             before(grammarAccess.getProcedureAccess().getCommandsAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1020:1: ( rule__Procedure__CommandsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_LPAR||(LA9_0>=25 && LA9_0<=28)||LA9_0==34||(LA9_0>=36 && LA9_0<=41)||(LA9_0>=43 && LA9_0<=44)||LA9_0==47||LA9_0==49) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1020:2: rule__Procedure__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Procedure__CommandsAssignment_3_in_rule__Procedure__Group__3__Impl2205);
            	    rule__Procedure__CommandsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1030:1: rule__Procedure__Group__4 : rule__Procedure__Group__4__Impl ;
    public final void rule__Procedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1034:1: ( rule__Procedure__Group__4__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1035:2: rule__Procedure__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group__4__Impl_in_rule__Procedure__Group__42236);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1041:1: rule__Procedure__Group__4__Impl : ( RULE_RBRACE ) ;
    public final void rule__Procedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1045:1: ( ( RULE_RBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1046:1: ( RULE_RBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1046:1: ( RULE_RBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1047:1: RULE_RBRACE
            {
             before(grammarAccess.getProcedureAccess().getRBRACETerminalRuleCall_4()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__Procedure__Group__4__Impl2263); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1068:1: rule__PonerN__Group__0 : rule__PonerN__Group__0__Impl rule__PonerN__Group__1 ;
    public final void rule__PonerN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1072:1: ( rule__PonerN__Group__0__Impl rule__PonerN__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1073:2: rule__PonerN__Group__0__Impl rule__PonerN__Group__1
            {
            pushFollow(FOLLOW_rule__PonerN__Group__0__Impl_in_rule__PonerN__Group__02302);
            rule__PonerN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PonerN__Group__1_in_rule__PonerN__Group__02305);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1080:1: rule__PonerN__Group__0__Impl : ( () ) ;
    public final void rule__PonerN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1084:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1085:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1085:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1086:1: ()
            {
             before(grammarAccess.getPonerNAccess().getPonerNAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1087:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1089:1: 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1099:1: rule__PonerN__Group__1 : rule__PonerN__Group__1__Impl rule__PonerN__Group__2 ;
    public final void rule__PonerN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1103:1: ( rule__PonerN__Group__1__Impl rule__PonerN__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1104:2: rule__PonerN__Group__1__Impl rule__PonerN__Group__2
            {
            pushFollow(FOLLOW_rule__PonerN__Group__1__Impl_in_rule__PonerN__Group__12363);
            rule__PonerN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PonerN__Group__2_in_rule__PonerN__Group__12366);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1111:1: rule__PonerN__Group__1__Impl : ( 'PonerN' ) ;
    public final void rule__PonerN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1115:1: ( ( 'PonerN' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1116:1: ( 'PonerN' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1116:1: ( 'PonerN' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1117:1: 'PonerN'
            {
             before(grammarAccess.getPonerNAccess().getPonerNKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__PonerN__Group__1__Impl2394); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1130:1: rule__PonerN__Group__2 : rule__PonerN__Group__2__Impl rule__PonerN__Group__3 ;
    public final void rule__PonerN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1134:1: ( rule__PonerN__Group__2__Impl rule__PonerN__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1135:2: rule__PonerN__Group__2__Impl rule__PonerN__Group__3
            {
            pushFollow(FOLLOW_rule__PonerN__Group__2__Impl_in_rule__PonerN__Group__22425);
            rule__PonerN__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PonerN__Group__3_in_rule__PonerN__Group__22428);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1142:1: rule__PonerN__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__PonerN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1146:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1147:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1147:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1148:1: RULE_LPAR
            {
             before(grammarAccess.getPonerNAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__PonerN__Group__2__Impl2455); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1159:1: rule__PonerN__Group__3 : rule__PonerN__Group__3__Impl rule__PonerN__Group__4 ;
    public final void rule__PonerN__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1163:1: ( rule__PonerN__Group__3__Impl rule__PonerN__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1164:2: rule__PonerN__Group__3__Impl rule__PonerN__Group__4
            {
            pushFollow(FOLLOW_rule__PonerN__Group__3__Impl_in_rule__PonerN__Group__32484);
            rule__PonerN__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PonerN__Group__4_in_rule__PonerN__Group__32487);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1171:1: rule__PonerN__Group__3__Impl : ( ( rule__PonerN__IntAssignment_3 ) ) ;
    public final void rule__PonerN__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1175:1: ( ( ( rule__PonerN__IntAssignment_3 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1176:1: ( ( rule__PonerN__IntAssignment_3 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1176:1: ( ( rule__PonerN__IntAssignment_3 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1177:1: ( rule__PonerN__IntAssignment_3 )
            {
             before(grammarAccess.getPonerNAccess().getIntAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1178:1: ( rule__PonerN__IntAssignment_3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1178:2: rule__PonerN__IntAssignment_3
            {
            pushFollow(FOLLOW_rule__PonerN__IntAssignment_3_in_rule__PonerN__Group__3__Impl2514);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1188:1: rule__PonerN__Group__4 : rule__PonerN__Group__4__Impl rule__PonerN__Group__5 ;
    public final void rule__PonerN__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1192:1: ( rule__PonerN__Group__4__Impl rule__PonerN__Group__5 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1193:2: rule__PonerN__Group__4__Impl rule__PonerN__Group__5
            {
            pushFollow(FOLLOW_rule__PonerN__Group__4__Impl_in_rule__PonerN__Group__42544);
            rule__PonerN__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PonerN__Group__5_in_rule__PonerN__Group__42547);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1200:1: rule__PonerN__Group__4__Impl : ( ',' ) ;
    public final void rule__PonerN__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1204:1: ( ( ',' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1205:1: ( ',' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1205:1: ( ',' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1206:1: ','
            {
             before(grammarAccess.getPonerNAccess().getCommaKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__PonerN__Group__4__Impl2575); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1219:1: rule__PonerN__Group__5 : rule__PonerN__Group__5__Impl rule__PonerN__Group__6 ;
    public final void rule__PonerN__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1223:1: ( rule__PonerN__Group__5__Impl rule__PonerN__Group__6 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1224:2: rule__PonerN__Group__5__Impl rule__PonerN__Group__6
            {
            pushFollow(FOLLOW_rule__PonerN__Group__5__Impl_in_rule__PonerN__Group__52606);
            rule__PonerN__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PonerN__Group__6_in_rule__PonerN__Group__52609);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1231:1: rule__PonerN__Group__5__Impl : ( ( rule__PonerN__ColorAssignment_5 ) ) ;
    public final void rule__PonerN__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1235:1: ( ( ( rule__PonerN__ColorAssignment_5 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1236:1: ( ( rule__PonerN__ColorAssignment_5 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1236:1: ( ( rule__PonerN__ColorAssignment_5 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1237:1: ( rule__PonerN__ColorAssignment_5 )
            {
             before(grammarAccess.getPonerNAccess().getColorAssignment_5()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1238:1: ( rule__PonerN__ColorAssignment_5 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1238:2: rule__PonerN__ColorAssignment_5
            {
            pushFollow(FOLLOW_rule__PonerN__ColorAssignment_5_in_rule__PonerN__Group__5__Impl2636);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1248:1: rule__PonerN__Group__6 : rule__PonerN__Group__6__Impl ;
    public final void rule__PonerN__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1252:1: ( rule__PonerN__Group__6__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1253:2: rule__PonerN__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PonerN__Group__6__Impl_in_rule__PonerN__Group__62666);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1259:1: rule__PonerN__Group__6__Impl : ( RULE_RPAR ) ;
    public final void rule__PonerN__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1263:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1264:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1264:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1265:1: RULE_RPAR
            {
             before(grammarAccess.getPonerNAccess().getRPARTerminalRuleCall_6()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__PonerN__Group__6__Impl2693); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1290:1: rule__MoverN__Group__0 : rule__MoverN__Group__0__Impl rule__MoverN__Group__1 ;
    public final void rule__MoverN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1294:1: ( rule__MoverN__Group__0__Impl rule__MoverN__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1295:2: rule__MoverN__Group__0__Impl rule__MoverN__Group__1
            {
            pushFollow(FOLLOW_rule__MoverN__Group__0__Impl_in_rule__MoverN__Group__02736);
            rule__MoverN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoverN__Group__1_in_rule__MoverN__Group__02739);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1302:1: rule__MoverN__Group__0__Impl : ( () ) ;
    public final void rule__MoverN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1306:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1307:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1307:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1308:1: ()
            {
             before(grammarAccess.getMoverNAccess().getMoverNAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1309:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1311:1: 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1321:1: rule__MoverN__Group__1 : rule__MoverN__Group__1__Impl rule__MoverN__Group__2 ;
    public final void rule__MoverN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1325:1: ( rule__MoverN__Group__1__Impl rule__MoverN__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1326:2: rule__MoverN__Group__1__Impl rule__MoverN__Group__2
            {
            pushFollow(FOLLOW_rule__MoverN__Group__1__Impl_in_rule__MoverN__Group__12797);
            rule__MoverN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoverN__Group__2_in_rule__MoverN__Group__12800);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1333:1: rule__MoverN__Group__1__Impl : ( 'MoverN' ) ;
    public final void rule__MoverN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1337:1: ( ( 'MoverN' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1338:1: ( 'MoverN' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1338:1: ( 'MoverN' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1339:1: 'MoverN'
            {
             before(grammarAccess.getMoverNAccess().getMoverNKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__MoverN__Group__1__Impl2828); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1352:1: rule__MoverN__Group__2 : rule__MoverN__Group__2__Impl rule__MoverN__Group__3 ;
    public final void rule__MoverN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1356:1: ( rule__MoverN__Group__2__Impl rule__MoverN__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1357:2: rule__MoverN__Group__2__Impl rule__MoverN__Group__3
            {
            pushFollow(FOLLOW_rule__MoverN__Group__2__Impl_in_rule__MoverN__Group__22859);
            rule__MoverN__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoverN__Group__3_in_rule__MoverN__Group__22862);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1364:1: rule__MoverN__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__MoverN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1368:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1369:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1369:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1370:1: RULE_LPAR
            {
             before(grammarAccess.getMoverNAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__MoverN__Group__2__Impl2889); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1381:1: rule__MoverN__Group__3 : rule__MoverN__Group__3__Impl rule__MoverN__Group__4 ;
    public final void rule__MoverN__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1385:1: ( rule__MoverN__Group__3__Impl rule__MoverN__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1386:2: rule__MoverN__Group__3__Impl rule__MoverN__Group__4
            {
            pushFollow(FOLLOW_rule__MoverN__Group__3__Impl_in_rule__MoverN__Group__32918);
            rule__MoverN__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoverN__Group__4_in_rule__MoverN__Group__32921);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1393:1: rule__MoverN__Group__3__Impl : ( ( rule__MoverN__IntAssignment_3 ) ) ;
    public final void rule__MoverN__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1397:1: ( ( ( rule__MoverN__IntAssignment_3 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1398:1: ( ( rule__MoverN__IntAssignment_3 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1398:1: ( ( rule__MoverN__IntAssignment_3 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1399:1: ( rule__MoverN__IntAssignment_3 )
            {
             before(grammarAccess.getMoverNAccess().getIntAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1400:1: ( rule__MoverN__IntAssignment_3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1400:2: rule__MoverN__IntAssignment_3
            {
            pushFollow(FOLLOW_rule__MoverN__IntAssignment_3_in_rule__MoverN__Group__3__Impl2948);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1410:1: rule__MoverN__Group__4 : rule__MoverN__Group__4__Impl rule__MoverN__Group__5 ;
    public final void rule__MoverN__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1414:1: ( rule__MoverN__Group__4__Impl rule__MoverN__Group__5 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1415:2: rule__MoverN__Group__4__Impl rule__MoverN__Group__5
            {
            pushFollow(FOLLOW_rule__MoverN__Group__4__Impl_in_rule__MoverN__Group__42978);
            rule__MoverN__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoverN__Group__5_in_rule__MoverN__Group__42981);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1422:1: rule__MoverN__Group__4__Impl : ( ',' ) ;
    public final void rule__MoverN__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1426:1: ( ( ',' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1427:1: ( ',' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1427:1: ( ',' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1428:1: ','
            {
             before(grammarAccess.getMoverNAccess().getCommaKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__MoverN__Group__4__Impl3009); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1441:1: rule__MoverN__Group__5 : rule__MoverN__Group__5__Impl rule__MoverN__Group__6 ;
    public final void rule__MoverN__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1445:1: ( rule__MoverN__Group__5__Impl rule__MoverN__Group__6 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1446:2: rule__MoverN__Group__5__Impl rule__MoverN__Group__6
            {
            pushFollow(FOLLOW_rule__MoverN__Group__5__Impl_in_rule__MoverN__Group__53040);
            rule__MoverN__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoverN__Group__6_in_rule__MoverN__Group__53043);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1453:1: rule__MoverN__Group__5__Impl : ( ( rule__MoverN__DirAssignment_5 ) ) ;
    public final void rule__MoverN__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1457:1: ( ( ( rule__MoverN__DirAssignment_5 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1458:1: ( ( rule__MoverN__DirAssignment_5 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1458:1: ( ( rule__MoverN__DirAssignment_5 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1459:1: ( rule__MoverN__DirAssignment_5 )
            {
             before(grammarAccess.getMoverNAccess().getDirAssignment_5()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1460:1: ( rule__MoverN__DirAssignment_5 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1460:2: rule__MoverN__DirAssignment_5
            {
            pushFollow(FOLLOW_rule__MoverN__DirAssignment_5_in_rule__MoverN__Group__5__Impl3070);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1470:1: rule__MoverN__Group__6 : rule__MoverN__Group__6__Impl ;
    public final void rule__MoverN__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1474:1: ( rule__MoverN__Group__6__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1475:2: rule__MoverN__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MoverN__Group__6__Impl_in_rule__MoverN__Group__63100);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1481:1: rule__MoverN__Group__6__Impl : ( RULE_RPAR ) ;
    public final void rule__MoverN__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1485:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1486:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1486:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1487:1: RULE_RPAR
            {
             before(grammarAccess.getMoverNAccess().getRPARTerminalRuleCall_6()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__MoverN__Group__6__Impl3127); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1512:1: rule__Poner__Group__0 : rule__Poner__Group__0__Impl rule__Poner__Group__1 ;
    public final void rule__Poner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1516:1: ( rule__Poner__Group__0__Impl rule__Poner__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1517:2: rule__Poner__Group__0__Impl rule__Poner__Group__1
            {
            pushFollow(FOLLOW_rule__Poner__Group__0__Impl_in_rule__Poner__Group__03170);
            rule__Poner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__1_in_rule__Poner__Group__03173);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1524:1: rule__Poner__Group__0__Impl : ( () ) ;
    public final void rule__Poner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1528:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1529:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1529:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1530:1: ()
            {
             before(grammarAccess.getPonerAccess().getPonerAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1531:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1533:1: 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1543:1: rule__Poner__Group__1 : rule__Poner__Group__1__Impl rule__Poner__Group__2 ;
    public final void rule__Poner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1547:1: ( rule__Poner__Group__1__Impl rule__Poner__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1548:2: rule__Poner__Group__1__Impl rule__Poner__Group__2
            {
            pushFollow(FOLLOW_rule__Poner__Group__1__Impl_in_rule__Poner__Group__13231);
            rule__Poner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__2_in_rule__Poner__Group__13234);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1555:1: rule__Poner__Group__1__Impl : ( 'Poner' ) ;
    public final void rule__Poner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1559:1: ( ( 'Poner' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1560:1: ( 'Poner' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1560:1: ( 'Poner' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1561:1: 'Poner'
            {
             before(grammarAccess.getPonerAccess().getPonerKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__Poner__Group__1__Impl3262); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1574:1: rule__Poner__Group__2 : rule__Poner__Group__2__Impl rule__Poner__Group__3 ;
    public final void rule__Poner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1578:1: ( rule__Poner__Group__2__Impl rule__Poner__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1579:2: rule__Poner__Group__2__Impl rule__Poner__Group__3
            {
            pushFollow(FOLLOW_rule__Poner__Group__2__Impl_in_rule__Poner__Group__23293);
            rule__Poner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__3_in_rule__Poner__Group__23296);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1586:1: rule__Poner__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__Poner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1590:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1591:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1591:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1592:1: RULE_LPAR
            {
             before(grammarAccess.getPonerAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__Poner__Group__2__Impl3323); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1603:1: rule__Poner__Group__3 : rule__Poner__Group__3__Impl rule__Poner__Group__4 ;
    public final void rule__Poner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1607:1: ( rule__Poner__Group__3__Impl rule__Poner__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1608:2: rule__Poner__Group__3__Impl rule__Poner__Group__4
            {
            pushFollow(FOLLOW_rule__Poner__Group__3__Impl_in_rule__Poner__Group__33352);
            rule__Poner__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Poner__Group__4_in_rule__Poner__Group__33355);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1615:1: rule__Poner__Group__3__Impl : ( ( rule__Poner__ColorAssignment_3 ) ) ;
    public final void rule__Poner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1619:1: ( ( ( rule__Poner__ColorAssignment_3 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1620:1: ( ( rule__Poner__ColorAssignment_3 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1620:1: ( ( rule__Poner__ColorAssignment_3 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1621:1: ( rule__Poner__ColorAssignment_3 )
            {
             before(grammarAccess.getPonerAccess().getColorAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1622:1: ( rule__Poner__ColorAssignment_3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1622:2: rule__Poner__ColorAssignment_3
            {
            pushFollow(FOLLOW_rule__Poner__ColorAssignment_3_in_rule__Poner__Group__3__Impl3382);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1632:1: rule__Poner__Group__4 : rule__Poner__Group__4__Impl ;
    public final void rule__Poner__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1636:1: ( rule__Poner__Group__4__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1637:2: rule__Poner__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Poner__Group__4__Impl_in_rule__Poner__Group__43412);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1643:1: rule__Poner__Group__4__Impl : ( RULE_RPAR ) ;
    public final void rule__Poner__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1647:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1648:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1648:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1649:1: RULE_RPAR
            {
             before(grammarAccess.getPonerAccess().getRPARTerminalRuleCall_4()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__Poner__Group__4__Impl3439); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1670:1: rule__Mover__Group__0 : rule__Mover__Group__0__Impl rule__Mover__Group__1 ;
    public final void rule__Mover__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1674:1: ( rule__Mover__Group__0__Impl rule__Mover__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1675:2: rule__Mover__Group__0__Impl rule__Mover__Group__1
            {
            pushFollow(FOLLOW_rule__Mover__Group__0__Impl_in_rule__Mover__Group__03478);
            rule__Mover__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__1_in_rule__Mover__Group__03481);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1682:1: rule__Mover__Group__0__Impl : ( () ) ;
    public final void rule__Mover__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1686:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1687:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1687:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1688:1: ()
            {
             before(grammarAccess.getMoverAccess().getMoverAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1689:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1691:1: 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1701:1: rule__Mover__Group__1 : rule__Mover__Group__1__Impl rule__Mover__Group__2 ;
    public final void rule__Mover__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1705:1: ( rule__Mover__Group__1__Impl rule__Mover__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1706:2: rule__Mover__Group__1__Impl rule__Mover__Group__2
            {
            pushFollow(FOLLOW_rule__Mover__Group__1__Impl_in_rule__Mover__Group__13539);
            rule__Mover__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__2_in_rule__Mover__Group__13542);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1713:1: rule__Mover__Group__1__Impl : ( 'Mover' ) ;
    public final void rule__Mover__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1717:1: ( ( 'Mover' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1718:1: ( 'Mover' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1718:1: ( 'Mover' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1719:1: 'Mover'
            {
             before(grammarAccess.getMoverAccess().getMoverKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__Mover__Group__1__Impl3570); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1732:1: rule__Mover__Group__2 : rule__Mover__Group__2__Impl rule__Mover__Group__3 ;
    public final void rule__Mover__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1736:1: ( rule__Mover__Group__2__Impl rule__Mover__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1737:2: rule__Mover__Group__2__Impl rule__Mover__Group__3
            {
            pushFollow(FOLLOW_rule__Mover__Group__2__Impl_in_rule__Mover__Group__23601);
            rule__Mover__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__3_in_rule__Mover__Group__23604);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1744:1: rule__Mover__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__Mover__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1748:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1749:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1749:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1750:1: RULE_LPAR
            {
             before(grammarAccess.getMoverAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__Mover__Group__2__Impl3631); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1761:1: rule__Mover__Group__3 : rule__Mover__Group__3__Impl rule__Mover__Group__4 ;
    public final void rule__Mover__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1765:1: ( rule__Mover__Group__3__Impl rule__Mover__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1766:2: rule__Mover__Group__3__Impl rule__Mover__Group__4
            {
            pushFollow(FOLLOW_rule__Mover__Group__3__Impl_in_rule__Mover__Group__33660);
            rule__Mover__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mover__Group__4_in_rule__Mover__Group__33663);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1773:1: rule__Mover__Group__3__Impl : ( ( rule__Mover__DirAssignment_3 ) ) ;
    public final void rule__Mover__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1777:1: ( ( ( rule__Mover__DirAssignment_3 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1778:1: ( ( rule__Mover__DirAssignment_3 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1778:1: ( ( rule__Mover__DirAssignment_3 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1779:1: ( rule__Mover__DirAssignment_3 )
            {
             before(grammarAccess.getMoverAccess().getDirAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1780:1: ( rule__Mover__DirAssignment_3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1780:2: rule__Mover__DirAssignment_3
            {
            pushFollow(FOLLOW_rule__Mover__DirAssignment_3_in_rule__Mover__Group__3__Impl3690);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1790:1: rule__Mover__Group__4 : rule__Mover__Group__4__Impl ;
    public final void rule__Mover__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1794:1: ( rule__Mover__Group__4__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1795:2: rule__Mover__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Mover__Group__4__Impl_in_rule__Mover__Group__43720);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1801:1: rule__Mover__Group__4__Impl : ( RULE_RPAR ) ;
    public final void rule__Mover__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1805:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1806:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1806:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1807:1: RULE_RPAR
            {
             before(grammarAccess.getMoverAccess().getRPARTerminalRuleCall_4()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__Mover__Group__4__Impl3747); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1828:1: rule__HayBolitas__Group__0 : rule__HayBolitas__Group__0__Impl rule__HayBolitas__Group__1 ;
    public final void rule__HayBolitas__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1832:1: ( rule__HayBolitas__Group__0__Impl rule__HayBolitas__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1833:2: rule__HayBolitas__Group__0__Impl rule__HayBolitas__Group__1
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__0__Impl_in_rule__HayBolitas__Group__03786);
            rule__HayBolitas__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HayBolitas__Group__1_in_rule__HayBolitas__Group__03789);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1840:1: rule__HayBolitas__Group__0__Impl : ( 'hayBolitas' ) ;
    public final void rule__HayBolitas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1844:1: ( ( 'hayBolitas' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1845:1: ( 'hayBolitas' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1845:1: ( 'hayBolitas' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1846:1: 'hayBolitas'
            {
             before(grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__HayBolitas__Group__0__Impl3817); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1859:1: rule__HayBolitas__Group__1 : rule__HayBolitas__Group__1__Impl rule__HayBolitas__Group__2 ;
    public final void rule__HayBolitas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1863:1: ( rule__HayBolitas__Group__1__Impl rule__HayBolitas__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1864:2: rule__HayBolitas__Group__1__Impl rule__HayBolitas__Group__2
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__1__Impl_in_rule__HayBolitas__Group__13848);
            rule__HayBolitas__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HayBolitas__Group__2_in_rule__HayBolitas__Group__13851);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1871:1: rule__HayBolitas__Group__1__Impl : ( RULE_LPAR ) ;
    public final void rule__HayBolitas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1875:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1876:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1876:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1877:1: RULE_LPAR
            {
             before(grammarAccess.getHayBolitasAccess().getLPARTerminalRuleCall_1()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__HayBolitas__Group__1__Impl3878); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1888:1: rule__HayBolitas__Group__2 : rule__HayBolitas__Group__2__Impl rule__HayBolitas__Group__3 ;
    public final void rule__HayBolitas__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1892:1: ( rule__HayBolitas__Group__2__Impl rule__HayBolitas__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1893:2: rule__HayBolitas__Group__2__Impl rule__HayBolitas__Group__3
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__2__Impl_in_rule__HayBolitas__Group__23907);
            rule__HayBolitas__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HayBolitas__Group__3_in_rule__HayBolitas__Group__23910);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1900:1: rule__HayBolitas__Group__2__Impl : ( ( rule__HayBolitas__ColorAssignment_2 ) ) ;
    public final void rule__HayBolitas__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1904:1: ( ( ( rule__HayBolitas__ColorAssignment_2 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1905:1: ( ( rule__HayBolitas__ColorAssignment_2 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1905:1: ( ( rule__HayBolitas__ColorAssignment_2 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1906:1: ( rule__HayBolitas__ColorAssignment_2 )
            {
             before(grammarAccess.getHayBolitasAccess().getColorAssignment_2()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1907:1: ( rule__HayBolitas__ColorAssignment_2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1907:2: rule__HayBolitas__ColorAssignment_2
            {
            pushFollow(FOLLOW_rule__HayBolitas__ColorAssignment_2_in_rule__HayBolitas__Group__2__Impl3937);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1917:1: rule__HayBolitas__Group__3 : rule__HayBolitas__Group__3__Impl ;
    public final void rule__HayBolitas__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1921:1: ( rule__HayBolitas__Group__3__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1922:2: rule__HayBolitas__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__HayBolitas__Group__3__Impl_in_rule__HayBolitas__Group__33967);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1928:1: rule__HayBolitas__Group__3__Impl : ( RULE_RPAR ) ;
    public final void rule__HayBolitas__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1932:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1933:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1933:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1934:1: RULE_RPAR
            {
             before(grammarAccess.getHayBolitasAccess().getRPARTerminalRuleCall_3()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__HayBolitas__Group__3__Impl3994); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1953:1: rule__PuedeMover__Group__0 : rule__PuedeMover__Group__0__Impl rule__PuedeMover__Group__1 ;
    public final void rule__PuedeMover__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1957:1: ( rule__PuedeMover__Group__0__Impl rule__PuedeMover__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1958:2: rule__PuedeMover__Group__0__Impl rule__PuedeMover__Group__1
            {
            pushFollow(FOLLOW_rule__PuedeMover__Group__0__Impl_in_rule__PuedeMover__Group__04031);
            rule__PuedeMover__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PuedeMover__Group__1_in_rule__PuedeMover__Group__04034);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1965:1: rule__PuedeMover__Group__0__Impl : ( 'puedeMover' ) ;
    public final void rule__PuedeMover__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1969:1: ( ( 'puedeMover' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1970:1: ( 'puedeMover' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1970:1: ( 'puedeMover' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1971:1: 'puedeMover'
            {
             before(grammarAccess.getPuedeMoverAccess().getPuedeMoverKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__PuedeMover__Group__0__Impl4062); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1984:1: rule__PuedeMover__Group__1 : rule__PuedeMover__Group__1__Impl rule__PuedeMover__Group__2 ;
    public final void rule__PuedeMover__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1988:1: ( rule__PuedeMover__Group__1__Impl rule__PuedeMover__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1989:2: rule__PuedeMover__Group__1__Impl rule__PuedeMover__Group__2
            {
            pushFollow(FOLLOW_rule__PuedeMover__Group__1__Impl_in_rule__PuedeMover__Group__14093);
            rule__PuedeMover__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PuedeMover__Group__2_in_rule__PuedeMover__Group__14096);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:1996:1: rule__PuedeMover__Group__1__Impl : ( RULE_LPAR ) ;
    public final void rule__PuedeMover__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2000:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2001:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2001:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2002:1: RULE_LPAR
            {
             before(grammarAccess.getPuedeMoverAccess().getLPARTerminalRuleCall_1()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__PuedeMover__Group__1__Impl4123); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2013:1: rule__PuedeMover__Group__2 : rule__PuedeMover__Group__2__Impl rule__PuedeMover__Group__3 ;
    public final void rule__PuedeMover__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2017:1: ( rule__PuedeMover__Group__2__Impl rule__PuedeMover__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2018:2: rule__PuedeMover__Group__2__Impl rule__PuedeMover__Group__3
            {
            pushFollow(FOLLOW_rule__PuedeMover__Group__2__Impl_in_rule__PuedeMover__Group__24152);
            rule__PuedeMover__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PuedeMover__Group__3_in_rule__PuedeMover__Group__24155);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2025:1: rule__PuedeMover__Group__2__Impl : ( ( rule__PuedeMover__DirAssignment_2 ) ) ;
    public final void rule__PuedeMover__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2029:1: ( ( ( rule__PuedeMover__DirAssignment_2 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2030:1: ( ( rule__PuedeMover__DirAssignment_2 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2030:1: ( ( rule__PuedeMover__DirAssignment_2 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2031:1: ( rule__PuedeMover__DirAssignment_2 )
            {
             before(grammarAccess.getPuedeMoverAccess().getDirAssignment_2()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2032:1: ( rule__PuedeMover__DirAssignment_2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2032:2: rule__PuedeMover__DirAssignment_2
            {
            pushFollow(FOLLOW_rule__PuedeMover__DirAssignment_2_in_rule__PuedeMover__Group__2__Impl4182);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2042:1: rule__PuedeMover__Group__3 : rule__PuedeMover__Group__3__Impl ;
    public final void rule__PuedeMover__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2046:1: ( rule__PuedeMover__Group__3__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2047:2: rule__PuedeMover__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PuedeMover__Group__3__Impl_in_rule__PuedeMover__Group__34212);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2053:1: rule__PuedeMover__Group__3__Impl : ( RULE_RPAR ) ;
    public final void rule__PuedeMover__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2057:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2058:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2058:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2059:1: RULE_RPAR
            {
             before(grammarAccess.getPuedeMoverAccess().getRPARTerminalRuleCall_3()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__PuedeMover__Group__3__Impl4239); 
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


    // $ANTLR start "rule__Variable__Group_0__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2078:1: rule__Variable__Group_0__0 : rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1 ;
    public final void rule__Variable__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2082:1: ( rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2083:2: rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1
            {
            pushFollow(FOLLOW_rule__Variable__Group_0__0__Impl_in_rule__Variable__Group_0__04276);
            rule__Variable__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_0__1_in_rule__Variable__Group_0__04279);
            rule__Variable__Group_0__1();

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
    // $ANTLR end "rule__Variable__Group_0__0"


    // $ANTLR start "rule__Variable__Group_0__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2090:1: rule__Variable__Group_0__0__Impl : ( () ) ;
    public final void rule__Variable__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2094:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2095:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2095:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2096:1: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2097:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2099:1: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_0__0__Impl"


    // $ANTLR start "rule__Variable__Group_0__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2109:1: rule__Variable__Group_0__1 : rule__Variable__Group_0__1__Impl rule__Variable__Group_0__2 ;
    public final void rule__Variable__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2113:1: ( rule__Variable__Group_0__1__Impl rule__Variable__Group_0__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2114:2: rule__Variable__Group_0__1__Impl rule__Variable__Group_0__2
            {
            pushFollow(FOLLOW_rule__Variable__Group_0__1__Impl_in_rule__Variable__Group_0__14337);
            rule__Variable__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_0__2_in_rule__Variable__Group_0__14340);
            rule__Variable__Group_0__2();

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
    // $ANTLR end "rule__Variable__Group_0__1"


    // $ANTLR start "rule__Variable__Group_0__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2121:1: rule__Variable__Group_0__1__Impl : ( 'var' ) ;
    public final void rule__Variable__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2125:1: ( ( 'var' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2126:1: ( 'var' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2126:1: ( 'var' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2127:1: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0_1()); 
            match(input,41,FOLLOW_41_in_rule__Variable__Group_0__1__Impl4368); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0_1()); 

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
    // $ANTLR end "rule__Variable__Group_0__1__Impl"


    // $ANTLR start "rule__Variable__Group_0__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2140:1: rule__Variable__Group_0__2 : rule__Variable__Group_0__2__Impl rule__Variable__Group_0__3 ;
    public final void rule__Variable__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2144:1: ( rule__Variable__Group_0__2__Impl rule__Variable__Group_0__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2145:2: rule__Variable__Group_0__2__Impl rule__Variable__Group_0__3
            {
            pushFollow(FOLLOW_rule__Variable__Group_0__2__Impl_in_rule__Variable__Group_0__24399);
            rule__Variable__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_0__3_in_rule__Variable__Group_0__24402);
            rule__Variable__Group_0__3();

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
    // $ANTLR end "rule__Variable__Group_0__2"


    // $ANTLR start "rule__Variable__Group_0__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2152:1: rule__Variable__Group_0__2__Impl : ( ( rule__Variable__VarNameAssignment_0_2 ) ) ;
    public final void rule__Variable__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2156:1: ( ( ( rule__Variable__VarNameAssignment_0_2 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2157:1: ( ( rule__Variable__VarNameAssignment_0_2 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2157:1: ( ( rule__Variable__VarNameAssignment_0_2 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2158:1: ( rule__Variable__VarNameAssignment_0_2 )
            {
             before(grammarAccess.getVariableAccess().getVarNameAssignment_0_2()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2159:1: ( rule__Variable__VarNameAssignment_0_2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2159:2: rule__Variable__VarNameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Variable__VarNameAssignment_0_2_in_rule__Variable__Group_0__2__Impl4429);
            rule__Variable__VarNameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getVarNameAssignment_0_2()); 

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
    // $ANTLR end "rule__Variable__Group_0__2__Impl"


    // $ANTLR start "rule__Variable__Group_0__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2169:1: rule__Variable__Group_0__3 : rule__Variable__Group_0__3__Impl rule__Variable__Group_0__4 ;
    public final void rule__Variable__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2173:1: ( rule__Variable__Group_0__3__Impl rule__Variable__Group_0__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2174:2: rule__Variable__Group_0__3__Impl rule__Variable__Group_0__4
            {
            pushFollow(FOLLOW_rule__Variable__Group_0__3__Impl_in_rule__Variable__Group_0__34459);
            rule__Variable__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_0__4_in_rule__Variable__Group_0__34462);
            rule__Variable__Group_0__4();

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
    // $ANTLR end "rule__Variable__Group_0__3"


    // $ANTLR start "rule__Variable__Group_0__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2181:1: rule__Variable__Group_0__3__Impl : ( '=' ) ;
    public final void rule__Variable__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2185:1: ( ( '=' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2186:1: ( '=' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2186:1: ( '=' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2187:1: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_0_3()); 
            match(input,42,FOLLOW_42_in_rule__Variable__Group_0__3__Impl4490); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_0_3()); 

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
    // $ANTLR end "rule__Variable__Group_0__3__Impl"


    // $ANTLR start "rule__Variable__Group_0__4"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2200:1: rule__Variable__Group_0__4 : rule__Variable__Group_0__4__Impl ;
    public final void rule__Variable__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2204:1: ( rule__Variable__Group_0__4__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2205:2: rule__Variable__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group_0__4__Impl_in_rule__Variable__Group_0__44521);
            rule__Variable__Group_0__4__Impl();

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
    // $ANTLR end "rule__Variable__Group_0__4"


    // $ANTLR start "rule__Variable__Group_0__4__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2211:1: rule__Variable__Group_0__4__Impl : ( RULE_INT ) ;
    public final void rule__Variable__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2215:1: ( ( RULE_INT ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2216:1: ( RULE_INT )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2216:1: ( RULE_INT )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2217:1: RULE_INT
            {
             before(grammarAccess.getVariableAccess().getINTTerminalRuleCall_0_4()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Variable__Group_0__4__Impl4548); 
             after(grammarAccess.getVariableAccess().getINTTerminalRuleCall_0_4()); 

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
    // $ANTLR end "rule__Variable__Group_0__4__Impl"


    // $ANTLR start "rule__While__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2238:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2242:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2243:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04587);
            rule__While__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__04590);
            rule__While__Group__1();

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
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2250:1: rule__While__Group__0__Impl : ( () ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2254:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2255:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2255:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2256:1: ()
            {
             before(grammarAccess.getWhileAccess().getWhileAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2257:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2259:1: 
            {
            }

             after(grammarAccess.getWhileAccess().getWhileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2269:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2273:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2274:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14648);
            rule__While__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__14651);
            rule__While__Group__2();

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
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2281:1: rule__While__Group__1__Impl : ( 'While' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2285:1: ( ( 'While' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2286:1: ( 'While' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2286:1: ( 'While' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2287:1: 'While'
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__While__Group__1__Impl4679); 
             after(grammarAccess.getWhileAccess().getWhileKeyword_1()); 

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
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2300:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2304:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2305:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24710);
            rule__While__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__24713);
            rule__While__Group__3();

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
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2312:1: rule__While__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2316:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2317:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2317:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2318:1: RULE_LPAR
            {
             before(grammarAccess.getWhileAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__While__Group__2__Impl4740); 
             after(grammarAccess.getWhileAccess().getLPARTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__While__Group__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2329:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2333:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2334:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34769);
            rule__While__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__34772);
            rule__While__Group__4();

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
    // $ANTLR end "rule__While__Group__3"


    // $ANTLR start "rule__While__Group__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2341:1: rule__While__Group__3__Impl : ( ( rule__While__ExprAssignment_3 ) ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2345:1: ( ( ( rule__While__ExprAssignment_3 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2346:1: ( ( rule__While__ExprAssignment_3 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2346:1: ( ( rule__While__ExprAssignment_3 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2347:1: ( rule__While__ExprAssignment_3 )
            {
             before(grammarAccess.getWhileAccess().getExprAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2348:1: ( rule__While__ExprAssignment_3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2348:2: rule__While__ExprAssignment_3
            {
            pushFollow(FOLLOW_rule__While__ExprAssignment_3_in_rule__While__Group__3__Impl4799);
            rule__While__ExprAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getExprAssignment_3()); 

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
    // $ANTLR end "rule__While__Group__3__Impl"


    // $ANTLR start "rule__While__Group__4"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2358:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2362:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2363:2: rule__While__Group__4__Impl rule__While__Group__5
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44829);
            rule__While__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__5_in_rule__While__Group__44832);
            rule__While__Group__5();

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
    // $ANTLR end "rule__While__Group__4"


    // $ANTLR start "rule__While__Group__4__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2370:1: rule__While__Group__4__Impl : ( RULE_RPAR ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2374:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2375:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2375:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2376:1: RULE_RPAR
            {
             before(grammarAccess.getWhileAccess().getRPARTerminalRuleCall_4()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__While__Group__4__Impl4859); 
             after(grammarAccess.getWhileAccess().getRPARTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__While__Group__4__Impl"


    // $ANTLR start "rule__While__Group__5"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2387:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2391:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2392:2: rule__While__Group__5__Impl rule__While__Group__6
            {
            pushFollow(FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__54888);
            rule__While__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__6_in_rule__While__Group__54891);
            rule__While__Group__6();

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
    // $ANTLR end "rule__While__Group__5"


    // $ANTLR start "rule__While__Group__5__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2399:1: rule__While__Group__5__Impl : ( RULE_LBRACE ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2403:1: ( ( RULE_LBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2404:1: ( RULE_LBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2404:1: ( RULE_LBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2405:1: RULE_LBRACE
            {
             before(grammarAccess.getWhileAccess().getLBRACETerminalRuleCall_5()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__While__Group__5__Impl4918); 
             after(grammarAccess.getWhileAccess().getLBRACETerminalRuleCall_5()); 

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
    // $ANTLR end "rule__While__Group__5__Impl"


    // $ANTLR start "rule__While__Group__6"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2416:1: rule__While__Group__6 : rule__While__Group__6__Impl rule__While__Group__7 ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2420:1: ( rule__While__Group__6__Impl rule__While__Group__7 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2421:2: rule__While__Group__6__Impl rule__While__Group__7
            {
            pushFollow(FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__64947);
            rule__While__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__7_in_rule__While__Group__64950);
            rule__While__Group__7();

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
    // $ANTLR end "rule__While__Group__6"


    // $ANTLR start "rule__While__Group__6__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2428:1: rule__While__Group__6__Impl : ( ( rule__While__CommandsAssignment_6 )* ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2432:1: ( ( ( rule__While__CommandsAssignment_6 )* ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2433:1: ( ( rule__While__CommandsAssignment_6 )* )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2433:1: ( ( rule__While__CommandsAssignment_6 )* )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2434:1: ( rule__While__CommandsAssignment_6 )*
            {
             before(grammarAccess.getWhileAccess().getCommandsAssignment_6()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2435:1: ( rule__While__CommandsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_LPAR||(LA10_0>=25 && LA10_0<=28)||LA10_0==34||(LA10_0>=36 && LA10_0<=41)||(LA10_0>=43 && LA10_0<=44)||LA10_0==47||LA10_0==49) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2435:2: rule__While__CommandsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__While__CommandsAssignment_6_in_rule__While__Group__6__Impl4977);
            	    rule__While__CommandsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getWhileAccess().getCommandsAssignment_6()); 

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
    // $ANTLR end "rule__While__Group__6__Impl"


    // $ANTLR start "rule__While__Group__7"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2445:1: rule__While__Group__7 : rule__While__Group__7__Impl ;
    public final void rule__While__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2449:1: ( rule__While__Group__7__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2450:2: rule__While__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__75008);
            rule__While__Group__7__Impl();

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
    // $ANTLR end "rule__While__Group__7"


    // $ANTLR start "rule__While__Group__7__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2456:1: rule__While__Group__7__Impl : ( RULE_RBRACE ) ;
    public final void rule__While__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2460:1: ( ( RULE_RBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2461:1: ( RULE_RBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2461:1: ( RULE_RBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2462:1: RULE_RBRACE
            {
             before(grammarAccess.getWhileAccess().getRBRACETerminalRuleCall_7()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__While__Group__7__Impl5035); 
             after(grammarAccess.getWhileAccess().getRBRACETerminalRuleCall_7()); 

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
    // $ANTLR end "rule__While__Group__7__Impl"


    // $ANTLR start "rule__For__Group_0__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2489:1: rule__For__Group_0__0 : rule__For__Group_0__0__Impl rule__For__Group_0__1 ;
    public final void rule__For__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2493:1: ( rule__For__Group_0__0__Impl rule__For__Group_0__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2494:2: rule__For__Group_0__0__Impl rule__For__Group_0__1
            {
            pushFollow(FOLLOW_rule__For__Group_0__0__Impl_in_rule__For__Group_0__05080);
            rule__For__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group_0__1_in_rule__For__Group_0__05083);
            rule__For__Group_0__1();

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
    // $ANTLR end "rule__For__Group_0__0"


    // $ANTLR start "rule__For__Group_0__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2501:1: rule__For__Group_0__0__Impl : ( () ) ;
    public final void rule__For__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2505:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2506:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2506:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2507:1: ()
            {
             before(grammarAccess.getForAccess().getForAction_0_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2508:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2510:1: 
            {
            }

             after(grammarAccess.getForAccess().getForAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group_0__0__Impl"


    // $ANTLR start "rule__For__Group_0__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2520:1: rule__For__Group_0__1 : rule__For__Group_0__1__Impl rule__For__Group_0__2 ;
    public final void rule__For__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2524:1: ( rule__For__Group_0__1__Impl rule__For__Group_0__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2525:2: rule__For__Group_0__1__Impl rule__For__Group_0__2
            {
            pushFollow(FOLLOW_rule__For__Group_0__1__Impl_in_rule__For__Group_0__15141);
            rule__For__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group_0__2_in_rule__For__Group_0__15144);
            rule__For__Group_0__2();

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
    // $ANTLR end "rule__For__Group_0__1"


    // $ANTLR start "rule__For__Group_0__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2532:1: rule__For__Group_0__1__Impl : ( 'repeat' ) ;
    public final void rule__For__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2536:1: ( ( 'repeat' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2537:1: ( 'repeat' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2537:1: ( 'repeat' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2538:1: 'repeat'
            {
             before(grammarAccess.getForAccess().getRepeatKeyword_0_1()); 
            match(input,44,FOLLOW_44_in_rule__For__Group_0__1__Impl5172); 
             after(grammarAccess.getForAccess().getRepeatKeyword_0_1()); 

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
    // $ANTLR end "rule__For__Group_0__1__Impl"


    // $ANTLR start "rule__For__Group_0__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2551:1: rule__For__Group_0__2 : rule__For__Group_0__2__Impl rule__For__Group_0__3 ;
    public final void rule__For__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2555:1: ( rule__For__Group_0__2__Impl rule__For__Group_0__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2556:2: rule__For__Group_0__2__Impl rule__For__Group_0__3
            {
            pushFollow(FOLLOW_rule__For__Group_0__2__Impl_in_rule__For__Group_0__25203);
            rule__For__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group_0__3_in_rule__For__Group_0__25206);
            rule__For__Group_0__3();

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
    // $ANTLR end "rule__For__Group_0__2"


    // $ANTLR start "rule__For__Group_0__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2563:1: rule__For__Group_0__2__Impl : ( ( rule__For__VarNameAssignment_0_2 ) ) ;
    public final void rule__For__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2567:1: ( ( ( rule__For__VarNameAssignment_0_2 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2568:1: ( ( rule__For__VarNameAssignment_0_2 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2568:1: ( ( rule__For__VarNameAssignment_0_2 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2569:1: ( rule__For__VarNameAssignment_0_2 )
            {
             before(grammarAccess.getForAccess().getVarNameAssignment_0_2()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2570:1: ( rule__For__VarNameAssignment_0_2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2570:2: rule__For__VarNameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__For__VarNameAssignment_0_2_in_rule__For__Group_0__2__Impl5233);
            rule__For__VarNameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getVarNameAssignment_0_2()); 

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
    // $ANTLR end "rule__For__Group_0__2__Impl"


    // $ANTLR start "rule__For__Group_0__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2580:1: rule__For__Group_0__3 : rule__For__Group_0__3__Impl rule__For__Group_0__4 ;
    public final void rule__For__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2584:1: ( rule__For__Group_0__3__Impl rule__For__Group_0__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2585:2: rule__For__Group_0__3__Impl rule__For__Group_0__4
            {
            pushFollow(FOLLOW_rule__For__Group_0__3__Impl_in_rule__For__Group_0__35263);
            rule__For__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group_0__4_in_rule__For__Group_0__35266);
            rule__For__Group_0__4();

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
    // $ANTLR end "rule__For__Group_0__3"


    // $ANTLR start "rule__For__Group_0__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2592:1: rule__For__Group_0__3__Impl : ( 'in' ) ;
    public final void rule__For__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2596:1: ( ( 'in' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2597:1: ( 'in' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2597:1: ( 'in' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2598:1: 'in'
            {
             before(grammarAccess.getForAccess().getInKeyword_0_3()); 
            match(input,45,FOLLOW_45_in_rule__For__Group_0__3__Impl5294); 
             after(grammarAccess.getForAccess().getInKeyword_0_3()); 

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
    // $ANTLR end "rule__For__Group_0__3__Impl"


    // $ANTLR start "rule__For__Group_0__4"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2611:1: rule__For__Group_0__4 : rule__For__Group_0__4__Impl ;
    public final void rule__For__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2615:1: ( rule__For__Group_0__4__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2616:2: rule__For__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__For__Group_0__4__Impl_in_rule__For__Group_0__45325);
            rule__For__Group_0__4__Impl();

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
    // $ANTLR end "rule__For__Group_0__4"


    // $ANTLR start "rule__For__Group_0__4__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2622:1: rule__For__Group_0__4__Impl : ( RULE_INT ) ;
    public final void rule__For__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2626:1: ( ( RULE_INT ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2627:1: ( RULE_INT )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2627:1: ( RULE_INT )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2628:1: RULE_INT
            {
             before(grammarAccess.getForAccess().getINTTerminalRuleCall_0_4()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__For__Group_0__4__Impl5352); 
             after(grammarAccess.getForAccess().getINTTerminalRuleCall_0_4()); 

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
    // $ANTLR end "rule__For__Group_0__4__Impl"


    // $ANTLR start "rule__For__Group_1__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2649:1: rule__For__Group_1__0 : rule__For__Group_1__0__Impl rule__For__Group_1__1 ;
    public final void rule__For__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2653:1: ( rule__For__Group_1__0__Impl rule__For__Group_1__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2654:2: rule__For__Group_1__0__Impl rule__For__Group_1__1
            {
            pushFollow(FOLLOW_rule__For__Group_1__0__Impl_in_rule__For__Group_1__05391);
            rule__For__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group_1__1_in_rule__For__Group_1__05394);
            rule__For__Group_1__1();

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
    // $ANTLR end "rule__For__Group_1__0"


    // $ANTLR start "rule__For__Group_1__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2661:1: rule__For__Group_1__0__Impl : ( ( rule__For__ColorAAssignment_1_0 ) ) ;
    public final void rule__For__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2665:1: ( ( ( rule__For__ColorAAssignment_1_0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2666:1: ( ( rule__For__ColorAAssignment_1_0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2666:1: ( ( rule__For__ColorAAssignment_1_0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2667:1: ( rule__For__ColorAAssignment_1_0 )
            {
             before(grammarAccess.getForAccess().getColorAAssignment_1_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2668:1: ( rule__For__ColorAAssignment_1_0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2668:2: rule__For__ColorAAssignment_1_0
            {
            pushFollow(FOLLOW_rule__For__ColorAAssignment_1_0_in_rule__For__Group_1__0__Impl5421);
            rule__For__ColorAAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getColorAAssignment_1_0()); 

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
    // $ANTLR end "rule__For__Group_1__0__Impl"


    // $ANTLR start "rule__For__Group_1__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2678:1: rule__For__Group_1__1 : rule__For__Group_1__1__Impl rule__For__Group_1__2 ;
    public final void rule__For__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2682:1: ( rule__For__Group_1__1__Impl rule__For__Group_1__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2683:2: rule__For__Group_1__1__Impl rule__For__Group_1__2
            {
            pushFollow(FOLLOW_rule__For__Group_1__1__Impl_in_rule__For__Group_1__15451);
            rule__For__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group_1__2_in_rule__For__Group_1__15454);
            rule__For__Group_1__2();

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
    // $ANTLR end "rule__For__Group_1__1"


    // $ANTLR start "rule__For__Group_1__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2690:1: rule__For__Group_1__1__Impl : ( 'to' ) ;
    public final void rule__For__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2694:1: ( ( 'to' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2695:1: ( 'to' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2695:1: ( 'to' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2696:1: 'to'
            {
             before(grammarAccess.getForAccess().getToKeyword_1_1()); 
            match(input,46,FOLLOW_46_in_rule__For__Group_1__1__Impl5482); 
             after(grammarAccess.getForAccess().getToKeyword_1_1()); 

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
    // $ANTLR end "rule__For__Group_1__1__Impl"


    // $ANTLR start "rule__For__Group_1__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2709:1: rule__For__Group_1__2 : rule__For__Group_1__2__Impl ;
    public final void rule__For__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2713:1: ( rule__For__Group_1__2__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2714:2: rule__For__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__For__Group_1__2__Impl_in_rule__For__Group_1__25513);
            rule__For__Group_1__2__Impl();

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
    // $ANTLR end "rule__For__Group_1__2"


    // $ANTLR start "rule__For__Group_1__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2720:1: rule__For__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__For__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2724:1: ( ( RULE_INT ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2725:1: ( RULE_INT )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2725:1: ( RULE_INT )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2726:1: RULE_INT
            {
             before(grammarAccess.getForAccess().getINTTerminalRuleCall_1_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__For__Group_1__2__Impl5540); 
             after(grammarAccess.getForAccess().getINTTerminalRuleCall_1_2()); 

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
    // $ANTLR end "rule__For__Group_1__2__Impl"


    // $ANTLR start "rule__For__Group_2__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2743:1: rule__For__Group_2__0 : rule__For__Group_2__0__Impl rule__For__Group_2__1 ;
    public final void rule__For__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2747:1: ( rule__For__Group_2__0__Impl rule__For__Group_2__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2748:2: rule__For__Group_2__0__Impl rule__For__Group_2__1
            {
            pushFollow(FOLLOW_rule__For__Group_2__0__Impl_in_rule__For__Group_2__05575);
            rule__For__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group_2__1_in_rule__For__Group_2__05578);
            rule__For__Group_2__1();

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
    // $ANTLR end "rule__For__Group_2__0"


    // $ANTLR start "rule__For__Group_2__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2755:1: rule__For__Group_2__0__Impl : ( ( rule__For__ColorBAssignment_2_0 ) ) ;
    public final void rule__For__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2759:1: ( ( ( rule__For__ColorBAssignment_2_0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2760:1: ( ( rule__For__ColorBAssignment_2_0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2760:1: ( ( rule__For__ColorBAssignment_2_0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2761:1: ( rule__For__ColorBAssignment_2_0 )
            {
             before(grammarAccess.getForAccess().getColorBAssignment_2_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2762:1: ( rule__For__ColorBAssignment_2_0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2762:2: rule__For__ColorBAssignment_2_0
            {
            pushFollow(FOLLOW_rule__For__ColorBAssignment_2_0_in_rule__For__Group_2__0__Impl5605);
            rule__For__ColorBAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getColorBAssignment_2_0()); 

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
    // $ANTLR end "rule__For__Group_2__0__Impl"


    // $ANTLR start "rule__For__Group_2__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2772:1: rule__For__Group_2__1 : rule__For__Group_2__1__Impl rule__For__Group_2__2 ;
    public final void rule__For__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2776:1: ( rule__For__Group_2__1__Impl rule__For__Group_2__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2777:2: rule__For__Group_2__1__Impl rule__For__Group_2__2
            {
            pushFollow(FOLLOW_rule__For__Group_2__1__Impl_in_rule__For__Group_2__15635);
            rule__For__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group_2__2_in_rule__For__Group_2__15638);
            rule__For__Group_2__2();

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
    // $ANTLR end "rule__For__Group_2__1"


    // $ANTLR start "rule__For__Group_2__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2784:1: rule__For__Group_2__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__For__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2788:1: ( ( RULE_LBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2789:1: ( RULE_LBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2789:1: ( RULE_LBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2790:1: RULE_LBRACE
            {
             before(grammarAccess.getForAccess().getLBRACETerminalRuleCall_2_1()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__For__Group_2__1__Impl5665); 
             after(grammarAccess.getForAccess().getLBRACETerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__For__Group_2__1__Impl"


    // $ANTLR start "rule__For__Group_2__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2801:1: rule__For__Group_2__2 : rule__For__Group_2__2__Impl rule__For__Group_2__3 ;
    public final void rule__For__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2805:1: ( rule__For__Group_2__2__Impl rule__For__Group_2__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2806:2: rule__For__Group_2__2__Impl rule__For__Group_2__3
            {
            pushFollow(FOLLOW_rule__For__Group_2__2__Impl_in_rule__For__Group_2__25694);
            rule__For__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group_2__3_in_rule__For__Group_2__25697);
            rule__For__Group_2__3();

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
    // $ANTLR end "rule__For__Group_2__2"


    // $ANTLR start "rule__For__Group_2__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2813:1: rule__For__Group_2__2__Impl : ( ( rule__For__CommandAssignment_2_2 )* ) ;
    public final void rule__For__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2817:1: ( ( ( rule__For__CommandAssignment_2_2 )* ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2818:1: ( ( rule__For__CommandAssignment_2_2 )* )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2818:1: ( ( rule__For__CommandAssignment_2_2 )* )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2819:1: ( rule__For__CommandAssignment_2_2 )*
            {
             before(grammarAccess.getForAccess().getCommandAssignment_2_2()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2820:1: ( rule__For__CommandAssignment_2_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_LPAR||(LA11_0>=25 && LA11_0<=28)||LA11_0==34||(LA11_0>=36 && LA11_0<=41)||(LA11_0>=43 && LA11_0<=44)||LA11_0==47||LA11_0==49) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2820:2: rule__For__CommandAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__For__CommandAssignment_2_2_in_rule__For__Group_2__2__Impl5724);
            	    rule__For__CommandAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getForAccess().getCommandAssignment_2_2()); 

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
    // $ANTLR end "rule__For__Group_2__2__Impl"


    // $ANTLR start "rule__For__Group_2__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2830:1: rule__For__Group_2__3 : rule__For__Group_2__3__Impl ;
    public final void rule__For__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2834:1: ( rule__For__Group_2__3__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2835:2: rule__For__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__For__Group_2__3__Impl_in_rule__For__Group_2__35755);
            rule__For__Group_2__3__Impl();

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
    // $ANTLR end "rule__For__Group_2__3"


    // $ANTLR start "rule__For__Group_2__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2841:1: rule__For__Group_2__3__Impl : ( RULE_RBRACE ) ;
    public final void rule__For__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2845:1: ( ( RULE_RBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2846:1: ( RULE_RBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2846:1: ( RULE_RBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2847:1: RULE_RBRACE
            {
             before(grammarAccess.getForAccess().getRBRACETerminalRuleCall_2_3()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__For__Group_2__3__Impl5782); 
             after(grammarAccess.getForAccess().getRBRACETerminalRuleCall_2_3()); 

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
    // $ANTLR end "rule__For__Group_2__3__Impl"


    // $ANTLR start "rule__If__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2866:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2870:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2871:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05819);
            rule__If__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__05822);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2878:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2882:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2883:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2883:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2884:1: ()
            {
             before(grammarAccess.getIfAccess().getIfAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2885:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2887:1: 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2897:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2901:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2902:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15880);
            rule__If__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__15883);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2909:1: rule__If__Group__1__Impl : ( 'if' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2913:1: ( ( 'if' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2914:1: ( 'if' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2914:1: ( 'if' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2915:1: 'if'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__If__Group__1__Impl5911); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2928:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2932:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2933:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25942);
            rule__If__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__25945);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2940:1: rule__If__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2944:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2945:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2945:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2946:1: RULE_LPAR
            {
             before(grammarAccess.getIfAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__If__Group__2__Impl5972); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2957:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2961:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2962:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__36001);
            rule__If__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__36004);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2969:1: rule__If__Group__3__Impl : ( ( rule__If__ExprAssignment_3 ) ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2973:1: ( ( ( rule__If__ExprAssignment_3 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2974:1: ( ( rule__If__ExprAssignment_3 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2974:1: ( ( rule__If__ExprAssignment_3 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2975:1: ( rule__If__ExprAssignment_3 )
            {
             before(grammarAccess.getIfAccess().getExprAssignment_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2976:1: ( rule__If__ExprAssignment_3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2976:2: rule__If__ExprAssignment_3
            {
            pushFollow(FOLLOW_rule__If__ExprAssignment_3_in_rule__If__Group__3__Impl6031);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2986:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2990:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2991:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__46061);
            rule__If__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__5_in_rule__If__Group__46064);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:2998:1: rule__If__Group__4__Impl : ( RULE_RPAR ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3002:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3003:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3003:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3004:1: RULE_RPAR
            {
             before(grammarAccess.getIfAccess().getRPARTerminalRuleCall_4()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__If__Group__4__Impl6091); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3015:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3019:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3020:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__56120);
            rule__If__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__6_in_rule__If__Group__56123);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3027:1: rule__If__Group__5__Impl : ( RULE_LBRACE ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3031:1: ( ( RULE_LBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3032:1: ( RULE_LBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3032:1: ( RULE_LBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3033:1: RULE_LBRACE
            {
             before(grammarAccess.getIfAccess().getLBRACETerminalRuleCall_5()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__If__Group__5__Impl6150); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3044:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3048:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3049:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__66179);
            rule__If__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__7_in_rule__If__Group__66182);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3056:1: rule__If__Group__6__Impl : ( ( ( rule__If__CommandsThenAssignment_6 ) ) ( ( rule__If__CommandsThenAssignment_6 )* ) ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3060:1: ( ( ( ( rule__If__CommandsThenAssignment_6 ) ) ( ( rule__If__CommandsThenAssignment_6 )* ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3061:1: ( ( ( rule__If__CommandsThenAssignment_6 ) ) ( ( rule__If__CommandsThenAssignment_6 )* ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3061:1: ( ( ( rule__If__CommandsThenAssignment_6 ) ) ( ( rule__If__CommandsThenAssignment_6 )* ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3062:1: ( ( rule__If__CommandsThenAssignment_6 ) ) ( ( rule__If__CommandsThenAssignment_6 )* )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3062:1: ( ( rule__If__CommandsThenAssignment_6 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3063:1: ( rule__If__CommandsThenAssignment_6 )
            {
             before(grammarAccess.getIfAccess().getCommandsThenAssignment_6()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3064:1: ( rule__If__CommandsThenAssignment_6 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3064:2: rule__If__CommandsThenAssignment_6
            {
            pushFollow(FOLLOW_rule__If__CommandsThenAssignment_6_in_rule__If__Group__6__Impl6211);
            rule__If__CommandsThenAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getCommandsThenAssignment_6()); 

            }

            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3067:1: ( ( rule__If__CommandsThenAssignment_6 )* )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3068:1: ( rule__If__CommandsThenAssignment_6 )*
            {
             before(grammarAccess.getIfAccess().getCommandsThenAssignment_6()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3069:1: ( rule__If__CommandsThenAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_LPAR||(LA12_0>=25 && LA12_0<=28)||LA12_0==34||(LA12_0>=36 && LA12_0<=41)||(LA12_0>=43 && LA12_0<=44)||LA12_0==47||LA12_0==49) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3069:2: rule__If__CommandsThenAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__If__CommandsThenAssignment_6_in_rule__If__Group__6__Impl6223);
            	    rule__If__CommandsThenAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3080:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3084:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3085:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__76256);
            rule__If__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__8_in_rule__If__Group__76259);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3092:1: rule__If__Group__7__Impl : ( RULE_RBRACE ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3096:1: ( ( RULE_RBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3097:1: ( RULE_RBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3097:1: ( RULE_RBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3098:1: RULE_RBRACE
            {
             before(grammarAccess.getIfAccess().getRBRACETerminalRuleCall_7()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__If__Group__7__Impl6286); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3109:1: rule__If__Group__8 : rule__If__Group__8__Impl ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3113:1: ( rule__If__Group__8__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3114:2: rule__If__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__86315);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3120:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3124:1: ( ( ( rule__If__Group_8__0 )? ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3125:1: ( ( rule__If__Group_8__0 )? )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3125:1: ( ( rule__If__Group_8__0 )? )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3126:1: ( rule__If__Group_8__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_8()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3127:1: ( rule__If__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3127:2: rule__If__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl6342);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3155:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3159:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3160:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
            {
            pushFollow(FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__06391);
            rule__If__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__06394);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3167:1: rule__If__Group_8__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3171:1: ( ( 'else' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3172:1: ( 'else' )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3172:1: ( 'else' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3173:1: 'else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            match(input,48,FOLLOW_48_in_rule__If__Group_8__0__Impl6422); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3186:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl rule__If__Group_8__2 ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3190:1: ( rule__If__Group_8__1__Impl rule__If__Group_8__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3191:2: rule__If__Group_8__1__Impl rule__If__Group_8__2
            {
            pushFollow(FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__16453);
            rule__If__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__16456);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3198:1: rule__If__Group_8__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3202:1: ( ( RULE_LBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3203:1: ( RULE_LBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3203:1: ( RULE_LBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3204:1: RULE_LBRACE
            {
             before(grammarAccess.getIfAccess().getLBRACETerminalRuleCall_8_1()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__If__Group_8__1__Impl6483); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3215:1: rule__If__Group_8__2 : rule__If__Group_8__2__Impl rule__If__Group_8__3 ;
    public final void rule__If__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3219:1: ( rule__If__Group_8__2__Impl rule__If__Group_8__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3220:2: rule__If__Group_8__2__Impl rule__If__Group_8__3
            {
            pushFollow(FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__26512);
            rule__If__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__26515);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3227:1: rule__If__Group_8__2__Impl : ( ( ( rule__If__CommandsElseAssignment_8_2 ) ) ( ( rule__If__CommandsElseAssignment_8_2 )* ) ) ;
    public final void rule__If__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3231:1: ( ( ( ( rule__If__CommandsElseAssignment_8_2 ) ) ( ( rule__If__CommandsElseAssignment_8_2 )* ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3232:1: ( ( ( rule__If__CommandsElseAssignment_8_2 ) ) ( ( rule__If__CommandsElseAssignment_8_2 )* ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3232:1: ( ( ( rule__If__CommandsElseAssignment_8_2 ) ) ( ( rule__If__CommandsElseAssignment_8_2 )* ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3233:1: ( ( rule__If__CommandsElseAssignment_8_2 ) ) ( ( rule__If__CommandsElseAssignment_8_2 )* )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3233:1: ( ( rule__If__CommandsElseAssignment_8_2 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3234:1: ( rule__If__CommandsElseAssignment_8_2 )
            {
             before(grammarAccess.getIfAccess().getCommandsElseAssignment_8_2()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3235:1: ( rule__If__CommandsElseAssignment_8_2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3235:2: rule__If__CommandsElseAssignment_8_2
            {
            pushFollow(FOLLOW_rule__If__CommandsElseAssignment_8_2_in_rule__If__Group_8__2__Impl6544);
            rule__If__CommandsElseAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getCommandsElseAssignment_8_2()); 

            }

            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3238:1: ( ( rule__If__CommandsElseAssignment_8_2 )* )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3239:1: ( rule__If__CommandsElseAssignment_8_2 )*
            {
             before(grammarAccess.getIfAccess().getCommandsElseAssignment_8_2()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3240:1: ( rule__If__CommandsElseAssignment_8_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_LPAR||(LA14_0>=25 && LA14_0<=28)||LA14_0==34||(LA14_0>=36 && LA14_0<=41)||(LA14_0>=43 && LA14_0<=44)||LA14_0==47||LA14_0==49) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3240:2: rule__If__CommandsElseAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__If__CommandsElseAssignment_8_2_in_rule__If__Group_8__2__Impl6556);
            	    rule__If__CommandsElseAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3251:1: rule__If__Group_8__3 : rule__If__Group_8__3__Impl ;
    public final void rule__If__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3255:1: ( rule__If__Group_8__3__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3256:2: rule__If__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__36589);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3262:1: rule__If__Group_8__3__Impl : ( RULE_RBRACE ) ;
    public final void rule__If__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3266:1: ( ( RULE_RBRACE ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3267:1: ( RULE_RBRACE )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3267:1: ( RULE_RBRACE )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3268:1: RULE_RBRACE
            {
             before(grammarAccess.getIfAccess().getRBRACETerminalRuleCall_8_3()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__If__Group_8__3__Impl6616); 
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


    // $ANTLR start "rule__Expression__Group__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3287:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3291:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3292:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__06653);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__06656);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3299:1: rule__Expression__Group__0__Impl : ( () ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3303:1: ( ( () ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3304:1: ( () )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3304:1: ( () )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3305:1: ()
            {
             before(grammarAccess.getExpressionAccess().getOperatorAction_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3306:1: ()
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3308:1: 
            {
            }

             after(grammarAccess.getExpressionAccess().getOperatorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3318:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3322:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3323:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__16714);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__16717);
            rule__Expression__Group__2();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3330:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__OpNotAssignment_1 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3334:1: ( ( ( rule__Expression__OpNotAssignment_1 )? ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3335:1: ( ( rule__Expression__OpNotAssignment_1 )? )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3335:1: ( ( rule__Expression__OpNotAssignment_1 )? )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3336:1: ( rule__Expression__OpNotAssignment_1 )?
            {
             before(grammarAccess.getExpressionAccess().getOpNotAssignment_1()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3337:1: ( rule__Expression__OpNotAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==49) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3337:2: rule__Expression__OpNotAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expression__OpNotAssignment_1_in_rule__Expression__Group__1__Impl6744);
                    rule__Expression__OpNotAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getOpNotAssignment_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3347:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl rule__Expression__Group__3 ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3351:1: ( rule__Expression__Group__2__Impl rule__Expression__Group__3 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3352:2: rule__Expression__Group__2__Impl rule__Expression__Group__3
            {
            pushFollow(FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__26775);
            rule__Expression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__3_in_rule__Expression__Group__26778);
            rule__Expression__Group__3();

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
    // $ANTLR end "rule__Expression__Group__2"


    // $ANTLR start "rule__Expression__Group__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3359:1: rule__Expression__Group__2__Impl : ( ( rule__Expression__LeftAssignment_2 ) ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3363:1: ( ( ( rule__Expression__LeftAssignment_2 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3364:1: ( ( rule__Expression__LeftAssignment_2 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3364:1: ( ( rule__Expression__LeftAssignment_2 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3365:1: ( rule__Expression__LeftAssignment_2 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_2()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3366:1: ( rule__Expression__LeftAssignment_2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3366:2: rule__Expression__LeftAssignment_2
            {
            pushFollow(FOLLOW_rule__Expression__LeftAssignment_2_in_rule__Expression__Group__2__Impl6805);
            rule__Expression__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getLeftAssignment_2()); 

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
    // $ANTLR end "rule__Expression__Group__2__Impl"


    // $ANTLR start "rule__Expression__Group__3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3376:1: rule__Expression__Group__3 : rule__Expression__Group__3__Impl ;
    public final void rule__Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3380:1: ( rule__Expression__Group__3__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3381:2: rule__Expression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__3__Impl_in_rule__Expression__Group__36835);
            rule__Expression__Group__3__Impl();

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
    // $ANTLR end "rule__Expression__Group__3"


    // $ANTLR start "rule__Expression__Group__3__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3387:1: rule__Expression__Group__3__Impl : ( ( rule__Expression__Group_3__0 )? ) ;
    public final void rule__Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3391:1: ( ( ( rule__Expression__Group_3__0 )? ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3392:1: ( ( rule__Expression__Group_3__0 )? )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3392:1: ( ( rule__Expression__Group_3__0 )? )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3393:1: ( rule__Expression__Group_3__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_3()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3394:1: ( rule__Expression__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=15 && LA16_0<=24)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3394:2: rule__Expression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_3__0_in_rule__Expression__Group__3__Impl6862);
                    rule__Expression__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Expression__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group_3__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3412:1: rule__Expression__Group_3__0 : rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 ;
    public final void rule__Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3416:1: ( rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3417:2: rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_3__0__Impl_in_rule__Expression__Group_3__06901);
            rule__Expression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_3__1_in_rule__Expression__Group_3__06904);
            rule__Expression__Group_3__1();

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
    // $ANTLR end "rule__Expression__Group_3__0"


    // $ANTLR start "rule__Expression__Group_3__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3424:1: rule__Expression__Group_3__0__Impl : ( ( rule__Expression__OpAssignment_3_0 ) ) ;
    public final void rule__Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3428:1: ( ( ( rule__Expression__OpAssignment_3_0 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3429:1: ( ( rule__Expression__OpAssignment_3_0 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3429:1: ( ( rule__Expression__OpAssignment_3_0 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3430:1: ( rule__Expression__OpAssignment_3_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_3_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3431:1: ( rule__Expression__OpAssignment_3_0 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3431:2: rule__Expression__OpAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Expression__OpAssignment_3_0_in_rule__Expression__Group_3__0__Impl6931);
            rule__Expression__OpAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOpAssignment_3_0()); 

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
    // $ANTLR end "rule__Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Expression__Group_3__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3441:1: rule__Expression__Group_3__1 : rule__Expression__Group_3__1__Impl ;
    public final void rule__Expression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3445:1: ( rule__Expression__Group_3__1__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3446:2: rule__Expression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_3__1__Impl_in_rule__Expression__Group_3__16961);
            rule__Expression__Group_3__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_3__1"


    // $ANTLR start "rule__Expression__Group_3__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3452:1: rule__Expression__Group_3__1__Impl : ( ( rule__Expression__RightAssignment_3_1 ) ) ;
    public final void rule__Expression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3456:1: ( ( ( rule__Expression__RightAssignment_3_1 ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3457:1: ( ( rule__Expression__RightAssignment_3_1 ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3457:1: ( ( rule__Expression__RightAssignment_3_1 ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3458:1: ( rule__Expression__RightAssignment_3_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_3_1()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3459:1: ( rule__Expression__RightAssignment_3_1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3459:2: rule__Expression__RightAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_3_1_in_rule__Expression__Group_3__1__Impl6988);
            rule__Expression__RightAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_3_1()); 

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
    // $ANTLR end "rule__Expression__Group_3__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3473:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3477:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3478:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__07022);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__07025);
            rule__TerminalExpression__Group_0__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_0__0"


    // $ANTLR start "rule__TerminalExpression__Group_0__0__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3485:1: rule__TerminalExpression__Group_0__0__Impl : ( RULE_LPAR ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3489:1: ( ( RULE_LPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3490:1: ( RULE_LPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3490:1: ( RULE_LPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3491:1: RULE_LPAR
            {
             before(grammarAccess.getTerminalExpressionAccess().getLPARTerminalRuleCall_0_0()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__TerminalExpression__Group_0__0__Impl7052); 
             after(grammarAccess.getTerminalExpressionAccess().getLPARTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3502:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3506:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3507:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__17081);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__17084);
            rule__TerminalExpression__Group_0__2();

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
    // $ANTLR end "rule__TerminalExpression__Group_0__1"


    // $ANTLR start "rule__TerminalExpression__Group_0__1__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3514:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3518:1: ( ( ruleExpression ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3519:1: ( ruleExpression )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3519:1: ( ruleExpression )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3520:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl7111);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3531:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3535:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3536:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__27140);
            rule__TerminalExpression__Group_0__2__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_0__2"


    // $ANTLR start "rule__TerminalExpression__Group_0__2__Impl"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3542:1: rule__TerminalExpression__Group_0__2__Impl : ( RULE_RPAR ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3546:1: ( ( RULE_RPAR ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3547:1: ( RULE_RPAR )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3547:1: ( RULE_RPAR )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3548:1: RULE_RPAR
            {
             before(grammarAccess.getTerminalExpressionAccess().getRPARTerminalRuleCall_0_2()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__TerminalExpression__Group_0__2__Impl7167); 
             after(grammarAccess.getTerminalExpressionAccess().getRPARTerminalRuleCall_0_2()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_0__2__Impl"


    // $ANTLR start "rule__Model__MainAssignment"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3566:1: rule__Model__MainAssignment : ( ruleProcedure ) ;
    public final void rule__Model__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3570:1: ( ( ruleProcedure ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3571:1: ( ruleProcedure )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3571:1: ( ruleProcedure )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3572:1: ruleProcedure
            {
             before(grammarAccess.getModelAccess().getMainProcedureParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleProcedure_in_rule__Model__MainAssignment7207);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3581:1: rule__Procedure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3585:1: ( ( RULE_ID ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3586:1: ( RULE_ID )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3586:1: ( RULE_ID )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3587:1: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_17238); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3596:1: rule__Procedure__CommandsAssignment_3 : ( ruleCommand ) ;
    public final void rule__Procedure__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3600:1: ( ( ruleCommand ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3601:1: ( ruleCommand )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3601:1: ( ruleCommand )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3602:1: ruleCommand
            {
             before(grammarAccess.getProcedureAccess().getCommandsCommandParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__Procedure__CommandsAssignment_37269);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3611:1: rule__PonerN__IntAssignment_3 : ( RULE_INT ) ;
    public final void rule__PonerN__IntAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3615:1: ( ( RULE_INT ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3616:1: ( RULE_INT )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3616:1: ( RULE_INT )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3617:1: RULE_INT
            {
             before(grammarAccess.getPonerNAccess().getIntINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PonerN__IntAssignment_37300); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3626:1: rule__PonerN__ColorAssignment_5 : ( ruleColor ) ;
    public final void rule__PonerN__ColorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3630:1: ( ( ruleColor ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3631:1: ( ruleColor )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3631:1: ( ruleColor )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3632:1: ruleColor
            {
             before(grammarAccess.getPonerNAccess().getColorColorEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__PonerN__ColorAssignment_57331);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3641:1: rule__MoverN__IntAssignment_3 : ( RULE_INT ) ;
    public final void rule__MoverN__IntAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3645:1: ( ( RULE_INT ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3646:1: ( RULE_INT )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3646:1: ( RULE_INT )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3647:1: RULE_INT
            {
             before(grammarAccess.getMoverNAccess().getIntINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MoverN__IntAssignment_37362); 
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3656:1: rule__MoverN__DirAssignment_5 : ( ruleDireccion ) ;
    public final void rule__MoverN__DirAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3660:1: ( ( ruleDireccion ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3661:1: ( ruleDireccion )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3661:1: ( ruleDireccion )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3662:1: ruleDireccion
            {
             before(grammarAccess.getMoverNAccess().getDirDireccionEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDireccion_in_rule__MoverN__DirAssignment_57393);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3671:1: rule__Poner__ColorAssignment_3 : ( ruleColor ) ;
    public final void rule__Poner__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3675:1: ( ( ruleColor ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3676:1: ( ruleColor )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3676:1: ( ruleColor )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3677:1: ruleColor
            {
             before(grammarAccess.getPonerAccess().getColorColorEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__Poner__ColorAssignment_37424);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3686:1: rule__Mover__DirAssignment_3 : ( ruleDireccion ) ;
    public final void rule__Mover__DirAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3690:1: ( ( ruleDireccion ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3691:1: ( ruleDireccion )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3691:1: ( ruleDireccion )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3692:1: ruleDireccion
            {
             before(grammarAccess.getMoverAccess().getDirDireccionEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDireccion_in_rule__Mover__DirAssignment_37455);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3701:1: rule__HayBolitas__ColorAssignment_2 : ( ruleColor ) ;
    public final void rule__HayBolitas__ColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3705:1: ( ( ruleColor ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3706:1: ( ruleColor )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3706:1: ( ruleColor )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3707:1: ruleColor
            {
             before(grammarAccess.getHayBolitasAccess().getColorColorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__HayBolitas__ColorAssignment_27486);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3716:1: rule__PuedeMover__DirAssignment_2 : ( ruleDireccion ) ;
    public final void rule__PuedeMover__DirAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3720:1: ( ( ruleDireccion ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3721:1: ( ruleDireccion )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3721:1: ( ruleDireccion )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3722:1: ruleDireccion
            {
             before(grammarAccess.getPuedeMoverAccess().getDirDireccionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDireccion_in_rule__PuedeMover__DirAssignment_27517);
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


    // $ANTLR start "rule__Variable__VarNameAssignment_0_2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3731:1: rule__Variable__VarNameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Variable__VarNameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3735:1: ( ( RULE_ID ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3736:1: ( RULE_ID )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3736:1: ( RULE_ID )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3737:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getVarNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__VarNameAssignment_0_27548); 
             after(grammarAccess.getVariableAccess().getVarNameIDTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Variable__VarNameAssignment_0_2"


    // $ANTLR start "rule__While__ExprAssignment_3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3746:1: rule__While__ExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__While__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3750:1: ( ( ruleExpression ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3751:1: ( ruleExpression )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3751:1: ( ruleExpression )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3752:1: ruleExpression
            {
             before(grammarAccess.getWhileAccess().getExprExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__While__ExprAssignment_37579);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getExprExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__While__ExprAssignment_3"


    // $ANTLR start "rule__While__CommandsAssignment_6"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3761:1: rule__While__CommandsAssignment_6 : ( ruleCommand ) ;
    public final void rule__While__CommandsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3765:1: ( ( ruleCommand ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3766:1: ( ruleCommand )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3766:1: ( ruleCommand )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3767:1: ruleCommand
            {
             before(grammarAccess.getWhileAccess().getCommandsCommandParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__While__CommandsAssignment_67610);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getCommandsCommandParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__While__CommandsAssignment_6"


    // $ANTLR start "rule__For__VarNameAssignment_0_2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3776:1: rule__For__VarNameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__For__VarNameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3780:1: ( ( RULE_ID ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3781:1: ( RULE_ID )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3781:1: ( RULE_ID )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3782:1: RULE_ID
            {
             before(grammarAccess.getForAccess().getVarNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__For__VarNameAssignment_0_27641); 
             after(grammarAccess.getForAccess().getVarNameIDTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__For__VarNameAssignment_0_2"


    // $ANTLR start "rule__For__ColorAAssignment_1_0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3791:1: rule__For__ColorAAssignment_1_0 : ( ruleColor ) ;
    public final void rule__For__ColorAAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3795:1: ( ( ruleColor ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3796:1: ( ruleColor )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3796:1: ( ruleColor )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3797:1: ruleColor
            {
             before(grammarAccess.getForAccess().getColorAColorEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__For__ColorAAssignment_1_07672);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getForAccess().getColorAColorEnumRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__For__ColorAAssignment_1_0"


    // $ANTLR start "rule__For__ColorBAssignment_2_0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3806:1: rule__For__ColorBAssignment_2_0 : ( ruleColor ) ;
    public final void rule__For__ColorBAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3810:1: ( ( ruleColor ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3811:1: ( ruleColor )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3811:1: ( ruleColor )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3812:1: ruleColor
            {
             before(grammarAccess.getForAccess().getColorBColorEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__For__ColorBAssignment_2_07703);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getForAccess().getColorBColorEnumRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__For__ColorBAssignment_2_0"


    // $ANTLR start "rule__For__CommandAssignment_2_2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3821:1: rule__For__CommandAssignment_2_2 : ( ruleCommand ) ;
    public final void rule__For__CommandAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3825:1: ( ( ruleCommand ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3826:1: ( ruleCommand )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3826:1: ( ruleCommand )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3827:1: ruleCommand
            {
             before(grammarAccess.getForAccess().getCommandCommandParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__For__CommandAssignment_2_27734);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getForAccess().getCommandCommandParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__For__CommandAssignment_2_2"


    // $ANTLR start "rule__If__ExprAssignment_3"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3836:1: rule__If__ExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__If__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3840:1: ( ( ruleExpression ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3841:1: ( ruleExpression )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3841:1: ( ruleExpression )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3842:1: ruleExpression
            {
             before(grammarAccess.getIfAccess().getExprExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__If__ExprAssignment_37765);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfAccess().getExprExpressionParserRuleCall_3_0()); 

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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3851:1: rule__If__CommandsThenAssignment_6 : ( ruleCommand ) ;
    public final void rule__If__CommandsThenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3855:1: ( ( ruleCommand ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3856:1: ( ruleCommand )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3856:1: ( ruleCommand )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3857:1: ruleCommand
            {
             before(grammarAccess.getIfAccess().getCommandsThenCommandParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__If__CommandsThenAssignment_67796);
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
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3866:1: rule__If__CommandsElseAssignment_8_2 : ( ruleCommand ) ;
    public final void rule__If__CommandsElseAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3870:1: ( ( ruleCommand ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3871:1: ( ruleCommand )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3871:1: ( ruleCommand )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3872:1: ruleCommand
            {
             before(grammarAccess.getIfAccess().getCommandsElseCommandParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__If__CommandsElseAssignment_8_27827);
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


    // $ANTLR start "rule__Expression__OpNotAssignment_1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3881:1: rule__Expression__OpNotAssignment_1 : ( ( '!' ) ) ;
    public final void rule__Expression__OpNotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3885:1: ( ( ( '!' ) ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3886:1: ( ( '!' ) )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3886:1: ( ( '!' ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3887:1: ( '!' )
            {
             before(grammarAccess.getExpressionAccess().getOpNotExclamationMarkKeyword_1_0()); 
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3888:1: ( '!' )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3889:1: '!'
            {
             before(grammarAccess.getExpressionAccess().getOpNotExclamationMarkKeyword_1_0()); 
            match(input,49,FOLLOW_49_in_rule__Expression__OpNotAssignment_17863); 
             after(grammarAccess.getExpressionAccess().getOpNotExclamationMarkKeyword_1_0()); 

            }

             after(grammarAccess.getExpressionAccess().getOpNotExclamationMarkKeyword_1_0()); 

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
    // $ANTLR end "rule__Expression__OpNotAssignment_1"


    // $ANTLR start "rule__Expression__LeftAssignment_2"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3904:1: rule__Expression__LeftAssignment_2 : ( ruleTerminalExpression ) ;
    public final void rule__Expression__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3908:1: ( ( ruleTerminalExpression ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3909:1: ( ruleTerminalExpression )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3909:1: ( ruleTerminalExpression )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3910:1: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getLeftTerminalExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__Expression__LeftAssignment_27902);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLeftTerminalExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Expression__LeftAssignment_2"


    // $ANTLR start "rule__Expression__OpAssignment_3_0"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3919:1: rule__Expression__OpAssignment_3_0 : ( ruleOperator ) ;
    public final void rule__Expression__OpAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3923:1: ( ( ruleOperator ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3924:1: ( ruleOperator )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3924:1: ( ruleOperator )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3925:1: ruleOperator
            {
             before(grammarAccess.getExpressionAccess().getOpOperatorParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__Expression__OpAssignment_3_07933);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOpOperatorParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Expression__OpAssignment_3_0"


    // $ANTLR start "rule__Expression__RightAssignment_3_1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3934:1: rule__Expression__RightAssignment_3_1 : ( ruleTerminalExpression ) ;
    public final void rule__Expression__RightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3938:1: ( ( ruleTerminalExpression ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3939:1: ( ruleTerminalExpression )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3939:1: ( ruleTerminalExpression )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3940:1: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__Expression__RightAssignment_3_17964);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Expression__RightAssignment_3_1"


    // $ANTLR start "rule__TerminalExpression__ExprAssignment_1"
    // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3949:1: rule__TerminalExpression__ExprAssignment_1 : ( ruleBooleans ) ;
    public final void rule__TerminalExpression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3953:1: ( ( ruleBooleans ) )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3954:1: ( ruleBooleans )
            {
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3954:1: ( ruleBooleans )
            // ../miniGobstones.ui/src-gen/org/ui/contentassist/antlr/internal/InternalMiniGobstones.g:3955:1: ruleBooleans
            {
             before(grammarAccess.getTerminalExpressionAccess().getExprBooleansParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBooleans_in_rule__TerminalExpression__ExprAssignment_17995);
            ruleBooleans();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getExprBooleansParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TerminalExpression__ExprAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA1_eotS =
        "\27\uffff";
    static final String DFA1_eofS =
        "\27\uffff";
    static final String DFA1_minS =
        "\1\6\4\uffff\2\6\4\uffff\1\31\1\35\10\7\2\uffff";
    static final String DFA1_maxS =
        "\1\61\4\uffff\2\6\4\uffff\1\34\1\40\10\7\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\7\1\10\1\11\1\12\12\uffff\1\5"+
        "\1\6";
    static final String DFA1_specialS =
        "\27\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\12\22\uffff\4\11\5\uffff\1\3\1\uffff\1\4\1\1\1\2\1\5\1\6"+
            "\1\12\1\uffff\1\10\1\11\2\uffff\1\7\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "\1\13",
            "\1\14",
            "",
            "",
            "",
            "",
            "\1\15\1\16\1\17\1\20",
            "\1\21\1\22\1\23\1\24",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "574:1: rule__Command__Alternatives : ( ( rulePoner ) | ( ruleMover ) | ( rulePonerN ) | ( ruleMoverN ) | ( ruleHayBolitas ) | ( rulePuedeMover ) | ( ruleIf ) | ( ruleWhile ) | ( ruleFor ) | ( ruleVariable ) );";
        }
    }
    static final String DFA2_eotS =
        "\21\uffff";
    static final String DFA2_eofS =
        "\21\uffff";
    static final String DFA2_minS =
        "\1\6\1\uffff\2\6\1\uffff\1\31\1\35\10\7\2\uffff";
    static final String DFA2_maxS =
        "\1\61\1\uffff\2\6\1\uffff\1\34\1\40\10\7\2\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\12\uffff\2\2";
    static final String DFA2_specialS =
        "\21\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\40\uffff\1\2\1\3\1\1\7\uffff\1\4",
            "",
            "\1\5",
            "\1\6",
            "",
            "\1\7\1\10\1\11\1\12",
            "\1\13\1\14\1\15\1\16",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "644:1: rule__Variable__Alternatives : ( ( ( rule__Variable__Group_0__0 ) ) | ( ruleBooleans ) | ( ruleExpression ) );";
        }
    }
 

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
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Alternatives_in_ruleVariable634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0_in_ruleWhile694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Alternatives_in_ruleFor754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0_in_ruleIf814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleans_in_entryRuleBooleans961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleans968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Booleans__Alternatives_in_ruleBooleans994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Alternatives_in_ruleColor1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direccion__Alternatives_in_ruleDireccion1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_rule__Command__Alternatives1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_rule__Command__Alternatives1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePonerN_in_rule__Command__Alternatives1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoverN_in_rule__Command__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_rule__Command__Alternatives1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePuedeMover_in_rule__Command__Alternatives1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__Command__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__Command__Alternatives1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__Command__Alternatives1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Command__Alternatives1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_0__0_in_rule__Variable__Alternatives1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleans_in_rule__Variable__Alternatives1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Variable__Alternatives1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_0__0_in_rule__For__Alternatives1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_1__0_in_rule__For__Alternatives1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_2__0_in_rule__For__Alternatives1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ExprAssignment_1_in_rule__TerminalExpression__Alternatives1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_rule__Booleans__Alternatives1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePuedeMover_in_rule__Booleans__Alternatives1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Operator__Alternatives1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Operator__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Operator__Alternatives1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Operator__Alternatives1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Operator__Alternatives1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Operator__Alternatives1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Operator__Alternatives1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Operator__Alternatives1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Operator__Alternatives1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operator__Alternatives1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Color__Alternatives1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Color__Alternatives1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Color__Alternatives1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Color__Alternatives1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Direccion__Alternatives1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Direccion__Alternatives1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Direccion__Alternatives1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Direccion__Alternatives1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__01994 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__01997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Procedure__Group__0__Impl2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22116 = new BitSet(new long[]{0x00029BF41E000060L});
    public static final BitSet FOLLOW_rule__Procedure__Group__3_in_rule__Procedure__Group__22119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__Procedure__Group__2__Impl2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__3__Impl_in_rule__Procedure__Group__32175 = new BitSet(new long[]{0x00029BF41E000060L});
    public static final BitSet FOLLOW_rule__Procedure__Group__4_in_rule__Procedure__Group__32178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__CommandsAssignment_3_in_rule__Procedure__Group__3__Impl2205 = new BitSet(new long[]{0x00029BF41E000042L});
    public static final BitSet FOLLOW_rule__Procedure__Group__4__Impl_in_rule__Procedure__Group__42236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__Procedure__Group__4__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__0__Impl_in_rule__PonerN__Group__02302 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__PonerN__Group__1_in_rule__PonerN__Group__02305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__1__Impl_in_rule__PonerN__Group__12363 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PonerN__Group__2_in_rule__PonerN__Group__12366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PonerN__Group__1__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__2__Impl_in_rule__PonerN__Group__22425 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PonerN__Group__3_in_rule__PonerN__Group__22428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__PonerN__Group__2__Impl2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__3__Impl_in_rule__PonerN__Group__32484 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__PonerN__Group__4_in_rule__PonerN__Group__32487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__IntAssignment_3_in_rule__PonerN__Group__3__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__4__Impl_in_rule__PonerN__Group__42544 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__PonerN__Group__5_in_rule__PonerN__Group__42547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PonerN__Group__4__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__5__Impl_in_rule__PonerN__Group__52606 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PonerN__Group__6_in_rule__PonerN__Group__52609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__ColorAssignment_5_in_rule__PonerN__Group__5__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PonerN__Group__6__Impl_in_rule__PonerN__Group__62666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__PonerN__Group__6__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__0__Impl_in_rule__MoverN__Group__02736 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__MoverN__Group__1_in_rule__MoverN__Group__02739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__1__Impl_in_rule__MoverN__Group__12797 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MoverN__Group__2_in_rule__MoverN__Group__12800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__MoverN__Group__1__Impl2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__2__Impl_in_rule__MoverN__Group__22859 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__MoverN__Group__3_in_rule__MoverN__Group__22862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__MoverN__Group__2__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__3__Impl_in_rule__MoverN__Group__32918 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__MoverN__Group__4_in_rule__MoverN__Group__32921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__IntAssignment_3_in_rule__MoverN__Group__3__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__4__Impl_in_rule__MoverN__Group__42978 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_rule__MoverN__Group__5_in_rule__MoverN__Group__42981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MoverN__Group__4__Impl3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__5__Impl_in_rule__MoverN__Group__53040 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__MoverN__Group__6_in_rule__MoverN__Group__53043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__DirAssignment_5_in_rule__MoverN__Group__5__Impl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoverN__Group__6__Impl_in_rule__MoverN__Group__63100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__MoverN__Group__6__Impl3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__0__Impl_in_rule__Poner__Group__03170 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Poner__Group__1_in_rule__Poner__Group__03173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__1__Impl_in_rule__Poner__Group__13231 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Poner__Group__2_in_rule__Poner__Group__13234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Poner__Group__1__Impl3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__2__Impl_in_rule__Poner__Group__23293 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__Poner__Group__3_in_rule__Poner__Group__23296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__Poner__Group__2__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__3__Impl_in_rule__Poner__Group__33352 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Poner__Group__4_in_rule__Poner__Group__33355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__ColorAssignment_3_in_rule__Poner__Group__3__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Poner__Group__4__Impl_in_rule__Poner__Group__43412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__Poner__Group__4__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__0__Impl_in_rule__Mover__Group__03478 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Mover__Group__1_in_rule__Mover__Group__03481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__1__Impl_in_rule__Mover__Group__13539 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Mover__Group__2_in_rule__Mover__Group__13542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Mover__Group__1__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__2__Impl_in_rule__Mover__Group__23601 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_rule__Mover__Group__3_in_rule__Mover__Group__23604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__Mover__Group__2__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__3__Impl_in_rule__Mover__Group__33660 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Mover__Group__4_in_rule__Mover__Group__33663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__DirAssignment_3_in_rule__Mover__Group__3__Impl3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mover__Group__4__Impl_in_rule__Mover__Group__43720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__Mover__Group__4__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__0__Impl_in_rule__HayBolitas__Group__03786 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__1_in_rule__HayBolitas__Group__03789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__HayBolitas__Group__0__Impl3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__1__Impl_in_rule__HayBolitas__Group__13848 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__2_in_rule__HayBolitas__Group__13851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__HayBolitas__Group__1__Impl3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__2__Impl_in_rule__HayBolitas__Group__23907 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__3_in_rule__HayBolitas__Group__23910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__ColorAssignment_2_in_rule__HayBolitas__Group__2__Impl3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HayBolitas__Group__3__Impl_in_rule__HayBolitas__Group__33967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__HayBolitas__Group__3__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__0__Impl_in_rule__PuedeMover__Group__04031 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__1_in_rule__PuedeMover__Group__04034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__PuedeMover__Group__0__Impl4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__1__Impl_in_rule__PuedeMover__Group__14093 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__2_in_rule__PuedeMover__Group__14096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__PuedeMover__Group__1__Impl4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__2__Impl_in_rule__PuedeMover__Group__24152 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__3_in_rule__PuedeMover__Group__24155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuedeMover__DirAssignment_2_in_rule__PuedeMover__Group__2__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PuedeMover__Group__3__Impl_in_rule__PuedeMover__Group__34212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__PuedeMover__Group__3__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_0__0__Impl_in_rule__Variable__Group_0__04276 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_0__1_in_rule__Variable__Group_0__04279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_0__1__Impl_in_rule__Variable__Group_0__14337 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Variable__Group_0__2_in_rule__Variable__Group_0__14340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Variable__Group_0__1__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_0__2__Impl_in_rule__Variable__Group_0__24399 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_0__3_in_rule__Variable__Group_0__24402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__VarNameAssignment_0_2_in_rule__Variable__Group_0__2__Impl4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_0__3__Impl_in_rule__Variable__Group_0__34459 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Variable__Group_0__4_in_rule__Variable__Group_0__34462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Variable__Group_0__3__Impl4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_0__4__Impl_in_rule__Variable__Group_0__44521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Variable__Group_0__4__Impl4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04587 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__04590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14648 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__14651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__While__Group__1__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24710 = new BitSet(new long[]{0x00029BF41E000040L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__24713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__While__Group__2__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34769 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__34772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__ExprAssignment_3_in_rule__While__Group__3__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__While__Group__5_in_rule__While__Group__44832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__While__Group__4__Impl4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__54888 = new BitSet(new long[]{0x00029BF41E000060L});
    public static final BitSet FOLLOW_rule__While__Group__6_in_rule__While__Group__54891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__While__Group__5__Impl4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__64947 = new BitSet(new long[]{0x00029BF41E000060L});
    public static final BitSet FOLLOW_rule__While__Group__7_in_rule__While__Group__64950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__CommandsAssignment_6_in_rule__While__Group__6__Impl4977 = new BitSet(new long[]{0x00029BF41E000042L});
    public static final BitSet FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__75008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__While__Group__7__Impl5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_0__0__Impl_in_rule__For__Group_0__05080 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__For__Group_0__1_in_rule__For__Group_0__05083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_0__1__Impl_in_rule__For__Group_0__15141 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__For__Group_0__2_in_rule__For__Group_0__15144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__For__Group_0__1__Impl5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_0__2__Impl_in_rule__For__Group_0__25203 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__For__Group_0__3_in_rule__For__Group_0__25206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__VarNameAssignment_0_2_in_rule__For__Group_0__2__Impl5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_0__3__Impl_in_rule__For__Group_0__35263 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__For__Group_0__4_in_rule__For__Group_0__35266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__For__Group_0__3__Impl5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_0__4__Impl_in_rule__For__Group_0__45325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__For__Group_0__4__Impl5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_1__0__Impl_in_rule__For__Group_1__05391 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__For__Group_1__1_in_rule__For__Group_1__05394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__ColorAAssignment_1_0_in_rule__For__Group_1__0__Impl5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_1__1__Impl_in_rule__For__Group_1__15451 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__For__Group_1__2_in_rule__For__Group_1__15454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__For__Group_1__1__Impl5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_1__2__Impl_in_rule__For__Group_1__25513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__For__Group_1__2__Impl5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_2__0__Impl_in_rule__For__Group_2__05575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__For__Group_2__1_in_rule__For__Group_2__05578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__ColorBAssignment_2_0_in_rule__For__Group_2__0__Impl5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_2__1__Impl_in_rule__For__Group_2__15635 = new BitSet(new long[]{0x00029BF41E000060L});
    public static final BitSet FOLLOW_rule__For__Group_2__2_in_rule__For__Group_2__15638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__For__Group_2__1__Impl5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group_2__2__Impl_in_rule__For__Group_2__25694 = new BitSet(new long[]{0x00029BF41E000060L});
    public static final BitSet FOLLOW_rule__For__Group_2__3_in_rule__For__Group_2__25697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__CommandAssignment_2_2_in_rule__For__Group_2__2__Impl5724 = new BitSet(new long[]{0x00029BF41E000042L});
    public static final BitSet FOLLOW_rule__For__Group_2__3__Impl_in_rule__For__Group_2__35755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__For__Group_2__3__Impl5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05819 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__05822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15880 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__15883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__If__Group__1__Impl5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25942 = new BitSet(new long[]{0x00029BF41E000040L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__25945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__If__Group__2__Impl5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__36001 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__36004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ExprAssignment_3_in_rule__If__Group__3__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__46061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__If__Group__5_in_rule__If__Group__46064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__If__Group__4__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__56120 = new BitSet(new long[]{0x00029BF41E000040L});
    public static final BitSet FOLLOW_rule__If__Group__6_in_rule__If__Group__56123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__If__Group__5__Impl6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__66179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__If__Group__7_in_rule__If__Group__66182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__CommandsThenAssignment_6_in_rule__If__Group__6__Impl6211 = new BitSet(new long[]{0x00029BF41E000042L});
    public static final BitSet FOLLOW_rule__If__CommandsThenAssignment_6_in_rule__If__Group__6__Impl6223 = new BitSet(new long[]{0x00029BF41E000042L});
    public static final BitSet FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__76256 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__If__Group__8_in_rule__If__Group__76259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__If__Group__7__Impl6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__86315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__06391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__06394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__If__Group_8__0__Impl6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__16453 = new BitSet(new long[]{0x00029BF41E000040L});
    public static final BitSet FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__16456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__If__Group_8__1__Impl6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__26512 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__26515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__CommandsElseAssignment_8_2_in_rule__If__Group_8__2__Impl6544 = new BitSet(new long[]{0x00029BF41E000042L});
    public static final BitSet FOLLOW_rule__If__CommandsElseAssignment_8_2_in_rule__If__Group_8__2__Impl6556 = new BitSet(new long[]{0x00029BF41E000042L});
    public static final BitSet FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__36589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__If__Group_8__3__Impl6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__06653 = new BitSet(new long[]{0x00029BF41E000040L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__06656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__16714 = new BitSet(new long[]{0x00029BF41E000040L});
    public static final BitSet FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__16717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpNotAssignment_1_in_rule__Expression__Group__1__Impl6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__26775 = new BitSet(new long[]{0x0000000001FF8000L});
    public static final BitSet FOLLOW_rule__Expression__Group__3_in_rule__Expression__Group__26778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__LeftAssignment_2_in_rule__Expression__Group__2__Impl6805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__3__Impl_in_rule__Expression__Group__36835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__0_in_rule__Expression__Group__3__Impl6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__0__Impl_in_rule__Expression__Group_3__06901 = new BitSet(new long[]{0x00029BF41E000040L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__1_in_rule__Expression__Group_3__06904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAssignment_3_0_in_rule__Expression__Group_3__0__Impl6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__1__Impl_in_rule__Expression__Group_3__16961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_3_1_in_rule__Expression__Group_3__1__Impl6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__07022 = new BitSet(new long[]{0x00029BF41E000040L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__07025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__TerminalExpression__Group_0__0__Impl7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__17081 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__17084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__27140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__TerminalExpression__Group_0__2__Impl7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_rule__Model__MainAssignment7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_17238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Procedure__CommandsAssignment_37269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PonerN__IntAssignment_37300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__PonerN__ColorAssignment_57331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MoverN__IntAssignment_37362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_rule__MoverN__DirAssignment_57393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Poner__ColorAssignment_37424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_rule__Mover__DirAssignment_37455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__HayBolitas__ColorAssignment_27486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDireccion_in_rule__PuedeMover__DirAssignment_27517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__VarNameAssignment_0_27548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__While__ExprAssignment_37579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__While__CommandsAssignment_67610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__For__VarNameAssignment_0_27641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__For__ColorAAssignment_1_07672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__For__ColorBAssignment_2_07703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__For__CommandAssignment_2_27734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__If__ExprAssignment_37765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__If__CommandsThenAssignment_67796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__If__CommandsElseAssignment_8_27827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Expression__OpNotAssignment_17863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__Expression__LeftAssignment_27902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__Expression__OpAssignment_3_07933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__Expression__RightAssignment_3_17964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleans_in_rule__TerminalExpression__ExprAssignment_17995 = new BitSet(new long[]{0x0000000000000002L});

}