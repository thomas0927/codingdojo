package com.coding.dojo.args;

import java.util.HashMap;
import java.util.Map;

public class Schemas {
  private Map<Character, Schema> schemaMap;

  public Schemas(String schemasAsText) {
    this.schemaMap =
        new HashMap() {
          {
            put('l', new Schema<>(Boolean.class, Boolean.FALSE));
          }
        };
  }

  public Object getArgsValue(Character flag, String value) {
    return this.schemaMap.get(flag).getValue(value);
  }
}
