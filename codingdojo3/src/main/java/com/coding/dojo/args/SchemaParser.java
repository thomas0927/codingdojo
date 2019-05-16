package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;

public class SchemaParser {

  public static final String REGEX = ":";
  private static Map<String, Schema> converters = new HashMap<>();

  static {
    converters.put("boolean", new Schema<>(Boolean.class, Boolean.FALSE));
    converters.put("integer", new Schema<>(Integer.class, 0));
    converters.put("string", new Schema<>(String.class, ""));
  }

  public static Schema<Boolean> parser(String schemaAsText) {
    String[] schemas = schemaAsText.split(REGEX);
    String type = schemas[1];
    return converters.get(type);
  }
}
