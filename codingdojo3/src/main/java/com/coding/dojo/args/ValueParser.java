package com.coding.dojo.args;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ValueParser {
  public static Map<Class, Function<String, Object>> converters = new HashMap<>();

  public static final String REGEX = ",";

  static {
    converters.put(Boolean.class, str -> "".equalsIgnoreCase(str));
    converters.put(Integer.class, str -> Integer.valueOf(str));
    converters.put(
        Integer[].class,
        str -> Arrays.stream(str.split(REGEX)).mapToInt(s -> Integer.parseInt(s)).toArray());
    converters.put(String.class, str -> str);
    converters.put(String[].class, str -> str.split(REGEX));
  }

  public static Object parser(String value, Class type) {
    return converters.get(type).apply(value);
  }
}
