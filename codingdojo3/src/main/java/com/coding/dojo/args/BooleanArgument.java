package com.coding.dojo.args;

public class BooleanArgument implements Argument {

    private static final boolean DEFAULT_VALUE = false;
    private boolean value;

    public BooleanArgument(String valueDefault) {
        boolean valueDefault1 = Boolean.parseBoolean(valueDefault);
        this.value= valueDefault1;
    }

    @Override
    public void setValue(String[] value) {
        this.value=true;
    }

    @Override
    public Object getValue() {
        return value;
    }

// --Commented out by Inspection START (2019/5/10 13:04):
//    public static boolean getValue(Argument argument){
//        if(argument instanceof BooleanArgument){
//            return ((BooleanArgument) argument).value;
//        }else {
//            assert argument != null;
//            return ((BooleanArgument) argument).valueDefault;
//        }
//    }
// --Commented out by Inspection STOP (2019/5/10 13:04)
}
