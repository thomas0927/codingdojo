package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ValueParser {
  public static Map<Class, Function<String, Object>> converters = new HashMap<>();

  static {
    converters.put(Boolean.class, str -> "".equalsIgnoreCase(str));
  }

  public static Object parser(String value, Class type) {
    return Optional.ofNullable(converters.get(type))
        .map(parser -> parser.apply(value))
        .orElse(null);
  }
}
