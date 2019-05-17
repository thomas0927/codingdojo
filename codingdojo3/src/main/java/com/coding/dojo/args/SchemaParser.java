package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;

public class SchemaParser {

  public static final String REGEX = ":";
  private static Map<EnumSchema, Schema> converters = new HashMap<>();

  static {
    converters.put(EnumSchema.Bool, new Schema(EnumSchema.Bool, Boolean.FALSE));
    converters.put(EnumSchema.Int, new Schema(EnumSchema.Int, 0));
    converters.put(EnumSchema.Str, new Schema(EnumSchema.Str, ""));
  }

  public static Schema parser(String schemaAsText) {
    String[] schemaSplit = schemaAsText.split(REGEX);
    String type = schemaSplit[1];
    return converters.get(EnumSchema.valueOf(type));
  }
}
