parser grammar iQAParser;

options {
    tokenVocab = iQALexer;
    output = AST;
}

tokens {
    FEATURE;
    SCENARIO;
    SCENARIO_LIST;
    STEP_LIST;
    STEP_TREE;
    WHEN_TREE;
    SUB_EXPR;
}

@header {
package cc.iqa;
}

@members {
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
}

prog
    : BOM? feature+ 
        -> feature+
    ;

feature
    : FEATURE_DEF feature_content? -> ^(FEATURE FEATURE_DEF feature_content?)
    ;

feature_content
    : INDENT scenario+ (DEDENT | EOF)
        -> ^(SCENARIO_LIST scenario+)
    ;

scenario
    : SCENARIO_DEF (suite)* -> ^(SCENARIO SCENARIO_DEF suite*)
    ;

suite
    : INDENT (compound_stmt)+ (DEDENT | EOF) -> ^(STEP_LIST compound_stmt+)
    ;

step
    : STEP (table)? -> ^(STEP_TREE STEP table?)
    ;

cell
    : expression PIPE
    ;

row
    : PIPE cell+
    ;

table
    : row+
    ;

compound_stmt
    : WHEN compound_condition (suite)+ elif_clause* else_clause? 
        -> ^(WHEN compound_condition suite+ elif_clause* else_clause?)
    | step
    | assignment
    ;

else_clause
    : ELSE (suite)+
        -> ^(ELSE suite+)
    ;

elif_clause
    : ELIF compound_condition (suite)+
        -> ^(ELIF compound_condition suite+)
    ;

compound_condition
    : expression
    | assignment
    ;

assignment
    : VARIABLE EQUAL assignment_right -> ^(EQUAL VARIABLE assignment_right)
    ;

assignment_right
    : expression
    | step
    | table
    | assignment
    ;

expression
    : logicalOr
    ;

logicalOr
    : logicalAnd (OR^ logicalAnd)*
    ;

logicalAnd
    : equalityCheck (AND^ equalityCheck)*
    ;

equalityCheck
    : comparison (EOP^ comparison)*
    | NOT^ equalityCheck
    ;

comparison
    : bitwiseShift (COP^ bitwiseShift)*
    ;

bitwiseShift
    : addition (SOP^ addition)*
    ;

addition
    : term ((ADD^ | SUB^) term)*
    ;

term
    : factor ((MUL^ | DIV^ | MOD^) factor)*
    ;

factor
    : atom
    | LPAREN expression RPAREN
        -> ^(SUB_EXPR expression)
    ;

atom
    : IDENTIFIER
    | FLOAT
    | VARIABLE
    | STRING
    ;

