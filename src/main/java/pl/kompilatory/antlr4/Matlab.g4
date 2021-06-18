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
FUNCTION	: 'function';
RETURN		: 'return';

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

//wartości logiczne
TRUE        :   'true';
FALSE       :   'false';

//atomy: znaki, liczby, białe znaki
ID: [a-zA-Z] [a-zA-Z0-9_]*;

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

variable:
    ID
|   INT
|   FLOAT
;

program:
	( statement | def_function )*
;

def_function:
	FUNCTION (function_returns ASSIGN)? ID function_params?
	statement*
	END
;

function_params:
	LEFT_PARENTHESIS (ID (COMMA ID)*)? RIGHT_PARENTHESIS
;

function_returns:
	ID
|	LEFT_SQUARE_BRACKET ID (COMMA ID)* RIGHT_SQUARE_BRACKET
;

statement:
	(	statement_assign
	|   statement_if
	| 	statement_for
	|   statement_while
	|   statement_switch
	|   function
	)
( COMMA | SEMI_COLON )?
;

statement_assign:
    ID ASSIGN (variable|negation| math_expression | logic_expression |array |function|parenthesis_expression)
;

math_expression:
     (variable|negation|array|parenthesis_expression) math_operator (variable|negation|array|parenthesis_expression|math_expression)
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
|	    variable relational_operator variable
|       logic_expression logic_operator logic_expression
|       logic_negation
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

array:
    LEFT_SQUARE_BRACKET (variable|logic_expression) (COMMA? (variable|logic_expression))* RIGHT_SQUARE_BRACKET
|   LEFT_SQUARE_BRACKET (variable|logic_expression) (COMMA? (variable|logic_expression))* (semi_colon_operator (variable|logic_expression) (COMMA? (variable|logic_expression))*)* RIGHT_SQUARE_BRACKET
;

semi_colon_operator:
    SEMI_COLON
;


function:
	ID
	LEFT_PARENTHESIS
	((variable|negation|array) (COMMA (variable|negation|array))*)?
	RIGHT_PARENTHESIS
;

statement_if:
	(IF (logic_expression) COMMA?
		statement*
	(ELSEIF (logic_expression) COMMA?
		statement*)*
	(ELSE
		statement*)?
	END)
;

statement_switch:
    SWITCH variable
        (CASE variable
            statement*)*
        (OTHERWISE
            statement*)?
    END
;

statement_while:
	WHILE logic_expression COMMA?
		statement*
	END
;

statement_for:
	FOR ID ASSIGN (colon_expression|array) COMMA?
		statement*
	END
;

colon_expression:
       variable COLON variable
;

parenthesis_expression:
LEFT_PARENTHESIS (variable|negation|math_expression|array) RIGHT_PARENTHESIS
;

negation:
    MINUS variable
;

logic_negation:
    NOT logic_expression
;