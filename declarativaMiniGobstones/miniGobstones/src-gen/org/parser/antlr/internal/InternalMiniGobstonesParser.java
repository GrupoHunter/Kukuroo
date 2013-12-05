package org.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.services.MiniGobstonesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniGobstonesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LBRACE", "RULE_RBRACE", "RULE_LPAR", "RULE_INT", "RULE_RPAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procedure'", "'PonerN'", "','", "'MoverN'", "'Poner'", "'Mover'", "'hayBolitas'", "'puedeMover'", "'var'", "'='", "'While'", "'repeat'", "'in'", "'to'", "'if'", "'else'", "'!'", "'and'", "'or'", "'=='", "'<'", "'>'", "'<='", "'>='", "'!='", "'+'", "'-'", "'Verde'", "'Rojo'", "'Azul'", "'Negro'", "'Norte'", "'Sur'", "'Este'", "'Oeste'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_LBRACE=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_RBRACE=6;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_LPAR=7;
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
    public static final int RULE_RPAR=9;
    public static final int T__37=37;
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
    public String getGrammarFileName() { return "../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g"; }



     	private MiniGobstonesGrammarAccess grammarAccess;
     	
        public InternalMiniGobstonesParser(TokenStream input, MiniGobstonesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MiniGobstonesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:77:1: ruleModel returns [EObject current=null] : ( (lv_main_0_0= ruleProcedure ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_main_0_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:80:28: ( ( (lv_main_0_0= ruleProcedure ) ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:81:1: ( (lv_main_0_0= ruleProcedure ) )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:81:1: ( (lv_main_0_0= ruleProcedure ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:82:1: (lv_main_0_0= ruleProcedure )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:82:1: (lv_main_0_0= ruleProcedure )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:83:3: lv_main_0_0= ruleProcedure
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getMainProcedureParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleProcedure_in_ruleModel130);
            lv_main_0_0=ruleProcedure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"main",
                    		lv_main_0_0, 
                    		"Procedure");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProcedure"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:107:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:108:2: (iv_ruleProcedure= ruleProcedure EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:109:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure165);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:116:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) this_LBRACE_2= RULE_LBRACE ( (lv_commands_3_0= ruleCommand ) )* this_RBRACE_4= RULE_RBRACE ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LBRACE_2=null;
        Token this_RBRACE_4=null;
        EObject lv_commands_3_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:119:28: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) this_LBRACE_2= RULE_LBRACE ( (lv_commands_3_0= ruleCommand ) )* this_RBRACE_4= RULE_RBRACE ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:120:1: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) this_LBRACE_2= RULE_LBRACE ( (lv_commands_3_0= ruleCommand ) )* this_RBRACE_4= RULE_RBRACE )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:120:1: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) this_LBRACE_2= RULE_LBRACE ( (lv_commands_3_0= ruleCommand ) )* this_RBRACE_4= RULE_RBRACE )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:120:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) this_LBRACE_2= RULE_LBRACE ( (lv_commands_3_0= ruleCommand ) )* this_RBRACE_4= RULE_RBRACE
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleProcedure212); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getProcedureKeyword_0());
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:124:1: ( (lv_name_1_0= RULE_ID ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:125:1: (lv_name_1_0= RULE_ID )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:125:1: (lv_name_1_0= RULE_ID )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:126:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure229); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcedureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            this_LBRACE_2=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleProcedure245); 
             
                newLeafNode(this_LBRACE_2, grammarAccess.getProcedureAccess().getLBRACETerminalRuleCall_2()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:146:1: ( (lv_commands_3_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_LPAR||LA1_0==16||(LA1_0>=18 && LA1_0<=23)||(LA1_0>=25 && LA1_0<=26)||LA1_0==29||LA1_0==31||(LA1_0>=42 && LA1_0<=45)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:147:1: (lv_commands_3_0= ruleCommand )
            	    {
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:147:1: (lv_commands_3_0= ruleCommand )
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:148:3: lv_commands_3_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureAccess().getCommandsCommandParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleProcedure265);
            	    lv_commands_3_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_3_0, 
            	            		"Command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_RBRACE_4=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleProcedure277); 
             
                newLeafNode(this_RBRACE_4, grammarAccess.getProcedureAccess().getRBRACETerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleCommand"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:176:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:177:2: (iv_ruleCommand= ruleCommand EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:178:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand312);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand322); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:185:1: ruleCommand returns [EObject current=null] : (this_Poner_0= rulePoner | this_Mover_1= ruleMover | this_PonerN_2= rulePonerN | this_MoverN_3= ruleMoverN | this_HayBolitas_4= ruleHayBolitas | this_PuedeMover_5= rulePuedeMover | this_If_6= ruleIf | this_While_7= ruleWhile | this_For_8= ruleFor | this_Variable_9= ruleVariable ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Poner_0 = null;

        EObject this_Mover_1 = null;

        EObject this_PonerN_2 = null;

        EObject this_MoverN_3 = null;

        EObject this_HayBolitas_4 = null;

        EObject this_PuedeMover_5 = null;

        EObject this_If_6 = null;

        EObject this_While_7 = null;

        EObject this_For_8 = null;

        EObject this_Variable_9 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:188:28: ( (this_Poner_0= rulePoner | this_Mover_1= ruleMover | this_PonerN_2= rulePonerN | this_MoverN_3= ruleMoverN | this_HayBolitas_4= ruleHayBolitas | this_PuedeMover_5= rulePuedeMover | this_If_6= ruleIf | this_While_7= ruleWhile | this_For_8= ruleFor | this_Variable_9= ruleVariable ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:189:1: (this_Poner_0= rulePoner | this_Mover_1= ruleMover | this_PonerN_2= rulePonerN | this_MoverN_3= ruleMoverN | this_HayBolitas_4= ruleHayBolitas | this_PuedeMover_5= rulePuedeMover | this_If_6= ruleIf | this_While_7= ruleWhile | this_For_8= ruleFor | this_Variable_9= ruleVariable )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:189:1: (this_Poner_0= rulePoner | this_Mover_1= ruleMover | this_PonerN_2= rulePonerN | this_MoverN_3= ruleMoverN | this_HayBolitas_4= ruleHayBolitas | this_PuedeMover_5= rulePuedeMover | this_If_6= ruleIf | this_While_7= ruleWhile | this_For_8= ruleFor | this_Variable_9= ruleVariable )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:190:5: this_Poner_0= rulePoner
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getPonerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePoner_in_ruleCommand369);
                    this_Poner_0=rulePoner();

                    state._fsp--;

                     
                            current = this_Poner_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:200:5: this_Mover_1= ruleMover
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getMoverParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMover_in_ruleCommand396);
                    this_Mover_1=ruleMover();

                    state._fsp--;

                     
                            current = this_Mover_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:210:5: this_PonerN_2= rulePonerN
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getPonerNParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePonerN_in_ruleCommand423);
                    this_PonerN_2=rulePonerN();

                    state._fsp--;

                     
                            current = this_PonerN_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:220:5: this_MoverN_3= ruleMoverN
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getMoverNParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMoverN_in_ruleCommand450);
                    this_MoverN_3=ruleMoverN();

                    state._fsp--;

                     
                            current = this_MoverN_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:230:5: this_HayBolitas_4= ruleHayBolitas
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getHayBolitasParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleHayBolitas_in_ruleCommand477);
                    this_HayBolitas_4=ruleHayBolitas();

                    state._fsp--;

                     
                            current = this_HayBolitas_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:240:5: this_PuedeMover_5= rulePuedeMover
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getPuedeMoverParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulePuedeMover_in_ruleCommand504);
                    this_PuedeMover_5=rulePuedeMover();

                    state._fsp--;

                     
                            current = this_PuedeMover_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:250:5: this_If_6= ruleIf
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getIfParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleIf_in_ruleCommand531);
                    this_If_6=ruleIf();

                    state._fsp--;

                     
                            current = this_If_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:260:5: this_While_7= ruleWhile
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getWhileParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleWhile_in_ruleCommand558);
                    this_While_7=ruleWhile();

                    state._fsp--;

                     
                            current = this_While_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:270:5: this_For_8= ruleFor
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getForParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleFor_in_ruleCommand585);
                    this_For_8=ruleFor();

                    state._fsp--;

                     
                            current = this_For_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:280:5: this_Variable_9= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getVariableParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleCommand612);
                    this_Variable_9=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRulePonerN"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:296:1: entryRulePonerN returns [EObject current=null] : iv_rulePonerN= rulePonerN EOF ;
    public final EObject entryRulePonerN() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePonerN = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:297:2: (iv_rulePonerN= rulePonerN EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:298:2: iv_rulePonerN= rulePonerN EOF
            {
             newCompositeNode(grammarAccess.getPonerNRule()); 
            pushFollow(FOLLOW_rulePonerN_in_entryRulePonerN647);
            iv_rulePonerN=rulePonerN();

            state._fsp--;

             current =iv_rulePonerN; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePonerN657); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePonerN"


    // $ANTLR start "rulePonerN"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:305:1: rulePonerN returns [EObject current=null] : ( () otherlv_1= 'PonerN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_color_5_0= ruleColor ) ) this_RPAR_6= RULE_RPAR ) ;
    public final EObject rulePonerN() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LPAR_2=null;
        Token lv_int_3_0=null;
        Token otherlv_4=null;
        Token this_RPAR_6=null;
        Enumerator lv_color_5_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:308:28: ( ( () otherlv_1= 'PonerN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_color_5_0= ruleColor ) ) this_RPAR_6= RULE_RPAR ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:309:1: ( () otherlv_1= 'PonerN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_color_5_0= ruleColor ) ) this_RPAR_6= RULE_RPAR )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:309:1: ( () otherlv_1= 'PonerN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_color_5_0= ruleColor ) ) this_RPAR_6= RULE_RPAR )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:309:2: () otherlv_1= 'PonerN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_color_5_0= ruleColor ) ) this_RPAR_6= RULE_RPAR
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:309:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:310:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPonerNAccess().getPonerNAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulePonerN703); 

                	newLeafNode(otherlv_1, grammarAccess.getPonerNAccess().getPonerNKeyword_1());
                
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rulePonerN714); 
             
                newLeafNode(this_LPAR_2, grammarAccess.getPonerNAccess().getLPARTerminalRuleCall_2()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:323:1: ( (lv_int_3_0= RULE_INT ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:324:1: (lv_int_3_0= RULE_INT )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:324:1: (lv_int_3_0= RULE_INT )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:325:3: lv_int_3_0= RULE_INT
            {
            lv_int_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePonerN730); 

            			newLeafNode(lv_int_3_0, grammarAccess.getPonerNAccess().getIntINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPonerNRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"int",
                    		lv_int_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulePonerN747); 

                	newLeafNode(otherlv_4, grammarAccess.getPonerNAccess().getCommaKeyword_4());
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:345:1: ( (lv_color_5_0= ruleColor ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:346:1: (lv_color_5_0= ruleColor )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:346:1: (lv_color_5_0= ruleColor )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:347:3: lv_color_5_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getPonerNAccess().getColorColorEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_rulePonerN768);
            lv_color_5_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPonerNRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_5_0, 
                    		"Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RPAR_6=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rulePonerN779); 
             
                newLeafNode(this_RPAR_6, grammarAccess.getPonerNAccess().getRPARTerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePonerN"


    // $ANTLR start "entryRuleMoverN"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:375:1: entryRuleMoverN returns [EObject current=null] : iv_ruleMoverN= ruleMoverN EOF ;
    public final EObject entryRuleMoverN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoverN = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:376:2: (iv_ruleMoverN= ruleMoverN EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:377:2: iv_ruleMoverN= ruleMoverN EOF
            {
             newCompositeNode(grammarAccess.getMoverNRule()); 
            pushFollow(FOLLOW_ruleMoverN_in_entryRuleMoverN814);
            iv_ruleMoverN=ruleMoverN();

            state._fsp--;

             current =iv_ruleMoverN; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMoverN824); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoverN"


    // $ANTLR start "ruleMoverN"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:384:1: ruleMoverN returns [EObject current=null] : ( () otherlv_1= 'MoverN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_dir_5_0= ruleDireccion ) ) this_RPAR_6= RULE_RPAR ) ;
    public final EObject ruleMoverN() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LPAR_2=null;
        Token lv_int_3_0=null;
        Token otherlv_4=null;
        Token this_RPAR_6=null;
        Enumerator lv_dir_5_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:387:28: ( ( () otherlv_1= 'MoverN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_dir_5_0= ruleDireccion ) ) this_RPAR_6= RULE_RPAR ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:388:1: ( () otherlv_1= 'MoverN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_dir_5_0= ruleDireccion ) ) this_RPAR_6= RULE_RPAR )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:388:1: ( () otherlv_1= 'MoverN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_dir_5_0= ruleDireccion ) ) this_RPAR_6= RULE_RPAR )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:388:2: () otherlv_1= 'MoverN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_dir_5_0= ruleDireccion ) ) this_RPAR_6= RULE_RPAR
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:388:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:389:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMoverNAccess().getMoverNAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleMoverN870); 

                	newLeafNode(otherlv_1, grammarAccess.getMoverNAccess().getMoverNKeyword_1());
                
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_ruleMoverN881); 
             
                newLeafNode(this_LPAR_2, grammarAccess.getMoverNAccess().getLPARTerminalRuleCall_2()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:402:1: ( (lv_int_3_0= RULE_INT ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:403:1: (lv_int_3_0= RULE_INT )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:403:1: (lv_int_3_0= RULE_INT )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:404:3: lv_int_3_0= RULE_INT
            {
            lv_int_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMoverN897); 

            			newLeafNode(lv_int_3_0, grammarAccess.getMoverNAccess().getIntINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMoverNRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"int",
                    		lv_int_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleMoverN914); 

                	newLeafNode(otherlv_4, grammarAccess.getMoverNAccess().getCommaKeyword_4());
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:424:1: ( (lv_dir_5_0= ruleDireccion ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:425:1: (lv_dir_5_0= ruleDireccion )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:425:1: (lv_dir_5_0= ruleDireccion )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:426:3: lv_dir_5_0= ruleDireccion
            {
             
            	        newCompositeNode(grammarAccess.getMoverNAccess().getDirDireccionEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleDireccion_in_ruleMoverN935);
            lv_dir_5_0=ruleDireccion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoverNRule());
            	        }
                   		set(
                   			current, 
                   			"dir",
                    		lv_dir_5_0, 
                    		"Direccion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RPAR_6=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleMoverN946); 
             
                newLeafNode(this_RPAR_6, grammarAccess.getMoverNAccess().getRPARTerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoverN"


    // $ANTLR start "entryRulePoner"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:454:1: entryRulePoner returns [EObject current=null] : iv_rulePoner= rulePoner EOF ;
    public final EObject entryRulePoner() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoner = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:455:2: (iv_rulePoner= rulePoner EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:456:2: iv_rulePoner= rulePoner EOF
            {
             newCompositeNode(grammarAccess.getPonerRule()); 
            pushFollow(FOLLOW_rulePoner_in_entryRulePoner981);
            iv_rulePoner=rulePoner();

            state._fsp--;

             current =iv_rulePoner; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoner991); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoner"


    // $ANTLR start "rulePoner"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:463:1: rulePoner returns [EObject current=null] : ( () otherlv_1= 'Poner' this_LPAR_2= RULE_LPAR ( (lv_color_3_0= ruleColor ) ) this_RPAR_4= RULE_RPAR ) ;
    public final EObject rulePoner() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LPAR_2=null;
        Token this_RPAR_4=null;
        Enumerator lv_color_3_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:466:28: ( ( () otherlv_1= 'Poner' this_LPAR_2= RULE_LPAR ( (lv_color_3_0= ruleColor ) ) this_RPAR_4= RULE_RPAR ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:467:1: ( () otherlv_1= 'Poner' this_LPAR_2= RULE_LPAR ( (lv_color_3_0= ruleColor ) ) this_RPAR_4= RULE_RPAR )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:467:1: ( () otherlv_1= 'Poner' this_LPAR_2= RULE_LPAR ( (lv_color_3_0= ruleColor ) ) this_RPAR_4= RULE_RPAR )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:467:2: () otherlv_1= 'Poner' this_LPAR_2= RULE_LPAR ( (lv_color_3_0= ruleColor ) ) this_RPAR_4= RULE_RPAR
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:467:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:468:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPonerAccess().getPonerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_rulePoner1037); 

                	newLeafNode(otherlv_1, grammarAccess.getPonerAccess().getPonerKeyword_1());
                
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rulePoner1048); 
             
                newLeafNode(this_LPAR_2, grammarAccess.getPonerAccess().getLPARTerminalRuleCall_2()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:481:1: ( (lv_color_3_0= ruleColor ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:482:1: (lv_color_3_0= ruleColor )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:482:1: (lv_color_3_0= ruleColor )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:483:3: lv_color_3_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getPonerAccess().getColorColorEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_rulePoner1068);
            lv_color_3_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPonerRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_3_0, 
                    		"Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RPAR_4=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rulePoner1079); 
             
                newLeafNode(this_RPAR_4, grammarAccess.getPonerAccess().getRPARTerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoner"


    // $ANTLR start "entryRuleMover"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:511:1: entryRuleMover returns [EObject current=null] : iv_ruleMover= ruleMover EOF ;
    public final EObject entryRuleMover() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMover = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:512:2: (iv_ruleMover= ruleMover EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:513:2: iv_ruleMover= ruleMover EOF
            {
             newCompositeNode(grammarAccess.getMoverRule()); 
            pushFollow(FOLLOW_ruleMover_in_entryRuleMover1114);
            iv_ruleMover=ruleMover();

            state._fsp--;

             current =iv_ruleMover; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMover1124); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMover"


    // $ANTLR start "ruleMover"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:520:1: ruleMover returns [EObject current=null] : ( () otherlv_1= 'Mover' this_LPAR_2= RULE_LPAR ( (lv_dir_3_0= ruleDireccion ) ) this_RPAR_4= RULE_RPAR ) ;
    public final EObject ruleMover() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LPAR_2=null;
        Token this_RPAR_4=null;
        Enumerator lv_dir_3_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:523:28: ( ( () otherlv_1= 'Mover' this_LPAR_2= RULE_LPAR ( (lv_dir_3_0= ruleDireccion ) ) this_RPAR_4= RULE_RPAR ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:524:1: ( () otherlv_1= 'Mover' this_LPAR_2= RULE_LPAR ( (lv_dir_3_0= ruleDireccion ) ) this_RPAR_4= RULE_RPAR )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:524:1: ( () otherlv_1= 'Mover' this_LPAR_2= RULE_LPAR ( (lv_dir_3_0= ruleDireccion ) ) this_RPAR_4= RULE_RPAR )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:524:2: () otherlv_1= 'Mover' this_LPAR_2= RULE_LPAR ( (lv_dir_3_0= ruleDireccion ) ) this_RPAR_4= RULE_RPAR
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:524:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:525:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMoverAccess().getMoverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMover1170); 

                	newLeafNode(otherlv_1, grammarAccess.getMoverAccess().getMoverKeyword_1());
                
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_ruleMover1181); 
             
                newLeafNode(this_LPAR_2, grammarAccess.getMoverAccess().getLPARTerminalRuleCall_2()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:538:1: ( (lv_dir_3_0= ruleDireccion ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:539:1: (lv_dir_3_0= ruleDireccion )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:539:1: (lv_dir_3_0= ruleDireccion )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:540:3: lv_dir_3_0= ruleDireccion
            {
             
            	        newCompositeNode(grammarAccess.getMoverAccess().getDirDireccionEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDireccion_in_ruleMover1201);
            lv_dir_3_0=ruleDireccion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoverRule());
            	        }
                   		set(
                   			current, 
                   			"dir",
                    		lv_dir_3_0, 
                    		"Direccion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RPAR_4=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleMover1212); 
             
                newLeafNode(this_RPAR_4, grammarAccess.getMoverAccess().getRPARTerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMover"


    // $ANTLR start "entryRuleHayBolitas"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:568:1: entryRuleHayBolitas returns [EObject current=null] : iv_ruleHayBolitas= ruleHayBolitas EOF ;
    public final EObject entryRuleHayBolitas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHayBolitas = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:569:2: (iv_ruleHayBolitas= ruleHayBolitas EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:570:2: iv_ruleHayBolitas= ruleHayBolitas EOF
            {
             newCompositeNode(grammarAccess.getHayBolitasRule()); 
            pushFollow(FOLLOW_ruleHayBolitas_in_entryRuleHayBolitas1247);
            iv_ruleHayBolitas=ruleHayBolitas();

            state._fsp--;

             current =iv_ruleHayBolitas; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHayBolitas1257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHayBolitas"


    // $ANTLR start "ruleHayBolitas"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:577:1: ruleHayBolitas returns [EObject current=null] : (otherlv_0= 'hayBolitas' this_LPAR_1= RULE_LPAR ( (lv_color_2_0= ruleColor ) ) this_RPAR_3= RULE_RPAR ) ;
    public final EObject ruleHayBolitas() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LPAR_1=null;
        Token this_RPAR_3=null;
        Enumerator lv_color_2_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:580:28: ( (otherlv_0= 'hayBolitas' this_LPAR_1= RULE_LPAR ( (lv_color_2_0= ruleColor ) ) this_RPAR_3= RULE_RPAR ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:581:1: (otherlv_0= 'hayBolitas' this_LPAR_1= RULE_LPAR ( (lv_color_2_0= ruleColor ) ) this_RPAR_3= RULE_RPAR )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:581:1: (otherlv_0= 'hayBolitas' this_LPAR_1= RULE_LPAR ( (lv_color_2_0= ruleColor ) ) this_RPAR_3= RULE_RPAR )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:581:3: otherlv_0= 'hayBolitas' this_LPAR_1= RULE_LPAR ( (lv_color_2_0= ruleColor ) ) this_RPAR_3= RULE_RPAR
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleHayBolitas1294); 

                	newLeafNode(otherlv_0, grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0());
                
            this_LPAR_1=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_ruleHayBolitas1305); 
             
                newLeafNode(this_LPAR_1, grammarAccess.getHayBolitasAccess().getLPARTerminalRuleCall_1()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:589:1: ( (lv_color_2_0= ruleColor ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:590:1: (lv_color_2_0= ruleColor )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:590:1: (lv_color_2_0= ruleColor )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:591:3: lv_color_2_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getHayBolitasAccess().getColorColorEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleHayBolitas1325);
            lv_color_2_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHayBolitasRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_2_0, 
                    		"Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RPAR_3=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleHayBolitas1336); 
             
                newLeafNode(this_RPAR_3, grammarAccess.getHayBolitasAccess().getRPARTerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHayBolitas"


    // $ANTLR start "entryRulePuedeMover"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:619:1: entryRulePuedeMover returns [EObject current=null] : iv_rulePuedeMover= rulePuedeMover EOF ;
    public final EObject entryRulePuedeMover() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePuedeMover = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:620:2: (iv_rulePuedeMover= rulePuedeMover EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:621:2: iv_rulePuedeMover= rulePuedeMover EOF
            {
             newCompositeNode(grammarAccess.getPuedeMoverRule()); 
            pushFollow(FOLLOW_rulePuedeMover_in_entryRulePuedeMover1371);
            iv_rulePuedeMover=rulePuedeMover();

            state._fsp--;

             current =iv_rulePuedeMover; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePuedeMover1381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePuedeMover"


    // $ANTLR start "rulePuedeMover"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:628:1: rulePuedeMover returns [EObject current=null] : (otherlv_0= 'puedeMover' this_LPAR_1= RULE_LPAR ( (lv_dir_2_0= ruleDireccion ) ) this_RPAR_3= RULE_RPAR ) ;
    public final EObject rulePuedeMover() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LPAR_1=null;
        Token this_RPAR_3=null;
        Enumerator lv_dir_2_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:631:28: ( (otherlv_0= 'puedeMover' this_LPAR_1= RULE_LPAR ( (lv_dir_2_0= ruleDireccion ) ) this_RPAR_3= RULE_RPAR ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:632:1: (otherlv_0= 'puedeMover' this_LPAR_1= RULE_LPAR ( (lv_dir_2_0= ruleDireccion ) ) this_RPAR_3= RULE_RPAR )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:632:1: (otherlv_0= 'puedeMover' this_LPAR_1= RULE_LPAR ( (lv_dir_2_0= ruleDireccion ) ) this_RPAR_3= RULE_RPAR )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:632:3: otherlv_0= 'puedeMover' this_LPAR_1= RULE_LPAR ( (lv_dir_2_0= ruleDireccion ) ) this_RPAR_3= RULE_RPAR
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulePuedeMover1418); 

                	newLeafNode(otherlv_0, grammarAccess.getPuedeMoverAccess().getPuedeMoverKeyword_0());
                
            this_LPAR_1=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rulePuedeMover1429); 
             
                newLeafNode(this_LPAR_1, grammarAccess.getPuedeMoverAccess().getLPARTerminalRuleCall_1()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:640:1: ( (lv_dir_2_0= ruleDireccion ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:641:1: (lv_dir_2_0= ruleDireccion )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:641:1: (lv_dir_2_0= ruleDireccion )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:642:3: lv_dir_2_0= ruleDireccion
            {
             
            	        newCompositeNode(grammarAccess.getPuedeMoverAccess().getDirDireccionEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDireccion_in_rulePuedeMover1449);
            lv_dir_2_0=ruleDireccion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPuedeMoverRule());
            	        }
                   		set(
                   			current, 
                   			"dir",
                    		lv_dir_2_0, 
                    		"Direccion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RPAR_3=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rulePuedeMover1460); 
             
                newLeafNode(this_RPAR_3, grammarAccess.getPuedeMoverAccess().getRPARTerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePuedeMover"


    // $ANTLR start "entryRuleVariable"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:670:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:671:2: (iv_ruleVariable= ruleVariable EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:672:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1495);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1505); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:679:1: ruleVariable returns [EObject current=null] : ( ( () otherlv_1= 'var' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= '=' this_INT_4= RULE_INT ) | this_Booleans_5= ruleBooleans | this_Expression_6= ruleExpression ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_varName_2_0=null;
        Token otherlv_3=null;
        Token this_INT_4=null;
        EObject this_Booleans_5 = null;

        EObject this_Expression_6 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:682:28: ( ( ( () otherlv_1= 'var' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= '=' this_INT_4= RULE_INT ) | this_Booleans_5= ruleBooleans | this_Expression_6= ruleExpression ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:683:1: ( ( () otherlv_1= 'var' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= '=' this_INT_4= RULE_INT ) | this_Booleans_5= ruleBooleans | this_Expression_6= ruleExpression )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:683:1: ( ( () otherlv_1= 'var' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= '=' this_INT_4= RULE_INT ) | this_Booleans_5= ruleBooleans | this_Expression_6= ruleExpression )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:683:2: ( () otherlv_1= 'var' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= '=' this_INT_4= RULE_INT )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:683:2: ( () otherlv_1= 'var' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= '=' this_INT_4= RULE_INT )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:683:3: () otherlv_1= 'var' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= '=' this_INT_4= RULE_INT
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:683:3: ()
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:684:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariableAccess().getVariableAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleVariable1552); 

                        	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVarKeyword_0_1());
                        
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:693:1: ( (lv_varName_2_0= RULE_ID ) )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:694:1: (lv_varName_2_0= RULE_ID )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:694:1: (lv_varName_2_0= RULE_ID )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:695:3: lv_varName_2_0= RULE_ID
                    {
                    lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1569); 

                    			newLeafNode(lv_varName_2_0, grammarAccess.getVariableAccess().getVarNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"varName",
                            		lv_varName_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleVariable1586); 

                        	newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getEqualsSignKeyword_0_3());
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariable1597); 
                     
                        newLeafNode(this_INT_4, grammarAccess.getVariableAccess().getINTTerminalRuleCall_0_4()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:721:5: this_Booleans_5= ruleBooleans
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getBooleansParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleans_in_ruleVariable1625);
                    this_Booleans_5=ruleBooleans();

                    state._fsp--;

                     
                            current = this_Booleans_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:731:5: this_Expression_6= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariable1652);
                    this_Expression_6=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleWhile"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:747:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:748:2: (iv_ruleWhile= ruleWhile EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:749:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile1687);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile1697); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:756:1: ruleWhile returns [EObject current=null] : ( () otherlv_1= 'While' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleExpression ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commands_6_0= ruleCommand ) )* this_RBRACE_7= RULE_RBRACE ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LPAR_2=null;
        Token this_RPAR_4=null;
        Token this_LBRACE_5=null;
        Token this_RBRACE_7=null;
        EObject lv_expr_3_0 = null;

        EObject lv_commands_6_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:759:28: ( ( () otherlv_1= 'While' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleExpression ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commands_6_0= ruleCommand ) )* this_RBRACE_7= RULE_RBRACE ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:760:1: ( () otherlv_1= 'While' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleExpression ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commands_6_0= ruleCommand ) )* this_RBRACE_7= RULE_RBRACE )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:760:1: ( () otherlv_1= 'While' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleExpression ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commands_6_0= ruleCommand ) )* this_RBRACE_7= RULE_RBRACE )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:760:2: () otherlv_1= 'While' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleExpression ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commands_6_0= ruleCommand ) )* this_RBRACE_7= RULE_RBRACE
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:760:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:761:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWhileAccess().getWhileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleWhile1743); 

                	newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getWhileKeyword_1());
                
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_ruleWhile1754); 
             
                newLeafNode(this_LPAR_2, grammarAccess.getWhileAccess().getLPARTerminalRuleCall_2()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:774:1: ( (lv_expr_3_0= ruleExpression ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:775:1: (lv_expr_3_0= ruleExpression )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:775:1: (lv_expr_3_0= ruleExpression )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:776:3: lv_expr_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhileAccess().getExprExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleWhile1774);
            lv_expr_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RPAR_4=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleWhile1785); 
             
                newLeafNode(this_RPAR_4, grammarAccess.getWhileAccess().getRPARTerminalRuleCall_4()); 
                
            this_LBRACE_5=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleWhile1795); 
             
                newLeafNode(this_LBRACE_5, grammarAccess.getWhileAccess().getLBRACETerminalRuleCall_5()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:800:1: ( (lv_commands_6_0= ruleCommand ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_LPAR||LA4_0==16||(LA4_0>=18 && LA4_0<=23)||(LA4_0>=25 && LA4_0<=26)||LA4_0==29||LA4_0==31||(LA4_0>=42 && LA4_0<=45)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:801:1: (lv_commands_6_0= ruleCommand )
            	    {
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:801:1: (lv_commands_6_0= ruleCommand )
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:802:3: lv_commands_6_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhileAccess().getCommandsCommandParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleWhile1815);
            	    lv_commands_6_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_6_0, 
            	            		"Command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_RBRACE_7=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleWhile1827); 
             
                newLeafNode(this_RBRACE_7, grammarAccess.getWhileAccess().getRBRACETerminalRuleCall_7()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleFor"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:830:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:831:2: (iv_ruleFor= ruleFor EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:832:2: iv_ruleFor= ruleFor EOF
            {
             newCompositeNode(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor1862);
            iv_ruleFor=ruleFor();

            state._fsp--;

             current =iv_ruleFor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor1872); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:839:1: ruleFor returns [EObject current=null] : ( ( () otherlv_1= 'repeat' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= 'in' this_INT_4= RULE_INT ) | ( ( (lv_colorA_5_0= ruleColor ) ) otherlv_6= 'to' this_INT_7= RULE_INT ) | ( ( (lv_colorB_8_0= ruleColor ) ) this_LBRACE_9= RULE_LBRACE ( (lv_Command_10_0= ruleCommand ) )* this_RBRACE_11= RULE_RBRACE ) ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_varName_2_0=null;
        Token otherlv_3=null;
        Token this_INT_4=null;
        Token otherlv_6=null;
        Token this_INT_7=null;
        Token this_LBRACE_9=null;
        Token this_RBRACE_11=null;
        Enumerator lv_colorA_5_0 = null;

        Enumerator lv_colorB_8_0 = null;

        EObject lv_Command_10_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:842:28: ( ( ( () otherlv_1= 'repeat' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= 'in' this_INT_4= RULE_INT ) | ( ( (lv_colorA_5_0= ruleColor ) ) otherlv_6= 'to' this_INT_7= RULE_INT ) | ( ( (lv_colorB_8_0= ruleColor ) ) this_LBRACE_9= RULE_LBRACE ( (lv_Command_10_0= ruleCommand ) )* this_RBRACE_11= RULE_RBRACE ) ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:843:1: ( ( () otherlv_1= 'repeat' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= 'in' this_INT_4= RULE_INT ) | ( ( (lv_colorA_5_0= ruleColor ) ) otherlv_6= 'to' this_INT_7= RULE_INT ) | ( ( (lv_colorB_8_0= ruleColor ) ) this_LBRACE_9= RULE_LBRACE ( (lv_Command_10_0= ruleCommand ) )* this_RBRACE_11= RULE_RBRACE ) )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:843:1: ( ( () otherlv_1= 'repeat' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= 'in' this_INT_4= RULE_INT ) | ( ( (lv_colorA_5_0= ruleColor ) ) otherlv_6= 'to' this_INT_7= RULE_INT ) | ( ( (lv_colorB_8_0= ruleColor ) ) this_LBRACE_9= RULE_LBRACE ( (lv_Command_10_0= ruleCommand ) )* this_RBRACE_11= RULE_RBRACE ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 42:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_LBRACE) ) {
                    alt6=3;
                }
                else if ( (LA6_2==28) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==RULE_LBRACE) ) {
                    alt6=3;
                }
                else if ( (LA6_3==28) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==RULE_LBRACE) ) {
                    alt6=3;
                }
                else if ( (LA6_4==28) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                int LA6_5 = input.LA(2);

                if ( (LA6_5==28) ) {
                    alt6=2;
                }
                else if ( (LA6_5==RULE_LBRACE) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:843:2: ( () otherlv_1= 'repeat' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= 'in' this_INT_4= RULE_INT )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:843:2: ( () otherlv_1= 'repeat' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= 'in' this_INT_4= RULE_INT )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:843:3: () otherlv_1= 'repeat' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= 'in' this_INT_4= RULE_INT
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:843:3: ()
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:844:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getForAccess().getForAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleFor1919); 

                        	newLeafNode(otherlv_1, grammarAccess.getForAccess().getRepeatKeyword_0_1());
                        
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:853:1: ( (lv_varName_2_0= RULE_ID ) )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:854:1: (lv_varName_2_0= RULE_ID )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:854:1: (lv_varName_2_0= RULE_ID )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:855:3: lv_varName_2_0= RULE_ID
                    {
                    lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFor1936); 

                    			newLeafNode(lv_varName_2_0, grammarAccess.getForAccess().getVarNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"varName",
                            		lv_varName_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleFor1953); 

                        	newLeafNode(otherlv_3, grammarAccess.getForAccess().getInKeyword_0_3());
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFor1964); 
                     
                        newLeafNode(this_INT_4, grammarAccess.getForAccess().getINTTerminalRuleCall_0_4()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:880:6: ( ( (lv_colorA_5_0= ruleColor ) ) otherlv_6= 'to' this_INT_7= RULE_INT )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:880:6: ( ( (lv_colorA_5_0= ruleColor ) ) otherlv_6= 'to' this_INT_7= RULE_INT )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:880:7: ( (lv_colorA_5_0= ruleColor ) ) otherlv_6= 'to' this_INT_7= RULE_INT
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:880:7: ( (lv_colorA_5_0= ruleColor ) )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:881:1: (lv_colorA_5_0= ruleColor )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:881:1: (lv_colorA_5_0= ruleColor )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:882:3: lv_colorA_5_0= ruleColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getForAccess().getColorAColorEnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColor_in_ruleFor1992);
                    lv_colorA_5_0=ruleColor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForRule());
                    	        }
                           		set(
                           			current, 
                           			"colorA",
                            		lv_colorA_5_0, 
                            		"Color");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleFor2004); 

                        	newLeafNode(otherlv_6, grammarAccess.getForAccess().getToKeyword_1_1());
                        
                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFor2015); 
                     
                        newLeafNode(this_INT_7, grammarAccess.getForAccess().getINTTerminalRuleCall_1_2()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:907:6: ( ( (lv_colorB_8_0= ruleColor ) ) this_LBRACE_9= RULE_LBRACE ( (lv_Command_10_0= ruleCommand ) )* this_RBRACE_11= RULE_RBRACE )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:907:6: ( ( (lv_colorB_8_0= ruleColor ) ) this_LBRACE_9= RULE_LBRACE ( (lv_Command_10_0= ruleCommand ) )* this_RBRACE_11= RULE_RBRACE )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:907:7: ( (lv_colorB_8_0= ruleColor ) ) this_LBRACE_9= RULE_LBRACE ( (lv_Command_10_0= ruleCommand ) )* this_RBRACE_11= RULE_RBRACE
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:907:7: ( (lv_colorB_8_0= ruleColor ) )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:908:1: (lv_colorB_8_0= ruleColor )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:908:1: (lv_colorB_8_0= ruleColor )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:909:3: lv_colorB_8_0= ruleColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getForAccess().getColorBColorEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColor_in_ruleFor2043);
                    lv_colorB_8_0=ruleColor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForRule());
                    	        }
                           		set(
                           			current, 
                           			"colorB",
                            		lv_colorB_8_0, 
                            		"Color");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_LBRACE_9=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleFor2054); 
                     
                        newLeafNode(this_LBRACE_9, grammarAccess.getForAccess().getLBRACETerminalRuleCall_2_1()); 
                        
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:929:1: ( (lv_Command_10_0= ruleCommand ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_LPAR||LA5_0==16||(LA5_0>=18 && LA5_0<=23)||(LA5_0>=25 && LA5_0<=26)||LA5_0==29||LA5_0==31||(LA5_0>=42 && LA5_0<=45)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:930:1: (lv_Command_10_0= ruleCommand )
                    	    {
                    	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:930:1: (lv_Command_10_0= ruleCommand )
                    	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:931:3: lv_Command_10_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getForAccess().getCommandCommandParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCommand_in_ruleFor2074);
                    	    lv_Command_10_0=ruleCommand();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getForRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Command",
                    	            		lv_Command_10_0, 
                    	            		"Command");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    this_RBRACE_11=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleFor2086); 
                     
                        newLeafNode(this_RBRACE_11, grammarAccess.getForAccess().getRBRACETerminalRuleCall_2_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleIf"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:959:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:960:2: (iv_ruleIf= ruleIf EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:961:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf2122);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf2132); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:968:1: ruleIf returns [EObject current=null] : ( () otherlv_1= 'if' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleExpression ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commandsThen_6_0= ruleCommand ) )+ this_RBRACE_7= RULE_RBRACE (otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LPAR_2=null;
        Token this_RPAR_4=null;
        Token this_LBRACE_5=null;
        Token this_RBRACE_7=null;
        Token otherlv_8=null;
        Token this_LBRACE_9=null;
        Token this_RBRACE_11=null;
        EObject lv_expr_3_0 = null;

        EObject lv_commandsThen_6_0 = null;

        EObject lv_commandsElse_10_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:971:28: ( ( () otherlv_1= 'if' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleExpression ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commandsThen_6_0= ruleCommand ) )+ this_RBRACE_7= RULE_RBRACE (otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE )? ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:972:1: ( () otherlv_1= 'if' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleExpression ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commandsThen_6_0= ruleCommand ) )+ this_RBRACE_7= RULE_RBRACE (otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE )? )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:972:1: ( () otherlv_1= 'if' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleExpression ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commandsThen_6_0= ruleCommand ) )+ this_RBRACE_7= RULE_RBRACE (otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE )? )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:972:2: () otherlv_1= 'if' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleExpression ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commandsThen_6_0= ruleCommand ) )+ this_RBRACE_7= RULE_RBRACE (otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE )?
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:972:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:973:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIfAccess().getIfAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleIf2178); 

                	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
                
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_ruleIf2189); 
             
                newLeafNode(this_LPAR_2, grammarAccess.getIfAccess().getLPARTerminalRuleCall_2()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:986:1: ( (lv_expr_3_0= ruleExpression ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:987:1: (lv_expr_3_0= ruleExpression )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:987:1: (lv_expr_3_0= ruleExpression )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:988:3: lv_expr_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getIfAccess().getExprExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleIf2209);
            lv_expr_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RPAR_4=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleIf2220); 
             
                newLeafNode(this_RPAR_4, grammarAccess.getIfAccess().getRPARTerminalRuleCall_4()); 
                
            this_LBRACE_5=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleIf2230); 
             
                newLeafNode(this_LBRACE_5, grammarAccess.getIfAccess().getLBRACETerminalRuleCall_5()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1012:1: ( (lv_commandsThen_6_0= ruleCommand ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_LPAR||LA7_0==16||(LA7_0>=18 && LA7_0<=23)||(LA7_0>=25 && LA7_0<=26)||LA7_0==29||LA7_0==31||(LA7_0>=42 && LA7_0<=45)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1013:1: (lv_commandsThen_6_0= ruleCommand )
            	    {
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1013:1: (lv_commandsThen_6_0= ruleCommand )
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1014:3: lv_commandsThen_6_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfAccess().getCommandsThenCommandParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleIf2250);
            	    lv_commandsThen_6_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commandsThen",
            	            		lv_commandsThen_6_0, 
            	            		"Command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            this_RBRACE_7=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleIf2262); 
             
                newLeafNode(this_RBRACE_7, grammarAccess.getIfAccess().getRBRACETerminalRuleCall_7()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1034:1: (otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1034:3: otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleIf2274); 

                        	newLeafNode(otherlv_8, grammarAccess.getIfAccess().getElseKeyword_8_0());
                        
                    this_LBRACE_9=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleIf2285); 
                     
                        newLeafNode(this_LBRACE_9, grammarAccess.getIfAccess().getLBRACETerminalRuleCall_8_1()); 
                        
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1042:1: ( (lv_commandsElse_10_0= ruleCommand ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_LPAR||LA8_0==16||(LA8_0>=18 && LA8_0<=23)||(LA8_0>=25 && LA8_0<=26)||LA8_0==29||LA8_0==31||(LA8_0>=42 && LA8_0<=45)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1043:1: (lv_commandsElse_10_0= ruleCommand )
                    	    {
                    	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1043:1: (lv_commandsElse_10_0= ruleCommand )
                    	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1044:3: lv_commandsElse_10_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIfAccess().getCommandsElseCommandParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCommand_in_ruleIf2305);
                    	    lv_commandsElse_10_0=ruleCommand();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIfRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"commandsElse",
                    	            		lv_commandsElse_10_0, 
                    	            		"Command");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    this_RBRACE_11=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleIf2317); 
                     
                        newLeafNode(this_RBRACE_11, grammarAccess.getIfAccess().getRBRACETerminalRuleCall_8_3()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleExpression"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1072:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1073:2: (iv_ruleExpression= ruleExpression EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1074:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2354);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2364); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1081:1: ruleExpression returns [EObject current=null] : ( () ( (lv_opNot_1_0= '!' ) )? ( (lv_left_2_0= ruleTerminalExpression ) ) ( ( (lv_op_3_0= ruleOperator ) ) ( (lv_right_4_0= ruleTerminalExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_opNot_1_0=null;
        EObject lv_left_2_0 = null;

        AntlrDatatypeRuleToken lv_op_3_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1084:28: ( ( () ( (lv_opNot_1_0= '!' ) )? ( (lv_left_2_0= ruleTerminalExpression ) ) ( ( (lv_op_3_0= ruleOperator ) ) ( (lv_right_4_0= ruleTerminalExpression ) ) )? ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1085:1: ( () ( (lv_opNot_1_0= '!' ) )? ( (lv_left_2_0= ruleTerminalExpression ) ) ( ( (lv_op_3_0= ruleOperator ) ) ( (lv_right_4_0= ruleTerminalExpression ) ) )? )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1085:1: ( () ( (lv_opNot_1_0= '!' ) )? ( (lv_left_2_0= ruleTerminalExpression ) ) ( ( (lv_op_3_0= ruleOperator ) ) ( (lv_right_4_0= ruleTerminalExpression ) ) )? )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1085:2: () ( (lv_opNot_1_0= '!' ) )? ( (lv_left_2_0= ruleTerminalExpression ) ) ( ( (lv_op_3_0= ruleOperator ) ) ( (lv_right_4_0= ruleTerminalExpression ) ) )?
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1085:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1086:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpressionAccess().getOperatorAction_0(),
                        current);
                

            }

            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1091:2: ( (lv_opNot_1_0= '!' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1092:1: (lv_opNot_1_0= '!' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1092:1: (lv_opNot_1_0= '!' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1093:3: lv_opNot_1_0= '!'
                    {
                    lv_opNot_1_0=(Token)match(input,31,FOLLOW_31_in_ruleExpression2416); 

                            newLeafNode(lv_opNot_1_0, grammarAccess.getExpressionAccess().getOpNotExclamationMarkKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "opNot", lv_opNot_1_0, "!");
                    	    

                    }


                    }
                    break;

            }

            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1106:3: ( (lv_left_2_0= ruleTerminalExpression ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1107:1: (lv_left_2_0= ruleTerminalExpression )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1107:1: (lv_left_2_0= ruleTerminalExpression )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1108:3: lv_left_2_0= ruleTerminalExpression
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getLeftTerminalExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression2451);
            lv_left_2_0=ruleTerminalExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_2_0, 
                    		"TerminalExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1124:2: ( ( (lv_op_3_0= ruleOperator ) ) ( (lv_right_4_0= ruleTerminalExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=32 && LA11_0<=41)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1124:3: ( (lv_op_3_0= ruleOperator ) ) ( (lv_right_4_0= ruleTerminalExpression ) )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1124:3: ( (lv_op_3_0= ruleOperator ) )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1125:1: (lv_op_3_0= ruleOperator )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1125:1: (lv_op_3_0= ruleOperator )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1126:3: lv_op_3_0= ruleOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getOpOperatorParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperator_in_ruleExpression2473);
                    lv_op_3_0=ruleOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_3_0, 
                            		"Operator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1142:2: ( (lv_right_4_0= ruleTerminalExpression ) )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1143:1: (lv_right_4_0= ruleTerminalExpression )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1143:1: (lv_right_4_0= ruleTerminalExpression )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1144:3: lv_right_4_0= ruleTerminalExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression2494);
                    lv_right_4_0=ruleTerminalExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_4_0, 
                            		"TerminalExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1168:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1169:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1170:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression2532);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression2542); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1177:1: ruleTerminalExpression returns [EObject current=null] : ( (this_LPAR_0= RULE_LPAR this_Expression_1= ruleExpression this_RPAR_2= RULE_RPAR ) | ( (lv_expr_3_0= ruleBooleans ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token this_LPAR_0=null;
        Token this_RPAR_2=null;
        EObject this_Expression_1 = null;

        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1180:28: ( ( (this_LPAR_0= RULE_LPAR this_Expression_1= ruleExpression this_RPAR_2= RULE_RPAR ) | ( (lv_expr_3_0= ruleBooleans ) ) ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1181:1: ( (this_LPAR_0= RULE_LPAR this_Expression_1= ruleExpression this_RPAR_2= RULE_RPAR ) | ( (lv_expr_3_0= ruleBooleans ) ) )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1181:1: ( (this_LPAR_0= RULE_LPAR this_Expression_1= ruleExpression this_RPAR_2= RULE_RPAR ) | ( (lv_expr_3_0= ruleBooleans ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LPAR) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=21 && LA12_0<=22)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1181:2: (this_LPAR_0= RULE_LPAR this_Expression_1= ruleExpression this_RPAR_2= RULE_RPAR )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1181:2: (this_LPAR_0= RULE_LPAR this_Expression_1= ruleExpression this_RPAR_2= RULE_RPAR )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1181:3: this_LPAR_0= RULE_LPAR this_Expression_1= ruleExpression this_RPAR_2= RULE_RPAR
                    {
                    this_LPAR_0=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_ruleTerminalExpression2579); 
                     
                        newLeafNode(this_LPAR_0, grammarAccess.getTerminalExpressionAccess().getLPARTerminalRuleCall_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression2600);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    this_RPAR_2=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleTerminalExpression2610); 
                     
                        newLeafNode(this_RPAR_2, grammarAccess.getTerminalExpressionAccess().getRPARTerminalRuleCall_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1199:6: ( (lv_expr_3_0= ruleBooleans ) )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1199:6: ( (lv_expr_3_0= ruleBooleans ) )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1200:1: (lv_expr_3_0= ruleBooleans )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1200:1: (lv_expr_3_0= ruleBooleans )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1201:3: lv_expr_3_0= ruleBooleans
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprBooleansParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBooleans_in_ruleTerminalExpression2637);
                    lv_expr_3_0=ruleBooleans();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_3_0, 
                            		"Booleans");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleBooleans"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1225:1: entryRuleBooleans returns [EObject current=null] : iv_ruleBooleans= ruleBooleans EOF ;
    public final EObject entryRuleBooleans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleans = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1226:2: (iv_ruleBooleans= ruleBooleans EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1227:2: iv_ruleBooleans= ruleBooleans EOF
            {
             newCompositeNode(grammarAccess.getBooleansRule()); 
            pushFollow(FOLLOW_ruleBooleans_in_entryRuleBooleans2673);
            iv_ruleBooleans=ruleBooleans();

            state._fsp--;

             current =iv_ruleBooleans; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleans2683); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleans"


    // $ANTLR start "ruleBooleans"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1234:1: ruleBooleans returns [EObject current=null] : (this_HayBolitas_0= ruleHayBolitas | this_PuedeMover_1= rulePuedeMover ) ;
    public final EObject ruleBooleans() throws RecognitionException {
        EObject current = null;

        EObject this_HayBolitas_0 = null;

        EObject this_PuedeMover_1 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1237:28: ( (this_HayBolitas_0= ruleHayBolitas | this_PuedeMover_1= rulePuedeMover ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1238:1: (this_HayBolitas_0= ruleHayBolitas | this_PuedeMover_1= rulePuedeMover )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1238:1: (this_HayBolitas_0= ruleHayBolitas | this_PuedeMover_1= rulePuedeMover )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            else if ( (LA13_0==22) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1239:5: this_HayBolitas_0= ruleHayBolitas
                    {
                     
                            newCompositeNode(grammarAccess.getBooleansAccess().getHayBolitasParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHayBolitas_in_ruleBooleans2730);
                    this_HayBolitas_0=ruleHayBolitas();

                    state._fsp--;

                     
                            current = this_HayBolitas_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1249:5: this_PuedeMover_1= rulePuedeMover
                    {
                     
                            newCompositeNode(grammarAccess.getBooleansAccess().getPuedeMoverParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePuedeMover_in_ruleBooleans2757);
                    this_PuedeMover_1=rulePuedeMover();

                    state._fsp--;

                     
                            current = this_PuedeMover_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleans"


    // $ANTLR start "entryRuleOperator"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1265:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1266:2: (iv_ruleOperator= ruleOperator EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1267:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator2793);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator2804); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1274:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' | kw= '==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '!=' | kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1277:28: ( (kw= 'and' | kw= 'or' | kw= '==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '!=' | kw= '+' | kw= '-' ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1278:1: (kw= 'and' | kw= 'or' | kw= '==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '!=' | kw= '+' | kw= '-' )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1278:1: (kw= 'and' | kw= 'or' | kw= '==' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '!=' | kw= '+' | kw= '-' )
            int alt14=10;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt14=1;
                }
                break;
            case 33:
                {
                alt14=2;
                }
                break;
            case 34:
                {
                alt14=3;
                }
                break;
            case 35:
                {
                alt14=4;
                }
                break;
            case 36:
                {
                alt14=5;
                }
                break;
            case 37:
                {
                alt14=6;
                }
                break;
            case 38:
                {
                alt14=7;
                }
                break;
            case 39:
                {
                alt14=8;
                }
                break;
            case 40:
                {
                alt14=9;
                }
                break;
            case 41:
                {
                alt14=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1279:2: kw= 'and'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOperator2842); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getAndKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1286:2: kw= 'or'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOperator2861); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getOrKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1293:2: kw= '=='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOperator2880); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1300:2: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOperator2899); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1307:2: kw= '>'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOperator2918); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1314:2: kw= '<='
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOperator2937); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1321:2: kw= '>='
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOperator2956); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1328:2: kw= '!='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOperator2975); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1335:2: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOperator2994); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1342:2: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOperator3013); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_9()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleColor"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1355:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'Verde' ) | (enumLiteral_1= 'Rojo' ) | (enumLiteral_2= 'Azul' ) | (enumLiteral_3= 'Negro' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1357:28: ( ( (enumLiteral_0= 'Verde' ) | (enumLiteral_1= 'Rojo' ) | (enumLiteral_2= 'Azul' ) | (enumLiteral_3= 'Negro' ) ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1358:1: ( (enumLiteral_0= 'Verde' ) | (enumLiteral_1= 'Rojo' ) | (enumLiteral_2= 'Azul' ) | (enumLiteral_3= 'Negro' ) )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1358:1: ( (enumLiteral_0= 'Verde' ) | (enumLiteral_1= 'Rojo' ) | (enumLiteral_2= 'Azul' ) | (enumLiteral_3= 'Negro' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt15=1;
                }
                break;
            case 43:
                {
                alt15=2;
                }
                break;
            case 44:
                {
                alt15=3;
                }
                break;
            case 45:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1358:2: (enumLiteral_0= 'Verde' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1358:2: (enumLiteral_0= 'Verde' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1358:4: enumLiteral_0= 'Verde'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleColor3067); 

                            current = grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1364:6: (enumLiteral_1= 'Rojo' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1364:6: (enumLiteral_1= 'Rojo' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1364:8: enumLiteral_1= 'Rojo'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleColor3084); 

                            current = grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1370:6: (enumLiteral_2= 'Azul' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1370:6: (enumLiteral_2= 'Azul' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1370:8: enumLiteral_2= 'Azul'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_44_in_ruleColor3101); 

                            current = grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1376:6: (enumLiteral_3= 'Negro' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1376:6: (enumLiteral_3= 'Negro' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1376:8: enumLiteral_3= 'Negro'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_45_in_ruleColor3118); 

                            current = grammarAccess.getColorAccess().getNegroEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getNegroEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleDireccion"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1386:1: ruleDireccion returns [Enumerator current=null] : ( (enumLiteral_0= 'Norte' ) | (enumLiteral_1= 'Sur' ) | (enumLiteral_2= 'Este' ) | (enumLiteral_3= 'Oeste' ) ) ;
    public final Enumerator ruleDireccion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1388:28: ( ( (enumLiteral_0= 'Norte' ) | (enumLiteral_1= 'Sur' ) | (enumLiteral_2= 'Este' ) | (enumLiteral_3= 'Oeste' ) ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1389:1: ( (enumLiteral_0= 'Norte' ) | (enumLiteral_1= 'Sur' ) | (enumLiteral_2= 'Este' ) | (enumLiteral_3= 'Oeste' ) )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1389:1: ( (enumLiteral_0= 'Norte' ) | (enumLiteral_1= 'Sur' ) | (enumLiteral_2= 'Este' ) | (enumLiteral_3= 'Oeste' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt16=1;
                }
                break;
            case 47:
                {
                alt16=2;
                }
                break;
            case 48:
                {
                alt16=3;
                }
                break;
            case 49:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1389:2: (enumLiteral_0= 'Norte' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1389:2: (enumLiteral_0= 'Norte' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1389:4: enumLiteral_0= 'Norte'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleDireccion3163); 

                            current = grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1395:6: (enumLiteral_1= 'Sur' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1395:6: (enumLiteral_1= 'Sur' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1395:8: enumLiteral_1= 'Sur'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleDireccion3180); 

                            current = grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1401:6: (enumLiteral_2= 'Este' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1401:6: (enumLiteral_2= 'Este' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1401:8: enumLiteral_2= 'Este'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_48_in_ruleDireccion3197); 

                            current = grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1407:6: (enumLiteral_3= 'Oeste' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1407:6: (enumLiteral_3= 'Oeste' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:1407:8: enumLiteral_3= 'Oeste'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_49_in_ruleDireccion3214); 

                            current = grammarAccess.getDireccionAccess().getOesteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDireccionAccess().getOesteEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDireccion"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA2_eotS =
        "\27\uffff";
    static final String DFA2_eofS =
        "\27\uffff";
    static final String DFA2_minS =
        "\1\7\4\uffff\2\7\4\uffff\1\52\1\56\10\11\2\uffff";
    static final String DFA2_maxS =
        "\1\55\4\uffff\2\7\4\uffff\1\55\1\61\10\11\2\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\7\1\10\1\11\1\12\12\uffff\1\5"+
        "\1\6";
    static final String DFA2_specialS =
        "\27\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\12\10\uffff\1\3\1\uffff\1\4\1\1\1\2\1\5\1\6\1\12\1\uffff"+
            "\1\10\1\11\2\uffff\1\7\1\uffff\1\12\12\uffff\4\11",
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
            return "189:1: (this_Poner_0= rulePoner | this_Mover_1= ruleMover | this_PonerN_2= rulePonerN | this_MoverN_3= ruleMoverN | this_HayBolitas_4= ruleHayBolitas | this_PuedeMover_5= rulePuedeMover | this_If_6= ruleIf | this_While_7= ruleWhile | this_For_8= ruleFor | this_Variable_9= ruleVariable )";
        }
    }
    static final String DFA3_eotS =
        "\21\uffff";
    static final String DFA3_eofS =
        "\21\uffff";
    static final String DFA3_minS =
        "\1\7\1\uffff\2\7\1\uffff\1\52\1\56\10\11\2\uffff";
    static final String DFA3_maxS =
        "\1\37\1\uffff\2\7\1\uffff\1\55\1\61\10\11\2\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\12\uffff\2\2";
    static final String DFA3_specialS =
        "\21\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\4\15\uffff\1\2\1\3\1\1\7\uffff\1\4",
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "683:1: ( ( () otherlv_1= 'var' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= '=' this_INT_4= RULE_INT ) | this_Booleans_5= ruleBooleans | this_Expression_6= ruleExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleProcedure212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleProcedure245 = new BitSet(new long[]{0x00003C00A6FD00C0L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleProcedure265 = new BitSet(new long[]{0x00003C00A6FD00C0L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleProcedure277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_ruleCommand369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_ruleCommand396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePonerN_in_ruleCommand423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoverN_in_ruleCommand450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_ruleCommand477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePuedeMover_in_ruleCommand504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_ruleCommand531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleCommand558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_ruleCommand585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCommand612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePonerN_in_entryRulePonerN647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePonerN657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePonerN703 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rulePonerN714 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePonerN730 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePonerN747 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleColor_in_rulePonerN768 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rulePonerN779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoverN_in_entryRuleMoverN814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMoverN824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMoverN870 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_ruleMoverN881 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMoverN897 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMoverN914 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_ruleDireccion_in_ruleMoverN935 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleMoverN946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_entryRulePoner981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoner991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePoner1037 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rulePoner1048 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleColor_in_rulePoner1068 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rulePoner1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_entryRuleMover1114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMover1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMover1170 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_ruleMover1181 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_ruleDireccion_in_ruleMover1201 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleMover1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_entryRuleHayBolitas1247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHayBolitas1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleHayBolitas1294 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_ruleHayBolitas1305 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleHayBolitas1325 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleHayBolitas1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePuedeMover_in_entryRulePuedeMover1371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePuedeMover1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePuedeMover1418 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rulePuedeMover1429 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_ruleDireccion_in_rulePuedeMover1449 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rulePuedeMover1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleVariable1552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1569 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleVariable1586 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariable1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleans_in_ruleVariable1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariable1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleWhile1743 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_ruleWhile1754 = new BitSet(new long[]{0x00003C00A6FD0080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhile1774 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleWhile1785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleWhile1795 = new BitSet(new long[]{0x00003C00A6FD00C0L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleWhile1815 = new BitSet(new long[]{0x00003C00A6FD00C0L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleWhile1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFor1919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFor1936 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFor1953 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFor1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_ruleFor1992 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFor2004 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFor2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_ruleFor2043 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleFor2054 = new BitSet(new long[]{0x00003C00A6FD00C0L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleFor2074 = new BitSet(new long[]{0x00003C00A6FD00C0L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleFor2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf2122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleIf2178 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_ruleIf2189 = new BitSet(new long[]{0x00003C00A6FD0080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIf2209 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleIf2220 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleIf2230 = new BitSet(new long[]{0x00003C00A6FD0080L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleIf2250 = new BitSet(new long[]{0x00003C00A6FD00C0L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleIf2262 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleIf2274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleIf2285 = new BitSet(new long[]{0x00003C00A6FD0080L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleIf2305 = new BitSet(new long[]{0x00003C00A6FD00C0L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleIf2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleExpression2416 = new BitSet(new long[]{0x00003C00A6FD0080L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression2451 = new BitSet(new long[]{0x000003FF00000002L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleExpression2473 = new BitSet(new long[]{0x00003C00A6FD0080L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression2532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_ruleTerminalExpression2579 = new BitSet(new long[]{0x00003C00A6FD0080L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression2600 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleTerminalExpression2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleans_in_ruleTerminalExpression2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleans_in_entryRuleBooleans2673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleans2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_ruleBooleans2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePuedeMover_in_ruleBooleans2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator2793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOperator2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOperator2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOperator2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOperator2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOperator2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOperator2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperator2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOperator2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOperator2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOperator3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleColor3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleColor3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleColor3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleColor3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDireccion3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDireccion3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDireccion3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDireccion3214 = new BitSet(new long[]{0x0000000000000002L});

}