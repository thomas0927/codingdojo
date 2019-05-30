package com.coding.dojo.args;

public class Schema<T> {
  private final Class clz;
  private final T defaultValue;

  public Schema(Class clz, T defaultValue) {
    this.clz = clz;
    this.defaultValue = defaultValue;
  }

  public T getValue() {
    return this.defaultValue;
  }

  public T getValue(String value) {
    if (null == value) {
      return this.defaultValue;
    }
    return (T) ValueParser.parser(value, clz);
  }
}
