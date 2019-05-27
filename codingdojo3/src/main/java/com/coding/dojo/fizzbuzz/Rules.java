package com.coding.dojo.fizzbuzz;

import java.util.Arrays;
import java.util.List;

public class Rules {
  public static List<Executable> all() {
    return Arrays.asList(DivisibleRule.create(3, "Fizz"), DivisibleRule.create(5, "Buzz"));
  }
}
