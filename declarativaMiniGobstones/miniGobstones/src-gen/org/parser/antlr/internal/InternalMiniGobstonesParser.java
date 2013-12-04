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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LBRACE", "RULE_RBRACE", "RULE_LPAR", "RULE_INT", "RULE_RPAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procedure'", "'PonerN'", "','", "'MoverN'", "'Poner'", "'Mover'", "'hayBolitas'", "'puedeMover'", "'if'", "'else'", "'Verde'", "'Rojo'", "'Azul'", "'Negro'", "'Norte'", "'Sur'", "'Este'", "'Oeste'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int RULE_RBRACE=6;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_LPAR=7;
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
    public static final int RULE_RPAR=9;
    public static final int RULE_INT=8;
    public static final int RULE_LBRACE=5;
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

                if ( (LA1_0==16||(LA1_0>=18 && LA1_0<=23)) ) {
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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:185:1: ruleCommand returns [EObject current=null] : (this_Poner_0= rulePoner | this_Mover_1= ruleMover | this_PonerN_2= rulePonerN | this_MoverN_3= ruleMoverN | this_HayBolitas_4= ruleHayBolitas | this_PuedeMover_5= rulePuedeMover | this_If_6= ruleIf ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Poner_0 = null;

        EObject this_Mover_1 = null;

        EObject this_PonerN_2 = null;

        EObject this_MoverN_3 = null;

        EObject this_HayBolitas_4 = null;

        EObject this_PuedeMover_5 = null;

        EObject this_If_6 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:188:28: ( (this_Poner_0= rulePoner | this_Mover_1= ruleMover | this_PonerN_2= rulePonerN | this_MoverN_3= ruleMoverN | this_HayBolitas_4= ruleHayBolitas | this_PuedeMover_5= rulePuedeMover | this_If_6= ruleIf ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:189:1: (this_Poner_0= rulePoner | this_Mover_1= ruleMover | this_PonerN_2= rulePonerN | this_MoverN_3= ruleMoverN | this_HayBolitas_4= ruleHayBolitas | this_PuedeMover_5= rulePuedeMover | this_If_6= ruleIf )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:189:1: (this_Poner_0= rulePoner | this_Mover_1= ruleMover | this_PonerN_2= rulePonerN | this_MoverN_3= ruleMoverN | this_HayBolitas_4= ruleHayBolitas | this_PuedeMover_5= rulePuedeMover | this_If_6= ruleIf )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 21:
                {
                alt2=5;
                }
                break;
            case 22:
                {
                alt2=6;
                }
                break;
            case 23:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:266:1: entryRulePonerN returns [EObject current=null] : iv_rulePonerN= rulePonerN EOF ;
    public final EObject entryRulePonerN() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePonerN = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:267:2: (iv_rulePonerN= rulePonerN EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:268:2: iv_rulePonerN= rulePonerN EOF
            {
             newCompositeNode(grammarAccess.getPonerNRule()); 
            pushFollow(FOLLOW_rulePonerN_in_entryRulePonerN566);
            iv_rulePonerN=rulePonerN();

            state._fsp--;

             current =iv_rulePonerN; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePonerN576); 

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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:275:1: rulePonerN returns [EObject current=null] : ( () otherlv_1= 'PonerN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_color_5_0= ruleColor ) ) this_RPAR_6= RULE_RPAR ) ;
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
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:278:28: ( ( () otherlv_1= 'PonerN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_color_5_0= ruleColor ) ) this_RPAR_6= RULE_RPAR ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:279:1: ( () otherlv_1= 'PonerN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_color_5_0= ruleColor ) ) this_RPAR_6= RULE_RPAR )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:279:1: ( () otherlv_1= 'PonerN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_color_5_0= ruleColor ) ) this_RPAR_6= RULE_RPAR )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:279:2: () otherlv_1= 'PonerN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_color_5_0= ruleColor ) ) this_RPAR_6= RULE_RPAR
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:279:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:280:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPonerNAccess().getPonerNAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulePonerN622); 

                	newLeafNode(otherlv_1, grammarAccess.getPonerNAccess().getPonerNKeyword_1());
                
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rulePonerN633); 
             
                newLeafNode(this_LPAR_2, grammarAccess.getPonerNAccess().getLPARTerminalRuleCall_2()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:293:1: ( (lv_int_3_0= RULE_INT ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:294:1: (lv_int_3_0= RULE_INT )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:294:1: (lv_int_3_0= RULE_INT )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:295:3: lv_int_3_0= RULE_INT
            {
            lv_int_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePonerN649); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulePonerN666); 

                	newLeafNode(otherlv_4, grammarAccess.getPonerNAccess().getCommaKeyword_4());
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:315:1: ( (lv_color_5_0= ruleColor ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:316:1: (lv_color_5_0= ruleColor )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:316:1: (lv_color_5_0= ruleColor )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:317:3: lv_color_5_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getPonerNAccess().getColorColorEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_rulePonerN687);
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

            this_RPAR_6=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rulePonerN698); 
             
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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:345:1: entryRuleMoverN returns [EObject current=null] : iv_ruleMoverN= ruleMoverN EOF ;
    public final EObject entryRuleMoverN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoverN = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:346:2: (iv_ruleMoverN= ruleMoverN EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:347:2: iv_ruleMoverN= ruleMoverN EOF
            {
             newCompositeNode(grammarAccess.getMoverNRule()); 
            pushFollow(FOLLOW_ruleMoverN_in_entryRuleMoverN733);
            iv_ruleMoverN=ruleMoverN();

            state._fsp--;

             current =iv_ruleMoverN; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMoverN743); 

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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:354:1: ruleMoverN returns [EObject current=null] : ( () otherlv_1= 'MoverN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_dir_5_0= ruleDireccion ) ) this_RPAR_6= RULE_RPAR ) ;
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
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:357:28: ( ( () otherlv_1= 'MoverN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_dir_5_0= ruleDireccion ) ) this_RPAR_6= RULE_RPAR ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:358:1: ( () otherlv_1= 'MoverN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_dir_5_0= ruleDireccion ) ) this_RPAR_6= RULE_RPAR )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:358:1: ( () otherlv_1= 'MoverN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_dir_5_0= ruleDireccion ) ) this_RPAR_6= RULE_RPAR )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:358:2: () otherlv_1= 'MoverN' this_LPAR_2= RULE_LPAR ( (lv_int_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_dir_5_0= ruleDireccion ) ) this_RPAR_6= RULE_RPAR
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:358:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:359:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMoverNAccess().getMoverNAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleMoverN789); 

                	newLeafNode(otherlv_1, grammarAccess.getMoverNAccess().getMoverNKeyword_1());
                
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_ruleMoverN800); 
             
                newLeafNode(this_LPAR_2, grammarAccess.getMoverNAccess().getLPARTerminalRuleCall_2()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:372:1: ( (lv_int_3_0= RULE_INT ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:373:1: (lv_int_3_0= RULE_INT )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:373:1: (lv_int_3_0= RULE_INT )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:374:3: lv_int_3_0= RULE_INT
            {
            lv_int_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMoverN816); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleMoverN833); 

                	newLeafNode(otherlv_4, grammarAccess.getMoverNAccess().getCommaKeyword_4());
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:394:1: ( (lv_dir_5_0= ruleDireccion ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:395:1: (lv_dir_5_0= ruleDireccion )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:395:1: (lv_dir_5_0= ruleDireccion )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:396:3: lv_dir_5_0= ruleDireccion
            {
             
            	        newCompositeNode(grammarAccess.getMoverNAccess().getDirDireccionEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleDireccion_in_ruleMoverN854);
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

            this_RPAR_6=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleMoverN865); 
             
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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:424:1: entryRulePoner returns [EObject current=null] : iv_rulePoner= rulePoner EOF ;
    public final EObject entryRulePoner() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoner = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:425:2: (iv_rulePoner= rulePoner EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:426:2: iv_rulePoner= rulePoner EOF
            {
             newCompositeNode(grammarAccess.getPonerRule()); 
            pushFollow(FOLLOW_rulePoner_in_entryRulePoner900);
            iv_rulePoner=rulePoner();

            state._fsp--;

             current =iv_rulePoner; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoner910); 

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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:433:1: rulePoner returns [EObject current=null] : ( () otherlv_1= 'Poner' this_LPAR_2= RULE_LPAR ( (lv_color_3_0= ruleColor ) ) this_RPAR_4= RULE_RPAR ) ;
    public final EObject rulePoner() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LPAR_2=null;
        Token this_RPAR_4=null;
        Enumerator lv_color_3_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:436:28: ( ( () otherlv_1= 'Poner' this_LPAR_2= RULE_LPAR ( (lv_color_3_0= ruleColor ) ) this_RPAR_4= RULE_RPAR ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:437:1: ( () otherlv_1= 'Poner' this_LPAR_2= RULE_LPAR ( (lv_color_3_0= ruleColor ) ) this_RPAR_4= RULE_RPAR )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:437:1: ( () otherlv_1= 'Poner' this_LPAR_2= RULE_LPAR ( (lv_color_3_0= ruleColor ) ) this_RPAR_4= RULE_RPAR )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:437:2: () otherlv_1= 'Poner' this_LPAR_2= RULE_LPAR ( (lv_color_3_0= ruleColor ) ) this_RPAR_4= RULE_RPAR
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:437:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:438:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPonerAccess().getPonerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_rulePoner956); 

                	newLeafNode(otherlv_1, grammarAccess.getPonerAccess().getPonerKeyword_1());
                
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rulePoner967); 
             
                newLeafNode(this_LPAR_2, grammarAccess.getPonerAccess().getLPARTerminalRuleCall_2()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:451:1: ( (lv_color_3_0= ruleColor ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:452:1: (lv_color_3_0= ruleColor )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:452:1: (lv_color_3_0= ruleColor )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:453:3: lv_color_3_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getPonerAccess().getColorColorEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_rulePoner987);
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

            this_RPAR_4=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rulePoner998); 
             
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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:481:1: entryRuleMover returns [EObject current=null] : iv_ruleMover= ruleMover EOF ;
    public final EObject entryRuleMover() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMover = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:482:2: (iv_ruleMover= ruleMover EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:483:2: iv_ruleMover= ruleMover EOF
            {
             newCompositeNode(grammarAccess.getMoverRule()); 
            pushFollow(FOLLOW_ruleMover_in_entryRuleMover1033);
            iv_ruleMover=ruleMover();

            state._fsp--;

             current =iv_ruleMover; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMover1043); 

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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:490:1: ruleMover returns [EObject current=null] : ( () otherlv_1= 'Mover' this_LPAR_2= RULE_LPAR ( (lv_dir_3_0= ruleDireccion ) ) this_RPAR_4= RULE_RPAR ) ;
    public final EObject ruleMover() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LPAR_2=null;
        Token this_RPAR_4=null;
        Enumerator lv_dir_3_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:493:28: ( ( () otherlv_1= 'Mover' this_LPAR_2= RULE_LPAR ( (lv_dir_3_0= ruleDireccion ) ) this_RPAR_4= RULE_RPAR ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:494:1: ( () otherlv_1= 'Mover' this_LPAR_2= RULE_LPAR ( (lv_dir_3_0= ruleDireccion ) ) this_RPAR_4= RULE_RPAR )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:494:1: ( () otherlv_1= 'Mover' this_LPAR_2= RULE_LPAR ( (lv_dir_3_0= ruleDireccion ) ) this_RPAR_4= RULE_RPAR )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:494:2: () otherlv_1= 'Mover' this_LPAR_2= RULE_LPAR ( (lv_dir_3_0= ruleDireccion ) ) this_RPAR_4= RULE_RPAR
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:494:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:495:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMoverAccess().getMoverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMover1089); 

                	newLeafNode(otherlv_1, grammarAccess.getMoverAccess().getMoverKeyword_1());
                
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_ruleMover1100); 
             
                newLeafNode(this_LPAR_2, grammarAccess.getMoverAccess().getLPARTerminalRuleCall_2()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:508:1: ( (lv_dir_3_0= ruleDireccion ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:509:1: (lv_dir_3_0= ruleDireccion )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:509:1: (lv_dir_3_0= ruleDireccion )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:510:3: lv_dir_3_0= ruleDireccion
            {
             
            	        newCompositeNode(grammarAccess.getMoverAccess().getDirDireccionEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDireccion_in_ruleMover1120);
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

            this_RPAR_4=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleMover1131); 
             
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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:538:1: entryRuleHayBolitas returns [EObject current=null] : iv_ruleHayBolitas= ruleHayBolitas EOF ;
    public final EObject entryRuleHayBolitas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHayBolitas = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:539:2: (iv_ruleHayBolitas= ruleHayBolitas EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:540:2: iv_ruleHayBolitas= ruleHayBolitas EOF
            {
             newCompositeNode(grammarAccess.getHayBolitasRule()); 
            pushFollow(FOLLOW_ruleHayBolitas_in_entryRuleHayBolitas1166);
            iv_ruleHayBolitas=ruleHayBolitas();

            state._fsp--;

             current =iv_ruleHayBolitas; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHayBolitas1176); 

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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:547:1: ruleHayBolitas returns [EObject current=null] : (otherlv_0= 'hayBolitas' this_LPAR_1= RULE_LPAR ( (lv_color_2_0= ruleColor ) ) this_RPAR_3= RULE_RPAR ) ;
    public final EObject ruleHayBolitas() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LPAR_1=null;
        Token this_RPAR_3=null;
        Enumerator lv_color_2_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:550:28: ( (otherlv_0= 'hayBolitas' this_LPAR_1= RULE_LPAR ( (lv_color_2_0= ruleColor ) ) this_RPAR_3= RULE_RPAR ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:551:1: (otherlv_0= 'hayBolitas' this_LPAR_1= RULE_LPAR ( (lv_color_2_0= ruleColor ) ) this_RPAR_3= RULE_RPAR )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:551:1: (otherlv_0= 'hayBolitas' this_LPAR_1= RULE_LPAR ( (lv_color_2_0= ruleColor ) ) this_RPAR_3= RULE_RPAR )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:551:3: otherlv_0= 'hayBolitas' this_LPAR_1= RULE_LPAR ( (lv_color_2_0= ruleColor ) ) this_RPAR_3= RULE_RPAR
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleHayBolitas1213); 

                	newLeafNode(otherlv_0, grammarAccess.getHayBolitasAccess().getHayBolitasKeyword_0());
                
            this_LPAR_1=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_ruleHayBolitas1224); 
             
                newLeafNode(this_LPAR_1, grammarAccess.getHayBolitasAccess().getLPARTerminalRuleCall_1()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:559:1: ( (lv_color_2_0= ruleColor ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:560:1: (lv_color_2_0= ruleColor )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:560:1: (lv_color_2_0= ruleColor )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:561:3: lv_color_2_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getHayBolitasAccess().getColorColorEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleHayBolitas1244);
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

            this_RPAR_3=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleHayBolitas1255); 
             
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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:589:1: entryRulePuedeMover returns [EObject current=null] : iv_rulePuedeMover= rulePuedeMover EOF ;
    public final EObject entryRulePuedeMover() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePuedeMover = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:590:2: (iv_rulePuedeMover= rulePuedeMover EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:591:2: iv_rulePuedeMover= rulePuedeMover EOF
            {
             newCompositeNode(grammarAccess.getPuedeMoverRule()); 
            pushFollow(FOLLOW_rulePuedeMover_in_entryRulePuedeMover1290);
            iv_rulePuedeMover=rulePuedeMover();

            state._fsp--;

             current =iv_rulePuedeMover; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePuedeMover1300); 

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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:598:1: rulePuedeMover returns [EObject current=null] : (otherlv_0= 'puedeMover' this_LPAR_1= RULE_LPAR ( (lv_dir_2_0= ruleDireccion ) ) this_RPAR_3= RULE_RPAR ) ;
    public final EObject rulePuedeMover() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LPAR_1=null;
        Token this_RPAR_3=null;
        Enumerator lv_dir_2_0 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:601:28: ( (otherlv_0= 'puedeMover' this_LPAR_1= RULE_LPAR ( (lv_dir_2_0= ruleDireccion ) ) this_RPAR_3= RULE_RPAR ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:602:1: (otherlv_0= 'puedeMover' this_LPAR_1= RULE_LPAR ( (lv_dir_2_0= ruleDireccion ) ) this_RPAR_3= RULE_RPAR )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:602:1: (otherlv_0= 'puedeMover' this_LPAR_1= RULE_LPAR ( (lv_dir_2_0= ruleDireccion ) ) this_RPAR_3= RULE_RPAR )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:602:3: otherlv_0= 'puedeMover' this_LPAR_1= RULE_LPAR ( (lv_dir_2_0= ruleDireccion ) ) this_RPAR_3= RULE_RPAR
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulePuedeMover1337); 

                	newLeafNode(otherlv_0, grammarAccess.getPuedeMoverAccess().getPuedeMoverKeyword_0());
                
            this_LPAR_1=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rulePuedeMover1348); 
             
                newLeafNode(this_LPAR_1, grammarAccess.getPuedeMoverAccess().getLPARTerminalRuleCall_1()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:610:1: ( (lv_dir_2_0= ruleDireccion ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:611:1: (lv_dir_2_0= ruleDireccion )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:611:1: (lv_dir_2_0= ruleDireccion )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:612:3: lv_dir_2_0= ruleDireccion
            {
             
            	        newCompositeNode(grammarAccess.getPuedeMoverAccess().getDirDireccionEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDireccion_in_rulePuedeMover1368);
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

            this_RPAR_3=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rulePuedeMover1379); 
             
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


    // $ANTLR start "entryRuleIf"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:640:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:641:2: (iv_ruleIf= ruleIf EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:642:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf1414);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf1424); 

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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:649:1: ruleIf returns [EObject current=null] : ( () otherlv_1= 'if' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleBooleans ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commandsThen_6_0= ruleCommand ) )+ this_RBRACE_7= RULE_RBRACE (otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE )? ) ;
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
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:652:28: ( ( () otherlv_1= 'if' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleBooleans ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commandsThen_6_0= ruleCommand ) )+ this_RBRACE_7= RULE_RBRACE (otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE )? ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:653:1: ( () otherlv_1= 'if' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleBooleans ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commandsThen_6_0= ruleCommand ) )+ this_RBRACE_7= RULE_RBRACE (otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE )? )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:653:1: ( () otherlv_1= 'if' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleBooleans ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commandsThen_6_0= ruleCommand ) )+ this_RBRACE_7= RULE_RBRACE (otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE )? )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:653:2: () otherlv_1= 'if' this_LPAR_2= RULE_LPAR ( (lv_expr_3_0= ruleBooleans ) ) this_RPAR_4= RULE_RPAR this_LBRACE_5= RULE_LBRACE ( (lv_commandsThen_6_0= ruleCommand ) )+ this_RBRACE_7= RULE_RBRACE (otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE )?
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:653:2: ()
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:654:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIfAccess().getIfAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleIf1470); 

                	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
                
            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_ruleIf1481); 
             
                newLeafNode(this_LPAR_2, grammarAccess.getIfAccess().getLPARTerminalRuleCall_2()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:667:1: ( (lv_expr_3_0= ruleBooleans ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:668:1: (lv_expr_3_0= ruleBooleans )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:668:1: (lv_expr_3_0= ruleBooleans )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:669:3: lv_expr_3_0= ruleBooleans
            {
             
            	        newCompositeNode(grammarAccess.getIfAccess().getExprBooleansParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleans_in_ruleIf1501);
            lv_expr_3_0=ruleBooleans();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"Booleans");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RPAR_4=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleIf1512); 
             
                newLeafNode(this_RPAR_4, grammarAccess.getIfAccess().getRPARTerminalRuleCall_4()); 
                
            this_LBRACE_5=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleIf1522); 
             
                newLeafNode(this_LBRACE_5, grammarAccess.getIfAccess().getLBRACETerminalRuleCall_5()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:693:1: ( (lv_commandsThen_6_0= ruleCommand ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||(LA3_0>=18 && LA3_0<=23)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:694:1: (lv_commandsThen_6_0= ruleCommand )
            	    {
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:694:1: (lv_commandsThen_6_0= ruleCommand )
            	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:695:3: lv_commandsThen_6_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfAccess().getCommandsThenCommandParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleIf1542);
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            this_RBRACE_7=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleIf1554); 
             
                newLeafNode(this_RBRACE_7, grammarAccess.getIfAccess().getRBRACETerminalRuleCall_7()); 
                
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:715:1: (otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:715:3: otherlv_8= 'else' this_LBRACE_9= RULE_LBRACE ( (lv_commandsElse_10_0= ruleCommand ) )+ this_RBRACE_11= RULE_RBRACE
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleIf1566); 

                        	newLeafNode(otherlv_8, grammarAccess.getIfAccess().getElseKeyword_8_0());
                        
                    this_LBRACE_9=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleIf1577); 
                     
                        newLeafNode(this_LBRACE_9, grammarAccess.getIfAccess().getLBRACETerminalRuleCall_8_1()); 
                        
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:723:1: ( (lv_commandsElse_10_0= ruleCommand ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16||(LA4_0>=18 && LA4_0<=23)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:724:1: (lv_commandsElse_10_0= ruleCommand )
                    	    {
                    	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:724:1: (lv_commandsElse_10_0= ruleCommand )
                    	    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:725:3: lv_commandsElse_10_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIfAccess().getCommandsElseCommandParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCommand_in_ruleIf1597);
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
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    this_RBRACE_11=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleIf1609); 
                     
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


    // $ANTLR start "entryRuleBooleans"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:753:1: entryRuleBooleans returns [EObject current=null] : iv_ruleBooleans= ruleBooleans EOF ;
    public final EObject entryRuleBooleans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleans = null;


        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:754:2: (iv_ruleBooleans= ruleBooleans EOF )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:755:2: iv_ruleBooleans= ruleBooleans EOF
            {
             newCompositeNode(grammarAccess.getBooleansRule()); 
            pushFollow(FOLLOW_ruleBooleans_in_entryRuleBooleans1646);
            iv_ruleBooleans=ruleBooleans();

            state._fsp--;

             current =iv_ruleBooleans; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleans1656); 

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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:762:1: ruleBooleans returns [EObject current=null] : (this_HayBolitas_0= ruleHayBolitas | this_PuedeMover_1= rulePuedeMover ) ;
    public final EObject ruleBooleans() throws RecognitionException {
        EObject current = null;

        EObject this_HayBolitas_0 = null;

        EObject this_PuedeMover_1 = null;


         enterRule(); 
            
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:765:28: ( (this_HayBolitas_0= ruleHayBolitas | this_PuedeMover_1= rulePuedeMover ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:766:1: (this_HayBolitas_0= ruleHayBolitas | this_PuedeMover_1= rulePuedeMover )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:766:1: (this_HayBolitas_0= ruleHayBolitas | this_PuedeMover_1= rulePuedeMover )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:767:5: this_HayBolitas_0= ruleHayBolitas
                    {
                     
                            newCompositeNode(grammarAccess.getBooleansAccess().getHayBolitasParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHayBolitas_in_ruleBooleans1703);
                    this_HayBolitas_0=ruleHayBolitas();

                    state._fsp--;

                     
                            current = this_HayBolitas_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:777:5: this_PuedeMover_1= rulePuedeMover
                    {
                     
                            newCompositeNode(grammarAccess.getBooleansAccess().getPuedeMoverParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePuedeMover_in_ruleBooleans1730);
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


    // $ANTLR start "ruleColor"
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:793:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'Verde' ) | (enumLiteral_1= 'Rojo' ) | (enumLiteral_2= 'Azul' ) | (enumLiteral_3= 'Negro' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:795:28: ( ( (enumLiteral_0= 'Verde' ) | (enumLiteral_1= 'Rojo' ) | (enumLiteral_2= 'Azul' ) | (enumLiteral_3= 'Negro' ) ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:796:1: ( (enumLiteral_0= 'Verde' ) | (enumLiteral_1= 'Rojo' ) | (enumLiteral_2= 'Azul' ) | (enumLiteral_3= 'Negro' ) )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:796:1: ( (enumLiteral_0= 'Verde' ) | (enumLiteral_1= 'Rojo' ) | (enumLiteral_2= 'Azul' ) | (enumLiteral_3= 'Negro' ) )
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
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:796:2: (enumLiteral_0= 'Verde' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:796:2: (enumLiteral_0= 'Verde' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:796:4: enumLiteral_0= 'Verde'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleColor1779); 

                            current = grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getVerdeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:802:6: (enumLiteral_1= 'Rojo' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:802:6: (enumLiteral_1= 'Rojo' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:802:8: enumLiteral_1= 'Rojo'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_ruleColor1796); 

                            current = grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getRojoEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:808:6: (enumLiteral_2= 'Azul' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:808:6: (enumLiteral_2= 'Azul' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:808:8: enumLiteral_2= 'Azul'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_27_in_ruleColor1813); 

                            current = grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getAzulEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:814:6: (enumLiteral_3= 'Negro' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:814:6: (enumLiteral_3= 'Negro' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:814:8: enumLiteral_3= 'Negro'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_28_in_ruleColor1830); 

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
    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:824:1: ruleDireccion returns [Enumerator current=null] : ( (enumLiteral_0= 'Norte' ) | (enumLiteral_1= 'Sur' ) | (enumLiteral_2= 'Este' ) | (enumLiteral_3= 'Oeste' ) ) ;
    public final Enumerator ruleDireccion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:826:28: ( ( (enumLiteral_0= 'Norte' ) | (enumLiteral_1= 'Sur' ) | (enumLiteral_2= 'Este' ) | (enumLiteral_3= 'Oeste' ) ) )
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:827:1: ( (enumLiteral_0= 'Norte' ) | (enumLiteral_1= 'Sur' ) | (enumLiteral_2= 'Este' ) | (enumLiteral_3= 'Oeste' ) )
            {
            // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:827:1: ( (enumLiteral_0= 'Norte' ) | (enumLiteral_1= 'Sur' ) | (enumLiteral_2= 'Este' ) | (enumLiteral_3= 'Oeste' ) )
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
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:827:2: (enumLiteral_0= 'Norte' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:827:2: (enumLiteral_0= 'Norte' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:827:4: enumLiteral_0= 'Norte'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleDireccion1875); 

                            current = grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDireccionAccess().getNorteEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:833:6: (enumLiteral_1= 'Sur' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:833:6: (enumLiteral_1= 'Sur' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:833:8: enumLiteral_1= 'Sur'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_30_in_ruleDireccion1892); 

                            current = grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDireccionAccess().getSurEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:839:6: (enumLiteral_2= 'Este' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:839:6: (enumLiteral_2= 'Este' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:839:8: enumLiteral_2= 'Este'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_31_in_ruleDireccion1909); 

                            current = grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDireccionAccess().getEsteEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:845:6: (enumLiteral_3= 'Oeste' )
                    {
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:845:6: (enumLiteral_3= 'Oeste' )
                    // ../miniGobstones/src-gen/org/parser/antlr/internal/InternalMiniGobstones.g:845:8: enumLiteral_3= 'Oeste'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_32_in_ruleDireccion1926); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleProcedure212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleProcedure245 = new BitSet(new long[]{0x0000000000FD0040L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleProcedure265 = new BitSet(new long[]{0x0000000000FD0040L});
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
    public static final BitSet FOLLOW_rulePonerN_in_entryRulePonerN566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePonerN576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePonerN622 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rulePonerN633 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePonerN649 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePonerN666 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_ruleColor_in_rulePonerN687 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rulePonerN698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoverN_in_entryRuleMoverN733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMoverN743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMoverN789 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_ruleMoverN800 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMoverN816 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMoverN833 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleDireccion_in_ruleMoverN854 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleMoverN865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoner_in_entryRulePoner900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoner910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePoner956 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rulePoner967 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_ruleColor_in_rulePoner987 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rulePoner998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMover_in_entryRuleMover1033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMover1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMover1089 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_ruleMover1100 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleDireccion_in_ruleMover1120 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleMover1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_entryRuleHayBolitas1166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHayBolitas1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleHayBolitas1213 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_ruleHayBolitas1224 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleHayBolitas1244 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleHayBolitas1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePuedeMover_in_entryRulePuedeMover1290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePuedeMover1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePuedeMover1337 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rulePuedeMover1348 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleDireccion_in_rulePuedeMover1368 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rulePuedeMover1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf1414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleIf1470 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_ruleIf1481 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_ruleBooleans_in_ruleIf1501 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleIf1512 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleIf1522 = new BitSet(new long[]{0x0000000000FD0000L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleIf1542 = new BitSet(new long[]{0x0000000000FD0040L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleIf1554 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleIf1566 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleIf1577 = new BitSet(new long[]{0x0000000000FD0000L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleIf1597 = new BitSet(new long[]{0x0000000000FD0040L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleIf1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleans_in_entryRuleBooleans1646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleans1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHayBolitas_in_ruleBooleans1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePuedeMover_in_ruleBooleans1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleColor1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleColor1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleColor1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleColor1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDireccion1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDireccion1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDireccion1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDireccion1926 = new BitSet(new long[]{0x0000000000000002L});

}