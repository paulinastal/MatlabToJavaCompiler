package pl.kompilatory.app;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Log {
    PROGRAM_START("Program start"),
    STATEMENT_START("Statement start"),
    FUNCTION_DEF_START("Function definition start"),
    FUNCTION_PARAMS_START("Function params start"),
    FUNCTION_RETURNS_START("Function returns start"),
    ARRAY_START("Array start"),
    ASSIGN_START("Assign start"),
    FUNCTION_START("Function start"),
    SWITCH_START("Switch start"),
    IF_START("If start"),
    WHILE_START("While start"),
    FOR_START("For start"),
    LOGIC_EXPRESSION_START("Logic expression start"),
    PARENTHESIS_EXPRESSION_START("Parenthesis expression start"),
    MATH_EXPRESSION_START("Math expression start"),
    COLON_EXPRESSION_START("Colon expression start"),
    LOGIC_NEGATION_START("Logic negation start"),

    PROGRAM_STOP("Program stop"),
    STATEMENT_STOP("Statement stop"),
    FUNCTION_DEF_STOP("Function definition stop"),
    FUNCTION_PARAMS_STOP("Function params stop"),
    FUNCTION_RETURNS_STOP("Function returns stop"),
    ARRAY_STOP("Array stop"),
    ASSIGN_STOP("Assign stop"),
    FUNCTION_STOP("Function stop"),
    SWITCH_STOP("Switch stop"),
    IF_STOP("If stop"),
    WHILE_STOP("While stop"),
    FOR_STOP("For stop"),
    LOGIC_EXPRESSION_STOP("Logic expression stop"),
    PARENTHESIS_EXPRESSION_STOP("Parenthesis expression stop"),
    MATH_EXPRESSION_STOP("Math expression stop"),
    COLON_EXPRESSION_STOP("Colon expression stop"),
    LOGIC_NEGATION_STOP("Logic negation stop");

    private final String name;

    Log(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<String> getLogList() {
        return Stream.of(Log.values()).map(Log::getName).collect(Collectors.toList());
    }
}
