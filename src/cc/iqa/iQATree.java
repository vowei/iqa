// $ANTLR 3.4 cc/iqa/iQATree.g 2012-07-23 17:18:59

package cc.iqa;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class iQATree extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public iQATree(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public iQATree(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("iQATreeTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return iQATree.tokenNames; }
    public String getGrammarFileName() { return "cc/iqa/iQATree.g"; }


    private int _tableVariableIndex = 0;

    private String getVariableName(String prefix, int index)
    {
        return prefix + new Integer(index).toString();
    }

    private String removeKeyword(String line, String keyword)
    {
        if ( line.startsWith(keyword) ){
            int index = keyword.length();
            int enIdx = line.indexOf(':', index);
            int cnIdx = line.indexOf('：', index);
            
            if ( enIdx >= 0 && cnIdx < 0 )
                index = enIdx;
            else if ( enIdx < 0 && cnIdx >= 0 )
                index = cnIdx;
            else if ( enIdx >= 0 && cnIdx >= 0 )
                index = Math.min(enIdx, cnIdx);
            
            return line.substring(index + 1).trim();
        } else {
            return line;
        }
    }

    private String removeQuote(String value, char quote)
    {
        if ( value.charAt(0) != quote ) {
            return value;
        } else {
            return value.substring(1, value.length() - 1);
        }
    }


    public static class prog_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "prog"
    // cc/iqa/iQATree.g:51:1: prog[String packageName] : (f+= feature )+ -> file(classes=$fpackageName=packageName);
    public final iQATree.prog_return prog(String packageName) throws RecognitionException {
        iQATree.prog_return retval = new iQATree.prog_return();
        retval.start = input.LT(1);


        List list_f=null;
        RuleReturnScope f = null;
        try {
            // cc/iqa/iQATree.g:52:5: ( (f+= feature )+ -> file(classes=$fpackageName=packageName))
            // cc/iqa/iQATree.g:52:7: (f+= feature )+
            {
            // cc/iqa/iQATree.g:52:9: (f+= feature )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FEATURE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // cc/iqa/iQATree.g:52:9: f+= feature
            	    {
            	    pushFollow(FOLLOW_feature_in_prog72);
            	    f=feature();

            	    state._fsp--;

            	    if (list_f==null) list_f=new ArrayList();
            	    list_f.add(f.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // TEMPLATE REWRITE
            // 53:9: -> file(classes=$fpackageName=packageName)
            {
                retval.st = templateLib.getInstanceOf("file",new STAttrMap().put("classes", list_f).put("packageName", packageName));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class feature_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "feature"
    // cc/iqa/iQATree.g:56:1: feature : ^( FEATURE f= FEATURE_DEF (c= feature_content )? ) -> class(name=removeKeyword($f.getText(), \"功能\")methods=$c.scenarios);
    public final iQATree.feature_return feature() throws RecognitionException {
        iQATree.feature_return retval = new iQATree.feature_return();
        retval.start = input.LT(1);


        CommonTree f=null;
        iQATree.feature_content_return c =null;


        try {
            // cc/iqa/iQATree.g:57:5: ( ^( FEATURE f= FEATURE_DEF (c= feature_content )? ) -> class(name=removeKeyword($f.getText(), \"功能\")methods=$c.scenarios))
            // cc/iqa/iQATree.g:57:7: ^( FEATURE f= FEATURE_DEF (c= feature_content )? )
            {
            match(input,FEATURE,FOLLOW_FEATURE_in_feature118); 

            match(input, Token.DOWN, null); 
            f=(CommonTree)match(input,FEATURE_DEF,FOLLOW_FEATURE_DEF_in_feature122); 

            // cc/iqa/iQATree.g:57:32: (c= feature_content )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SCENARIO_LIST) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // cc/iqa/iQATree.g:57:32: c= feature_content
                    {
                    pushFollow(FOLLOW_feature_content_in_feature126);
                    c=feature_content();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 58:9: -> class(name=removeKeyword($f.getText(), \"功能\")methods=$c.scenarios)
            {
                retval.st = templateLib.getInstanceOf("class",new STAttrMap().put("name", removeKeyword(f.getText(), "功能")).put("methods", (c!=null?c.scenarios:null)));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "feature"


    public static class feature_content_return extends TreeRuleReturnScope {
        public List scenarios;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "feature_content"
    // cc/iqa/iQATree.g:62:1: feature_content returns [List scenarios] : ^( SCENARIO_LIST (s+= scenario )+ ) ;
    public final iQATree.feature_content_return feature_content() throws RecognitionException {
        iQATree.feature_content_return retval = new iQATree.feature_content_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // cc/iqa/iQATree.g:63:5: ( ^( SCENARIO_LIST (s+= scenario )+ ) )
            // cc/iqa/iQATree.g:63:7: ^( SCENARIO_LIST (s+= scenario )+ )
            {
            match(input,SCENARIO_LIST,FOLLOW_SCENARIO_LIST_in_feature_content193); 

            match(input, Token.DOWN, null); 
            // cc/iqa/iQATree.g:63:25: (s+= scenario )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==SCENARIO) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // cc/iqa/iQATree.g:63:25: s+= scenario
            	    {
            	    pushFollow(FOLLOW_scenario_in_feature_content199);
            	    s=scenario();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


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


            match(input, Token.UP, null); 



                        retval.scenarios = list_s;
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "feature_content"


    public static class scenario_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "scenario"
    // cc/iqa/iQATree.g:69:1: scenario : ^( SCENARIO s= SCENARIO_DEF ( suite )* ) -> method(name=removeKeyword($s.getText(), \"场景\")instructions=$suite.stmts);
    public final iQATree.scenario_return scenario() throws RecognitionException {
        iQATree.scenario_return retval = new iQATree.scenario_return();
        retval.start = input.LT(1);


        CommonTree s=null;
        iQATree.suite_return suite1 =null;


        try {
            // cc/iqa/iQATree.g:70:5: ( ^( SCENARIO s= SCENARIO_DEF ( suite )* ) -> method(name=removeKeyword($s.getText(), \"场景\")instructions=$suite.stmts))
            // cc/iqa/iQATree.g:70:7: ^( SCENARIO s= SCENARIO_DEF ( suite )* )
            {
            match(input,SCENARIO,FOLLOW_SCENARIO_in_scenario229); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,SCENARIO_DEF,FOLLOW_SCENARIO_DEF_in_scenario233); 

            // cc/iqa/iQATree.g:70:33: ( suite )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==STEP_LIST) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // cc/iqa/iQATree.g:70:33: suite
            	    {
            	    pushFollow(FOLLOW_suite_in_scenario235);
            	    suite1=suite();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 71:9: -> method(name=removeKeyword($s.getText(), \"场景\")instructions=$suite.stmts)
            {
                retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("name", removeKeyword(s.getText(), "场景")).put("instructions", (suite1!=null?suite1.stmts:null)));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scenario"


    public static class suite_return extends TreeRuleReturnScope {
        public List<StringTemplate> stmts;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "suite"
    // cc/iqa/iQATree.g:75:1: suite returns [List<StringTemplate> stmts] : ^( STEP_LIST (s+= compound_stmt )+ ) ;
    public final iQATree.suite_return suite() throws RecognitionException {
        iQATree.suite_return retval = new iQATree.suite_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // cc/iqa/iQATree.g:76:5: ( ^( STEP_LIST (s+= compound_stmt )+ ) )
            // cc/iqa/iQATree.g:76:7: ^( STEP_LIST (s+= compound_stmt )+ )
            {
            match(input,STEP_LIST,FOLLOW_STEP_LIST_in_suite321); 

            match(input, Token.DOWN, null); 
            // cc/iqa/iQATree.g:76:21: (s+= compound_stmt )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==EQUAL||LA5_0==WHEN||LA5_0==STEP_TREE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // cc/iqa/iQATree.g:76:21: s+= compound_stmt
            	    {
            	    pushFollow(FOLLOW_compound_stmt_in_suite327);
            	    s=compound_stmt();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            match(input, Token.UP, null); 



                        retval.st = new StringTemplate();
                        retval.stmts = list_s;
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "suite"


    public static class step_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "step"
    // cc/iqa/iQATree.g:83:1: step : ^( STEP_TREE STEP ( table )? ) -> step(title=removeKeyword($STEP.getText(), \"*\").replace(\"\\\"\", \"\\\\\\\"\")table=$table.st);
    public final iQATree.step_return step() throws RecognitionException {
        iQATree.step_return retval = new iQATree.step_return();
        retval.start = input.LT(1);


        CommonTree STEP2=null;
        iQATree.table_return table3 =null;


        try {
            // cc/iqa/iQATree.g:84:5: ( ^( STEP_TREE STEP ( table )? ) -> step(title=removeKeyword($STEP.getText(), \"*\").replace(\"\\\"\", \"\\\\\\\"\")table=$table.st))
            // cc/iqa/iQATree.g:84:7: ^( STEP_TREE STEP ( table )? )
            {
            match(input,STEP_TREE,FOLLOW_STEP_TREE_in_step357); 

            match(input, Token.DOWN, null); 
            STEP2=(CommonTree)match(input,STEP,FOLLOW_STEP_in_step359); 

            // cc/iqa/iQATree.g:84:24: ( table )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==PIPE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // cc/iqa/iQATree.g:84:24: table
                    {
                    pushFollow(FOLLOW_table_in_step361);
                    table3=table();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 85:9: -> step(title=removeKeyword($STEP.getText(), \"*\").replace(\"\\\"\", \"\\\\\\\"\")table=$table.st)
            {
                retval.st = templateLib.getInstanceOf("step",new STAttrMap().put("title", removeKeyword(STEP2.getText(), "*").replace("\"", "\\\"")).put("table", (table3!=null?table3.st:null)));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "step"


    public static class cell_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "cell"
    // cc/iqa/iQATree.g:89:1: cell : expression PIPE ;
    public final iQATree.cell_return cell() throws RecognitionException {
        iQATree.cell_return retval = new iQATree.cell_return();
        retval.start = input.LT(1);


        iQATree.expression_return expression4 =null;


        try {
            // cc/iqa/iQATree.g:90:5: ( expression PIPE )
            // cc/iqa/iQATree.g:90:7: expression PIPE
            {
            pushFollow(FOLLOW_expression_in_cell422);
            expression4=expression();

            state._fsp--;


            match(input,PIPE,FOLLOW_PIPE_in_cell424); 

                       
                        CommonTree t = (CommonTree)(expression4!=null?((CommonTree)expression4.start):null);
                        if ( t.getToken().getType() == iQATree.IDENTIFIER ) {
                            retval.st = new StringTemplate("\"" + (expression4!=null?expression4.st:null).toString() + "\"");
                        } else {
                            retval.st = (expression4!=null?expression4.st:null);
                        }

                        // retval.st = (expression4!=null?expression4.st:null);
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cell"


    public static class row_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "row"
    // cc/iqa/iQATree.g:103:1: row : PIPE (c+= cell )+ -> row(table=getVariableName(\"table\", _tableVariableIndex++)cells=$c);
    public final iQATree.row_return row() throws RecognitionException {
        iQATree.row_return retval = new iQATree.row_return();
        retval.start = input.LT(1);


        List list_c=null;
        RuleReturnScope c = null;
        try {
            // cc/iqa/iQATree.g:104:5: ( PIPE (c+= cell )+ -> row(table=getVariableName(\"table\", _tableVariableIndex++)cells=$c))
            // cc/iqa/iQATree.g:104:7: PIPE (c+= cell )+
            {
            match(input,PIPE,FOLLOW_PIPE_in_row451); 

            // cc/iqa/iQATree.g:104:14: (c+= cell )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= ADD && LA7_0 <= AND)||LA7_0==COP||LA7_0==DIV||LA7_0==EOP||(LA7_0 >= FLOAT && LA7_0 <= IDENTIFIER)||(LA7_0 >= MOD && LA7_0 <= MUL)||(LA7_0 >= NOT && LA7_0 <= OR)||LA7_0==SOP||(LA7_0 >= STRING && LA7_0 <= VARIABLE)||LA7_0==SUB_EXPR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // cc/iqa/iQATree.g:104:14: c+= cell
            	    {
            	    pushFollow(FOLLOW_cell_in_row457);
            	    c=cell();

            	    state._fsp--;

            	    if (list_c==null) list_c=new ArrayList();
            	    list_c.add(c.getTemplate());


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


            // TEMPLATE REWRITE
            // 105:9: -> row(table=getVariableName(\"table\", _tableVariableIndex++)cells=$c)
            {
                retval.st = templateLib.getInstanceOf("row",new STAttrMap().put("table", getVariableName("table", _tableVariableIndex++)).put("cells", list_c));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "row"


    public static class table_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "table"
    // cc/iqa/iQATree.g:109:1: table : (r+= row )+ -> table(name=getVariableName(\"table\", _tableVariableIndex++)rows=$r);
    public final iQATree.table_return table() throws RecognitionException {
        iQATree.table_return retval = new iQATree.table_return();
        retval.start = input.LT(1);


        List list_r=null;
        RuleReturnScope r = null;
        try {
            // cc/iqa/iQATree.g:110:5: ( (r+= row )+ -> table(name=getVariableName(\"table\", _tableVariableIndex++)rows=$r))
            // cc/iqa/iQATree.g:110:7: (r+= row )+
            {
            // cc/iqa/iQATree.g:110:9: (r+= row )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==PIPE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // cc/iqa/iQATree.g:110:9: r+= row
            	    {
            	    pushFollow(FOLLOW_row_in_table520);
            	    r=row();

            	    state._fsp--;

            	    if (list_r==null) list_r=new ArrayList();
            	    list_r.add(r.getTemplate());


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


            // TEMPLATE REWRITE
            // 111:9: -> table(name=getVariableName(\"table\", _tableVariableIndex++)rows=$r)
            {
                retval.st = templateLib.getInstanceOf("table",new STAttrMap().put("name", getVariableName("table", _tableVariableIndex++)).put("rows", list_r));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table"


    public static class compound_stmt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "compound_stmt"
    // cc/iqa/iQATree.g:115:1: compound_stmt : ( ^( WHEN c= compound_condition ( suite )+ ( elif_clause )* ( else_clause )? ) -> if(condition=$c.stinstructions=$suite.stmtselif_stmt=$elif_clause.stelse_stmt=$else_clause.st)| step | assignment );
    public final iQATree.compound_stmt_return compound_stmt() throws RecognitionException {
        iQATree.compound_stmt_return retval = new iQATree.compound_stmt_return();
        retval.start = input.LT(1);


        iQATree.compound_condition_return c =null;

        iQATree.suite_return suite5 =null;

        iQATree.elif_clause_return elif_clause6 =null;

        iQATree.else_clause_return else_clause7 =null;

        iQATree.step_return step8 =null;

        iQATree.assignment_return assignment9 =null;


        try {
            // cc/iqa/iQATree.g:116:5: ( ^( WHEN c= compound_condition ( suite )+ ( elif_clause )* ( else_clause )? ) -> if(condition=$c.stinstructions=$suite.stmtselif_stmt=$elif_clause.stelse_stmt=$else_clause.st)| step | assignment )
            int alt12=3;
            switch ( input.LA(1) ) {
            case WHEN:
                {
                alt12=1;
                }
                break;
            case STEP_TREE:
                {
                alt12=2;
                }
                break;
            case EQUAL:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // cc/iqa/iQATree.g:116:7: ^( WHEN c= compound_condition ( suite )+ ( elif_clause )* ( else_clause )? )
                    {
                    match(input,WHEN,FOLLOW_WHEN_in_compound_stmt582); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_compound_condition_in_compound_stmt586);
                    c=compound_condition();

                    state._fsp--;


                    // cc/iqa/iQATree.g:116:35: ( suite )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==STEP_LIST) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // cc/iqa/iQATree.g:116:35: suite
                    	    {
                    	    pushFollow(FOLLOW_suite_in_compound_stmt588);
                    	    suite5=suite();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    // cc/iqa/iQATree.g:116:42: ( elif_clause )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==ELIF) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // cc/iqa/iQATree.g:116:42: elif_clause
                    	    {
                    	    pushFollow(FOLLOW_elif_clause_in_compound_stmt591);
                    	    elif_clause6=elif_clause();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    // cc/iqa/iQATree.g:116:55: ( else_clause )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ELSE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // cc/iqa/iQATree.g:116:55: else_clause
                            {
                            pushFollow(FOLLOW_else_clause_in_compound_stmt594);
                            else_clause7=else_clause();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 117:9: -> if(condition=$c.stinstructions=$suite.stmtselif_stmt=$elif_clause.stelse_stmt=$else_clause.st)
                    {
                        retval.st = templateLib.getInstanceOf("if",new STAttrMap().put("condition", (c!=null?c.st:null)).put("instructions", (suite5!=null?suite5.stmts:null)).put("elif_stmt", (elif_clause6!=null?elif_clause6.st:null)).put("else_stmt", (else_clause7!=null?else_clause7.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // cc/iqa/iQATree.g:121:7: step
                    {
                    pushFollow(FOLLOW_step_in_compound_stmt687);
                    step8=step();

                    state._fsp--;



                                retval.st = (step8!=null?step8.st:null);
                            

                    }
                    break;
                case 3 :
                    // cc/iqa/iQATree.g:125:7: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_compound_stmt705);
                    assignment9=assignment();

                    state._fsp--;



                                retval.st = (assignment9!=null?assignment9.st:null);
                            

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compound_stmt"


    public static class else_clause_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "else_clause"
    // cc/iqa/iQATree.g:131:1: else_clause : ^( ELSE ( suite )+ ) -> else(instructions=$suite.stmts);
    public final iQATree.else_clause_return else_clause() throws RecognitionException {
        iQATree.else_clause_return retval = new iQATree.else_clause_return();
        retval.start = input.LT(1);


        iQATree.suite_return suite10 =null;


        try {
            // cc/iqa/iQATree.g:132:5: ( ^( ELSE ( suite )+ ) -> else(instructions=$suite.stmts))
            // cc/iqa/iQATree.g:132:7: ^( ELSE ( suite )+ )
            {
            match(input,ELSE,FOLLOW_ELSE_in_else_clause733); 

            match(input, Token.DOWN, null); 
            // cc/iqa/iQATree.g:132:14: ( suite )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==STEP_LIST) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // cc/iqa/iQATree.g:132:14: suite
            	    {
            	    pushFollow(FOLLOW_suite_in_else_clause735);
            	    suite10=suite();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 133:9: -> else(instructions=$suite.stmts)
            {
                retval.st = templateLib.getInstanceOf("else",new STAttrMap().put("instructions", (suite10!=null?suite10.stmts:null)));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_clause"


    public static class elif_clause_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "elif_clause"
    // cc/iqa/iQATree.g:136:1: elif_clause : ^( ELIF c= compound_condition ( suite )+ ) -> elif(condition=$c.stinstructions=$suite.stmts);
    public final iQATree.elif_clause_return elif_clause() throws RecognitionException {
        iQATree.elif_clause_return retval = new iQATree.elif_clause_return();
        retval.start = input.LT(1);


        iQATree.compound_condition_return c =null;

        iQATree.suite_return suite11 =null;


        try {
            // cc/iqa/iQATree.g:137:5: ( ^( ELIF c= compound_condition ( suite )+ ) -> elif(condition=$c.stinstructions=$suite.stmts))
            // cc/iqa/iQATree.g:137:7: ^( ELIF c= compound_condition ( suite )+ )
            {
            match(input,ELIF,FOLLOW_ELIF_in_elif_clause774); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_compound_condition_in_elif_clause778);
            c=compound_condition();

            state._fsp--;


            // cc/iqa/iQATree.g:137:35: ( suite )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==STEP_LIST) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // cc/iqa/iQATree.g:137:35: suite
            	    {
            	    pushFollow(FOLLOW_suite_in_elif_clause780);
            	    suite11=suite();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 138:9: -> elif(condition=$c.stinstructions=$suite.stmts)
            {
                retval.st = templateLib.getInstanceOf("elif",new STAttrMap().put("condition", (c!=null?c.st:null)).put("instructions", (suite11!=null?suite11.stmts:null)));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elif_clause"


    public static class compound_condition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "compound_condition"
    // cc/iqa/iQATree.g:142:1: compound_condition : ( expression | assignment );
    public final iQATree.compound_condition_return compound_condition() throws RecognitionException {
        iQATree.compound_condition_return retval = new iQATree.compound_condition_return();
        retval.start = input.LT(1);


        iQATree.expression_return expression12 =null;

        iQATree.assignment_return assignment13 =null;


        try {
            // cc/iqa/iQATree.g:143:5: ( expression | assignment )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0 >= ADD && LA15_0 <= AND)||LA15_0==COP||LA15_0==DIV||LA15_0==EOP||(LA15_0 >= FLOAT && LA15_0 <= IDENTIFIER)||(LA15_0 >= MOD && LA15_0 <= MUL)||(LA15_0 >= NOT && LA15_0 <= OR)||LA15_0==SOP||(LA15_0 >= STRING && LA15_0 <= VARIABLE)||LA15_0==SUB_EXPR) ) {
                alt15=1;
            }
            else if ( (LA15_0==EQUAL) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // cc/iqa/iQATree.g:143:7: expression
                    {
                    pushFollow(FOLLOW_expression_in_compound_condition840);
                    expression12=expression();

                    state._fsp--;



                                retval.st = (expression12!=null?expression12.st:null);
                            

                    }
                    break;
                case 2 :
                    // cc/iqa/iQATree.g:147:7: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_compound_condition859);
                    assignment13=assignment();

                    state._fsp--;



                                retval.st = (assignment13!=null?assignment13.st:null);
                            

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compound_condition"


    public static class assignment_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "assignment"
    // cc/iqa/iQATree.g:153:1: assignment : ^( EQUAL n= VARIABLE v= assignment_right ) -> define_variable(name=removeQuote($n.getText(), '[')value=$v.st);
    public final iQATree.assignment_return assignment() throws RecognitionException {
        iQATree.assignment_return retval = new iQATree.assignment_return();
        retval.start = input.LT(1);


        CommonTree n=null;
        iQATree.assignment_right_return v =null;


        try {
            // cc/iqa/iQATree.g:154:5: ( ^( EQUAL n= VARIABLE v= assignment_right ) -> define_variable(name=removeQuote($n.getText(), '[')value=$v.st))
            // cc/iqa/iQATree.g:154:7: ^( EQUAL n= VARIABLE v= assignment_right )
            {
            match(input,EQUAL,FOLLOW_EQUAL_in_assignment887); 

            match(input, Token.DOWN, null); 
            n=(CommonTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_assignment891); 

            pushFollow(FOLLOW_assignment_right_in_assignment895);
            v=assignment_right();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 155:9: -> define_variable(name=removeQuote($n.getText(), '[')value=$v.st)
            {
                retval.st = templateLib.getInstanceOf("define_variable",new STAttrMap().put("name", removeQuote(n.getText(), '[')).put("value", (v!=null?v.st:null)));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class assignment_right_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "assignment_right"
    // cc/iqa/iQATree.g:158:1: assignment_right : ( expression | step | table | assignment );
    public final iQATree.assignment_right_return assignment_right() throws RecognitionException {
        iQATree.assignment_right_return retval = new iQATree.assignment_right_return();
        retval.start = input.LT(1);


        iQATree.expression_return expression14 =null;

        iQATree.step_return step15 =null;

        iQATree.table_return table16 =null;

        iQATree.assignment_return assignment17 =null;


        try {
            // cc/iqa/iQATree.g:159:5: ( expression | step | table | assignment )
            int alt16=4;
            switch ( input.LA(1) ) {
            case ADD:
            case AND:
            case COP:
            case DIV:
            case EOP:
            case FLOAT:
            case IDENTIFIER:
            case MOD:
            case MUL:
            case NOT:
            case OR:
            case SOP:
            case STRING:
            case SUB:
            case VARIABLE:
            case SUB_EXPR:
                {
                alt16=1;
                }
                break;
            case STEP_TREE:
                {
                alt16=2;
                }
                break;
            case PIPE:
                {
                alt16=3;
                }
                break;
            case EQUAL:
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
                    // cc/iqa/iQATree.g:159:7: expression
                    {
                    pushFollow(FOLLOW_expression_in_assignment_right939);
                    expression14=expression();

                    state._fsp--;



                                retval.st = (expression14!=null?expression14.st:null);
                            

                    }
                    break;
                case 2 :
                    // cc/iqa/iQATree.g:163:7: step
                    {
                    pushFollow(FOLLOW_step_in_assignment_right957);
                    step15=step();

                    state._fsp--;



                                retval.st = (step15!=null?step15.st:null);
                            

                    }
                    break;
                case 3 :
                    // cc/iqa/iQATree.g:167:7: table
                    {
                    pushFollow(FOLLOW_table_in_assignment_right975);
                    table16=table();

                    state._fsp--;



                                retval.st = (table16!=null?table16.st:null);
                            

                    }
                    break;
                case 4 :
                    // cc/iqa/iQATree.g:171:7: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_assignment_right993);
                    assignment17=assignment();

                    state._fsp--;



                                retval.st = (assignment17!=null?assignment17.st:null);
                            

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_right"


    public static class expression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "expression"
    // cc/iqa/iQATree.g:177:1: expression : ( ^(o= OR l= expression r= expression ) -> bi_expression(left=$l.stop=\"||\"right=$r.st)| ^(o= AND l= expression r= expression ) -> bi_expression(left=$l.stop=\"&&\"right=$r.st)| ^(o= EOP l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^( NOT v= expression ) -> not(expression=$v.st)| ^(o= COP l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^(o= SOP l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^(o= ADD l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^(o= SUB l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^(o= MUL l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^(o= DIV l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^(o= MOD l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| IDENTIFIER -> atom(value=$IDENTIFIER.text)| FLOAT -> atom(value=$FLOAT.text)| VARIABLE -> access_variable(name=removeQuote($VARIABLE.getText(), '['))| STRING -> atom(value=$STRING.text)| ^( SUB_EXPR v= expression ) -> sub(expression=$v.st));
    public final iQATree.expression_return expression() throws RecognitionException {
        iQATree.expression_return retval = new iQATree.expression_return();
        retval.start = input.LT(1);


        CommonTree o=null;
        CommonTree IDENTIFIER18=null;
        CommonTree FLOAT19=null;
        CommonTree VARIABLE20=null;
        CommonTree STRING21=null;
        iQATree.expression_return l =null;

        iQATree.expression_return r =null;

        iQATree.expression_return v =null;


        try {
            // cc/iqa/iQATree.g:178:5: ( ^(o= OR l= expression r= expression ) -> bi_expression(left=$l.stop=\"||\"right=$r.st)| ^(o= AND l= expression r= expression ) -> bi_expression(left=$l.stop=\"&&\"right=$r.st)| ^(o= EOP l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^( NOT v= expression ) -> not(expression=$v.st)| ^(o= COP l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^(o= SOP l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^(o= ADD l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^(o= SUB l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^(o= MUL l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^(o= DIV l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| ^(o= MOD l= expression r= expression ) -> bi_expression(left=$l.stop=$o.getText()right=$r.st)| IDENTIFIER -> atom(value=$IDENTIFIER.text)| FLOAT -> atom(value=$FLOAT.text)| VARIABLE -> access_variable(name=removeQuote($VARIABLE.getText(), '['))| STRING -> atom(value=$STRING.text)| ^( SUB_EXPR v= expression ) -> sub(expression=$v.st))
            int alt17=16;
            switch ( input.LA(1) ) {
            case OR:
                {
                alt17=1;
                }
                break;
            case AND:
                {
                alt17=2;
                }
                break;
            case EOP:
                {
                alt17=3;
                }
                break;
            case NOT:
                {
                alt17=4;
                }
                break;
            case COP:
                {
                alt17=5;
                }
                break;
            case SOP:
                {
                alt17=6;
                }
                break;
            case ADD:
                {
                alt17=7;
                }
                break;
            case SUB:
                {
                alt17=8;
                }
                break;
            case MUL:
                {
                alt17=9;
                }
                break;
            case DIV:
                {
                alt17=10;
                }
                break;
            case MOD:
                {
                alt17=11;
                }
                break;
            case IDENTIFIER:
                {
                alt17=12;
                }
                break;
            case FLOAT:
                {
                alt17=13;
                }
                break;
            case VARIABLE:
                {
                alt17=14;
                }
                break;
            case STRING:
                {
                alt17=15;
                }
                break;
            case SUB_EXPR:
                {
                alt17=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // cc/iqa/iQATree.g:178:7: ^(o= OR l= expression r= expression )
                    {
                    o=(CommonTree)match(input,OR,FOLLOW_OR_in_expression1023); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1027);
                    l=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1031);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 179:9: -> bi_expression(left=$l.stop=\"||\"right=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("bi_expression",new STAttrMap().put("left", (l!=null?l.st:null)).put("op", "||").put("right", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // cc/iqa/iQATree.g:180:7: ^(o= AND l= expression r= expression )
                    {
                    o=(CommonTree)match(input,AND,FOLLOW_AND_in_expression1076); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1080);
                    l=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1084);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 181:9: -> bi_expression(left=$l.stop=\"&&\"right=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("bi_expression",new STAttrMap().put("left", (l!=null?l.st:null)).put("op", "&&").put("right", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // cc/iqa/iQATree.g:182:7: ^(o= EOP l= expression r= expression )
                    {
                    o=(CommonTree)match(input,EOP,FOLLOW_EOP_in_expression1129); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1133);
                    l=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1137);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 183:9: -> bi_expression(left=$l.stop=$o.getText()right=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("bi_expression",new STAttrMap().put("left", (l!=null?l.st:null)).put("op", o.getText()).put("right", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // cc/iqa/iQATree.g:184:7: ^( NOT v= expression )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expression1180); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1184);
                    v=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 185:9: -> not(expression=$v.st)
                    {
                        retval.st = templateLib.getInstanceOf("not",new STAttrMap().put("expression", (v!=null?v.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // cc/iqa/iQATree.g:186:7: ^(o= COP l= expression r= expression )
                    {
                    o=(CommonTree)match(input,COP,FOLLOW_COP_in_expression1215); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1219);
                    l=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1223);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 187:9: -> bi_expression(left=$l.stop=$o.getText()right=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("bi_expression",new STAttrMap().put("left", (l!=null?l.st:null)).put("op", o.getText()).put("right", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // cc/iqa/iQATree.g:188:7: ^(o= SOP l= expression r= expression )
                    {
                    o=(CommonTree)match(input,SOP,FOLLOW_SOP_in_expression1268); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1272);
                    l=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1276);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 189:9: -> bi_expression(left=$l.stop=$o.getText()right=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("bi_expression",new STAttrMap().put("left", (l!=null?l.st:null)).put("op", o.getText()).put("right", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // cc/iqa/iQATree.g:190:7: ^(o= ADD l= expression r= expression )
                    {
                    o=(CommonTree)match(input,ADD,FOLLOW_ADD_in_expression1321); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1325);
                    l=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1329);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 191:9: -> bi_expression(left=$l.stop=$o.getText()right=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("bi_expression",new STAttrMap().put("left", (l!=null?l.st:null)).put("op", o.getText()).put("right", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 8 :
                    // cc/iqa/iQATree.g:192:7: ^(o= SUB l= expression r= expression )
                    {
                    o=(CommonTree)match(input,SUB,FOLLOW_SUB_in_expression1374); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1378);
                    l=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1382);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 193:9: -> bi_expression(left=$l.stop=$o.getText()right=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("bi_expression",new STAttrMap().put("left", (l!=null?l.st:null)).put("op", o.getText()).put("right", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 9 :
                    // cc/iqa/iQATree.g:194:7: ^(o= MUL l= expression r= expression )
                    {
                    o=(CommonTree)match(input,MUL,FOLLOW_MUL_in_expression1427); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1431);
                    l=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1435);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 195:9: -> bi_expression(left=$l.stop=$o.getText()right=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("bi_expression",new STAttrMap().put("left", (l!=null?l.st:null)).put("op", o.getText()).put("right", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 10 :
                    // cc/iqa/iQATree.g:196:7: ^(o= DIV l= expression r= expression )
                    {
                    o=(CommonTree)match(input,DIV,FOLLOW_DIV_in_expression1480); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1484);
                    l=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1488);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 197:9: -> bi_expression(left=$l.stop=$o.getText()right=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("bi_expression",new STAttrMap().put("left", (l!=null?l.st:null)).put("op", o.getText()).put("right", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 11 :
                    // cc/iqa/iQATree.g:198:7: ^(o= MOD l= expression r= expression )
                    {
                    o=(CommonTree)match(input,MOD,FOLLOW_MOD_in_expression1533); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1537);
                    l=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1541);
                    r=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 199:9: -> bi_expression(left=$l.stop=$o.getText()right=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("bi_expression",new STAttrMap().put("left", (l!=null?l.st:null)).put("op", o.getText()).put("right", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 12 :
                    // cc/iqa/iQATree.g:200:7: IDENTIFIER
                    {
                    IDENTIFIER18=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1583); 

                    // TEMPLATE REWRITE
                    // 201:9: -> atom(value=$IDENTIFIER.text)
                    {
                        retval.st = templateLib.getInstanceOf("atom",new STAttrMap().put("value", (IDENTIFIER18!=null?IDENTIFIER18.getText():null)));
                    }



                    }
                    break;
                case 13 :
                    // cc/iqa/iQATree.g:202:7: FLOAT
                    {
                    FLOAT19=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_expression1610); 

                    // TEMPLATE REWRITE
                    // 203:9: -> atom(value=$FLOAT.text)
                    {
                        retval.st = templateLib.getInstanceOf("atom",new STAttrMap().put("value", (FLOAT19!=null?FLOAT19.getText():null)));
                    }



                    }
                    break;
                case 14 :
                    // cc/iqa/iQATree.g:204:7: VARIABLE
                    {
                    VARIABLE20=(CommonTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_expression1637); 

                    // TEMPLATE REWRITE
                    // 205:9: -> access_variable(name=removeQuote($VARIABLE.getText(), '['))
                    {
                        retval.st = templateLib.getInstanceOf("access_variable",new STAttrMap().put("name", removeQuote(VARIABLE20.getText(), '[')));
                    }



                    }
                    break;
                case 15 :
                    // cc/iqa/iQATree.g:206:7: STRING
                    {
                    STRING21=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expression1664); 

                    // TEMPLATE REWRITE
                    // 207:9: -> atom(value=$STRING.text)
                    {
                        retval.st = templateLib.getInstanceOf("atom",new STAttrMap().put("value", (STRING21!=null?STRING21.getText():null)));
                    }



                    }
                    break;
                case 16 :
                    // cc/iqa/iQATree.g:208:7: ^( SUB_EXPR v= expression )
                    {
                    match(input,SUB_EXPR,FOLLOW_SUB_EXPR_in_expression1692); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1696);
                    v=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 209:9: -> sub(expression=$v.st)
                    {
                        retval.st = templateLib.getInstanceOf("sub",new STAttrMap().put("expression", (v!=null?v.st:null)));
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_feature_in_prog72 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FEATURE_in_feature118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FEATURE_DEF_in_feature122 = new BitSet(new long[]{0x0000020000000008L});
    public static final BitSet FOLLOW_feature_content_in_feature126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCENARIO_LIST_in_feature_content193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scenario_in_feature_content199 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_SCENARIO_in_scenario229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SCENARIO_DEF_in_scenario233 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_suite_in_scenario235 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_STEP_LIST_in_suite321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_compound_stmt_in_suite327 = new BitSet(new long[]{0x0000088000008008L});
    public static final BitSet FOLLOW_STEP_TREE_in_step357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STEP_in_step359 = new BitSet(new long[]{0x0000000020000008L});
    public static final BitSet FOLLOW_table_in_step361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_cell422 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_PIPE_in_cell424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PIPE_in_row451 = new BitSet(new long[]{0x000010721B184A30L});
    public static final BitSet FOLLOW_cell_in_row457 = new BitSet(new long[]{0x000010721B184A32L});
    public static final BitSet FOLLOW_row_in_table520 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_WHEN_in_compound_stmt582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_compound_condition_in_compound_stmt586 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_suite_in_compound_stmt588 = new BitSet(new long[]{0x0000040000003008L});
    public static final BitSet FOLLOW_elif_clause_in_compound_stmt591 = new BitSet(new long[]{0x0000000000003008L});
    public static final BitSet FOLLOW_else_clause_in_compound_stmt594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_step_in_compound_stmt687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_compound_stmt705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_clause733 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_suite_in_else_clause735 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_ELIF_in_elif_clause774 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_compound_condition_in_elif_clause778 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_suite_in_elif_clause780 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_expression_in_compound_condition840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_compound_condition859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_assignment887 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VARIABLE_in_assignment891 = new BitSet(new long[]{0x000018723B18CA30L});
    public static final BitSet FOLLOW_assignment_right_in_assignment895 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment_right939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_step_in_assignment_right957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_in_assignment_right975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_assignment_right993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expression1023 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1027 = new BitSet(new long[]{0x000010721B184A30L});
    public static final BitSet FOLLOW_expression_in_expression1031 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expression1076 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1080 = new BitSet(new long[]{0x000010721B184A30L});
    public static final BitSet FOLLOW_expression_in_expression1084 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EOP_in_expression1129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1133 = new BitSet(new long[]{0x000010721B184A30L});
    public static final BitSet FOLLOW_expression_in_expression1137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression1180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COP_in_expression1215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1219 = new BitSet(new long[]{0x000010721B184A30L});
    public static final BitSet FOLLOW_expression_in_expression1223 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SOP_in_expression1268 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1272 = new BitSet(new long[]{0x000010721B184A30L});
    public static final BitSet FOLLOW_expression_in_expression1276 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_in_expression1321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1325 = new BitSet(new long[]{0x000010721B184A30L});
    public static final BitSet FOLLOW_expression_in_expression1329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_in_expression1374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1378 = new BitSet(new long[]{0x000010721B184A30L});
    public static final BitSet FOLLOW_expression_in_expression1382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expression1427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1431 = new BitSet(new long[]{0x000010721B184A30L});
    public static final BitSet FOLLOW_expression_in_expression1435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expression1480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1484 = new BitSet(new long[]{0x000010721B184A30L});
    public static final BitSet FOLLOW_expression_in_expression1488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expression1533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1537 = new BitSet(new long[]{0x000010721B184A30L});
    public static final BitSet FOLLOW_expression_in_expression1541 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_expression1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_expression1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expression1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_EXPR_in_expression1692 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1696 = new BitSet(new long[]{0x0000000000000008L});

}