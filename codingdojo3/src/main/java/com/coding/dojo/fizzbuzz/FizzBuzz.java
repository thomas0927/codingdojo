package com.coding.dojo.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
  public String say(int i) {
    return Rules.all().stream()
        .map(rule -> rule.exec(i))
        .reduce(String::concat)
        .filter(s -> !s.isEmpty())
        .orElse(String.valueOf(i));
  }

  public String print(int i) {
    return IntStream.range(1, i + 1).mapToObj(this::say).collect(Collectors.joining(","));
  }
}
