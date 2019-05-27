package com.coding.dojo.fizzbuzz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
  public String say(Integer number) {
    String[] results = getRulesResult(number);
    return getComponentRuleResult(number, results);
  }

  private String getComponentRuleResult(Integer number, String[] results) {
    return Arrays.stream(results)
        .filter(v -> !v.isEmpty())
        .reduce(String::concat)
        .orElse(String.valueOf(number));
  }

  private String[] getRulesResult(Integer number) {
    List<Executable> rules = Rules.all();
    return rules.stream().map(rule -> rule.exec(number)).toArray(String[]::new);
  }

  private String getFizzRuleResult(Integer number) {
    return (number % 3 == 0 || isContains(number, "3")) ? "Fizz" : "";
  }

  private String getBuzzRuleResult(Integer number) {
    return (number % 5 == 0 || isContains(number, "5")) ? "Buzz" : "";
  }

  private boolean isContains(Integer number, String s) {
    return String.valueOf(number).contains(s);
  }

  public String print(int count) {
    return IntStream.range(1, count + 1).mapToObj(this::say).collect(Collectors.joining("\n"));
  }
}
