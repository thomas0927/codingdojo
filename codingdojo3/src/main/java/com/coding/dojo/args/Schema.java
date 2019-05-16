package com.coding.dojo.args;

public class Schema<T> {
  private EnumSchema clz;
  private T defaultValue;

  public Schema(EnumSchema clz, T defaultValue) {
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
    return (T) ValueParser.parser(value, this.clz);
  }
}
