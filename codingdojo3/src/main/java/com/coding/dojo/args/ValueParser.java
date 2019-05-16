package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ValueParser {
  public static Map<Class, Function<String, Object>> converters = new HashMap<>();

  static {
    converters.put(Boolean.class, str -> "".equalsIgnoreCase(str));
    converters.put(Integer.class, str -> Integer.parseInt(str));
    converters.put(String.class, str -> str);
  }

  public static Object parser(String value, Class type) {
    return converters.get(type).apply(value);
  }
}
