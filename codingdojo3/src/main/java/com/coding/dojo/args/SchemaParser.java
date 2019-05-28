package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;

public class SchemaParser {
  private static Map<String, Schema> converters = new HashMap<>();

  static {
    converters.put("boolean", new Schema(Boolean.class, Boolean.FALSE));
  }

  public static Schema parser(String schemasAsText) {
    String[] schemasList = schemasAsText.split(":");
    String type = schemasList[1];

    return converters.get(type);
  }
}
