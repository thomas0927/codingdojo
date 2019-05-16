package com.coding.dojo.args;

public class Argument {
  private Character flag;
  private String value;

  public Argument(Character flag, String value) {

    this.flag = flag;
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}
