package com.coding.dojo.args;

public class SchemaParser {

  public static Schema parser(String schemaAsText) {
    return new Schema(Boolean.class, Boolean.FALSE);
  }
}
