grammar Matlab;

//tokeny

//nowa linia
NL : ('\r' '\n' | '\r' | '\n')  -> channel(HIDDEN);

//pomiń białe znaki
WS : [ \t] -> skip;

//operacje
PLUS        :   '+';
MINUS       :   '-';
DIVIDE      :   '/';
MULTIPLY    :   '*';
POWER       :   '^';

//operacje na macierzach
ELEMENT_WISE_MULTIPLY	    : '.*';
ELEMENT_WISE_DIVIDE		    : './';
ELEMENT_WISE_POWER			: '.^';


//słowa kluczowe
GLOBAL		: 'global';
IF			: 'if';
ELSE		: 'else';
ELSEIF		: 'elseif';
END			: 'end';
WHILE		: 'while';
FOR			: 'for';
SWITCH		: 'switch';
OTHERWISE	: 'otherwise';
CASE		: 'case';
CONTINUE	: 'continue';
BREAK		: 'break';
FUNCTION	: 'function';
RETURN		: 'return';
SET			: 'set';
GET			: 'get';

//znaki specjalne
ASSIGN                  : '=';
DOT						: '.';
COMMA					: ',';
COLON                   : ':';
SEMI_COLON				: ';';
LEFT_PARENTHESIS		: '(';
RIGHT_PARENTHESIS		: ')';
LEFT_BRACE				: '{';
RIGHT_BRACE				: '}';
LEFT_SQUARE_BRACKET		: '[';
RIGHT_SQUARE_BRACKET	: ']';


//atomy: znaki, liczby, białe znaki
ID: [a-zA-Z] [a-zA-Z0-9_]*;

//wartości logiczne
TRUE        :   'true';
FALSE       :   'false';

//operatory logiczne
AND         :   '&&';
OR          :   '||';
NOT         :   '~';

//operatory porownania
EQUAL               :   '==';
NOT_EQUAL           :   '~=';
GREATER_THAN        :   '>';
GREATER_OR_EQUAL    :   '>=';
LESS_THAN           :   '<';
LESS_OR_EQUAL       :   '<=';


//liczby całkowite
INT: [0-9]+;

//liczby rzeczywiste
FLOAT:	[0-9]+ '.' [0-9]*;

//atomy

bool:
	TRUE
|	FALSE
;

empty_array:
	LEFT_SQUARE_BRACKET RIGHT_SQUARE_BRACKET
;

empty_cell:
	LEFT_BRACE RIGHT_BRACE
;

end:
	END
;

floa:
	FLOAT
;

integer:
	INT
;

var:
    ID
;


program:
	( statement | def_function )*
;

def_function:
	FUNCTION (function_returns ASSIGN)? ((GET | SET) DOT)? var function_params?
	statement*
	end
;

function_params:
	LEFT_PARENTHESIS (var (COMMA var)*)? RIGHT_PARENTHESIS
;

function_returns:
	var
|	LEFT_SQUARE_BRACKET var (COMMA var)* RIGHT_SQUARE_BRACKET
;

statement_assign:
    var ASSIGN expression
;

statement_if:
	(IF logic_expression COMMA?
		statement*
	(ELSEIF logic_expression COMMA?
		statement*)*
	(ELSE
		statement*)?
	END)
|	IF expression (COMMA | SEMI_COLON) statement (COMMA | SEMI_COLON) END
;

statement_switch:
    SWITCH expression
        (CASE expression
            statement*)*
        (OTHERWISE
            statement*)?
    END
;

statement_for:
	FOR var ASSIGN expression COMMA?
		statement*
	END
;

statement_while:
	WHILE logic_expression COMMA?
		statement*
	END
;

array:
    LEFT_SQUARE_BRACKET expression (COMMA? expression)* RIGHT_SQUARE_BRACKET
|   LEFT_SQUARE_BRACKET expression (COMMA? expression)* (semi_colon_operator expression (COMMA? expression)*)* RIGHT_SQUARE_BRACKET
;

semi_colon_operator:
    SEMI_COLON
;

function:
	var
	LEFT_PARENTHESIS
	((expression | empty_cell) (COMMA (expression | empty_cell))*)?
	RIGHT_PARENTHESIS
;

statement:
	(	statement_assign
	|   statement_if
	| 	statement_for
	|   statement_while
	|   statement_switch
	|   expression
	|   logic_expression
	|   parenthesis_expression
	|   function
	|   var
	| 	BREAK
	| 	CONTINUE
	| 	RETURN
	)
( COMMA | SEMI_COLON )?
;

expression:
        bool
|       floa
|       end
|       integer
|       var
|       array
|       function
|       parenthesis_expression
|       expression COLON expression
|       (PLUS | MINUS | NOT) expression
|	    expression math_operator expression
;

parenthesis_expression:
LEFT_PARENTHESIS expression RIGHT_PARENTHESIS
;

math_operator:
    PLUS
|   MINUS
|   MULTIPLY
|   DIVIDE
|   POWER
|   ELEMENT_WISE_MULTIPLY
|   ELEMENT_WISE_DIVIDE
|   ELEMENT_WISE_POWER
;

logic_expression:
        bool
|	    expression relational_operator expression
|       logic_expression logic_operator logic_expression
;

logic_operator:
    AND
|   OR
;

relational_operator:
    EQUAL
|   NOT_EQUAL
|   LESS_THAN
|   LESS_OR_EQUAL
|   GREATER_THAN
|   GREATER_OR_EQUAL
;
