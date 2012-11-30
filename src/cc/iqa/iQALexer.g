lexer grammar iQALexer;

tokens {
    INDENT;
    DEDENT;
}

@header {
package cc.iqa;

import java.util.*;
}

@members {
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
}

BOM: '\uFEFF' { _seeBom = true; }
    ;

FEATURE_DEF
    : FEATURE (~'\n')+
    ;

fragment
FEATURE
    : { !_seeWord }? =>  '\u529F' '\u80FD'
        {
            _seeBom = false;
            _seeKeyword = true;
            _seeWord = true;
            _indentStack = new Stack<Integer>();
            _indentStack.push(new Integer(0));
        }
    ;

SCENARIO_DEF
    : SCENARIO (~'\n')+
    ;

fragment
SCENARIO
    : { !_seeWord }? => '\u573A' '\u666F'
        {
            _seeKeyword = true;
            _seeWord = true;
        }
    ;

WHEN
    : { !_seeWord }? => '\u5f53'
        {
            _seeKeyword = true;
            _seeWord = true;
        }
    ;

ELSE
    : { !_seeWord }? => '\u5426' '\u5219'
        {
            _seeKeyword = true;
            _seeWord = true;
        }
    ;

ELIF
    : { !_seeWord }? => '\u5426' '\u5219' '\u5f53'
        {
            _seeKeyword = true;
            _seeWord = true;
        }
    ;

STEP
    : STAR ~('\n')+
    ;

fragment
STAR
    : { !_seeWord }? => '*'
        {
            _seeKeyword = true;
            _seeWord = true;
        }
    ;

NOT
    : '!' 
    ;

ADD
    : '+'
    ;

SUB
    : '-'
    ;

MUL
    : {_seeWord}? => '*'
    ;

DIV
    : '/'
    ;

MOD
    : '%'
    ;

LPAREN
@init{
_seeWord = true;
}
    : '(' {implicitLineJoiningLevel++;} ;
RPAREN
@init{
_seeWord = true;
}
    : ')' {implicitLineJoiningLevel--;} ;

OR
@init{
_seeWord = true;
}
    : '||' | 'or' | '\u6216\u8005';
AND
@init{
_seeWord = true;
}
    : '&&' | 'and' | '\u5e76\u4e14';
COP
@init{
_seeWord = true;
}
    : '<' | '<=' | '>' | '>=';
EOP
@init{
_seeWord = true;
}
    : '==' | '!=';
SOP
@init{
_seeWord = true;
}
    : '<<' | '>>';

COLON
@init{
_seeWord = true;
}
    : { _seeKeyword }? ':' | '\uff1a'
    ;

EQUAL
@init{
_seeWord = false;
}
    : '='
    ;

//
// indentation supports are copied from http://erezsh.wordpress.com/2008/07/12/python-parsing-1-lexing/
//
COMMENTS
@init {
$channel = HIDDEN;
}
    : (('\u000C')?('\r')? '\n')? (' ' | '\t')* '#' (~'\n')*
    | {getCharPositionInLine() > 0 }? => '#' (~'\n')*
    ;

