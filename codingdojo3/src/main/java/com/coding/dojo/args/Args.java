package com.coding.dojo.args;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

import static com.coding.dojo.args.ErrorCode.INVALID_ARGUMENT_FORMAT;
import static com.coding.dojo.args.ErrorCode.INVALID_ARGUMENT_NAME;

class Args {

    private static final String BOOL = "bool";
    private static final String INT = "int";
    private static final String STRING = "string";
    private static final String STRING1 = "string";
    private static final int STRING_ELEMENTS_LENGTH = 3;
    private final Map<String, Argument> supportArgumentMap;
    private final Set<String> argumentsKey;

    public Args(String schema, String commands) {
        supportArgumentMap = new HashMap<>();
        argumentsKey = new HashSet<>();
        parseSchema(schema);
        parseCommands(Arrays.asList(commands.split("-")));
    }
    private void parseCommands(List<String> commands) {
        commands.forEach(command -> {
            try {
                parseArgumentValue(StringUtils.trim(command).split(" "));
            } catch (ArgsException e) {
                e.printStackTrace();
            }
        });
    }
    private void parseArgumentValue(String[] argumentKeyValue) throws ArgsException {
        if (!validateArgumentValue(argumentKeyValue[0],1)) {
            return;
        }
        String argumentId = argumentKeyValue[0];
        Argument arg = supportArgumentMap.get(argumentId);
        arg.setValue(argumentKeyValue);
        this.argumentsKey.add(argumentId);
    }
    private boolean validateArgumentValue(String argumentKey, int length) {
        return argumentKey.length() == length;
    }
    private void parseSchema(String schema) {
        Arrays.stream(schema.split(";")).filter(element -> element.length() > 0).forEach(element -> {
            try {
                parseSchemaElement(StringUtils.trim(element));
            } catch (ArgsException e) {
                e.printStackTrace();
            }
        });
    }
    private void parseSchemaElement(String element) throws ArgsException {
        String[] elements = element.split(":");
        String elementId = elements[0];
        String elementType = elements[1];
        validateArgumentValue( elementId);
        if (elementType.equals(BOOL)) {
            supportArgumentMap.put(elementId, new BooleanArgument(elements[1]));
        } else if (elementType.equals(INT)) {
            supportArgumentMap.put(elementId, new IntegerArgument(elements[2]));
        } else if (elementType.equals(STRING) && elements.length == STRING_ELEMENTS_LENGTH) {
            supportArgumentMap.put(elementId, new StringArgument(elements[2]));
        } else if (elementType.equals(STRING1)) {
            supportArgumentMap.put(elementId, new StringArgument(""));
        } else {
            throw new ArgsException(INVALID_ARGUMENT_FORMAT, elementId);
        }
    }

    private void validateArgumentValue(String elementId) throws ArgsException {
        if (!Character.isLetter(elementId.charAt(0))) {
            throw new ArgsException(INVALID_ARGUMENT_NAME, elementId);
        }
    }

    public Object getArgumentValue(String argument) {
        return this.supportArgumentMap.get(argument).getValue();
    }

}
