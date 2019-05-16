package com.coding.dojo.args;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Args {
  public static final String REGEX = "-";
  private Schemas schemas;
  private Map<Character, Argument> argsMap;

  public Args(Schemas schemas, String argsAsText) {
    this.schemas = schemas;
    this.argsMap =
        Arrays.stream(argsAsText.substring(1).split(REGEX))
            .collect(
                Collectors.toMap(
                    s -> s.charAt(0),
                    s -> new Argument(s.charAt(0), StringUtils.trim(s.substring(1)))));
  }

  public Object getValue(Character flag) {
    return schemas.getArgsValue(flag, argsMap.get(flag).getValue());
  }
}
