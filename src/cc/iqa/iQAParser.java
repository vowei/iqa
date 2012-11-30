// $ANTLR 3.4 cc/iqa/iQAParser.g 2012-07-20 13:15:41

package cc.iqa;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class iQAParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "AND", "BOM", "COLON", "COMMENTS", "COP", "DEDENT", "DIV", "ELIF", "ELSE", "EOP", "EQUAL", "Exponent", "FEATURE", "FEATURE_DEF", "FLOAT", "IDENTIFIER", "ID_START", "INDENT", "LPAREN", "MOD", "MUL", "NEWLINE", "NOT", "OR", "PIPE", "RPAREN", "SCENARIO", "SCENARIO_DEF", "SOP", "STAR", "STEP", "STRING", "SUB", "VARIABLE", "WHEN", "WHITE", "SCENARIO_LIST", "STEP_LIST", "STEP_TREE", "SUB_EXPR", "WHEN_TREE"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int AND=5;
    public static final int BOM=6;
    public static final int COLON=7;
    public static final int COMMENTS=8;
    public static final int COP=9;
    public static final int DEDENT=10;
    public static final int DIV=11;
    public static final int ELIF=12;
    public static final int ELSE=13;
    public static final int EOP=14;
    public static final int EQUAL=15;
    public static final int Exponent=16;
    public static final int FEATURE=17;
    public static final int FEATURE_DEF=18;
    public static final int FLOAT=19;
    public static final int IDENTIFIER=20;
    public static final int ID_START=21;
    public static final int INDENT=22;
    public static final int LPAREN=23;
    public static final int MOD=24;
    public static final int MUL=25;
    public static final int NEWLINE=26;
    public static final int NOT=27;
    public static final int OR=28;
    public static final int PIPE=29;
    public static final int RPAREN=30;
    public static final int SCENARIO=31;
    public static final int SCENARIO_DEF=32;
    public static final int SOP=33;
    public static final int STAR=34;
    public static final int STEP=35;
    public static final int STRING=36;
    public static final int SUB=37;
    public static final int VARIABLE=38;
    public static final int WHEN=39;
    public static final int WHITE=40;
    public static final int SCENARIO_LIST=41;
    public static final int STEP_LIST=42;
    public static final int STEP_TREE=43;
    public static final int SUB_EXPR=44;
    public static final int WHEN_TREE=45;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public iQAParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public iQAParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return iQAParser.tokenNames; }
    public String getGrammarFileName() { return "cc/iqa/iQAParser.g"; }


    private List<String> _errors = new ArrayList<String>();

    public String getErrorMessage(RecognitionException e,
                                  String[] tokenNames)
    {
        String error = super.getErrorMessage(e, tokenNames);

        if ( _errors != null && error != null ) {
            _errors.add(error);   
        }
     
        return error;
    }

    public List<String> getErrors() { 
        return _errors; 
    }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // cc/iqa/iQAParser.g:42:1: prog : ( BOM )? ( feature )+ -> ( feature )+ ;
    public final iQAParser.prog_return prog() throws RecognitionException {
        iQAParser.prog_return retval = new iQAParser.prog_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BOM1=null;
        iQAParser.feature_return feature2 =null;


        Object BOM1_tree=null;
        RewriteRuleTokenStream stream_BOM=new RewriteRuleTokenStream(adaptor,"token BOM");
        RewriteRuleSubtreeStream stream_feature=new RewriteRuleSubtreeStream(adaptor,"rule feature");
        try {
            // cc/iqa/iQAParser.g:43:5: ( ( BOM )? ( feature )+ -> ( feature )+ )
            // cc/iqa/iQAParser.g:43:7: ( BOM )? ( feature )+
            {
            // cc/iqa/iQAParser.g:43:7: ( BOM )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==BOM) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // cc/iqa/iQAParser.g:43:7: BOM
                    {
                    BOM1=(Token)match(input,BOM,FOLLOW_BOM_in_prog109);  
                    stream_BOM.add(BOM1);


                    }
                    break;

            }


            // cc/iqa/iQAParser.g:43:12: ( feature )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FEATURE_DEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:43:12: feature
            	    {
            	    pushFollow(FOLLOW_feature_in_prog112);
            	    feature2=feature();

            	    state._fsp--;

            	    stream_feature.add(feature2.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            // AST REWRITE
            // elements: feature
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 44:9: -> ( feature )+
            {
                if ( !(stream_feature.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_feature.hasNext() ) {
                    adaptor.addChild(root_0, stream_feature.nextTree());

                }
                stream_feature.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class feature_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "feature"
    // cc/iqa/iQAParser.g:47:1: feature : FEATURE_DEF ( feature_content )? -> ^( FEATURE FEATURE_DEF ( feature_content )? ) ;
    public final iQAParser.feature_return feature() throws RecognitionException {
        iQAParser.feature_return retval = new iQAParser.feature_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FEATURE_DEF3=null;
        iQAParser.feature_content_return feature_content4 =null;


        Object FEATURE_DEF3_tree=null;
        RewriteRuleTokenStream stream_FEATURE_DEF=new RewriteRuleTokenStream(adaptor,"token FEATURE_DEF");
        RewriteRuleSubtreeStream stream_feature_content=new RewriteRuleSubtreeStream(adaptor,"rule feature_content");
        try {
            // cc/iqa/iQAParser.g:48:5: ( FEATURE_DEF ( feature_content )? -> ^( FEATURE FEATURE_DEF ( feature_content )? ) )
            // cc/iqa/iQAParser.g:48:7: FEATURE_DEF ( feature_content )?
            {
            FEATURE_DEF3=(Token)match(input,FEATURE_DEF,FOLLOW_FEATURE_DEF_in_feature144);  
            stream_FEATURE_DEF.add(FEATURE_DEF3);


            // cc/iqa/iQAParser.g:48:19: ( feature_content )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==INDENT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // cc/iqa/iQAParser.g:48:19: feature_content
                    {
                    pushFollow(FOLLOW_feature_content_in_feature146);
                    feature_content4=feature_content();

                    state._fsp--;

                    stream_feature_content.add(feature_content4.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: feature_content, FEATURE_DEF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 48:36: -> ^( FEATURE FEATURE_DEF ( feature_content )? )
            {
                // cc/iqa/iQAParser.g:48:39: ^( FEATURE FEATURE_DEF ( feature_content )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FEATURE, "FEATURE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_FEATURE_DEF.nextNode()
                );

                // cc/iqa/iQAParser.g:48:61: ( feature_content )?
                if ( stream_feature_content.hasNext() ) {
                    adaptor.addChild(root_1, stream_feature_content.nextTree());

                }
                stream_feature_content.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "feature"


    public static class feature_content_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "feature_content"
    // cc/iqa/iQAParser.g:51:1: feature_content : INDENT ( scenario )+ ( DEDENT | EOF ) -> ^( SCENARIO_LIST ( scenario )+ ) ;
    public final iQAParser.feature_content_return feature_content() throws RecognitionException {
        iQAParser.feature_content_return retval = new iQAParser.feature_content_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INDENT5=null;
        Token DEDENT7=null;
        Token EOF8=null;
        iQAParser.scenario_return scenario6 =null;


        Object INDENT5_tree=null;
        Object DEDENT7_tree=null;
        Object EOF8_tree=null;
        RewriteRuleTokenStream stream_DEDENT=new RewriteRuleTokenStream(adaptor,"token DEDENT");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_INDENT=new RewriteRuleTokenStream(adaptor,"token INDENT");
        RewriteRuleSubtreeStream stream_scenario=new RewriteRuleSubtreeStream(adaptor,"rule scenario");
        try {
            // cc/iqa/iQAParser.g:52:5: ( INDENT ( scenario )+ ( DEDENT | EOF ) -> ^( SCENARIO_LIST ( scenario )+ ) )
            // cc/iqa/iQAParser.g:52:7: INDENT ( scenario )+ ( DEDENT | EOF )
            {
            INDENT5=(Token)match(input,INDENT,FOLLOW_INDENT_in_feature_content175);  
            stream_INDENT.add(INDENT5);


            // cc/iqa/iQAParser.g:52:14: ( scenario )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==SCENARIO_DEF) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:52:14: scenario
            	    {
            	    pushFollow(FOLLOW_scenario_in_feature_content177);
            	    scenario6=scenario();

            	    state._fsp--;

            	    stream_scenario.add(scenario6.getTree());

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


            // cc/iqa/iQAParser.g:52:24: ( DEDENT | EOF )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DEDENT) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // cc/iqa/iQAParser.g:52:25: DEDENT
                    {
                    DEDENT7=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_feature_content181);  
                    stream_DEDENT.add(DEDENT7);


                    }
                    break;
                case 2 :
                    // cc/iqa/iQAParser.g:52:34: EOF
                    {
                    EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_feature_content185);  
                    stream_EOF.add(EOF8);


                    }
                    break;

            }


            // AST REWRITE
            // elements: scenario
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 53:9: -> ^( SCENARIO_LIST ( scenario )+ )
            {
                // cc/iqa/iQAParser.g:53:12: ^( SCENARIO_LIST ( scenario )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SCENARIO_LIST, "SCENARIO_LIST")
                , root_1);

                if ( !(stream_scenario.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_scenario.hasNext() ) {
                    adaptor.addChild(root_1, stream_scenario.nextTree());

                }
                stream_scenario.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "feature_content"


    public static class scenario_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scenario"
    // cc/iqa/iQAParser.g:56:1: scenario : SCENARIO_DEF ( suite )* -> ^( SCENARIO SCENARIO_DEF ( suite )* ) ;
    public final iQAParser.scenario_return scenario() throws RecognitionException {
        iQAParser.scenario_return retval = new iQAParser.scenario_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SCENARIO_DEF9=null;
        iQAParser.suite_return suite10 =null;


        Object SCENARIO_DEF9_tree=null;
        RewriteRuleTokenStream stream_SCENARIO_DEF=new RewriteRuleTokenStream(adaptor,"token SCENARIO_DEF");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        try {
            // cc/iqa/iQAParser.g:57:5: ( SCENARIO_DEF ( suite )* -> ^( SCENARIO SCENARIO_DEF ( suite )* ) )
            // cc/iqa/iQAParser.g:57:7: SCENARIO_DEF ( suite )*
            {
            SCENARIO_DEF9=(Token)match(input,SCENARIO_DEF,FOLLOW_SCENARIO_DEF_in_scenario220);  
            stream_SCENARIO_DEF.add(SCENARIO_DEF9);


            // cc/iqa/iQAParser.g:57:20: ( suite )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==INDENT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:57:21: suite
            	    {
            	    pushFollow(FOLLOW_suite_in_scenario223);
            	    suite10=suite();

            	    state._fsp--;

            	    stream_suite.add(suite10.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // AST REWRITE
            // elements: suite, SCENARIO_DEF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 57:29: -> ^( SCENARIO SCENARIO_DEF ( suite )* )
            {
                // cc/iqa/iQAParser.g:57:32: ^( SCENARIO SCENARIO_DEF ( suite )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SCENARIO, "SCENARIO")
                , root_1);

                adaptor.addChild(root_1, 
                stream_SCENARIO_DEF.nextNode()
                );

                // cc/iqa/iQAParser.g:57:56: ( suite )*
                while ( stream_suite.hasNext() ) {
                    adaptor.addChild(root_1, stream_suite.nextTree());

                }
                stream_suite.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scenario"


    public static class suite_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "suite"
    // cc/iqa/iQAParser.g:60:1: suite : INDENT ( compound_stmt )+ ( DEDENT | EOF ) -> ^( STEP_LIST ( compound_stmt )+ ) ;
    public final iQAParser.suite_return suite() throws RecognitionException {
        iQAParser.suite_return retval = new iQAParser.suite_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INDENT11=null;
        Token DEDENT13=null;
        Token EOF14=null;
        iQAParser.compound_stmt_return compound_stmt12 =null;


        Object INDENT11_tree=null;
        Object DEDENT13_tree=null;
        Object EOF14_tree=null;
        RewriteRuleTokenStream stream_DEDENT=new RewriteRuleTokenStream(adaptor,"token DEDENT");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_INDENT=new RewriteRuleTokenStream(adaptor,"token INDENT");
        RewriteRuleSubtreeStream stream_compound_stmt=new RewriteRuleSubtreeStream(adaptor,"rule compound_stmt");
        try {
            // cc/iqa/iQAParser.g:61:5: ( INDENT ( compound_stmt )+ ( DEDENT | EOF ) -> ^( STEP_LIST ( compound_stmt )+ ) )
            // cc/iqa/iQAParser.g:61:7: INDENT ( compound_stmt )+ ( DEDENT | EOF )
            {
            INDENT11=(Token)match(input,INDENT,FOLLOW_INDENT_in_suite253);  
            stream_INDENT.add(INDENT11);


            // cc/iqa/iQAParser.g:61:14: ( compound_stmt )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==STEP||(LA7_0 >= VARIABLE && LA7_0 <= WHEN)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:61:15: compound_stmt
            	    {
            	    pushFollow(FOLLOW_compound_stmt_in_suite256);
            	    compound_stmt12=compound_stmt();

            	    state._fsp--;

            	    stream_compound_stmt.add(compound_stmt12.getTree());

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


            // cc/iqa/iQAParser.g:61:31: ( DEDENT | EOF )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==DEDENT) ) {
                alt8=1;
            }
            else if ( (LA8_0==EOF) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // cc/iqa/iQAParser.g:61:32: DEDENT
                    {
                    DEDENT13=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_suite261);  
                    stream_DEDENT.add(DEDENT13);


                    }
                    break;
                case 2 :
                    // cc/iqa/iQAParser.g:61:41: EOF
                    {
                    EOF14=(Token)match(input,EOF,FOLLOW_EOF_in_suite265);  
                    stream_EOF.add(EOF14);


                    }
                    break;

            }


            // AST REWRITE
            // elements: compound_stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 61:46: -> ^( STEP_LIST ( compound_stmt )+ )
            {
                // cc/iqa/iQAParser.g:61:49: ^( STEP_LIST ( compound_stmt )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STEP_LIST, "STEP_LIST")
                , root_1);

                if ( !(stream_compound_stmt.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_compound_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_compound_stmt.nextTree());

                }
                stream_compound_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "suite"


    public static class step_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "step"
    // cc/iqa/iQAParser.g:64:1: step : STEP ( table )? -> ^( STEP_TREE STEP ( table )? ) ;
    public final iQAParser.step_return step() throws RecognitionException {
        iQAParser.step_return retval = new iQAParser.step_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STEP15=null;
        iQAParser.table_return table16 =null;


        Object STEP15_tree=null;
        RewriteRuleTokenStream stream_STEP=new RewriteRuleTokenStream(adaptor,"token STEP");
        RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");
        try {
            // cc/iqa/iQAParser.g:65:5: ( STEP ( table )? -> ^( STEP_TREE STEP ( table )? ) )
            // cc/iqa/iQAParser.g:65:7: STEP ( table )?
            {
            STEP15=(Token)match(input,STEP,FOLLOW_STEP_in_step292);  
            stream_STEP.add(STEP15);


            // cc/iqa/iQAParser.g:65:12: ( table )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==PIPE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // cc/iqa/iQAParser.g:65:13: table
                    {
                    pushFollow(FOLLOW_table_in_step295);
                    table16=table();

                    state._fsp--;

                    stream_table.add(table16.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: STEP, table
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 65:21: -> ^( STEP_TREE STEP ( table )? )
            {
                // cc/iqa/iQAParser.g:65:24: ^( STEP_TREE STEP ( table )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STEP_TREE, "STEP_TREE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_STEP.nextNode()
                );

                // cc/iqa/iQAParser.g:65:41: ( table )?
                if ( stream_table.hasNext() ) {
                    adaptor.addChild(root_1, stream_table.nextTree());

                }
                stream_table.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "step"


    public static class cell_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cell"
    // cc/iqa/iQAParser.g:68:1: cell : expression PIPE ;
    public final iQAParser.cell_return cell() throws RecognitionException {
        iQAParser.cell_return retval = new iQAParser.cell_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PIPE18=null;
        iQAParser.expression_return expression17 =null;


        Object PIPE18_tree=null;

        try {
            // cc/iqa/iQAParser.g:69:5: ( expression PIPE )
            // cc/iqa/iQAParser.g:69:7: expression PIPE
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expression_in_cell325);
            expression17=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression17.getTree());

            PIPE18=(Token)match(input,PIPE,FOLLOW_PIPE_in_cell327); 
            PIPE18_tree = 
            (Object)adaptor.create(PIPE18)
            ;
            adaptor.addChild(root_0, PIPE18_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cell"


    public static class row_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "row"
    // cc/iqa/iQAParser.g:72:1: row : PIPE ( cell )+ ;
    public final iQAParser.row_return row() throws RecognitionException {
        iQAParser.row_return retval = new iQAParser.row_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PIPE19=null;
        iQAParser.cell_return cell20 =null;


        Object PIPE19_tree=null;

        try {
            // cc/iqa/iQAParser.g:73:5: ( PIPE ( cell )+ )
            // cc/iqa/iQAParser.g:73:7: PIPE ( cell )+
            {
            root_0 = (Object)adaptor.nil();


            PIPE19=(Token)match(input,PIPE,FOLLOW_PIPE_in_row344); 
            PIPE19_tree = 
            (Object)adaptor.create(PIPE19)
            ;
            adaptor.addChild(root_0, PIPE19_tree);


            // cc/iqa/iQAParser.g:73:12: ( cell )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==VARIABLE) ) {
                    int LA10_2 = input.LA(2);

                    if ( ((LA10_2 >= ADD && LA10_2 <= AND)||LA10_2==COP||LA10_2==DIV||LA10_2==EOP||(LA10_2 >= MOD && LA10_2 <= MUL)||(LA10_2 >= OR && LA10_2 <= PIPE)||LA10_2==SOP||LA10_2==SUB) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0 >= FLOAT && LA10_0 <= IDENTIFIER)||LA10_0==LPAREN||LA10_0==NOT||LA10_0==STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:73:12: cell
            	    {
            	    pushFollow(FOLLOW_cell_in_row346);
            	    cell20=cell();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cell20.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "row"


    public static class table_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table"
    // cc/iqa/iQAParser.g:76:1: table : ( row )+ ;
    public final iQAParser.table_return table() throws RecognitionException {
        iQAParser.table_return retval = new iQAParser.table_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        iQAParser.row_return row21 =null;



        try {
            // cc/iqa/iQAParser.g:77:5: ( ( row )+ )
            // cc/iqa/iQAParser.g:77:7: ( row )+
            {
            root_0 = (Object)adaptor.nil();


            // cc/iqa/iQAParser.g:77:7: ( row )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==PIPE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:77:7: row
            	    {
            	    pushFollow(FOLLOW_row_in_table364);
            	    row21=row();

            	    state._fsp--;

            	    adaptor.addChild(root_0, row21.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table"


    public static class compound_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compound_stmt"
    // cc/iqa/iQAParser.g:80:1: compound_stmt : ( WHEN compound_condition ( suite )+ ( elif_clause )* ( else_clause )? -> ^( WHEN compound_condition ( suite )+ ( elif_clause )* ( else_clause )? ) | step | assignment );
    public final iQAParser.compound_stmt_return compound_stmt() throws RecognitionException {
        iQAParser.compound_stmt_return retval = new iQAParser.compound_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHEN22=null;
        iQAParser.compound_condition_return compound_condition23 =null;

        iQAParser.suite_return suite24 =null;

        iQAParser.elif_clause_return elif_clause25 =null;

        iQAParser.else_clause_return else_clause26 =null;

        iQAParser.step_return step27 =null;

        iQAParser.assignment_return assignment28 =null;


        Object WHEN22_tree=null;
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleSubtreeStream stream_else_clause=new RewriteRuleSubtreeStream(adaptor,"rule else_clause");
        RewriteRuleSubtreeStream stream_elif_clause=new RewriteRuleSubtreeStream(adaptor,"rule elif_clause");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        RewriteRuleSubtreeStream stream_compound_condition=new RewriteRuleSubtreeStream(adaptor,"rule compound_condition");
        try {
            // cc/iqa/iQAParser.g:81:5: ( WHEN compound_condition ( suite )+ ( elif_clause )* ( else_clause )? -> ^( WHEN compound_condition ( suite )+ ( elif_clause )* ( else_clause )? ) | step | assignment )
            int alt15=3;
            switch ( input.LA(1) ) {
            case WHEN:
                {
                alt15=1;
                }
                break;
            case STEP:
                {
                alt15=2;
                }
                break;
            case VARIABLE:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // cc/iqa/iQAParser.g:81:7: WHEN compound_condition ( suite )+ ( elif_clause )* ( else_clause )?
                    {
                    WHEN22=(Token)match(input,WHEN,FOLLOW_WHEN_in_compound_stmt382);  
                    stream_WHEN.add(WHEN22);


                    pushFollow(FOLLOW_compound_condition_in_compound_stmt384);
                    compound_condition23=compound_condition();

                    state._fsp--;

                    stream_compound_condition.add(compound_condition23.getTree());

                    // cc/iqa/iQAParser.g:81:31: ( suite )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==INDENT) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // cc/iqa/iQAParser.g:81:32: suite
                    	    {
                    	    pushFollow(FOLLOW_suite_in_compound_stmt387);
                    	    suite24=suite();

                    	    state._fsp--;

                    	    stream_suite.add(suite24.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    // cc/iqa/iQAParser.g:81:40: ( elif_clause )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==ELIF) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // cc/iqa/iQAParser.g:81:40: elif_clause
                    	    {
                    	    pushFollow(FOLLOW_elif_clause_in_compound_stmt391);
                    	    elif_clause25=elif_clause();

                    	    state._fsp--;

                    	    stream_elif_clause.add(elif_clause25.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    // cc/iqa/iQAParser.g:81:53: ( else_clause )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ELSE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // cc/iqa/iQAParser.g:81:53: else_clause
                            {
                            pushFollow(FOLLOW_else_clause_in_compound_stmt394);
                            else_clause26=else_clause();

                            state._fsp--;

                            stream_else_clause.add(else_clause26.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: compound_condition, suite, elif_clause, WHEN, else_clause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:9: -> ^( WHEN compound_condition ( suite )+ ( elif_clause )* ( else_clause )? )
                    {
                        // cc/iqa/iQAParser.g:82:12: ^( WHEN compound_condition ( suite )+ ( elif_clause )* ( else_clause )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_WHEN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_compound_condition.nextTree());

                        if ( !(stream_suite.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_suite.hasNext() ) {
                            adaptor.addChild(root_1, stream_suite.nextTree());

                        }
                        stream_suite.reset();

                        // cc/iqa/iQAParser.g:82:45: ( elif_clause )*
                        while ( stream_elif_clause.hasNext() ) {
                            adaptor.addChild(root_1, stream_elif_clause.nextTree());

                        }
                        stream_elif_clause.reset();

                        // cc/iqa/iQAParser.g:82:58: ( else_clause )?
                        if ( stream_else_clause.hasNext() ) {
                            adaptor.addChild(root_1, stream_else_clause.nextTree());

                        }
                        stream_else_clause.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // cc/iqa/iQAParser.g:83:7: step
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_step_in_compound_stmt429);
                    step27=step();

                    state._fsp--;

                    adaptor.addChild(root_0, step27.getTree());

                    }
                    break;
                case 3 :
                    // cc/iqa/iQAParser.g:84:7: assignment
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_in_compound_stmt437);
                    assignment28=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment28.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compound_stmt"


    public static class else_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_clause"
    // cc/iqa/iQAParser.g:87:1: else_clause : ELSE ( suite )+ -> ^( ELSE ( suite )+ ) ;
    public final iQAParser.else_clause_return else_clause() throws RecognitionException {
        iQAParser.else_clause_return retval = new iQAParser.else_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE29=null;
        iQAParser.suite_return suite30 =null;


        Object ELSE29_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        try {
            // cc/iqa/iQAParser.g:88:5: ( ELSE ( suite )+ -> ^( ELSE ( suite )+ ) )
            // cc/iqa/iQAParser.g:88:7: ELSE ( suite )+
            {
            ELSE29=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_clause454);  
            stream_ELSE.add(ELSE29);


            // cc/iqa/iQAParser.g:88:12: ( suite )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==INDENT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:88:13: suite
            	    {
            	    pushFollow(FOLLOW_suite_in_else_clause457);
            	    suite30=suite();

            	    state._fsp--;

            	    stream_suite.add(suite30.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            // AST REWRITE
            // elements: ELSE, suite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 89:9: -> ^( ELSE ( suite )+ )
            {
                // cc/iqa/iQAParser.g:89:12: ^( ELSE ( suite )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ELSE.nextNode()
                , root_1);

                if ( !(stream_suite.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_suite.hasNext() ) {
                    adaptor.addChild(root_1, stream_suite.nextTree());

                }
                stream_suite.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_clause"


    public static class elif_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elif_clause"
    // cc/iqa/iQAParser.g:92:1: elif_clause : ELIF compound_condition ( suite )+ -> ^( ELIF compound_condition ( suite )+ ) ;
    public final iQAParser.elif_clause_return elif_clause() throws RecognitionException {
        iQAParser.elif_clause_return retval = new iQAParser.elif_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELIF31=null;
        iQAParser.compound_condition_return compound_condition32 =null;

        iQAParser.suite_return suite33 =null;


        Object ELIF31_tree=null;
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleSubtreeStream stream_suite=new RewriteRuleSubtreeStream(adaptor,"rule suite");
        RewriteRuleSubtreeStream stream_compound_condition=new RewriteRuleSubtreeStream(adaptor,"rule compound_condition");
        try {
            // cc/iqa/iQAParser.g:93:5: ( ELIF compound_condition ( suite )+ -> ^( ELIF compound_condition ( suite )+ ) )
            // cc/iqa/iQAParser.g:93:7: ELIF compound_condition ( suite )+
            {
            ELIF31=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif_clause493);  
            stream_ELIF.add(ELIF31);


            pushFollow(FOLLOW_compound_condition_in_elif_clause495);
            compound_condition32=compound_condition();

            state._fsp--;

            stream_compound_condition.add(compound_condition32.getTree());

            // cc/iqa/iQAParser.g:93:31: ( suite )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==INDENT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:93:32: suite
            	    {
            	    pushFollow(FOLLOW_suite_in_elif_clause498);
            	    suite33=suite();

            	    state._fsp--;

            	    stream_suite.add(suite33.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            // AST REWRITE
            // elements: suite, compound_condition, ELIF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:9: -> ^( ELIF compound_condition ( suite )+ )
            {
                // cc/iqa/iQAParser.g:94:12: ^( ELIF compound_condition ( suite )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ELIF.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_compound_condition.nextTree());

                if ( !(stream_suite.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_suite.hasNext() ) {
                    adaptor.addChild(root_1, stream_suite.nextTree());

                }
                stream_suite.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elif_clause"


    public static class compound_condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compound_condition"
    // cc/iqa/iQAParser.g:97:1: compound_condition : ( expression | assignment );
    public final iQAParser.compound_condition_return compound_condition() throws RecognitionException {
        iQAParser.compound_condition_return retval = new iQAParser.compound_condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        iQAParser.expression_return expression34 =null;

        iQAParser.assignment_return assignment35 =null;



        try {
            // cc/iqa/iQAParser.g:98:5: ( expression | assignment )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==VARIABLE) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==EQUAL) ) {
                    alt18=2;
                }
                else if ( ((LA18_1 >= ADD && LA18_1 <= AND)||LA18_1==COP||LA18_1==DIV||LA18_1==EOP||LA18_1==INDENT||(LA18_1 >= MOD && LA18_1 <= MUL)||LA18_1==OR||LA18_1==SOP||LA18_1==SUB) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA18_0 >= FLOAT && LA18_0 <= IDENTIFIER)||LA18_0==LPAREN||LA18_0==NOT||LA18_0==STRING) ) {
                alt18=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // cc/iqa/iQAParser.g:98:7: expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_compound_condition536);
                    expression34=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression34.getTree());

                    }
                    break;
                case 2 :
                    // cc/iqa/iQAParser.g:99:7: assignment
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_in_compound_condition544);
                    assignment35=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment35.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compound_condition"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // cc/iqa/iQAParser.g:102:1: assignment : VARIABLE EQUAL assignment_right -> ^( EQUAL VARIABLE assignment_right ) ;
    public final iQAParser.assignment_return assignment() throws RecognitionException {
        iQAParser.assignment_return retval = new iQAParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VARIABLE36=null;
        Token EQUAL37=null;
        iQAParser.assignment_right_return assignment_right38 =null;


        Object VARIABLE36_tree=null;
        Object EQUAL37_tree=null;
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_assignment_right=new RewriteRuleSubtreeStream(adaptor,"rule assignment_right");
        try {
            // cc/iqa/iQAParser.g:103:5: ( VARIABLE EQUAL assignment_right -> ^( EQUAL VARIABLE assignment_right ) )
            // cc/iqa/iQAParser.g:103:7: VARIABLE EQUAL assignment_right
            {
            VARIABLE36=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_assignment561);  
            stream_VARIABLE.add(VARIABLE36);


            EQUAL37=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignment563);  
            stream_EQUAL.add(EQUAL37);


            pushFollow(FOLLOW_assignment_right_in_assignment565);
            assignment_right38=assignment_right();

            state._fsp--;

            stream_assignment_right.add(assignment_right38.getTree());

            // AST REWRITE
            // elements: VARIABLE, EQUAL, assignment_right
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 103:39: -> ^( EQUAL VARIABLE assignment_right )
            {
                // cc/iqa/iQAParser.g:103:42: ^( EQUAL VARIABLE assignment_right )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_VARIABLE.nextNode()
                );

                adaptor.addChild(root_1, stream_assignment_right.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class assignment_right_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_right"
    // cc/iqa/iQAParser.g:106:1: assignment_right : ( expression | step | table | assignment );
    public final iQAParser.assignment_right_return assignment_right() throws RecognitionException {
        iQAParser.assignment_right_return retval = new iQAParser.assignment_right_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        iQAParser.expression_return expression39 =null;

        iQAParser.step_return step40 =null;

        iQAParser.table_return table41 =null;

        iQAParser.assignment_return assignment42 =null;



        try {
            // cc/iqa/iQAParser.g:107:5: ( expression | step | table | assignment )
            int alt19=4;
            switch ( input.LA(1) ) {
            case VARIABLE:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EQUAL) ) {
                    alt19=4;
                }
                else if ( (LA19_1==EOF||(LA19_1 >= ADD && LA19_1 <= AND)||(LA19_1 >= COP && LA19_1 <= DIV)||LA19_1==EOP||LA19_1==INDENT||(LA19_1 >= MOD && LA19_1 <= MUL)||LA19_1==OR||LA19_1==SOP||LA19_1==STEP||(LA19_1 >= SUB && LA19_1 <= WHEN)) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
                }
                break;
            case FLOAT:
            case IDENTIFIER:
            case LPAREN:
            case NOT:
            case STRING:
                {
                alt19=1;
                }
                break;
            case STEP:
                {
                alt19=2;
                }
                break;
            case PIPE:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // cc/iqa/iQAParser.g:107:7: expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_assignment_right592);
                    expression39=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression39.getTree());

                    }
                    break;
                case 2 :
                    // cc/iqa/iQAParser.g:108:7: step
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_step_in_assignment_right600);
                    step40=step();

                    state._fsp--;

                    adaptor.addChild(root_0, step40.getTree());

                    }
                    break;
                case 3 :
                    // cc/iqa/iQAParser.g:109:7: table
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_table_in_assignment_right608);
                    table41=table();

                    state._fsp--;

                    adaptor.addChild(root_0, table41.getTree());

                    }
                    break;
                case 4 :
                    // cc/iqa/iQAParser.g:110:7: assignment
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_in_assignment_right616);
                    assignment42=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment42.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_right"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // cc/iqa/iQAParser.g:113:1: expression : logicalOr ;
    public final iQAParser.expression_return expression() throws RecognitionException {
        iQAParser.expression_return retval = new iQAParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        iQAParser.logicalOr_return logicalOr43 =null;



        try {
            // cc/iqa/iQAParser.g:114:5: ( logicalOr )
            // cc/iqa/iQAParser.g:114:7: logicalOr
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicalOr_in_expression633);
            logicalOr43=logicalOr();

            state._fsp--;

            adaptor.addChild(root_0, logicalOr43.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class logicalOr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalOr"
    // cc/iqa/iQAParser.g:117:1: logicalOr : logicalAnd ( OR ^ logicalAnd )* ;
    public final iQAParser.logicalOr_return logicalOr() throws RecognitionException {
        iQAParser.logicalOr_return retval = new iQAParser.logicalOr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR45=null;
        iQAParser.logicalAnd_return logicalAnd44 =null;

        iQAParser.logicalAnd_return logicalAnd46 =null;


        Object OR45_tree=null;

        try {
            // cc/iqa/iQAParser.g:118:5: ( logicalAnd ( OR ^ logicalAnd )* )
            // cc/iqa/iQAParser.g:118:7: logicalAnd ( OR ^ logicalAnd )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicalAnd_in_logicalOr650);
            logicalAnd44=logicalAnd();

            state._fsp--;

            adaptor.addChild(root_0, logicalAnd44.getTree());

            // cc/iqa/iQAParser.g:118:18: ( OR ^ logicalAnd )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==OR) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:118:19: OR ^ logicalAnd
            	    {
            	    OR45=(Token)match(input,OR,FOLLOW_OR_in_logicalOr653); 
            	    OR45_tree = 
            	    (Object)adaptor.create(OR45)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(OR45_tree, root_0);


            	    pushFollow(FOLLOW_logicalAnd_in_logicalOr656);
            	    logicalAnd46=logicalAnd();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logicalAnd46.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logicalOr"


    public static class logicalAnd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalAnd"
    // cc/iqa/iQAParser.g:121:1: logicalAnd : equalityCheck ( AND ^ equalityCheck )* ;
    public final iQAParser.logicalAnd_return logicalAnd() throws RecognitionException {
        iQAParser.logicalAnd_return retval = new iQAParser.logicalAnd_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND48=null;
        iQAParser.equalityCheck_return equalityCheck47 =null;

        iQAParser.equalityCheck_return equalityCheck49 =null;


        Object AND48_tree=null;

        try {
            // cc/iqa/iQAParser.g:122:5: ( equalityCheck ( AND ^ equalityCheck )* )
            // cc/iqa/iQAParser.g:122:7: equalityCheck ( AND ^ equalityCheck )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equalityCheck_in_logicalAnd675);
            equalityCheck47=equalityCheck();

            state._fsp--;

            adaptor.addChild(root_0, equalityCheck47.getTree());

            // cc/iqa/iQAParser.g:122:21: ( AND ^ equalityCheck )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AND) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:122:22: AND ^ equalityCheck
            	    {
            	    AND48=(Token)match(input,AND,FOLLOW_AND_in_logicalAnd678); 
            	    AND48_tree = 
            	    (Object)adaptor.create(AND48)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AND48_tree, root_0);


            	    pushFollow(FOLLOW_equalityCheck_in_logicalAnd681);
            	    equalityCheck49=equalityCheck();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equalityCheck49.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logicalAnd"


    public static class equalityCheck_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityCheck"
    // cc/iqa/iQAParser.g:125:1: equalityCheck : ( comparison ( EOP ^ comparison )* | NOT ^ equalityCheck );
    public final iQAParser.equalityCheck_return equalityCheck() throws RecognitionException {
        iQAParser.equalityCheck_return retval = new iQAParser.equalityCheck_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOP51=null;
        Token NOT53=null;
        iQAParser.comparison_return comparison50 =null;

        iQAParser.comparison_return comparison52 =null;

        iQAParser.equalityCheck_return equalityCheck54 =null;


        Object EOP51_tree=null;
        Object NOT53_tree=null;

        try {
            // cc/iqa/iQAParser.g:126:5: ( comparison ( EOP ^ comparison )* | NOT ^ equalityCheck )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0 >= FLOAT && LA23_0 <= IDENTIFIER)||LA23_0==LPAREN||LA23_0==STRING||LA23_0==VARIABLE) ) {
                alt23=1;
            }
            else if ( (LA23_0==NOT) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // cc/iqa/iQAParser.g:126:7: comparison ( EOP ^ comparison )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_comparison_in_equalityCheck700);
                    comparison50=comparison();

                    state._fsp--;

                    adaptor.addChild(root_0, comparison50.getTree());

                    // cc/iqa/iQAParser.g:126:18: ( EOP ^ comparison )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==EOP) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // cc/iqa/iQAParser.g:126:19: EOP ^ comparison
                    	    {
                    	    EOP51=(Token)match(input,EOP,FOLLOW_EOP_in_equalityCheck703); 
                    	    EOP51_tree = 
                    	    (Object)adaptor.create(EOP51)
                    	    ;
                    	    root_0 = (Object)adaptor.becomeRoot(EOP51_tree, root_0);


                    	    pushFollow(FOLLOW_comparison_in_equalityCheck706);
                    	    comparison52=comparison();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, comparison52.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // cc/iqa/iQAParser.g:127:7: NOT ^ equalityCheck
                    {
                    root_0 = (Object)adaptor.nil();


                    NOT53=(Token)match(input,NOT,FOLLOW_NOT_in_equalityCheck716); 
                    NOT53_tree = 
                    (Object)adaptor.create(NOT53)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NOT53_tree, root_0);


                    pushFollow(FOLLOW_equalityCheck_in_equalityCheck719);
                    equalityCheck54=equalityCheck();

                    state._fsp--;

                    adaptor.addChild(root_0, equalityCheck54.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equalityCheck"


    public static class comparison_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comparison"
    // cc/iqa/iQAParser.g:130:1: comparison : bitwiseShift ( COP ^ bitwiseShift )* ;
    public final iQAParser.comparison_return comparison() throws RecognitionException {
        iQAParser.comparison_return retval = new iQAParser.comparison_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COP56=null;
        iQAParser.bitwiseShift_return bitwiseShift55 =null;

        iQAParser.bitwiseShift_return bitwiseShift57 =null;


        Object COP56_tree=null;

        try {
            // cc/iqa/iQAParser.g:131:5: ( bitwiseShift ( COP ^ bitwiseShift )* )
            // cc/iqa/iQAParser.g:131:7: bitwiseShift ( COP ^ bitwiseShift )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitwiseShift_in_comparison736);
            bitwiseShift55=bitwiseShift();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseShift55.getTree());

            // cc/iqa/iQAParser.g:131:20: ( COP ^ bitwiseShift )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COP) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:131:21: COP ^ bitwiseShift
            	    {
            	    COP56=(Token)match(input,COP,FOLLOW_COP_in_comparison739); 
            	    COP56_tree = 
            	    (Object)adaptor.create(COP56)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(COP56_tree, root_0);


            	    pushFollow(FOLLOW_bitwiseShift_in_comparison742);
            	    bitwiseShift57=bitwiseShift();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseShift57.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comparison"


    public static class bitwiseShift_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseShift"
    // cc/iqa/iQAParser.g:134:1: bitwiseShift : addition ( SOP ^ addition )* ;
    public final iQAParser.bitwiseShift_return bitwiseShift() throws RecognitionException {
        iQAParser.bitwiseShift_return retval = new iQAParser.bitwiseShift_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SOP59=null;
        iQAParser.addition_return addition58 =null;

        iQAParser.addition_return addition60 =null;


        Object SOP59_tree=null;

        try {
            // cc/iqa/iQAParser.g:135:5: ( addition ( SOP ^ addition )* )
            // cc/iqa/iQAParser.g:135:7: addition ( SOP ^ addition )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addition_in_bitwiseShift761);
            addition58=addition();

            state._fsp--;

            adaptor.addChild(root_0, addition58.getTree());

            // cc/iqa/iQAParser.g:135:16: ( SOP ^ addition )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==SOP) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:135:17: SOP ^ addition
            	    {
            	    SOP59=(Token)match(input,SOP,FOLLOW_SOP_in_bitwiseShift764); 
            	    SOP59_tree = 
            	    (Object)adaptor.create(SOP59)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(SOP59_tree, root_0);


            	    pushFollow(FOLLOW_addition_in_bitwiseShift767);
            	    addition60=addition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, addition60.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bitwiseShift"


    public static class addition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addition"
    // cc/iqa/iQAParser.g:138:1: addition : term ( ( ADD ^| SUB ^) term )* ;
    public final iQAParser.addition_return addition() throws RecognitionException {
        iQAParser.addition_return retval = new iQAParser.addition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ADD62=null;
        Token SUB63=null;
        iQAParser.term_return term61 =null;

        iQAParser.term_return term64 =null;


        Object ADD62_tree=null;
        Object SUB63_tree=null;

        try {
            // cc/iqa/iQAParser.g:139:5: ( term ( ( ADD ^| SUB ^) term )* )
            // cc/iqa/iQAParser.g:139:7: term ( ( ADD ^| SUB ^) term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_addition786);
            term61=term();

            state._fsp--;

            adaptor.addChild(root_0, term61.getTree());

            // cc/iqa/iQAParser.g:139:12: ( ( ADD ^| SUB ^) term )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ADD||LA27_0==SUB) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:139:13: ( ADD ^| SUB ^) term
            	    {
            	    // cc/iqa/iQAParser.g:139:13: ( ADD ^| SUB ^)
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==ADD) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==SUB) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // cc/iqa/iQAParser.g:139:14: ADD ^
            	            {
            	            ADD62=(Token)match(input,ADD,FOLLOW_ADD_in_addition790); 
            	            ADD62_tree = 
            	            (Object)adaptor.create(ADD62)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(ADD62_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // cc/iqa/iQAParser.g:139:21: SUB ^
            	            {
            	            SUB63=(Token)match(input,SUB,FOLLOW_SUB_in_addition795); 
            	            SUB63_tree = 
            	            (Object)adaptor.create(SUB63)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB63_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_addition799);
            	    term64=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term64.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "addition"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // cc/iqa/iQAParser.g:142:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final iQAParser.term_return term() throws RecognitionException {
        iQAParser.term_return retval = new iQAParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MUL66=null;
        Token DIV67=null;
        Token MOD68=null;
        iQAParser.factor_return factor65 =null;

        iQAParser.factor_return factor69 =null;


        Object MUL66_tree=null;
        Object DIV67_tree=null;
        Object MOD68_tree=null;

        try {
            // cc/iqa/iQAParser.g:143:5: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // cc/iqa/iQAParser.g:143:7: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term818);
            factor65=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor65.getTree());

            // cc/iqa/iQAParser.g:143:14: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==DIV||(LA29_0 >= MOD && LA29_0 <= MUL)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // cc/iqa/iQAParser.g:143:15: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // cc/iqa/iQAParser.g:143:15: ( MUL ^| DIV ^| MOD ^)
            	    int alt28=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // cc/iqa/iQAParser.g:143:16: MUL ^
            	            {
            	            MUL66=(Token)match(input,MUL,FOLLOW_MUL_in_term822); 
            	            MUL66_tree = 
            	            (Object)adaptor.create(MUL66)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MUL66_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // cc/iqa/iQAParser.g:143:23: DIV ^
            	            {
            	            DIV67=(Token)match(input,DIV,FOLLOW_DIV_in_term827); 
            	            DIV67_tree = 
            	            (Object)adaptor.create(DIV67)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(DIV67_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // cc/iqa/iQAParser.g:143:30: MOD ^
            	            {
            	            MOD68=(Token)match(input,MOD,FOLLOW_MOD_in_term832); 
            	            MOD68_tree = 
            	            (Object)adaptor.create(MOD68)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MOD68_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term836);
            	    factor69=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor69.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // cc/iqa/iQAParser.g:146:1: factor : ( atom | LPAREN expression RPAREN -> ^( SUB_EXPR expression ) );
    public final iQAParser.factor_return factor() throws RecognitionException {
        iQAParser.factor_return retval = new iQAParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN71=null;
        Token RPAREN73=null;
        iQAParser.atom_return atom70 =null;

        iQAParser.expression_return expression72 =null;


        Object LPAREN71_tree=null;
        Object RPAREN73_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // cc/iqa/iQAParser.g:147:5: ( atom | LPAREN expression RPAREN -> ^( SUB_EXPR expression ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0 >= FLOAT && LA30_0 <= IDENTIFIER)||LA30_0==STRING||LA30_0==VARIABLE) ) {
                alt30=1;
            }
            else if ( (LA30_0==LPAREN) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // cc/iqa/iQAParser.g:147:7: atom
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_factor855);
                    atom70=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom70.getTree());

                    }
                    break;
                case 2 :
                    // cc/iqa/iQAParser.g:148:7: LPAREN expression RPAREN
                    {
                    LPAREN71=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_factor863);  
                    stream_LPAREN.add(LPAREN71);


                    pushFollow(FOLLOW_expression_in_factor865);
                    expression72=expression();

                    state._fsp--;

                    stream_expression.add(expression72.getTree());

                    RPAREN73=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_factor867);  
                    stream_RPAREN.add(RPAREN73);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 149:9: -> ^( SUB_EXPR expression )
                    {
                        // cc/iqa/iQAParser.g:149:12: ^( SUB_EXPR expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SUB_EXPR, "SUB_EXPR")
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // cc/iqa/iQAParser.g:152:1: atom : ( IDENTIFIER | FLOAT | VARIABLE | STRING );
    public final iQAParser.atom_return atom() throws RecognitionException {
        iQAParser.atom_return retval = new iQAParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set74=null;

        Object set74_tree=null;

        try {
            // cc/iqa/iQAParser.g:153:5: ( IDENTIFIER | FLOAT | VARIABLE | STRING )
            // cc/iqa/iQAParser.g:
            {
            root_0 = (Object)adaptor.nil();


            set74=(Token)input.LT(1);

            if ( (input.LA(1) >= FLOAT && input.LA(1) <= IDENTIFIER)||input.LA(1)==STRING||input.LA(1)==VARIABLE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set74)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_BOM_in_prog109 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_feature_in_prog112 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_FEATURE_DEF_in_feature144 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_feature_content_in_feature146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_feature_content175 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_scenario_in_feature_content177 = new BitSet(new long[]{0x0000000100000400L});
    public static final BitSet FOLLOW_DEDENT_in_feature_content181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_feature_content185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCENARIO_DEF_in_scenario220 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_suite_in_scenario223 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_INDENT_in_suite253 = new BitSet(new long[]{0x000000C800000000L});
    public static final BitSet FOLLOW_compound_stmt_in_suite256 = new BitSet(new long[]{0x000000C800000400L});
    public static final BitSet FOLLOW_DEDENT_in_suite261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_suite265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STEP_in_step292 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_table_in_step295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_cell325 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_PIPE_in_cell327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PIPE_in_row344 = new BitSet(new long[]{0x0000005008980000L});
    public static final BitSet FOLLOW_cell_in_row346 = new BitSet(new long[]{0x0000005008980002L});
    public static final BitSet FOLLOW_row_in_table364 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_WHEN_in_compound_stmt382 = new BitSet(new long[]{0x0000005008980000L});
    public static final BitSet FOLLOW_compound_condition_in_compound_stmt384 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_suite_in_compound_stmt387 = new BitSet(new long[]{0x0000000000403002L});
    public static final BitSet FOLLOW_elif_clause_in_compound_stmt391 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_else_clause_in_compound_stmt394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_step_in_compound_stmt429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_compound_stmt437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_clause454 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_suite_in_else_clause457 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ELIF_in_elif_clause493 = new BitSet(new long[]{0x0000005008980000L});
    public static final BitSet FOLLOW_compound_condition_in_elif_clause495 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_suite_in_elif_clause498 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_expression_in_compound_condition536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_compound_condition544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_assignment561 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_assignment563 = new BitSet(new long[]{0x0000005828980000L});
    public static final BitSet FOLLOW_assignment_right_in_assignment565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_assignment_right592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_step_in_assignment_right600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_in_assignment_right608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_assignment_right616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_expression633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalOr650 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_OR_in_logicalOr653 = new BitSet(new long[]{0x0000005008980000L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalOr656 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_equalityCheck_in_logicalAnd675 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_logicalAnd678 = new BitSet(new long[]{0x0000005008980000L});
    public static final BitSet FOLLOW_equalityCheck_in_logicalAnd681 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_comparison_in_equalityCheck700 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_EOP_in_equalityCheck703 = new BitSet(new long[]{0x0000005000980000L});
    public static final BitSet FOLLOW_comparison_in_equalityCheck706 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_NOT_in_equalityCheck716 = new BitSet(new long[]{0x0000005008980000L});
    public static final BitSet FOLLOW_equalityCheck_in_equalityCheck719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseShift_in_comparison736 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COP_in_comparison739 = new BitSet(new long[]{0x0000005000980000L});
    public static final BitSet FOLLOW_bitwiseShift_in_comparison742 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_addition_in_bitwiseShift761 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_SOP_in_bitwiseShift764 = new BitSet(new long[]{0x0000005000980000L});
    public static final BitSet FOLLOW_addition_in_bitwiseShift767 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_term_in_addition786 = new BitSet(new long[]{0x0000002000000012L});
    public static final BitSet FOLLOW_ADD_in_addition790 = new BitSet(new long[]{0x0000005000980000L});
    public static final BitSet FOLLOW_SUB_in_addition795 = new BitSet(new long[]{0x0000005000980000L});
    public static final BitSet FOLLOW_term_in_addition799 = new BitSet(new long[]{0x0000002000000012L});
    public static final BitSet FOLLOW_factor_in_term818 = new BitSet(new long[]{0x0000000003000802L});
    public static final BitSet FOLLOW_MUL_in_term822 = new BitSet(new long[]{0x0000005000980000L});
    public static final BitSet FOLLOW_DIV_in_term827 = new BitSet(new long[]{0x0000005000980000L});
    public static final BitSet FOLLOW_MOD_in_term832 = new BitSet(new long[]{0x0000005000980000L});
    public static final BitSet FOLLOW_factor_in_term836 = new BitSet(new long[]{0x0000000003000802L});
    public static final BitSet FOLLOW_atom_in_factor855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_factor863 = new BitSet(new long[]{0x0000005008980000L});
    public static final BitSet FOLLOW_expression_in_factor865 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RPAREN_in_factor867 = new BitSet(new long[]{0x0000000000000002L});

}