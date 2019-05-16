package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class SchemaParser {
  public static final String REGEX = ":";
  public static Map<String, Function<String, Object>> converters = new HashMap<>();

  static {
    converters.put(
        "boolean", s -> new Schema(Boolean.class, (null == s) ? Boolean.FALSE : Boolean.TRUE));
    converters.put("integer", s -> new Schema(Integer.class, (null == s) ? 0 : Integer.valueOf(s)));
    converters.put("string", s -> new Schema(String.class, (null == s) ? "" : s));
  }

  public static Schema parser(String schemaAsText) {
    String[] schemas = schemaAsText.split(REGEX);
    String type = schemas[1];
    final String value = (schemas.length > 2) ? schemas[2] : null;
    return (Schema) converters.get(type).apply(value);
  }
}
