# MatlabToJavaCompiler

### 1. Translator MATLAB do Java

### 2. Dane studentów:

  * Patrycja Marchwica, III rok, Informatyka
  * Paulina Stal, III rok, Informatyka

### 3. Dane kontaktowe:
  * Patrycja Marchwica, email: patmar@student.agh.edu.pl
  * Paulina Stal, email: stal@student.agh.edu.pl

### 4.Założenia programu
##### a) ogólne cele programu:
  * Obsługa podstawowych operacji arytmetycznych
  * Obsługa pętli for i while
  * Obsługa instrukcji warunkowych
  * Obsługa operacji na macierzach (dodawanie, odejmowanie, mnożenie, dzielenie)
  * Obsługa funkcji
##### b) rodzaj translatora:
  * kompilator
##### c) planowany wynik działania programu
  * program w Java
##### d) planowany język implementacji:
  * Java
##### e) sposób realizacji skanera/parsera:
  * użycie generatora skanerów/parserów - ANTLR4

### 5. Opis tokenów

```
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
ELEMENT_WISE_DIVIDE	    : './';
ELEMENT_WISE_POWER	    : '.^';


//słowa kluczowe
GLOBAL		: 'global';
IF		: 'if';
ELSE		: 'else';
ELSEIF		: 'elseif';
END		: 'end';
WHILE		: 'while';
FOR		: 'for';
SWITCH		: 'switch';
OTHERWISE	: 'otherwise';
CASE		: 'case';
CONTINUE	: 'continue';
BREAK		: 'break';
FUNCTION	: 'function';
RETURN		: 'return';
SET		: 'set';
GET		: 'get';

//znaki specjalne
ASSIGN                  : '=';
DOT			: '.';
COMMA			: ',';
COLON                   : ':';
SEMI_COLON		: ';';
LEFT_PARENTHESIS	: '(';
RIGHT_PARENTHESIS	: ')';
LEFT_BRACE		: '{';
RIGHT_BRACE		: '}';
LEFT_SQUARE_BRACKET	: '[';
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
```

### 6. Gramatyka formatu

```
program:
	( statement | def_function )*
;

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
	(   statement_assign
	|   statement_if
	|   statement_for
	|   statement_while
	|   statement_switch
	|   expression
	|   logic_expression
	|   parenthesis_expression
	|   function
	|   var
	|   BREAK
	|   CONTINUE
	|   RETURN
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
|	expression math_operator expression
;

parenthesis_expression:
LEFT_PARENTHESIS expression RIGHT_PARENTHESIS
;

logic_expression:
        bool
|	expression relational_operator expression
|       logic_expression logic_operator logic_expression
;
```

### 7. Opis i schemat struktury programu
  - Wczytanie pliku źródłowego napisanego w Matlabie z rozszerzeniem .m
  - Za pomocą skanera na podstawie danych wejściowych wydzielane są tokeny
  - Tokeny przekazywane są do parsera, który z użyciem gramatyki języka tworzy drzewo składniowe
  - ParseTreeWalker pozwala na przechodzenie po elementach drzewa składniowego i generację kodu w języku Java z wykorzystaniem zaimplementowanego listener'a i pomocniczego obiektu MatlabToJavaCreator

### 8. Informacje o stosowanych generatorach skanerów/parserów, pakietach zewnętrznych

ANTLR (ANother Tool for Language Recognition) to generator parserów do czytania, przetwarzania, wykonywania lub tłumaczenia plików tekstowych lub binarnych. Pozwala on na wygenerowanie skanera oraz parsera dla zdefiniowanej gramatyki.

### 9. Informacje o zastosowaniu specyficznych metod rozwiązania problemu



### 10. Krótka instrukcja obsługi
Przed uruchomieniem programu należy najpierw zainstalować ANTLR4 zgodnie z instrukcją na stronie https://www.antlr.org. 

Uruchomienie za pomocą wiersza poleceń
```
java -jar MatlabToJavaCompiler.jar <ŚCIEŻKA_DO_PLIKU_MATLAB> <ŚCIEŻKA_DO_FOLDERU_DOCELOWEGO>
```
### 11. Testy, przykłady
###### Przykład 1
Plik napisany w Matlabie
```matlab
zmienna1 = 4
zmienna2 = 5.6
zmienna3 = true

tab1 = [1, 2, 3, 4]
tab2 = [1, 3, 5; 2, 4, 6; 7, 8, 10]
tab3 = [3.5, 11.3, 88.3]
tab4 = [true, false, false, true, false]
```
Wygenerowany plik w Javie
```java
public class Przyklad1 {
    public static void main(String[] args) {
        Integer zmienna1 = 4;
        Double zmienna2 = 5.6;
        Boolean zmienna3 = true;
        ArrayList<Integer> tab1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		
        ArrayList<ArrayList<Integer>> tab2 = new ArrayList<>();
        tab2.add(new ArrayList<>(Arrays.asList(1, 3, 5)));
        tab2.add(new ArrayList<>(Arrays.asList(2, 4, 6)));
        tab2.add(new ArrayList<>(Arrays.asList(7, 8, 10)));
		
        ArrayList<Double> tab3 = new ArrayList<>(Arrays.asList(3.5, 11.3, 88.3));
        ArrayList<Boolean> tab4 = new ArrayList<>(Arrays.asList(true, false, false, true, false));
    }
}
```
###### Przykład 2
Plik napisany w Matlabie
```matlab
x = 4
y = 2
z = 0.0

if x>0 && y>0
    z=3
elseif x<=0 || y<0
    z=66
else
    z=222.99
end

for a = 1:3
    b = 22
    c = [1,2,34,6]
end

```
Wygenerowany plik w Javie
```java
public class Przyklad2 {
    public static void main(String[] args) {
        Integer x = 4;
        Integer y = 2;
        Double z = 0.0;

        if (x>0)x>0 && (y>0) {
            z = 3;
        } else if (x<=0)x<=0 || (y<0) {
            z = 66;
        } else  {
            z = 222.99;
        }

        for (int a = 1; a < 3; a++) {
            Integer b = 22;
            ArrayList<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 34, 6));
        }
    }
}
```
###### Przykład 3
Plik napisany w Matlabie
```matlab
A = [1,2,3]+[5,6,7]
B= [5.4,4.5, 6.3].*5
c = (1-6)*2-(3^2)
```
Wygenerowany plik w Javie
```java
public class Przyklad3 {
    public static void main(String[] args) {
        ArrayList<Integer> A = addArrays(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList(5, 6, 7)));
        ArrayList<Double> B = multiplyArrayScalar(new ArrayList<>(Arrays.asList(5.4, 4.5, 6.3)), 5);
        Integer c = (1 - 6) * 2 - (Math.pow(3, 2));
    }
}
```
### 12. Możliwe rozszerzenia programu
  * Obsługa klas i obiektów
  * Obsługa plików
  * Obsługa skomplikowanych działań na macierzach

### 13. Ograniczenia programu
  * Brak możliwości definiowania klas oraz obiektów
  * Brak obsługi programów wieloplikowych
  * Brak Obsługi skomplikowanych działań na macierzach

### 14. Inne informacje zależne od tematu

----

