package com.coding.dojo.args;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Schemas {
  public static final String REGEX = " ";
  private Map<Character, Schema> schemasMap;

  public Schemas(String schemasAsText) {
    this.schemasMap =
        Arrays.stream(schemasAsText.split(REGEX))
            .collect(Collectors.toMap(s -> s.charAt(0), s -> SchemaParser.parser(s)));
  }

  public <T> T getArgsValue(Character flag, String value) {
    return (T) this.schemasMap.get(flag).getValue(value);
  }
}
