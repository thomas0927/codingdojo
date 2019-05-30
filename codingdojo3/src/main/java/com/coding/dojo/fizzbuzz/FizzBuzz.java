package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public String say(Integer number) {
    return Rules.all().stream()
        .map(rule -> rule.exec(number))
        .filter(s -> !s.isEmpty())
        .reduce(String::concat)
        .orElse(String.valueOf(number));
  }
}
