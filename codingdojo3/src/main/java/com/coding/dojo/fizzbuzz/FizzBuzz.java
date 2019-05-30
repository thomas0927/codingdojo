package com.coding.dojo.fizzbuzz;

import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {
  public String say(int number) {
    List<Executable> rules = Rules.all();
    return rules.stream()
        .map(rule -> rule.exec(number))
        .reduce(String::concat)
        .filter(s -> !s.isEmpty())
        .orElse(String.valueOf(number));
  }

  public String[] print(int total) {
    return IntStream.range(1, total + 1).mapToObj(this::say).toArray(String[]::new);
  }
}
