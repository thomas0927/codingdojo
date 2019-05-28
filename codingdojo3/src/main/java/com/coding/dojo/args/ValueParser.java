package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ValueParser {
  private static Map<Class, Function<String, Object>> converters = new HashMap<>();

  static {
    converters.put(Boolean.class, str -> "".equalsIgnoreCase(str));
  }

  public static <T> T parser(String valueText, Class<T> clz) {
    return (T) converters.get(clz).apply(valueText);
  }
}
