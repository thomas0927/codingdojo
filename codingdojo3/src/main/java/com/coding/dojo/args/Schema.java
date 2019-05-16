package com.coding.dojo.args;

public class Schema<T> {
  private Class<T> clzType;
  private T defaultValue;

  public Schema(Class<T> clzType, T defaultValue) {

    this.clzType = clzType;
    this.defaultValue = defaultValue;
  }

  public T getValue(String value) {
    if (null == value) {
      return getValue();
    }
    return (T) ValueParser.parser(value, clzType);
  }

  public T getValue() {
    return this.defaultValue;
  }
}
