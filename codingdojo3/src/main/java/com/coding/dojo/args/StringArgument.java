package com.coding.dojo.args;

public class StringArgument implements Argument {

    private static final String DEFAULT_VALUE = "";
    private String value=DEFAULT_VALUE;

    StringArgument(String defaultValue) {
        String valueDefault = defaultValue;
    }

    @Override
    public void setValue(String[] value) throws ArgsException {
        try {
            this.value=value[1];
        }catch (Exception e){
            throw new ArgsException(ErrorCode.INVALID_ARGUMENT_FORMAT);
        }
    }

    @Override
    public Object getValue() {
        return this.value;
    }

// --Commented out by Inspection START (2019/5/10 13:04):
//    public static String getValue(Argument argument){
//        if(argument instanceof StringArgument){
//            return ((StringArgument) argument).value;
//        }else {
//            return ((StringArgument) argument).valueDefault;
//        }
//    }
// --Commented out by Inspection STOP (2019/5/10 13:04)
}
