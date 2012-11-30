tree grammar iQATree;

options {
    tokenVocab = iQAParser;
    ASTLabelType = CommonTree;
    output = template;
}

@header {
package cc.iqa;
}

@members {
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
}

prog [String packageName]
    : f += feature+
        -> file(classes = {$f}, packageName = {packageName}) 
    ;

feature
    : ^(FEATURE f=FEATURE_DEF c=feature_content?)
        -> class(name = {removeKeyword($f.getText(), "功能")},
                 methods = {$c.scenarios})
    ;

feature_content returns [List scenarios]
    : ^(SCENARIO_LIST s += scenario+)
        {
            $scenarios = $s;
        }
    ;

scenario
    : ^(SCENARIO s=SCENARIO_DEF suite*)
        -> method(name = {removeKeyword($s.getText(), "场景")},
                  instructions = {$suite.stmts})                  
    ;

suite returns [List<StringTemplate> stmts]
    : ^(STEP_LIST s += compound_stmt+)
        {
            $st = new StringTemplate();
            $stmts = $s;
        }
    ;

step
    : ^(STEP_TREE STEP table?)
        -> step(title = {removeKeyword($STEP.getText(), "*").replace("\"", "\\\"")},
                table = {$table.st})
    ;

cell
    : expression PIPE
        {           
            CommonTree t = (CommonTree)$expression.start;
            if ( t.getToken().getType() == iQATree.IDENTIFIER ) {
                $st = new StringTemplate("\"" + $expression.st.toString() + "\"");
            } else {
                $st = $expression.st;
            }
        }
    ;

row
    : PIPE c += cell+
        -> row(table = {getVariableName("table", _tableVariableIndex++)},
               cells = {$c})
    ;

table
    : r += row+
        -> table(name = {getVariableName("table", _tableVariableIndex++)},
                 rows = {$r})
    ;

compound_stmt
    : ^(WHEN c=compound_condition suite+ elif_clause* else_clause?)
        -> if(condition = {$c.st}, 
              instructions = {$suite.stmts},
              elif_stmt = {$elif_clause.st},
              else_stmt = {$else_clause.st})
    | step
        {
            $st = $step.st;
        }
    | assignment
        {
            $st = $assignment.st;
        }
    ;

else_clause
    : ^(ELSE suite+)
        -> else(instructions = {$suite.stmts})
    ;

elif_clause
    : ^(ELIF c=compound_condition suite+)
        -> elif(condition={$c.st}, 
                instructions = {$suite.stmts})
    ;

compound_condition
    : expression 
        {
            $st = $expression.st;
        }
    | assignment
        {
            $st = $assignment.st;
        }
    ;

assignment
    : ^(EQUAL n=VARIABLE v=assignment_right)
        -> define_variable(name = {removeQuote($n.getText(), '[')}, value = {$v.st})
    ;

assignment_right
    : expression
        {
            $st = $expression.st;
        }
    | step
        {
            $st = $step.st;
        }
    | table
        {
            $st = $table.st;
        }
    | assignment
        {
            $st = $assignment.st;
        }
    ;

expression
    : ^(o=OR l=expression r=expression)
        -> bi_expression(left = {$l.st}, op = {"||"}, right = {$r.st})
    | ^(o=AND l=expression r=expression)
        -> bi_expression(left = {$l.st}, op = {"&&"}, right = {$r.st})
    | ^(o=EOP l=expression r=expression)
        -> bi_expression(left = {$l.st}, op = {$o.getText()}, right = {$r.st})
    | ^(NOT v=expression)
        -> not(expression = {$v.st})
    | ^(o=COP l=expression r=expression)
        -> bi_expression(left = {$l.st}, op = {$o.getText()}, right = {$r.st})
    | ^(o=SOP l=expression r=expression)
        -> bi_expression(left = {$l.st}, op = {$o.getText()}, right = {$r.st})
    | ^(o=ADD l=expression r=expression)
        -> bi_expression(left = {$l.st}, op = {$o.getText()}, right = {$r.st})
    | ^(o=SUB l=expression r=expression)
        -> bi_expression(left = {$l.st}, op = {$o.getText()}, right = {$r.st})
    | ^(o=MUL l=expression r=expression)
        -> bi_expression(left = {$l.st}, op = {$o.getText()}, right = {$r.st})
    | ^(o=DIV l=expression r=expression)
        -> bi_expression(left = {$l.st}, op = {$o.getText()}, right = {$r.st})
    | ^(o=MOD l=expression r=expression)
        -> bi_expression(left = {$l.st}, op = {$o.getText()}, right = {$r.st})
    | IDENTIFIER
        -> atom(value = {$IDENTIFIER.text})
    | FLOAT
        -> atom(value = {$FLOAT.text})
    | VARIABLE
        -> access_variable(name = {removeQuote($VARIABLE.getText(), '[')})
    | STRING
        -> atom(value = {$STRING.text})
    | ^(SUB_EXPR v=expression)
        -> sub(expression = {$v.st})
    ;
