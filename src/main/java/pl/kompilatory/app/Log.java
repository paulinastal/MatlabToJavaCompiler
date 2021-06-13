package pl.kompilatory.app;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Log {
    PROGRAM_START("Program start"),
    STATEMENT_START("Statement start"),
    EXPRESSION_START("Expression start"),
    FUNCTION_DEF_START("Function definition start"),
    ARRAY_START("Array start"),
    ASSIGN_START("Assign start"),
    FUNCTION_START("Function start"),
    SWITCH_START("Switch start"),
    IF_START("If start"),
    WHILE_START("While start"),
    FOR_START("For start"),
    LOGIC_EXPRESSION_START("Logic expression start"),
    PARENTHESIS_EXPRESSION_START("Parenthesis expression start"),

    PROGRAM_STOP("Program stop"),
    STATEMENT_STOP("Statement stop"),
    EXPRESSION_STOP("Expression stop"),
    FUNCTION_DEF_STOP("Function definition stop"),
    ARRAY_STOP("Array stop"),
    ASSIGN_STOP("Assign stop"),
    FUNCTION_STOP("Function stop"),
    SWITCH_STOP("Switch stop"),
    IF_STOP("If stop"),
    WHILE_STOP("While stop"),
    FOR_STOP("For stop"),
    LOGIC_EXPRESSION_STOP("Logic expression stop"),
    PARENTHESIS_EXPRESSION_STOP("Parenthesis expression stop");

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
