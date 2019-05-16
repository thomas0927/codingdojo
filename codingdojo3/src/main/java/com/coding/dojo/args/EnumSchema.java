package com.coding.dojo.args;

public enum EnumSchema {
  Bool("bool"),
  Int("int"),
  String("str");

  private String type;

  EnumSchema(String type) {

    this.type = type;
  }
}
