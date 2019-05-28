package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ValueParser {
  private static Map<Class, Function<String, Object>> converters = new HashMap<>();

  static {
    converters.put(Boolean.class, ""::equalsIgnoreCase);
    converters.put(Integer.class, Integer::valueOf);
    converters.put(String.class, s -> s);
  }

  public static <T> T parser(String valueText, Class<T> clz) {
    return (T) converters.get(clz).apply(valueText);
  }
}
