package com.coding.dojo.args;

public class Argument {
  private final Character flag;
  private final String value;

  public Argument(Character flag, String value) {

    this.flag = flag;
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
