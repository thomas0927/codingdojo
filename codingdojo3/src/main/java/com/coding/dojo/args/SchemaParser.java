package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;

public class SchemaParser {
  public static Map<String, Schema> converters = new HashMap<>();

  static {
    converters.put("boolean", new Schema<>(Boolean.class, Boolean.FALSE));
  }

  public static Schema parser(String schemasAsText) {
    String[] schemas = schemasAsText.split(":");
    String type = schemas[1];
    return converters.get(type);
  }
}
