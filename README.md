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
FUNCTION	: 'function';
RETURN		: 'return';
 
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
 
variable:
    ID
|   INT
|   FLOAT
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
	(   statement_assign
	|   statement_if
	|   statement_for
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
|	variable relational_operator variable
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
```

### 7. Opis i schemat struktury programu
  - Wczytanie pliku źródłowego napisanego w Matlabie z rozszerzeniem .m
  - Za pomocą skanera na podstawie danych wejściowych wydzielane są tokeny
  - Tokeny przekazywane są do parsera, który z użyciem gramatyki języka tworzy drzewo składniowe
  - ParseTreeWalker pozwala na przechodzenie po elementach drzewa składniowego i generację kodu w języku Java z wykorzystaniem zaimplementowanego listener'a i pomocniczego obiektu MatlabToJavaCreator

### 8. Informacje o stosowanych generatorach skanerów/parserów, pakietach zewnętrznych

ANTLR (ANother Tool for Language Recognition) to generator parserów do czytania, przetwarzania, wykonywania lub tłumaczenia plików tekstowych lub binarnych. Pozwala on na wygenerowanie skanera oraz parsera dla zdefiniowanej gramatyki.

### 9. Informacje o zastosowaniu specyficznych metod rozwiązania problemu

W celu uniknięcia błędu związanego z deklaracją tej samej zmiennej przy przechodzeniu przez drzewo parsowania zostaną one zapisane w mapie a następnie odczytane i sprawdzone: jeśli nie wystąpiły jeszcze w pliku zostaną one utworzone natomiast w innym przypadku przypisana będzie do nich ich wartość.

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

        if (x>0 && (y>0)) {
            z = 3;
        } else if (x<=0 || (y<0)){
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
###### Przykład 4
Plik napisany w Matlabie
```matlab
function m = stat2(x)
    x = 2;
    m = 6;
    s = 10;

    while x>3
        y=2
    end
end
```
Wygenerowany plik w Javie
```java
public class Przyklad4 {
    public Object stat2(Object x) {
        Integer x = 2;
        Integer m = 6;
        Integer s = 10;

        while (x>3) {
            Integer y = 2;
        }
        return m;
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

