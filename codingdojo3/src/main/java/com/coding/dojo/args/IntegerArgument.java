package com.coding.dojo.args;

/**
 * @author admin
 */
public class IntegerArgument implements Argument {

    private static final int DEFAULT_VALUE = 0;
    private int value=DEFAULT_VALUE;

    public IntegerArgument(String defaultValue) {
        int valueDefault = Integer.parseInt(defaultValue);
        this.value= valueDefault;
    }

    @Override
    public void setValue(String[] value) throws ArgsException {
        try {
            this.value=Integer.parseInt(value[1]);
        }catch (Exception e){
            throw new ArgsException(ErrorCode.INVALID_INTEGER,value[1]);
        }
    }

    @Override
    public Object getValue() {
        return this.value;
    }

// --Commented out by Inspection START (2019/5/10 13:04):
//    public static int getValue(Argument argument){
//        if(argument instanceof IntegerArgument){
//            return ((IntegerArgument) argument).value;
//        }
//        return ((IntegerArgument) argument).valueDefault;
//    }
// --Commented out by Inspection STOP (2019/5/10 13:04)
}
