package com.coding.dojo.args;

public class Schema<T> {
  private Class clz;
  private T defaultValue;

  public Schema(Class clz, T defaultValue) {
    this.clz = clz;
    this.defaultValue = defaultValue;
  }

  public T getValue() {
    return this.defaultValue;
  }

  public T getValue(String value) {
    if (null == value) {
      return getValue();
    }
    return (T) Boolean.TRUE;
  }
}
