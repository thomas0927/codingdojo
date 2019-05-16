package com.coding.dojo.args;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class SchemaParser {
  public static final String REGEX = ":";
  public static Map<String, Function<String, Object>> converters = new HashMap<>();

  public static final String REGEX_VALUE = ",";

  static {
    converters.put(
        "boolean", s -> new Schema(Boolean.class, (null == s) ? Boolean.FALSE : Boolean.TRUE));
    converters.put("integer", s -> new Schema(Integer.class, (null == s) ? 0 : Integer.valueOf(s)));
    converters.put(
        "integers",
        s ->
            new Schema(
                Integer[].class,
                (null == s)
                    ? new Integer[] {0}
                    : Arrays.stream(s.split(REGEX_VALUE))
                        .mapToInt(i -> Integer.valueOf(i))
                        .toArray()));
    converters.put("string", s -> new Schema(String.class, (null == s) ? "" : s));
    converters.put(
        "strings",
        s -> new Schema(String[].class, (null == s) ? new String[] {""} : s.split(REGEX_VALUE)));
  }

  public static Schema parser(String schemaAsText) {
    String[] schemas = schemaAsText.split(REGEX);
    String type = schemas[1];
    final String value = (schemas.length > 2) ? schemas[2] : null;
    return (Schema) converters.get(type).apply(value);
  }
}
