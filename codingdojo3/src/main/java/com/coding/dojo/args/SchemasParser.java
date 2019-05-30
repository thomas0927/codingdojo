package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;

public class SchemasParser {
  private static Map<String, Schema> converters = new HashMap<>();

  static {
    converters.put("&", new Schema(Boolean.class, Boolean.FALSE));
    converters.put("@", new Schema(Integer.class, 0));
    converters.put("#", new Schema(String.class, ""));
  }

  public static Schema parser(String schemaAsText) {
    return converters.get(schemaAsText.split(":")[1]);
  }
}