NEWLINE
@init {
    int spaces = 0;
}
    :   ((('\u000C')?('\r')? '\n' ) | '\t' | ' ')* (('\u000C')?('\r')? '\n')
        leading_space = (' ' { spaces++; } | '\t' { spaces += 8; spaces -= (spaces \% 8); })*
        {
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
    | ((('\u000C')?('\r')? '\n' ) | '\t' | ' ')* (('\u000C')?('\r')? '\n')
      (' ' | '\t')* '#' (~'\n')*
        {
            $channel = HIDDEN;
            _seeKeyword = false;
            _seeWord = false;
            _inATable = false;
        }
    ;

PIPE
@init{
_seeWord = true;
}
    : '|'
        {
            _inATable = true;
        }
    ;

STRING
@init{
_seeWord = true;
}
    : '"' ~('"'|'\n')* '"'
    ;

VARIABLE
@init{
_seeWord = true;
}
    : '[' IDENTIFIER ']'
    ;

FLOAT
@init{
_seeWord = true;
}
    :   ('+'|'-')? ('0'..'9')+ '.' ('0'..'9')* Exponent?
    |   ('+'|'-')? '.' ('0'..'9')+ Exponent? 
    |   ('+'|'-')? ('0'..'9')+ Exponent? 
    ;

WHITE
    : (' ' | '\t' | '\u000C' )
        {
            $channel = HIDDEN;
        }
    ;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

IDENTIFIER	
    : ID_START* 
    ;

fragment ID_START
		: '_'
		| 'A'.. 'Z'
		| 'a' .. 'z'
		| '\u00AA'
		| '\u00B5'
		| '\u00BA'
		| '\u00C0' .. '\u00D6'
		| '\u00D8' .. '\u00F6'
		| '\u00F8' .. '\u01BA'
		| '\u01BB'
		| '\u01BC' .. '\u01BF'
		| '\u01C0' .. '\u01C3'
		| '\u01C4' .. '\u0241'
		| '\u0250' .. '\u02AF'
		| '\u02B0' .. '\u02C1'
		| '\u02C6' .. '\u02D1'
		| '\u02E0' .. '\u02E4'
		| '\u02EE'
		| '\u037A'
		| '\u0386'
		| '\u0388' .. '\u038A'
		| '\u038C'
		| '\u038E' .. '\u03A1'
		| '\u03A3' .. '\u03CE'
		| '\u03D0' .. '\u03F5'
		| '\u03F7' .. '\u0481'
		| '\u048A' .. '\u04CE'
		| '\u04D0' .. '\u04F9'
		| '\u0500' .. '\u050F'
		| '\u0531' .. '\u0556'
		| '\u0559'
		| '\u0561' .. '\u0587'
		| '\u05D0' .. '\u05EA'
		| '\u05F0' .. '\u05F2'
		| '\u0621' .. '\u063A'
		| '\u0640'
		| '\u0641' .. '\u064A'
		| '\u066E' .. '\u066F'
		| '\u0671' .. '\u06D3'
		| '\u06D5'
		| '\u06E5' .. '\u06E6'
		| '\u06EE' .. '\u06EF'
		| '\u06FA' .. '\u06FC'
		| '\u06FF'
		| '\u0710'
		| '\u0712' .. '\u072F'
		| '\u074D' .. '\u076D'
		| '\u0780' .. '\u07A5'
		| '\u07B1'
		| '\u0904' .. '\u0939'
		| '\u093D'
		| '\u0950'
		| '\u0958' .. '\u0961'
		| '\u097D'
		| '\u0985' .. '\u098C'
		| '\u098F' .. '\u0990'
		| '\u0993' .. '\u09A8'
		| '\u09AA' .. '\u09B0'
		| '\u09B2'
		| '\u09B6' .. '\u09B9'
		| '\u09BD'
		| '\u09CE'
		| '\u09DC' .. '\u09DD'
		| '\u09DF' .. '\u09E1'
		| '\u09F0' .. '\u09F1'
		| '\u0A05' .. '\u0A0A'
		| '\u0A0F' .. '\u0A10'
		| '\u0A13' .. '\u0A28'
		| '\u0A2A' .. '\u0A30'
		| '\u0A32' .. '\u0A33'
		| '\u0A35' .. '\u0A36'
		| '\u0A38' .. '\u0A39'
		| '\u0A59' .. '\u0A5C'
		| '\u0A5E'
		| '\u0A72' .. '\u0A74'
		| '\u0A85' .. '\u0A8D'
		| '\u0A8F' .. '\u0A91'
		| '\u0A93' .. '\u0AA8'
		| '\u0AAA' .. '\u0AB0'
		| '\u0AB2' .. '\u0AB3'
		| '\u0AB5' .. '\u0AB9'
		| '\u0ABD'
		| '\u0AD0'
		| '\u0AE0' .. '\u0AE1'
		| '\u0B05' .. '\u0B0C'
		| '\u0B0F' .. '\u0B10'
		| '\u0B13' .. '\u0B28'
		| '\u0B2A' .. '\u0B30'
		| '\u0B32' .. '\u0B33'
		| '\u0B35' .. '\u0B39'
		| '\u0B3D'
		| '\u0B5C' .. '\u0B5D'
		| '\u0B5F' .. '\u0B61'
		| '\u0B71'
		| '\u0B83'
		| '\u0B85' .. '\u0B8A'
		| '\u0B8E' .. '\u0B90'
		| '\u0B92' .. '\u0B95'
		| '\u0B99' .. '\u0B9A'
		| '\u0B9C'
		| '\u0B9E' .. '\u0B9F'
		| '\u0BA3' .. '\u0BA4'
		| '\u0BA8' .. '\u0BAA'
		| '\u0BAE' .. '\u0BB9'
		| '\u0C05' .. '\u0C0C'
		| '\u0C0E' .. '\u0C10'
		| '\u0C12' .. '\u0C28'
		| '\u0C2A' .. '\u0C33'
		| '\u0C35' .. '\u0C39'
		| '\u0C60' .. '\u0C61'
		| '\u0C85' .. '\u0C8C'
		| '\u0C8E' .. '\u0C90'
		| '\u0C92' .. '\u0CA8'
		| '\u0CAA' .. '\u0CB3'
		| '\u0CB5' .. '\u0CB9'
		| '\u0CBD'
		| '\u0CDE'
		| '\u0CE0' .. '\u0CE1'
		| '\u0D05' .. '\u0D0C'
		| '\u0D0E' .. '\u0D10'
		| '\u0D12' .. '\u0D28'
		| '\u0D2A' .. '\u0D39'
		| '\u0D60' .. '\u0D61'
		| '\u0D85' .. '\u0D96'
		| '\u0D9A' .. '\u0DB1'
		| '\u0DB3' .. '\u0DBB'
		| '\u0DBD'
		| '\u0DC0' .. '\u0DC6'
		| '\u0E01' .. '\u0E30'
		| '\u0E32' .. '\u0E33'
		| '\u0E40' .. '\u0E45'
		| '\u0E46'
		| '\u0E81' .. '\u0E82'
		| '\u0E84'
		| '\u0E87' .. '\u0E88'
		| '\u0E8A'
		| '\u0E8D'
		| '\u0E94' .. '\u0E97'
		| '\u0E99' .. '\u0E9F'
		| '\u0EA1' .. '\u0EA3'
		| '\u0EA5'
		| '\u0EA7'
		| '\u0EAA' .. '\u0EAB'
		| '\u0EAD' .. '\u0EB0'
		| '\u0EB2' .. '\u0EB3'
		| '\u0EBD'
		| '\u0EC0' .. '\u0EC4'
		| '\u0EC6'
		| '\u0EDC' .. '\u0EDD'
		| '\u0F00'
		| '\u0F40' .. '\u0F47'
		| '\u0F49' .. '\u0F6A'
		| '\u0F88' .. '\u0F8B'
		| '\u1000' .. '\u1021'
		| '\u1023' .. '\u1027'
		| '\u1029' .. '\u102A'
		| '\u1050' .. '\u1055'
		| '\u10A0' .. '\u10C5'
		| '\u10D0' .. '\u10FA'
		| '\u10FC'
		| '\u1100' .. '\u1159'
		| '\u115F' .. '\u11A2'
		| '\u11A8' .. '\u11F9'
		| '\u1200' .. '\u1248'
		| '\u124A' .. '\u124D'
		| '\u1250' .. '\u1256'
		| '\u1258'
		| '\u125A' .. '\u125D'
		| '\u1260' .. '\u1288'
		| '\u128A' .. '\u128D'
		| '\u1290' .. '\u12B0'
		| '\u12B2' .. '\u12B5'
		| '\u12B8' .. '\u12BE'
		| '\u12C0'
		| '\u12C2' .. '\u12C5'
		| '\u12C8' .. '\u12D6'
		| '\u12D8' .. '\u1310'
		| '\u1312' .. '\u1315'
		| '\u1318' .. '\u135A'
		| '\u1380' .. '\u138F'
		| '\u13A0' .. '\u13F4'
		| '\u1401' .. '\u166C'
		| '\u166F' .. '\u1676'
		| '\u1681' .. '\u169A'
		| '\u16A0' .. '\u16EA'
		| '\u16EE' .. '\u16F0'
		| '\u1700' .. '\u170C'
		| '\u170E' .. '\u1711'
		| '\u1720' .. '\u1731'
		| '\u1740' .. '\u1751'
		| '\u1760' .. '\u176C'
		| '\u176E' .. '\u1770'
		| '\u1780' .. '\u17B3'
		| '\u17D7'
		| '\u17DC'
		| '\u1820' .. '\u1842'
		| '\u1843'
		| '\u1844' .. '\u1877'
		| '\u1880' .. '\u18A8'
		| '\u1900' .. '\u191C'
		| '\u1950' .. '\u196D'
		| '\u1970' .. '\u1974'
		| '\u1980' .. '\u19A9'
		| '\u19C1' .. '\u19C7'
		| '\u1A00' .. '\u1A16'
		| '\u1D00' .. '\u1D2B'
		| '\u1D2C' .. '\u1D61'
		| '\u1D62' .. '\u1D77'
		| '\u1D78'
		| '\u1D79' .. '\u1D9A'
		| '\u1D9B' .. '\u1DBF'
		| '\u1E00' .. '\u1E9B'
		| '\u1EA0' .. '\u1EF9'
		| '\u1F00' .. '\u1F15'
		| '\u1F18' .. '\u1F1D'
		| '\u1F20' .. '\u1F45'
		| '\u1F48' .. '\u1F4D'
		| '\u1F50' .. '\u1F57'
		| '\u1F59'
		| '\u1F5B'
		| '\u1F5D'
		| '\u1F5F' .. '\u1F7D'
		| '\u1F80' .. '\u1FB4'
		| '\u1FB6' .. '\u1FBC'
		| '\u1FBE'
		| '\u1FC2' .. '\u1FC4'
		| '\u1FC6' .. '\u1FCC'
		| '\u1FD0' .. '\u1FD3'
		| '\u1FD6' .. '\u1FDB'
		| '\u1FE0' .. '\u1FEC'
		| '\u1FF2' .. '\u1FF4'
		| '\u1FF6' .. '\u1FFC'
		| '\u2071'
		| '\u207F'
		| '\u2090' .. '\u2094'
		| '\u2102'
		| '\u2107'
		| '\u210A' .. '\u2113'
		| '\u2115'
		| '\u2118'
		| '\u2119' .. '\u211D'
		| '\u2124'
		| '\u2126'
		| '\u2128'
		| '\u212A' .. '\u212D'
		| '\u212E'
		| '\u212F' .. '\u2131'
		| '\u2133' .. '\u2134'
		| '\u2135' .. '\u2138'
		| '\u2139'
		| '\u213C' .. '\u213F'
		| '\u2145' .. '\u2149'
		| '\u2160' .. '\u2183'
		| '\u2C00' .. '\u2C2E'
		| '\u2C30' .. '\u2C5E'
		| '\u2C80' .. '\u2CE4'
		| '\u2D00' .. '\u2D25'
		| '\u2D30' .. '\u2D65'
		| '\u2D6F'
		| '\u2D80' .. '\u2D96'
		| '\u2DA0' .. '\u2DA6'
		| '\u2DA8' .. '\u2DAE'
		| '\u2DB0' .. '\u2DB6'
		| '\u2DB8' .. '\u2DBE'
		| '\u2DC0' .. '\u2DC6'
		| '\u2DC8' .. '\u2DCE'
		| '\u2DD0' .. '\u2DD6'
		| '\u2DD8' .. '\u2DDE'
		| '\u3005'
		| '\u3006'
		| '\u3007'
		| '\u3021' .. '\u3029'
		| '\u3031' .. '\u3035'
		| '\u3038' .. '\u303A'
		| '\u303B'
		| '\u303C'
		| '\u3041' .. '\u3096'
		| '\u309B' .. '\u309C'
		| '\u309D' .. '\u309E'
		| '\u309F'
		| '\u30A1' .. '\u30FA'
		| '\u30FC' .. '\u30FE'
		| '\u30FF'
		| '\u3105' .. '\u312C'
		| '\u3131' .. '\u318E'
		| '\u31A0' .. '\u31B7'
		| '\u31F0' .. '\u31FF'
		| '\u3400' .. '\u4DB5'
		| '\u4E00' .. '\u9FBB'
		| '\uA000' .. '\uA014'
		| '\uA015'
		| '\uA016' .. '\uA48C'
		| '\uA800' .. '\uA801'
		| '\uA803' .. '\uA805'
		| '\uA807' .. '\uA80A'
		| '\uA80C' .. '\uA822'
		| '\uAC00' .. '\uD7A3'
		| '\uF900' .. '\uFA2D'
		| '\uFA30' .. '\uFA6A'
		| '\uFA70' .. '\uFAD9'
		| '\uFB00' .. '\uFB06'
		| '\uFB13' .. '\uFB17'
		| '\uFB1D'
		| '\uFB1F' .. '\uFB28'
		| '\uFB2A' .. '\uFB36'
		| '\uFB38' .. '\uFB3C'
		| '\uFB3E'
		| '\uFB40' .. '\uFB41'
		| '\uFB43' .. '\uFB44'
		| '\uFB46' .. '\uFBB1'
		| '\uFBD3' .. '\uFD3D'
		| '\uFD50' .. '\uFD8F'
		| '\uFD92' .. '\uFDC7'
		| '\uFDF0' .. '\uFDFB'
		| '\uFE70' .. '\uFE74'
		| '\uFE76' .. '\uFEFC'
		| '\uFF21' .. '\uFF3A'
		| '\uFF41' .. '\uFF5A'
		| '\uFF66' .. '\uFF6F'
		| '\uFF70'
		| '\uFF71' .. '\uFF9D'
		| '\uFF9E' .. '\uFF9F'
		| '\uFFA0' .. '\uFFBE'
		| '\uFFC2' .. '\uFFC7'
		| '\uFFCA' .. '\uFFCF'
		| '\uFFD2' .. '\uFFD7'
		| '\uFFDA' .. '\uFFDC'
		;
