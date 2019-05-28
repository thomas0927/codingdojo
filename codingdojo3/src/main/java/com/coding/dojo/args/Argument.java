package com.coding.dojo.args;

public class Argument {
  private Character flag;

  public String getValue() {
    return value;
  }

  private String value;

  public Argument(Character flag, String value) {
    this.flag = flag;
    this.value = value;
  }
}
