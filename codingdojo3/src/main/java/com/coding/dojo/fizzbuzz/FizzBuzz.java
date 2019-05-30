package com.coding.dojo.fizzbuzz;

import java.util.List;

public class FizzBuzz {
  public String say(int number) {
    List<Executable> rules = Rules.all();
    return rules.stream()
        .map(rule -> rule.exec(number))
        .reduce(String::concat)
        .filter(s -> !s.isEmpty())
        .orElse(String.valueOf(number));
  }
}
