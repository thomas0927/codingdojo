package com.coding.dojo.args;

public class Schema<T> {

  private Class<T> clz;
  private T defaultValue;

  public Schema(Class<T> clz, T defaultValue) {
    this.clz = clz;
    this.defaultValue = defaultValue;
  }

  public T getValue() {
    return this.defaultValue;
  }
}
