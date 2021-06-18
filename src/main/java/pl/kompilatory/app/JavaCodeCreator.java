package pl.kompilatory.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class JavaCodeCreator {
    private String matlabFileName;
    private String javaFolderPath;


    private List<String> logList;
    private List<String> intermediateTranslation = new ArrayList<>();
    private Map<String, String> variableNamesTypesMap = new HashMap<>();

    public JavaCodeCreator() {
    }

    public void createFile() {
        try (
                var fileWriter = new FileWriter(javaFolderPath + matlabFileName + ".java");
                var bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            bufferedWriter.write("//Program napisany w JAVA");
            bufferedWriter.newLine();
            for (String translation : intermediateTranslation) {
                bufferedWriter.write(translation);
            }
//            System.out.println("File \"" + matlabFileName + ".java\" saved successfully. Congratulations! ");
        } catch (IOException e) {
            System.err.println("Sorry! Failed to save the file ");
        }
    }


    public void transformIntermediate() {
        String className = createClassName();
        intermediateTranslation.add("public class " + className + " {\n");
        int currentLogIndex = 0;
        if (logList.get(currentLogIndex).equals(Log.PROGRAM_START.getName())) {
            int nextElem = currentLogIndex + 1;
            if (logList.get(nextElem).equals(Log.FUNCTION_DEF_START.getName())) {
                while (!logList.get(nextElem).equals(Log.FUNCTION_DEF_STOP.getName())) {
                    nextElem = checkElement(nextElem);
                }
            } else {
                intermediateTranslation.add("    public static void main(String[] args) {\n");
                while (!logList.get(currentLogIndex).equals(Log.PROGRAM_STOP.getName())) {
                    currentLogIndex = checkElement(currentLogIndex);
                }
                intermediateTranslation.add("    }\n");
            }
        }
        intermediateTranslation.add("}\n");
    }

    private int checkElement(int currentLogIndex) {
        if (logList.get(currentLogIndex).equals(Log.ASSIGN_START.getName())) {
            int variableIndex = currentLogIndex + 1;
            String variableName = logList.get(variableIndex);
            checkIfKeyWord(variableName);
            boolean isVariableInMap = checkIfAlreadyExist(variableName);
            int valueIndex = variableIndex + 1;
            if (isVariableInMap) {
                intermediateTranslation.add("        " + variableName + " = ");
            } else {
                if (logList.get(valueIndex).equals(Log.MATH_EXPRESSION_START.getName())) {
                    valueIndex++;
                }
                String variableType = checkVariable(valueIndex);
                String valueType;
                if (variableType.equals("variable")) {
                    valueType = getVariableType(valueIndex);
                    variableNamesTypesMap.put(variableName, valueType);
                    intermediateTranslation.add("        " + valueType + " " + variableName + " = ");
                } else if (variableType.equals("array")) {
                    valueType = getVariableType(valueIndex + 1);
                    int semicolonCount = countSemicolons(valueIndex);
                    if (semicolonCount > 0) {
                        variableNamesTypesMap.put(variableName, "ArrayList<ArrayList<" + valueType + ">>");
                        intermediateTranslation.add("        ArrayList<ArrayList<" + valueType + ">> " + variableName + " = ");
                    } else {
                        variableNamesTypesMap.put(variableName, "ArrayList<" + valueType + ">");
                        intermediateTranslation.add("        ArrayList<" + valueType + "> " + variableName + " = ");
                    }
                } else {
                    valueType = "Object";
                    variableNamesTypesMap.put(variableName, valueType);
                    intermediateTranslation.add("        " + valueType + " " + variableName + " = ");
                }
            }
            while (!logList.get(valueIndex).equals(Log.ASSIGN_STOP.getName())) {
                valueIndex = checkElement(valueIndex);
            }
            intermediateTranslation.add(";\n");
            currentLogIndex = valueIndex;
        } else if (logList.get(currentLogIndex).equals(Log.SWITCH_START.getName())) {
            currentLogIndex = createSwitch(currentLogIndex);
        } else if (logList.get(currentLogIndex).equals(Log.IF_START.getName())) {
            currentLogIndex = createIf(currentLogIndex);
        } else if (logList.get(currentLogIndex).equals(Log.LOGIC_EXPRESSION_START.getName())) {
            currentLogIndex = createLogicExpression(currentLogIndex);
        } else if (logList.get(currentLogIndex).equals(Log.LOGIC_NEGATION_START.getName())) {
            intermediateTranslation.add("!");
            currentLogIndex++;
            while (!logList.get(currentLogIndex).equals(Log.LOGIC_NEGATION_STOP.getName())) {
                currentLogIndex = checkElement(currentLogIndex);
            }
        } else if (logList.get(currentLogIndex).equals(Log.WHILE_START.getName())) {
            currentLogIndex = createWhile(currentLogIndex);
        } else if (logList.get(currentLogIndex).equals(Log.FOR_START.getName())) {
            currentLogIndex = createFor(currentLogIndex);
        } else if (logList.get(currentLogIndex).equals(Log.PARENTHESIS_EXPRESSION_START.getName())) {
            currentLogIndex = createParenthesisExpression(currentLogIndex);
        } else if (MathOperator.getMathOperatorList().contains(logList.get(currentLogIndex))) {
            currentLogIndex = createMathExpression(currentLogIndex);
        } else if (logList.get(currentLogIndex).equals(Log.ARRAY_START.getName())) {
            currentLogIndex = createArrayList(currentLogIndex);
        } else if (logList.get(currentLogIndex).equals(Log.FUNCTION_START.getName())) {
            currentLogIndex = createFunctionCall(currentLogIndex);
        } else if (logList.get(currentLogIndex).equals(Log.FUNCTION_DEF_START.getName())) {
            currentLogIndex = createFunction(currentLogIndex);
        } else if (!Log.getLogList().contains(logList.get(currentLogIndex))) {
            checkIfKeyWord(logList.get(currentLogIndex));
            intermediateTranslation.add(logList.get(currentLogIndex));
        }
        currentLogIndex++;
        return currentLogIndex;
    }

    private int createFunction(int valueIndex) {
        int functionNameIndex = valueIndex + 1;
        String functionName = logList.get(functionNameIndex);
        checkIfKeyWord(functionName);

        ArrayList<String> returnedVariablesNames = new ArrayList<>();
        if (logList.get(functionNameIndex + 1).equals(Log.FUNCTION_RETURNS_START.getName())) {
            int functionReturnIndex = functionNameIndex + 2;
            while (!logList.get(functionReturnIndex).equals(Log.FUNCTION_RETURNS_STOP.getName())) {
                returnedVariablesNames.add(logList.get(functionReturnIndex));
                functionReturnIndex++;
            }
            functionNameIndex = functionReturnIndex;
        }

        String returnType = "void";
        if (returnedVariablesNames.size() == 1) {
            returnType = "Object";
        } else if (returnedVariablesNames.size() > 1) {
            returnType = "ReturnedObject";
        }

        intermediateTranslation.add("    public " + returnType + " " + functionName + " (");

        if (logList.get(functionNameIndex + 1).equals(Log.FUNCTION_PARAMS_START.getName())) {
            int functionParamsIndex = functionNameIndex + 2;
            while (!logList.get(functionParamsIndex).equals(Log.FUNCTION_PARAMS_STOP.getName())) {
                intermediateTranslation.add("Object " + logList.get(functionParamsIndex));
                if (!logList.get(functionParamsIndex + 1).equals(Log.FUNCTION_PARAMS_STOP.getName())) {
                    intermediateTranslation.add(", ");
                }
                functionParamsIndex++;
            }
            functionNameIndex = functionParamsIndex;
        }
        intermediateTranslation.add(") {\n");
        while (!logList.get(functionNameIndex).equals(Log.FUNCTION_DEF_STOP.getName())) {
            functionNameIndex = checkElement(functionNameIndex);
        }

        if (returnedVariablesNames.size() == 1) {
            String returnVariable = returnedVariablesNames.get(0);
            checkIfKeyWord(returnVariable);
            intermediateTranslation.add("        return " + returnVariable + ";\n    }\n");
        } else if (returnedVariablesNames.size() > 1) {
            StringBuilder returnedVariablesBuilder = new StringBuilder();
            for (String returnedVariablesName : returnedVariablesNames) {
                checkIfKeyWord(returnedVariablesName);
                returnedVariablesBuilder.append(returnedVariablesName);
                returnedVariablesBuilder.append(", ");
            }
            String returnedVariables = returnedVariablesBuilder.toString();
            intermediateTranslation.add("        return new ReturnedObject(" + returnedVariables.substring(0, returnedVariables.length() - 2) + ");\n    }\n");
        } else {
            intermediateTranslation.add("    }\n");
        }
        functionNameIndex--;
        return functionNameIndex;
    }

    private int countSemicolons(int valueIndex) {
        int semicolonCount = 0;
        int colonIndex = valueIndex + 1;
        while (!logList.get(colonIndex).equals(Log.ARRAY_STOP.getName())) {
            if (logList.get(colonIndex).equals(";")) {
                semicolonCount++;
            }
            colonIndex++;
        }
        return semicolonCount;
    }

    private boolean checkIfAlreadyExist(String variableName) {
        return variableNamesTypesMap.containsKey(variableName);
    }

    private int createParenthesisExpression(int currentLogIndex) {
        intermediateTranslation.add("(");
        currentLogIndex++;
        while (!logList.get(currentLogIndex).equals(Log.PARENTHESIS_EXPRESSION_STOP.getName())) {
            currentLogIndex = checkElement(currentLogIndex);
        }
        intermediateTranslation.add(")");
        return currentLogIndex;
    }

    private int createMathExpression(int currentLogIndex) {
        String mathSign = logList.get(currentLogIndex);
        String variableTypeLeft = checkVariable(currentLogIndex - 1);
        String variableTypeRight = checkVariable(currentLogIndex + 1);

        if (variableTypeLeft.equals("array") && variableTypeRight.equals("array")) {
            int size = intermediateTranslation.size() - 1;
            while (!intermediateTranslation.get(size).contains("new ArrayList<>(Arrays.asList(")) {
                size = size - 1;
            }
            String functionName = twoArrayFunction(mathSign);
            intermediateTranslation.add(size, functionName + "(");
            intermediateTranslation.add(", ");
            currentLogIndex = checkElement(currentLogIndex + 1);
            intermediateTranslation.add(")");
            currentLogIndex--;
        } else if (variableTypeLeft.equals("array")) {
            int size = intermediateTranslation.size() - 1;
            while (!intermediateTranslation.get(size).contains("new ArrayList<>(Arrays.asList(")) {
                size = size - 1;
            }
            String functionName = arrayScalarFunction(mathSign);
            intermediateTranslation.add(size, functionName + "(");
            intermediateTranslation.add(", ");
            currentLogIndex = checkElement(currentLogIndex + 1);
            intermediateTranslation.add(")");
            currentLogIndex--;
        } else {
            if (mathSign.equals(MathOperator.ELEMENT_WISE_MULTIPLY.getName())) {
                intermediateTranslation.add(" * ");
            } else if (mathSign.equals(MathOperator.ELEMENT_WISE_DIVIDE.getName())) {
                intermediateTranslation.add(" / ");
            } else if (mathSign.equals(MathOperator.POWER.getName()) || mathSign.equals(MathOperator.ELEMENT_WISE_POWER.getName())) {
                int size = intermediateTranslation.size() - 1;
                intermediateTranslation.add(size, "Math.pow(");
                intermediateTranslation.add(", ");
                currentLogIndex = checkElement(currentLogIndex + 1);
                intermediateTranslation.add(")");
                currentLogIndex--;
            } else {
                intermediateTranslation.add(" " + mathSign + " ");
            }
        }
        return currentLogIndex;
    }

    private String twoArrayFunction(String mathSign) {
        if (mathSign.equals(MathOperator.PLUS.getName())) {
            return MatrixFunction.ADD_TWO_ARRAYS.getName();
        } else if (mathSign.equals(MathOperator.MINUS.getName())) {
            return MatrixFunction.DELETE_TWO_ARRAYS.getName();
        } else if (mathSign.equals(MathOperator.MULTIPLY.getName())) {
            return MatrixFunction.MULTIPLY_TWO_ARRAYS.getName();
        } else if (mathSign.equals(MathOperator.DIVIDE.getName())) {
            return MatrixFunction.DIVIDE_TWO_ARRAYS.getName();
        } else if (mathSign.equals(MathOperator.ELEMENT_WISE_MULTIPLY.getName())) {
            return MatrixFunction.ELEM_WISE_MULTIPLY.getName();
        } else if (mathSign.equals(MathOperator.ELEMENT_WISE_DIVIDE.getName())) {
            return MatrixFunction.ELEM_WISE_DIVIDE.getName();
        } else {
            return MatrixFunction.ERROR.getName();
        }
    }

    private String arrayScalarFunction(String mathSign) {
        if (mathSign.equals(MathOperator.PLUS.getName())) {
            return MatrixFunction.ADD_SCALAR_TO_ARRAY.getName();
        } else if (mathSign.equals(MathOperator.MINUS.getName())) {
            return MatrixFunction.DELETE_SCALAR_FROM_ARRAY.getName();
        } else if (mathSign.equals(MathOperator.MULTIPLY.getName()) || mathSign.equals(MathOperator.ELEMENT_WISE_MULTIPLY.getName())) {
            return MatrixFunction.MULTIPLY_ARRAY_BY_SCALAR.getName();
        } else if (mathSign.equals(MathOperator.DIVIDE.getName()) || mathSign.equals(MathOperator.ELEMENT_WISE_DIVIDE.getName())) {
            return MatrixFunction.DIVIDE_ARRAY_BY_SCALAR.getName();
        } else if (mathSign.equals(MathOperator.POWER.getName())) {
            return MatrixFunction.POWER_ARRAY.getName();
        } else if (mathSign.equals(MathOperator.ELEMENT_WISE_POWER.getName())) {
            return MatrixFunction.ELEM_WISE_POWER.getName();
        } else {
            return MatrixFunction.ERROR.getName();
        }
    }

    private int createArrayList(int currentLogIndex) {
        String arrayName;
        if (logList.get(currentLogIndex - 1).equals(Log.MATH_EXPRESSION_START.getName())) {
            arrayName = logList.get(currentLogIndex - 2);
        } else {
            arrayName = logList.get(currentLogIndex - 1);
        }
        int arrayElemIndex = currentLogIndex + 1;
        int colonIndex = arrayElemIndex;
        int semicolonsCount = countSemicolons(colonIndex);
        if (semicolonsCount > 0) {
            intermediateTranslation.add("new ArrayList<>();\n");
            while (!logList.get(arrayElemIndex).equals(Log.ARRAY_STOP.getName())) {
                intermediateTranslation.add("        " + arrayName + ".add(new ArrayList<>(Arrays.asList(");
                if (logList.get(arrayElemIndex).equals(";")) {
                    arrayElemIndex++;
                }
                while (!logList.get(arrayElemIndex).equals(";") && !logList.get(arrayElemIndex).equals(Log.ARRAY_STOP.getName())) {
                    arrayElemIndex = checkElement(arrayElemIndex);
                    if (!logList.get(arrayElemIndex).equals(";") && !logList.get(arrayElemIndex).equals(Log.ARRAY_STOP.getName())) {
                        intermediateTranslation.add(", ");
                    }
                }

                if (logList.get(arrayElemIndex).equals(Log.ARRAY_STOP.getName())) {
                    intermediateTranslation.add(")))");
                } else {
                    intermediateTranslation.add(")));\n");
                }
            }
        } else {
            intermediateTranslation.add("new ArrayList<>(Arrays.asList(");
            while (!logList.get(arrayElemIndex).equals(Log.ARRAY_STOP.getName())) {
                arrayElemIndex = checkElement(arrayElemIndex);
                if (!logList.get(arrayElemIndex).equals(Log.ARRAY_STOP.getName())) {
                    intermediateTranslation.add(", ");
                }
            }
            intermediateTranslation.add("))");
        }
        currentLogIndex = arrayElemIndex;
        return currentLogIndex;
    }

    private int createFunctionCall(int currentLogIndex) {
        if (logList.get(currentLogIndex - 1).equals(Log.STATEMENT_START.getName())) {
            intermediateTranslation.add("        ");
        }
        int functionNameIndex = currentLogIndex + 1;
        String functionName = logList.get(functionNameIndex);
        checkIfKeyWord(functionName);
        int functionArgIndex = functionNameIndex + 1;
        intermediateTranslation.add(functionName + "(");
        while (!logList.get(functionArgIndex).equals(Log.FUNCTION_STOP.getName())) {
            functionArgIndex = checkElement(functionArgIndex);
            if (!logList.get(functionArgIndex).equals(Log.FUNCTION_STOP.getName())) {
                intermediateTranslation.add(", ");
            }
        }
        intermediateTranslation.add(")");
        if (logList.get(functionArgIndex + 1).equals(Log.STATEMENT_STOP.getName())) {
            intermediateTranslation.add(";\n");
        }
        currentLogIndex = functionArgIndex;
        return currentLogIndex;
    }

    private String checkVariable(int valueIndex) {
        if (logList.get(valueIndex).equals(Log.ARRAY_START.getName()) || logList.get(valueIndex).equals(Log.ARRAY_STOP.getName())) {
            return "array";
        } else if (logList.get(valueIndex).equals(Log.PARENTHESIS_EXPRESSION_START.getName()) || logList.get(valueIndex).equals(Log.PARENTHESIS_EXPRESSION_STOP.getName())) {
            return "parenthesis";
        } else if (logList.get(valueIndex).equals(Log.FUNCTION_START.getName()) || logList.get(valueIndex).equals(Log.FUNCTION_STOP.getName())) {
            return "function";
        } else {
            return "variable";
        }
    }

    private int createFor(int currentLogIndex) {
        intermediateTranslation.add("\n");
        int variableForIndex = currentLogIndex + 1;
        String variableFor = logList.get(variableForIndex);
        if (logList.get(variableForIndex + 1).equals(Log.ARRAY_START.getName())) {
            int valueIndex = variableForIndex + 2;
            String variableType = getVariableType(valueIndex);
            currentLogIndex = createArrayList(variableFor, valueIndex);
            intermediateTranslation.add("        for (" + variableType + " " + variableFor + "Element : " + variableFor + ") {\n");

        } else {
            intermediateTranslation.add("        for (int " + variableFor + " = ");
            int startIndex = variableForIndex + 2;
            intermediateTranslation.add(logList.get(startIndex) + "; " + variableFor + " < ");
            int endIndex = startIndex + 1;
            intermediateTranslation.add(logList.get(endIndex) + "; " + variableFor + "++) {\n");
            currentLogIndex = endIndex + 2;

        }
        while (!logList.get(currentLogIndex).equals(Log.FOR_STOP.getName())) {
            if (logList.get(currentLogIndex).equals(Log.STATEMENT_START.getName())) {
                intermediateTranslation.add("    ");
            }
            currentLogIndex = checkElement(currentLogIndex);
        }
        intermediateTranslation.add("        }\n");
        return currentLogIndex;
    }

    private int createWhile(int currentLogIndex) {
        intermediateTranslation.add("\n");
        intermediateTranslation.add("        while (");
        int whileElemIndex = currentLogIndex + 1;
        whileElemIndex = checkElement(whileElemIndex);
        intermediateTranslation.add(")");
        while (!logList.get(whileElemIndex).equals(Log.WHILE_STOP.getName())) {
            if (logList.get(whileElemIndex).equals("&&") || logList.get(whileElemIndex).equals("||")) {
                intermediateTranslation.add(" " + logList.get(whileElemIndex) + " (");
                whileElemIndex = checkElement(whileElemIndex + 1);
                intermediateTranslation.add(")");
            } else {
                if (logList.get(whileElemIndex).equals(Log.STATEMENT_START.getName()) && logList.get(whileElemIndex - 1).equals(Log.LOGIC_EXPRESSION_STOP.getName())) {
                    intermediateTranslation.add(" {\n    ");
                } else if (logList.get(whileElemIndex).equals(Log.STATEMENT_START.getName())) {
                    intermediateTranslation.add("    ");
                }
                whileElemIndex = checkElement(whileElemIndex);
            }
        }
        intermediateTranslation.add("        }\n");
        currentLogIndex = whileElemIndex;
        return currentLogIndex;
    }

    private int createIf(int currentLogIndex) {
        intermediateTranslation.add("\n");
        intermediateTranslation.add("        if (");
        int ifElementIndex = currentLogIndex + 1;
        ifElementIndex = checkElement(ifElementIndex);

        intermediateTranslation.add(")");
        while (!logList.get(ifElementIndex).equals(Log.IF_STOP.getName())) {
            if (logList.get(ifElementIndex).equals(Log.LOGIC_EXPRESSION_START.getName())) {
                intermediateTranslation.add("        } else if (");
                ifElementIndex = checkElement(ifElementIndex);
                intermediateTranslation.add(")");

            } else if (logList.get(ifElementIndex).equals(Log.STATEMENT_STOP.getName()) && logList.get(ifElementIndex + 1).equals(Log.STATEMENT_START.getName())) {
                intermediateTranslation.add("        } else ");
                ifElementIndex = checkElement(ifElementIndex + 1);
                ifElementIndex--;
            } else if (logList.get(ifElementIndex).equals("&&") || logList.get(ifElementIndex).equals("||")) {
                intermediateTranslation.add(" " + logList.get(ifElementIndex) + " (");
                ifElementIndex = checkElement(ifElementIndex + 1);
                intermediateTranslation.add(")");
            } else {
                if (logList.get(ifElementIndex).equals(Log.STATEMENT_START.getName())) {
                    intermediateTranslation.add(" {\n    ");
                }
                ifElementIndex = checkElement(ifElementIndex);
            }
        }
        intermediateTranslation.add("        }\n");
        currentLogIndex = ifElementIndex;
        return currentLogIndex;
    }

    private int createLogicExpression(int currentLogIndex) {
        currentLogIndex++;
        if (logList.get(currentLogIndex).equals("!")) {
            intermediateTranslation.add("!");
            currentLogIndex++;
        }
        if (logList.get(currentLogIndex).equals(Log.LOGIC_EXPRESSION_START.getName())) {
            currentLogIndex = checkElement(currentLogIndex);
            currentLogIndex--;
        } else {
            while (!logList.get(currentLogIndex).equals(Log.LOGIC_EXPRESSION_STOP.getName())) {
                intermediateTranslation.add(logList.get(currentLogIndex));
                currentLogIndex++;
            }
        }
        return currentLogIndex;
    }

    private int createSwitch(int currentLogIndex) {
        intermediateTranslation.add("\n");
        int variableIndex = currentLogIndex + 1;
        String variableName = logList.get(variableIndex);
        checkIfKeyWord(variableName);
        intermediateTranslation.add("        switch (" + variableName + ") {\n");
        int caseVariableIndex = variableIndex + 1;
        while (!logList.get(caseVariableIndex).equals(Log.SWITCH_STOP.getName())) {
            if (logList.get(caseVariableIndex).equals(Log.STATEMENT_START.getName())) {
                checkElement(caseVariableIndex + 1);
                intermediateTranslation.add("                break;\n");
                while (!logList.get(caseVariableIndex).equals(Log.STATEMENT_STOP.getName())) {
                    caseVariableIndex++;
                }
                if (logList.get(caseVariableIndex + 1).equals(Log.STATEMENT_START.getName())) {
                    intermediateTranslation.add("            default:\n        ");
                }
            } else {
                String caseValue = logList.get(caseVariableIndex);
                intermediateTranslation.add("            case " + caseValue + ":\n        ");
            }
            caseVariableIndex++;
        }
        intermediateTranslation.add("        }\n");
        currentLogIndex = caseVariableIndex;
        return currentLogIndex;
    }

    private void checkIfKeyWord(String variableName) {
        if (Keyword.getKeyWordsList().contains(variableName)) {
            intermediateTranslation.add("\n**** Error, illegal Java reserved key word used: " + variableName + " ****\n");
            System.err.println("**** Error, illegal Java reserved key word used: " + variableName + " ****");
            createFile();
            System.exit(1);
        }
    }


    private int createArrayList(String variableName, int valueIndex) {
        int currentLogIndex;
        int arrayElemIndex = valueIndex + 1;
        String elemType = getVariableType(arrayElemIndex);
        intermediateTranslation.add("        ArrayList<" + elemType + "> " + variableName + " = new ArrayList<>(Arrays.asList(");
        while (!logList.get(arrayElemIndex).equals(Log.ARRAY_STOP.getName())) {
            intermediateTranslation.add(logList.get(arrayElemIndex));
            arrayElemIndex++;
            if (!logList.get(arrayElemIndex).equals(Log.ARRAY_STOP.getName())) {
                intermediateTranslation.add(", ");
            }
        }
        intermediateTranslation.add("));\n");
        currentLogIndex = arrayElemIndex;
        return currentLogIndex;
    }

    private String getVariableType(int valueIndex) {
        String elemType;
        if (logList.get(valueIndex).equals(Log.MATH_EXPRESSION_START.getName())) {
            valueIndex++;
            elemType = getVariableType(valueIndex);
        } else if (logList.get(valueIndex).equals(Log.ARRAY_START.getName())) {
            valueIndex++;
            elemType = "ArrayList<" + getVariableType(valueIndex) + ">";
        } else if (logList.get(valueIndex).contains(".")) {
            elemType = "Double";
        } else if (logList.get(valueIndex).equals(Log.LOGIC_EXPRESSION_START.getName())) {
            elemType = "Boolean";
        } else if (logList.get(valueIndex).matches("[0-9]+")) {
            elemType = "Integer";
        } else if (variableNamesTypesMap.containsKey(logList.get(valueIndex))) {
            elemType = variableNamesTypesMap.get(logList.get(valueIndex));
        } else {
            elemType = "Object";
        }
        return elemType;
    }

    private String createClassName() {
        return matlabFileName.substring(0, 1).toUpperCase() + matlabFileName.substring(1);
    }


    public JavaCodeCreator(String matlabFileName, List<String> logList) {
        this.matlabFileName = matlabFileName;
        this.logList = logList;
    }

    public List<String> getLogList() {
        return logList;
    }

    public void setLogList(List<String> logList) {
        this.logList = logList;
    }

    public List<String> getIntermediateTranslation() {
        return intermediateTranslation;
    }

    public void setIntermediateTranslation(List<String> intermediateTranslation) {
        this.intermediateTranslation = intermediateTranslation;
    }

    public Map<String, String> getVariableNamesTypesMap() {
        return variableNamesTypesMap;
    }

    public void setVariableNamesTypesMap(Map<String, String> variableNamesTypesMap) {
        this.variableNamesTypesMap = variableNamesTypesMap;
    }

    public String getMatlabFileName() {
        return matlabFileName;
    }

    public void setMatlabFileName(String matlabFileName) {
        this.matlabFileName = matlabFileName;
    }

    public String getJavaFolderPath() {
        return javaFolderPath;
    }

    public void setJavaFolderPath(String javaFolderPath) {
        this.javaFolderPath = javaFolderPath;
    }

    private enum MathOperator {
        PLUS("+"),
        MINUS("-"),
        MULTIPLY("*"),
        ELEMENT_WISE_MULTIPLY(".*"),
        DIVIDE("/"),
        POWER("^"),
        ELEMENT_WISE_DIVIDE("./"),
        ELEMENT_WISE_POWER(".^");

        private final String name;

        MathOperator(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }

        public static List<String> getMathOperatorList() {
            return Stream.of(MathOperator.values()).map(MathOperator::getName).collect(Collectors.toList());
        }
    }

    private enum MatrixFunction {
        ADD_TWO_ARRAYS("addArrays"),
        DELETE_TWO_ARRAYS("deleteArrays"),
        MULTIPLY_TWO_ARRAYS("multiplyArrays"),
        DIVIDE_TWO_ARRAYS("divideArrays"),
        ELEM_WISE_MULTIPLY("elementWiseMultiplyArrays"),
        ELEM_WISE_DIVIDE("elementWiseDivideArrays"),
        ADD_SCALAR_TO_ARRAY("addArrayScalar"),
        DELETE_SCALAR_FROM_ARRAY("deleteArrayScalar"),
        MULTIPLY_ARRAY_BY_SCALAR("multiplyArrayScalar"),
        DIVIDE_ARRAY_BY_SCALAR("divideArrayScalar"),
        POWER_ARRAY("powerArray"),
        ELEM_WISE_POWER("elementWisePowerArray"),
        ERROR("ERROR");

        private final String name;

        MatrixFunction(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public enum Keyword {
        AND("and"),
        BOOLEAN("boolean"),
        BREAK("break"),
        CASE("case"),
        CATCH("catch"),
        CHAR("char"),
        CLASS("class"),
        DEFAULT("default"),
        DO("do"),
        DOUBLE("double"),
        ELSE("else"),
        ENUM("enum"),
        EXTENDS("extends"),
        FALSE("false"),
        FLOAT("float"),
        FOR("for"),
        FINAL("final"),
        FINALLY("finally"),
        IF("if"),
        IMPLEMENTS("implements"),
        IMPORT("import"),
        INSTANCE_OF("instanceof"),
        INT("int"),
        INTERFACE("interface"),
        LONG("long"),
        NATIVE("native"),
        NEW("new"),
        NULL("null"),
        PACKAGE("package"),
        PRIVATE("private"),
        PROTECTED("protected"),
        PUBLIC("public"),
        REQUIRES("requires"),
        RETURN("return"),
        SHORT("short"),
        STATIC("static"),
        SUPER("super"),
        SWITCH("switch"),
        SYNCHRONIZED("synchronized"),
        THIS("this"),
        THROW("throw"),
        THROWS("throws"),
        TRUE("true"),
        TRY("try"),
        VOID("void"),
        VOLATILE("volatile"),
        WHILE("while");

        private final String name;

        Keyword(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return getName();
        }

        public static List<String> getKeyWordsList() {
            return Stream.of(Keyword.values()).map(Keyword::getName).collect(Collectors.toList());
        }
    }
}
