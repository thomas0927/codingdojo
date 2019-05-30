package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;

public class SchemaParser {
  private static Map<String, Schema> converters = new HashMap<>();

  static {
    converters.put("boolean", new Schema<>(Boolean.class, Boolean.FALSE));
    converters.put("integer", new Schema<>(Integer.class, 0));
    converters.put("string", new Schema<>(String.class, ""));
    converters.put("strings", new Schema<>(String.class, ""));
  }

  public static Schema parser(String schemasAsText) {
    String[] schemasList = schemasAsText.split(":");
    String type = schemasList[1];

    return converters.get(type);
  }
}
