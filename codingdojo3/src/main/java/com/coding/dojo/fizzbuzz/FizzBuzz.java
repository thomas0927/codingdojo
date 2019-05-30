package com.coding.dojo.fizzbuzz;

public class FizzBuzz {
  public String say(int i) {

    return Rules.all().stream()
        .map(rule -> rule.exec(i))
        .reduce(String::concat)
        .filter(s -> !s.isEmpty())
        .orElse(String.valueOf(i));
  }
}
