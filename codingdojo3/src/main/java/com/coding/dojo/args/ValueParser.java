package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ValueParser {

  private static final Map<Class, Function<String, Object>> converters = new HashMap<>();

  static {
    converters.put(Boolean.class, ""::equalsIgnoreCase);
    converters.put(Integer.class, Integer::valueOf);
  }

  public static Object parser(String value, Class type) {
    return converters.get(type).apply(value);
  }
}
