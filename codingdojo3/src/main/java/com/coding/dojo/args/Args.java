package com.coding.dojo.args;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Args {
  private Schemas schemas;
  private Map<Character, Argument> argsMap;
  private Argument defaultArgument;

  public Args(Schemas schemas, String argsText) {
    this.schemas = schemas;
    this.defaultArgument = new Argument('-', null);
    this.argsMap =
        Arrays.stream(argsText.substring(1).split("-"))
            .collect(
                Collectors.toMap(
                    args -> args.charAt(0),
                    args -> new Argument(args.charAt(0), StringUtils.trim(args.substring(1)))));
  }

  public Object getValue(Character flag) {
    return schemas.getArgsValue(
        flag, Optional.ofNullable(argsMap.get(flag)).orElse(defaultArgument).getValue());
  }
}
