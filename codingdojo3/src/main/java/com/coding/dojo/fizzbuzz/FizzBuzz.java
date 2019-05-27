package com.coding.dojo.fizzbuzz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
  public String say(Integer number) {
    String[] result = getResult(number);
    return getComponentResult(number, result);
  }

  private String[] getResult(Integer number) {
    List<Executable> rules = Rules.all();
    return rules.stream().map(rule -> rule.exec(number)).toArray(String[]::new);
  }

  private String getComponentResult(Integer number, String[] result) {
    return Arrays.stream(result)
        .filter(s -> !s.isEmpty())
        .reduce(String::concat)
        .orElse(String.valueOf(number));
  }
}
