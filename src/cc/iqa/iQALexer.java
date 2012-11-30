// $ANTLR 3.4 cc/iqa/iQALexer.g 2012-07-20 12:55:57

package cc.iqa;

import java.util.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class iQALexer extends Lexer {
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

    boolean _seeBom = false;
    boolean _seeKeyword = false;
    boolean _seeWord = false;
    boolean _inATable = false;
    Stack<Integer> _indentStack = new Stack<Integer>();
    int implicitLineJoiningLevel = 0;

    List tokens = new ArrayList();
    public void emit(Token token) {
            state.token = token;
            tokens.add(token);
    }

    public Token nextToken() {
            super.nextToken();
            if ( tokens.size()==0 ) {
                return Token.EOF_TOKEN;
            }
            return (Token)tokens.remove(0);
    }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public iQALexer() {} 
    public iQALexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public iQALexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "cc/iqa/iQALexer.g"; }

    // $ANTLR start "BOM"
    public final void mBOM() throws RecognitionException {
        try {
            int _type = BOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:37:4: ( '\\uFEFF' )
            // cc/iqa/iQALexer.g:37:6: '\\uFEFF'
            {
            match('\uFEFF'); 

             _seeBom = true; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOM"

    // $ANTLR start "FEATURE_DEF"
    public final void mFEATURE_DEF() throws RecognitionException {
        try {
            int _type = FEATURE_DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:41:5: ( FEATURE (~ '\\n' )+ )
            // cc/iqa/iQALexer.g:41:7: FEATURE (~ '\\n' )+
            {
            mFEATURE(); 


            // cc/iqa/iQALexer.g:41:15: (~ '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // cc/iqa/iQALexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FEATURE_DEF"

    // $ANTLR start "FEATURE"
    public final void mFEATURE() throws RecognitionException {
        try {
            // cc/iqa/iQALexer.g:46:5: ({...}? => '\\u529F' '\\u80FD' )
            // cc/iqa/iQALexer.g:46:7: {...}? => '\\u529F' '\\u80FD'
            {
            if ( !(( !_seeWord )) ) {
                throw new FailedPredicateException(input, "FEATURE", " !_seeWord ");
            }

            match('\u529F'); 

            match('\u80FD'); 


                        _seeBom = false;
                        _seeKeyword = true;
                        _seeWord = true;
                        _indentStack = new Stack<Integer>();
                        _indentStack.push(new Integer(0));
                    

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FEATURE"

    // $ANTLR start "SCENARIO_DEF"
    public final void mSCENARIO_DEF() throws RecognitionException {
        try {
            int _type = SCENARIO_DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:57:5: ( SCENARIO (~ '\\n' )+ )
            // cc/iqa/iQALexer.g:57:7: SCENARIO (~ '\\n' )+
            {
            mSCENARIO(); 


            // cc/iqa/iQALexer.g:57:16: (~ '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // cc/iqa/iQALexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCENARIO_DEF"

    // $ANTLR start "SCENARIO"
    public final void mSCENARIO() throws RecognitionException {
        try {
            // cc/iqa/iQALexer.g:62:5: ({...}? => '\\u573A' '\\u666F' )
            // cc/iqa/iQALexer.g:62:7: {...}? => '\\u573A' '\\u666F'
            {
            if ( !(( !_seeWord )) ) {
                throw new FailedPredicateException(input, "SCENARIO", " !_seeWord ");
            }

            match('\u573A'); 

            match('\u666F'); 


                        _seeKeyword = true;
                        _seeWord = true;
                    

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCENARIO"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:70:5: ({...}? => '\\u5f53' )
            // cc/iqa/iQALexer.g:70:7: {...}? => '\\u5f53'
            {
            if ( !(( !_seeWord )) ) {
                throw new FailedPredicateException(input, "WHEN", " !_seeWord ");
            }

            match('\u5F53'); 


                        _seeKeyword = true;
                        _seeWord = true;
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:78:5: ({...}? => '\\u5426' '\\u5219' )
            // cc/iqa/iQALexer.g:78:7: {...}? => '\\u5426' '\\u5219'
            {
            if ( !(( !_seeWord )) ) {
                throw new FailedPredicateException(input, "ELSE", " !_seeWord ");
            }

            match('\u5426'); 

            match('\u5219'); 


                        _seeKeyword = true;
                        _seeWord = true;
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:86:5: ({...}? => '\\u5426' '\\u5219' '\\u5f53' )
            // cc/iqa/iQALexer.g:86:7: {...}? => '\\u5426' '\\u5219' '\\u5f53'
            {
            if ( !(( !_seeWord )) ) {
                throw new FailedPredicateException(input, "ELIF", " !_seeWord ");
            }

            match('\u5426'); 

            match('\u5219'); 

            match('\u5F53'); 


                        _seeKeyword = true;
                        _seeWord = true;
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELIF"

    // $ANTLR start "STEP"
    public final void mSTEP() throws RecognitionException {
        try {
            int _type = STEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:94:5: ( STAR (~ ( '\\n' ) )+ )
            // cc/iqa/iQALexer.g:94:7: STAR (~ ( '\\n' ) )+
            {
            mSTAR(); 


            // cc/iqa/iQALexer.g:94:12: (~ ( '\\n' ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // cc/iqa/iQALexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STEP"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            // cc/iqa/iQALexer.g:99:5: ({...}? => '*' )
            // cc/iqa/iQALexer.g:99:7: {...}? => '*'
            {
            if ( !(( !_seeWord )) ) {
                throw new FailedPredicateException(input, "STAR", " !_seeWord ");
            }

            match('*'); 


                        _seeKeyword = true;
                        _seeWord = true;
                    

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:107:5: ( '!' )
            // cc/iqa/iQALexer.g:107:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:111:5: ( '+' )
            // cc/iqa/iQALexer.g:111:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:115:5: ( '-' )
            // cc/iqa/iQALexer.g:115:7: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:119:5: ({...}? => '*' )
            // cc/iqa/iQALexer.g:119:7: {...}? => '*'
            {
            if ( !((_seeWord)) ) {
                throw new FailedPredicateException(input, "MUL", "_seeWord");
            }

            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:123:5: ( '/' )
            // cc/iqa/iQALexer.g:123:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:127:5: ( '%' )
            // cc/iqa/iQALexer.g:127:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _seeWord = true;

            // cc/iqa/iQALexer.g:134:5: ( '(' )
            // cc/iqa/iQALexer.g:134:7: '('
            {
            match('('); 

            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _seeWord = true;

            // cc/iqa/iQALexer.g:139:5: ( ')' )
            // cc/iqa/iQALexer.g:139:7: ')'
            {
            match(')'); 

            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _seeWord = true;

            // cc/iqa/iQALexer.g:145:5: ( '||' | 'or' | '\\u6216\\u8005' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case '|':
                {
                alt4=1;
                }
                break;
            case 'o':
                {
                alt4=2;
                }
                break;
            case '\u6216':
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // cc/iqa/iQALexer.g:145:7: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 2 :
                    // cc/iqa/iQALexer.g:145:14: 'or'
                    {
                    match("or"); 



                    }
                    break;
                case 3 :
                    // cc/iqa/iQALexer.g:145:21: '\\u6216\\u8005'
                    {
                    match("\u6216\u8005"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _seeWord = true;

            // cc/iqa/iQALexer.g:150:5: ( '&&' | 'and' | '\\u5e76\\u4e14' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case '&':
                {
                alt5=1;
                }
                break;
            case 'a':
                {
                alt5=2;
                }
                break;
            case '\u5E76':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // cc/iqa/iQALexer.g:150:7: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // cc/iqa/iQALexer.g:150:14: 'and'
                    {
                    match("and"); 



                    }
                    break;
                case 3 :
                    // cc/iqa/iQALexer.g:150:22: '\\u5e76\\u4e14'
                    {
                    match("\u5e76\u4e14"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "COP"
    public final void mCOP() throws RecognitionException {
        try {
            int _type = COP;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _seeWord = true;

            // cc/iqa/iQALexer.g:155:5: ( '<' | '<=' | '>' | '>=' )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='<') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='=') ) {
                    alt6=2;
                }
                else {
                    alt6=1;
                }
            }
            else if ( (LA6_0=='>') ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='=') ) {
                    alt6=4;
                }
                else {
                    alt6=3;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // cc/iqa/iQALexer.g:155:7: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // cc/iqa/iQALexer.g:155:13: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 3 :
                    // cc/iqa/iQALexer.g:155:20: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // cc/iqa/iQALexer.g:155:26: '>='
                    {
                    match(">="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COP"

    // $ANTLR start "EOP"
    public final void mEOP() throws RecognitionException {
        try {
            int _type = EOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _seeWord = true;

            // cc/iqa/iQALexer.g:160:5: ( '==' | '!=' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='=') ) {
                alt7=1;
            }
            else if ( (LA7_0=='!') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // cc/iqa/iQALexer.g:160:7: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 2 :
                    // cc/iqa/iQALexer.g:160:14: '!='
                    {
                    match("!="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EOP"

    // $ANTLR start "SOP"
    public final void mSOP() throws RecognitionException {
        try {
            int _type = SOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _seeWord = true;

            // cc/iqa/iQALexer.g:165:5: ( '<<' | '>>' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='<') ) {
                alt8=1;
            }
            else if ( (LA8_0=='>') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // cc/iqa/iQALexer.g:165:7: '<<'
                    {
                    match("<<"); 



                    }
                    break;
                case 2 :
                    // cc/iqa/iQALexer.g:165:14: '>>'
                    {
                    match(">>"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SOP"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _seeWord = true;

            // cc/iqa/iQALexer.g:171:5: ({...}? ':' | '\\uff1a' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==':') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\uFF1A') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // cc/iqa/iQALexer.g:171:7: {...}? ':'
                    {
                    if ( !(( _seeKeyword )) ) {
                        throw new FailedPredicateException(input, "COLON", " _seeKeyword ");
                    }

                    match(':'); 

                    }
                    break;
                case 2 :
                    // cc/iqa/iQALexer.g:171:30: '\\uff1a'
                    {
                    match('\uFF1A'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _seeWord = false;

            // cc/iqa/iQALexer.g:178:5: ( '=' )
            // cc/iqa/iQALexer.g:178:7: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "COMMENTS"
    public final void mCOMMENTS() throws RecognitionException {
        try {
            int _type = COMMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _channel = HIDDEN;

            // cc/iqa/iQALexer.g:188:5: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' )? ( ' ' | '\\t' )* '#' (~ '\\n' )* |{...}? => '#' (~ '\\n' )* )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0 >= '\t' && LA16_0 <= '\n')||(LA16_0 >= '\f' && LA16_0 <= '\r')||LA16_0==' ') ) {
                alt16=1;
            }
            else if ( (LA16_0=='#') ) {
                int LA16_2 = input.LA(2);

                if ( (!(((getCharPositionInLine() > 0 )))) ) {
                    alt16=1;
                }
                else if ( ((getCharPositionInLine() > 0 )) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // cc/iqa/iQALexer.g:188:7: ( ( '\\u000C' )? ( '\\r' )? '\\n' )? ( ' ' | '\\t' )* '#' (~ '\\n' )*
                    {
                    // cc/iqa/iQALexer.g:188:7: ( ( '\\u000C' )? ( '\\r' )? '\\n' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\n'||(LA12_0 >= '\f' && LA12_0 <= '\r')) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // cc/iqa/iQALexer.g:188:8: ( '\\u000C' )? ( '\\r' )? '\\n'
                            {
                            // cc/iqa/iQALexer.g:188:8: ( '\\u000C' )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0=='\f') ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // cc/iqa/iQALexer.g:188:9: '\\u000C'
                                    {
                                    match('\f'); 

                                    }
                                    break;

                            }


                            // cc/iqa/iQALexer.g:188:19: ( '\\r' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0=='\r') ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // cc/iqa/iQALexer.g:188:20: '\\r'
                                    {
                                    match('\r'); 

                                    }
                                    break;

                            }


                            match('\n'); 

                            }
                            break;

                    }


                    // cc/iqa/iQALexer.g:188:34: ( ' ' | '\\t' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\t'||LA13_0==' ') ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // cc/iqa/iQALexer.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    match('#'); 

                    // cc/iqa/iQALexer.g:188:52: (~ '\\n' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\uFFFF')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // cc/iqa/iQALexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // cc/iqa/iQALexer.g:189:7: {...}? => '#' (~ '\\n' )*
                    {
                    if ( !((getCharPositionInLine() > 0 )) ) {
                        throw new FailedPredicateException(input, "COMMENTS", "getCharPositionInLine() > 0 ");
                    }

                    match('#'); 

                    // cc/iqa/iQALexer.g:189:46: (~ '\\n' )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\uFFFF')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // cc/iqa/iQALexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENTS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int leading_space;


                int spaces = 0;

            // cc/iqa/iQALexer.g:196:5: ( ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )* ( ( '\\u000C' )? ( '\\r' )? '\\n' ) (leading_space= ( ' ' | '\\t' ) )* | ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )* ( ( '\\u000C' )? ( '\\r' )? '\\n' ) ( ' ' | '\\t' )* '#' (~ '\\n' )* )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // cc/iqa/iQALexer.g:196:9: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )* ( ( '\\u000C' )? ( '\\r' )? '\\n' ) (leading_space= ( ' ' | '\\t' ) )*
                    {
                    // cc/iqa/iQALexer.g:196:9: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )*
                    loop19:
                    do {
                        int alt19=4;
                        alt19 = dfa19.predict(input);
                        switch (alt19) {
                    	case 1 :
                    	    // cc/iqa/iQALexer.g:196:10: ( ( '\\u000C' )? ( '\\r' )? '\\n' )
                    	    {
                    	    // cc/iqa/iQALexer.g:196:10: ( ( '\\u000C' )? ( '\\r' )? '\\n' )
                    	    // cc/iqa/iQALexer.g:196:11: ( '\\u000C' )? ( '\\r' )? '\\n'
                    	    {
                    	    // cc/iqa/iQALexer.g:196:11: ( '\\u000C' )?
                    	    int alt17=2;
                    	    int LA17_0 = input.LA(1);

                    	    if ( (LA17_0=='\f') ) {
                    	        alt17=1;
                    	    }
                    	    switch (alt17) {
                    	        case 1 :
                    	            // cc/iqa/iQALexer.g:196:12: '\\u000C'
                    	            {
                    	            match('\f'); 

                    	            }
                    	            break;

                    	    }


                    	    // cc/iqa/iQALexer.g:196:22: ( '\\r' )?
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0=='\r') ) {
                    	        alt18=1;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // cc/iqa/iQALexer.g:196:23: '\\r'
                    	            {
                    	            match('\r'); 

                    	            }
                    	            break;

                    	    }


                    	    match('\n'); 

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // cc/iqa/iQALexer.g:196:39: '\\t'
                    	    {
                    	    match('\t'); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // cc/iqa/iQALexer.g:196:46: ' '
                    	    {
                    	    match(' '); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    // cc/iqa/iQALexer.g:196:52: ( ( '\\u000C' )? ( '\\r' )? '\\n' )
                    // cc/iqa/iQALexer.g:196:53: ( '\\u000C' )? ( '\\r' )? '\\n'
                    {
                    // cc/iqa/iQALexer.g:196:53: ( '\\u000C' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\f') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // cc/iqa/iQALexer.g:196:54: '\\u000C'
                            {
                            match('\f'); 

                            }
                            break;

                    }


                    // cc/iqa/iQALexer.g:196:64: ( '\\r' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\r') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // cc/iqa/iQALexer.g:196:65: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }


                    // cc/iqa/iQALexer.g:197:23: (leading_space= ( ' ' | '\\t' ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\t'||LA23_0==' ') ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // cc/iqa/iQALexer.g:197:23: leading_space= ( ' ' | '\\t' )
                    	    {
                    	    // cc/iqa/iQALexer.g:197:25: ( ' ' | '\\t' )
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==' ') ) {
                    	        alt22=1;
                    	    }
                    	    else if ( (LA22_0=='\t') ) {
                    	        alt22=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 22, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // cc/iqa/iQALexer.g:197:26: ' '
                    	            {
                    	            match(' '); 

                    	             spaces++; 

                    	            }
                    	            break;
                    	        case 2 :
                    	            // cc/iqa/iQALexer.g:197:46: '\\t'
                    	            {
                    	            match('\t'); 

                    	             spaces += 8; spaces -= (spaces % 8); 

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);



                                if ( !_inATable && 
                                     (getCharPositionInLine() == 0 ||
                                      implicitLineJoiningLevel > 0) ) {
                                    emit(new ClassicToken(NEWLINE, this.getText(), HIDDEN));
                                } else {
                                    emit(new ClassicToken(NEWLINE, this.getText(), HIDDEN));
                                }

                                if ( implicitLineJoiningLevel == 0 && 
                                     _indentStack.size() > 0) {
                                    if (spaces > _indentStack.peek().intValue() ) {
                                        _indentStack.push(new Integer(spaces));                    
                                        emit(new ClassicToken(INDENT, ">"));
                                    }
                                    else {
                                        while ( spaces < _indentStack.peek().intValue() ) {
                                            _indentStack.pop();
                                            emit(new ClassicToken(DEDENT, "<"));
                                        }
                                    }
                                }

                                _seeKeyword = false;
                                _seeWord = false;
                                _inATable = false;
                            

                    }
                    break;
                case 2 :
                    // cc/iqa/iQALexer.g:225:7: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )* ( ( '\\u000C' )? ( '\\r' )? '\\n' ) ( ' ' | '\\t' )* '#' (~ '\\n' )*
                    {
                    // cc/iqa/iQALexer.g:225:7: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )*
                    loop26:
                    do {
                        int alt26=4;
                        alt26 = dfa26.predict(input);
                        switch (alt26) {
                    	case 1 :
                    	    // cc/iqa/iQALexer.g:225:8: ( ( '\\u000C' )? ( '\\r' )? '\\n' )
                    	    {
                    	    // cc/iqa/iQALexer.g:225:8: ( ( '\\u000C' )? ( '\\r' )? '\\n' )
                    	    // cc/iqa/iQALexer.g:225:9: ( '\\u000C' )? ( '\\r' )? '\\n'
                    	    {
                    	    // cc/iqa/iQALexer.g:225:9: ( '\\u000C' )?
                    	    int alt24=2;
                    	    int LA24_0 = input.LA(1);

                    	    if ( (LA24_0=='\f') ) {
                    	        alt24=1;
                    	    }
                    	    switch (alt24) {
                    	        case 1 :
                    	            // cc/iqa/iQALexer.g:225:10: '\\u000C'
                    	            {
                    	            match('\f'); 

                    	            }
                    	            break;

                    	    }


                    	    // cc/iqa/iQALexer.g:225:20: ( '\\r' )?
                    	    int alt25=2;
                    	    int LA25_0 = input.LA(1);

                    	    if ( (LA25_0=='\r') ) {
                    	        alt25=1;
                    	    }
                    	    switch (alt25) {
                    	        case 1 :
                    	            // cc/iqa/iQALexer.g:225:21: '\\r'
                    	            {
                    	            match('\r'); 

                    	            }
                    	            break;

                    	    }


                    	    match('\n'); 

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // cc/iqa/iQALexer.g:225:37: '\\t'
                    	    {
                    	    match('\t'); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // cc/iqa/iQALexer.g:225:44: ' '
                    	    {
                    	    match(' '); 

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    // cc/iqa/iQALexer.g:225:50: ( ( '\\u000C' )? ( '\\r' )? '\\n' )
                    // cc/iqa/iQALexer.g:225:51: ( '\\u000C' )? ( '\\r' )? '\\n'
                    {
                    // cc/iqa/iQALexer.g:225:51: ( '\\u000C' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='\f') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // cc/iqa/iQALexer.g:225:52: '\\u000C'
                            {
                            match('\f'); 

                            }
                            break;

                    }


                    // cc/iqa/iQALexer.g:225:62: ( '\\r' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='\r') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // cc/iqa/iQALexer.g:225:63: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }


                    // cc/iqa/iQALexer.g:226:7: ( ' ' | '\\t' )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='\t'||LA29_0==' ') ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // cc/iqa/iQALexer.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    match('#'); 

                    // cc/iqa/iQALexer.g:226:25: (~ '\\n' )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0 >= '\u0000' && LA30_0 <= '\t')||(LA30_0 >= '\u000B' && LA30_0 <= '\uFFFF')) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // cc/iqa/iQALexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);



                                _channel = HIDDEN;
                                _seeKeyword = false;
                                _seeWord = false;
                                _inATable = false;
                            

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _seeWord = true;

            // cc/iqa/iQALexer.g:239:5: ( '|' )
            // cc/iqa/iQALexer.g:239:7: '|'
            {
            match('|'); 


                        _inATable = true;
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _seeWord = true;

            // cc/iqa/iQALexer.g:249:5: ( '\"' (~ ( '\"' | '\\n' ) )* '\"' )
            // cc/iqa/iQALexer.g:249:7: '\"' (~ ( '\"' | '\\n' ) )* '\"'
            {
            match('\"'); 

            // cc/iqa/iQALexer.g:249:11: (~ ( '\"' | '\\n' ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0 >= '\u0000' && LA32_0 <= '\t')||(LA32_0 >= '\u000B' && LA32_0 <= '!')||(LA32_0 >= '#' && LA32_0 <= '\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // cc/iqa/iQALexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _seeWord = true;

            // cc/iqa/iQALexer.g:256:5: ( '[' IDENTIFIER ']' )
            // cc/iqa/iQALexer.g:256:7: '[' IDENTIFIER ']'
            {
            match('['); 

            mIDENTIFIER(); 


            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;

            _seeWord = true;

            // cc/iqa/iQALexer.g:263:5: ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | ( '+' | '-' )? '.' ( '0' .. '9' )+ ( Exponent )? | ( '+' | '-' )? ( '0' .. '9' )+ ( Exponent )? )
            int alt43=3;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // cc/iqa/iQALexer.g:263:9: ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )?
                    {
                    // cc/iqa/iQALexer.g:263:9: ( '+' | '-' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0=='+'||LA33_0=='-') ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // cc/iqa/iQALexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    // cc/iqa/iQALexer.g:263:20: ( '0' .. '9' )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0 >= '0' && LA34_0 <= '9')) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // cc/iqa/iQALexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    match('.'); 

                    // cc/iqa/iQALexer.g:263:36: ( '0' .. '9' )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0 >= '0' && LA35_0 <= '9')) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // cc/iqa/iQALexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    // cc/iqa/iQALexer.g:263:48: ( Exponent )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0=='E'||LA36_0=='e') ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // cc/iqa/iQALexer.g:263:48: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // cc/iqa/iQALexer.g:264:9: ( '+' | '-' )? '.' ( '0' .. '9' )+ ( Exponent )?
                    {
                    // cc/iqa/iQALexer.g:264:9: ( '+' | '-' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0=='+'||LA37_0=='-') ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // cc/iqa/iQALexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    match('.'); 

                    // cc/iqa/iQALexer.g:264:24: ( '0' .. '9' )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0 >= '0' && LA38_0 <= '9')) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // cc/iqa/iQALexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);


                    // cc/iqa/iQALexer.g:264:36: ( Exponent )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0=='E'||LA39_0=='e') ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // cc/iqa/iQALexer.g:264:36: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // cc/iqa/iQALexer.g:265:9: ( '+' | '-' )? ( '0' .. '9' )+ ( Exponent )?
                    {
                    // cc/iqa/iQALexer.g:265:9: ( '+' | '-' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='+'||LA40_0=='-') ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // cc/iqa/iQALexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    // cc/iqa/iQALexer.g:265:20: ( '0' .. '9' )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0 >= '0' && LA41_0 <= '9')) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // cc/iqa/iQALexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);


                    // cc/iqa/iQALexer.g:265:32: ( Exponent )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0=='E'||LA42_0=='e') ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // cc/iqa/iQALexer.g:265:32: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "WHITE"
    public final void mWHITE() throws RecognitionException {
        try {
            int _type = WHITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:269:5: ( ( ' ' | '\\t' | '\\u000C' ) )
            // cc/iqa/iQALexer.g:269:7: ( ' ' | '\\t' | '\\u000C' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }



                        _channel = HIDDEN;
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITE"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // cc/iqa/iQALexer.g:276:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // cc/iqa/iQALexer.g:276:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // cc/iqa/iQALexer.g:276:22: ( '+' | '-' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0=='+'||LA44_0=='-') ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // cc/iqa/iQALexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // cc/iqa/iQALexer.g:276:33: ( '0' .. '9' )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0 >= '0' && LA45_0 <= '9')) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // cc/iqa/iQALexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cc/iqa/iQALexer.g:279:5: ( ( ID_START )* )
            // cc/iqa/iQALexer.g:279:7: ( ID_START )*
            {
            // cc/iqa/iQALexer.g:279:7: ( ID_START )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0 >= 'A' && LA46_0 <= 'Z')||LA46_0=='_'||(LA46_0 >= 'a' && LA46_0 <= 'z')||LA46_0=='\u00AA'||LA46_0=='\u00B5'||LA46_0=='\u00BA'||(LA46_0 >= '\u00C0' && LA46_0 <= '\u00D6')||(LA46_0 >= '\u00D8' && LA46_0 <= '\u00F6')||(LA46_0 >= '\u00F8' && LA46_0 <= '\u0241')||(LA46_0 >= '\u0250' && LA46_0 <= '\u02C1')||(LA46_0 >= '\u02C6' && LA46_0 <= '\u02D1')||(LA46_0 >= '\u02E0' && LA46_0 <= '\u02E4')||LA46_0=='\u02EE'||LA46_0=='\u037A'||LA46_0=='\u0386'||(LA46_0 >= '\u0388' && LA46_0 <= '\u038A')||LA46_0=='\u038C'||(LA46_0 >= '\u038E' && LA46_0 <= '\u03A1')||(LA46_0 >= '\u03A3' && LA46_0 <= '\u03CE')||(LA46_0 >= '\u03D0' && LA46_0 <= '\u03F5')||(LA46_0 >= '\u03F7' && LA46_0 <= '\u0481')||(LA46_0 >= '\u048A' && LA46_0 <= '\u04CE')||(LA46_0 >= '\u04D0' && LA46_0 <= '\u04F9')||(LA46_0 >= '\u0500' && LA46_0 <= '\u050F')||(LA46_0 >= '\u0531' && LA46_0 <= '\u0556')||LA46_0=='\u0559'||(LA46_0 >= '\u0561' && LA46_0 <= '\u0587')||(LA46_0 >= '\u05D0' && LA46_0 <= '\u05EA')||(LA46_0 >= '\u05F0' && LA46_0 <= '\u05F2')||(LA46_0 >= '\u0621' && LA46_0 <= '\u063A')||(LA46_0 >= '\u0640' && LA46_0 <= '\u064A')||(LA46_0 >= '\u066E' && LA46_0 <= '\u066F')||(LA46_0 >= '\u0671' && LA46_0 <= '\u06D3')||LA46_0=='\u06D5'||(LA46_0 >= '\u06E5' && LA46_0 <= '\u06E6')||(LA46_0 >= '\u06EE' && LA46_0 <= '\u06EF')||(LA46_0 >= '\u06FA' && LA46_0 <= '\u06FC')||LA46_0=='\u06FF'||LA46_0=='\u0710'||(LA46_0 >= '\u0712' && LA46_0 <= '\u072F')||(LA46_0 >= '\u074D' && LA46_0 <= '\u076D')||(LA46_0 >= '\u0780' && LA46_0 <= '\u07A5')||LA46_0=='\u07B1'||(LA46_0 >= '\u0904' && LA46_0 <= '\u0939')||LA46_0=='\u093D'||LA46_0=='\u0950'||(LA46_0 >= '\u0958' && LA46_0 <= '\u0961')||LA46_0=='\u097D'||(LA46_0 >= '\u0985' && LA46_0 <= '\u098C')||(LA46_0 >= '\u098F' && LA46_0 <= '\u0990')||(LA46_0 >= '\u0993' && LA46_0 <= '\u09A8')||(LA46_0 >= '\u09AA' && LA46_0 <= '\u09B0')||LA46_0=='\u09B2'||(LA46_0 >= '\u09B6' && LA46_0 <= '\u09B9')||LA46_0=='\u09BD'||LA46_0=='\u09CE'||(LA46_0 >= '\u09DC' && LA46_0 <= '\u09DD')||(LA46_0 >= '\u09DF' && LA46_0 <= '\u09E1')||(LA46_0 >= '\u09F0' && LA46_0 <= '\u09F1')||(LA46_0 >= '\u0A05' && LA46_0 <= '\u0A0A')||(LA46_0 >= '\u0A0F' && LA46_0 <= '\u0A10')||(LA46_0 >= '\u0A13' && LA46_0 <= '\u0A28')||(LA46_0 >= '\u0A2A' && LA46_0 <= '\u0A30')||(LA46_0 >= '\u0A32' && LA46_0 <= '\u0A33')||(LA46_0 >= '\u0A35' && LA46_0 <= '\u0A36')||(LA46_0 >= '\u0A38' && LA46_0 <= '\u0A39')||(LA46_0 >= '\u0A59' && LA46_0 <= '\u0A5C')||LA46_0=='\u0A5E'||(LA46_0 >= '\u0A72' && LA46_0 <= '\u0A74')||(LA46_0 >= '\u0A85' && LA46_0 <= '\u0A8D')||(LA46_0 >= '\u0A8F' && LA46_0 <= '\u0A91')||(LA46_0 >= '\u0A93' && LA46_0 <= '\u0AA8')||(LA46_0 >= '\u0AAA' && LA46_0 <= '\u0AB0')||(LA46_0 >= '\u0AB2' && LA46_0 <= '\u0AB3')||(LA46_0 >= '\u0AB5' && LA46_0 <= '\u0AB9')||LA46_0=='\u0ABD'||LA46_0=='\u0AD0'||(LA46_0 >= '\u0AE0' && LA46_0 <= '\u0AE1')||(LA46_0 >= '\u0B05' && LA46_0 <= '\u0B0C')||(LA46_0 >= '\u0B0F' && LA46_0 <= '\u0B10')||(LA46_0 >= '\u0B13' && LA46_0 <= '\u0B28')||(LA46_0 >= '\u0B2A' && LA46_0 <= '\u0B30')||(LA46_0 >= '\u0B32' && LA46_0 <= '\u0B33')||(LA46_0 >= '\u0B35' && LA46_0 <= '\u0B39')||LA46_0=='\u0B3D'||(LA46_0 >= '\u0B5C' && LA46_0 <= '\u0B5D')||(LA46_0 >= '\u0B5F' && LA46_0 <= '\u0B61')||LA46_0=='\u0B71'||LA46_0=='\u0B83'||(LA46_0 >= '\u0B85' && LA46_0 <= '\u0B8A')||(LA46_0 >= '\u0B8E' && LA46_0 <= '\u0B90')||(LA46_0 >= '\u0B92' && LA46_0 <= '\u0B95')||(LA46_0 >= '\u0B99' && LA46_0 <= '\u0B9A')||LA46_0=='\u0B9C'||(LA46_0 >= '\u0B9E' && LA46_0 <= '\u0B9F')||(LA46_0 >= '\u0BA3' && LA46_0 <= '\u0BA4')||(LA46_0 >= '\u0BA8' && LA46_0 <= '\u0BAA')||(LA46_0 >= '\u0BAE' && LA46_0 <= '\u0BB9')||(LA46_0 >= '\u0C05' && LA46_0 <= '\u0C0C')||(LA46_0 >= '\u0C0E' && LA46_0 <= '\u0C10')||(LA46_0 >= '\u0C12' && LA46_0 <= '\u0C28')||(LA46_0 >= '\u0C2A' && LA46_0 <= '\u0C33')||(LA46_0 >= '\u0C35' && LA46_0 <= '\u0C39')||(LA46_0 >= '\u0C60' && LA46_0 <= '\u0C61')||(LA46_0 >= '\u0C85' && LA46_0 <= '\u0C8C')||(LA46_0 >= '\u0C8E' && LA46_0 <= '\u0C90')||(LA46_0 >= '\u0C92' && LA46_0 <= '\u0CA8')||(LA46_0 >= '\u0CAA' && LA46_0 <= '\u0CB3')||(LA46_0 >= '\u0CB5' && LA46_0 <= '\u0CB9')||LA46_0=='\u0CBD'||LA46_0=='\u0CDE'||(LA46_0 >= '\u0CE0' && LA46_0 <= '\u0CE1')||(LA46_0 >= '\u0D05' && LA46_0 <= '\u0D0C')||(LA46_0 >= '\u0D0E' && LA46_0 <= '\u0D10')||(LA46_0 >= '\u0D12' && LA46_0 <= '\u0D28')||(LA46_0 >= '\u0D2A' && LA46_0 <= '\u0D39')||(LA46_0 >= '\u0D60' && LA46_0 <= '\u0D61')||(LA46_0 >= '\u0D85' && LA46_0 <= '\u0D96')||(LA46_0 >= '\u0D9A' && LA46_0 <= '\u0DB1')||(LA46_0 >= '\u0DB3' && LA46_0 <= '\u0DBB')||LA46_0=='\u0DBD'||(LA46_0 >= '\u0DC0' && LA46_0 <= '\u0DC6')||(LA46_0 >= '\u0E01' && LA46_0 <= '\u0E30')||(LA46_0 >= '\u0E32' && LA46_0 <= '\u0E33')||(LA46_0 >= '\u0E40' && LA46_0 <= '\u0E46')||(LA46_0 >= '\u0E81' && LA46_0 <= '\u0E82')||LA46_0=='\u0E84'||(LA46_0 >= '\u0E87' && LA46_0 <= '\u0E88')||LA46_0=='\u0E8A'||LA46_0=='\u0E8D'||(LA46_0 >= '\u0E94' && LA46_0 <= '\u0E97')||(LA46_0 >= '\u0E99' && LA46_0 <= '\u0E9F')||(LA46_0 >= '\u0EA1' && LA46_0 <= '\u0EA3')||LA46_0=='\u0EA5'||LA46_0=='\u0EA7'||(LA46_0 >= '\u0EAA' && LA46_0 <= '\u0EAB')||(LA46_0 >= '\u0EAD' && LA46_0 <= '\u0EB0')||(LA46_0 >= '\u0EB2' && LA46_0 <= '\u0EB3')||LA46_0=='\u0EBD'||(LA46_0 >= '\u0EC0' && LA46_0 <= '\u0EC4')||LA46_0=='\u0EC6'||(LA46_0 >= '\u0EDC' && LA46_0 <= '\u0EDD')||LA46_0=='\u0F00'||(LA46_0 >= '\u0F40' && LA46_0 <= '\u0F47')||(LA46_0 >= '\u0F49' && LA46_0 <= '\u0F6A')||(LA46_0 >= '\u0F88' && LA46_0 <= '\u0F8B')||(LA46_0 >= '\u1000' && LA46_0 <= '\u1021')||(LA46_0 >= '\u1023' && LA46_0 <= '\u1027')||(LA46_0 >= '\u1029' && LA46_0 <= '\u102A')||(LA46_0 >= '\u1050' && LA46_0 <= '\u1055')||(LA46_0 >= '\u10A0' && LA46_0 <= '\u10C5')||(LA46_0 >= '\u10D0' && LA46_0 <= '\u10FA')||LA46_0=='\u10FC'||(LA46_0 >= '\u1100' && LA46_0 <= '\u1159')||(LA46_0 >= '\u115F' && LA46_0 <= '\u11A2')||(LA46_0 >= '\u11A8' && LA46_0 <= '\u11F9')||(LA46_0 >= '\u1200' && LA46_0 <= '\u1248')||(LA46_0 >= '\u124A' && LA46_0 <= '\u124D')||(LA46_0 >= '\u1250' && LA46_0 <= '\u1256')||LA46_0=='\u1258'||(LA46_0 >= '\u125A' && LA46_0 <= '\u125D')||(LA46_0 >= '\u1260' && LA46_0 <= '\u1288')||(LA46_0 >= '\u128A' && LA46_0 <= '\u128D')||(LA46_0 >= '\u1290' && LA46_0 <= '\u12B0')||(LA46_0 >= '\u12B2' && LA46_0 <= '\u12B5')||(LA46_0 >= '\u12B8' && LA46_0 <= '\u12BE')||LA46_0=='\u12C0'||(LA46_0 >= '\u12C2' && LA46_0 <= '\u12C5')||(LA46_0 >= '\u12C8' && LA46_0 <= '\u12D6')||(LA46_0 >= '\u12D8' && LA46_0 <= '\u1310')||(LA46_0 >= '\u1312' && LA46_0 <= '\u1315')||(LA46_0 >= '\u1318' && LA46_0 <= '\u135A')||(LA46_0 >= '\u1380' && LA46_0 <= '\u138F')||(LA46_0 >= '\u13A0' && LA46_0 <= '\u13F4')||(LA46_0 >= '\u1401' && LA46_0 <= '\u166C')||(LA46_0 >= '\u166F' && LA46_0 <= '\u1676')||(LA46_0 >= '\u1681' && LA46_0 <= '\u169A')||(LA46_0 >= '\u16A0' && LA46_0 <= '\u16EA')||(LA46_0 >= '\u16EE' && LA46_0 <= '\u16F0')||(LA46_0 >= '\u1700' && LA46_0 <= '\u170C')||(LA46_0 >= '\u170E' && LA46_0 <= '\u1711')||(LA46_0 >= '\u1720' && LA46_0 <= '\u1731')||(LA46_0 >= '\u1740' && LA46_0 <= '\u1751')||(LA46_0 >= '\u1760' && LA46_0 <= '\u176C')||(LA46_0 >= '\u176E' && LA46_0 <= '\u1770')||(LA46_0 >= '\u1780' && LA46_0 <= '\u17B3')||LA46_0=='\u17D7'||LA46_0=='\u17DC'||(LA46_0 >= '\u1820' && LA46_0 <= '\u1877')||(LA46_0 >= '\u1880' && LA46_0 <= '\u18A8')||(LA46_0 >= '\u1900' && LA46_0 <= '\u191C')||(LA46_0 >= '\u1950' && LA46_0 <= '\u196D')||(LA46_0 >= '\u1970' && LA46_0 <= '\u1974')||(LA46_0 >= '\u1980' && LA46_0 <= '\u19A9')||(LA46_0 >= '\u19C1' && LA46_0 <= '\u19C7')||(LA46_0 >= '\u1A00' && LA46_0 <= '\u1A16')||(LA46_0 >= '\u1D00' && LA46_0 <= '\u1DBF')||(LA46_0 >= '\u1E00' && LA46_0 <= '\u1E9B')||(LA46_0 >= '\u1EA0' && LA46_0 <= '\u1EF9')||(LA46_0 >= '\u1F00' && LA46_0 <= '\u1F15')||(LA46_0 >= '\u1F18' && LA46_0 <= '\u1F1D')||(LA46_0 >= '\u1F20' && LA46_0 <= '\u1F45')||(LA46_0 >= '\u1F48' && LA46_0 <= '\u1F4D')||(LA46_0 >= '\u1F50' && LA46_0 <= '\u1F57')||LA46_0=='\u1F59'||LA46_0=='\u1F5B'||LA46_0=='\u1F5D'||(LA46_0 >= '\u1F5F' && LA46_0 <= '\u1F7D')||(LA46_0 >= '\u1F80' && LA46_0 <= '\u1FB4')||(LA46_0 >= '\u1FB6' && LA46_0 <= '\u1FBC')||LA46_0=='\u1FBE'||(LA46_0 >= '\u1FC2' && LA46_0 <= '\u1FC4')||(LA46_0 >= '\u1FC6' && LA46_0 <= '\u1FCC')||(LA46_0 >= '\u1FD0' && LA46_0 <= '\u1FD3')||(LA46_0 >= '\u1FD6' && LA46_0 <= '\u1FDB')||(LA46_0 >= '\u1FE0' && LA46_0 <= '\u1FEC')||(LA46_0 >= '\u1FF2' && LA46_0 <= '\u1FF4')||(LA46_0 >= '\u1FF6' && LA46_0 <= '\u1FFC')||LA46_0=='\u2071'||LA46_0=='\u207F'||(LA46_0 >= '\u2090' && LA46_0 <= '\u2094')||LA46_0=='\u2102'||LA46_0=='\u2107'||(LA46_0 >= '\u210A' && LA46_0 <= '\u2113')||LA46_0=='\u2115'||(LA46_0 >= '\u2118' && LA46_0 <= '\u211D')||LA46_0=='\u2124'||LA46_0=='\u2126'||LA46_0=='\u2128'||(LA46_0 >= '\u212A' && LA46_0 <= '\u2131')||(LA46_0 >= '\u2133' && LA46_0 <= '\u2139')||(LA46_0 >= '\u213C' && LA46_0 <= '\u213F')||(LA46_0 >= '\u2145' && LA46_0 <= '\u2149')||(LA46_0 >= '\u2160' && LA46_0 <= '\u2183')||(LA46_0 >= '\u2C00' && LA46_0 <= '\u2C2E')||(LA46_0 >= '\u2C30' && LA46_0 <= '\u2C5E')||(LA46_0 >= '\u2C80' && LA46_0 <= '\u2CE4')||(LA46_0 >= '\u2D00' && LA46_0 <= '\u2D25')||(LA46_0 >= '\u2D30' && LA46_0 <= '\u2D65')||LA46_0=='\u2D6F'||(LA46_0 >= '\u2D80' && LA46_0 <= '\u2D96')||(LA46_0 >= '\u2DA0' && LA46_0 <= '\u2DA6')||(LA46_0 >= '\u2DA8' && LA46_0 <= '\u2DAE')||(LA46_0 >= '\u2DB0' && LA46_0 <= '\u2DB6')||(LA46_0 >= '\u2DB8' && LA46_0 <= '\u2DBE')||(LA46_0 >= '\u2DC0' && LA46_0 <= '\u2DC6')||(LA46_0 >= '\u2DC8' && LA46_0 <= '\u2DCE')||(LA46_0 >= '\u2DD0' && LA46_0 <= '\u2DD6')||(LA46_0 >= '\u2DD8' && LA46_0 <= '\u2DDE')||(LA46_0 >= '\u3005' && LA46_0 <= '\u3007')||(LA46_0 >= '\u3021' && LA46_0 <= '\u3029')||(LA46_0 >= '\u3031' && LA46_0 <= '\u3035')||(LA46_0 >= '\u3038' && LA46_0 <= '\u303C')||(LA46_0 >= '\u3041' && LA46_0 <= '\u3096')||(LA46_0 >= '\u309B' && LA46_0 <= '\u309F')||(LA46_0 >= '\u30A1' && LA46_0 <= '\u30FA')||(LA46_0 >= '\u30FC' && LA46_0 <= '\u30FF')||(LA46_0 >= '\u3105' && LA46_0 <= '\u312C')||(LA46_0 >= '\u3131' && LA46_0 <= '\u318E')||(LA46_0 >= '\u31A0' && LA46_0 <= '\u31B7')||(LA46_0 >= '\u31F0' && LA46_0 <= '\u31FF')||(LA46_0 >= '\u3400' && LA46_0 <= '\u4DB5')||(LA46_0 >= '\u4E00' && LA46_0 <= '\u9FBB')||(LA46_0 >= '\uA000' && LA46_0 <= '\uA48C')||(LA46_0 >= '\uA800' && LA46_0 <= '\uA801')||(LA46_0 >= '\uA803' && LA46_0 <= '\uA805')||(LA46_0 >= '\uA807' && LA46_0 <= '\uA80A')||(LA46_0 >= '\uA80C' && LA46_0 <= '\uA822')||(LA46_0 >= '\uAC00' && LA46_0 <= '\uD7A3')||(LA46_0 >= '\uF900' && LA46_0 <= '\uFA2D')||(LA46_0 >= '\uFA30' && LA46_0 <= '\uFA6A')||(LA46_0 >= '\uFA70' && LA46_0 <= '\uFAD9')||(LA46_0 >= '\uFB00' && LA46_0 <= '\uFB06')||(LA46_0 >= '\uFB13' && LA46_0 <= '\uFB17')||LA46_0=='\uFB1D'||(LA46_0 >= '\uFB1F' && LA46_0 <= '\uFB28')||(LA46_0 >= '\uFB2A' && LA46_0 <= '\uFB36')||(LA46_0 >= '\uFB38' && LA46_0 <= '\uFB3C')||LA46_0=='\uFB3E'||(LA46_0 >= '\uFB40' && LA46_0 <= '\uFB41')||(LA46_0 >= '\uFB43' && LA46_0 <= '\uFB44')||(LA46_0 >= '\uFB46' && LA46_0 <= '\uFBB1')||(LA46_0 >= '\uFBD3' && LA46_0 <= '\uFD3D')||(LA46_0 >= '\uFD50' && LA46_0 <= '\uFD8F')||(LA46_0 >= '\uFD92' && LA46_0 <= '\uFDC7')||(LA46_0 >= '\uFDF0' && LA46_0 <= '\uFDFB')||(LA46_0 >= '\uFE70' && LA46_0 <= '\uFE74')||(LA46_0 >= '\uFE76' && LA46_0 <= '\uFEFC')||(LA46_0 >= '\uFF21' && LA46_0 <= '\uFF3A')||(LA46_0 >= '\uFF41' && LA46_0 <= '\uFF5A')||(LA46_0 >= '\uFF66' && LA46_0 <= '\uFFBE')||(LA46_0 >= '\uFFC2' && LA46_0 <= '\uFFC7')||(LA46_0 >= '\uFFCA' && LA46_0 <= '\uFFCF')||(LA46_0 >= '\uFFD2' && LA46_0 <= '\uFFD7')||(LA46_0 >= '\uFFDA' && LA46_0 <= '\uFFDC')) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // cc/iqa/iQALexer.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00AA'||input.LA(1)=='\u00B5'||input.LA(1)=='\u00BA'||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u0241')||(input.LA(1) >= '\u0250' && input.LA(1) <= '\u02C1')||(input.LA(1) >= '\u02C6' && input.LA(1) <= '\u02D1')||(input.LA(1) >= '\u02E0' && input.LA(1) <= '\u02E4')||input.LA(1)=='\u02EE'||input.LA(1)=='\u037A'||input.LA(1)=='\u0386'||(input.LA(1) >= '\u0388' && input.LA(1) <= '\u038A')||input.LA(1)=='\u038C'||(input.LA(1) >= '\u038E' && input.LA(1) <= '\u03A1')||(input.LA(1) >= '\u03A3' && input.LA(1) <= '\u03CE')||(input.LA(1) >= '\u03D0' && input.LA(1) <= '\u03F5')||(input.LA(1) >= '\u03F7' && input.LA(1) <= '\u0481')||(input.LA(1) >= '\u048A' && input.LA(1) <= '\u04CE')||(input.LA(1) >= '\u04D0' && input.LA(1) <= '\u04F9')||(input.LA(1) >= '\u0500' && input.LA(1) <= '\u050F')||(input.LA(1) >= '\u0531' && input.LA(1) <= '\u0556')||input.LA(1)=='\u0559'||(input.LA(1) >= '\u0561' && input.LA(1) <= '\u0587')||(input.LA(1) >= '\u05D0' && input.LA(1) <= '\u05EA')||(input.LA(1) >= '\u05F0' && input.LA(1) <= '\u05F2')||(input.LA(1) >= '\u0621' && input.LA(1) <= '\u063A')||(input.LA(1) >= '\u0640' && input.LA(1) <= '\u064A')||(input.LA(1) >= '\u066E' && input.LA(1) <= '\u066F')||(input.LA(1) >= '\u0671' && input.LA(1) <= '\u06D3')||input.LA(1)=='\u06D5'||(input.LA(1) >= '\u06E5' && input.LA(1) <= '\u06E6')||(input.LA(1) >= '\u06EE' && input.LA(1) <= '\u06EF')||(input.LA(1) >= '\u06FA' && input.LA(1) <= '\u06FC')||input.LA(1)=='\u06FF'||input.LA(1)=='\u0710'||(input.LA(1) >= '\u0712' && input.LA(1) <= '\u072F')||(input.LA(1) >= '\u074D' && input.LA(1) <= '\u076D')||(input.LA(1) >= '\u0780' && input.LA(1) <= '\u07A5')||input.LA(1)=='\u07B1'||(input.LA(1) >= '\u0904' && input.LA(1) <= '\u0939')||input.LA(1)=='\u093D'||input.LA(1)=='\u0950'||(input.LA(1) >= '\u0958' && input.LA(1) <= '\u0961')||input.LA(1)=='\u097D'||(input.LA(1) >= '\u0985' && input.LA(1) <= '\u098C')||(input.LA(1) >= '\u098F' && input.LA(1) <= '\u0990')||(input.LA(1) >= '\u0993' && input.LA(1) <= '\u09A8')||(input.LA(1) >= '\u09AA' && input.LA(1) <= '\u09B0')||input.LA(1)=='\u09B2'||(input.LA(1) >= '\u09B6' && input.LA(1) <= '\u09B9')||input.LA(1)=='\u09BD'||input.LA(1)=='\u09CE'||(input.LA(1) >= '\u09DC' && input.LA(1) <= '\u09DD')||(input.LA(1) >= '\u09DF' && input.LA(1) <= '\u09E1')||(input.LA(1) >= '\u09F0' && input.LA(1) <= '\u09F1')||(input.LA(1) >= '\u0A05' && input.LA(1) <= '\u0A0A')||(input.LA(1) >= '\u0A0F' && input.LA(1) <= '\u0A10')||(input.LA(1) >= '\u0A13' && input.LA(1) <= '\u0A28')||(input.LA(1) >= '\u0A2A' && input.LA(1) <= '\u0A30')||(input.LA(1) >= '\u0A32' && input.LA(1) <= '\u0A33')||(input.LA(1) >= '\u0A35' && input.LA(1) <= '\u0A36')||(input.LA(1) >= '\u0A38' && input.LA(1) <= '\u0A39')||(input.LA(1) >= '\u0A59' && input.LA(1) <= '\u0A5C')||input.LA(1)=='\u0A5E'||(input.LA(1) >= '\u0A72' && input.LA(1) <= '\u0A74')||(input.LA(1) >= '\u0A85' && input.LA(1) <= '\u0A8D')||(input.LA(1) >= '\u0A8F' && input.LA(1) <= '\u0A91')||(input.LA(1) >= '\u0A93' && input.LA(1) <= '\u0AA8')||(input.LA(1) >= '\u0AAA' && input.LA(1) <= '\u0AB0')||(input.LA(1) >= '\u0AB2' && input.LA(1) <= '\u0AB3')||(input.LA(1) >= '\u0AB5' && input.LA(1) <= '\u0AB9')||input.LA(1)=='\u0ABD'||input.LA(1)=='\u0AD0'||(input.LA(1) >= '\u0AE0' && input.LA(1) <= '\u0AE1')||(input.LA(1) >= '\u0B05' && input.LA(1) <= '\u0B0C')||(input.LA(1) >= '\u0B0F' && input.LA(1) <= '\u0B10')||(input.LA(1) >= '\u0B13' && input.LA(1) <= '\u0B28')||(input.LA(1) >= '\u0B2A' && input.LA(1) <= '\u0B30')||(input.LA(1) >= '\u0B32' && input.LA(1) <= '\u0B33')||(input.LA(1) >= '\u0B35' && input.LA(1) <= '\u0B39')||input.LA(1)=='\u0B3D'||(input.LA(1) >= '\u0B5C' && input.LA(1) <= '\u0B5D')||(input.LA(1) >= '\u0B5F' && input.LA(1) <= '\u0B61')||input.LA(1)=='\u0B71'||input.LA(1)=='\u0B83'||(input.LA(1) >= '\u0B85' && input.LA(1) <= '\u0B8A')||(input.LA(1) >= '\u0B8E' && input.LA(1) <= '\u0B90')||(input.LA(1) >= '\u0B92' && input.LA(1) <= '\u0B95')||(input.LA(1) >= '\u0B99' && input.LA(1) <= '\u0B9A')||input.LA(1)=='\u0B9C'||(input.LA(1) >= '\u0B9E' && input.LA(1) <= '\u0B9F')||(input.LA(1) >= '\u0BA3' && input.LA(1) <= '\u0BA4')||(input.LA(1) >= '\u0BA8' && input.LA(1) <= '\u0BAA')||(input.LA(1) >= '\u0BAE' && input.LA(1) <= '\u0BB9')||(input.LA(1) >= '\u0C05' && input.LA(1) <= '\u0C0C')||(input.LA(1) >= '\u0C0E' && input.LA(1) <= '\u0C10')||(input.LA(1) >= '\u0C12' && input.LA(1) <= '\u0C28')||(input.LA(1) >= '\u0C2A' && input.LA(1) <= '\u0C33')||(input.LA(1) >= '\u0C35' && input.LA(1) <= '\u0C39')||(input.LA(1) >= '\u0C60' && input.LA(1) <= '\u0C61')||(input.LA(1) >= '\u0C85' && input.LA(1) <= '\u0C8C')||(input.LA(1) >= '\u0C8E' && input.LA(1) <= '\u0C90')||(input.LA(1) >= '\u0C92' && input.LA(1) <= '\u0CA8')||(input.LA(1) >= '\u0CAA' && input.LA(1) <= '\u0CB3')||(input.LA(1) >= '\u0CB5' && input.LA(1) <= '\u0CB9')||input.LA(1)=='\u0CBD'||input.LA(1)=='\u0CDE'||(input.LA(1) >= '\u0CE0' && input.LA(1) <= '\u0CE1')||(input.LA(1) >= '\u0D05' && input.LA(1) <= '\u0D0C')||(input.LA(1) >= '\u0D0E' && input.LA(1) <= '\u0D10')||(input.LA(1) >= '\u0D12' && input.LA(1) <= '\u0D28')||(input.LA(1) >= '\u0D2A' && input.LA(1) <= '\u0D39')||(input.LA(1) >= '\u0D60' && input.LA(1) <= '\u0D61')||(input.LA(1) >= '\u0D85' && input.LA(1) <= '\u0D96')||(input.LA(1) >= '\u0D9A' && input.LA(1) <= '\u0DB1')||(input.LA(1) >= '\u0DB3' && input.LA(1) <= '\u0DBB')||input.LA(1)=='\u0DBD'||(input.LA(1) >= '\u0DC0' && input.LA(1) <= '\u0DC6')||(input.LA(1) >= '\u0E01' && input.LA(1) <= '\u0E30')||(input.LA(1) >= '\u0E32' && input.LA(1) <= '\u0E33')||(input.LA(1) >= '\u0E40' && input.LA(1) <= '\u0E46')||(input.LA(1) >= '\u0E81' && input.LA(1) <= '\u0E82')||input.LA(1)=='\u0E84'||(input.LA(1) >= '\u0E87' && input.LA(1) <= '\u0E88')||input.LA(1)=='\u0E8A'||input.LA(1)=='\u0E8D'||(input.LA(1) >= '\u0E94' && input.LA(1) <= '\u0E97')||(input.LA(1) >= '\u0E99' && input.LA(1) <= '\u0E9F')||(input.LA(1) >= '\u0EA1' && input.LA(1) <= '\u0EA3')||input.LA(1)=='\u0EA5'||input.LA(1)=='\u0EA7'||(input.LA(1) >= '\u0EAA' && input.LA(1) <= '\u0EAB')||(input.LA(1) >= '\u0EAD' && input.LA(1) <= '\u0EB0')||(input.LA(1) >= '\u0EB2' && input.LA(1) <= '\u0EB3')||input.LA(1)=='\u0EBD'||(input.LA(1) >= '\u0EC0' && input.LA(1) <= '\u0EC4')||input.LA(1)=='\u0EC6'||(input.LA(1) >= '\u0EDC' && input.LA(1) <= '\u0EDD')||input.LA(1)=='\u0F00'||(input.LA(1) >= '\u0F40' && input.LA(1) <= '\u0F47')||(input.LA(1) >= '\u0F49' && input.LA(1) <= '\u0F6A')||(input.LA(1) >= '\u0F88' && input.LA(1) <= '\u0F8B')||(input.LA(1) >= '\u1000' && input.LA(1) <= '\u1021')||(input.LA(1) >= '\u1023' && input.LA(1) <= '\u1027')||(input.LA(1) >= '\u1029' && input.LA(1) <= '\u102A')||(input.LA(1) >= '\u1050' && input.LA(1) <= '\u1055')||(input.LA(1) >= '\u10A0' && input.LA(1) <= '\u10C5')||(input.LA(1) >= '\u10D0' && input.LA(1) <= '\u10FA')||input.LA(1)=='\u10FC'||(input.LA(1) >= '\u1100' && input.LA(1) <= '\u1159')||(input.LA(1) >= '\u115F' && input.LA(1) <= '\u11A2')||(input.LA(1) >= '\u11A8' && input.LA(1) <= '\u11F9')||(input.LA(1) >= '\u1200' && input.LA(1) <= '\u1248')||(input.LA(1) >= '\u124A' && input.LA(1) <= '\u124D')||(input.LA(1) >= '\u1250' && input.LA(1) <= '\u1256')||input.LA(1)=='\u1258'||(input.LA(1) >= '\u125A' && input.LA(1) <= '\u125D')||(input.LA(1) >= '\u1260' && input.LA(1) <= '\u1288')||(input.LA(1) >= '\u128A' && input.LA(1) <= '\u128D')||(input.LA(1) >= '\u1290' && input.LA(1) <= '\u12B0')||(input.LA(1) >= '\u12B2' && input.LA(1) <= '\u12B5')||(input.LA(1) >= '\u12B8' && input.LA(1) <= '\u12BE')||input.LA(1)=='\u12C0'||(input.LA(1) >= '\u12C2' && input.LA(1) <= '\u12C5')||(input.LA(1) >= '\u12C8' && input.LA(1) <= '\u12D6')||(input.LA(1) >= '\u12D8' && input.LA(1) <= '\u1310')||(input.LA(1) >= '\u1312' && input.LA(1) <= '\u1315')||(input.LA(1) >= '\u1318' && input.LA(1) <= '\u135A')||(input.LA(1) >= '\u1380' && input.LA(1) <= '\u138F')||(input.LA(1) >= '\u13A0' && input.LA(1) <= '\u13F4')||(input.LA(1) >= '\u1401' && input.LA(1) <= '\u166C')||(input.LA(1) >= '\u166F' && input.LA(1) <= '\u1676')||(input.LA(1) >= '\u1681' && input.LA(1) <= '\u169A')||(input.LA(1) >= '\u16A0' && input.LA(1) <= '\u16EA')||(input.LA(1) >= '\u16EE' && input.LA(1) <= '\u16F0')||(input.LA(1) >= '\u1700' && input.LA(1) <= '\u170C')||(input.LA(1) >= '\u170E' && input.LA(1) <= '\u1711')||(input.LA(1) >= '\u1720' && input.LA(1) <= '\u1731')||(input.LA(1) >= '\u1740' && input.LA(1) <= '\u1751')||(input.LA(1) >= '\u1760' && input.LA(1) <= '\u176C')||(input.LA(1) >= '\u176E' && input.LA(1) <= '\u1770')||(input.LA(1) >= '\u1780' && input.LA(1) <= '\u17B3')||input.LA(1)=='\u17D7'||input.LA(1)=='\u17DC'||(input.LA(1) >= '\u1820' && input.LA(1) <= '\u1877')||(input.LA(1) >= '\u1880' && input.LA(1) <= '\u18A8')||(input.LA(1) >= '\u1900' && input.LA(1) <= '\u191C')||(input.LA(1) >= '\u1950' && input.LA(1) <= '\u196D')||(input.LA(1) >= '\u1970' && input.LA(1) <= '\u1974')||(input.LA(1) >= '\u1980' && input.LA(1) <= '\u19A9')||(input.LA(1) >= '\u19C1' && input.LA(1) <= '\u19C7')||(input.LA(1) >= '\u1A00' && input.LA(1) <= '\u1A16')||(input.LA(1) >= '\u1D00' && input.LA(1) <= '\u1DBF')||(input.LA(1) >= '\u1E00' && input.LA(1) <= '\u1E9B')||(input.LA(1) >= '\u1EA0' && input.LA(1) <= '\u1EF9')||(input.LA(1) >= '\u1F00' && input.LA(1) <= '\u1F15')||(input.LA(1) >= '\u1F18' && input.LA(1) <= '\u1F1D')||(input.LA(1) >= '\u1F20' && input.LA(1) <= '\u1F45')||(input.LA(1) >= '\u1F48' && input.LA(1) <= '\u1F4D')||(input.LA(1) >= '\u1F50' && input.LA(1) <= '\u1F57')||input.LA(1)=='\u1F59'||input.LA(1)=='\u1F5B'||input.LA(1)=='\u1F5D'||(input.LA(1) >= '\u1F5F' && input.LA(1) <= '\u1F7D')||(input.LA(1) >= '\u1F80' && input.LA(1) <= '\u1FB4')||(input.LA(1) >= '\u1FB6' && input.LA(1) <= '\u1FBC')||input.LA(1)=='\u1FBE'||(input.LA(1) >= '\u1FC2' && input.LA(1) <= '\u1FC4')||(input.LA(1) >= '\u1FC6' && input.LA(1) <= '\u1FCC')||(input.LA(1) >= '\u1FD0' && input.LA(1) <= '\u1FD3')||(input.LA(1) >= '\u1FD6' && input.LA(1) <= '\u1FDB')||(input.LA(1) >= '\u1FE0' && input.LA(1) <= '\u1FEC')||(input.LA(1) >= '\u1FF2' && input.LA(1) <= '\u1FF4')||(input.LA(1) >= '\u1FF6' && input.LA(1) <= '\u1FFC')||input.LA(1)=='\u2071'||input.LA(1)=='\u207F'||(input.LA(1) >= '\u2090' && input.LA(1) <= '\u2094')||input.LA(1)=='\u2102'||input.LA(1)=='\u2107'||(input.LA(1) >= '\u210A' && input.LA(1) <= '\u2113')||input.LA(1)=='\u2115'||(input.LA(1) >= '\u2118' && input.LA(1) <= '\u211D')||input.LA(1)=='\u2124'||input.LA(1)=='\u2126'||input.LA(1)=='\u2128'||(input.LA(1) >= '\u212A' && input.LA(1) <= '\u2131')||(input.LA(1) >= '\u2133' && input.LA(1) <= '\u2139')||(input.LA(1) >= '\u213C' && input.LA(1) <= '\u213F')||(input.LA(1) >= '\u2145' && input.LA(1) <= '\u2149')||(input.LA(1) >= '\u2160' && input.LA(1) <= '\u2183')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2C2E')||(input.LA(1) >= '\u2C30' && input.LA(1) <= '\u2C5E')||(input.LA(1) >= '\u2C80' && input.LA(1) <= '\u2CE4')||(input.LA(1) >= '\u2D00' && input.LA(1) <= '\u2D25')||(input.LA(1) >= '\u2D30' && input.LA(1) <= '\u2D65')||input.LA(1)=='\u2D6F'||(input.LA(1) >= '\u2D80' && input.LA(1) <= '\u2D96')||(input.LA(1) >= '\u2DA0' && input.LA(1) <= '\u2DA6')||(input.LA(1) >= '\u2DA8' && input.LA(1) <= '\u2DAE')||(input.LA(1) >= '\u2DB0' && input.LA(1) <= '\u2DB6')||(input.LA(1) >= '\u2DB8' && input.LA(1) <= '\u2DBE')||(input.LA(1) >= '\u2DC0' && input.LA(1) <= '\u2DC6')||(input.LA(1) >= '\u2DC8' && input.LA(1) <= '\u2DCE')||(input.LA(1) >= '\u2DD0' && input.LA(1) <= '\u2DD6')||(input.LA(1) >= '\u2DD8' && input.LA(1) <= '\u2DDE')||(input.LA(1) >= '\u3005' && input.LA(1) <= '\u3007')||(input.LA(1) >= '\u3021' && input.LA(1) <= '\u3029')||(input.LA(1) >= '\u3031' && input.LA(1) <= '\u3035')||(input.LA(1) >= '\u3038' && input.LA(1) <= '\u303C')||(input.LA(1) >= '\u3041' && input.LA(1) <= '\u3096')||(input.LA(1) >= '\u309B' && input.LA(1) <= '\u309F')||(input.LA(1) >= '\u30A1' && input.LA(1) <= '\u30FA')||(input.LA(1) >= '\u30FC' && input.LA(1) <= '\u30FF')||(input.LA(1) >= '\u3105' && input.LA(1) <= '\u312C')||(input.LA(1) >= '\u3131' && input.LA(1) <= '\u318E')||(input.LA(1) >= '\u31A0' && input.LA(1) <= '\u31B7')||(input.LA(1) >= '\u31F0' && input.LA(1) <= '\u31FF')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u4DB5')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FBB')||(input.LA(1) >= '\uA000' && input.LA(1) <= '\uA48C')||(input.LA(1) >= '\uA800' && input.LA(1) <= '\uA801')||(input.LA(1) >= '\uA803' && input.LA(1) <= '\uA805')||(input.LA(1) >= '\uA807' && input.LA(1) <= '\uA80A')||(input.LA(1) >= '\uA80C' && input.LA(1) <= '\uA822')||(input.LA(1) >= '\uAC00' && input.LA(1) <= '\uD7A3')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFA2D')||(input.LA(1) >= '\uFA30' && input.LA(1) <= '\uFA6A')||(input.LA(1) >= '\uFA70' && input.LA(1) <= '\uFAD9')||(input.LA(1) >= '\uFB00' && input.LA(1) <= '\uFB06')||(input.LA(1) >= '\uFB13' && input.LA(1) <= '\uFB17')||input.LA(1)=='\uFB1D'||(input.LA(1) >= '\uFB1F' && input.LA(1) <= '\uFB28')||(input.LA(1) >= '\uFB2A' && input.LA(1) <= '\uFB36')||(input.LA(1) >= '\uFB38' && input.LA(1) <= '\uFB3C')||input.LA(1)=='\uFB3E'||(input.LA(1) >= '\uFB40' && input.LA(1) <= '\uFB41')||(input.LA(1) >= '\uFB43' && input.LA(1) <= '\uFB44')||(input.LA(1) >= '\uFB46' && input.LA(1) <= '\uFBB1')||(input.LA(1) >= '\uFBD3' && input.LA(1) <= '\uFD3D')||(input.LA(1) >= '\uFD50' && input.LA(1) <= '\uFD8F')||(input.LA(1) >= '\uFD92' && input.LA(1) <= '\uFDC7')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFDFB')||(input.LA(1) >= '\uFE70' && input.LA(1) <= '\uFE74')||(input.LA(1) >= '\uFE76' && input.LA(1) <= '\uFEFC')||(input.LA(1) >= '\uFF21' && input.LA(1) <= '\uFF3A')||(input.LA(1) >= '\uFF41' && input.LA(1) <= '\uFF5A')||(input.LA(1) >= '\uFF66' && input.LA(1) <= '\uFFBE')||(input.LA(1) >= '\uFFC2' && input.LA(1) <= '\uFFC7')||(input.LA(1) >= '\uFFCA' && input.LA(1) <= '\uFFCF')||(input.LA(1) >= '\uFFD2' && input.LA(1) <= '\uFFD7')||(input.LA(1) >= '\uFFDA' && input.LA(1) <= '\uFFDC') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "ID_START"
    public final void mID_START() throws RecognitionException {
        try {
            // cc/iqa/iQALexer.g:283:3: ( '_' | 'A' .. 'Z' | 'a' .. 'z' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u01BA' | '\\u01BB' | '\\u01BC' .. '\\u01BF' | '\\u01C0' .. '\\u01C3' | '\\u01C4' .. '\\u0241' | '\\u0250' .. '\\u02AF' | '\\u02B0' .. '\\u02C1' | '\\u02C6' .. '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03F5' | '\\u03F7' .. '\\u0481' | '\\u048A' .. '\\u04CE' | '\\u04D0' .. '\\u04F9' | '\\u0500' .. '\\u050F' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0587' | '\\u05D0' .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0640' | '\\u0641' .. '\\u064A' | '\\u066E' .. '\\u066F' | '\\u0671' .. '\\u06D3' | '\\u06D5' | '\\u06E5' .. '\\u06E6' | '\\u06EE' .. '\\u06EF' | '\\u06FA' .. '\\u06FC' | '\\u06FF' | '\\u0710' | '\\u0712' .. '\\u072F' | '\\u074D' .. '\\u076D' | '\\u0780' .. '\\u07A5' | '\\u07B1' | '\\u0904' .. '\\u0939' | '\\u093D' | '\\u0950' | '\\u0958' .. '\\u0961' | '\\u097D' | '\\u0985' .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6' .. '\\u09B9' | '\\u09BD' | '\\u09CE' | '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' .. '\\u09F1' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' | '\\u0A85' .. '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' .. '\\u0AE1' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13' .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B35' .. '\\u0B39' | '\\u0B3D' | '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B71' | '\\u0B83' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB9' | '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' | '\\u0C60' .. '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CBD' | '\\u0CDE' | '\\u0CE0' .. '\\u0CE1' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' | '\\u0D2A' .. '\\u0D39' | '\\u0D60' .. '\\u0D61' | '\\u0D85' .. '\\u0D96' | '\\u0D9A' .. '\\u0DB1' | '\\u0DB3' .. '\\u0DBB' | '\\u0DBD' | '\\u0DC0' .. '\\u0DC6' | '\\u0E01' .. '\\u0E30' | '\\u0E32' .. '\\u0E33' | '\\u0E40' .. '\\u0E45' | '\\u0E46' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EB0' | '\\u0EB2' .. '\\u0EB3' | '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0EC6' | '\\u0EDC' .. '\\u0EDD' | '\\u0F00' | '\\u0F40' .. '\\u0F47' | '\\u0F49' .. '\\u0F6A' | '\\u0F88' .. '\\u0F8B' | '\\u1000' .. '\\u1021' | '\\u1023' .. '\\u1027' | '\\u1029' .. '\\u102A' | '\\u1050' .. '\\u1055' | '\\u10A0' .. '\\u10C5' | '\\u10D0' .. '\\u10FA' | '\\u10FC' | '\\u1100' .. '\\u1159' | '\\u115F' .. '\\u11A2' | '\\u11A8' .. '\\u11F9' | '\\u1200' .. '\\u1248' | '\\u124A' .. '\\u124D' | '\\u1250' .. '\\u1256' | '\\u1258' | '\\u125A' .. '\\u125D' | '\\u1260' .. '\\u1288' | '\\u128A' .. '\\u128D' | '\\u1290' .. '\\u12B0' | '\\u12B2' .. '\\u12B5' | '\\u12B8' .. '\\u12BE' | '\\u12C0' | '\\u12C2' .. '\\u12C5' | '\\u12C8' .. '\\u12D6' | '\\u12D8' .. '\\u1310' | '\\u1312' .. '\\u1315' | '\\u1318' .. '\\u135A' | '\\u1380' .. '\\u138F' | '\\u13A0' .. '\\u13F4' | '\\u1401' .. '\\u166C' | '\\u166F' .. '\\u1676' | '\\u1681' .. '\\u169A' | '\\u16A0' .. '\\u16EA' | '\\u16EE' .. '\\u16F0' | '\\u1700' .. '\\u170C' | '\\u170E' .. '\\u1711' | '\\u1720' .. '\\u1731' | '\\u1740' .. '\\u1751' | '\\u1760' .. '\\u176C' | '\\u176E' .. '\\u1770' | '\\u1780' .. '\\u17B3' | '\\u17D7' | '\\u17DC' | '\\u1820' .. '\\u1842' | '\\u1843' | '\\u1844' .. '\\u1877' | '\\u1880' .. '\\u18A8' | '\\u1900' .. '\\u191C' | '\\u1950' .. '\\u196D' | '\\u1970' .. '\\u1974' | '\\u1980' .. '\\u19A9' | '\\u19C1' .. '\\u19C7' | '\\u1A00' .. '\\u1A16' | '\\u1D00' .. '\\u1D2B' | '\\u1D2C' .. '\\u1D61' | '\\u1D62' .. '\\u1D77' | '\\u1D78' | '\\u1D79' .. '\\u1D9A' | '\\u1D9B' .. '\\u1DBF' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' .. '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u2071' | '\\u207F' | '\\u2090' .. '\\u2094' | '\\u2102' | '\\u2107' | '\\u210A' .. '\\u2113' | '\\u2115' | '\\u2118' | '\\u2119' .. '\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A' .. '\\u212D' | '\\u212E' | '\\u212F' .. '\\u2131' | '\\u2133' .. '\\u2134' | '\\u2135' .. '\\u2138' | '\\u2139' | '\\u213C' .. '\\u213F' | '\\u2145' .. '\\u2149' | '\\u2160' .. '\\u2183' | '\\u2C00' .. '\\u2C2E' | '\\u2C30' .. '\\u2C5E' | '\\u2C80' .. '\\u2CE4' | '\\u2D00' .. '\\u2D25' | '\\u2D30' .. '\\u2D65' | '\\u2D6F' | '\\u2D80' .. '\\u2D96' | '\\u2DA0' .. '\\u2DA6' | '\\u2DA8' .. '\\u2DAE' | '\\u2DB0' .. '\\u2DB6' | '\\u2DB8' .. '\\u2DBE' | '\\u2DC0' .. '\\u2DC6' | '\\u2DC8' .. '\\u2DCE' | '\\u2DD0' .. '\\u2DD6' | '\\u2DD8' .. '\\u2DDE' | '\\u3005' | '\\u3006' | '\\u3007' | '\\u3021' .. '\\u3029' | '\\u3031' .. '\\u3035' | '\\u3038' .. '\\u303A' | '\\u303B' | '\\u303C' | '\\u3041' .. '\\u3096' | '\\u309B' .. '\\u309C' | '\\u309D' .. '\\u309E' | '\\u309F' | '\\u30A1' .. '\\u30FA' | '\\u30FC' .. '\\u30FE' | '\\u30FF' | '\\u3105' .. '\\u312C' | '\\u3131' .. '\\u318E' | '\\u31A0' .. '\\u31B7' | '\\u31F0' .. '\\u31FF' | '\\u3400' .. '\\u4DB5' | '\\u4E00' .. '\\u9FBB' | '\\uA000' .. '\\uA014' | '\\uA015' | '\\uA016' .. '\\uA48C' | '\\uA800' .. '\\uA801' | '\\uA803' .. '\\uA805' | '\\uA807' .. '\\uA80A' | '\\uA80C' .. '\\uA822' | '\\uAC00' .. '\\uD7A3' | '\\uF900' .. '\\uFA2D' | '\\uFA30' .. '\\uFA6A' | '\\uFA70' .. '\\uFAD9' | '\\uFB00' .. '\\uFB06' | '\\uFB13' .. '\\uFB17' | '\\uFB1D' | '\\uFB1F' .. '\\uFB28' | '\\uFB2A' .. '\\uFB36' | '\\uFB38' .. '\\uFB3C' | '\\uFB3E' | '\\uFB40' .. '\\uFB41' | '\\uFB43' .. '\\uFB44' | '\\uFB46' .. '\\uFBB1' | '\\uFBD3' .. '\\uFD3D' | '\\uFD50' .. '\\uFD8F' | '\\uFD92' .. '\\uFDC7' | '\\uFDF0' .. '\\uFDFB' | '\\uFE70' .. '\\uFE74' | '\\uFE76' .. '\\uFEFC' | '\\uFF21' .. '\\uFF3A' | '\\uFF41' .. '\\uFF5A' | '\\uFF66' .. '\\uFF6F' | '\\uFF70' | '\\uFF71' .. '\\uFF9D' | '\\uFF9E' .. '\\uFF9F' | '\\uFFA0' .. '\\uFFBE' | '\\uFFC2' .. '\\uFFC7' | '\\uFFCA' .. '\\uFFCF' | '\\uFFD2' .. '\\uFFD7' | '\\uFFDA' .. '\\uFFDC' )
            // cc/iqa/iQALexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00AA'||input.LA(1)=='\u00B5'||input.LA(1)=='\u00BA'||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u0241')||(input.LA(1) >= '\u0250' && input.LA(1) <= '\u02C1')||(input.LA(1) >= '\u02C6' && input.LA(1) <= '\u02D1')||(input.LA(1) >= '\u02E0' && input.LA(1) <= '\u02E4')||input.LA(1)=='\u02EE'||input.LA(1)=='\u037A'||input.LA(1)=='\u0386'||(input.LA(1) >= '\u0388' && input.LA(1) <= '\u038A')||input.LA(1)=='\u038C'||(input.LA(1) >= '\u038E' && input.LA(1) <= '\u03A1')||(input.LA(1) >= '\u03A3' && input.LA(1) <= '\u03CE')||(input.LA(1) >= '\u03D0' && input.LA(1) <= '\u03F5')||(input.LA(1) >= '\u03F7' && input.LA(1) <= '\u0481')||(input.LA(1) >= '\u048A' && input.LA(1) <= '\u04CE')||(input.LA(1) >= '\u04D0' && input.LA(1) <= '\u04F9')||(input.LA(1) >= '\u0500' && input.LA(1) <= '\u050F')||(input.LA(1) >= '\u0531' && input.LA(1) <= '\u0556')||input.LA(1)=='\u0559'||(input.LA(1) >= '\u0561' && input.LA(1) <= '\u0587')||(input.LA(1) >= '\u05D0' && input.LA(1) <= '\u05EA')||(input.LA(1) >= '\u05F0' && input.LA(1) <= '\u05F2')||(input.LA(1) >= '\u0621' && input.LA(1) <= '\u063A')||(input.LA(1) >= '\u0640' && input.LA(1) <= '\u064A')||(input.LA(1) >= '\u066E' && input.LA(1) <= '\u066F')||(input.LA(1) >= '\u0671' && input.LA(1) <= '\u06D3')||input.LA(1)=='\u06D5'||(input.LA(1) >= '\u06E5' && input.LA(1) <= '\u06E6')||(input.LA(1) >= '\u06EE' && input.LA(1) <= '\u06EF')||(input.LA(1) >= '\u06FA' && input.LA(1) <= '\u06FC')||input.LA(1)=='\u06FF'||input.LA(1)=='\u0710'||(input.LA(1) >= '\u0712' && input.LA(1) <= '\u072F')||(input.LA(1) >= '\u074D' && input.LA(1) <= '\u076D')||(input.LA(1) >= '\u0780' && input.LA(1) <= '\u07A5')||input.LA(1)=='\u07B1'||(input.LA(1) >= '\u0904' && input.LA(1) <= '\u0939')||input.LA(1)=='\u093D'||input.LA(1)=='\u0950'||(input.LA(1) >= '\u0958' && input.LA(1) <= '\u0961')||input.LA(1)=='\u097D'||(input.LA(1) >= '\u0985' && input.LA(1) <= '\u098C')||(input.LA(1) >= '\u098F' && input.LA(1) <= '\u0990')||(input.LA(1) >= '\u0993' && input.LA(1) <= '\u09A8')||(input.LA(1) >= '\u09AA' && input.LA(1) <= '\u09B0')||input.LA(1)=='\u09B2'||(input.LA(1) >= '\u09B6' && input.LA(1) <= '\u09B9')||input.LA(1)=='\u09BD'||input.LA(1)=='\u09CE'||(input.LA(1) >= '\u09DC' && input.LA(1) <= '\u09DD')||(input.LA(1) >= '\u09DF' && input.LA(1) <= '\u09E1')||(input.LA(1) >= '\u09F0' && input.LA(1) <= '\u09F1')||(input.LA(1) >= '\u0A05' && input.LA(1) <= '\u0A0A')||(input.LA(1) >= '\u0A0F' && input.LA(1) <= '\u0A10')||(input.LA(1) >= '\u0A13' && input.LA(1) <= '\u0A28')||(input.LA(1) >= '\u0A2A' && input.LA(1) <= '\u0A30')||(input.LA(1) >= '\u0A32' && input.LA(1) <= '\u0A33')||(input.LA(1) >= '\u0A35' && input.LA(1) <= '\u0A36')||(input.LA(1) >= '\u0A38' && input.LA(1) <= '\u0A39')||(input.LA(1) >= '\u0A59' && input.LA(1) <= '\u0A5C')||input.LA(1)=='\u0A5E'||(input.LA(1) >= '\u0A72' && input.LA(1) <= '\u0A74')||(input.LA(1) >= '\u0A85' && input.LA(1) <= '\u0A8D')||(input.LA(1) >= '\u0A8F' && input.LA(1) <= '\u0A91')||(input.LA(1) >= '\u0A93' && input.LA(1) <= '\u0AA8')||(input.LA(1) >= '\u0AAA' && input.LA(1) <= '\u0AB0')||(input.LA(1) >= '\u0AB2' && input.LA(1) <= '\u0AB3')||(input.LA(1) >= '\u0AB5' && input.LA(1) <= '\u0AB9')||input.LA(1)=='\u0ABD'||input.LA(1)=='\u0AD0'||(input.LA(1) >= '\u0AE0' && input.LA(1) <= '\u0AE1')||(input.LA(1) >= '\u0B05' && input.LA(1) <= '\u0B0C')||(input.LA(1) >= '\u0B0F' && input.LA(1) <= '\u0B10')||(input.LA(1) >= '\u0B13' && input.LA(1) <= '\u0B28')||(input.LA(1) >= '\u0B2A' && input.LA(1) <= '\u0B30')||(input.LA(1) >= '\u0B32' && input.LA(1) <= '\u0B33')||(input.LA(1) >= '\u0B35' && input.LA(1) <= '\u0B39')||input.LA(1)=='\u0B3D'||(input.LA(1) >= '\u0B5C' && input.LA(1) <= '\u0B5D')||(input.LA(1) >= '\u0B5F' && input.LA(1) <= '\u0B61')||input.LA(1)=='\u0B71'||input.LA(1)=='\u0B83'||(input.LA(1) >= '\u0B85' && input.LA(1) <= '\u0B8A')||(input.LA(1) >= '\u0B8E' && input.LA(1) <= '\u0B90')||(input.LA(1) >= '\u0B92' && input.LA(1) <= '\u0B95')||(input.LA(1) >= '\u0B99' && input.LA(1) <= '\u0B9A')||input.LA(1)=='\u0B9C'||(input.LA(1) >= '\u0B9E' && input.LA(1) <= '\u0B9F')||(input.LA(1) >= '\u0BA3' && input.LA(1) <= '\u0BA4')||(input.LA(1) >= '\u0BA8' && input.LA(1) <= '\u0BAA')||(input.LA(1) >= '\u0BAE' && input.LA(1) <= '\u0BB9')||(input.LA(1) >= '\u0C05' && input.LA(1) <= '\u0C0C')||(input.LA(1) >= '\u0C0E' && input.LA(1) <= '\u0C10')||(input.LA(1) >= '\u0C12' && input.LA(1) <= '\u0C28')||(input.LA(1) >= '\u0C2A' && input.LA(1) <= '\u0C33')||(input.LA(1) >= '\u0C35' && input.LA(1) <= '\u0C39')||(input.LA(1) >= '\u0C60' && input.LA(1) <= '\u0C61')||(input.LA(1) >= '\u0C85' && input.LA(1) <= '\u0C8C')||(input.LA(1) >= '\u0C8E' && input.LA(1) <= '\u0C90')||(input.LA(1) >= '\u0C92' && input.LA(1) <= '\u0CA8')||(input.LA(1) >= '\u0CAA' && input.LA(1) <= '\u0CB3')||(input.LA(1) >= '\u0CB5' && input.LA(1) <= '\u0CB9')||input.LA(1)=='\u0CBD'||input.LA(1)=='\u0CDE'||(input.LA(1) >= '\u0CE0' && input.LA(1) <= '\u0CE1')||(input.LA(1) >= '\u0D05' && input.LA(1) <= '\u0D0C')||(input.LA(1) >= '\u0D0E' && input.LA(1) <= '\u0D10')||(input.LA(1) >= '\u0D12' && input.LA(1) <= '\u0D28')||(input.LA(1) >= '\u0D2A' && input.LA(1) <= '\u0D39')||(input.LA(1) >= '\u0D60' && input.LA(1) <= '\u0D61')||(input.LA(1) >= '\u0D85' && input.LA(1) <= '\u0D96')||(input.LA(1) >= '\u0D9A' && input.LA(1) <= '\u0DB1')||(input.LA(1) >= '\u0DB3' && input.LA(1) <= '\u0DBB')||input.LA(1)=='\u0DBD'||(input.LA(1) >= '\u0DC0' && input.LA(1) <= '\u0DC6')||(input.LA(1) >= '\u0E01' && input.LA(1) <= '\u0E30')||(input.LA(1) >= '\u0E32' && input.LA(1) <= '\u0E33')||(input.LA(1) >= '\u0E40' && input.LA(1) <= '\u0E46')||(input.LA(1) >= '\u0E81' && input.LA(1) <= '\u0E82')||input.LA(1)=='\u0E84'||(input.LA(1) >= '\u0E87' && input.LA(1) <= '\u0E88')||input.LA(1)=='\u0E8A'||input.LA(1)=='\u0E8D'||(input.LA(1) >= '\u0E94' && input.LA(1) <= '\u0E97')||(input.LA(1) >= '\u0E99' && input.LA(1) <= '\u0E9F')||(input.LA(1) >= '\u0EA1' && input.LA(1) <= '\u0EA3')||input.LA(1)=='\u0EA5'||input.LA(1)=='\u0EA7'||(input.LA(1) >= '\u0EAA' && input.LA(1) <= '\u0EAB')||(input.LA(1) >= '\u0EAD' && input.LA(1) <= '\u0EB0')||(input.LA(1) >= '\u0EB2' && input.LA(1) <= '\u0EB3')||input.LA(1)=='\u0EBD'||(input.LA(1) >= '\u0EC0' && input.LA(1) <= '\u0EC4')||input.LA(1)=='\u0EC6'||(input.LA(1) >= '\u0EDC' && input.LA(1) <= '\u0EDD')||input.LA(1)=='\u0F00'||(input.LA(1) >= '\u0F40' && input.LA(1) <= '\u0F47')||(input.LA(1) >= '\u0F49' && input.LA(1) <= '\u0F6A')||(input.LA(1) >= '\u0F88' && input.LA(1) <= '\u0F8B')||(input.LA(1) >= '\u1000' && input.LA(1) <= '\u1021')||(input.LA(1) >= '\u1023' && input.LA(1) <= '\u1027')||(input.LA(1) >= '\u1029' && input.LA(1) <= '\u102A')||(input.LA(1) >= '\u1050' && input.LA(1) <= '\u1055')||(input.LA(1) >= '\u10A0' && input.LA(1) <= '\u10C5')||(input.LA(1) >= '\u10D0' && input.LA(1) <= '\u10FA')||input.LA(1)=='\u10FC'||(input.LA(1) >= '\u1100' && input.LA(1) <= '\u1159')||(input.LA(1) >= '\u115F' && input.LA(1) <= '\u11A2')||(input.LA(1) >= '\u11A8' && input.LA(1) <= '\u11F9')||(input.LA(1) >= '\u1200' && input.LA(1) <= '\u1248')||(input.LA(1) >= '\u124A' && input.LA(1) <= '\u124D')||(input.LA(1) >= '\u1250' && input.LA(1) <= '\u1256')||input.LA(1)=='\u1258'||(input.LA(1) >= '\u125A' && input.LA(1) <= '\u125D')||(input.LA(1) >= '\u1260' && input.LA(1) <= '\u1288')||(input.LA(1) >= '\u128A' && input.LA(1) <= '\u128D')||(input.LA(1) >= '\u1290' && input.LA(1) <= '\u12B0')||(input.LA(1) >= '\u12B2' && input.LA(1) <= '\u12B5')||(input.LA(1) >= '\u12B8' && input.LA(1) <= '\u12BE')||input.LA(1)=='\u12C0'||(input.LA(1) >= '\u12C2' && input.LA(1) <= '\u12C5')||(input.LA(1) >= '\u12C8' && input.LA(1) <= '\u12D6')||(input.LA(1) >= '\u12D8' && input.LA(1) <= '\u1310')||(input.LA(1) >= '\u1312' && input.LA(1) <= '\u1315')||(input.LA(1) >= '\u1318' && input.LA(1) <= '\u135A')||(input.LA(1) >= '\u1380' && input.LA(1) <= '\u138F')||(input.LA(1) >= '\u13A0' && input.LA(1) <= '\u13F4')||(input.LA(1) >= '\u1401' && input.LA(1) <= '\u166C')||(input.LA(1) >= '\u166F' && input.LA(1) <= '\u1676')||(input.LA(1) >= '\u1681' && input.LA(1) <= '\u169A')||(input.LA(1) >= '\u16A0' && input.LA(1) <= '\u16EA')||(input.LA(1) >= '\u16EE' && input.LA(1) <= '\u16F0')||(input.LA(1) >= '\u1700' && input.LA(1) <= '\u170C')||(input.LA(1) >= '\u170E' && input.LA(1) <= '\u1711')||(input.LA(1) >= '\u1720' && input.LA(1) <= '\u1731')||(input.LA(1) >= '\u1740' && input.LA(1) <= '\u1751')||(input.LA(1) >= '\u1760' && input.LA(1) <= '\u176C')||(input.LA(1) >= '\u176E' && input.LA(1) <= '\u1770')||(input.LA(1) >= '\u1780' && input.LA(1) <= '\u17B3')||input.LA(1)=='\u17D7'||input.LA(1)=='\u17DC'||(input.LA(1) >= '\u1820' && input.LA(1) <= '\u1877')||(input.LA(1) >= '\u1880' && input.LA(1) <= '\u18A8')||(input.LA(1) >= '\u1900' && input.LA(1) <= '\u191C')||(input.LA(1) >= '\u1950' && input.LA(1) <= '\u196D')||(input.LA(1) >= '\u1970' && input.LA(1) <= '\u1974')||(input.LA(1) >= '\u1980' && input.LA(1) <= '\u19A9')||(input.LA(1) >= '\u19C1' && input.LA(1) <= '\u19C7')||(input.LA(1) >= '\u1A00' && input.LA(1) <= '\u1A16')||(input.LA(1) >= '\u1D00' && input.LA(1) <= '\u1DBF')||(input.LA(1) >= '\u1E00' && input.LA(1) <= '\u1E9B')||(input.LA(1) >= '\u1EA0' && input.LA(1) <= '\u1EF9')||(input.LA(1) >= '\u1F00' && input.LA(1) <= '\u1F15')||(input.LA(1) >= '\u1F18' && input.LA(1) <= '\u1F1D')||(input.LA(1) >= '\u1F20' && input.LA(1) <= '\u1F45')||(input.LA(1) >= '\u1F48' && input.LA(1) <= '\u1F4D')||(input.LA(1) >= '\u1F50' && input.LA(1) <= '\u1F57')||input.LA(1)=='\u1F59'||input.LA(1)=='\u1F5B'||input.LA(1)=='\u1F5D'||(input.LA(1) >= '\u1F5F' && input.LA(1) <= '\u1F7D')||(input.LA(1) >= '\u1F80' && input.LA(1) <= '\u1FB4')||(input.LA(1) >= '\u1FB6' && input.LA(1) <= '\u1FBC')||input.LA(1)=='\u1FBE'||(input.LA(1) >= '\u1FC2' && input.LA(1) <= '\u1FC4')||(input.LA(1) >= '\u1FC6' && input.LA(1) <= '\u1FCC')||(input.LA(1) >= '\u1FD0' && input.LA(1) <= '\u1FD3')||(input.LA(1) >= '\u1FD6' && input.LA(1) <= '\u1FDB')||(input.LA(1) >= '\u1FE0' && input.LA(1) <= '\u1FEC')||(input.LA(1) >= '\u1FF2' && input.LA(1) <= '\u1FF4')||(input.LA(1) >= '\u1FF6' && input.LA(1) <= '\u1FFC')||input.LA(1)=='\u2071'||input.LA(1)=='\u207F'||(input.LA(1) >= '\u2090' && input.LA(1) <= '\u2094')||input.LA(1)=='\u2102'||input.LA(1)=='\u2107'||(input.LA(1) >= '\u210A' && input.LA(1) <= '\u2113')||input.LA(1)=='\u2115'||(input.LA(1) >= '\u2118' && input.LA(1) <= '\u211D')||input.LA(1)=='\u2124'||input.LA(1)=='\u2126'||input.LA(1)=='\u2128'||(input.LA(1) >= '\u212A' && input.LA(1) <= '\u2131')||(input.LA(1) >= '\u2133' && input.LA(1) <= '\u2139')||(input.LA(1) >= '\u213C' && input.LA(1) <= '\u213F')||(input.LA(1) >= '\u2145' && input.LA(1) <= '\u2149')||(input.LA(1) >= '\u2160' && input.LA(1) <= '\u2183')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2C2E')||(input.LA(1) >= '\u2C30' && input.LA(1) <= '\u2C5E')||(input.LA(1) >= '\u2C80' && input.LA(1) <= '\u2CE4')||(input.LA(1) >= '\u2D00' && input.LA(1) <= '\u2D25')||(input.LA(1) >= '\u2D30' && input.LA(1) <= '\u2D65')||input.LA(1)=='\u2D6F'||(input.LA(1) >= '\u2D80' && input.LA(1) <= '\u2D96')||(input.LA(1) >= '\u2DA0' && input.LA(1) <= '\u2DA6')||(input.LA(1) >= '\u2DA8' && input.LA(1) <= '\u2DAE')||(input.LA(1) >= '\u2DB0' && input.LA(1) <= '\u2DB6')||(input.LA(1) >= '\u2DB8' && input.LA(1) <= '\u2DBE')||(input.LA(1) >= '\u2DC0' && input.LA(1) <= '\u2DC6')||(input.LA(1) >= '\u2DC8' && input.LA(1) <= '\u2DCE')||(input.LA(1) >= '\u2DD0' && input.LA(1) <= '\u2DD6')||(input.LA(1) >= '\u2DD8' && input.LA(1) <= '\u2DDE')||(input.LA(1) >= '\u3005' && input.LA(1) <= '\u3007')||(input.LA(1) >= '\u3021' && input.LA(1) <= '\u3029')||(input.LA(1) >= '\u3031' && input.LA(1) <= '\u3035')||(input.LA(1) >= '\u3038' && input.LA(1) <= '\u303C')||(input.LA(1) >= '\u3041' && input.LA(1) <= '\u3096')||(input.LA(1) >= '\u309B' && input.LA(1) <= '\u309F')||(input.LA(1) >= '\u30A1' && input.LA(1) <= '\u30FA')||(input.LA(1) >= '\u30FC' && input.LA(1) <= '\u30FF')||(input.LA(1) >= '\u3105' && input.LA(1) <= '\u312C')||(input.LA(1) >= '\u3131' && input.LA(1) <= '\u318E')||(input.LA(1) >= '\u31A0' && input.LA(1) <= '\u31B7')||(input.LA(1) >= '\u31F0' && input.LA(1) <= '\u31FF')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u4DB5')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FBB')||(input.LA(1) >= '\uA000' && input.LA(1) <= '\uA48C')||(input.LA(1) >= '\uA800' && input.LA(1) <= '\uA801')||(input.LA(1) >= '\uA803' && input.LA(1) <= '\uA805')||(input.LA(1) >= '\uA807' && input.LA(1) <= '\uA80A')||(input.LA(1) >= '\uA80C' && input.LA(1) <= '\uA822')||(input.LA(1) >= '\uAC00' && input.LA(1) <= '\uD7A3')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFA2D')||(input.LA(1) >= '\uFA30' && input.LA(1) <= '\uFA6A')||(input.LA(1) >= '\uFA70' && input.LA(1) <= '\uFAD9')||(input.LA(1) >= '\uFB00' && input.LA(1) <= '\uFB06')||(input.LA(1) >= '\uFB13' && input.LA(1) <= '\uFB17')||input.LA(1)=='\uFB1D'||(input.LA(1) >= '\uFB1F' && input.LA(1) <= '\uFB28')||(input.LA(1) >= '\uFB2A' && input.LA(1) <= '\uFB36')||(input.LA(1) >= '\uFB38' && input.LA(1) <= '\uFB3C')||input.LA(1)=='\uFB3E'||(input.LA(1) >= '\uFB40' && input.LA(1) <= '\uFB41')||(input.LA(1) >= '\uFB43' && input.LA(1) <= '\uFB44')||(input.LA(1) >= '\uFB46' && input.LA(1) <= '\uFBB1')||(input.LA(1) >= '\uFBD3' && input.LA(1) <= '\uFD3D')||(input.LA(1) >= '\uFD50' && input.LA(1) <= '\uFD8F')||(input.LA(1) >= '\uFD92' && input.LA(1) <= '\uFDC7')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFDFB')||(input.LA(1) >= '\uFE70' && input.LA(1) <= '\uFE74')||(input.LA(1) >= '\uFE76' && input.LA(1) <= '\uFEFC')||(input.LA(1) >= '\uFF21' && input.LA(1) <= '\uFF3A')||(input.LA(1) >= '\uFF41' && input.LA(1) <= '\uFF5A')||(input.LA(1) >= '\uFF66' && input.LA(1) <= '\uFFBE')||(input.LA(1) >= '\uFFC2' && input.LA(1) <= '\uFFC7')||(input.LA(1) >= '\uFFCA' && input.LA(1) <= '\uFFCF')||(input.LA(1) >= '\uFFD2' && input.LA(1) <= '\uFFD7')||(input.LA(1) >= '\uFFDA' && input.LA(1) <= '\uFFDC') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_START"

    public void mTokens() throws RecognitionException {
        // cc/iqa/iQALexer.g:1:8: ( BOM | FEATURE_DEF | SCENARIO_DEF | WHEN | ELSE | ELIF | STEP | NOT | ADD | SUB | MUL | DIV | MOD | LPAREN | RPAREN | OR | AND | COP | EOP | SOP | COLON | EQUAL | COMMENTS | NEWLINE | PIPE | STRING | VARIABLE | FLOAT | WHITE | IDENTIFIER )
        int alt47=30;
        alt47 = dfa47.predict(input);
        switch (alt47) {
            case 1 :
                // cc/iqa/iQALexer.g:1:10: BOM
                {
                mBOM(); 


                }
                break;
            case 2 :
                // cc/iqa/iQALexer.g:1:14: FEATURE_DEF
                {
                mFEATURE_DEF(); 


                }
                break;
            case 3 :
                // cc/iqa/iQALexer.g:1:26: SCENARIO_DEF
                {
                mSCENARIO_DEF(); 


                }
                break;
            case 4 :
                // cc/iqa/iQALexer.g:1:39: WHEN
                {
                mWHEN(); 


                }
                break;
            case 5 :
                // cc/iqa/iQALexer.g:1:44: ELSE
                {
                mELSE(); 


                }
                break;
            case 6 :
                // cc/iqa/iQALexer.g:1:49: ELIF
                {
                mELIF(); 


                }
                break;
            case 7 :
                // cc/iqa/iQALexer.g:1:54: STEP
                {
                mSTEP(); 


                }
                break;
            case 8 :
                // cc/iqa/iQALexer.g:1:59: NOT
                {
                mNOT(); 


                }
                break;
            case 9 :
                // cc/iqa/iQALexer.g:1:63: ADD
                {
                mADD(); 


                }
                break;
            case 10 :
                // cc/iqa/iQALexer.g:1:67: SUB
                {
                mSUB(); 


                }
                break;
            case 11 :
                // cc/iqa/iQALexer.g:1:71: MUL
                {
                mMUL(); 


                }
                break;
            case 12 :
                // cc/iqa/iQALexer.g:1:75: DIV
                {
                mDIV(); 


                }
                break;
            case 13 :
                // cc/iqa/iQALexer.g:1:79: MOD
                {
                mMOD(); 


                }
                break;
            case 14 :
                // cc/iqa/iQALexer.g:1:83: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 15 :
                // cc/iqa/iQALexer.g:1:90: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 16 :
                // cc/iqa/iQALexer.g:1:97: OR
                {
                mOR(); 


                }
                break;
            case 17 :
                // cc/iqa/iQALexer.g:1:100: AND
                {
                mAND(); 


                }
                break;
            case 18 :
                // cc/iqa/iQALexer.g:1:104: COP
                {
                mCOP(); 


                }
                break;
            case 19 :
                // cc/iqa/iQALexer.g:1:108: EOP
                {
                mEOP(); 


                }
                break;
            case 20 :
                // cc/iqa/iQALexer.g:1:112: SOP
                {
                mSOP(); 


                }
                break;
            case 21 :
                // cc/iqa/iQALexer.g:1:116: COLON
                {
                mCOLON(); 


                }
                break;
            case 22 :
                // cc/iqa/iQALexer.g:1:122: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 23 :
                // cc/iqa/iQALexer.g:1:128: COMMENTS
                {
                mCOMMENTS(); 


                }
                break;
            case 24 :
                // cc/iqa/iQALexer.g:1:137: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 25 :
                // cc/iqa/iQALexer.g:1:145: PIPE
                {
                mPIPE(); 


                }
                break;
            case 26 :
                // cc/iqa/iQALexer.g:1:150: STRING
                {
                mSTRING(); 


                }
                break;
            case 27 :
                // cc/iqa/iQALexer.g:1:157: VARIABLE
                {
                mVARIABLE(); 


                }
                break;
            case 28 :
                // cc/iqa/iQALexer.g:1:166: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 29 :
                // cc/iqa/iQALexer.g:1:172: WHITE
                {
                mWHITE(); 


                }
                break;
            case 30 :
                // cc/iqa/iQALexer.g:1:178: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;

        }

    }


    protected DFA31 dfa31 = new DFA31(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA47 dfa47 = new DFA47(this);
    static final String DFA31_eotS =
        "\3\uffff\1\10\2\uffff\2\10\2\uffff";
    static final String DFA31_eofS =
        "\12\uffff";
    static final String DFA31_minS =
        "\1\11\2\12\5\11\2\uffff";
    static final String DFA31_maxS =
        "\1\40\1\15\1\12\1\43\2\40\2\43\2\uffff";
    static final String DFA31_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA31_specialS =
        "\12\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\4\1\3\1\uffff\1\1\1\2\22\uffff\1\5",
            "\1\3\2\uffff\1\2",
            "\1\3",
            "\1\6\1\3\1\uffff\1\1\1\2\22\uffff\1\7\2\uffff\1\11",
            "\1\4\1\3\1\uffff\1\1\1\2\22\uffff\1\5",
            "\1\4\1\3\1\uffff\1\1\1\2\22\uffff\1\5",
            "\1\6\1\3\1\uffff\1\1\1\2\22\uffff\1\7\2\uffff\1\11",
            "\1\6\1\3\1\uffff\1\1\1\2\22\uffff\1\7\2\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "192:1: NEWLINE : ( ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )* ( ( '\\u000C' )? ( '\\r' )? '\\n' ) (leading_space= ( ' ' | '\\t' ) )* | ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )* ( ( '\\u000C' )? ( '\\r' )? '\\n' ) ( ' ' | '\\t' )* '#' (~ '\\n' )* );";
        }
    }
    static final String DFA19_eotS =
        "\3\uffff\1\10\2\uffff\2\10\2\uffff";
    static final String DFA19_eofS =
        "\12\uffff";
    static final String DFA19_minS =
        "\1\11\2\12\1\11\2\uffff\2\11\2\uffff";
    static final String DFA19_maxS =
        "\1\40\1\15\1\12\1\40\2\uffff\2\40\2\uffff";
    static final String DFA19_acceptS =
        "\4\uffff\1\2\1\3\2\uffff\1\4\1\1";
    static final String DFA19_specialS =
        "\12\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\4\1\3\1\uffff\1\1\1\2\22\uffff\1\5",
            "\1\3\2\uffff\1\2",
            "\1\3",
            "\1\7\1\11\1\uffff\2\11\22\uffff\1\6",
            "",
            "",
            "\1\7\1\11\1\uffff\2\11\22\uffff\1\6",
            "\1\7\1\11\1\uffff\2\11\22\uffff\1\6",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 196:9: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )*";
        }
    }
    static final String DFA26_eotS =
        "\12\uffff";
    static final String DFA26_eofS =
        "\12\uffff";
    static final String DFA26_minS =
        "\1\11\2\12\1\11\2\uffff\1\11\2\uffff\1\11";
    static final String DFA26_maxS =
        "\1\40\1\15\1\12\1\43\2\uffff\1\43\2\uffff\1\43";
    static final String DFA26_acceptS =
        "\4\uffff\1\2\1\3\1\uffff\1\4\1\1\1\uffff";
    static final String DFA26_specialS =
        "\12\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\4\1\3\1\uffff\1\1\1\2\22\uffff\1\5",
            "\1\3\2\uffff\1\2",
            "\1\3",
            "\1\6\1\10\1\uffff\2\10\22\uffff\1\11\2\uffff\1\7",
            "",
            "",
            "\1\6\1\10\1\uffff\2\10\22\uffff\1\11\2\uffff\1\7",
            "",
            "",
            "\1\6\1\10\1\uffff\2\10\22\uffff\1\11\2\uffff\1\7"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 225:7: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' ) | '\\t' | ' ' )*";
        }
    }
    static final String DFA43_eotS =
        "\2\uffff\1\5\3\uffff";
    static final String DFA43_eofS =
        "\6\uffff";
    static final String DFA43_minS =
        "\1\53\2\56\3\uffff";
    static final String DFA43_maxS =
        "\3\71\3\uffff";
    static final String DFA43_acceptS =
        "\3\uffff\1\2\1\1\1\3";
    static final String DFA43_specialS =
        "\6\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1\1\uffff\1\1\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2",
            "\1\4\1\uffff\12\2",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "259:1: FLOAT : ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | ( '+' | '-' )? '.' ( '0' .. '9' )+ ( Exponent )? | ( '+' | '-' )? ( '0' .. '9' )+ ( Exponent )? );";
        }
    }
    static final String DFA47_eotS =
        "\1\41\1\uffff\2\41\1\44\1\41\1\46\1\51\1\52\1\53\4\uffff\1\55\2"+
        "\41\1\uffff\2\41\2\62\1\64\1\uffff\1\65\1\uffff\1\70\1\65\1\uffff"+
        "\1\65\4\uffff\2\41\1\uffff\1\102\10\uffff\2\54\1\41\1\21\4\uffff"+
        "\1\70\1\34\1\uffff\1\70\2\uffff\1\105\1\uffff\1\106\2\uffff\1\107"+
        "\1\uffff\1\21\1\34\5\uffff";
    static final String DFA47_eofS =
        "\112\uffff";
    static final String DFA47_minS =
        "\1\11\1\uffff\1\u80fd\1\u666f\1\101\1\u5219\1\0\1\75\2\56\4\uffff"+
        "\1\174\1\162\1\u8005\1\uffff\1\156\1\u4e14\1\74\1\76\1\75\1\uffff"+
        "\2\12\2\11\1\uffff\1\11\4\uffff\3\0\1\101\10\uffff\2\101\1\144\1"+
        "\101\4\uffff\1\11\1\0\1\uffff\3\11\1\0\1\uffff\1\0\2\uffff\1\101"+
        "\1\0\1\101\4\0\2\uffff";
    static final String DFA47_maxS =
        "\1\uff1a\1\uffff\1\u80fd\1\u666f\1\uffdc\1\u5219\1\uffff\1\75\2"+
        "\71\4\uffff\1\174\1\162\1\u8005\1\uffff\1\156\1\u4e14\1\74\1\76"+
        "\1\75\1\uffff\1\15\1\12\2\43\1\uffff\1\43\4\uffff\2\uffff\1\0\1"+
        "\uffdc\10\uffff\2\uffdc\1\144\1\uffdc\4\uffff\1\43\1\uffff\1\uffff"+
        "\3\43\1\uffff\1\uffff\1\uffff\2\uffff\1\uffdc\1\0\1\uffdc\1\uffff"+
        "\3\0\2\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\10\uffff\1\14\1\15\1\16\1\17\3\uffff\1\21\5\uffff\1"+
        "\25\4\uffff\1\27\1\uffff\1\32\1\33\1\34\1\36\4\uffff\1\13\1\7\1"+
        "\23\1\10\1\11\1\12\1\20\1\31\4\uffff\1\22\1\24\1\26\1\35\2\uffff"+
        "\1\30\4\uffff\1\2\1\uffff\1\3\1\4\7\uffff\1\5\1\6";
    static final String DFA47_specialS =
        "\1\3\5\uffff\1\1\33\uffff\1\6\1\5\1\10\22\uffff\1\0\4\uffff\1\12"+
        "\1\uffff\1\2\3\uffff\1\7\1\uffff\1\4\1\13\1\14\1\11\2\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\33\1\32\1\uffff\1\30\1\31\22\uffff\1\35\1\7\1\36\1\34\1\uffff"+
            "\1\13\1\21\1\uffff\1\14\1\15\1\6\1\10\1\uffff\1\11\1\40\1\12"+
            "\12\40\1\27\1\uffff\1\24\1\26\1\25\34\uffff\1\37\5\uffff\1\22"+
            "\15\uffff\1\17\14\uffff\1\16\u5222\uffff\1\2\u0186\uffff\1\5"+
            "\u0313\uffff\1\3\u073b\uffff\1\23\u00dc\uffff\1\4\u02c2\uffff"+
            "\1\20\u9ce8\uffff\1\1\32\uffff\1\27",
            "",
            "\1\42",
            "\1\43",
            "\32\41\4\uffff\1\41\1\uffff\32\41\57\uffff\1\41\12\uffff\1"+
            "\41\4\uffff\1\41\5\uffff\27\41\1\uffff\37\41\1\uffff\u014a\41"+
            "\16\uffff\162\41\4\uffff\14\41\16\uffff\5\41\11\uffff\1\41\u008b"+
            "\uffff\1\41\13\uffff\1\41\1\uffff\3\41\1\uffff\1\41\1\uffff"+
            "\24\41\1\uffff\54\41\1\uffff\46\41\1\uffff\u008b\41\10\uffff"+
            "\105\41\1\uffff\52\41\6\uffff\20\41\41\uffff\46\41\2\uffff\1"+
            "\41\7\uffff\47\41\110\uffff\33\41\5\uffff\3\41\56\uffff\32\41"+
            "\5\uffff\13\41\43\uffff\2\41\1\uffff\143\41\1\uffff\1\41\17"+
            "\uffff\2\41\7\uffff\2\41\12\uffff\3\41\2\uffff\1\41\20\uffff"+
            "\1\41\1\uffff\36\41\35\uffff\41\41\22\uffff\46\41\13\uffff\1"+
            "\41\u0152\uffff\66\41\3\uffff\1\41\22\uffff\1\41\7\uffff\12"+
            "\41\33\uffff\1\41\7\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1"+
            "\uffff\7\41\1\uffff\1\41\3\uffff\4\41\3\uffff\1\41\20\uffff"+
            "\1\41\15\uffff\2\41\1\uffff\3\41\16\uffff\2\41\23\uffff\6\41"+
            "\4\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff\2\41\1\uffff"+
            "\2\41\1\uffff\2\41\37\uffff\4\41\1\uffff\1\41\23\uffff\3\41"+
            "\20\uffff\11\41\1\uffff\3\41\1\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\22\uffff\1\41\17\uffff\2\41"+
            "\43\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\36\uffff\2\41\1\uffff\3\41\17"+
            "\uffff\1\41\21\uffff\1\41\1\uffff\6\41\3\uffff\3\41\1\uffff"+
            "\4\41\3\uffff\2\41\1\uffff\1\41\1\uffff\2\41\3\uffff\2\41\3"+
            "\uffff\3\41\3\uffff\14\41\113\uffff\10\41\1\uffff\3\41\1\uffff"+
            "\27\41\1\uffff\12\41\1\uffff\5\41\46\uffff\2\41\43\uffff\10"+
            "\41\1\uffff\3\41\1\uffff\27\41\1\uffff\12\41\1\uffff\5\41\3"+
            "\uffff\1\41\40\uffff\1\41\1\uffff\2\41\43\uffff\10\41\1\uffff"+
            "\3\41\1\uffff\27\41\1\uffff\20\41\46\uffff\2\41\43\uffff\22"+
            "\41\3\uffff\30\41\1\uffff\11\41\1\uffff\1\41\2\uffff\7\41\72"+
            "\uffff\60\41\1\uffff\2\41\14\uffff\7\41\72\uffff\2\41\1\uffff"+
            "\1\41\2\uffff\2\41\1\uffff\1\41\2\uffff\1\41\6\uffff\4\41\1"+
            "\uffff\7\41\1\uffff\3\41\1\uffff\1\41\1\uffff\1\41\2\uffff\2"+
            "\41\1\uffff\4\41\1\uffff\2\41\11\uffff\1\41\2\uffff\5\41\1\uffff"+
            "\1\41\25\uffff\2\41\42\uffff\1\41\77\uffff\10\41\1\uffff\42"+
            "\41\35\uffff\4\41\164\uffff\42\41\1\uffff\5\41\1\uffff\2\41"+
            "\45\uffff\6\41\112\uffff\46\41\12\uffff\53\41\1\uffff\1\41\3"+
            "\uffff\132\41\5\uffff\104\41\5\uffff\122\41\6\uffff\111\41\1"+
            "\uffff\4\41\2\uffff\7\41\1\uffff\1\41\1\uffff\4\41\2\uffff\51"+
            "\41\1\uffff\4\41\2\uffff\41\41\1\uffff\4\41\2\uffff\7\41\1\uffff"+
            "\1\41\1\uffff\4\41\2\uffff\17\41\1\uffff\71\41\1\uffff\4\41"+
            "\2\uffff\103\41\45\uffff\20\41\20\uffff\125\41\14\uffff\u026c"+
            "\41\2\uffff\10\41\12\uffff\32\41\5\uffff\113\41\3\uffff\3\41"+
            "\17\uffff\15\41\1\uffff\4\41\16\uffff\22\41\16\uffff\22\41\16"+
            "\uffff\15\41\1\uffff\3\41\17\uffff\64\41\43\uffff\1\41\4\uffff"+
            "\1\41\103\uffff\130\41\10\uffff\51\41\127\uffff\35\41\63\uffff"+
            "\36\41\2\uffff\5\41\13\uffff\52\41\27\uffff\7\41\70\uffff\27"+
            "\41\u02e9\uffff\u00c0\41\100\uffff\u009c\41\4\uffff\132\41\6"+
            "\uffff\26\41\2\uffff\6\41\2\uffff\46\41\2\uffff\6\41\2\uffff"+
            "\10\41\1\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\37\41"+
            "\2\uffff\65\41\1\uffff\7\41\1\uffff\1\41\3\uffff\3\41\1\uffff"+
            "\7\41\3\uffff\4\41\2\uffff\6\41\4\uffff\15\41\5\uffff\3\41\1"+
            "\uffff\7\41\164\uffff\1\41\15\uffff\1\41\20\uffff\5\41\155\uffff"+
            "\1\41\4\uffff\1\41\2\uffff\12\41\1\uffff\1\41\2\uffff\6\41\6"+
            "\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\10\41\1\uffff"+
            "\7\41\2\uffff\4\41\5\uffff\5\41\26\uffff\44\41\u0a7c\uffff\57"+
            "\41\1\uffff\57\41\41\uffff\145\41\33\uffff\46\41\12\uffff\66"+
            "\41\11\uffff\1\41\20\uffff\27\41\11\uffff\7\41\1\uffff\7\41"+
            "\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff"+
            "\7\41\1\uffff\7\41\u0226\uffff\3\41\31\uffff\11\41\7\uffff\5"+
            "\41\2\uffff\5\41\4\uffff\126\41\4\uffff\5\41\1\uffff\132\41"+
            "\1\uffff\4\41\5\uffff\50\41\4\uffff\136\41\21\uffff\30\41\70"+
            "\uffff\20\41\u0200\uffff\u19b6\41\112\uffff\u51bc\41\104\uffff"+
            "\u048d\41\u0373\uffff\2\41\1\uffff\3\41\1\uffff\4\41\1\uffff"+
            "\27\41\u03dd\uffff\u2ba4\41\u215c\uffff\u012e\41\2\uffff\73"+
            "\41\5\uffff\152\41\46\uffff\7\41\14\uffff\5\41\5\uffff\1\41"+
            "\1\uffff\12\41\1\uffff\15\41\1\uffff\5\41\1\uffff\1\41\1\uffff"+
            "\2\41\1\uffff\2\41\1\uffff\154\41\41\uffff\u016b\41\22\uffff"+
            "\100\41\2\uffff\66\41\50\uffff\14\41\164\uffff\5\41\1\uffff"+
            "\u0087\41\44\uffff\32\41\6\uffff\32\41\13\uffff\131\41\3\uffff"+
            "\6\41\2\uffff\6\41\2\uffff\6\41\2\uffff\3\41",
            "\1\45",
            "\12\47\1\uffff\ufff5\47",
            "\1\50",
            "\1\40\1\uffff\12\40",
            "\1\40\1\uffff\12\40",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\56",
            "\1\57",
            "",
            "\1\60",
            "\1\61",
            "\1\63",
            "\1\63",
            "\1\50",
            "",
            "\1\32\2\uffff\1\31",
            "\1\32",
            "\1\66\26\uffff\1\71\2\uffff\1\67",
            "\1\72\1\70\1\uffff\2\70\22\uffff\1\73\2\uffff\1\34",
            "",
            "\1\72\1\70\1\uffff\2\70\22\uffff\1\73\2\uffff\1\34",
            "",
            "",
            "",
            "",
            "\12\75\1\uffff\66\75\32\74\4\75\1\74\1\75\32\74\57\75\1\74"+
            "\12\75\1\74\4\75\1\74\5\75\27\74\1\75\37\74\1\75\u014a\74\16"+
            "\75\162\74\4\75\14\74\16\75\5\74\11\75\1\74\u008b\75\1\74\13"+
            "\75\1\74\1\75\3\74\1\75\1\74\1\75\24\74\1\75\54\74\1\75\46\74"+
            "\1\75\u008b\74\10\75\105\74\1\75\52\74\6\75\20\74\41\75\46\74"+
            "\2\75\1\74\7\75\47\74\110\75\33\74\5\75\3\74\56\75\32\74\5\75"+
            "\13\74\43\75\2\74\1\75\143\74\1\75\1\74\17\75\2\74\7\75\2\74"+
            "\12\75\3\74\2\75\1\74\20\75\1\74\1\75\36\74\35\75\41\74\22\75"+
            "\46\74\13\75\1\74\u0152\75\66\74\3\75\1\74\22\75\1\74\7\75\12"+
            "\74\33\75\1\74\7\75\10\74\2\75\2\74\2\75\26\74\1\75\7\74\1\75"+
            "\1\74\3\75\4\74\3\75\1\74\20\75\1\74\15\75\2\74\1\75\3\74\16"+
            "\75\2\74\23\75\6\74\4\75\2\74\2\75\26\74\1\75\7\74\1\75\2\74"+
            "\1\75\2\74\1\75\2\74\37\75\4\74\1\75\1\74\23\75\3\74\20\75\11"+
            "\74\1\75\3\74\1\75\26\74\1\75\7\74\1\75\2\74\1\75\5\74\3\75"+
            "\1\74\22\75\1\74\17\75\2\74\43\75\10\74\2\75\2\74\2\75\26\74"+
            "\1\75\7\74\1\75\2\74\1\75\5\74\3\75\1\74\36\75\2\74\1\75\3\74"+
            "\17\75\1\74\21\75\1\74\1\75\6\74\3\75\3\74\1\75\4\74\3\75\2"+
            "\74\1\75\1\74\1\75\2\74\3\75\2\74\3\75\3\74\3\75\14\74\113\75"+
            "\10\74\1\75\3\74\1\75\27\74\1\75\12\74\1\75\5\74\46\75\2\74"+
            "\43\75\10\74\1\75\3\74\1\75\27\74\1\75\12\74\1\75\5\74\3\75"+
            "\1\74\40\75\1\74\1\75\2\74\43\75\10\74\1\75\3\74\1\75\27\74"+
            "\1\75\20\74\46\75\2\74\43\75\22\74\3\75\30\74\1\75\11\74\1\75"+
            "\1\74\2\75\7\74\72\75\60\74\1\75\2\74\14\75\7\74\72\75\2\74"+
            "\1\75\1\74\2\75\2\74\1\75\1\74\2\75\1\74\6\75\4\74\1\75\7\74"+
            "\1\75\3\74\1\75\1\74\1\75\1\74\2\75\2\74\1\75\4\74\1\75\2\74"+
            "\11\75\1\74\2\75\5\74\1\75\1\74\25\75\2\74\42\75\1\74\77\75"+
            "\10\74\1\75\42\74\35\75\4\74\164\75\42\74\1\75\5\74\1\75\2\74"+
            "\45\75\6\74\112\75\46\74\12\75\53\74\1\75\1\74\3\75\132\74\5"+
            "\75\104\74\5\75\122\74\6\75\111\74\1\75\4\74\2\75\7\74\1\75"+
            "\1\74\1\75\4\74\2\75\51\74\1\75\4\74\2\75\41\74\1\75\4\74\2"+
            "\75\7\74\1\75\1\74\1\75\4\74\2\75\17\74\1\75\71\74\1\75\4\74"+
            "\2\75\103\74\45\75\20\74\20\75\125\74\14\75\u026c\74\2\75\10"+
            "\74\12\75\32\74\5\75\113\74\3\75\3\74\17\75\15\74\1\75\4\74"+
            "\16\75\22\74\16\75\22\74\16\75\15\74\1\75\3\74\17\75\64\74\43"+
            "\75\1\74\4\75\1\74\103\75\130\74\10\75\51\74\127\75\35\74\63"+
            "\75\36\74\2\75\5\74\13\75\52\74\27\75\7\74\70\75\27\74\u02e9"+
            "\75\u00c0\74\100\75\u009c\74\4\75\132\74\6\75\26\74\2\75\6\74"+
            "\2\75\46\74\2\75\6\74\2\75\10\74\1\75\1\74\1\75\1\74\1\75\1"+
            "\74\1\75\37\74\2\75\65\74\1\75\7\74\1\75\1\74\3\75\3\74\1\75"+
            "\7\74\3\75\4\74\2\75\6\74\4\75\15\74\5\75\3\74\1\75\7\74\164"+
            "\75\1\74\15\75\1\74\20\75\5\74\155\75\1\74\4\75\1\74\2\75\12"+
            "\74\1\75\1\74\2\75\6\74\6\75\1\74\1\75\1\74\1\75\1\74\1\75\10"+
            "\74\1\75\7\74\2\75\4\74\5\75\5\74\26\75\44\74\u0a7c\75\57\74"+
            "\1\75\57\74\41\75\145\74\33\75\46\74\12\75\66\74\11\75\1\74"+
            "\20\75\27\74\11\75\7\74\1\75\7\74\1\75\7\74\1\75\7\74\1\75\7"+
            "\74\1\75\7\74\1\75\7\74\1\75\7\74\u0226\75\3\74\31\75\11\74"+
            "\7\75\5\74\2\75\5\74\4\75\126\74\4\75\5\74\1\75\132\74\1\75"+
            "\4\74\5\75\50\74\4\75\136\74\21\75\30\74\70\75\20\74\u0200\75"+
            "\u19b6\74\112\75\u51bc\74\104\75\u048d\74\u0373\75\2\74\1\75"+
            "\3\74\1\75\4\74\1\75\27\74\u03dd\75\u2ba4\74\u215c\75\u012e"+
            "\74\2\75\73\74\5\75\152\74\46\75\7\74\14\75\5\74\5\75\1\74\1"+
            "\75\12\74\1\75\15\74\1\75\5\74\1\75\1\74\1\75\2\74\1\75\2\74"+
            "\1\75\154\74\41\75\u016b\74\22\75\100\74\2\75\66\74\50\75\14"+
            "\74\164\75\5\74\1\75\u0087\74\44\75\32\74\6\75\32\74\13\75\131"+
            "\74\3\75\6\74\2\75\6\74\2\75\6\74\2\75\3\74\43\75",
            "\12\77\1\uffff\66\77\32\76\4\77\1\76\1\77\32\76\57\77\1\76"+
            "\12\77\1\76\4\77\1\76\5\77\27\76\1\77\37\76\1\77\u014a\76\16"+
            "\77\162\76\4\77\14\76\16\77\5\76\11\77\1\76\u008b\77\1\76\13"+
            "\77\1\76\1\77\3\76\1\77\1\76\1\77\24\76\1\77\54\76\1\77\46\76"+
            "\1\77\u008b\76\10\77\105\76\1\77\52\76\6\77\20\76\41\77\46\76"+
            "\2\77\1\76\7\77\47\76\110\77\33\76\5\77\3\76\56\77\32\76\5\77"+
            "\13\76\43\77\2\76\1\77\143\76\1\77\1\76\17\77\2\76\7\77\2\76"+
            "\12\77\3\76\2\77\1\76\20\77\1\76\1\77\36\76\35\77\41\76\22\77"+
            "\46\76\13\77\1\76\u0152\77\66\76\3\77\1\76\22\77\1\76\7\77\12"+
            "\76\33\77\1\76\7\77\10\76\2\77\2\76\2\77\26\76\1\77\7\76\1\77"+
            "\1\76\3\77\4\76\3\77\1\76\20\77\1\76\15\77\2\76\1\77\3\76\16"+
            "\77\2\76\23\77\6\76\4\77\2\76\2\77\26\76\1\77\7\76\1\77\2\76"+
            "\1\77\2\76\1\77\2\76\37\77\4\76\1\77\1\76\23\77\3\76\20\77\11"+
            "\76\1\77\3\76\1\77\26\76\1\77\7\76\1\77\2\76\1\77\5\76\3\77"+
            "\1\76\22\77\1\76\17\77\2\76\43\77\10\76\2\77\2\76\2\77\26\76"+
            "\1\77\7\76\1\77\2\76\1\77\5\76\3\77\1\76\36\77\2\76\1\77\3\76"+
            "\17\77\1\76\21\77\1\76\1\77\6\76\3\77\3\76\1\77\4\76\3\77\2"+
            "\76\1\77\1\76\1\77\2\76\3\77\2\76\3\77\3\76\3\77\14\76\113\77"+
            "\10\76\1\77\3\76\1\77\27\76\1\77\12\76\1\77\5\76\46\77\2\76"+
            "\43\77\10\76\1\77\3\76\1\77\27\76\1\77\12\76\1\77\5\76\3\77"+
            "\1\76\40\77\1\76\1\77\2\76\43\77\10\76\1\77\3\76\1\77\27\76"+
            "\1\77\20\76\46\77\2\76\43\77\22\76\3\77\30\76\1\77\11\76\1\77"+
            "\1\76\2\77\7\76\72\77\60\76\1\77\2\76\14\77\7\76\72\77\2\76"+
            "\1\77\1\76\2\77\2\76\1\77\1\76\2\77\1\76\6\77\4\76\1\77\7\76"+
            "\1\77\3\76\1\77\1\76\1\77\1\76\2\77\2\76\1\77\4\76\1\77\2\76"+
            "\11\77\1\76\2\77\5\76\1\77\1\76\25\77\2\76\42\77\1\76\77\77"+
            "\10\76\1\77\42\76\35\77\4\76\164\77\42\76\1\77\5\76\1\77\2\76"+
            "\45\77\6\76\112\77\46\76\12\77\53\76\1\77\1\76\3\77\132\76\5"+
            "\77\104\76\5\77\122\76\6\77\111\76\1\77\4\76\2\77\7\76\1\77"+
            "\1\76\1\77\4\76\2\77\51\76\1\77\4\76\2\77\41\76\1\77\4\76\2"+
            "\77\7\76\1\77\1\76\1\77\4\76\2\77\17\76\1\77\71\76\1\77\4\76"+
            "\2\77\103\76\45\77\20\76\20\77\125\76\14\77\u026c\76\2\77\10"+
            "\76\12\77\32\76\5\77\113\76\3\77\3\76\17\77\15\76\1\77\4\76"+
            "\16\77\22\76\16\77\22\76\16\77\15\76\1\77\3\76\17\77\64\76\43"+
            "\77\1\76\4\77\1\76\103\77\130\76\10\77\51\76\127\77\35\76\63"+
            "\77\36\76\2\77\5\76\13\77\52\76\27\77\7\76\70\77\27\76\u02e9"+
            "\77\u00c0\76\100\77\u009c\76\4\77\132\76\6\77\26\76\2\77\6\76"+
            "\2\77\46\76\2\77\6\76\2\77\10\76\1\77\1\76\1\77\1\76\1\77\1"+
            "\76\1\77\37\76\2\77\65\76\1\77\7\76\1\77\1\76\3\77\3\76\1\77"+
            "\7\76\3\77\4\76\2\77\6\76\4\77\15\76\5\77\3\76\1\77\7\76\164"+
            "\77\1\76\15\77\1\76\20\77\5\76\155\77\1\76\4\77\1\76\2\77\12"+
            "\76\1\77\1\76\2\77\6\76\6\77\1\76\1\77\1\76\1\77\1\76\1\77\10"+
            "\76\1\77\7\76\2\77\4\76\5\77\5\76\26\77\44\76\u0a7c\77\57\76"+
            "\1\77\57\76\41\77\145\76\33\77\46\76\12\77\66\76\11\77\1\76"+
            "\20\77\27\76\11\77\7\76\1\77\7\76\1\77\7\76\1\77\7\76\1\77\7"+
            "\76\1\77\7\76\1\77\7\76\1\77\7\76\u0226\77\3\76\31\77\11\76"+
            "\7\77\5\76\2\77\5\76\4\77\126\76\4\77\5\76\1\77\132\76\1\77"+
            "\4\76\5\77\50\76\4\77\136\76\21\77\30\76\70\77\20\76\u0200\77"+
            "\u19b6\76\112\77\u51bc\76\104\77\u048d\76\u0373\77\2\76\1\77"+
            "\3\76\1\77\4\76\1\77\27\76\u03dd\77\u2ba4\76\u215c\77\u012e"+
            "\76\2\77\73\76\5\77\152\76\46\77\7\76\14\77\5\76\5\77\1\76\1"+
            "\77\12\76\1\77\15\76\1\77\5\76\1\77\1\76\1\77\2\76\1\77\2\76"+
            "\1\77\154\76\41\77\u016b\76\22\77\100\76\2\77\66\76\50\77\14"+
            "\76\164\77\5\76\1\77\u0087\76\44\77\32\76\6\77\32\76\13\77\131"+
            "\76\3\77\6\76\2\77\6\76\2\77\6\76\2\77\3\76\43\77",
            "\1\uffff",
            "\32\41\4\uffff\1\41\1\uffff\32\41\57\uffff\1\41\12\uffff\1"+
            "\41\4\uffff\1\41\5\uffff\27\41\1\uffff\37\41\1\uffff\u014a\41"+
            "\16\uffff\162\41\4\uffff\14\41\16\uffff\5\41\11\uffff\1\41\u008b"+
            "\uffff\1\41\13\uffff\1\41\1\uffff\3\41\1\uffff\1\41\1\uffff"+
            "\24\41\1\uffff\54\41\1\uffff\46\41\1\uffff\u008b\41\10\uffff"+
            "\105\41\1\uffff\52\41\6\uffff\20\41\41\uffff\46\41\2\uffff\1"+
            "\41\7\uffff\47\41\110\uffff\33\41\5\uffff\3\41\56\uffff\32\41"+
            "\5\uffff\13\41\43\uffff\2\41\1\uffff\143\41\1\uffff\1\41\17"+
            "\uffff\2\41\7\uffff\2\41\12\uffff\3\41\2\uffff\1\41\20\uffff"+
            "\1\41\1\uffff\36\41\35\uffff\41\41\22\uffff\46\41\13\uffff\1"+
            "\41\u0152\uffff\66\41\3\uffff\1\41\22\uffff\1\41\7\uffff\12"+
            "\41\33\uffff\1\41\7\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1"+
            "\uffff\7\41\1\uffff\1\41\3\uffff\4\41\3\uffff\1\41\20\uffff"+
            "\1\41\15\uffff\2\41\1\uffff\3\41\16\uffff\2\41\23\uffff\6\41"+
            "\4\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff\2\41\1\uffff"+
            "\2\41\1\uffff\2\41\37\uffff\4\41\1\uffff\1\41\23\uffff\3\41"+
            "\20\uffff\11\41\1\uffff\3\41\1\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\22\uffff\1\41\17\uffff\2\41"+
            "\43\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\36\uffff\2\41\1\uffff\3\41\17"+
            "\uffff\1\41\21\uffff\1\41\1\uffff\6\41\3\uffff\3\41\1\uffff"+
            "\4\41\3\uffff\2\41\1\uffff\1\41\1\uffff\2\41\3\uffff\2\41\3"+
            "\uffff\3\41\3\uffff\14\41\113\uffff\10\41\1\uffff\3\41\1\uffff"+
            "\27\41\1\uffff\12\41\1\uffff\5\41\46\uffff\2\41\43\uffff\10"+
            "\41\1\uffff\3\41\1\uffff\27\41\1\uffff\12\41\1\uffff\5\41\3"+
            "\uffff\1\41\40\uffff\1\41\1\uffff\2\41\43\uffff\10\41\1\uffff"+
            "\3\41\1\uffff\27\41\1\uffff\20\41\46\uffff\2\41\43\uffff\22"+
            "\41\3\uffff\30\41\1\uffff\11\41\1\uffff\1\41\2\uffff\7\41\72"+
            "\uffff\60\41\1\uffff\2\41\14\uffff\7\41\72\uffff\2\41\1\uffff"+
            "\1\41\2\uffff\2\41\1\uffff\1\41\2\uffff\1\41\6\uffff\4\41\1"+
            "\uffff\7\41\1\uffff\3\41\1\uffff\1\41\1\uffff\1\41\2\uffff\2"+
            "\41\1\uffff\4\41\1\uffff\2\41\11\uffff\1\41\2\uffff\5\41\1\uffff"+
            "\1\41\25\uffff\2\41\42\uffff\1\41\77\uffff\10\41\1\uffff\42"+
            "\41\35\uffff\4\41\164\uffff\42\41\1\uffff\5\41\1\uffff\2\41"+
            "\45\uffff\6\41\112\uffff\46\41\12\uffff\53\41\1\uffff\1\41\3"+
            "\uffff\132\41\5\uffff\104\41\5\uffff\122\41\6\uffff\111\41\1"+
            "\uffff\4\41\2\uffff\7\41\1\uffff\1\41\1\uffff\4\41\2\uffff\51"+
            "\41\1\uffff\4\41\2\uffff\41\41\1\uffff\4\41\2\uffff\7\41\1\uffff"+
            "\1\41\1\uffff\4\41\2\uffff\17\41\1\uffff\71\41\1\uffff\4\41"+
            "\2\uffff\103\41\45\uffff\20\41\20\uffff\125\41\14\uffff\u026c"+
            "\41\2\uffff\10\41\12\uffff\32\41\5\uffff\113\41\3\uffff\3\41"+
            "\17\uffff\15\41\1\uffff\4\41\16\uffff\22\41\16\uffff\22\41\16"+
            "\uffff\15\41\1\uffff\3\41\17\uffff\64\41\43\uffff\1\41\4\uffff"+
            "\1\41\103\uffff\130\41\10\uffff\51\41\127\uffff\35\41\63\uffff"+
            "\36\41\2\uffff\5\41\13\uffff\52\41\27\uffff\7\41\70\uffff\27"+
            "\41\u02e9\uffff\u00c0\41\100\uffff\u009c\41\4\uffff\132\41\6"+
            "\uffff\26\41\2\uffff\6\41\2\uffff\46\41\2\uffff\6\41\2\uffff"+
            "\10\41\1\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\37\41"+
            "\2\uffff\65\41\1\uffff\7\41\1\uffff\1\41\3\uffff\3\41\1\uffff"+
            "\7\41\3\uffff\4\41\2\uffff\6\41\4\uffff\15\41\5\uffff\3\41\1"+
            "\uffff\7\41\164\uffff\1\41\15\uffff\1\41\20\uffff\5\41\155\uffff"+
            "\1\41\4\uffff\1\41\2\uffff\12\41\1\uffff\1\41\2\uffff\6\41\6"+
            "\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\10\41\1\uffff"+
            "\7\41\2\uffff\4\41\5\uffff\5\41\26\uffff\44\41\u0a7c\uffff\57"+
            "\41\1\uffff\57\41\41\uffff\145\41\33\uffff\46\41\12\uffff\66"+
            "\41\11\uffff\1\41\20\uffff\27\41\11\uffff\7\41\1\uffff\7\41"+
            "\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff"+
            "\7\41\1\uffff\7\41\u0226\uffff\3\41\31\uffff\11\41\7\uffff\5"+
            "\41\2\uffff\5\41\4\uffff\126\41\4\uffff\5\41\1\uffff\132\41"+
            "\1\uffff\4\41\5\uffff\50\41\4\uffff\136\41\21\uffff\30\41\70"+
            "\uffff\20\41\u0200\uffff\u19b6\41\112\uffff\u1153\41\1\101\u4068"+
            "\41\104\uffff\u048d\41\u0373\uffff\2\41\1\uffff\3\41\1\uffff"+
            "\4\41\1\uffff\27\41\u03dd\uffff\u2ba4\41\u215c\uffff\u012e\41"+
            "\2\uffff\73\41\5\uffff\152\41\46\uffff\7\41\14\uffff\5\41\5"+
            "\uffff\1\41\1\uffff\12\41\1\uffff\15\41\1\uffff\5\41\1\uffff"+
            "\1\41\1\uffff\2\41\1\uffff\2\41\1\uffff\154\41\41\uffff\u016b"+
            "\41\22\uffff\100\41\2\uffff\66\41\50\uffff\14\41\164\uffff\5"+
            "\41\1\uffff\u0087\41\44\uffff\32\41\6\uffff\32\41\13\uffff\131"+
            "\41\3\uffff\6\41\2\uffff\6\41\2\uffff\6\41\2\uffff\3\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\41\4\uffff\1\41\1\uffff\32\41\57\uffff\1\41\12\uffff\1"+
            "\41\4\uffff\1\41\5\uffff\27\41\1\uffff\37\41\1\uffff\u014a\41"+
            "\16\uffff\162\41\4\uffff\14\41\16\uffff\5\41\11\uffff\1\41\u008b"+
            "\uffff\1\41\13\uffff\1\41\1\uffff\3\41\1\uffff\1\41\1\uffff"+
            "\24\41\1\uffff\54\41\1\uffff\46\41\1\uffff\u008b\41\10\uffff"+
            "\105\41\1\uffff\52\41\6\uffff\20\41\41\uffff\46\41\2\uffff\1"+
            "\41\7\uffff\47\41\110\uffff\33\41\5\uffff\3\41\56\uffff\32\41"+
            "\5\uffff\13\41\43\uffff\2\41\1\uffff\143\41\1\uffff\1\41\17"+
            "\uffff\2\41\7\uffff\2\41\12\uffff\3\41\2\uffff\1\41\20\uffff"+
            "\1\41\1\uffff\36\41\35\uffff\41\41\22\uffff\46\41\13\uffff\1"+
            "\41\u0152\uffff\66\41\3\uffff\1\41\22\uffff\1\41\7\uffff\12"+
            "\41\33\uffff\1\41\7\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1"+
            "\uffff\7\41\1\uffff\1\41\3\uffff\4\41\3\uffff\1\41\20\uffff"+
            "\1\41\15\uffff\2\41\1\uffff\3\41\16\uffff\2\41\23\uffff\6\41"+
            "\4\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff\2\41\1\uffff"+
            "\2\41\1\uffff\2\41\37\uffff\4\41\1\uffff\1\41\23\uffff\3\41"+
            "\20\uffff\11\41\1\uffff\3\41\1\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\22\uffff\1\41\17\uffff\2\41"+
            "\43\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\36\uffff\2\41\1\uffff\3\41\17"+
            "\uffff\1\41\21\uffff\1\41\1\uffff\6\41\3\uffff\3\41\1\uffff"+
            "\4\41\3\uffff\2\41\1\uffff\1\41\1\uffff\2\41\3\uffff\2\41\3"+
            "\uffff\3\41\3\uffff\14\41\113\uffff\10\41\1\uffff\3\41\1\uffff"+
            "\27\41\1\uffff\12\41\1\uffff\5\41\46\uffff\2\41\43\uffff\10"+
            "\41\1\uffff\3\41\1\uffff\27\41\1\uffff\12\41\1\uffff\5\41\3"+
            "\uffff\1\41\40\uffff\1\41\1\uffff\2\41\43\uffff\10\41\1\uffff"+
            "\3\41\1\uffff\27\41\1\uffff\20\41\46\uffff\2\41\43\uffff\22"+
            "\41\3\uffff\30\41\1\uffff\11\41\1\uffff\1\41\2\uffff\7\41\72"+
            "\uffff\60\41\1\uffff\2\41\14\uffff\7\41\72\uffff\2\41\1\uffff"+
            "\1\41\2\uffff\2\41\1\uffff\1\41\2\uffff\1\41\6\uffff\4\41\1"+
            "\uffff\7\41\1\uffff\3\41\1\uffff\1\41\1\uffff\1\41\2\uffff\2"+
            "\41\1\uffff\4\41\1\uffff\2\41\11\uffff\1\41\2\uffff\5\41\1\uffff"+
            "\1\41\25\uffff\2\41\42\uffff\1\41\77\uffff\10\41\1\uffff\42"+
            "\41\35\uffff\4\41\164\uffff\42\41\1\uffff\5\41\1\uffff\2\41"+
            "\45\uffff\6\41\112\uffff\46\41\12\uffff\53\41\1\uffff\1\41\3"+
            "\uffff\132\41\5\uffff\104\41\5\uffff\122\41\6\uffff\111\41\1"+
            "\uffff\4\41\2\uffff\7\41\1\uffff\1\41\1\uffff\4\41\2\uffff\51"+
            "\41\1\uffff\4\41\2\uffff\41\41\1\uffff\4\41\2\uffff\7\41\1\uffff"+
            "\1\41\1\uffff\4\41\2\uffff\17\41\1\uffff\71\41\1\uffff\4\41"+
            "\2\uffff\103\41\45\uffff\20\41\20\uffff\125\41\14\uffff\u026c"+
            "\41\2\uffff\10\41\12\uffff\32\41\5\uffff\113\41\3\uffff\3\41"+
            "\17\uffff\15\41\1\uffff\4\41\16\uffff\22\41\16\uffff\22\41\16"+
            "\uffff\15\41\1\uffff\3\41\17\uffff\64\41\43\uffff\1\41\4\uffff"+
            "\1\41\103\uffff\130\41\10\uffff\51\41\127\uffff\35\41\63\uffff"+
            "\36\41\2\uffff\5\41\13\uffff\52\41\27\uffff\7\41\70\uffff\27"+
            "\41\u02e9\uffff\u00c0\41\100\uffff\u009c\41\4\uffff\132\41\6"+
            "\uffff\26\41\2\uffff\6\41\2\uffff\46\41\2\uffff\6\41\2\uffff"+
            "\10\41\1\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\37\41"+
            "\2\uffff\65\41\1\uffff\7\41\1\uffff\1\41\3\uffff\3\41\1\uffff"+
            "\7\41\3\uffff\4\41\2\uffff\6\41\4\uffff\15\41\5\uffff\3\41\1"+
            "\uffff\7\41\164\uffff\1\41\15\uffff\1\41\20\uffff\5\41\155\uffff"+
            "\1\41\4\uffff\1\41\2\uffff\12\41\1\uffff\1\41\2\uffff\6\41\6"+
            "\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\10\41\1\uffff"+
            "\7\41\2\uffff\4\41\5\uffff\5\41\26\uffff\44\41\u0a7c\uffff\57"+
            "\41\1\uffff\57\41\41\uffff\145\41\33\uffff\46\41\12\uffff\66"+
            "\41\11\uffff\1\41\20\uffff\27\41\11\uffff\7\41\1\uffff\7\41"+
            "\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff"+
            "\7\41\1\uffff\7\41\u0226\uffff\3\41\31\uffff\11\41\7\uffff\5"+
            "\41\2\uffff\5\41\4\uffff\126\41\4\uffff\5\41\1\uffff\132\41"+
            "\1\uffff\4\41\5\uffff\50\41\4\uffff\136\41\21\uffff\30\41\70"+
            "\uffff\20\41\u0200\uffff\u19b6\41\112\uffff\u51bc\41\104\uffff"+
            "\u048d\41\u0373\uffff\2\41\1\uffff\3\41\1\uffff\4\41\1\uffff"+
            "\27\41\u03dd\uffff\u2ba4\41\u215c\uffff\u012e\41\2\uffff\73"+
            "\41\5\uffff\152\41\46\uffff\7\41\14\uffff\5\41\5\uffff\1\41"+
            "\1\uffff\12\41\1\uffff\15\41\1\uffff\5\41\1\uffff\1\41\1\uffff"+
            "\2\41\1\uffff\2\41\1\uffff\154\41\41\uffff\u016b\41\22\uffff"+
            "\100\41\2\uffff\66\41\50\uffff\14\41\164\uffff\5\41\1\uffff"+
            "\u0087\41\44\uffff\32\41\6\uffff\32\41\13\uffff\131\41\3\uffff"+
            "\6\41\2\uffff\6\41\2\uffff\6\41\2\uffff\3\41",
            "\32\41\4\uffff\1\41\1\uffff\32\41\57\uffff\1\41\12\uffff\1"+
            "\41\4\uffff\1\41\5\uffff\27\41\1\uffff\37\41\1\uffff\u014a\41"+
            "\16\uffff\162\41\4\uffff\14\41\16\uffff\5\41\11\uffff\1\41\u008b"+
            "\uffff\1\41\13\uffff\1\41\1\uffff\3\41\1\uffff\1\41\1\uffff"+
            "\24\41\1\uffff\54\41\1\uffff\46\41\1\uffff\u008b\41\10\uffff"+
            "\105\41\1\uffff\52\41\6\uffff\20\41\41\uffff\46\41\2\uffff\1"+
            "\41\7\uffff\47\41\110\uffff\33\41\5\uffff\3\41\56\uffff\32\41"+
            "\5\uffff\13\41\43\uffff\2\41\1\uffff\143\41\1\uffff\1\41\17"+
            "\uffff\2\41\7\uffff\2\41\12\uffff\3\41\2\uffff\1\41\20\uffff"+
            "\1\41\1\uffff\36\41\35\uffff\41\41\22\uffff\46\41\13\uffff\1"+
            "\41\u0152\uffff\66\41\3\uffff\1\41\22\uffff\1\41\7\uffff\12"+
            "\41\33\uffff\1\41\7\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1"+
            "\uffff\7\41\1\uffff\1\41\3\uffff\4\41\3\uffff\1\41\20\uffff"+
            "\1\41\15\uffff\2\41\1\uffff\3\41\16\uffff\2\41\23\uffff\6\41"+
            "\4\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff\2\41\1\uffff"+
            "\2\41\1\uffff\2\41\37\uffff\4\41\1\uffff\1\41\23\uffff\3\41"+
            "\20\uffff\11\41\1\uffff\3\41\1\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\22\uffff\1\41\17\uffff\2\41"+
            "\43\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\36\uffff\2\41\1\uffff\3\41\17"+
            "\uffff\1\41\21\uffff\1\41\1\uffff\6\41\3\uffff\3\41\1\uffff"+
            "\4\41\3\uffff\2\41\1\uffff\1\41\1\uffff\2\41\3\uffff\2\41\3"+
            "\uffff\3\41\3\uffff\14\41\113\uffff\10\41\1\uffff\3\41\1\uffff"+
            "\27\41\1\uffff\12\41\1\uffff\5\41\46\uffff\2\41\43\uffff\10"+
            "\41\1\uffff\3\41\1\uffff\27\41\1\uffff\12\41\1\uffff\5\41\3"+
            "\uffff\1\41\40\uffff\1\41\1\uffff\2\41\43\uffff\10\41\1\uffff"+
            "\3\41\1\uffff\27\41\1\uffff\20\41\46\uffff\2\41\43\uffff\22"+
            "\41\3\uffff\30\41\1\uffff\11\41\1\uffff\1\41\2\uffff\7\41\72"+
            "\uffff\60\41\1\uffff\2\41\14\uffff\7\41\72\uffff\2\41\1\uffff"+
            "\1\41\2\uffff\2\41\1\uffff\1\41\2\uffff\1\41\6\uffff\4\41\1"+
            "\uffff\7\41\1\uffff\3\41\1\uffff\1\41\1\uffff\1\41\2\uffff\2"+
            "\41\1\uffff\4\41\1\uffff\2\41\11\uffff\1\41\2\uffff\5\41\1\uffff"+
            "\1\41\25\uffff\2\41\42\uffff\1\41\77\uffff\10\41\1\uffff\42"+
            "\41\35\uffff\4\41\164\uffff\42\41\1\uffff\5\41\1\uffff\2\41"+
            "\45\uffff\6\41\112\uffff\46\41\12\uffff\53\41\1\uffff\1\41\3"+
            "\uffff\132\41\5\uffff\104\41\5\uffff\122\41\6\uffff\111\41\1"+
            "\uffff\4\41\2\uffff\7\41\1\uffff\1\41\1\uffff\4\41\2\uffff\51"+
            "\41\1\uffff\4\41\2\uffff\41\41\1\uffff\4\41\2\uffff\7\41\1\uffff"+
            "\1\41\1\uffff\4\41\2\uffff\17\41\1\uffff\71\41\1\uffff\4\41"+
            "\2\uffff\103\41\45\uffff\20\41\20\uffff\125\41\14\uffff\u026c"+
            "\41\2\uffff\10\41\12\uffff\32\41\5\uffff\113\41\3\uffff\3\41"+
            "\17\uffff\15\41\1\uffff\4\41\16\uffff\22\41\16\uffff\22\41\16"+
            "\uffff\15\41\1\uffff\3\41\17\uffff\64\41\43\uffff\1\41\4\uffff"+
            "\1\41\103\uffff\130\41\10\uffff\51\41\127\uffff\35\41\63\uffff"+
            "\36\41\2\uffff\5\41\13\uffff\52\41\27\uffff\7\41\70\uffff\27"+
            "\41\u02e9\uffff\u00c0\41\100\uffff\u009c\41\4\uffff\132\41\6"+
            "\uffff\26\41\2\uffff\6\41\2\uffff\46\41\2\uffff\6\41\2\uffff"+
            "\10\41\1\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\37\41"+
            "\2\uffff\65\41\1\uffff\7\41\1\uffff\1\41\3\uffff\3\41\1\uffff"+
            "\7\41\3\uffff\4\41\2\uffff\6\41\4\uffff\15\41\5\uffff\3\41\1"+
            "\uffff\7\41\164\uffff\1\41\15\uffff\1\41\20\uffff\5\41\155\uffff"+
            "\1\41\4\uffff\1\41\2\uffff\12\41\1\uffff\1\41\2\uffff\6\41\6"+
            "\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\10\41\1\uffff"+
            "\7\41\2\uffff\4\41\5\uffff\5\41\26\uffff\44\41\u0a7c\uffff\57"+
            "\41\1\uffff\57\41\41\uffff\145\41\33\uffff\46\41\12\uffff\66"+
            "\41\11\uffff\1\41\20\uffff\27\41\11\uffff\7\41\1\uffff\7\41"+
            "\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff"+
            "\7\41\1\uffff\7\41\u0226\uffff\3\41\31\uffff\11\41\7\uffff\5"+
            "\41\2\uffff\5\41\4\uffff\126\41\4\uffff\5\41\1\uffff\132\41"+
            "\1\uffff\4\41\5\uffff\50\41\4\uffff\136\41\21\uffff\30\41\70"+
            "\uffff\20\41\u0200\uffff\u19b6\41\112\uffff\u51bc\41\104\uffff"+
            "\u048d\41\u0373\uffff\2\41\1\uffff\3\41\1\uffff\4\41\1\uffff"+
            "\27\41\u03dd\uffff\u2ba4\41\u215c\uffff\u012e\41\2\uffff\73"+
            "\41\5\uffff\152\41\46\uffff\7\41\14\uffff\5\41\5\uffff\1\41"+
            "\1\uffff\12\41\1\uffff\15\41\1\uffff\5\41\1\uffff\1\41\1\uffff"+
            "\2\41\1\uffff\2\41\1\uffff\154\41\41\uffff\u016b\41\22\uffff"+
            "\100\41\2\uffff\66\41\50\uffff\14\41\164\uffff\5\41\1\uffff"+
            "\u0087\41\44\uffff\32\41\6\uffff\32\41\13\uffff\131\41\3\uffff"+
            "\6\41\2\uffff\6\41\2\uffff\6\41\2\uffff\3\41",
            "\1\103",
            "\32\41\4\uffff\1\41\1\uffff\32\41\57\uffff\1\41\12\uffff\1"+
            "\41\4\uffff\1\41\5\uffff\27\41\1\uffff\37\41\1\uffff\u014a\41"+
            "\16\uffff\162\41\4\uffff\14\41\16\uffff\5\41\11\uffff\1\41\u008b"+
            "\uffff\1\41\13\uffff\1\41\1\uffff\3\41\1\uffff\1\41\1\uffff"+
            "\24\41\1\uffff\54\41\1\uffff\46\41\1\uffff\u008b\41\10\uffff"+
            "\105\41\1\uffff\52\41\6\uffff\20\41\41\uffff\46\41\2\uffff\1"+
            "\41\7\uffff\47\41\110\uffff\33\41\5\uffff\3\41\56\uffff\32\41"+
            "\5\uffff\13\41\43\uffff\2\41\1\uffff\143\41\1\uffff\1\41\17"+
            "\uffff\2\41\7\uffff\2\41\12\uffff\3\41\2\uffff\1\41\20\uffff"+
            "\1\41\1\uffff\36\41\35\uffff\41\41\22\uffff\46\41\13\uffff\1"+
            "\41\u0152\uffff\66\41\3\uffff\1\41\22\uffff\1\41\7\uffff\12"+
            "\41\33\uffff\1\41\7\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1"+
            "\uffff\7\41\1\uffff\1\41\3\uffff\4\41\3\uffff\1\41\20\uffff"+
            "\1\41\15\uffff\2\41\1\uffff\3\41\16\uffff\2\41\23\uffff\6\41"+
            "\4\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff\2\41\1\uffff"+
            "\2\41\1\uffff\2\41\37\uffff\4\41\1\uffff\1\41\23\uffff\3\41"+
            "\20\uffff\11\41\1\uffff\3\41\1\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\22\uffff\1\41\17\uffff\2\41"+
            "\43\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\36\uffff\2\41\1\uffff\3\41\17"+
            "\uffff\1\41\21\uffff\1\41\1\uffff\6\41\3\uffff\3\41\1\uffff"+
            "\4\41\3\uffff\2\41\1\uffff\1\41\1\uffff\2\41\3\uffff\2\41\3"+
            "\uffff\3\41\3\uffff\14\41\113\uffff\10\41\1\uffff\3\41\1\uffff"+
            "\27\41\1\uffff\12\41\1\uffff\5\41\46\uffff\2\41\43\uffff\10"+
            "\41\1\uffff\3\41\1\uffff\27\41\1\uffff\12\41\1\uffff\5\41\3"+
            "\uffff\1\41\40\uffff\1\41\1\uffff\2\41\43\uffff\10\41\1\uffff"+
            "\3\41\1\uffff\27\41\1\uffff\20\41\46\uffff\2\41\43\uffff\22"+
            "\41\3\uffff\30\41\1\uffff\11\41\1\uffff\1\41\2\uffff\7\41\72"+
            "\uffff\60\41\1\uffff\2\41\14\uffff\7\41\72\uffff\2\41\1\uffff"+
            "\1\41\2\uffff\2\41\1\uffff\1\41\2\uffff\1\41\6\uffff\4\41\1"+
            "\uffff\7\41\1\uffff\3\41\1\uffff\1\41\1\uffff\1\41\2\uffff\2"+
            "\41\1\uffff\4\41\1\uffff\2\41\11\uffff\1\41\2\uffff\5\41\1\uffff"+
            "\1\41\25\uffff\2\41\42\uffff\1\41\77\uffff\10\41\1\uffff\42"+
            "\41\35\uffff\4\41\164\uffff\42\41\1\uffff\5\41\1\uffff\2\41"+
            "\45\uffff\6\41\112\uffff\46\41\12\uffff\53\41\1\uffff\1\41\3"+
            "\uffff\132\41\5\uffff\104\41\5\uffff\122\41\6\uffff\111\41\1"+
            "\uffff\4\41\2\uffff\7\41\1\uffff\1\41\1\uffff\4\41\2\uffff\51"+
            "\41\1\uffff\4\41\2\uffff\41\41\1\uffff\4\41\2\uffff\7\41\1\uffff"+
            "\1\41\1\uffff\4\41\2\uffff\17\41\1\uffff\71\41\1\uffff\4\41"+
            "\2\uffff\103\41\45\uffff\20\41\20\uffff\125\41\14\uffff\u026c"+
            "\41\2\uffff\10\41\12\uffff\32\41\5\uffff\113\41\3\uffff\3\41"+
            "\17\uffff\15\41\1\uffff\4\41\16\uffff\22\41\16\uffff\22\41\16"+
            "\uffff\15\41\1\uffff\3\41\17\uffff\64\41\43\uffff\1\41\4\uffff"+
            "\1\41\103\uffff\130\41\10\uffff\51\41\127\uffff\35\41\63\uffff"+
            "\36\41\2\uffff\5\41\13\uffff\52\41\27\uffff\7\41\70\uffff\27"+
            "\41\u02e9\uffff\u00c0\41\100\uffff\u009c\41\4\uffff\132\41\6"+
            "\uffff\26\41\2\uffff\6\41\2\uffff\46\41\2\uffff\6\41\2\uffff"+
            "\10\41\1\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\37\41"+
            "\2\uffff\65\41\1\uffff\7\41\1\uffff\1\41\3\uffff\3\41\1\uffff"+
            "\7\41\3\uffff\4\41\2\uffff\6\41\4\uffff\15\41\5\uffff\3\41\1"+
            "\uffff\7\41\164\uffff\1\41\15\uffff\1\41\20\uffff\5\41\155\uffff"+
            "\1\41\4\uffff\1\41\2\uffff\12\41\1\uffff\1\41\2\uffff\6\41\6"+
            "\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\10\41\1\uffff"+
            "\7\41\2\uffff\4\41\5\uffff\5\41\26\uffff\44\41\u0a7c\uffff\57"+
            "\41\1\uffff\57\41\41\uffff\145\41\33\uffff\46\41\12\uffff\66"+
            "\41\11\uffff\1\41\20\uffff\27\41\11\uffff\7\41\1\uffff\7\41"+
            "\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff"+
            "\7\41\1\uffff\7\41\u0226\uffff\3\41\31\uffff\11\41\7\uffff\5"+
            "\41\2\uffff\5\41\4\uffff\126\41\4\uffff\5\41\1\uffff\132\41"+
            "\1\uffff\4\41\5\uffff\50\41\4\uffff\136\41\21\uffff\30\41\70"+
            "\uffff\20\41\u0200\uffff\u19b6\41\112\uffff\u51bc\41\104\uffff"+
            "\u048d\41\u0373\uffff\2\41\1\uffff\3\41\1\uffff\4\41\1\uffff"+
            "\27\41\u03dd\uffff\u2ba4\41\u215c\uffff\u012e\41\2\uffff\73"+
            "\41\5\uffff\152\41\46\uffff\7\41\14\uffff\5\41\5\uffff\1\41"+
            "\1\uffff\12\41\1\uffff\15\41\1\uffff\5\41\1\uffff\1\41\1\uffff"+
            "\2\41\1\uffff\2\41\1\uffff\154\41\41\uffff\u016b\41\22\uffff"+
            "\100\41\2\uffff\66\41\50\uffff\14\41\164\uffff\5\41\1\uffff"+
            "\u0087\41\44\uffff\32\41\6\uffff\32\41\13\uffff\131\41\3\uffff"+
            "\6\41\2\uffff\6\41\2\uffff\6\41\2\uffff\3\41",
            "",
            "",
            "",
            "",
            "\1\66\26\uffff\1\71\2\uffff\1\67",
            "\12\104\1\uffff\ufff5\104",
            "",
            "\1\66\26\uffff\1\71\2\uffff\1\67",
            "\1\72\1\70\1\uffff\2\70\22\uffff\1\73\2\uffff\1\34",
            "\1\72\1\70\1\uffff\2\70\22\uffff\1\73\2\uffff\1\34",
            "\12\75\1\uffff\66\75\32\74\4\75\1\74\1\75\32\74\57\75\1\74"+
            "\12\75\1\74\4\75\1\74\5\75\27\74\1\75\37\74\1\75\u014a\74\16"+
            "\75\162\74\4\75\14\74\16\75\5\74\11\75\1\74\u008b\75\1\74\13"+
            "\75\1\74\1\75\3\74\1\75\1\74\1\75\24\74\1\75\54\74\1\75\46\74"+
            "\1\75\u008b\74\10\75\105\74\1\75\52\74\6\75\20\74\41\75\46\74"+
            "\2\75\1\74\7\75\47\74\110\75\33\74\5\75\3\74\56\75\32\74\5\75"+
            "\13\74\43\75\2\74\1\75\143\74\1\75\1\74\17\75\2\74\7\75\2\74"+
            "\12\75\3\74\2\75\1\74\20\75\1\74\1\75\36\74\35\75\41\74\22\75"+
            "\46\74\13\75\1\74\u0152\75\66\74\3\75\1\74\22\75\1\74\7\75\12"+
            "\74\33\75\1\74\7\75\10\74\2\75\2\74\2\75\26\74\1\75\7\74\1\75"+
            "\1\74\3\75\4\74\3\75\1\74\20\75\1\74\15\75\2\74\1\75\3\74\16"+
            "\75\2\74\23\75\6\74\4\75\2\74\2\75\26\74\1\75\7\74\1\75\2\74"+
            "\1\75\2\74\1\75\2\74\37\75\4\74\1\75\1\74\23\75\3\74\20\75\11"+
            "\74\1\75\3\74\1\75\26\74\1\75\7\74\1\75\2\74\1\75\5\74\3\75"+
            "\1\74\22\75\1\74\17\75\2\74\43\75\10\74\2\75\2\74\2\75\26\74"+
            "\1\75\7\74\1\75\2\74\1\75\5\74\3\75\1\74\36\75\2\74\1\75\3\74"+
            "\17\75\1\74\21\75\1\74\1\75\6\74\3\75\3\74\1\75\4\74\3\75\2"+
            "\74\1\75\1\74\1\75\2\74\3\75\2\74\3\75\3\74\3\75\14\74\113\75"+
            "\10\74\1\75\3\74\1\75\27\74\1\75\12\74\1\75\5\74\46\75\2\74"+
            "\43\75\10\74\1\75\3\74\1\75\27\74\1\75\12\74\1\75\5\74\3\75"+
            "\1\74\40\75\1\74\1\75\2\74\43\75\10\74\1\75\3\74\1\75\27\74"+
            "\1\75\20\74\46\75\2\74\43\75\22\74\3\75\30\74\1\75\11\74\1\75"+
            "\1\74\2\75\7\74\72\75\60\74\1\75\2\74\14\75\7\74\72\75\2\74"+
            "\1\75\1\74\2\75\2\74\1\75\1\74\2\75\1\74\6\75\4\74\1\75\7\74"+
            "\1\75\3\74\1\75\1\74\1\75\1\74\2\75\2\74\1\75\4\74\1\75\2\74"+
            "\11\75\1\74\2\75\5\74\1\75\1\74\25\75\2\74\42\75\1\74\77\75"+
            "\10\74\1\75\42\74\35\75\4\74\164\75\42\74\1\75\5\74\1\75\2\74"+
            "\45\75\6\74\112\75\46\74\12\75\53\74\1\75\1\74\3\75\132\74\5"+
            "\75\104\74\5\75\122\74\6\75\111\74\1\75\4\74\2\75\7\74\1\75"+
            "\1\74\1\75\4\74\2\75\51\74\1\75\4\74\2\75\41\74\1\75\4\74\2"+
            "\75\7\74\1\75\1\74\1\75\4\74\2\75\17\74\1\75\71\74\1\75\4\74"+
            "\2\75\103\74\45\75\20\74\20\75\125\74\14\75\u026c\74\2\75\10"+
            "\74\12\75\32\74\5\75\113\74\3\75\3\74\17\75\15\74\1\75\4\74"+
            "\16\75\22\74\16\75\22\74\16\75\15\74\1\75\3\74\17\75\64\74\43"+
            "\75\1\74\4\75\1\74\103\75\130\74\10\75\51\74\127\75\35\74\63"+
            "\75\36\74\2\75\5\74\13\75\52\74\27\75\7\74\70\75\27\74\u02e9"+
            "\75\u00c0\74\100\75\u009c\74\4\75\132\74\6\75\26\74\2\75\6\74"+
            "\2\75\46\74\2\75\6\74\2\75\10\74\1\75\1\74\1\75\1\74\1\75\1"+
            "\74\1\75\37\74\2\75\65\74\1\75\7\74\1\75\1\74\3\75\3\74\1\75"+
            "\7\74\3\75\4\74\2\75\6\74\4\75\15\74\5\75\3\74\1\75\7\74\164"+
            "\75\1\74\15\75\1\74\20\75\5\74\155\75\1\74\4\75\1\74\2\75\12"+
            "\74\1\75\1\74\2\75\6\74\6\75\1\74\1\75\1\74\1\75\1\74\1\75\10"+
            "\74\1\75\7\74\2\75\4\74\5\75\5\74\26\75\44\74\u0a7c\75\57\74"+
            "\1\75\57\74\41\75\145\74\33\75\46\74\12\75\66\74\11\75\1\74"+
            "\20\75\27\74\11\75\7\74\1\75\7\74\1\75\7\74\1\75\7\74\1\75\7"+
            "\74\1\75\7\74\1\75\7\74\1\75\7\74\u0226\75\3\74\31\75\11\74"+
            "\7\75\5\74\2\75\5\74\4\75\126\74\4\75\5\74\1\75\132\74\1\75"+
            "\4\74\5\75\50\74\4\75\136\74\21\75\30\74\70\75\20\74\u0200\75"+
            "\u19b6\74\112\75\u51bc\74\104\75\u048d\74\u0373\75\2\74\1\75"+
            "\3\74\1\75\4\74\1\75\27\74\u03dd\75\u2ba4\74\u215c\75\u012e"+
            "\74\2\75\73\74\5\75\152\74\46\75\7\74\14\75\5\74\5\75\1\74\1"+
            "\75\12\74\1\75\15\74\1\75\5\74\1\75\1\74\1\75\2\74\1\75\2\74"+
            "\1\75\154\74\41\75\u016b\74\22\75\100\74\2\75\66\74\50\75\14"+
            "\74\164\75\5\74\1\75\u0087\74\44\75\32\74\6\75\32\74\13\75\131"+
            "\74\3\75\6\74\2\75\6\74\2\75\6\74\2\75\3\74\43\75",
            "",
            "\12\77\1\uffff\66\77\32\76\4\77\1\76\1\77\32\76\57\77\1\76"+
            "\12\77\1\76\4\77\1\76\5\77\27\76\1\77\37\76\1\77\u014a\76\16"+
            "\77\162\76\4\77\14\76\16\77\5\76\11\77\1\76\u008b\77\1\76\13"+
            "\77\1\76\1\77\3\76\1\77\1\76\1\77\24\76\1\77\54\76\1\77\46\76"+
            "\1\77\u008b\76\10\77\105\76\1\77\52\76\6\77\20\76\41\77\46\76"+
            "\2\77\1\76\7\77\47\76\110\77\33\76\5\77\3\76\56\77\32\76\5\77"+
            "\13\76\43\77\2\76\1\77\143\76\1\77\1\76\17\77\2\76\7\77\2\76"+
            "\12\77\3\76\2\77\1\76\20\77\1\76\1\77\36\76\35\77\41\76\22\77"+
            "\46\76\13\77\1\76\u0152\77\66\76\3\77\1\76\22\77\1\76\7\77\12"+
            "\76\33\77\1\76\7\77\10\76\2\77\2\76\2\77\26\76\1\77\7\76\1\77"+
            "\1\76\3\77\4\76\3\77\1\76\20\77\1\76\15\77\2\76\1\77\3\76\16"+
            "\77\2\76\23\77\6\76\4\77\2\76\2\77\26\76\1\77\7\76\1\77\2\76"+
            "\1\77\2\76\1\77\2\76\37\77\4\76\1\77\1\76\23\77\3\76\20\77\11"+
            "\76\1\77\3\76\1\77\26\76\1\77\7\76\1\77\2\76\1\77\5\76\3\77"+
            "\1\76\22\77\1\76\17\77\2\76\43\77\10\76\2\77\2\76\2\77\26\76"+
            "\1\77\7\76\1\77\2\76\1\77\5\76\3\77\1\76\36\77\2\76\1\77\3\76"+
            "\17\77\1\76\21\77\1\76\1\77\6\76\3\77\3\76\1\77\4\76\3\77\2"+
            "\76\1\77\1\76\1\77\2\76\3\77\2\76\3\77\3\76\3\77\14\76\113\77"+
            "\10\76\1\77\3\76\1\77\27\76\1\77\12\76\1\77\5\76\46\77\2\76"+
            "\43\77\10\76\1\77\3\76\1\77\27\76\1\77\12\76\1\77\5\76\3\77"+
            "\1\76\40\77\1\76\1\77\2\76\43\77\10\76\1\77\3\76\1\77\27\76"+
            "\1\77\20\76\46\77\2\76\43\77\22\76\3\77\30\76\1\77\11\76\1\77"+
            "\1\76\2\77\7\76\72\77\60\76\1\77\2\76\14\77\7\76\72\77\2\76"+
            "\1\77\1\76\2\77\2\76\1\77\1\76\2\77\1\76\6\77\4\76\1\77\7\76"+
            "\1\77\3\76\1\77\1\76\1\77\1\76\2\77\2\76\1\77\4\76\1\77\2\76"+
            "\11\77\1\76\2\77\5\76\1\77\1\76\25\77\2\76\42\77\1\76\77\77"+
            "\10\76\1\77\42\76\35\77\4\76\164\77\42\76\1\77\5\76\1\77\2\76"+
            "\45\77\6\76\112\77\46\76\12\77\53\76\1\77\1\76\3\77\132\76\5"+
            "\77\104\76\5\77\122\76\6\77\111\76\1\77\4\76\2\77\7\76\1\77"+
            "\1\76\1\77\4\76\2\77\51\76\1\77\4\76\2\77\41\76\1\77\4\76\2"+
            "\77\7\76\1\77\1\76\1\77\4\76\2\77\17\76\1\77\71\76\1\77\4\76"+
            "\2\77\103\76\45\77\20\76\20\77\125\76\14\77\u026c\76\2\77\10"+
            "\76\12\77\32\76\5\77\113\76\3\77\3\76\17\77\15\76\1\77\4\76"+
            "\16\77\22\76\16\77\22\76\16\77\15\76\1\77\3\76\17\77\64\76\43"+
            "\77\1\76\4\77\1\76\103\77\130\76\10\77\51\76\127\77\35\76\63"+
            "\77\36\76\2\77\5\76\13\77\52\76\27\77\7\76\70\77\27\76\u02e9"+
            "\77\u00c0\76\100\77\u009c\76\4\77\132\76\6\77\26\76\2\77\6\76"+
            "\2\77\46\76\2\77\6\76\2\77\10\76\1\77\1\76\1\77\1\76\1\77\1"+
            "\76\1\77\37\76\2\77\65\76\1\77\7\76\1\77\1\76\3\77\3\76\1\77"+
            "\7\76\3\77\4\76\2\77\6\76\4\77\15\76\5\77\3\76\1\77\7\76\164"+
            "\77\1\76\15\77\1\76\20\77\5\76\155\77\1\76\4\77\1\76\2\77\12"+
            "\76\1\77\1\76\2\77\6\76\6\77\1\76\1\77\1\76\1\77\1\76\1\77\10"+
            "\76\1\77\7\76\2\77\4\76\5\77\5\76\26\77\44\76\u0a7c\77\57\76"+
            "\1\77\57\76\41\77\145\76\33\77\46\76\12\77\66\76\11\77\1\76"+
            "\20\77\27\76\11\77\7\76\1\77\7\76\1\77\7\76\1\77\7\76\1\77\7"+
            "\76\1\77\7\76\1\77\7\76\1\77\7\76\u0226\77\3\76\31\77\11\76"+
            "\7\77\5\76\2\77\5\76\4\77\126\76\4\77\5\76\1\77\132\76\1\77"+
            "\4\76\5\77\50\76\4\77\136\76\21\77\30\76\70\77\20\76\u0200\77"+
            "\u19b6\76\112\77\u51bc\76\104\77\u048d\76\u0373\77\2\76\1\77"+
            "\3\76\1\77\4\76\1\77\27\76\u03dd\77\u2ba4\76\u215c\77\u012e"+
            "\76\2\77\73\76\5\77\152\76\46\77\7\76\14\77\5\76\5\77\1\76\1"+
            "\77\12\76\1\77\15\76\1\77\5\76\1\77\1\76\1\77\2\76\1\77\2\76"+
            "\1\77\154\76\41\77\u016b\76\22\77\100\76\2\77\66\76\50\77\14"+
            "\76\164\77\5\76\1\77\u0087\76\44\77\32\76\6\77\32\76\13\77\131"+
            "\76\3\77\6\76\2\77\6\76\2\77\6\76\2\77\3\76\43\77",
            "",
            "",
            "\32\41\4\uffff\1\41\1\uffff\32\41\57\uffff\1\41\12\uffff\1"+
            "\41\4\uffff\1\41\5\uffff\27\41\1\uffff\37\41\1\uffff\u014a\41"+
            "\16\uffff\162\41\4\uffff\14\41\16\uffff\5\41\11\uffff\1\41\u008b"+
            "\uffff\1\41\13\uffff\1\41\1\uffff\3\41\1\uffff\1\41\1\uffff"+
            "\24\41\1\uffff\54\41\1\uffff\46\41\1\uffff\u008b\41\10\uffff"+
            "\105\41\1\uffff\52\41\6\uffff\20\41\41\uffff\46\41\2\uffff\1"+
            "\41\7\uffff\47\41\110\uffff\33\41\5\uffff\3\41\56\uffff\32\41"+
            "\5\uffff\13\41\43\uffff\2\41\1\uffff\143\41\1\uffff\1\41\17"+
            "\uffff\2\41\7\uffff\2\41\12\uffff\3\41\2\uffff\1\41\20\uffff"+
            "\1\41\1\uffff\36\41\35\uffff\41\41\22\uffff\46\41\13\uffff\1"+
            "\41\u0152\uffff\66\41\3\uffff\1\41\22\uffff\1\41\7\uffff\12"+
            "\41\33\uffff\1\41\7\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1"+
            "\uffff\7\41\1\uffff\1\41\3\uffff\4\41\3\uffff\1\41\20\uffff"+
            "\1\41\15\uffff\2\41\1\uffff\3\41\16\uffff\2\41\23\uffff\6\41"+
            "\4\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff\2\41\1\uffff"+
            "\2\41\1\uffff\2\41\37\uffff\4\41\1\uffff\1\41\23\uffff\3\41"+
            "\20\uffff\11\41\1\uffff\3\41\1\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\22\uffff\1\41\17\uffff\2\41"+
            "\43\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\36\uffff\2\41\1\uffff\3\41\17"+
            "\uffff\1\41\21\uffff\1\41\1\uffff\6\41\3\uffff\3\41\1\uffff"+
            "\4\41\3\uffff\2\41\1\uffff\1\41\1\uffff\2\41\3\uffff\2\41\3"+
            "\uffff\3\41\3\uffff\14\41\113\uffff\10\41\1\uffff\3\41\1\uffff"+
            "\27\41\1\uffff\12\41\1\uffff\5\41\46\uffff\2\41\43\uffff\10"+
            "\41\1\uffff\3\41\1\uffff\27\41\1\uffff\12\41\1\uffff\5\41\3"+
            "\uffff\1\41\40\uffff\1\41\1\uffff\2\41\43\uffff\10\41\1\uffff"+
            "\3\41\1\uffff\27\41\1\uffff\20\41\46\uffff\2\41\43\uffff\22"+
            "\41\3\uffff\30\41\1\uffff\11\41\1\uffff\1\41\2\uffff\7\41\72"+
            "\uffff\60\41\1\uffff\2\41\14\uffff\7\41\72\uffff\2\41\1\uffff"+
            "\1\41\2\uffff\2\41\1\uffff\1\41\2\uffff\1\41\6\uffff\4\41\1"+
            "\uffff\7\41\1\uffff\3\41\1\uffff\1\41\1\uffff\1\41\2\uffff\2"+
            "\41\1\uffff\4\41\1\uffff\2\41\11\uffff\1\41\2\uffff\5\41\1\uffff"+
            "\1\41\25\uffff\2\41\42\uffff\1\41\77\uffff\10\41\1\uffff\42"+
            "\41\35\uffff\4\41\164\uffff\42\41\1\uffff\5\41\1\uffff\2\41"+
            "\45\uffff\6\41\112\uffff\46\41\12\uffff\53\41\1\uffff\1\41\3"+
            "\uffff\132\41\5\uffff\104\41\5\uffff\122\41\6\uffff\111\41\1"+
            "\uffff\4\41\2\uffff\7\41\1\uffff\1\41\1\uffff\4\41\2\uffff\51"+
            "\41\1\uffff\4\41\2\uffff\41\41\1\uffff\4\41\2\uffff\7\41\1\uffff"+
            "\1\41\1\uffff\4\41\2\uffff\17\41\1\uffff\71\41\1\uffff\4\41"+
            "\2\uffff\103\41\45\uffff\20\41\20\uffff\125\41\14\uffff\u026c"+
            "\41\2\uffff\10\41\12\uffff\32\41\5\uffff\113\41\3\uffff\3\41"+
            "\17\uffff\15\41\1\uffff\4\41\16\uffff\22\41\16\uffff\22\41\16"+
            "\uffff\15\41\1\uffff\3\41\17\uffff\64\41\43\uffff\1\41\4\uffff"+
            "\1\41\103\uffff\130\41\10\uffff\51\41\127\uffff\35\41\63\uffff"+
            "\36\41\2\uffff\5\41\13\uffff\52\41\27\uffff\7\41\70\uffff\27"+
            "\41\u02e9\uffff\u00c0\41\100\uffff\u009c\41\4\uffff\132\41\6"+
            "\uffff\26\41\2\uffff\6\41\2\uffff\46\41\2\uffff\6\41\2\uffff"+
            "\10\41\1\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\37\41"+
            "\2\uffff\65\41\1\uffff\7\41\1\uffff\1\41\3\uffff\3\41\1\uffff"+
            "\7\41\3\uffff\4\41\2\uffff\6\41\4\uffff\15\41\5\uffff\3\41\1"+
            "\uffff\7\41\164\uffff\1\41\15\uffff\1\41\20\uffff\5\41\155\uffff"+
            "\1\41\4\uffff\1\41\2\uffff\12\41\1\uffff\1\41\2\uffff\6\41\6"+
            "\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\10\41\1\uffff"+
            "\7\41\2\uffff\4\41\5\uffff\5\41\26\uffff\44\41\u0a7c\uffff\57"+
            "\41\1\uffff\57\41\41\uffff\145\41\33\uffff\46\41\12\uffff\66"+
            "\41\11\uffff\1\41\20\uffff\27\41\11\uffff\7\41\1\uffff\7\41"+
            "\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff"+
            "\7\41\1\uffff\7\41\u0226\uffff\3\41\31\uffff\11\41\7\uffff\5"+
            "\41\2\uffff\5\41\4\uffff\126\41\4\uffff\5\41\1\uffff\132\41"+
            "\1\uffff\4\41\5\uffff\50\41\4\uffff\136\41\21\uffff\30\41\70"+
            "\uffff\20\41\u0200\uffff\u19b6\41\112\uffff\u51bc\41\104\uffff"+
            "\u048d\41\u0373\uffff\2\41\1\uffff\3\41\1\uffff\4\41\1\uffff"+
            "\27\41\u03dd\uffff\u2ba4\41\u215c\uffff\u012e\41\2\uffff\73"+
            "\41\5\uffff\152\41\46\uffff\7\41\14\uffff\5\41\5\uffff\1\41"+
            "\1\uffff\12\41\1\uffff\15\41\1\uffff\5\41\1\uffff\1\41\1\uffff"+
            "\2\41\1\uffff\2\41\1\uffff\154\41\41\uffff\u016b\41\22\uffff"+
            "\100\41\2\uffff\66\41\50\uffff\14\41\164\uffff\5\41\1\uffff"+
            "\u0087\41\44\uffff\32\41\6\uffff\32\41\13\uffff\131\41\3\uffff"+
            "\6\41\2\uffff\6\41\2\uffff\6\41\2\uffff\3\41",
            "\1\uffff",
            "\32\41\4\uffff\1\41\1\uffff\32\41\57\uffff\1\41\12\uffff\1"+
            "\41\4\uffff\1\41\5\uffff\27\41\1\uffff\37\41\1\uffff\u014a\41"+
            "\16\uffff\162\41\4\uffff\14\41\16\uffff\5\41\11\uffff\1\41\u008b"+
            "\uffff\1\41\13\uffff\1\41\1\uffff\3\41\1\uffff\1\41\1\uffff"+
            "\24\41\1\uffff\54\41\1\uffff\46\41\1\uffff\u008b\41\10\uffff"+
            "\105\41\1\uffff\52\41\6\uffff\20\41\41\uffff\46\41\2\uffff\1"+
            "\41\7\uffff\47\41\110\uffff\33\41\5\uffff\3\41\56\uffff\32\41"+
            "\5\uffff\13\41\43\uffff\2\41\1\uffff\143\41\1\uffff\1\41\17"+
            "\uffff\2\41\7\uffff\2\41\12\uffff\3\41\2\uffff\1\41\20\uffff"+
            "\1\41\1\uffff\36\41\35\uffff\41\41\22\uffff\46\41\13\uffff\1"+
            "\41\u0152\uffff\66\41\3\uffff\1\41\22\uffff\1\41\7\uffff\12"+
            "\41\33\uffff\1\41\7\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1"+
            "\uffff\7\41\1\uffff\1\41\3\uffff\4\41\3\uffff\1\41\20\uffff"+
            "\1\41\15\uffff\2\41\1\uffff\3\41\16\uffff\2\41\23\uffff\6\41"+
            "\4\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff\2\41\1\uffff"+
            "\2\41\1\uffff\2\41\37\uffff\4\41\1\uffff\1\41\23\uffff\3\41"+
            "\20\uffff\11\41\1\uffff\3\41\1\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\22\uffff\1\41\17\uffff\2\41"+
            "\43\uffff\10\41\2\uffff\2\41\2\uffff\26\41\1\uffff\7\41\1\uffff"+
            "\2\41\1\uffff\5\41\3\uffff\1\41\36\uffff\2\41\1\uffff\3\41\17"+
            "\uffff\1\41\21\uffff\1\41\1\uffff\6\41\3\uffff\3\41\1\uffff"+
            "\4\41\3\uffff\2\41\1\uffff\1\41\1\uffff\2\41\3\uffff\2\41\3"+
            "\uffff\3\41\3\uffff\14\41\113\uffff\10\41\1\uffff\3\41\1\uffff"+
            "\27\41\1\uffff\12\41\1\uffff\5\41\46\uffff\2\41\43\uffff\10"+
            "\41\1\uffff\3\41\1\uffff\27\41\1\uffff\12\41\1\uffff\5\41\3"+
            "\uffff\1\41\40\uffff\1\41\1\uffff\2\41\43\uffff\10\41\1\uffff"+
            "\3\41\1\uffff\27\41\1\uffff\20\41\46\uffff\2\41\43\uffff\22"+
            "\41\3\uffff\30\41\1\uffff\11\41\1\uffff\1\41\2\uffff\7\41\72"+
            "\uffff\60\41\1\uffff\2\41\14\uffff\7\41\72\uffff\2\41\1\uffff"+
            "\1\41\2\uffff\2\41\1\uffff\1\41\2\uffff\1\41\6\uffff\4\41\1"+
            "\uffff\7\41\1\uffff\3\41\1\uffff\1\41\1\uffff\1\41\2\uffff\2"+
            "\41\1\uffff\4\41\1\uffff\2\41\11\uffff\1\41\2\uffff\5\41\1\uffff"+
            "\1\41\25\uffff\2\41\42\uffff\1\41\77\uffff\10\41\1\uffff\42"+
            "\41\35\uffff\4\41\164\uffff\42\41\1\uffff\5\41\1\uffff\2\41"+
            "\45\uffff\6\41\112\uffff\46\41\12\uffff\53\41\1\uffff\1\41\3"+
            "\uffff\132\41\5\uffff\104\41\5\uffff\122\41\6\uffff\111\41\1"+
            "\uffff\4\41\2\uffff\7\41\1\uffff\1\41\1\uffff\4\41\2\uffff\51"+
            "\41\1\uffff\4\41\2\uffff\41\41\1\uffff\4\41\2\uffff\7\41\1\uffff"+
            "\1\41\1\uffff\4\41\2\uffff\17\41\1\uffff\71\41\1\uffff\4\41"+
            "\2\uffff\103\41\45\uffff\20\41\20\uffff\125\41\14\uffff\u026c"+
            "\41\2\uffff\10\41\12\uffff\32\41\5\uffff\113\41\3\uffff\3\41"+
            "\17\uffff\15\41\1\uffff\4\41\16\uffff\22\41\16\uffff\22\41\16"+
            "\uffff\15\41\1\uffff\3\41\17\uffff\64\41\43\uffff\1\41\4\uffff"+
            "\1\41\103\uffff\130\41\10\uffff\51\41\127\uffff\35\41\63\uffff"+
            "\36\41\2\uffff\5\41\13\uffff\52\41\27\uffff\7\41\70\uffff\27"+
            "\41\u02e9\uffff\u00c0\41\100\uffff\u009c\41\4\uffff\132\41\6"+
            "\uffff\26\41\2\uffff\6\41\2\uffff\46\41\2\uffff\6\41\2\uffff"+
            "\10\41\1\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\37\41"+
            "\2\uffff\65\41\1\uffff\7\41\1\uffff\1\41\3\uffff\3\41\1\uffff"+
            "\7\41\3\uffff\4\41\2\uffff\6\41\4\uffff\15\41\5\uffff\3\41\1"+
            "\uffff\7\41\164\uffff\1\41\15\uffff\1\41\20\uffff\5\41\155\uffff"+
            "\1\41\4\uffff\1\41\2\uffff\12\41\1\uffff\1\41\2\uffff\6\41\6"+
            "\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\10\41\1\uffff"+
            "\7\41\2\uffff\4\41\5\uffff\5\41\26\uffff\44\41\u0a7c\uffff\57"+
            "\41\1\uffff\57\41\41\uffff\145\41\33\uffff\46\41\12\uffff\66"+
            "\41\11\uffff\1\41\20\uffff\27\41\11\uffff\7\41\1\uffff\7\41"+
            "\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff\7\41\1\uffff"+
            "\7\41\1\uffff\7\41\u0226\uffff\3\41\31\uffff\11\41\7\uffff\5"+
            "\41\2\uffff\5\41\4\uffff\126\41\4\uffff\5\41\1\uffff\132\41"+
            "\1\uffff\4\41\5\uffff\50\41\4\uffff\136\41\21\uffff\30\41\70"+
            "\uffff\20\41\u0200\uffff\u19b6\41\112\uffff\u51bc\41\104\uffff"+
            "\u048d\41\u0373\uffff\2\41\1\uffff\3\41\1\uffff\4\41\1\uffff"+
            "\27\41\u03dd\uffff\u2ba4\41\u215c\uffff\u012e\41\2\uffff\73"+
            "\41\5\uffff\152\41\46\uffff\7\41\14\uffff\5\41\5\uffff\1\41"+
            "\1\uffff\12\41\1\uffff\15\41\1\uffff\5\41\1\uffff\1\41\1\uffff"+
            "\2\41\1\uffff\2\41\1\uffff\154\41\41\uffff\u016b\41\22\uffff"+
            "\100\41\2\uffff\66\41\50\uffff\14\41\164\uffff\5\41\1\uffff"+
            "\u0087\41\44\uffff\32\41\6\uffff\32\41\13\uffff\131\41\3\uffff"+
            "\6\41\2\uffff\6\41\2\uffff\6\41\2\uffff\3\41",
            "\12\104\1\uffff\ufff5\104",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( BOM | FEATURE_DEF | SCENARIO_DEF | WHEN | ELSE | ELIF | STEP | NOT | ADD | SUB | MUL | DIV | MOD | LPAREN | RPAREN | OR | AND | COP | EOP | SOP | COLON | EQUAL | COMMENTS | NEWLINE | PIPE | STRING | VARIABLE | FLOAT | WHITE | IDENTIFIER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_55 = input.LA(1);

                        s = -1;
                        if ( ((LA47_55 >= '\u0000' && LA47_55 <= '\t')||(LA47_55 >= '\u000B' && LA47_55 <= '\uFFFF')) ) {s = 68;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA47_6 = input.LA(1);

                         
                        int index47_6 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA47_6 >= '\u0000' && LA47_6 <= '\t')||(LA47_6 >= '\u000B' && LA47_6 <= '\uFFFF')) && (( !_seeWord ))) {s = 39;}

                        else s = 38;

                         
                        input.seek(index47_6);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA47_62 = input.LA(1);

                         
                        int index47_62 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA47_62 >= 'A' && LA47_62 <= 'Z')||LA47_62=='_'||(LA47_62 >= 'a' && LA47_62 <= 'z')||LA47_62=='\u00AA'||LA47_62=='\u00B5'||LA47_62=='\u00BA'||(LA47_62 >= '\u00C0' && LA47_62 <= '\u00D6')||(LA47_62 >= '\u00D8' && LA47_62 <= '\u00F6')||(LA47_62 >= '\u00F8' && LA47_62 <= '\u0241')||(LA47_62 >= '\u0250' && LA47_62 <= '\u02C1')||(LA47_62 >= '\u02C6' && LA47_62 <= '\u02D1')||(LA47_62 >= '\u02E0' && LA47_62 <= '\u02E4')||LA47_62=='\u02EE'||LA47_62=='\u037A'||LA47_62=='\u0386'||(LA47_62 >= '\u0388' && LA47_62 <= '\u038A')||LA47_62=='\u038C'||(LA47_62 >= '\u038E' && LA47_62 <= '\u03A1')||(LA47_62 >= '\u03A3' && LA47_62 <= '\u03CE')||(LA47_62 >= '\u03D0' && LA47_62 <= '\u03F5')||(LA47_62 >= '\u03F7' && LA47_62 <= '\u0481')||(LA47_62 >= '\u048A' && LA47_62 <= '\u04CE')||(LA47_62 >= '\u04D0' && LA47_62 <= '\u04F9')||(LA47_62 >= '\u0500' && LA47_62 <= '\u050F')||(LA47_62 >= '\u0531' && LA47_62 <= '\u0556')||LA47_62=='\u0559'||(LA47_62 >= '\u0561' && LA47_62 <= '\u0587')||(LA47_62 >= '\u05D0' && LA47_62 <= '\u05EA')||(LA47_62 >= '\u05F0' && LA47_62 <= '\u05F2')||(LA47_62 >= '\u0621' && LA47_62 <= '\u063A')||(LA47_62 >= '\u0640' && LA47_62 <= '\u064A')||(LA47_62 >= '\u066E' && LA47_62 <= '\u066F')||(LA47_62 >= '\u0671' && LA47_62 <= '\u06D3')||LA47_62=='\u06D5'||(LA47_62 >= '\u06E5' && LA47_62 <= '\u06E6')||(LA47_62 >= '\u06EE' && LA47_62 <= '\u06EF')||(LA47_62 >= '\u06FA' && LA47_62 <= '\u06FC')||LA47_62=='\u06FF'||LA47_62=='\u0710'||(LA47_62 >= '\u0712' && LA47_62 <= '\u072F')||(LA47_62 >= '\u074D' && LA47_62 <= '\u076D')||(LA47_62 >= '\u0780' && LA47_62 <= '\u07A5')||LA47_62=='\u07B1'||(LA47_62 >= '\u0904' && LA47_62 <= '\u0939')||LA47_62=='\u093D'||LA47_62=='\u0950'||(LA47_62 >= '\u0958' && LA47_62 <= '\u0961')||LA47_62=='\u097D'||(LA47_62 >= '\u0985' && LA47_62 <= '\u098C')||(LA47_62 >= '\u098F' && LA47_62 <= '\u0990')||(LA47_62 >= '\u0993' && LA47_62 <= '\u09A8')||(LA47_62 >= '\u09AA' && LA47_62 <= '\u09B0')||LA47_62=='\u09B2'||(LA47_62 >= '\u09B6' && LA47_62 <= '\u09B9')||LA47_62=='\u09BD'||LA47_62=='\u09CE'||(LA47_62 >= '\u09DC' && LA47_62 <= '\u09DD')||(LA47_62 >= '\u09DF' && LA47_62 <= '\u09E1')||(LA47_62 >= '\u09F0' && LA47_62 <= '\u09F1')||(LA47_62 >= '\u0A05' && LA47_62 <= '\u0A0A')||(LA47_62 >= '\u0A0F' && LA47_62 <= '\u0A10')||(LA47_62 >= '\u0A13' && LA47_62 <= '\u0A28')||(LA47_62 >= '\u0A2A' && LA47_62 <= '\u0A30')||(LA47_62 >= '\u0A32' && LA47_62 <= '\u0A33')||(LA47_62 >= '\u0A35' && LA47_62 <= '\u0A36')||(LA47_62 >= '\u0A38' && LA47_62 <= '\u0A39')||(LA47_62 >= '\u0A59' && LA47_62 <= '\u0A5C')||LA47_62=='\u0A5E'||(LA47_62 >= '\u0A72' && LA47_62 <= '\u0A74')||(LA47_62 >= '\u0A85' && LA47_62 <= '\u0A8D')||(LA47_62 >= '\u0A8F' && LA47_62 <= '\u0A91')||(LA47_62 >= '\u0A93' && LA47_62 <= '\u0AA8')||(LA47_62 >= '\u0AAA' && LA47_62 <= '\u0AB0')||(LA47_62 >= '\u0AB2' && LA47_62 <= '\u0AB3')||(LA47_62 >= '\u0AB5' && LA47_62 <= '\u0AB9')||LA47_62=='\u0ABD'||LA47_62=='\u0AD0'||(LA47_62 >= '\u0AE0' && LA47_62 <= '\u0AE1')||(LA47_62 >= '\u0B05' && LA47_62 <= '\u0B0C')||(LA47_62 >= '\u0B0F' && LA47_62 <= '\u0B10')||(LA47_62 >= '\u0B13' && LA47_62 <= '\u0B28')||(LA47_62 >= '\u0B2A' && LA47_62 <= '\u0B30')||(LA47_62 >= '\u0B32' && LA47_62 <= '\u0B33')||(LA47_62 >= '\u0B35' && LA47_62 <= '\u0B39')||LA47_62=='\u0B3D'||(LA47_62 >= '\u0B5C' && LA47_62 <= '\u0B5D')||(LA47_62 >= '\u0B5F' && LA47_62 <= '\u0B61')||LA47_62=='\u0B71'||LA47_62=='\u0B83'||(LA47_62 >= '\u0B85' && LA47_62 <= '\u0B8A')||(LA47_62 >= '\u0B8E' && LA47_62 <= '\u0B90')||(LA47_62 >= '\u0B92' && LA47_62 <= '\u0B95')||(LA47_62 >= '\u0B99' && LA47_62 <= '\u0B9A')||LA47_62=='\u0B9C'||(LA47_62 >= '\u0B9E' && LA47_62 <= '\u0B9F')||(LA47_62 >= '\u0BA3' && LA47_62 <= '\u0BA4')||(LA47_62 >= '\u0BA8' && LA47_62 <= '\u0BAA')||(LA47_62 >= '\u0BAE' && LA47_62 <= '\u0BB9')||(LA47_62 >= '\u0C05' && LA47_62 <= '\u0C0C')||(LA47_62 >= '\u0C0E' && LA47_62 <= '\u0C10')||(LA47_62 >= '\u0C12' && LA47_62 <= '\u0C28')||(LA47_62 >= '\u0C2A' && LA47_62 <= '\u0C33')||(LA47_62 >= '\u0C35' && LA47_62 <= '\u0C39')||(LA47_62 >= '\u0C60' && LA47_62 <= '\u0C61')||(LA47_62 >= '\u0C85' && LA47_62 <= '\u0C8C')||(LA47_62 >= '\u0C8E' && LA47_62 <= '\u0C90')||(LA47_62 >= '\u0C92' && LA47_62 <= '\u0CA8')||(LA47_62 >= '\u0CAA' && LA47_62 <= '\u0CB3')||(LA47_62 >= '\u0CB5' && LA47_62 <= '\u0CB9')||LA47_62=='\u0CBD'||LA47_62=='\u0CDE'||(LA47_62 >= '\u0CE0' && LA47_62 <= '\u0CE1')||(LA47_62 >= '\u0D05' && LA47_62 <= '\u0D0C')||(LA47_62 >= '\u0D0E' && LA47_62 <= '\u0D10')||(LA47_62 >= '\u0D12' && LA47_62 <= '\u0D28')||(LA47_62 >= '\u0D2A' && LA47_62 <= '\u0D39')||(LA47_62 >= '\u0D60' && LA47_62 <= '\u0D61')||(LA47_62 >= '\u0D85' && LA47_62 <= '\u0D96')||(LA47_62 >= '\u0D9A' && LA47_62 <= '\u0DB1')||(LA47_62 >= '\u0DB3' && LA47_62 <= '\u0DBB')||LA47_62=='\u0DBD'||(LA47_62 >= '\u0DC0' && LA47_62 <= '\u0DC6')||(LA47_62 >= '\u0E01' && LA47_62 <= '\u0E30')||(LA47_62 >= '\u0E32' && LA47_62 <= '\u0E33')||(LA47_62 >= '\u0E40' && LA47_62 <= '\u0E46')||(LA47_62 >= '\u0E81' && LA47_62 <= '\u0E82')||LA47_62=='\u0E84'||(LA47_62 >= '\u0E87' && LA47_62 <= '\u0E88')||LA47_62=='\u0E8A'||LA47_62=='\u0E8D'||(LA47_62 >= '\u0E94' && LA47_62 <= '\u0E97')||(LA47_62 >= '\u0E99' && LA47_62 <= '\u0E9F')||(LA47_62 >= '\u0EA1' && LA47_62 <= '\u0EA3')||LA47_62=='\u0EA5'||LA47_62=='\u0EA7'||(LA47_62 >= '\u0EAA' && LA47_62 <= '\u0EAB')||(LA47_62 >= '\u0EAD' && LA47_62 <= '\u0EB0')||(LA47_62 >= '\u0EB2' && LA47_62 <= '\u0EB3')||LA47_62=='\u0EBD'||(LA47_62 >= '\u0EC0' && LA47_62 <= '\u0EC4')||LA47_62=='\u0EC6'||(LA47_62 >= '\u0EDC' && LA47_62 <= '\u0EDD')||LA47_62=='\u0F00'||(LA47_62 >= '\u0F40' && LA47_62 <= '\u0F47')||(LA47_62 >= '\u0F49' && LA47_62 <= '\u0F6A')||(LA47_62 >= '\u0F88' && LA47_62 <= '\u0F8B')||(LA47_62 >= '\u1000' && LA47_62 <= '\u1021')||(LA47_62 >= '\u1023' && LA47_62 <= '\u1027')||(LA47_62 >= '\u1029' && LA47_62 <= '\u102A')||(LA47_62 >= '\u1050' && LA47_62 <= '\u1055')||(LA47_62 >= '\u10A0' && LA47_62 <= '\u10C5')||(LA47_62 >= '\u10D0' && LA47_62 <= '\u10FA')||LA47_62=='\u10FC'||(LA47_62 >= '\u1100' && LA47_62 <= '\u1159')||(LA47_62 >= '\u115F' && LA47_62 <= '\u11A2')||(LA47_62 >= '\u11A8' && LA47_62 <= '\u11F9')||(LA47_62 >= '\u1200' && LA47_62 <= '\u1248')||(LA47_62 >= '\u124A' && LA47_62 <= '\u124D')||(LA47_62 >= '\u1250' && LA47_62 <= '\u1256')||LA47_62=='\u1258'||(LA47_62 >= '\u125A' && LA47_62 <= '\u125D')||(LA47_62 >= '\u1260' && LA47_62 <= '\u1288')||(LA47_62 >= '\u128A' && LA47_62 <= '\u128D')||(LA47_62 >= '\u1290' && LA47_62 <= '\u12B0')||(LA47_62 >= '\u12B2' && LA47_62 <= '\u12B5')||(LA47_62 >= '\u12B8' && LA47_62 <= '\u12BE')||LA47_62=='\u12C0'||(LA47_62 >= '\u12C2' && LA47_62 <= '\u12C5')||(LA47_62 >= '\u12C8' && LA47_62 <= '\u12D6')||(LA47_62 >= '\u12D8' && LA47_62 <= '\u1310')||(LA47_62 >= '\u1312' && LA47_62 <= '\u1315')||(LA47_62 >= '\u1318' && LA47_62 <= '\u135A')||(LA47_62 >= '\u1380' && LA47_62 <= '\u138F')||(LA47_62 >= '\u13A0' && LA47_62 <= '\u13F4')||(LA47_62 >= '\u1401' && LA47_62 <= '\u166C')||(LA47_62 >= '\u166F' && LA47_62 <= '\u1676')||(LA47_62 >= '\u1681' && LA47_62 <= '\u169A')||(LA47_62 >= '\u16A0' && LA47_62 <= '\u16EA')||(LA47_62 >= '\u16EE' && LA47_62 <= '\u16F0')||(LA47_62 >= '\u1700' && LA47_62 <= '\u170C')||(LA47_62 >= '\u170E' && LA47_62 <= '\u1711')||(LA47_62 >= '\u1720' && LA47_62 <= '\u1731')||(LA47_62 >= '\u1740' && LA47_62 <= '\u1751')||(LA47_62 >= '\u1760' && LA47_62 <= '\u176C')||(LA47_62 >= '\u176E' && LA47_62 <= '\u1770')||(LA47_62 >= '\u1780' && LA47_62 <= '\u17B3')||LA47_62=='\u17D7'||LA47_62=='\u17DC'||(LA47_62 >= '\u1820' && LA47_62 <= '\u1877')||(LA47_62 >= '\u1880' && LA47_62 <= '\u18A8')||(LA47_62 >= '\u1900' && LA47_62 <= '\u191C')||(LA47_62 >= '\u1950' && LA47_62 <= '\u196D')||(LA47_62 >= '\u1970' && LA47_62 <= '\u1974')||(LA47_62 >= '\u1980' && LA47_62 <= '\u19A9')||(LA47_62 >= '\u19C1' && LA47_62 <= '\u19C7')||(LA47_62 >= '\u1A00' && LA47_62 <= '\u1A16')||(LA47_62 >= '\u1D00' && LA47_62 <= '\u1DBF')||(LA47_62 >= '\u1E00' && LA47_62 <= '\u1E9B')||(LA47_62 >= '\u1EA0' && LA47_62 <= '\u1EF9')||(LA47_62 >= '\u1F00' && LA47_62 <= '\u1F15')||(LA47_62 >= '\u1F18' && LA47_62 <= '\u1F1D')||(LA47_62 >= '\u1F20' && LA47_62 <= '\u1F45')||(LA47_62 >= '\u1F48' && LA47_62 <= '\u1F4D')||(LA47_62 >= '\u1F50' && LA47_62 <= '\u1F57')||LA47_62=='\u1F59'||LA47_62=='\u1F5B'||LA47_62=='\u1F5D'||(LA47_62 >= '\u1F5F' && LA47_62 <= '\u1F7D')||(LA47_62 >= '\u1F80' && LA47_62 <= '\u1FB4')||(LA47_62 >= '\u1FB6' && LA47_62 <= '\u1FBC')||LA47_62=='\u1FBE'||(LA47_62 >= '\u1FC2' && LA47_62 <= '\u1FC4')||(LA47_62 >= '\u1FC6' && LA47_62 <= '\u1FCC')||(LA47_62 >= '\u1FD0' && LA47_62 <= '\u1FD3')||(LA47_62 >= '\u1FD6' && LA47_62 <= '\u1FDB')||(LA47_62 >= '\u1FE0' && LA47_62 <= '\u1FEC')||(LA47_62 >= '\u1FF2' && LA47_62 <= '\u1FF4')||(LA47_62 >= '\u1FF6' && LA47_62 <= '\u1FFC')||LA47_62=='\u2071'||LA47_62=='\u207F'||(LA47_62 >= '\u2090' && LA47_62 <= '\u2094')||LA47_62=='\u2102'||LA47_62=='\u2107'||(LA47_62 >= '\u210A' && LA47_62 <= '\u2113')||LA47_62=='\u2115'||(LA47_62 >= '\u2118' && LA47_62 <= '\u211D')||LA47_62=='\u2124'||LA47_62=='\u2126'||LA47_62=='\u2128'||(LA47_62 >= '\u212A' && LA47_62 <= '\u2131')||(LA47_62 >= '\u2133' && LA47_62 <= '\u2139')||(LA47_62 >= '\u213C' && LA47_62 <= '\u213F')||(LA47_62 >= '\u2145' && LA47_62 <= '\u2149')||(LA47_62 >= '\u2160' && LA47_62 <= '\u2183')||(LA47_62 >= '\u2C00' && LA47_62 <= '\u2C2E')||(LA47_62 >= '\u2C30' && LA47_62 <= '\u2C5E')||(LA47_62 >= '\u2C80' && LA47_62 <= '\u2CE4')||(LA47_62 >= '\u2D00' && LA47_62 <= '\u2D25')||(LA47_62 >= '\u2D30' && LA47_62 <= '\u2D65')||LA47_62=='\u2D6F'||(LA47_62 >= '\u2D80' && LA47_62 <= '\u2D96')||(LA47_62 >= '\u2DA0' && LA47_62 <= '\u2DA6')||(LA47_62 >= '\u2DA8' && LA47_62 <= '\u2DAE')||(LA47_62 >= '\u2DB0' && LA47_62 <= '\u2DB6')||(LA47_62 >= '\u2DB8' && LA47_62 <= '\u2DBE')||(LA47_62 >= '\u2DC0' && LA47_62 <= '\u2DC6')||(LA47_62 >= '\u2DC8' && LA47_62 <= '\u2DCE')||(LA47_62 >= '\u2DD0' && LA47_62 <= '\u2DD6')||(LA47_62 >= '\u2DD8' && LA47_62 <= '\u2DDE')||(LA47_62 >= '\u3005' && LA47_62 <= '\u3007')||(LA47_62 >= '\u3021' && LA47_62 <= '\u3029')||(LA47_62 >= '\u3031' && LA47_62 <= '\u3035')||(LA47_62 >= '\u3038' && LA47_62 <= '\u303C')||(LA47_62 >= '\u3041' && LA47_62 <= '\u3096')||(LA47_62 >= '\u309B' && LA47_62 <= '\u309F')||(LA47_62 >= '\u30A1' && LA47_62 <= '\u30FA')||(LA47_62 >= '\u30FC' && LA47_62 <= '\u30FF')||(LA47_62 >= '\u3105' && LA47_62 <= '\u312C')||(LA47_62 >= '\u3131' && LA47_62 <= '\u318E')||(LA47_62 >= '\u31A0' && LA47_62 <= '\u31B7')||(LA47_62 >= '\u31F0' && LA47_62 <= '\u31FF')||(LA47_62 >= '\u3400' && LA47_62 <= '\u4DB5')||(LA47_62 >= '\u4E00' && LA47_62 <= '\u9FBB')||(LA47_62 >= '\uA000' && LA47_62 <= '\uA48C')||(LA47_62 >= '\uA800' && LA47_62 <= '\uA801')||(LA47_62 >= '\uA803' && LA47_62 <= '\uA805')||(LA47_62 >= '\uA807' && LA47_62 <= '\uA80A')||(LA47_62 >= '\uA80C' && LA47_62 <= '\uA822')||(LA47_62 >= '\uAC00' && LA47_62 <= '\uD7A3')||(LA47_62 >= '\uF900' && LA47_62 <= '\uFA2D')||(LA47_62 >= '\uFA30' && LA47_62 <= '\uFA6A')||(LA47_62 >= '\uFA70' && LA47_62 <= '\uFAD9')||(LA47_62 >= '\uFB00' && LA47_62 <= '\uFB06')||(LA47_62 >= '\uFB13' && LA47_62 <= '\uFB17')||LA47_62=='\uFB1D'||(LA47_62 >= '\uFB1F' && LA47_62 <= '\uFB28')||(LA47_62 >= '\uFB2A' && LA47_62 <= '\uFB36')||(LA47_62 >= '\uFB38' && LA47_62 <= '\uFB3C')||LA47_62=='\uFB3E'||(LA47_62 >= '\uFB40' && LA47_62 <= '\uFB41')||(LA47_62 >= '\uFB43' && LA47_62 <= '\uFB44')||(LA47_62 >= '\uFB46' && LA47_62 <= '\uFBB1')||(LA47_62 >= '\uFBD3' && LA47_62 <= '\uFD3D')||(LA47_62 >= '\uFD50' && LA47_62 <= '\uFD8F')||(LA47_62 >= '\uFD92' && LA47_62 <= '\uFDC7')||(LA47_62 >= '\uFDF0' && LA47_62 <= '\uFDFB')||(LA47_62 >= '\uFE70' && LA47_62 <= '\uFE74')||(LA47_62 >= '\uFE76' && LA47_62 <= '\uFEFC')||(LA47_62 >= '\uFF21' && LA47_62 <= '\uFF3A')||(LA47_62 >= '\uFF41' && LA47_62 <= '\uFF5A')||(LA47_62 >= '\uFF66' && LA47_62 <= '\uFFBE')||(LA47_62 >= '\uFFC2' && LA47_62 <= '\uFFC7')||(LA47_62 >= '\uFFCA' && LA47_62 <= '\uFFCF')||(LA47_62 >= '\uFFD2' && LA47_62 <= '\uFFD7')||(LA47_62 >= '\uFFDA' && LA47_62 <= '\uFFDC')) ) {s = 62;}

                        else if ( ((LA47_62 >= '\u0000' && LA47_62 <= '\t')||(LA47_62 >= '\u000B' && LA47_62 <= '@')||(LA47_62 >= '[' && LA47_62 <= '^')||LA47_62=='`'||(LA47_62 >= '{' && LA47_62 <= '\u00A9')||(LA47_62 >= '\u00AB' && LA47_62 <= '\u00B4')||(LA47_62 >= '\u00B6' && LA47_62 <= '\u00B9')||(LA47_62 >= '\u00BB' && LA47_62 <= '\u00BF')||LA47_62=='\u00D7'||LA47_62=='\u00F7'||(LA47_62 >= '\u0242' && LA47_62 <= '\u024F')||(LA47_62 >= '\u02C2' && LA47_62 <= '\u02C5')||(LA47_62 >= '\u02D2' && LA47_62 <= '\u02DF')||(LA47_62 >= '\u02E5' && LA47_62 <= '\u02ED')||(LA47_62 >= '\u02EF' && LA47_62 <= '\u0379')||(LA47_62 >= '\u037B' && LA47_62 <= '\u0385')||LA47_62=='\u0387'||LA47_62=='\u038B'||LA47_62=='\u038D'||LA47_62=='\u03A2'||LA47_62=='\u03CF'||LA47_62=='\u03F6'||(LA47_62 >= '\u0482' && LA47_62 <= '\u0489')||LA47_62=='\u04CF'||(LA47_62 >= '\u04FA' && LA47_62 <= '\u04FF')||(LA47_62 >= '\u0510' && LA47_62 <= '\u0530')||(LA47_62 >= '\u0557' && LA47_62 <= '\u0558')||(LA47_62 >= '\u055A' && LA47_62 <= '\u0560')||(LA47_62 >= '\u0588' && LA47_62 <= '\u05CF')||(LA47_62 >= '\u05EB' && LA47_62 <= '\u05EF')||(LA47_62 >= '\u05F3' && LA47_62 <= '\u0620')||(LA47_62 >= '\u063B' && LA47_62 <= '\u063F')||(LA47_62 >= '\u064B' && LA47_62 <= '\u066D')||LA47_62=='\u0670'||LA47_62=='\u06D4'||(LA47_62 >= '\u06D6' && LA47_62 <= '\u06E4')||(LA47_62 >= '\u06E7' && LA47_62 <= '\u06ED')||(LA47_62 >= '\u06F0' && LA47_62 <= '\u06F9')||(LA47_62 >= '\u06FD' && LA47_62 <= '\u06FE')||(LA47_62 >= '\u0700' && LA47_62 <= '\u070F')||LA47_62=='\u0711'||(LA47_62 >= '\u0730' && LA47_62 <= '\u074C')||(LA47_62 >= '\u076E' && LA47_62 <= '\u077F')||(LA47_62 >= '\u07A6' && LA47_62 <= '\u07B0')||(LA47_62 >= '\u07B2' && LA47_62 <= '\u0903')||(LA47_62 >= '\u093A' && LA47_62 <= '\u093C')||(LA47_62 >= '\u093E' && LA47_62 <= '\u094F')||(LA47_62 >= '\u0951' && LA47_62 <= '\u0957')||(LA47_62 >= '\u0962' && LA47_62 <= '\u097C')||(LA47_62 >= '\u097E' && LA47_62 <= '\u0984')||(LA47_62 >= '\u098D' && LA47_62 <= '\u098E')||(LA47_62 >= '\u0991' && LA47_62 <= '\u0992')||LA47_62=='\u09A9'||LA47_62=='\u09B1'||(LA47_62 >= '\u09B3' && LA47_62 <= '\u09B5')||(LA47_62 >= '\u09BA' && LA47_62 <= '\u09BC')||(LA47_62 >= '\u09BE' && LA47_62 <= '\u09CD')||(LA47_62 >= '\u09CF' && LA47_62 <= '\u09DB')||LA47_62=='\u09DE'||(LA47_62 >= '\u09E2' && LA47_62 <= '\u09EF')||(LA47_62 >= '\u09F2' && LA47_62 <= '\u0A04')||(LA47_62 >= '\u0A0B' && LA47_62 <= '\u0A0E')||(LA47_62 >= '\u0A11' && LA47_62 <= '\u0A12')||LA47_62=='\u0A29'||LA47_62=='\u0A31'||LA47_62=='\u0A34'||LA47_62=='\u0A37'||(LA47_62 >= '\u0A3A' && LA47_62 <= '\u0A58')||LA47_62=='\u0A5D'||(LA47_62 >= '\u0A5F' && LA47_62 <= '\u0A71')||(LA47_62 >= '\u0A75' && LA47_62 <= '\u0A84')||LA47_62=='\u0A8E'||LA47_62=='\u0A92'||LA47_62=='\u0AA9'||LA47_62=='\u0AB1'||LA47_62=='\u0AB4'||(LA47_62 >= '\u0ABA' && LA47_62 <= '\u0ABC')||(LA47_62 >= '\u0ABE' && LA47_62 <= '\u0ACF')||(LA47_62 >= '\u0AD1' && LA47_62 <= '\u0ADF')||(LA47_62 >= '\u0AE2' && LA47_62 <= '\u0B04')||(LA47_62 >= '\u0B0D' && LA47_62 <= '\u0B0E')||(LA47_62 >= '\u0B11' && LA47_62 <= '\u0B12')||LA47_62=='\u0B29'||LA47_62=='\u0B31'||LA47_62=='\u0B34'||(LA47_62 >= '\u0B3A' && LA47_62 <= '\u0B3C')||(LA47_62 >= '\u0B3E' && LA47_62 <= '\u0B5B')||LA47_62=='\u0B5E'||(LA47_62 >= '\u0B62' && LA47_62 <= '\u0B70')||(LA47_62 >= '\u0B72' && LA47_62 <= '\u0B82')||LA47_62=='\u0B84'||(LA47_62 >= '\u0B8B' && LA47_62 <= '\u0B8D')||LA47_62=='\u0B91'||(LA47_62 >= '\u0B96' && LA47_62 <= '\u0B98')||LA47_62=='\u0B9B'||LA47_62=='\u0B9D'||(LA47_62 >= '\u0BA0' && LA47_62 <= '\u0BA2')||(LA47_62 >= '\u0BA5' && LA47_62 <= '\u0BA7')||(LA47_62 >= '\u0BAB' && LA47_62 <= '\u0BAD')||(LA47_62 >= '\u0BBA' && LA47_62 <= '\u0C04')||LA47_62=='\u0C0D'||LA47_62=='\u0C11'||LA47_62=='\u0C29'||LA47_62=='\u0C34'||(LA47_62 >= '\u0C3A' && LA47_62 <= '\u0C5F')||(LA47_62 >= '\u0C62' && LA47_62 <= '\u0C84')||LA47_62=='\u0C8D'||LA47_62=='\u0C91'||LA47_62=='\u0CA9'||LA47_62=='\u0CB4'||(LA47_62 >= '\u0CBA' && LA47_62 <= '\u0CBC')||(LA47_62 >= '\u0CBE' && LA47_62 <= '\u0CDD')||LA47_62=='\u0CDF'||(LA47_62 >= '\u0CE2' && LA47_62 <= '\u0D04')||LA47_62=='\u0D0D'||LA47_62=='\u0D11'||LA47_62=='\u0D29'||(LA47_62 >= '\u0D3A' && LA47_62 <= '\u0D5F')||(LA47_62 >= '\u0D62' && LA47_62 <= '\u0D84')||(LA47_62 >= '\u0D97' && LA47_62 <= '\u0D99')||LA47_62=='\u0DB2'||LA47_62=='\u0DBC'||(LA47_62 >= '\u0DBE' && LA47_62 <= '\u0DBF')||(LA47_62 >= '\u0DC7' && LA47_62 <= '\u0E00')||LA47_62=='\u0E31'||(LA47_62 >= '\u0E34' && LA47_62 <= '\u0E3F')||(LA47_62 >= '\u0E47' && LA47_62 <= '\u0E80')||LA47_62=='\u0E83'||(LA47_62 >= '\u0E85' && LA47_62 <= '\u0E86')||LA47_62=='\u0E89'||(LA47_62 >= '\u0E8B' && LA47_62 <= '\u0E8C')||(LA47_62 >= '\u0E8E' && LA47_62 <= '\u0E93')||LA47_62=='\u0E98'||LA47_62=='\u0EA0'||LA47_62=='\u0EA4'||LA47_62=='\u0EA6'||(LA47_62 >= '\u0EA8' && LA47_62 <= '\u0EA9')||LA47_62=='\u0EAC'||LA47_62=='\u0EB1'||(LA47_62 >= '\u0EB4' && LA47_62 <= '\u0EBC')||(LA47_62 >= '\u0EBE' && LA47_62 <= '\u0EBF')||LA47_62=='\u0EC5'||(LA47_62 >= '\u0EC7' && LA47_62 <= '\u0EDB')||(LA47_62 >= '\u0EDE' && LA47_62 <= '\u0EFF')||(LA47_62 >= '\u0F01' && LA47_62 <= '\u0F3F')||LA47_62=='\u0F48'||(LA47_62 >= '\u0F6B' && LA47_62 <= '\u0F87')||(LA47_62 >= '\u0F8C' && LA47_62 <= '\u0FFF')||LA47_62=='\u1022'||LA47_62=='\u1028'||(LA47_62 >= '\u102B' && LA47_62 <= '\u104F')||(LA47_62 >= '\u1056' && LA47_62 <= '\u109F')||(LA47_62 >= '\u10C6' && LA47_62 <= '\u10CF')||LA47_62=='\u10FB'||(LA47_62 >= '\u10FD' && LA47_62 <= '\u10FF')||(LA47_62 >= '\u115A' && LA47_62 <= '\u115E')||(LA47_62 >= '\u11A3' && LA47_62 <= '\u11A7')||(LA47_62 >= '\u11FA' && LA47_62 <= '\u11FF')||LA47_62=='\u1249'||(LA47_62 >= '\u124E' && LA47_62 <= '\u124F')||LA47_62=='\u1257'||LA47_62=='\u1259'||(LA47_62 >= '\u125E' && LA47_62 <= '\u125F')||LA47_62=='\u1289'||(LA47_62 >= '\u128E' && LA47_62 <= '\u128F')||LA47_62=='\u12B1'||(LA47_62 >= '\u12B6' && LA47_62 <= '\u12B7')||LA47_62=='\u12BF'||LA47_62=='\u12C1'||(LA47_62 >= '\u12C6' && LA47_62 <= '\u12C7')||LA47_62=='\u12D7'||LA47_62=='\u1311'||(LA47_62 >= '\u1316' && LA47_62 <= '\u1317')||(LA47_62 >= '\u135B' && LA47_62 <= '\u137F')||(LA47_62 >= '\u1390' && LA47_62 <= '\u139F')||(LA47_62 >= '\u13F5' && LA47_62 <= '\u1400')||(LA47_62 >= '\u166D' && LA47_62 <= '\u166E')||(LA47_62 >= '\u1677' && LA47_62 <= '\u1680')||(LA47_62 >= '\u169B' && LA47_62 <= '\u169F')||(LA47_62 >= '\u16EB' && LA47_62 <= '\u16ED')||(LA47_62 >= '\u16F1' && LA47_62 <= '\u16FF')||LA47_62=='\u170D'||(LA47_62 >= '\u1712' && LA47_62 <= '\u171F')||(LA47_62 >= '\u1732' && LA47_62 <= '\u173F')||(LA47_62 >= '\u1752' && LA47_62 <= '\u175F')||LA47_62=='\u176D'||(LA47_62 >= '\u1771' && LA47_62 <= '\u177F')||(LA47_62 >= '\u17B4' && LA47_62 <= '\u17D6')||(LA47_62 >= '\u17D8' && LA47_62 <= '\u17DB')||(LA47_62 >= '\u17DD' && LA47_62 <= '\u181F')||(LA47_62 >= '\u1878' && LA47_62 <= '\u187F')||(LA47_62 >= '\u18A9' && LA47_62 <= '\u18FF')||(LA47_62 >= '\u191D' && LA47_62 <= '\u194F')||(LA47_62 >= '\u196E' && LA47_62 <= '\u196F')||(LA47_62 >= '\u1975' && LA47_62 <= '\u197F')||(LA47_62 >= '\u19AA' && LA47_62 <= '\u19C0')||(LA47_62 >= '\u19C8' && LA47_62 <= '\u19FF')||(LA47_62 >= '\u1A17' && LA47_62 <= '\u1CFF')||(LA47_62 >= '\u1DC0' && LA47_62 <= '\u1DFF')||(LA47_62 >= '\u1E9C' && LA47_62 <= '\u1E9F')||(LA47_62 >= '\u1EFA' && LA47_62 <= '\u1EFF')||(LA47_62 >= '\u1F16' && LA47_62 <= '\u1F17')||(LA47_62 >= '\u1F1E' && LA47_62 <= '\u1F1F')||(LA47_62 >= '\u1F46' && LA47_62 <= '\u1F47')||(LA47_62 >= '\u1F4E' && LA47_62 <= '\u1F4F')||LA47_62=='\u1F58'||LA47_62=='\u1F5A'||LA47_62=='\u1F5C'||LA47_62=='\u1F5E'||(LA47_62 >= '\u1F7E' && LA47_62 <= '\u1F7F')||LA47_62=='\u1FB5'||LA47_62=='\u1FBD'||(LA47_62 >= '\u1FBF' && LA47_62 <= '\u1FC1')||LA47_62=='\u1FC5'||(LA47_62 >= '\u1FCD' && LA47_62 <= '\u1FCF')||(LA47_62 >= '\u1FD4' && LA47_62 <= '\u1FD5')||(LA47_62 >= '\u1FDC' && LA47_62 <= '\u1FDF')||(LA47_62 >= '\u1FED' && LA47_62 <= '\u1FF1')||LA47_62=='\u1FF5'||(LA47_62 >= '\u1FFD' && LA47_62 <= '\u2070')||(LA47_62 >= '\u2072' && LA47_62 <= '\u207E')||(LA47_62 >= '\u2080' && LA47_62 <= '\u208F')||(LA47_62 >= '\u2095' && LA47_62 <= '\u2101')||(LA47_62 >= '\u2103' && LA47_62 <= '\u2106')||(LA47_62 >= '\u2108' && LA47_62 <= '\u2109')||LA47_62=='\u2114'||(LA47_62 >= '\u2116' && LA47_62 <= '\u2117')||(LA47_62 >= '\u211E' && LA47_62 <= '\u2123')||LA47_62=='\u2125'||LA47_62=='\u2127'||LA47_62=='\u2129'||LA47_62=='\u2132'||(LA47_62 >= '\u213A' && LA47_62 <= '\u213B')||(LA47_62 >= '\u2140' && LA47_62 <= '\u2144')||(LA47_62 >= '\u214A' && LA47_62 <= '\u215F')||(LA47_62 >= '\u2184' && LA47_62 <= '\u2BFF')||LA47_62=='\u2C2F'||(LA47_62 >= '\u2C5F' && LA47_62 <= '\u2C7F')||(LA47_62 >= '\u2CE5' && LA47_62 <= '\u2CFF')||(LA47_62 >= '\u2D26' && LA47_62 <= '\u2D2F')||(LA47_62 >= '\u2D66' && LA47_62 <= '\u2D6E')||(LA47_62 >= '\u2D70' && LA47_62 <= '\u2D7F')||(LA47_62 >= '\u2D97' && LA47_62 <= '\u2D9F')||LA47_62=='\u2DA7'||LA47_62=='\u2DAF'||LA47_62=='\u2DB7'||LA47_62=='\u2DBF'||LA47_62=='\u2DC7'||LA47_62=='\u2DCF'||LA47_62=='\u2DD7'||(LA47_62 >= '\u2DDF' && LA47_62 <= '\u3004')||(LA47_62 >= '\u3008' && LA47_62 <= '\u3020')||(LA47_62 >= '\u302A' && LA47_62 <= '\u3030')||(LA47_62 >= '\u3036' && LA47_62 <= '\u3037')||(LA47_62 >= '\u303D' && LA47_62 <= '\u3040')||(LA47_62 >= '\u3097' && LA47_62 <= '\u309A')||LA47_62=='\u30A0'||LA47_62=='\u30FB'||(LA47_62 >= '\u3100' && LA47_62 <= '\u3104')||(LA47_62 >= '\u312D' && LA47_62 <= '\u3130')||(LA47_62 >= '\u318F' && LA47_62 <= '\u319F')||(LA47_62 >= '\u31B8' && LA47_62 <= '\u31EF')||(LA47_62 >= '\u3200' && LA47_62 <= '\u33FF')||(LA47_62 >= '\u4DB6' && LA47_62 <= '\u4DFF')||(LA47_62 >= '\u9FBC' && LA47_62 <= '\u9FFF')||(LA47_62 >= '\uA48D' && LA47_62 <= '\uA7FF')||LA47_62=='\uA802'||LA47_62=='\uA806'||LA47_62=='\uA80B'||(LA47_62 >= '\uA823' && LA47_62 <= '\uABFF')||(LA47_62 >= '\uD7A4' && LA47_62 <= '\uF8FF')||(LA47_62 >= '\uFA2E' && LA47_62 <= '\uFA2F')||(LA47_62 >= '\uFA6B' && LA47_62 <= '\uFA6F')||(LA47_62 >= '\uFADA' && LA47_62 <= '\uFAFF')||(LA47_62 >= '\uFB07' && LA47_62 <= '\uFB12')||(LA47_62 >= '\uFB18' && LA47_62 <= '\uFB1C')||LA47_62=='\uFB1E'||LA47_62=='\uFB29'||LA47_62=='\uFB37'||LA47_62=='\uFB3D'||LA47_62=='\uFB3F'||LA47_62=='\uFB42'||LA47_62=='\uFB45'||(LA47_62 >= '\uFBB2' && LA47_62 <= '\uFBD2')||(LA47_62 >= '\uFD3E' && LA47_62 <= '\uFD4F')||(LA47_62 >= '\uFD90' && LA47_62 <= '\uFD91')||(LA47_62 >= '\uFDC8' && LA47_62 <= '\uFDEF')||(LA47_62 >= '\uFDFC' && LA47_62 <= '\uFE6F')||LA47_62=='\uFE75'||(LA47_62 >= '\uFEFD' && LA47_62 <= '\uFF20')||(LA47_62 >= '\uFF3B' && LA47_62 <= '\uFF40')||(LA47_62 >= '\uFF5B' && LA47_62 <= '\uFF65')||(LA47_62 >= '\uFFBF' && LA47_62 <= '\uFFC1')||(LA47_62 >= '\uFFC8' && LA47_62 <= '\uFFC9')||(LA47_62 >= '\uFFD0' && LA47_62 <= '\uFFD1')||(LA47_62 >= '\uFFD8' && LA47_62 <= '\uFFD9')||(LA47_62 >= '\uFFDD' && LA47_62 <= '\uFFFF')) && (( !_seeWord ))) {s = 63;}

                        else s = 70;

                         
                        input.seek(index47_62);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA47_0 = input.LA(1);

                         
                        int index47_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA47_0=='\uFEFF') ) {s = 1;}

                        else if ( (LA47_0=='\u529F') ) {s = 2;}

                        else if ( (LA47_0=='\u573A') ) {s = 3;}

                        else if ( (LA47_0=='\u5F53') ) {s = 4;}

                        else if ( (LA47_0=='\u5426') ) {s = 5;}

                        else if ( (LA47_0=='*') && ((( !_seeWord )||(_seeWord)))) {s = 6;}

                        else if ( (LA47_0=='!') ) {s = 7;}

                        else if ( (LA47_0=='+') ) {s = 8;}

                        else if ( (LA47_0=='-') ) {s = 9;}

                        else if ( (LA47_0=='/') ) {s = 10;}

                        else if ( (LA47_0=='%') ) {s = 11;}

                        else if ( (LA47_0=='(') ) {s = 12;}

                        else if ( (LA47_0==')') ) {s = 13;}

                        else if ( (LA47_0=='|') ) {s = 14;}

                        else if ( (LA47_0=='o') ) {s = 15;}

                        else if ( (LA47_0=='\u6216') ) {s = 16;}

                        else if ( (LA47_0=='&') ) {s = 17;}

                        else if ( (LA47_0=='a') ) {s = 18;}

                        else if ( (LA47_0=='\u5E76') ) {s = 19;}

                        else if ( (LA47_0=='<') ) {s = 20;}

                        else if ( (LA47_0=='>') ) {s = 21;}

                        else if ( (LA47_0=='=') ) {s = 22;}

                        else if ( (LA47_0==':'||LA47_0=='\uFF1A') ) {s = 23;}

                        else if ( (LA47_0=='\f') ) {s = 24;}

                        else if ( (LA47_0=='\r') ) {s = 25;}

                        else if ( (LA47_0=='\n') ) {s = 26;}

                        else if ( (LA47_0=='\t') ) {s = 27;}

                        else if ( (LA47_0=='#') ) {s = 28;}

                        else if ( (LA47_0==' ') ) {s = 29;}

                        else if ( (LA47_0=='\"') ) {s = 30;}

                        else if ( (LA47_0=='[') ) {s = 31;}

                        else if ( (LA47_0=='.'||(LA47_0 >= '0' && LA47_0 <= '9')) ) {s = 32;}

                        else s = 33;

                         
                        input.seek(index47_0);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA47_68 = input.LA(1);

                        s = -1;
                        if ( ((LA47_68 >= '\u0000' && LA47_68 <= '\t')||(LA47_68 >= '\u000B' && LA47_68 <= '\uFFFF')) ) {s = 68;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA47_35 = input.LA(1);

                         
                        int index47_35 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA47_35 >= 'A' && LA47_35 <= 'Z')||LA47_35=='_'||(LA47_35 >= 'a' && LA47_35 <= 'z')||LA47_35=='\u00AA'||LA47_35=='\u00B5'||LA47_35=='\u00BA'||(LA47_35 >= '\u00C0' && LA47_35 <= '\u00D6')||(LA47_35 >= '\u00D8' && LA47_35 <= '\u00F6')||(LA47_35 >= '\u00F8' && LA47_35 <= '\u0241')||(LA47_35 >= '\u0250' && LA47_35 <= '\u02C1')||(LA47_35 >= '\u02C6' && LA47_35 <= '\u02D1')||(LA47_35 >= '\u02E0' && LA47_35 <= '\u02E4')||LA47_35=='\u02EE'||LA47_35=='\u037A'||LA47_35=='\u0386'||(LA47_35 >= '\u0388' && LA47_35 <= '\u038A')||LA47_35=='\u038C'||(LA47_35 >= '\u038E' && LA47_35 <= '\u03A1')||(LA47_35 >= '\u03A3' && LA47_35 <= '\u03CE')||(LA47_35 >= '\u03D0' && LA47_35 <= '\u03F5')||(LA47_35 >= '\u03F7' && LA47_35 <= '\u0481')||(LA47_35 >= '\u048A' && LA47_35 <= '\u04CE')||(LA47_35 >= '\u04D0' && LA47_35 <= '\u04F9')||(LA47_35 >= '\u0500' && LA47_35 <= '\u050F')||(LA47_35 >= '\u0531' && LA47_35 <= '\u0556')||LA47_35=='\u0559'||(LA47_35 >= '\u0561' && LA47_35 <= '\u0587')||(LA47_35 >= '\u05D0' && LA47_35 <= '\u05EA')||(LA47_35 >= '\u05F0' && LA47_35 <= '\u05F2')||(LA47_35 >= '\u0621' && LA47_35 <= '\u063A')||(LA47_35 >= '\u0640' && LA47_35 <= '\u064A')||(LA47_35 >= '\u066E' && LA47_35 <= '\u066F')||(LA47_35 >= '\u0671' && LA47_35 <= '\u06D3')||LA47_35=='\u06D5'||(LA47_35 >= '\u06E5' && LA47_35 <= '\u06E6')||(LA47_35 >= '\u06EE' && LA47_35 <= '\u06EF')||(LA47_35 >= '\u06FA' && LA47_35 <= '\u06FC')||LA47_35=='\u06FF'||LA47_35=='\u0710'||(LA47_35 >= '\u0712' && LA47_35 <= '\u072F')||(LA47_35 >= '\u074D' && LA47_35 <= '\u076D')||(LA47_35 >= '\u0780' && LA47_35 <= '\u07A5')||LA47_35=='\u07B1'||(LA47_35 >= '\u0904' && LA47_35 <= '\u0939')||LA47_35=='\u093D'||LA47_35=='\u0950'||(LA47_35 >= '\u0958' && LA47_35 <= '\u0961')||LA47_35=='\u097D'||(LA47_35 >= '\u0985' && LA47_35 <= '\u098C')||(LA47_35 >= '\u098F' && LA47_35 <= '\u0990')||(LA47_35 >= '\u0993' && LA47_35 <= '\u09A8')||(LA47_35 >= '\u09AA' && LA47_35 <= '\u09B0')||LA47_35=='\u09B2'||(LA47_35 >= '\u09B6' && LA47_35 <= '\u09B9')||LA47_35=='\u09BD'||LA47_35=='\u09CE'||(LA47_35 >= '\u09DC' && LA47_35 <= '\u09DD')||(LA47_35 >= '\u09DF' && LA47_35 <= '\u09E1')||(LA47_35 >= '\u09F0' && LA47_35 <= '\u09F1')||(LA47_35 >= '\u0A05' && LA47_35 <= '\u0A0A')||(LA47_35 >= '\u0A0F' && LA47_35 <= '\u0A10')||(LA47_35 >= '\u0A13' && LA47_35 <= '\u0A28')||(LA47_35 >= '\u0A2A' && LA47_35 <= '\u0A30')||(LA47_35 >= '\u0A32' && LA47_35 <= '\u0A33')||(LA47_35 >= '\u0A35' && LA47_35 <= '\u0A36')||(LA47_35 >= '\u0A38' && LA47_35 <= '\u0A39')||(LA47_35 >= '\u0A59' && LA47_35 <= '\u0A5C')||LA47_35=='\u0A5E'||(LA47_35 >= '\u0A72' && LA47_35 <= '\u0A74')||(LA47_35 >= '\u0A85' && LA47_35 <= '\u0A8D')||(LA47_35 >= '\u0A8F' && LA47_35 <= '\u0A91')||(LA47_35 >= '\u0A93' && LA47_35 <= '\u0AA8')||(LA47_35 >= '\u0AAA' && LA47_35 <= '\u0AB0')||(LA47_35 >= '\u0AB2' && LA47_35 <= '\u0AB3')||(LA47_35 >= '\u0AB5' && LA47_35 <= '\u0AB9')||LA47_35=='\u0ABD'||LA47_35=='\u0AD0'||(LA47_35 >= '\u0AE0' && LA47_35 <= '\u0AE1')||(LA47_35 >= '\u0B05' && LA47_35 <= '\u0B0C')||(LA47_35 >= '\u0B0F' && LA47_35 <= '\u0B10')||(LA47_35 >= '\u0B13' && LA47_35 <= '\u0B28')||(LA47_35 >= '\u0B2A' && LA47_35 <= '\u0B30')||(LA47_35 >= '\u0B32' && LA47_35 <= '\u0B33')||(LA47_35 >= '\u0B35' && LA47_35 <= '\u0B39')||LA47_35=='\u0B3D'||(LA47_35 >= '\u0B5C' && LA47_35 <= '\u0B5D')||(LA47_35 >= '\u0B5F' && LA47_35 <= '\u0B61')||LA47_35=='\u0B71'||LA47_35=='\u0B83'||(LA47_35 >= '\u0B85' && LA47_35 <= '\u0B8A')||(LA47_35 >= '\u0B8E' && LA47_35 <= '\u0B90')||(LA47_35 >= '\u0B92' && LA47_35 <= '\u0B95')||(LA47_35 >= '\u0B99' && LA47_35 <= '\u0B9A')||LA47_35=='\u0B9C'||(LA47_35 >= '\u0B9E' && LA47_35 <= '\u0B9F')||(LA47_35 >= '\u0BA3' && LA47_35 <= '\u0BA4')||(LA47_35 >= '\u0BA8' && LA47_35 <= '\u0BAA')||(LA47_35 >= '\u0BAE' && LA47_35 <= '\u0BB9')||(LA47_35 >= '\u0C05' && LA47_35 <= '\u0C0C')||(LA47_35 >= '\u0C0E' && LA47_35 <= '\u0C10')||(LA47_35 >= '\u0C12' && LA47_35 <= '\u0C28')||(LA47_35 >= '\u0C2A' && LA47_35 <= '\u0C33')||(LA47_35 >= '\u0C35' && LA47_35 <= '\u0C39')||(LA47_35 >= '\u0C60' && LA47_35 <= '\u0C61')||(LA47_35 >= '\u0C85' && LA47_35 <= '\u0C8C')||(LA47_35 >= '\u0C8E' && LA47_35 <= '\u0C90')||(LA47_35 >= '\u0C92' && LA47_35 <= '\u0CA8')||(LA47_35 >= '\u0CAA' && LA47_35 <= '\u0CB3')||(LA47_35 >= '\u0CB5' && LA47_35 <= '\u0CB9')||LA47_35=='\u0CBD'||LA47_35=='\u0CDE'||(LA47_35 >= '\u0CE0' && LA47_35 <= '\u0CE1')||(LA47_35 >= '\u0D05' && LA47_35 <= '\u0D0C')||(LA47_35 >= '\u0D0E' && LA47_35 <= '\u0D10')||(LA47_35 >= '\u0D12' && LA47_35 <= '\u0D28')||(LA47_35 >= '\u0D2A' && LA47_35 <= '\u0D39')||(LA47_35 >= '\u0D60' && LA47_35 <= '\u0D61')||(LA47_35 >= '\u0D85' && LA47_35 <= '\u0D96')||(LA47_35 >= '\u0D9A' && LA47_35 <= '\u0DB1')||(LA47_35 >= '\u0DB3' && LA47_35 <= '\u0DBB')||LA47_35=='\u0DBD'||(LA47_35 >= '\u0DC0' && LA47_35 <= '\u0DC6')||(LA47_35 >= '\u0E01' && LA47_35 <= '\u0E30')||(LA47_35 >= '\u0E32' && LA47_35 <= '\u0E33')||(LA47_35 >= '\u0E40' && LA47_35 <= '\u0E46')||(LA47_35 >= '\u0E81' && LA47_35 <= '\u0E82')||LA47_35=='\u0E84'||(LA47_35 >= '\u0E87' && LA47_35 <= '\u0E88')||LA47_35=='\u0E8A'||LA47_35=='\u0E8D'||(LA47_35 >= '\u0E94' && LA47_35 <= '\u0E97')||(LA47_35 >= '\u0E99' && LA47_35 <= '\u0E9F')||(LA47_35 >= '\u0EA1' && LA47_35 <= '\u0EA3')||LA47_35=='\u0EA5'||LA47_35=='\u0EA7'||(LA47_35 >= '\u0EAA' && LA47_35 <= '\u0EAB')||(LA47_35 >= '\u0EAD' && LA47_35 <= '\u0EB0')||(LA47_35 >= '\u0EB2' && LA47_35 <= '\u0EB3')||LA47_35=='\u0EBD'||(LA47_35 >= '\u0EC0' && LA47_35 <= '\u0EC4')||LA47_35=='\u0EC6'||(LA47_35 >= '\u0EDC' && LA47_35 <= '\u0EDD')||LA47_35=='\u0F00'||(LA47_35 >= '\u0F40' && LA47_35 <= '\u0F47')||(LA47_35 >= '\u0F49' && LA47_35 <= '\u0F6A')||(LA47_35 >= '\u0F88' && LA47_35 <= '\u0F8B')||(LA47_35 >= '\u1000' && LA47_35 <= '\u1021')||(LA47_35 >= '\u1023' && LA47_35 <= '\u1027')||(LA47_35 >= '\u1029' && LA47_35 <= '\u102A')||(LA47_35 >= '\u1050' && LA47_35 <= '\u1055')||(LA47_35 >= '\u10A0' && LA47_35 <= '\u10C5')||(LA47_35 >= '\u10D0' && LA47_35 <= '\u10FA')||LA47_35=='\u10FC'||(LA47_35 >= '\u1100' && LA47_35 <= '\u1159')||(LA47_35 >= '\u115F' && LA47_35 <= '\u11A2')||(LA47_35 >= '\u11A8' && LA47_35 <= '\u11F9')||(LA47_35 >= '\u1200' && LA47_35 <= '\u1248')||(LA47_35 >= '\u124A' && LA47_35 <= '\u124D')||(LA47_35 >= '\u1250' && LA47_35 <= '\u1256')||LA47_35=='\u1258'||(LA47_35 >= '\u125A' && LA47_35 <= '\u125D')||(LA47_35 >= '\u1260' && LA47_35 <= '\u1288')||(LA47_35 >= '\u128A' && LA47_35 <= '\u128D')||(LA47_35 >= '\u1290' && LA47_35 <= '\u12B0')||(LA47_35 >= '\u12B2' && LA47_35 <= '\u12B5')||(LA47_35 >= '\u12B8' && LA47_35 <= '\u12BE')||LA47_35=='\u12C0'||(LA47_35 >= '\u12C2' && LA47_35 <= '\u12C5')||(LA47_35 >= '\u12C8' && LA47_35 <= '\u12D6')||(LA47_35 >= '\u12D8' && LA47_35 <= '\u1310')||(LA47_35 >= '\u1312' && LA47_35 <= '\u1315')||(LA47_35 >= '\u1318' && LA47_35 <= '\u135A')||(LA47_35 >= '\u1380' && LA47_35 <= '\u138F')||(LA47_35 >= '\u13A0' && LA47_35 <= '\u13F4')||(LA47_35 >= '\u1401' && LA47_35 <= '\u166C')||(LA47_35 >= '\u166F' && LA47_35 <= '\u1676')||(LA47_35 >= '\u1681' && LA47_35 <= '\u169A')||(LA47_35 >= '\u16A0' && LA47_35 <= '\u16EA')||(LA47_35 >= '\u16EE' && LA47_35 <= '\u16F0')||(LA47_35 >= '\u1700' && LA47_35 <= '\u170C')||(LA47_35 >= '\u170E' && LA47_35 <= '\u1711')||(LA47_35 >= '\u1720' && LA47_35 <= '\u1731')||(LA47_35 >= '\u1740' && LA47_35 <= '\u1751')||(LA47_35 >= '\u1760' && LA47_35 <= '\u176C')||(LA47_35 >= '\u176E' && LA47_35 <= '\u1770')||(LA47_35 >= '\u1780' && LA47_35 <= '\u17B3')||LA47_35=='\u17D7'||LA47_35=='\u17DC'||(LA47_35 >= '\u1820' && LA47_35 <= '\u1877')||(LA47_35 >= '\u1880' && LA47_35 <= '\u18A8')||(LA47_35 >= '\u1900' && LA47_35 <= '\u191C')||(LA47_35 >= '\u1950' && LA47_35 <= '\u196D')||(LA47_35 >= '\u1970' && LA47_35 <= '\u1974')||(LA47_35 >= '\u1980' && LA47_35 <= '\u19A9')||(LA47_35 >= '\u19C1' && LA47_35 <= '\u19C7')||(LA47_35 >= '\u1A00' && LA47_35 <= '\u1A16')||(LA47_35 >= '\u1D00' && LA47_35 <= '\u1DBF')||(LA47_35 >= '\u1E00' && LA47_35 <= '\u1E9B')||(LA47_35 >= '\u1EA0' && LA47_35 <= '\u1EF9')||(LA47_35 >= '\u1F00' && LA47_35 <= '\u1F15')||(LA47_35 >= '\u1F18' && LA47_35 <= '\u1F1D')||(LA47_35 >= '\u1F20' && LA47_35 <= '\u1F45')||(LA47_35 >= '\u1F48' && LA47_35 <= '\u1F4D')||(LA47_35 >= '\u1F50' && LA47_35 <= '\u1F57')||LA47_35=='\u1F59'||LA47_35=='\u1F5B'||LA47_35=='\u1F5D'||(LA47_35 >= '\u1F5F' && LA47_35 <= '\u1F7D')||(LA47_35 >= '\u1F80' && LA47_35 <= '\u1FB4')||(LA47_35 >= '\u1FB6' && LA47_35 <= '\u1FBC')||LA47_35=='\u1FBE'||(LA47_35 >= '\u1FC2' && LA47_35 <= '\u1FC4')||(LA47_35 >= '\u1FC6' && LA47_35 <= '\u1FCC')||(LA47_35 >= '\u1FD0' && LA47_35 <= '\u1FD3')||(LA47_35 >= '\u1FD6' && LA47_35 <= '\u1FDB')||(LA47_35 >= '\u1FE0' && LA47_35 <= '\u1FEC')||(LA47_35 >= '\u1FF2' && LA47_35 <= '\u1FF4')||(LA47_35 >= '\u1FF6' && LA47_35 <= '\u1FFC')||LA47_35=='\u2071'||LA47_35=='\u207F'||(LA47_35 >= '\u2090' && LA47_35 <= '\u2094')||LA47_35=='\u2102'||LA47_35=='\u2107'||(LA47_35 >= '\u210A' && LA47_35 <= '\u2113')||LA47_35=='\u2115'||(LA47_35 >= '\u2118' && LA47_35 <= '\u211D')||LA47_35=='\u2124'||LA47_35=='\u2126'||LA47_35=='\u2128'||(LA47_35 >= '\u212A' && LA47_35 <= '\u2131')||(LA47_35 >= '\u2133' && LA47_35 <= '\u2139')||(LA47_35 >= '\u213C' && LA47_35 <= '\u213F')||(LA47_35 >= '\u2145' && LA47_35 <= '\u2149')||(LA47_35 >= '\u2160' && LA47_35 <= '\u2183')||(LA47_35 >= '\u2C00' && LA47_35 <= '\u2C2E')||(LA47_35 >= '\u2C30' && LA47_35 <= '\u2C5E')||(LA47_35 >= '\u2C80' && LA47_35 <= '\u2CE4')||(LA47_35 >= '\u2D00' && LA47_35 <= '\u2D25')||(LA47_35 >= '\u2D30' && LA47_35 <= '\u2D65')||LA47_35=='\u2D6F'||(LA47_35 >= '\u2D80' && LA47_35 <= '\u2D96')||(LA47_35 >= '\u2DA0' && LA47_35 <= '\u2DA6')||(LA47_35 >= '\u2DA8' && LA47_35 <= '\u2DAE')||(LA47_35 >= '\u2DB0' && LA47_35 <= '\u2DB6')||(LA47_35 >= '\u2DB8' && LA47_35 <= '\u2DBE')||(LA47_35 >= '\u2DC0' && LA47_35 <= '\u2DC6')||(LA47_35 >= '\u2DC8' && LA47_35 <= '\u2DCE')||(LA47_35 >= '\u2DD0' && LA47_35 <= '\u2DD6')||(LA47_35 >= '\u2DD8' && LA47_35 <= '\u2DDE')||(LA47_35 >= '\u3005' && LA47_35 <= '\u3007')||(LA47_35 >= '\u3021' && LA47_35 <= '\u3029')||(LA47_35 >= '\u3031' && LA47_35 <= '\u3035')||(LA47_35 >= '\u3038' && LA47_35 <= '\u303C')||(LA47_35 >= '\u3041' && LA47_35 <= '\u3096')||(LA47_35 >= '\u309B' && LA47_35 <= '\u309F')||(LA47_35 >= '\u30A1' && LA47_35 <= '\u30FA')||(LA47_35 >= '\u30FC' && LA47_35 <= '\u30FF')||(LA47_35 >= '\u3105' && LA47_35 <= '\u312C')||(LA47_35 >= '\u3131' && LA47_35 <= '\u318E')||(LA47_35 >= '\u31A0' && LA47_35 <= '\u31B7')||(LA47_35 >= '\u31F0' && LA47_35 <= '\u31FF')||(LA47_35 >= '\u3400' && LA47_35 <= '\u4DB5')||(LA47_35 >= '\u4E00' && LA47_35 <= '\u9FBB')||(LA47_35 >= '\uA000' && LA47_35 <= '\uA48C')||(LA47_35 >= '\uA800' && LA47_35 <= '\uA801')||(LA47_35 >= '\uA803' && LA47_35 <= '\uA805')||(LA47_35 >= '\uA807' && LA47_35 <= '\uA80A')||(LA47_35 >= '\uA80C' && LA47_35 <= '\uA822')||(LA47_35 >= '\uAC00' && LA47_35 <= '\uD7A3')||(LA47_35 >= '\uF900' && LA47_35 <= '\uFA2D')||(LA47_35 >= '\uFA30' && LA47_35 <= '\uFA6A')||(LA47_35 >= '\uFA70' && LA47_35 <= '\uFAD9')||(LA47_35 >= '\uFB00' && LA47_35 <= '\uFB06')||(LA47_35 >= '\uFB13' && LA47_35 <= '\uFB17')||LA47_35=='\uFB1D'||(LA47_35 >= '\uFB1F' && LA47_35 <= '\uFB28')||(LA47_35 >= '\uFB2A' && LA47_35 <= '\uFB36')||(LA47_35 >= '\uFB38' && LA47_35 <= '\uFB3C')||LA47_35=='\uFB3E'||(LA47_35 >= '\uFB40' && LA47_35 <= '\uFB41')||(LA47_35 >= '\uFB43' && LA47_35 <= '\uFB44')||(LA47_35 >= '\uFB46' && LA47_35 <= '\uFBB1')||(LA47_35 >= '\uFBD3' && LA47_35 <= '\uFD3D')||(LA47_35 >= '\uFD50' && LA47_35 <= '\uFD8F')||(LA47_35 >= '\uFD92' && LA47_35 <= '\uFDC7')||(LA47_35 >= '\uFDF0' && LA47_35 <= '\uFDFB')||(LA47_35 >= '\uFE70' && LA47_35 <= '\uFE74')||(LA47_35 >= '\uFE76' && LA47_35 <= '\uFEFC')||(LA47_35 >= '\uFF21' && LA47_35 <= '\uFF3A')||(LA47_35 >= '\uFF41' && LA47_35 <= '\uFF5A')||(LA47_35 >= '\uFF66' && LA47_35 <= '\uFFBE')||(LA47_35 >= '\uFFC2' && LA47_35 <= '\uFFC7')||(LA47_35 >= '\uFFCA' && LA47_35 <= '\uFFCF')||(LA47_35 >= '\uFFD2' && LA47_35 <= '\uFFD7')||(LA47_35 >= '\uFFDA' && LA47_35 <= '\uFFDC')) ) {s = 62;}

                        else if ( ((LA47_35 >= '\u0000' && LA47_35 <= '\t')||(LA47_35 >= '\u000B' && LA47_35 <= '@')||(LA47_35 >= '[' && LA47_35 <= '^')||LA47_35=='`'||(LA47_35 >= '{' && LA47_35 <= '\u00A9')||(LA47_35 >= '\u00AB' && LA47_35 <= '\u00B4')||(LA47_35 >= '\u00B6' && LA47_35 <= '\u00B9')||(LA47_35 >= '\u00BB' && LA47_35 <= '\u00BF')||LA47_35=='\u00D7'||LA47_35=='\u00F7'||(LA47_35 >= '\u0242' && LA47_35 <= '\u024F')||(LA47_35 >= '\u02C2' && LA47_35 <= '\u02C5')||(LA47_35 >= '\u02D2' && LA47_35 <= '\u02DF')||(LA47_35 >= '\u02E5' && LA47_35 <= '\u02ED')||(LA47_35 >= '\u02EF' && LA47_35 <= '\u0379')||(LA47_35 >= '\u037B' && LA47_35 <= '\u0385')||LA47_35=='\u0387'||LA47_35=='\u038B'||LA47_35=='\u038D'||LA47_35=='\u03A2'||LA47_35=='\u03CF'||LA47_35=='\u03F6'||(LA47_35 >= '\u0482' && LA47_35 <= '\u0489')||LA47_35=='\u04CF'||(LA47_35 >= '\u04FA' && LA47_35 <= '\u04FF')||(LA47_35 >= '\u0510' && LA47_35 <= '\u0530')||(LA47_35 >= '\u0557' && LA47_35 <= '\u0558')||(LA47_35 >= '\u055A' && LA47_35 <= '\u0560')||(LA47_35 >= '\u0588' && LA47_35 <= '\u05CF')||(LA47_35 >= '\u05EB' && LA47_35 <= '\u05EF')||(LA47_35 >= '\u05F3' && LA47_35 <= '\u0620')||(LA47_35 >= '\u063B' && LA47_35 <= '\u063F')||(LA47_35 >= '\u064B' && LA47_35 <= '\u066D')||LA47_35=='\u0670'||LA47_35=='\u06D4'||(LA47_35 >= '\u06D6' && LA47_35 <= '\u06E4')||(LA47_35 >= '\u06E7' && LA47_35 <= '\u06ED')||(LA47_35 >= '\u06F0' && LA47_35 <= '\u06F9')||(LA47_35 >= '\u06FD' && LA47_35 <= '\u06FE')||(LA47_35 >= '\u0700' && LA47_35 <= '\u070F')||LA47_35=='\u0711'||(LA47_35 >= '\u0730' && LA47_35 <= '\u074C')||(LA47_35 >= '\u076E' && LA47_35 <= '\u077F')||(LA47_35 >= '\u07A6' && LA47_35 <= '\u07B0')||(LA47_35 >= '\u07B2' && LA47_35 <= '\u0903')||(LA47_35 >= '\u093A' && LA47_35 <= '\u093C')||(LA47_35 >= '\u093E' && LA47_35 <= '\u094F')||(LA47_35 >= '\u0951' && LA47_35 <= '\u0957')||(LA47_35 >= '\u0962' && LA47_35 <= '\u097C')||(LA47_35 >= '\u097E' && LA47_35 <= '\u0984')||(LA47_35 >= '\u098D' && LA47_35 <= '\u098E')||(LA47_35 >= '\u0991' && LA47_35 <= '\u0992')||LA47_35=='\u09A9'||LA47_35=='\u09B1'||(LA47_35 >= '\u09B3' && LA47_35 <= '\u09B5')||(LA47_35 >= '\u09BA' && LA47_35 <= '\u09BC')||(LA47_35 >= '\u09BE' && LA47_35 <= '\u09CD')||(LA47_35 >= '\u09CF' && LA47_35 <= '\u09DB')||LA47_35=='\u09DE'||(LA47_35 >= '\u09E2' && LA47_35 <= '\u09EF')||(LA47_35 >= '\u09F2' && LA47_35 <= '\u0A04')||(LA47_35 >= '\u0A0B' && LA47_35 <= '\u0A0E')||(LA47_35 >= '\u0A11' && LA47_35 <= '\u0A12')||LA47_35=='\u0A29'||LA47_35=='\u0A31'||LA47_35=='\u0A34'||LA47_35=='\u0A37'||(LA47_35 >= '\u0A3A' && LA47_35 <= '\u0A58')||LA47_35=='\u0A5D'||(LA47_35 >= '\u0A5F' && LA47_35 <= '\u0A71')||(LA47_35 >= '\u0A75' && LA47_35 <= '\u0A84')||LA47_35=='\u0A8E'||LA47_35=='\u0A92'||LA47_35=='\u0AA9'||LA47_35=='\u0AB1'||LA47_35=='\u0AB4'||(LA47_35 >= '\u0ABA' && LA47_35 <= '\u0ABC')||(LA47_35 >= '\u0ABE' && LA47_35 <= '\u0ACF')||(LA47_35 >= '\u0AD1' && LA47_35 <= '\u0ADF')||(LA47_35 >= '\u0AE2' && LA47_35 <= '\u0B04')||(LA47_35 >= '\u0B0D' && LA47_35 <= '\u0B0E')||(LA47_35 >= '\u0B11' && LA47_35 <= '\u0B12')||LA47_35=='\u0B29'||LA47_35=='\u0B31'||LA47_35=='\u0B34'||(LA47_35 >= '\u0B3A' && LA47_35 <= '\u0B3C')||(LA47_35 >= '\u0B3E' && LA47_35 <= '\u0B5B')||LA47_35=='\u0B5E'||(LA47_35 >= '\u0B62' && LA47_35 <= '\u0B70')||(LA47_35 >= '\u0B72' && LA47_35 <= '\u0B82')||LA47_35=='\u0B84'||(LA47_35 >= '\u0B8B' && LA47_35 <= '\u0B8D')||LA47_35=='\u0B91'||(LA47_35 >= '\u0B96' && LA47_35 <= '\u0B98')||LA47_35=='\u0B9B'||LA47_35=='\u0B9D'||(LA47_35 >= '\u0BA0' && LA47_35 <= '\u0BA2')||(LA47_35 >= '\u0BA5' && LA47_35 <= '\u0BA7')||(LA47_35 >= '\u0BAB' && LA47_35 <= '\u0BAD')||(LA47_35 >= '\u0BBA' && LA47_35 <= '\u0C04')||LA47_35=='\u0C0D'||LA47_35=='\u0C11'||LA47_35=='\u0C29'||LA47_35=='\u0C34'||(LA47_35 >= '\u0C3A' && LA47_35 <= '\u0C5F')||(LA47_35 >= '\u0C62' && LA47_35 <= '\u0C84')||LA47_35=='\u0C8D'||LA47_35=='\u0C91'||LA47_35=='\u0CA9'||LA47_35=='\u0CB4'||(LA47_35 >= '\u0CBA' && LA47_35 <= '\u0CBC')||(LA47_35 >= '\u0CBE' && LA47_35 <= '\u0CDD')||LA47_35=='\u0CDF'||(LA47_35 >= '\u0CE2' && LA47_35 <= '\u0D04')||LA47_35=='\u0D0D'||LA47_35=='\u0D11'||LA47_35=='\u0D29'||(LA47_35 >= '\u0D3A' && LA47_35 <= '\u0D5F')||(LA47_35 >= '\u0D62' && LA47_35 <= '\u0D84')||(LA47_35 >= '\u0D97' && LA47_35 <= '\u0D99')||LA47_35=='\u0DB2'||LA47_35=='\u0DBC'||(LA47_35 >= '\u0DBE' && LA47_35 <= '\u0DBF')||(LA47_35 >= '\u0DC7' && LA47_35 <= '\u0E00')||LA47_35=='\u0E31'||(LA47_35 >= '\u0E34' && LA47_35 <= '\u0E3F')||(LA47_35 >= '\u0E47' && LA47_35 <= '\u0E80')||LA47_35=='\u0E83'||(LA47_35 >= '\u0E85' && LA47_35 <= '\u0E86')||LA47_35=='\u0E89'||(LA47_35 >= '\u0E8B' && LA47_35 <= '\u0E8C')||(LA47_35 >= '\u0E8E' && LA47_35 <= '\u0E93')||LA47_35=='\u0E98'||LA47_35=='\u0EA0'||LA47_35=='\u0EA4'||LA47_35=='\u0EA6'||(LA47_35 >= '\u0EA8' && LA47_35 <= '\u0EA9')||LA47_35=='\u0EAC'||LA47_35=='\u0EB1'||(LA47_35 >= '\u0EB4' && LA47_35 <= '\u0EBC')||(LA47_35 >= '\u0EBE' && LA47_35 <= '\u0EBF')||LA47_35=='\u0EC5'||(LA47_35 >= '\u0EC7' && LA47_35 <= '\u0EDB')||(LA47_35 >= '\u0EDE' && LA47_35 <= '\u0EFF')||(LA47_35 >= '\u0F01' && LA47_35 <= '\u0F3F')||LA47_35=='\u0F48'||(LA47_35 >= '\u0F6B' && LA47_35 <= '\u0F87')||(LA47_35 >= '\u0F8C' && LA47_35 <= '\u0FFF')||LA47_35=='\u1022'||LA47_35=='\u1028'||(LA47_35 >= '\u102B' && LA47_35 <= '\u104F')||(LA47_35 >= '\u1056' && LA47_35 <= '\u109F')||(LA47_35 >= '\u10C6' && LA47_35 <= '\u10CF')||LA47_35=='\u10FB'||(LA47_35 >= '\u10FD' && LA47_35 <= '\u10FF')||(LA47_35 >= '\u115A' && LA47_35 <= '\u115E')||(LA47_35 >= '\u11A3' && LA47_35 <= '\u11A7')||(LA47_35 >= '\u11FA' && LA47_35 <= '\u11FF')||LA47_35=='\u1249'||(LA47_35 >= '\u124E' && LA47_35 <= '\u124F')||LA47_35=='\u1257'||LA47_35=='\u1259'||(LA47_35 >= '\u125E' && LA47_35 <= '\u125F')||LA47_35=='\u1289'||(LA47_35 >= '\u128E' && LA47_35 <= '\u128F')||LA47_35=='\u12B1'||(LA47_35 >= '\u12B6' && LA47_35 <= '\u12B7')||LA47_35=='\u12BF'||LA47_35=='\u12C1'||(LA47_35 >= '\u12C6' && LA47_35 <= '\u12C7')||LA47_35=='\u12D7'||LA47_35=='\u1311'||(LA47_35 >= '\u1316' && LA47_35 <= '\u1317')||(LA47_35 >= '\u135B' && LA47_35 <= '\u137F')||(LA47_35 >= '\u1390' && LA47_35 <= '\u139F')||(LA47_35 >= '\u13F5' && LA47_35 <= '\u1400')||(LA47_35 >= '\u166D' && LA47_35 <= '\u166E')||(LA47_35 >= '\u1677' && LA47_35 <= '\u1680')||(LA47_35 >= '\u169B' && LA47_35 <= '\u169F')||(LA47_35 >= '\u16EB' && LA47_35 <= '\u16ED')||(LA47_35 >= '\u16F1' && LA47_35 <= '\u16FF')||LA47_35=='\u170D'||(LA47_35 >= '\u1712' && LA47_35 <= '\u171F')||(LA47_35 >= '\u1732' && LA47_35 <= '\u173F')||(LA47_35 >= '\u1752' && LA47_35 <= '\u175F')||LA47_35=='\u176D'||(LA47_35 >= '\u1771' && LA47_35 <= '\u177F')||(LA47_35 >= '\u17B4' && LA47_35 <= '\u17D6')||(LA47_35 >= '\u17D8' && LA47_35 <= '\u17DB')||(LA47_35 >= '\u17DD' && LA47_35 <= '\u181F')||(LA47_35 >= '\u1878' && LA47_35 <= '\u187F')||(LA47_35 >= '\u18A9' && LA47_35 <= '\u18FF')||(LA47_35 >= '\u191D' && LA47_35 <= '\u194F')||(LA47_35 >= '\u196E' && LA47_35 <= '\u196F')||(LA47_35 >= '\u1975' && LA47_35 <= '\u197F')||(LA47_35 >= '\u19AA' && LA47_35 <= '\u19C0')||(LA47_35 >= '\u19C8' && LA47_35 <= '\u19FF')||(LA47_35 >= '\u1A17' && LA47_35 <= '\u1CFF')||(LA47_35 >= '\u1DC0' && LA47_35 <= '\u1DFF')||(LA47_35 >= '\u1E9C' && LA47_35 <= '\u1E9F')||(LA47_35 >= '\u1EFA' && LA47_35 <= '\u1EFF')||(LA47_35 >= '\u1F16' && LA47_35 <= '\u1F17')||(LA47_35 >= '\u1F1E' && LA47_35 <= '\u1F1F')||(LA47_35 >= '\u1F46' && LA47_35 <= '\u1F47')||(LA47_35 >= '\u1F4E' && LA47_35 <= '\u1F4F')||LA47_35=='\u1F58'||LA47_35=='\u1F5A'||LA47_35=='\u1F5C'||LA47_35=='\u1F5E'||(LA47_35 >= '\u1F7E' && LA47_35 <= '\u1F7F')||LA47_35=='\u1FB5'||LA47_35=='\u1FBD'||(LA47_35 >= '\u1FBF' && LA47_35 <= '\u1FC1')||LA47_35=='\u1FC5'||(LA47_35 >= '\u1FCD' && LA47_35 <= '\u1FCF')||(LA47_35 >= '\u1FD4' && LA47_35 <= '\u1FD5')||(LA47_35 >= '\u1FDC' && LA47_35 <= '\u1FDF')||(LA47_35 >= '\u1FED' && LA47_35 <= '\u1FF1')||LA47_35=='\u1FF5'||(LA47_35 >= '\u1FFD' && LA47_35 <= '\u2070')||(LA47_35 >= '\u2072' && LA47_35 <= '\u207E')||(LA47_35 >= '\u2080' && LA47_35 <= '\u208F')||(LA47_35 >= '\u2095' && LA47_35 <= '\u2101')||(LA47_35 >= '\u2103' && LA47_35 <= '\u2106')||(LA47_35 >= '\u2108' && LA47_35 <= '\u2109')||LA47_35=='\u2114'||(LA47_35 >= '\u2116' && LA47_35 <= '\u2117')||(LA47_35 >= '\u211E' && LA47_35 <= '\u2123')||LA47_35=='\u2125'||LA47_35=='\u2127'||LA47_35=='\u2129'||LA47_35=='\u2132'||(LA47_35 >= '\u213A' && LA47_35 <= '\u213B')||(LA47_35 >= '\u2140' && LA47_35 <= '\u2144')||(LA47_35 >= '\u214A' && LA47_35 <= '\u215F')||(LA47_35 >= '\u2184' && LA47_35 <= '\u2BFF')||LA47_35=='\u2C2F'||(LA47_35 >= '\u2C5F' && LA47_35 <= '\u2C7F')||(LA47_35 >= '\u2CE5' && LA47_35 <= '\u2CFF')||(LA47_35 >= '\u2D26' && LA47_35 <= '\u2D2F')||(LA47_35 >= '\u2D66' && LA47_35 <= '\u2D6E')||(LA47_35 >= '\u2D70' && LA47_35 <= '\u2D7F')||(LA47_35 >= '\u2D97' && LA47_35 <= '\u2D9F')||LA47_35=='\u2DA7'||LA47_35=='\u2DAF'||LA47_35=='\u2DB7'||LA47_35=='\u2DBF'||LA47_35=='\u2DC7'||LA47_35=='\u2DCF'||LA47_35=='\u2DD7'||(LA47_35 >= '\u2DDF' && LA47_35 <= '\u3004')||(LA47_35 >= '\u3008' && LA47_35 <= '\u3020')||(LA47_35 >= '\u302A' && LA47_35 <= '\u3030')||(LA47_35 >= '\u3036' && LA47_35 <= '\u3037')||(LA47_35 >= '\u303D' && LA47_35 <= '\u3040')||(LA47_35 >= '\u3097' && LA47_35 <= '\u309A')||LA47_35=='\u30A0'||LA47_35=='\u30FB'||(LA47_35 >= '\u3100' && LA47_35 <= '\u3104')||(LA47_35 >= '\u312D' && LA47_35 <= '\u3130')||(LA47_35 >= '\u318F' && LA47_35 <= '\u319F')||(LA47_35 >= '\u31B8' && LA47_35 <= '\u31EF')||(LA47_35 >= '\u3200' && LA47_35 <= '\u33FF')||(LA47_35 >= '\u4DB6' && LA47_35 <= '\u4DFF')||(LA47_35 >= '\u9FBC' && LA47_35 <= '\u9FFF')||(LA47_35 >= '\uA48D' && LA47_35 <= '\uA7FF')||LA47_35=='\uA802'||LA47_35=='\uA806'||LA47_35=='\uA80B'||(LA47_35 >= '\uA823' && LA47_35 <= '\uABFF')||(LA47_35 >= '\uD7A4' && LA47_35 <= '\uF8FF')||(LA47_35 >= '\uFA2E' && LA47_35 <= '\uFA2F')||(LA47_35 >= '\uFA6B' && LA47_35 <= '\uFA6F')||(LA47_35 >= '\uFADA' && LA47_35 <= '\uFAFF')||(LA47_35 >= '\uFB07' && LA47_35 <= '\uFB12')||(LA47_35 >= '\uFB18' && LA47_35 <= '\uFB1C')||LA47_35=='\uFB1E'||LA47_35=='\uFB29'||LA47_35=='\uFB37'||LA47_35=='\uFB3D'||LA47_35=='\uFB3F'||LA47_35=='\uFB42'||LA47_35=='\uFB45'||(LA47_35 >= '\uFBB2' && LA47_35 <= '\uFBD2')||(LA47_35 >= '\uFD3E' && LA47_35 <= '\uFD4F')||(LA47_35 >= '\uFD90' && LA47_35 <= '\uFD91')||(LA47_35 >= '\uFDC8' && LA47_35 <= '\uFDEF')||(LA47_35 >= '\uFDFC' && LA47_35 <= '\uFE6F')||LA47_35=='\uFE75'||(LA47_35 >= '\uFEFD' && LA47_35 <= '\uFF20')||(LA47_35 >= '\uFF3B' && LA47_35 <= '\uFF40')||(LA47_35 >= '\uFF5B' && LA47_35 <= '\uFF65')||(LA47_35 >= '\uFFBF' && LA47_35 <= '\uFFC1')||(LA47_35 >= '\uFFC8' && LA47_35 <= '\uFFC9')||(LA47_35 >= '\uFFD0' && LA47_35 <= '\uFFD1')||(LA47_35 >= '\uFFD8' && LA47_35 <= '\uFFD9')||(LA47_35 >= '\uFFDD' && LA47_35 <= '\uFFFF')) && (( !_seeWord ))) {s = 63;}

                        else s = 33;

                         
                        input.seek(index47_35);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA47_34 = input.LA(1);

                         
                        int index47_34 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA47_34 >= 'A' && LA47_34 <= 'Z')||LA47_34=='_'||(LA47_34 >= 'a' && LA47_34 <= 'z')||LA47_34=='\u00AA'||LA47_34=='\u00B5'||LA47_34=='\u00BA'||(LA47_34 >= '\u00C0' && LA47_34 <= '\u00D6')||(LA47_34 >= '\u00D8' && LA47_34 <= '\u00F6')||(LA47_34 >= '\u00F8' && LA47_34 <= '\u0241')||(LA47_34 >= '\u0250' && LA47_34 <= '\u02C1')||(LA47_34 >= '\u02C6' && LA47_34 <= '\u02D1')||(LA47_34 >= '\u02E0' && LA47_34 <= '\u02E4')||LA47_34=='\u02EE'||LA47_34=='\u037A'||LA47_34=='\u0386'||(LA47_34 >= '\u0388' && LA47_34 <= '\u038A')||LA47_34=='\u038C'||(LA47_34 >= '\u038E' && LA47_34 <= '\u03A1')||(LA47_34 >= '\u03A3' && LA47_34 <= '\u03CE')||(LA47_34 >= '\u03D0' && LA47_34 <= '\u03F5')||(LA47_34 >= '\u03F7' && LA47_34 <= '\u0481')||(LA47_34 >= '\u048A' && LA47_34 <= '\u04CE')||(LA47_34 >= '\u04D0' && LA47_34 <= '\u04F9')||(LA47_34 >= '\u0500' && LA47_34 <= '\u050F')||(LA47_34 >= '\u0531' && LA47_34 <= '\u0556')||LA47_34=='\u0559'||(LA47_34 >= '\u0561' && LA47_34 <= '\u0587')||(LA47_34 >= '\u05D0' && LA47_34 <= '\u05EA')||(LA47_34 >= '\u05F0' && LA47_34 <= '\u05F2')||(LA47_34 >= '\u0621' && LA47_34 <= '\u063A')||(LA47_34 >= '\u0640' && LA47_34 <= '\u064A')||(LA47_34 >= '\u066E' && LA47_34 <= '\u066F')||(LA47_34 >= '\u0671' && LA47_34 <= '\u06D3')||LA47_34=='\u06D5'||(LA47_34 >= '\u06E5' && LA47_34 <= '\u06E6')||(LA47_34 >= '\u06EE' && LA47_34 <= '\u06EF')||(LA47_34 >= '\u06FA' && LA47_34 <= '\u06FC')||LA47_34=='\u06FF'||LA47_34=='\u0710'||(LA47_34 >= '\u0712' && LA47_34 <= '\u072F')||(LA47_34 >= '\u074D' && LA47_34 <= '\u076D')||(LA47_34 >= '\u0780' && LA47_34 <= '\u07A5')||LA47_34=='\u07B1'||(LA47_34 >= '\u0904' && LA47_34 <= '\u0939')||LA47_34=='\u093D'||LA47_34=='\u0950'||(LA47_34 >= '\u0958' && LA47_34 <= '\u0961')||LA47_34=='\u097D'||(LA47_34 >= '\u0985' && LA47_34 <= '\u098C')||(LA47_34 >= '\u098F' && LA47_34 <= '\u0990')||(LA47_34 >= '\u0993' && LA47_34 <= '\u09A8')||(LA47_34 >= '\u09AA' && LA47_34 <= '\u09B0')||LA47_34=='\u09B2'||(LA47_34 >= '\u09B6' && LA47_34 <= '\u09B9')||LA47_34=='\u09BD'||LA47_34=='\u09CE'||(LA47_34 >= '\u09DC' && LA47_34 <= '\u09DD')||(LA47_34 >= '\u09DF' && LA47_34 <= '\u09E1')||(LA47_34 >= '\u09F0' && LA47_34 <= '\u09F1')||(LA47_34 >= '\u0A05' && LA47_34 <= '\u0A0A')||(LA47_34 >= '\u0A0F' && LA47_34 <= '\u0A10')||(LA47_34 >= '\u0A13' && LA47_34 <= '\u0A28')||(LA47_34 >= '\u0A2A' && LA47_34 <= '\u0A30')||(LA47_34 >= '\u0A32' && LA47_34 <= '\u0A33')||(LA47_34 >= '\u0A35' && LA47_34 <= '\u0A36')||(LA47_34 >= '\u0A38' && LA47_34 <= '\u0A39')||(LA47_34 >= '\u0A59' && LA47_34 <= '\u0A5C')||LA47_34=='\u0A5E'||(LA47_34 >= '\u0A72' && LA47_34 <= '\u0A74')||(LA47_34 >= '\u0A85' && LA47_34 <= '\u0A8D')||(LA47_34 >= '\u0A8F' && LA47_34 <= '\u0A91')||(LA47_34 >= '\u0A93' && LA47_34 <= '\u0AA8')||(LA47_34 >= '\u0AAA' && LA47_34 <= '\u0AB0')||(LA47_34 >= '\u0AB2' && LA47_34 <= '\u0AB3')||(LA47_34 >= '\u0AB5' && LA47_34 <= '\u0AB9')||LA47_34=='\u0ABD'||LA47_34=='\u0AD0'||(LA47_34 >= '\u0AE0' && LA47_34 <= '\u0AE1')||(LA47_34 >= '\u0B05' && LA47_34 <= '\u0B0C')||(LA47_34 >= '\u0B0F' && LA47_34 <= '\u0B10')||(LA47_34 >= '\u0B13' && LA47_34 <= '\u0B28')||(LA47_34 >= '\u0B2A' && LA47_34 <= '\u0B30')||(LA47_34 >= '\u0B32' && LA47_34 <= '\u0B33')||(LA47_34 >= '\u0B35' && LA47_34 <= '\u0B39')||LA47_34=='\u0B3D'||(LA47_34 >= '\u0B5C' && LA47_34 <= '\u0B5D')||(LA47_34 >= '\u0B5F' && LA47_34 <= '\u0B61')||LA47_34=='\u0B71'||LA47_34=='\u0B83'||(LA47_34 >= '\u0B85' && LA47_34 <= '\u0B8A')||(LA47_34 >= '\u0B8E' && LA47_34 <= '\u0B90')||(LA47_34 >= '\u0B92' && LA47_34 <= '\u0B95')||(LA47_34 >= '\u0B99' && LA47_34 <= '\u0B9A')||LA47_34=='\u0B9C'||(LA47_34 >= '\u0B9E' && LA47_34 <= '\u0B9F')||(LA47_34 >= '\u0BA3' && LA47_34 <= '\u0BA4')||(LA47_34 >= '\u0BA8' && LA47_34 <= '\u0BAA')||(LA47_34 >= '\u0BAE' && LA47_34 <= '\u0BB9')||(LA47_34 >= '\u0C05' && LA47_34 <= '\u0C0C')||(LA47_34 >= '\u0C0E' && LA47_34 <= '\u0C10')||(LA47_34 >= '\u0C12' && LA47_34 <= '\u0C28')||(LA47_34 >= '\u0C2A' && LA47_34 <= '\u0C33')||(LA47_34 >= '\u0C35' && LA47_34 <= '\u0C39')||(LA47_34 >= '\u0C60' && LA47_34 <= '\u0C61')||(LA47_34 >= '\u0C85' && LA47_34 <= '\u0C8C')||(LA47_34 >= '\u0C8E' && LA47_34 <= '\u0C90')||(LA47_34 >= '\u0C92' && LA47_34 <= '\u0CA8')||(LA47_34 >= '\u0CAA' && LA47_34 <= '\u0CB3')||(LA47_34 >= '\u0CB5' && LA47_34 <= '\u0CB9')||LA47_34=='\u0CBD'||LA47_34=='\u0CDE'||(LA47_34 >= '\u0CE0' && LA47_34 <= '\u0CE1')||(LA47_34 >= '\u0D05' && LA47_34 <= '\u0D0C')||(LA47_34 >= '\u0D0E' && LA47_34 <= '\u0D10')||(LA47_34 >= '\u0D12' && LA47_34 <= '\u0D28')||(LA47_34 >= '\u0D2A' && LA47_34 <= '\u0D39')||(LA47_34 >= '\u0D60' && LA47_34 <= '\u0D61')||(LA47_34 >= '\u0D85' && LA47_34 <= '\u0D96')||(LA47_34 >= '\u0D9A' && LA47_34 <= '\u0DB1')||(LA47_34 >= '\u0DB3' && LA47_34 <= '\u0DBB')||LA47_34=='\u0DBD'||(LA47_34 >= '\u0DC0' && LA47_34 <= '\u0DC6')||(LA47_34 >= '\u0E01' && LA47_34 <= '\u0E30')||(LA47_34 >= '\u0E32' && LA47_34 <= '\u0E33')||(LA47_34 >= '\u0E40' && LA47_34 <= '\u0E46')||(LA47_34 >= '\u0E81' && LA47_34 <= '\u0E82')||LA47_34=='\u0E84'||(LA47_34 >= '\u0E87' && LA47_34 <= '\u0E88')||LA47_34=='\u0E8A'||LA47_34=='\u0E8D'||(LA47_34 >= '\u0E94' && LA47_34 <= '\u0E97')||(LA47_34 >= '\u0E99' && LA47_34 <= '\u0E9F')||(LA47_34 >= '\u0EA1' && LA47_34 <= '\u0EA3')||LA47_34=='\u0EA5'||LA47_34=='\u0EA7'||(LA47_34 >= '\u0EAA' && LA47_34 <= '\u0EAB')||(LA47_34 >= '\u0EAD' && LA47_34 <= '\u0EB0')||(LA47_34 >= '\u0EB2' && LA47_34 <= '\u0EB3')||LA47_34=='\u0EBD'||(LA47_34 >= '\u0EC0' && LA47_34 <= '\u0EC4')||LA47_34=='\u0EC6'||(LA47_34 >= '\u0EDC' && LA47_34 <= '\u0EDD')||LA47_34=='\u0F00'||(LA47_34 >= '\u0F40' && LA47_34 <= '\u0F47')||(LA47_34 >= '\u0F49' && LA47_34 <= '\u0F6A')||(LA47_34 >= '\u0F88' && LA47_34 <= '\u0F8B')||(LA47_34 >= '\u1000' && LA47_34 <= '\u1021')||(LA47_34 >= '\u1023' && LA47_34 <= '\u1027')||(LA47_34 >= '\u1029' && LA47_34 <= '\u102A')||(LA47_34 >= '\u1050' && LA47_34 <= '\u1055')||(LA47_34 >= '\u10A0' && LA47_34 <= '\u10C5')||(LA47_34 >= '\u10D0' && LA47_34 <= '\u10FA')||LA47_34=='\u10FC'||(LA47_34 >= '\u1100' && LA47_34 <= '\u1159')||(LA47_34 >= '\u115F' && LA47_34 <= '\u11A2')||(LA47_34 >= '\u11A8' && LA47_34 <= '\u11F9')||(LA47_34 >= '\u1200' && LA47_34 <= '\u1248')||(LA47_34 >= '\u124A' && LA47_34 <= '\u124D')||(LA47_34 >= '\u1250' && LA47_34 <= '\u1256')||LA47_34=='\u1258'||(LA47_34 >= '\u125A' && LA47_34 <= '\u125D')||(LA47_34 >= '\u1260' && LA47_34 <= '\u1288')||(LA47_34 >= '\u128A' && LA47_34 <= '\u128D')||(LA47_34 >= '\u1290' && LA47_34 <= '\u12B0')||(LA47_34 >= '\u12B2' && LA47_34 <= '\u12B5')||(LA47_34 >= '\u12B8' && LA47_34 <= '\u12BE')||LA47_34=='\u12C0'||(LA47_34 >= '\u12C2' && LA47_34 <= '\u12C5')||(LA47_34 >= '\u12C8' && LA47_34 <= '\u12D6')||(LA47_34 >= '\u12D8' && LA47_34 <= '\u1310')||(LA47_34 >= '\u1312' && LA47_34 <= '\u1315')||(LA47_34 >= '\u1318' && LA47_34 <= '\u135A')||(LA47_34 >= '\u1380' && LA47_34 <= '\u138F')||(LA47_34 >= '\u13A0' && LA47_34 <= '\u13F4')||(LA47_34 >= '\u1401' && LA47_34 <= '\u166C')||(LA47_34 >= '\u166F' && LA47_34 <= '\u1676')||(LA47_34 >= '\u1681' && LA47_34 <= '\u169A')||(LA47_34 >= '\u16A0' && LA47_34 <= '\u16EA')||(LA47_34 >= '\u16EE' && LA47_34 <= '\u16F0')||(LA47_34 >= '\u1700' && LA47_34 <= '\u170C')||(LA47_34 >= '\u170E' && LA47_34 <= '\u1711')||(LA47_34 >= '\u1720' && LA47_34 <= '\u1731')||(LA47_34 >= '\u1740' && LA47_34 <= '\u1751')||(LA47_34 >= '\u1760' && LA47_34 <= '\u176C')||(LA47_34 >= '\u176E' && LA47_34 <= '\u1770')||(LA47_34 >= '\u1780' && LA47_34 <= '\u17B3')||LA47_34=='\u17D7'||LA47_34=='\u17DC'||(LA47_34 >= '\u1820' && LA47_34 <= '\u1877')||(LA47_34 >= '\u1880' && LA47_34 <= '\u18A8')||(LA47_34 >= '\u1900' && LA47_34 <= '\u191C')||(LA47_34 >= '\u1950' && LA47_34 <= '\u196D')||(LA47_34 >= '\u1970' && LA47_34 <= '\u1974')||(LA47_34 >= '\u1980' && LA47_34 <= '\u19A9')||(LA47_34 >= '\u19C1' && LA47_34 <= '\u19C7')||(LA47_34 >= '\u1A00' && LA47_34 <= '\u1A16')||(LA47_34 >= '\u1D00' && LA47_34 <= '\u1DBF')||(LA47_34 >= '\u1E00' && LA47_34 <= '\u1E9B')||(LA47_34 >= '\u1EA0' && LA47_34 <= '\u1EF9')||(LA47_34 >= '\u1F00' && LA47_34 <= '\u1F15')||(LA47_34 >= '\u1F18' && LA47_34 <= '\u1F1D')||(LA47_34 >= '\u1F20' && LA47_34 <= '\u1F45')||(LA47_34 >= '\u1F48' && LA47_34 <= '\u1F4D')||(LA47_34 >= '\u1F50' && LA47_34 <= '\u1F57')||LA47_34=='\u1F59'||LA47_34=='\u1F5B'||LA47_34=='\u1F5D'||(LA47_34 >= '\u1F5F' && LA47_34 <= '\u1F7D')||(LA47_34 >= '\u1F80' && LA47_34 <= '\u1FB4')||(LA47_34 >= '\u1FB6' && LA47_34 <= '\u1FBC')||LA47_34=='\u1FBE'||(LA47_34 >= '\u1FC2' && LA47_34 <= '\u1FC4')||(LA47_34 >= '\u1FC6' && LA47_34 <= '\u1FCC')||(LA47_34 >= '\u1FD0' && LA47_34 <= '\u1FD3')||(LA47_34 >= '\u1FD6' && LA47_34 <= '\u1FDB')||(LA47_34 >= '\u1FE0' && LA47_34 <= '\u1FEC')||(LA47_34 >= '\u1FF2' && LA47_34 <= '\u1FF4')||(LA47_34 >= '\u1FF6' && LA47_34 <= '\u1FFC')||LA47_34=='\u2071'||LA47_34=='\u207F'||(LA47_34 >= '\u2090' && LA47_34 <= '\u2094')||LA47_34=='\u2102'||LA47_34=='\u2107'||(LA47_34 >= '\u210A' && LA47_34 <= '\u2113')||LA47_34=='\u2115'||(LA47_34 >= '\u2118' && LA47_34 <= '\u211D')||LA47_34=='\u2124'||LA47_34=='\u2126'||LA47_34=='\u2128'||(LA47_34 >= '\u212A' && LA47_34 <= '\u2131')||(LA47_34 >= '\u2133' && LA47_34 <= '\u2139')||(LA47_34 >= '\u213C' && LA47_34 <= '\u213F')||(LA47_34 >= '\u2145' && LA47_34 <= '\u2149')||(LA47_34 >= '\u2160' && LA47_34 <= '\u2183')||(LA47_34 >= '\u2C00' && LA47_34 <= '\u2C2E')||(LA47_34 >= '\u2C30' && LA47_34 <= '\u2C5E')||(LA47_34 >= '\u2C80' && LA47_34 <= '\u2CE4')||(LA47_34 >= '\u2D00' && LA47_34 <= '\u2D25')||(LA47_34 >= '\u2D30' && LA47_34 <= '\u2D65')||LA47_34=='\u2D6F'||(LA47_34 >= '\u2D80' && LA47_34 <= '\u2D96')||(LA47_34 >= '\u2DA0' && LA47_34 <= '\u2DA6')||(LA47_34 >= '\u2DA8' && LA47_34 <= '\u2DAE')||(LA47_34 >= '\u2DB0' && LA47_34 <= '\u2DB6')||(LA47_34 >= '\u2DB8' && LA47_34 <= '\u2DBE')||(LA47_34 >= '\u2DC0' && LA47_34 <= '\u2DC6')||(LA47_34 >= '\u2DC8' && LA47_34 <= '\u2DCE')||(LA47_34 >= '\u2DD0' && LA47_34 <= '\u2DD6')||(LA47_34 >= '\u2DD8' && LA47_34 <= '\u2DDE')||(LA47_34 >= '\u3005' && LA47_34 <= '\u3007')||(LA47_34 >= '\u3021' && LA47_34 <= '\u3029')||(LA47_34 >= '\u3031' && LA47_34 <= '\u3035')||(LA47_34 >= '\u3038' && LA47_34 <= '\u303C')||(LA47_34 >= '\u3041' && LA47_34 <= '\u3096')||(LA47_34 >= '\u309B' && LA47_34 <= '\u309F')||(LA47_34 >= '\u30A1' && LA47_34 <= '\u30FA')||(LA47_34 >= '\u30FC' && LA47_34 <= '\u30FF')||(LA47_34 >= '\u3105' && LA47_34 <= '\u312C')||(LA47_34 >= '\u3131' && LA47_34 <= '\u318E')||(LA47_34 >= '\u31A0' && LA47_34 <= '\u31B7')||(LA47_34 >= '\u31F0' && LA47_34 <= '\u31FF')||(LA47_34 >= '\u3400' && LA47_34 <= '\u4DB5')||(LA47_34 >= '\u4E00' && LA47_34 <= '\u9FBB')||(LA47_34 >= '\uA000' && LA47_34 <= '\uA48C')||(LA47_34 >= '\uA800' && LA47_34 <= '\uA801')||(LA47_34 >= '\uA803' && LA47_34 <= '\uA805')||(LA47_34 >= '\uA807' && LA47_34 <= '\uA80A')||(LA47_34 >= '\uA80C' && LA47_34 <= '\uA822')||(LA47_34 >= '\uAC00' && LA47_34 <= '\uD7A3')||(LA47_34 >= '\uF900' && LA47_34 <= '\uFA2D')||(LA47_34 >= '\uFA30' && LA47_34 <= '\uFA6A')||(LA47_34 >= '\uFA70' && LA47_34 <= '\uFAD9')||(LA47_34 >= '\uFB00' && LA47_34 <= '\uFB06')||(LA47_34 >= '\uFB13' && LA47_34 <= '\uFB17')||LA47_34=='\uFB1D'||(LA47_34 >= '\uFB1F' && LA47_34 <= '\uFB28')||(LA47_34 >= '\uFB2A' && LA47_34 <= '\uFB36')||(LA47_34 >= '\uFB38' && LA47_34 <= '\uFB3C')||LA47_34=='\uFB3E'||(LA47_34 >= '\uFB40' && LA47_34 <= '\uFB41')||(LA47_34 >= '\uFB43' && LA47_34 <= '\uFB44')||(LA47_34 >= '\uFB46' && LA47_34 <= '\uFBB1')||(LA47_34 >= '\uFBD3' && LA47_34 <= '\uFD3D')||(LA47_34 >= '\uFD50' && LA47_34 <= '\uFD8F')||(LA47_34 >= '\uFD92' && LA47_34 <= '\uFDC7')||(LA47_34 >= '\uFDF0' && LA47_34 <= '\uFDFB')||(LA47_34 >= '\uFE70' && LA47_34 <= '\uFE74')||(LA47_34 >= '\uFE76' && LA47_34 <= '\uFEFC')||(LA47_34 >= '\uFF21' && LA47_34 <= '\uFF3A')||(LA47_34 >= '\uFF41' && LA47_34 <= '\uFF5A')||(LA47_34 >= '\uFF66' && LA47_34 <= '\uFFBE')||(LA47_34 >= '\uFFC2' && LA47_34 <= '\uFFC7')||(LA47_34 >= '\uFFCA' && LA47_34 <= '\uFFCF')||(LA47_34 >= '\uFFD2' && LA47_34 <= '\uFFD7')||(LA47_34 >= '\uFFDA' && LA47_34 <= '\uFFDC')) ) {s = 60;}

                        else if ( ((LA47_34 >= '\u0000' && LA47_34 <= '\t')||(LA47_34 >= '\u000B' && LA47_34 <= '@')||(LA47_34 >= '[' && LA47_34 <= '^')||LA47_34=='`'||(LA47_34 >= '{' && LA47_34 <= '\u00A9')||(LA47_34 >= '\u00AB' && LA47_34 <= '\u00B4')||(LA47_34 >= '\u00B6' && LA47_34 <= '\u00B9')||(LA47_34 >= '\u00BB' && LA47_34 <= '\u00BF')||LA47_34=='\u00D7'||LA47_34=='\u00F7'||(LA47_34 >= '\u0242' && LA47_34 <= '\u024F')||(LA47_34 >= '\u02C2' && LA47_34 <= '\u02C5')||(LA47_34 >= '\u02D2' && LA47_34 <= '\u02DF')||(LA47_34 >= '\u02E5' && LA47_34 <= '\u02ED')||(LA47_34 >= '\u02EF' && LA47_34 <= '\u0379')||(LA47_34 >= '\u037B' && LA47_34 <= '\u0385')||LA47_34=='\u0387'||LA47_34=='\u038B'||LA47_34=='\u038D'||LA47_34=='\u03A2'||LA47_34=='\u03CF'||LA47_34=='\u03F6'||(LA47_34 >= '\u0482' && LA47_34 <= '\u0489')||LA47_34=='\u04CF'||(LA47_34 >= '\u04FA' && LA47_34 <= '\u04FF')||(LA47_34 >= '\u0510' && LA47_34 <= '\u0530')||(LA47_34 >= '\u0557' && LA47_34 <= '\u0558')||(LA47_34 >= '\u055A' && LA47_34 <= '\u0560')||(LA47_34 >= '\u0588' && LA47_34 <= '\u05CF')||(LA47_34 >= '\u05EB' && LA47_34 <= '\u05EF')||(LA47_34 >= '\u05F3' && LA47_34 <= '\u0620')||(LA47_34 >= '\u063B' && LA47_34 <= '\u063F')||(LA47_34 >= '\u064B' && LA47_34 <= '\u066D')||LA47_34=='\u0670'||LA47_34=='\u06D4'||(LA47_34 >= '\u06D6' && LA47_34 <= '\u06E4')||(LA47_34 >= '\u06E7' && LA47_34 <= '\u06ED')||(LA47_34 >= '\u06F0' && LA47_34 <= '\u06F9')||(LA47_34 >= '\u06FD' && LA47_34 <= '\u06FE')||(LA47_34 >= '\u0700' && LA47_34 <= '\u070F')||LA47_34=='\u0711'||(LA47_34 >= '\u0730' && LA47_34 <= '\u074C')||(LA47_34 >= '\u076E' && LA47_34 <= '\u077F')||(LA47_34 >= '\u07A6' && LA47_34 <= '\u07B0')||(LA47_34 >= '\u07B2' && LA47_34 <= '\u0903')||(LA47_34 >= '\u093A' && LA47_34 <= '\u093C')||(LA47_34 >= '\u093E' && LA47_34 <= '\u094F')||(LA47_34 >= '\u0951' && LA47_34 <= '\u0957')||(LA47_34 >= '\u0962' && LA47_34 <= '\u097C')||(LA47_34 >= '\u097E' && LA47_34 <= '\u0984')||(LA47_34 >= '\u098D' && LA47_34 <= '\u098E')||(LA47_34 >= '\u0991' && LA47_34 <= '\u0992')||LA47_34=='\u09A9'||LA47_34=='\u09B1'||(LA47_34 >= '\u09B3' && LA47_34 <= '\u09B5')||(LA47_34 >= '\u09BA' && LA47_34 <= '\u09BC')||(LA47_34 >= '\u09BE' && LA47_34 <= '\u09CD')||(LA47_34 >= '\u09CF' && LA47_34 <= '\u09DB')||LA47_34=='\u09DE'||(LA47_34 >= '\u09E2' && LA47_34 <= '\u09EF')||(LA47_34 >= '\u09F2' && LA47_34 <= '\u0A04')||(LA47_34 >= '\u0A0B' && LA47_34 <= '\u0A0E')||(LA47_34 >= '\u0A11' && LA47_34 <= '\u0A12')||LA47_34=='\u0A29'||LA47_34=='\u0A31'||LA47_34=='\u0A34'||LA47_34=='\u0A37'||(LA47_34 >= '\u0A3A' && LA47_34 <= '\u0A58')||LA47_34=='\u0A5D'||(LA47_34 >= '\u0A5F' && LA47_34 <= '\u0A71')||(LA47_34 >= '\u0A75' && LA47_34 <= '\u0A84')||LA47_34=='\u0A8E'||LA47_34=='\u0A92'||LA47_34=='\u0AA9'||LA47_34=='\u0AB1'||LA47_34=='\u0AB4'||(LA47_34 >= '\u0ABA' && LA47_34 <= '\u0ABC')||(LA47_34 >= '\u0ABE' && LA47_34 <= '\u0ACF')||(LA47_34 >= '\u0AD1' && LA47_34 <= '\u0ADF')||(LA47_34 >= '\u0AE2' && LA47_34 <= '\u0B04')||(LA47_34 >= '\u0B0D' && LA47_34 <= '\u0B0E')||(LA47_34 >= '\u0B11' && LA47_34 <= '\u0B12')||LA47_34=='\u0B29'||LA47_34=='\u0B31'||LA47_34=='\u0B34'||(LA47_34 >= '\u0B3A' && LA47_34 <= '\u0B3C')||(LA47_34 >= '\u0B3E' && LA47_34 <= '\u0B5B')||LA47_34=='\u0B5E'||(LA47_34 >= '\u0B62' && LA47_34 <= '\u0B70')||(LA47_34 >= '\u0B72' && LA47_34 <= '\u0B82')||LA47_34=='\u0B84'||(LA47_34 >= '\u0B8B' && LA47_34 <= '\u0B8D')||LA47_34=='\u0B91'||(LA47_34 >= '\u0B96' && LA47_34 <= '\u0B98')||LA47_34=='\u0B9B'||LA47_34=='\u0B9D'||(LA47_34 >= '\u0BA0' && LA47_34 <= '\u0BA2')||(LA47_34 >= '\u0BA5' && LA47_34 <= '\u0BA7')||(LA47_34 >= '\u0BAB' && LA47_34 <= '\u0BAD')||(LA47_34 >= '\u0BBA' && LA47_34 <= '\u0C04')||LA47_34=='\u0C0D'||LA47_34=='\u0C11'||LA47_34=='\u0C29'||LA47_34=='\u0C34'||(LA47_34 >= '\u0C3A' && LA47_34 <= '\u0C5F')||(LA47_34 >= '\u0C62' && LA47_34 <= '\u0C84')||LA47_34=='\u0C8D'||LA47_34=='\u0C91'||LA47_34=='\u0CA9'||LA47_34=='\u0CB4'||(LA47_34 >= '\u0CBA' && LA47_34 <= '\u0CBC')||(LA47_34 >= '\u0CBE' && LA47_34 <= '\u0CDD')||LA47_34=='\u0CDF'||(LA47_34 >= '\u0CE2' && LA47_34 <= '\u0D04')||LA47_34=='\u0D0D'||LA47_34=='\u0D11'||LA47_34=='\u0D29'||(LA47_34 >= '\u0D3A' && LA47_34 <= '\u0D5F')||(LA47_34 >= '\u0D62' && LA47_34 <= '\u0D84')||(LA47_34 >= '\u0D97' && LA47_34 <= '\u0D99')||LA47_34=='\u0DB2'||LA47_34=='\u0DBC'||(LA47_34 >= '\u0DBE' && LA47_34 <= '\u0DBF')||(LA47_34 >= '\u0DC7' && LA47_34 <= '\u0E00')||LA47_34=='\u0E31'||(LA47_34 >= '\u0E34' && LA47_34 <= '\u0E3F')||(LA47_34 >= '\u0E47' && LA47_34 <= '\u0E80')||LA47_34=='\u0E83'||(LA47_34 >= '\u0E85' && LA47_34 <= '\u0E86')||LA47_34=='\u0E89'||(LA47_34 >= '\u0E8B' && LA47_34 <= '\u0E8C')||(LA47_34 >= '\u0E8E' && LA47_34 <= '\u0E93')||LA47_34=='\u0E98'||LA47_34=='\u0EA0'||LA47_34=='\u0EA4'||LA47_34=='\u0EA6'||(LA47_34 >= '\u0EA8' && LA47_34 <= '\u0EA9')||LA47_34=='\u0EAC'||LA47_34=='\u0EB1'||(LA47_34 >= '\u0EB4' && LA47_34 <= '\u0EBC')||(LA47_34 >= '\u0EBE' && LA47_34 <= '\u0EBF')||LA47_34=='\u0EC5'||(LA47_34 >= '\u0EC7' && LA47_34 <= '\u0EDB')||(LA47_34 >= '\u0EDE' && LA47_34 <= '\u0EFF')||(LA47_34 >= '\u0F01' && LA47_34 <= '\u0F3F')||LA47_34=='\u0F48'||(LA47_34 >= '\u0F6B' && LA47_34 <= '\u0F87')||(LA47_34 >= '\u0F8C' && LA47_34 <= '\u0FFF')||LA47_34=='\u1022'||LA47_34=='\u1028'||(LA47_34 >= '\u102B' && LA47_34 <= '\u104F')||(LA47_34 >= '\u1056' && LA47_34 <= '\u109F')||(LA47_34 >= '\u10C6' && LA47_34 <= '\u10CF')||LA47_34=='\u10FB'||(LA47_34 >= '\u10FD' && LA47_34 <= '\u10FF')||(LA47_34 >= '\u115A' && LA47_34 <= '\u115E')||(LA47_34 >= '\u11A3' && LA47_34 <= '\u11A7')||(LA47_34 >= '\u11FA' && LA47_34 <= '\u11FF')||LA47_34=='\u1249'||(LA47_34 >= '\u124E' && LA47_34 <= '\u124F')||LA47_34=='\u1257'||LA47_34=='\u1259'||(LA47_34 >= '\u125E' && LA47_34 <= '\u125F')||LA47_34=='\u1289'||(LA47_34 >= '\u128E' && LA47_34 <= '\u128F')||LA47_34=='\u12B1'||(LA47_34 >= '\u12B6' && LA47_34 <= '\u12B7')||LA47_34=='\u12BF'||LA47_34=='\u12C1'||(LA47_34 >= '\u12C6' && LA47_34 <= '\u12C7')||LA47_34=='\u12D7'||LA47_34=='\u1311'||(LA47_34 >= '\u1316' && LA47_34 <= '\u1317')||(LA47_34 >= '\u135B' && LA47_34 <= '\u137F')||(LA47_34 >= '\u1390' && LA47_34 <= '\u139F')||(LA47_34 >= '\u13F5' && LA47_34 <= '\u1400')||(LA47_34 >= '\u166D' && LA47_34 <= '\u166E')||(LA47_34 >= '\u1677' && LA47_34 <= '\u1680')||(LA47_34 >= '\u169B' && LA47_34 <= '\u169F')||(LA47_34 >= '\u16EB' && LA47_34 <= '\u16ED')||(LA47_34 >= '\u16F1' && LA47_34 <= '\u16FF')||LA47_34=='\u170D'||(LA47_34 >= '\u1712' && LA47_34 <= '\u171F')||(LA47_34 >= '\u1732' && LA47_34 <= '\u173F')||(LA47_34 >= '\u1752' && LA47_34 <= '\u175F')||LA47_34=='\u176D'||(LA47_34 >= '\u1771' && LA47_34 <= '\u177F')||(LA47_34 >= '\u17B4' && LA47_34 <= '\u17D6')||(LA47_34 >= '\u17D8' && LA47_34 <= '\u17DB')||(LA47_34 >= '\u17DD' && LA47_34 <= '\u181F')||(LA47_34 >= '\u1878' && LA47_34 <= '\u187F')||(LA47_34 >= '\u18A9' && LA47_34 <= '\u18FF')||(LA47_34 >= '\u191D' && LA47_34 <= '\u194F')||(LA47_34 >= '\u196E' && LA47_34 <= '\u196F')||(LA47_34 >= '\u1975' && LA47_34 <= '\u197F')||(LA47_34 >= '\u19AA' && LA47_34 <= '\u19C0')||(LA47_34 >= '\u19C8' && LA47_34 <= '\u19FF')||(LA47_34 >= '\u1A17' && LA47_34 <= '\u1CFF')||(LA47_34 >= '\u1DC0' && LA47_34 <= '\u1DFF')||(LA47_34 >= '\u1E9C' && LA47_34 <= '\u1E9F')||(LA47_34 >= '\u1EFA' && LA47_34 <= '\u1EFF')||(LA47_34 >= '\u1F16' && LA47_34 <= '\u1F17')||(LA47_34 >= '\u1F1E' && LA47_34 <= '\u1F1F')||(LA47_34 >= '\u1F46' && LA47_34 <= '\u1F47')||(LA47_34 >= '\u1F4E' && LA47_34 <= '\u1F4F')||LA47_34=='\u1F58'||LA47_34=='\u1F5A'||LA47_34=='\u1F5C'||LA47_34=='\u1F5E'||(LA47_34 >= '\u1F7E' && LA47_34 <= '\u1F7F')||LA47_34=='\u1FB5'||LA47_34=='\u1FBD'||(LA47_34 >= '\u1FBF' && LA47_34 <= '\u1FC1')||LA47_34=='\u1FC5'||(LA47_34 >= '\u1FCD' && LA47_34 <= '\u1FCF')||(LA47_34 >= '\u1FD4' && LA47_34 <= '\u1FD5')||(LA47_34 >= '\u1FDC' && LA47_34 <= '\u1FDF')||(LA47_34 >= '\u1FED' && LA47_34 <= '\u1FF1')||LA47_34=='\u1FF5'||(LA47_34 >= '\u1FFD' && LA47_34 <= '\u2070')||(LA47_34 >= '\u2072' && LA47_34 <= '\u207E')||(LA47_34 >= '\u2080' && LA47_34 <= '\u208F')||(LA47_34 >= '\u2095' && LA47_34 <= '\u2101')||(LA47_34 >= '\u2103' && LA47_34 <= '\u2106')||(LA47_34 >= '\u2108' && LA47_34 <= '\u2109')||LA47_34=='\u2114'||(LA47_34 >= '\u2116' && LA47_34 <= '\u2117')||(LA47_34 >= '\u211E' && LA47_34 <= '\u2123')||LA47_34=='\u2125'||LA47_34=='\u2127'||LA47_34=='\u2129'||LA47_34=='\u2132'||(LA47_34 >= '\u213A' && LA47_34 <= '\u213B')||(LA47_34 >= '\u2140' && LA47_34 <= '\u2144')||(LA47_34 >= '\u214A' && LA47_34 <= '\u215F')||(LA47_34 >= '\u2184' && LA47_34 <= '\u2BFF')||LA47_34=='\u2C2F'||(LA47_34 >= '\u2C5F' && LA47_34 <= '\u2C7F')||(LA47_34 >= '\u2CE5' && LA47_34 <= '\u2CFF')||(LA47_34 >= '\u2D26' && LA47_34 <= '\u2D2F')||(LA47_34 >= '\u2D66' && LA47_34 <= '\u2D6E')||(LA47_34 >= '\u2D70' && LA47_34 <= '\u2D7F')||(LA47_34 >= '\u2D97' && LA47_34 <= '\u2D9F')||LA47_34=='\u2DA7'||LA47_34=='\u2DAF'||LA47_34=='\u2DB7'||LA47_34=='\u2DBF'||LA47_34=='\u2DC7'||LA47_34=='\u2DCF'||LA47_34=='\u2DD7'||(LA47_34 >= '\u2DDF' && LA47_34 <= '\u3004')||(LA47_34 >= '\u3008' && LA47_34 <= '\u3020')||(LA47_34 >= '\u302A' && LA47_34 <= '\u3030')||(LA47_34 >= '\u3036' && LA47_34 <= '\u3037')||(LA47_34 >= '\u303D' && LA47_34 <= '\u3040')||(LA47_34 >= '\u3097' && LA47_34 <= '\u309A')||LA47_34=='\u30A0'||LA47_34=='\u30FB'||(LA47_34 >= '\u3100' && LA47_34 <= '\u3104')||(LA47_34 >= '\u312D' && LA47_34 <= '\u3130')||(LA47_34 >= '\u318F' && LA47_34 <= '\u319F')||(LA47_34 >= '\u31B8' && LA47_34 <= '\u31EF')||(LA47_34 >= '\u3200' && LA47_34 <= '\u33FF')||(LA47_34 >= '\u4DB6' && LA47_34 <= '\u4DFF')||(LA47_34 >= '\u9FBC' && LA47_34 <= '\u9FFF')||(LA47_34 >= '\uA48D' && LA47_34 <= '\uA7FF')||LA47_34=='\uA802'||LA47_34=='\uA806'||LA47_34=='\uA80B'||(LA47_34 >= '\uA823' && LA47_34 <= '\uABFF')||(LA47_34 >= '\uD7A4' && LA47_34 <= '\uF8FF')||(LA47_34 >= '\uFA2E' && LA47_34 <= '\uFA2F')||(LA47_34 >= '\uFA6B' && LA47_34 <= '\uFA6F')||(LA47_34 >= '\uFADA' && LA47_34 <= '\uFAFF')||(LA47_34 >= '\uFB07' && LA47_34 <= '\uFB12')||(LA47_34 >= '\uFB18' && LA47_34 <= '\uFB1C')||LA47_34=='\uFB1E'||LA47_34=='\uFB29'||LA47_34=='\uFB37'||LA47_34=='\uFB3D'||LA47_34=='\uFB3F'||LA47_34=='\uFB42'||LA47_34=='\uFB45'||(LA47_34 >= '\uFBB2' && LA47_34 <= '\uFBD2')||(LA47_34 >= '\uFD3E' && LA47_34 <= '\uFD4F')||(LA47_34 >= '\uFD90' && LA47_34 <= '\uFD91')||(LA47_34 >= '\uFDC8' && LA47_34 <= '\uFDEF')||(LA47_34 >= '\uFDFC' && LA47_34 <= '\uFE6F')||LA47_34=='\uFE75'||(LA47_34 >= '\uFEFD' && LA47_34 <= '\uFF20')||(LA47_34 >= '\uFF3B' && LA47_34 <= '\uFF40')||(LA47_34 >= '\uFF5B' && LA47_34 <= '\uFF65')||(LA47_34 >= '\uFFBF' && LA47_34 <= '\uFFC1')||(LA47_34 >= '\uFFC8' && LA47_34 <= '\uFFC9')||(LA47_34 >= '\uFFD0' && LA47_34 <= '\uFFD1')||(LA47_34 >= '\uFFD8' && LA47_34 <= '\uFFD9')||(LA47_34 >= '\uFFDD' && LA47_34 <= '\uFFFF')) && (( !_seeWord ))) {s = 61;}

                        else s = 33;

                         
                        input.seek(index47_34);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA47_66 = input.LA(1);

                         
                        int index47_66 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !_seeWord )) ) {s = 72;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index47_66);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA47_36 = input.LA(1);

                         
                        int index47_36 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !_seeWord )) ) {s = 64;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index47_36);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA47_71 = input.LA(1);

                         
                        int index47_71 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !_seeWord )) ) {s = 73;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index47_71);

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA47_60 = input.LA(1);

                         
                        int index47_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((LA47_60 >= 'A' && LA47_60 <= 'Z')||LA47_60=='_'||(LA47_60 >= 'a' && LA47_60 <= 'z')||LA47_60=='\u00AA'||LA47_60=='\u00B5'||LA47_60=='\u00BA'||(LA47_60 >= '\u00C0' && LA47_60 <= '\u00D6')||(LA47_60 >= '\u00D8' && LA47_60 <= '\u00F6')||(LA47_60 >= '\u00F8' && LA47_60 <= '\u0241')||(LA47_60 >= '\u0250' && LA47_60 <= '\u02C1')||(LA47_60 >= '\u02C6' && LA47_60 <= '\u02D1')||(LA47_60 >= '\u02E0' && LA47_60 <= '\u02E4')||LA47_60=='\u02EE'||LA47_60=='\u037A'||LA47_60=='\u0386'||(LA47_60 >= '\u0388' && LA47_60 <= '\u038A')||LA47_60=='\u038C'||(LA47_60 >= '\u038E' && LA47_60 <= '\u03A1')||(LA47_60 >= '\u03A3' && LA47_60 <= '\u03CE')||(LA47_60 >= '\u03D0' && LA47_60 <= '\u03F5')||(LA47_60 >= '\u03F7' && LA47_60 <= '\u0481')||(LA47_60 >= '\u048A' && LA47_60 <= '\u04CE')||(LA47_60 >= '\u04D0' && LA47_60 <= '\u04F9')||(LA47_60 >= '\u0500' && LA47_60 <= '\u050F')||(LA47_60 >= '\u0531' && LA47_60 <= '\u0556')||LA47_60=='\u0559'||(LA47_60 >= '\u0561' && LA47_60 <= '\u0587')||(LA47_60 >= '\u05D0' && LA47_60 <= '\u05EA')||(LA47_60 >= '\u05F0' && LA47_60 <= '\u05F2')||(LA47_60 >= '\u0621' && LA47_60 <= '\u063A')||(LA47_60 >= '\u0640' && LA47_60 <= '\u064A')||(LA47_60 >= '\u066E' && LA47_60 <= '\u066F')||(LA47_60 >= '\u0671' && LA47_60 <= '\u06D3')||LA47_60=='\u06D5'||(LA47_60 >= '\u06E5' && LA47_60 <= '\u06E6')||(LA47_60 >= '\u06EE' && LA47_60 <= '\u06EF')||(LA47_60 >= '\u06FA' && LA47_60 <= '\u06FC')||LA47_60=='\u06FF'||LA47_60=='\u0710'||(LA47_60 >= '\u0712' && LA47_60 <= '\u072F')||(LA47_60 >= '\u074D' && LA47_60 <= '\u076D')||(LA47_60 >= '\u0780' && LA47_60 <= '\u07A5')||LA47_60=='\u07B1'||(LA47_60 >= '\u0904' && LA47_60 <= '\u0939')||LA47_60=='\u093D'||LA47_60=='\u0950'||(LA47_60 >= '\u0958' && LA47_60 <= '\u0961')||LA47_60=='\u097D'||(LA47_60 >= '\u0985' && LA47_60 <= '\u098C')||(LA47_60 >= '\u098F' && LA47_60 <= '\u0990')||(LA47_60 >= '\u0993' && LA47_60 <= '\u09A8')||(LA47_60 >= '\u09AA' && LA47_60 <= '\u09B0')||LA47_60=='\u09B2'||(LA47_60 >= '\u09B6' && LA47_60 <= '\u09B9')||LA47_60=='\u09BD'||LA47_60=='\u09CE'||(LA47_60 >= '\u09DC' && LA47_60 <= '\u09DD')||(LA47_60 >= '\u09DF' && LA47_60 <= '\u09E1')||(LA47_60 >= '\u09F0' && LA47_60 <= '\u09F1')||(LA47_60 >= '\u0A05' && LA47_60 <= '\u0A0A')||(LA47_60 >= '\u0A0F' && LA47_60 <= '\u0A10')||(LA47_60 >= '\u0A13' && LA47_60 <= '\u0A28')||(LA47_60 >= '\u0A2A' && LA47_60 <= '\u0A30')||(LA47_60 >= '\u0A32' && LA47_60 <= '\u0A33')||(LA47_60 >= '\u0A35' && LA47_60 <= '\u0A36')||(LA47_60 >= '\u0A38' && LA47_60 <= '\u0A39')||(LA47_60 >= '\u0A59' && LA47_60 <= '\u0A5C')||LA47_60=='\u0A5E'||(LA47_60 >= '\u0A72' && LA47_60 <= '\u0A74')||(LA47_60 >= '\u0A85' && LA47_60 <= '\u0A8D')||(LA47_60 >= '\u0A8F' && LA47_60 <= '\u0A91')||(LA47_60 >= '\u0A93' && LA47_60 <= '\u0AA8')||(LA47_60 >= '\u0AAA' && LA47_60 <= '\u0AB0')||(LA47_60 >= '\u0AB2' && LA47_60 <= '\u0AB3')||(LA47_60 >= '\u0AB5' && LA47_60 <= '\u0AB9')||LA47_60=='\u0ABD'||LA47_60=='\u0AD0'||(LA47_60 >= '\u0AE0' && LA47_60 <= '\u0AE1')||(LA47_60 >= '\u0B05' && LA47_60 <= '\u0B0C')||(LA47_60 >= '\u0B0F' && LA47_60 <= '\u0B10')||(LA47_60 >= '\u0B13' && LA47_60 <= '\u0B28')||(LA47_60 >= '\u0B2A' && LA47_60 <= '\u0B30')||(LA47_60 >= '\u0B32' && LA47_60 <= '\u0B33')||(LA47_60 >= '\u0B35' && LA47_60 <= '\u0B39')||LA47_60=='\u0B3D'||(LA47_60 >= '\u0B5C' && LA47_60 <= '\u0B5D')||(LA47_60 >= '\u0B5F' && LA47_60 <= '\u0B61')||LA47_60=='\u0B71'||LA47_60=='\u0B83'||(LA47_60 >= '\u0B85' && LA47_60 <= '\u0B8A')||(LA47_60 >= '\u0B8E' && LA47_60 <= '\u0B90')||(LA47_60 >= '\u0B92' && LA47_60 <= '\u0B95')||(LA47_60 >= '\u0B99' && LA47_60 <= '\u0B9A')||LA47_60=='\u0B9C'||(LA47_60 >= '\u0B9E' && LA47_60 <= '\u0B9F')||(LA47_60 >= '\u0BA3' && LA47_60 <= '\u0BA4')||(LA47_60 >= '\u0BA8' && LA47_60 <= '\u0BAA')||(LA47_60 >= '\u0BAE' && LA47_60 <= '\u0BB9')||(LA47_60 >= '\u0C05' && LA47_60 <= '\u0C0C')||(LA47_60 >= '\u0C0E' && LA47_60 <= '\u0C10')||(LA47_60 >= '\u0C12' && LA47_60 <= '\u0C28')||(LA47_60 >= '\u0C2A' && LA47_60 <= '\u0C33')||(LA47_60 >= '\u0C35' && LA47_60 <= '\u0C39')||(LA47_60 >= '\u0C60' && LA47_60 <= '\u0C61')||(LA47_60 >= '\u0C85' && LA47_60 <= '\u0C8C')||(LA47_60 >= '\u0C8E' && LA47_60 <= '\u0C90')||(LA47_60 >= '\u0C92' && LA47_60 <= '\u0CA8')||(LA47_60 >= '\u0CAA' && LA47_60 <= '\u0CB3')||(LA47_60 >= '\u0CB5' && LA47_60 <= '\u0CB9')||LA47_60=='\u0CBD'||LA47_60=='\u0CDE'||(LA47_60 >= '\u0CE0' && LA47_60 <= '\u0CE1')||(LA47_60 >= '\u0D05' && LA47_60 <= '\u0D0C')||(LA47_60 >= '\u0D0E' && LA47_60 <= '\u0D10')||(LA47_60 >= '\u0D12' && LA47_60 <= '\u0D28')||(LA47_60 >= '\u0D2A' && LA47_60 <= '\u0D39')||(LA47_60 >= '\u0D60' && LA47_60 <= '\u0D61')||(LA47_60 >= '\u0D85' && LA47_60 <= '\u0D96')||(LA47_60 >= '\u0D9A' && LA47_60 <= '\u0DB1')||(LA47_60 >= '\u0DB3' && LA47_60 <= '\u0DBB')||LA47_60=='\u0DBD'||(LA47_60 >= '\u0DC0' && LA47_60 <= '\u0DC6')||(LA47_60 >= '\u0E01' && LA47_60 <= '\u0E30')||(LA47_60 >= '\u0E32' && LA47_60 <= '\u0E33')||(LA47_60 >= '\u0E40' && LA47_60 <= '\u0E46')||(LA47_60 >= '\u0E81' && LA47_60 <= '\u0E82')||LA47_60=='\u0E84'||(LA47_60 >= '\u0E87' && LA47_60 <= '\u0E88')||LA47_60=='\u0E8A'||LA47_60=='\u0E8D'||(LA47_60 >= '\u0E94' && LA47_60 <= '\u0E97')||(LA47_60 >= '\u0E99' && LA47_60 <= '\u0E9F')||(LA47_60 >= '\u0EA1' && LA47_60 <= '\u0EA3')||LA47_60=='\u0EA5'||LA47_60=='\u0EA7'||(LA47_60 >= '\u0EAA' && LA47_60 <= '\u0EAB')||(LA47_60 >= '\u0EAD' && LA47_60 <= '\u0EB0')||(LA47_60 >= '\u0EB2' && LA47_60 <= '\u0EB3')||LA47_60=='\u0EBD'||(LA47_60 >= '\u0EC0' && LA47_60 <= '\u0EC4')||LA47_60=='\u0EC6'||(LA47_60 >= '\u0EDC' && LA47_60 <= '\u0EDD')||LA47_60=='\u0F00'||(LA47_60 >= '\u0F40' && LA47_60 <= '\u0F47')||(LA47_60 >= '\u0F49' && LA47_60 <= '\u0F6A')||(LA47_60 >= '\u0F88' && LA47_60 <= '\u0F8B')||(LA47_60 >= '\u1000' && LA47_60 <= '\u1021')||(LA47_60 >= '\u1023' && LA47_60 <= '\u1027')||(LA47_60 >= '\u1029' && LA47_60 <= '\u102A')||(LA47_60 >= '\u1050' && LA47_60 <= '\u1055')||(LA47_60 >= '\u10A0' && LA47_60 <= '\u10C5')||(LA47_60 >= '\u10D0' && LA47_60 <= '\u10FA')||LA47_60=='\u10FC'||(LA47_60 >= '\u1100' && LA47_60 <= '\u1159')||(LA47_60 >= '\u115F' && LA47_60 <= '\u11A2')||(LA47_60 >= '\u11A8' && LA47_60 <= '\u11F9')||(LA47_60 >= '\u1200' && LA47_60 <= '\u1248')||(LA47_60 >= '\u124A' && LA47_60 <= '\u124D')||(LA47_60 >= '\u1250' && LA47_60 <= '\u1256')||LA47_60=='\u1258'||(LA47_60 >= '\u125A' && LA47_60 <= '\u125D')||(LA47_60 >= '\u1260' && LA47_60 <= '\u1288')||(LA47_60 >= '\u128A' && LA47_60 <= '\u128D')||(LA47_60 >= '\u1290' && LA47_60 <= '\u12B0')||(LA47_60 >= '\u12B2' && LA47_60 <= '\u12B5')||(LA47_60 >= '\u12B8' && LA47_60 <= '\u12BE')||LA47_60=='\u12C0'||(LA47_60 >= '\u12C2' && LA47_60 <= '\u12C5')||(LA47_60 >= '\u12C8' && LA47_60 <= '\u12D6')||(LA47_60 >= '\u12D8' && LA47_60 <= '\u1310')||(LA47_60 >= '\u1312' && LA47_60 <= '\u1315')||(LA47_60 >= '\u1318' && LA47_60 <= '\u135A')||(LA47_60 >= '\u1380' && LA47_60 <= '\u138F')||(LA47_60 >= '\u13A0' && LA47_60 <= '\u13F4')||(LA47_60 >= '\u1401' && LA47_60 <= '\u166C')||(LA47_60 >= '\u166F' && LA47_60 <= '\u1676')||(LA47_60 >= '\u1681' && LA47_60 <= '\u169A')||(LA47_60 >= '\u16A0' && LA47_60 <= '\u16EA')||(LA47_60 >= '\u16EE' && LA47_60 <= '\u16F0')||(LA47_60 >= '\u1700' && LA47_60 <= '\u170C')||(LA47_60 >= '\u170E' && LA47_60 <= '\u1711')||(LA47_60 >= '\u1720' && LA47_60 <= '\u1731')||(LA47_60 >= '\u1740' && LA47_60 <= '\u1751')||(LA47_60 >= '\u1760' && LA47_60 <= '\u176C')||(LA47_60 >= '\u176E' && LA47_60 <= '\u1770')||(LA47_60 >= '\u1780' && LA47_60 <= '\u17B3')||LA47_60=='\u17D7'||LA47_60=='\u17DC'||(LA47_60 >= '\u1820' && LA47_60 <= '\u1877')||(LA47_60 >= '\u1880' && LA47_60 <= '\u18A8')||(LA47_60 >= '\u1900' && LA47_60 <= '\u191C')||(LA47_60 >= '\u1950' && LA47_60 <= '\u196D')||(LA47_60 >= '\u1970' && LA47_60 <= '\u1974')||(LA47_60 >= '\u1980' && LA47_60 <= '\u19A9')||(LA47_60 >= '\u19C1' && LA47_60 <= '\u19C7')||(LA47_60 >= '\u1A00' && LA47_60 <= '\u1A16')||(LA47_60 >= '\u1D00' && LA47_60 <= '\u1DBF')||(LA47_60 >= '\u1E00' && LA47_60 <= '\u1E9B')||(LA47_60 >= '\u1EA0' && LA47_60 <= '\u1EF9')||(LA47_60 >= '\u1F00' && LA47_60 <= '\u1F15')||(LA47_60 >= '\u1F18' && LA47_60 <= '\u1F1D')||(LA47_60 >= '\u1F20' && LA47_60 <= '\u1F45')||(LA47_60 >= '\u1F48' && LA47_60 <= '\u1F4D')||(LA47_60 >= '\u1F50' && LA47_60 <= '\u1F57')||LA47_60=='\u1F59'||LA47_60=='\u1F5B'||LA47_60=='\u1F5D'||(LA47_60 >= '\u1F5F' && LA47_60 <= '\u1F7D')||(LA47_60 >= '\u1F80' && LA47_60 <= '\u1FB4')||(LA47_60 >= '\u1FB6' && LA47_60 <= '\u1FBC')||LA47_60=='\u1FBE'||(LA47_60 >= '\u1FC2' && LA47_60 <= '\u1FC4')||(LA47_60 >= '\u1FC6' && LA47_60 <= '\u1FCC')||(LA47_60 >= '\u1FD0' && LA47_60 <= '\u1FD3')||(LA47_60 >= '\u1FD6' && LA47_60 <= '\u1FDB')||(LA47_60 >= '\u1FE0' && LA47_60 <= '\u1FEC')||(LA47_60 >= '\u1FF2' && LA47_60 <= '\u1FF4')||(LA47_60 >= '\u1FF6' && LA47_60 <= '\u1FFC')||LA47_60=='\u2071'||LA47_60=='\u207F'||(LA47_60 >= '\u2090' && LA47_60 <= '\u2094')||LA47_60=='\u2102'||LA47_60=='\u2107'||(LA47_60 >= '\u210A' && LA47_60 <= '\u2113')||LA47_60=='\u2115'||(LA47_60 >= '\u2118' && LA47_60 <= '\u211D')||LA47_60=='\u2124'||LA47_60=='\u2126'||LA47_60=='\u2128'||(LA47_60 >= '\u212A' && LA47_60 <= '\u2131')||(LA47_60 >= '\u2133' && LA47_60 <= '\u2139')||(LA47_60 >= '\u213C' && LA47_60 <= '\u213F')||(LA47_60 >= '\u2145' && LA47_60 <= '\u2149')||(LA47_60 >= '\u2160' && LA47_60 <= '\u2183')||(LA47_60 >= '\u2C00' && LA47_60 <= '\u2C2E')||(LA47_60 >= '\u2C30' && LA47_60 <= '\u2C5E')||(LA47_60 >= '\u2C80' && LA47_60 <= '\u2CE4')||(LA47_60 >= '\u2D00' && LA47_60 <= '\u2D25')||(LA47_60 >= '\u2D30' && LA47_60 <= '\u2D65')||LA47_60=='\u2D6F'||(LA47_60 >= '\u2D80' && LA47_60 <= '\u2D96')||(LA47_60 >= '\u2DA0' && LA47_60 <= '\u2DA6')||(LA47_60 >= '\u2DA8' && LA47_60 <= '\u2DAE')||(LA47_60 >= '\u2DB0' && LA47_60 <= '\u2DB6')||(LA47_60 >= '\u2DB8' && LA47_60 <= '\u2DBE')||(LA47_60 >= '\u2DC0' && LA47_60 <= '\u2DC6')||(LA47_60 >= '\u2DC8' && LA47_60 <= '\u2DCE')||(LA47_60 >= '\u2DD0' && LA47_60 <= '\u2DD6')||(LA47_60 >= '\u2DD8' && LA47_60 <= '\u2DDE')||(LA47_60 >= '\u3005' && LA47_60 <= '\u3007')||(LA47_60 >= '\u3021' && LA47_60 <= '\u3029')||(LA47_60 >= '\u3031' && LA47_60 <= '\u3035')||(LA47_60 >= '\u3038' && LA47_60 <= '\u303C')||(LA47_60 >= '\u3041' && LA47_60 <= '\u3096')||(LA47_60 >= '\u309B' && LA47_60 <= '\u309F')||(LA47_60 >= '\u30A1' && LA47_60 <= '\u30FA')||(LA47_60 >= '\u30FC' && LA47_60 <= '\u30FF')||(LA47_60 >= '\u3105' && LA47_60 <= '\u312C')||(LA47_60 >= '\u3131' && LA47_60 <= '\u318E')||(LA47_60 >= '\u31A0' && LA47_60 <= '\u31B7')||(LA47_60 >= '\u31F0' && LA47_60 <= '\u31FF')||(LA47_60 >= '\u3400' && LA47_60 <= '\u4DB5')||(LA47_60 >= '\u4E00' && LA47_60 <= '\u9FBB')||(LA47_60 >= '\uA000' && LA47_60 <= '\uA48C')||(LA47_60 >= '\uA800' && LA47_60 <= '\uA801')||(LA47_60 >= '\uA803' && LA47_60 <= '\uA805')||(LA47_60 >= '\uA807' && LA47_60 <= '\uA80A')||(LA47_60 >= '\uA80C' && LA47_60 <= '\uA822')||(LA47_60 >= '\uAC00' && LA47_60 <= '\uD7A3')||(LA47_60 >= '\uF900' && LA47_60 <= '\uFA2D')||(LA47_60 >= '\uFA30' && LA47_60 <= '\uFA6A')||(LA47_60 >= '\uFA70' && LA47_60 <= '\uFAD9')||(LA47_60 >= '\uFB00' && LA47_60 <= '\uFB06')||(LA47_60 >= '\uFB13' && LA47_60 <= '\uFB17')||LA47_60=='\uFB1D'||(LA47_60 >= '\uFB1F' && LA47_60 <= '\uFB28')||(LA47_60 >= '\uFB2A' && LA47_60 <= '\uFB36')||(LA47_60 >= '\uFB38' && LA47_60 <= '\uFB3C')||LA47_60=='\uFB3E'||(LA47_60 >= '\uFB40' && LA47_60 <= '\uFB41')||(LA47_60 >= '\uFB43' && LA47_60 <= '\uFB44')||(LA47_60 >= '\uFB46' && LA47_60 <= '\uFBB1')||(LA47_60 >= '\uFBD3' && LA47_60 <= '\uFD3D')||(LA47_60 >= '\uFD50' && LA47_60 <= '\uFD8F')||(LA47_60 >= '\uFD92' && LA47_60 <= '\uFDC7')||(LA47_60 >= '\uFDF0' && LA47_60 <= '\uFDFB')||(LA47_60 >= '\uFE70' && LA47_60 <= '\uFE74')||(LA47_60 >= '\uFE76' && LA47_60 <= '\uFEFC')||(LA47_60 >= '\uFF21' && LA47_60 <= '\uFF3A')||(LA47_60 >= '\uFF41' && LA47_60 <= '\uFF5A')||(LA47_60 >= '\uFF66' && LA47_60 <= '\uFFBE')||(LA47_60 >= '\uFFC2' && LA47_60 <= '\uFFC7')||(LA47_60 >= '\uFFCA' && LA47_60 <= '\uFFCF')||(LA47_60 >= '\uFFD2' && LA47_60 <= '\uFFD7')||(LA47_60 >= '\uFFDA' && LA47_60 <= '\uFFDC')) ) {s = 60;}

                        else if ( ((LA47_60 >= '\u0000' && LA47_60 <= '\t')||(LA47_60 >= '\u000B' && LA47_60 <= '@')||(LA47_60 >= '[' && LA47_60 <= '^')||LA47_60=='`'||(LA47_60 >= '{' && LA47_60 <= '\u00A9')||(LA47_60 >= '\u00AB' && LA47_60 <= '\u00B4')||(LA47_60 >= '\u00B6' && LA47_60 <= '\u00B9')||(LA47_60 >= '\u00BB' && LA47_60 <= '\u00BF')||LA47_60=='\u00D7'||LA47_60=='\u00F7'||(LA47_60 >= '\u0242' && LA47_60 <= '\u024F')||(LA47_60 >= '\u02C2' && LA47_60 <= '\u02C5')||(LA47_60 >= '\u02D2' && LA47_60 <= '\u02DF')||(LA47_60 >= '\u02E5' && LA47_60 <= '\u02ED')||(LA47_60 >= '\u02EF' && LA47_60 <= '\u0379')||(LA47_60 >= '\u037B' && LA47_60 <= '\u0385')||LA47_60=='\u0387'||LA47_60=='\u038B'||LA47_60=='\u038D'||LA47_60=='\u03A2'||LA47_60=='\u03CF'||LA47_60=='\u03F6'||(LA47_60 >= '\u0482' && LA47_60 <= '\u0489')||LA47_60=='\u04CF'||(LA47_60 >= '\u04FA' && LA47_60 <= '\u04FF')||(LA47_60 >= '\u0510' && LA47_60 <= '\u0530')||(LA47_60 >= '\u0557' && LA47_60 <= '\u0558')||(LA47_60 >= '\u055A' && LA47_60 <= '\u0560')||(LA47_60 >= '\u0588' && LA47_60 <= '\u05CF')||(LA47_60 >= '\u05EB' && LA47_60 <= '\u05EF')||(LA47_60 >= '\u05F3' && LA47_60 <= '\u0620')||(LA47_60 >= '\u063B' && LA47_60 <= '\u063F')||(LA47_60 >= '\u064B' && LA47_60 <= '\u066D')||LA47_60=='\u0670'||LA47_60=='\u06D4'||(LA47_60 >= '\u06D6' && LA47_60 <= '\u06E4')||(LA47_60 >= '\u06E7' && LA47_60 <= '\u06ED')||(LA47_60 >= '\u06F0' && LA47_60 <= '\u06F9')||(LA47_60 >= '\u06FD' && LA47_60 <= '\u06FE')||(LA47_60 >= '\u0700' && LA47_60 <= '\u070F')||LA47_60=='\u0711'||(LA47_60 >= '\u0730' && LA47_60 <= '\u074C')||(LA47_60 >= '\u076E' && LA47_60 <= '\u077F')||(LA47_60 >= '\u07A6' && LA47_60 <= '\u07B0')||(LA47_60 >= '\u07B2' && LA47_60 <= '\u0903')||(LA47_60 >= '\u093A' && LA47_60 <= '\u093C')||(LA47_60 >= '\u093E' && LA47_60 <= '\u094F')||(LA47_60 >= '\u0951' && LA47_60 <= '\u0957')||(LA47_60 >= '\u0962' && LA47_60 <= '\u097C')||(LA47_60 >= '\u097E' && LA47_60 <= '\u0984')||(LA47_60 >= '\u098D' && LA47_60 <= '\u098E')||(LA47_60 >= '\u0991' && LA47_60 <= '\u0992')||LA47_60=='\u09A9'||LA47_60=='\u09B1'||(LA47_60 >= '\u09B3' && LA47_60 <= '\u09B5')||(LA47_60 >= '\u09BA' && LA47_60 <= '\u09BC')||(LA47_60 >= '\u09BE' && LA47_60 <= '\u09CD')||(LA47_60 >= '\u09CF' && LA47_60 <= '\u09DB')||LA47_60=='\u09DE'||(LA47_60 >= '\u09E2' && LA47_60 <= '\u09EF')||(LA47_60 >= '\u09F2' && LA47_60 <= '\u0A04')||(LA47_60 >= '\u0A0B' && LA47_60 <= '\u0A0E')||(LA47_60 >= '\u0A11' && LA47_60 <= '\u0A12')||LA47_60=='\u0A29'||LA47_60=='\u0A31'||LA47_60=='\u0A34'||LA47_60=='\u0A37'||(LA47_60 >= '\u0A3A' && LA47_60 <= '\u0A58')||LA47_60=='\u0A5D'||(LA47_60 >= '\u0A5F' && LA47_60 <= '\u0A71')||(LA47_60 >= '\u0A75' && LA47_60 <= '\u0A84')||LA47_60=='\u0A8E'||LA47_60=='\u0A92'||LA47_60=='\u0AA9'||LA47_60=='\u0AB1'||LA47_60=='\u0AB4'||(LA47_60 >= '\u0ABA' && LA47_60 <= '\u0ABC')||(LA47_60 >= '\u0ABE' && LA47_60 <= '\u0ACF')||(LA47_60 >= '\u0AD1' && LA47_60 <= '\u0ADF')||(LA47_60 >= '\u0AE2' && LA47_60 <= '\u0B04')||(LA47_60 >= '\u0B0D' && LA47_60 <= '\u0B0E')||(LA47_60 >= '\u0B11' && LA47_60 <= '\u0B12')||LA47_60=='\u0B29'||LA47_60=='\u0B31'||LA47_60=='\u0B34'||(LA47_60 >= '\u0B3A' && LA47_60 <= '\u0B3C')||(LA47_60 >= '\u0B3E' && LA47_60 <= '\u0B5B')||LA47_60=='\u0B5E'||(LA47_60 >= '\u0B62' && LA47_60 <= '\u0B70')||(LA47_60 >= '\u0B72' && LA47_60 <= '\u0B82')||LA47_60=='\u0B84'||(LA47_60 >= '\u0B8B' && LA47_60 <= '\u0B8D')||LA47_60=='\u0B91'||(LA47_60 >= '\u0B96' && LA47_60 <= '\u0B98')||LA47_60=='\u0B9B'||LA47_60=='\u0B9D'||(LA47_60 >= '\u0BA0' && LA47_60 <= '\u0BA2')||(LA47_60 >= '\u0BA5' && LA47_60 <= '\u0BA7')||(LA47_60 >= '\u0BAB' && LA47_60 <= '\u0BAD')||(LA47_60 >= '\u0BBA' && LA47_60 <= '\u0C04')||LA47_60=='\u0C0D'||LA47_60=='\u0C11'||LA47_60=='\u0C29'||LA47_60=='\u0C34'||(LA47_60 >= '\u0C3A' && LA47_60 <= '\u0C5F')||(LA47_60 >= '\u0C62' && LA47_60 <= '\u0C84')||LA47_60=='\u0C8D'||LA47_60=='\u0C91'||LA47_60=='\u0CA9'||LA47_60=='\u0CB4'||(LA47_60 >= '\u0CBA' && LA47_60 <= '\u0CBC')||(LA47_60 >= '\u0CBE' && LA47_60 <= '\u0CDD')||LA47_60=='\u0CDF'||(LA47_60 >= '\u0CE2' && LA47_60 <= '\u0D04')||LA47_60=='\u0D0D'||LA47_60=='\u0D11'||LA47_60=='\u0D29'||(LA47_60 >= '\u0D3A' && LA47_60 <= '\u0D5F')||(LA47_60 >= '\u0D62' && LA47_60 <= '\u0D84')||(LA47_60 >= '\u0D97' && LA47_60 <= '\u0D99')||LA47_60=='\u0DB2'||LA47_60=='\u0DBC'||(LA47_60 >= '\u0DBE' && LA47_60 <= '\u0DBF')||(LA47_60 >= '\u0DC7' && LA47_60 <= '\u0E00')||LA47_60=='\u0E31'||(LA47_60 >= '\u0E34' && LA47_60 <= '\u0E3F')||(LA47_60 >= '\u0E47' && LA47_60 <= '\u0E80')||LA47_60=='\u0E83'||(LA47_60 >= '\u0E85' && LA47_60 <= '\u0E86')||LA47_60=='\u0E89'||(LA47_60 >= '\u0E8B' && LA47_60 <= '\u0E8C')||(LA47_60 >= '\u0E8E' && LA47_60 <= '\u0E93')||LA47_60=='\u0E98'||LA47_60=='\u0EA0'||LA47_60=='\u0EA4'||LA47_60=='\u0EA6'||(LA47_60 >= '\u0EA8' && LA47_60 <= '\u0EA9')||LA47_60=='\u0EAC'||LA47_60=='\u0EB1'||(LA47_60 >= '\u0EB4' && LA47_60 <= '\u0EBC')||(LA47_60 >= '\u0EBE' && LA47_60 <= '\u0EBF')||LA47_60=='\u0EC5'||(LA47_60 >= '\u0EC7' && LA47_60 <= '\u0EDB')||(LA47_60 >= '\u0EDE' && LA47_60 <= '\u0EFF')||(LA47_60 >= '\u0F01' && LA47_60 <= '\u0F3F')||LA47_60=='\u0F48'||(LA47_60 >= '\u0F6B' && LA47_60 <= '\u0F87')||(LA47_60 >= '\u0F8C' && LA47_60 <= '\u0FFF')||LA47_60=='\u1022'||LA47_60=='\u1028'||(LA47_60 >= '\u102B' && LA47_60 <= '\u104F')||(LA47_60 >= '\u1056' && LA47_60 <= '\u109F')||(LA47_60 >= '\u10C6' && LA47_60 <= '\u10CF')||LA47_60=='\u10FB'||(LA47_60 >= '\u10FD' && LA47_60 <= '\u10FF')||(LA47_60 >= '\u115A' && LA47_60 <= '\u115E')||(LA47_60 >= '\u11A3' && LA47_60 <= '\u11A7')||(LA47_60 >= '\u11FA' && LA47_60 <= '\u11FF')||LA47_60=='\u1249'||(LA47_60 >= '\u124E' && LA47_60 <= '\u124F')||LA47_60=='\u1257'||LA47_60=='\u1259'||(LA47_60 >= '\u125E' && LA47_60 <= '\u125F')||LA47_60=='\u1289'||(LA47_60 >= '\u128E' && LA47_60 <= '\u128F')||LA47_60=='\u12B1'||(LA47_60 >= '\u12B6' && LA47_60 <= '\u12B7')||LA47_60=='\u12BF'||LA47_60=='\u12C1'||(LA47_60 >= '\u12C6' && LA47_60 <= '\u12C7')||LA47_60=='\u12D7'||LA47_60=='\u1311'||(LA47_60 >= '\u1316' && LA47_60 <= '\u1317')||(LA47_60 >= '\u135B' && LA47_60 <= '\u137F')||(LA47_60 >= '\u1390' && LA47_60 <= '\u139F')||(LA47_60 >= '\u13F5' && LA47_60 <= '\u1400')||(LA47_60 >= '\u166D' && LA47_60 <= '\u166E')||(LA47_60 >= '\u1677' && LA47_60 <= '\u1680')||(LA47_60 >= '\u169B' && LA47_60 <= '\u169F')||(LA47_60 >= '\u16EB' && LA47_60 <= '\u16ED')||(LA47_60 >= '\u16F1' && LA47_60 <= '\u16FF')||LA47_60=='\u170D'||(LA47_60 >= '\u1712' && LA47_60 <= '\u171F')||(LA47_60 >= '\u1732' && LA47_60 <= '\u173F')||(LA47_60 >= '\u1752' && LA47_60 <= '\u175F')||LA47_60=='\u176D'||(LA47_60 >= '\u1771' && LA47_60 <= '\u177F')||(LA47_60 >= '\u17B4' && LA47_60 <= '\u17D6')||(LA47_60 >= '\u17D8' && LA47_60 <= '\u17DB')||(LA47_60 >= '\u17DD' && LA47_60 <= '\u181F')||(LA47_60 >= '\u1878' && LA47_60 <= '\u187F')||(LA47_60 >= '\u18A9' && LA47_60 <= '\u18FF')||(LA47_60 >= '\u191D' && LA47_60 <= '\u194F')||(LA47_60 >= '\u196E' && LA47_60 <= '\u196F')||(LA47_60 >= '\u1975' && LA47_60 <= '\u197F')||(LA47_60 >= '\u19AA' && LA47_60 <= '\u19C0')||(LA47_60 >= '\u19C8' && LA47_60 <= '\u19FF')||(LA47_60 >= '\u1A17' && LA47_60 <= '\u1CFF')||(LA47_60 >= '\u1DC0' && LA47_60 <= '\u1DFF')||(LA47_60 >= '\u1E9C' && LA47_60 <= '\u1E9F')||(LA47_60 >= '\u1EFA' && LA47_60 <= '\u1EFF')||(LA47_60 >= '\u1F16' && LA47_60 <= '\u1F17')||(LA47_60 >= '\u1F1E' && LA47_60 <= '\u1F1F')||(LA47_60 >= '\u1F46' && LA47_60 <= '\u1F47')||(LA47_60 >= '\u1F4E' && LA47_60 <= '\u1F4F')||LA47_60=='\u1F58'||LA47_60=='\u1F5A'||LA47_60=='\u1F5C'||LA47_60=='\u1F5E'||(LA47_60 >= '\u1F7E' && LA47_60 <= '\u1F7F')||LA47_60=='\u1FB5'||LA47_60=='\u1FBD'||(LA47_60 >= '\u1FBF' && LA47_60 <= '\u1FC1')||LA47_60=='\u1FC5'||(LA47_60 >= '\u1FCD' && LA47_60 <= '\u1FCF')||(LA47_60 >= '\u1FD4' && LA47_60 <= '\u1FD5')||(LA47_60 >= '\u1FDC' && LA47_60 <= '\u1FDF')||(LA47_60 >= '\u1FED' && LA47_60 <= '\u1FF1')||LA47_60=='\u1FF5'||(LA47_60 >= '\u1FFD' && LA47_60 <= '\u2070')||(LA47_60 >= '\u2072' && LA47_60 <= '\u207E')||(LA47_60 >= '\u2080' && LA47_60 <= '\u208F')||(LA47_60 >= '\u2095' && LA47_60 <= '\u2101')||(LA47_60 >= '\u2103' && LA47_60 <= '\u2106')||(LA47_60 >= '\u2108' && LA47_60 <= '\u2109')||LA47_60=='\u2114'||(LA47_60 >= '\u2116' && LA47_60 <= '\u2117')||(LA47_60 >= '\u211E' && LA47_60 <= '\u2123')||LA47_60=='\u2125'||LA47_60=='\u2127'||LA47_60=='\u2129'||LA47_60=='\u2132'||(LA47_60 >= '\u213A' && LA47_60 <= '\u213B')||(LA47_60 >= '\u2140' && LA47_60 <= '\u2144')||(LA47_60 >= '\u214A' && LA47_60 <= '\u215F')||(LA47_60 >= '\u2184' && LA47_60 <= '\u2BFF')||LA47_60=='\u2C2F'||(LA47_60 >= '\u2C5F' && LA47_60 <= '\u2C7F')||(LA47_60 >= '\u2CE5' && LA47_60 <= '\u2CFF')||(LA47_60 >= '\u2D26' && LA47_60 <= '\u2D2F')||(LA47_60 >= '\u2D66' && LA47_60 <= '\u2D6E')||(LA47_60 >= '\u2D70' && LA47_60 <= '\u2D7F')||(LA47_60 >= '\u2D97' && LA47_60 <= '\u2D9F')||LA47_60=='\u2DA7'||LA47_60=='\u2DAF'||LA47_60=='\u2DB7'||LA47_60=='\u2DBF'||LA47_60=='\u2DC7'||LA47_60=='\u2DCF'||LA47_60=='\u2DD7'||(LA47_60 >= '\u2DDF' && LA47_60 <= '\u3004')||(LA47_60 >= '\u3008' && LA47_60 <= '\u3020')||(LA47_60 >= '\u302A' && LA47_60 <= '\u3030')||(LA47_60 >= '\u3036' && LA47_60 <= '\u3037')||(LA47_60 >= '\u303D' && LA47_60 <= '\u3040')||(LA47_60 >= '\u3097' && LA47_60 <= '\u309A')||LA47_60=='\u30A0'||LA47_60=='\u30FB'||(LA47_60 >= '\u3100' && LA47_60 <= '\u3104')||(LA47_60 >= '\u312D' && LA47_60 <= '\u3130')||(LA47_60 >= '\u318F' && LA47_60 <= '\u319F')||(LA47_60 >= '\u31B8' && LA47_60 <= '\u31EF')||(LA47_60 >= '\u3200' && LA47_60 <= '\u33FF')||(LA47_60 >= '\u4DB6' && LA47_60 <= '\u4DFF')||(LA47_60 >= '\u9FBC' && LA47_60 <= '\u9FFF')||(LA47_60 >= '\uA48D' && LA47_60 <= '\uA7FF')||LA47_60=='\uA802'||LA47_60=='\uA806'||LA47_60=='\uA80B'||(LA47_60 >= '\uA823' && LA47_60 <= '\uABFF')||(LA47_60 >= '\uD7A4' && LA47_60 <= '\uF8FF')||(LA47_60 >= '\uFA2E' && LA47_60 <= '\uFA2F')||(LA47_60 >= '\uFA6B' && LA47_60 <= '\uFA6F')||(LA47_60 >= '\uFADA' && LA47_60 <= '\uFAFF')||(LA47_60 >= '\uFB07' && LA47_60 <= '\uFB12')||(LA47_60 >= '\uFB18' && LA47_60 <= '\uFB1C')||LA47_60=='\uFB1E'||LA47_60=='\uFB29'||LA47_60=='\uFB37'||LA47_60=='\uFB3D'||LA47_60=='\uFB3F'||LA47_60=='\uFB42'||LA47_60=='\uFB45'||(LA47_60 >= '\uFBB2' && LA47_60 <= '\uFBD2')||(LA47_60 >= '\uFD3E' && LA47_60 <= '\uFD4F')||(LA47_60 >= '\uFD90' && LA47_60 <= '\uFD91')||(LA47_60 >= '\uFDC8' && LA47_60 <= '\uFDEF')||(LA47_60 >= '\uFDFC' && LA47_60 <= '\uFE6F')||LA47_60=='\uFE75'||(LA47_60 >= '\uFEFD' && LA47_60 <= '\uFF20')||(LA47_60 >= '\uFF3B' && LA47_60 <= '\uFF40')||(LA47_60 >= '\uFF5B' && LA47_60 <= '\uFF65')||(LA47_60 >= '\uFFBF' && LA47_60 <= '\uFFC1')||(LA47_60 >= '\uFFC8' && LA47_60 <= '\uFFC9')||(LA47_60 >= '\uFFD0' && LA47_60 <= '\uFFD1')||(LA47_60 >= '\uFFD8' && LA47_60 <= '\uFFD9')||(LA47_60 >= '\uFFDD' && LA47_60 <= '\uFFFF')) && (( !_seeWord ))) {s = 61;}

                        else s = 69;

                         
                        input.seek(index47_60);

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA47_69 = input.LA(1);

                         
                        int index47_69 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !_seeWord )) ) {s = 61;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index47_69);

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA47_70 = input.LA(1);

                         
                        int index47_70 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (( !_seeWord )) ) {s = 63;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index47_70);

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}