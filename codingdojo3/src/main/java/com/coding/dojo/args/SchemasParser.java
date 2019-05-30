package com.coding.dojo.args;

public class SchemasParser {
  public static Schema parser(String schemaAsText) {
    return new Schema(Boolean.class, Boolean.FALSE);
  }
}
