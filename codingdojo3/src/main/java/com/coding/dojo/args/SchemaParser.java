package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;

public class SchemaParser {

  public static final String REGEX = ":";
  private static Map<String, Schema> converters = new HashMap<>();

  static {
    converters.put("bool", new Schema(Boolean.class, Boolean.FALSE));
    converters.put("int", new Schema(Integer.class, 0));
    converters.put("str", new Schema(String.class, ""));
  }

  public static Schema parser(String schemaAsText) {
    String[] schemaSplit = schemaAsText.split(REGEX);
    String type = schemaSplit[1];
    return converters.get(type);
  }
}
