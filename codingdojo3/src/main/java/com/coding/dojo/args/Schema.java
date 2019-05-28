package com.coding.dojo.args;

public class Schema<T> {
  private Class<T> clz;

  public T getValue() {
    return defaultValue;
  }

  private T defaultValue;

  public Schema(Class<T> clz, T defaultValue) {
    this.clz = clz;
    this.defaultValue = defaultValue;
  }
}
