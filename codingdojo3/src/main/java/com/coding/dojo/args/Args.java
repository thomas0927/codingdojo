package com.coding.dojo.args;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Args {
  private final Map<Character, Argument> argsMap;
  private Schemas schemas;
  private final Argument defaultArgument = new Argument('-', null);

  public Args(String argsAsText, String schemasAsText) {
    this.schemas = new Schemas(schemasAsText);
    this.argsMap =
        Arrays.stream(argsAsText.substring(1).split("-"))
            .collect(
                Collectors.toMap(
                    args -> args.charAt(0),
                    args -> new Argument(args.charAt(0), StringUtils.trim(args.substring(1)))));
  }

  public Object getValue(Character flag) {
    return schemas.getArgsValue(flag, getValueOfNullable(flag));
  }

  private String getValueOfNullable(Character flag) {
    return Optional.ofNullable(argsMap.get(flag)).orElse(defaultArgument).getValue();
  }
}
