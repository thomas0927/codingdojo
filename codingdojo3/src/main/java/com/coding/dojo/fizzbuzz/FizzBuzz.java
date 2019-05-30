package com.coding.dojo.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
  public String say(Integer number) {
    return Rules.all().stream()
        .map(rule -> rule.exec(number))
        .filter(s -> !s.isEmpty())
        .reduce(String::concat)
        .orElse(String.valueOf(number));
  }

  public String print(int i) {
    return IntStream.range(1, i + 1).mapToObj(this::say).collect(Collectors.joining(","));
  }
}
