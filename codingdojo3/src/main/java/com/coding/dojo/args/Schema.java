package com.coding.dojo.args;

public class Schema<T> {

    private Character flag;
    private Class<T> type;
    private T defaultValue;

    public Schema(Character flag, Class<T> type, T defaultValue) {
        this.flag = flag;
        this.type = type;
        this.defaultValue = defaultValue;
    }

    public static <T> Schema<T> parser(Character flag, Class<T> type, T defaultValue) {
        return new Schema<>( flag, type, defaultValue );
    }

    public T getValue() {
        return this.defaultValue;
    }

    public T getValue(Object value) {
        if (value == null) {
            return getValue();
        }
        return (T) ValueParserFactory.parserValue( value, type );
    }

    public Character getFlag() {
        return flag;
    }

}
