package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ValueParser {

  private static Map<EnumSchema, Function<String, Object>> converters = new HashMap<>();

  static {
    converters.put(EnumSchema.Bool, s -> "".equalsIgnoreCase(s));
    converters.put(EnumSchema.Int, s -> Integer.parseInt(s));
    converters.put(EnumSchema.Str, s -> s);
  }

  public static Object parser(String value, EnumSchema type) {
    return converters.get(type).apply(value);
  }
}
