package com.coding.dojo.args;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Args {
  private final Argument defaultArgument;
  private Schemas schemas;
  private Map<Character, Argument> argsMap;

  public Args(Schemas schemas, String argsAsText) {
    this.schemas = schemas;
    this.argsMap =
        Arrays.stream(argsAsText.substring(1).split("-"))
            .collect(
                Collectors.toMap(
                    args -> args.charAt(0),
                    args -> new Argument(args.charAt(0), StringUtils.trim(args.substring(1)))));
    this.defaultArgument = new Argument('-', null);
  }

  public Object getValue(Character flag) {
    return schemas.getArgsValue(
        flag, Optional.ofNullable(argsMap.get(flag)).orElse(defaultArgument).getValue());
  }
}
