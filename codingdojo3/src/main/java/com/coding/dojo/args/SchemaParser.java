package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;

public class SchemaParser {

  public static final String REGEX = ":";
  private static Map<String, Schema> converters = new HashMap<>();

  static {
    converters.put("bool", new Schema(EnumSchema.Bool, Boolean.FALSE));
    converters.put("int", new Schema(EnumSchema.Int, 0));
    converters.put("str", new Schema(EnumSchema.String, ""));
  }

  public static Schema parser(String schemaAsText) {
    String[] schemaSplit = schemaAsText.split(REGEX);
    String type = schemaSplit[1];
    return converters.get(type);
  }
}
