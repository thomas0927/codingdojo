package com.coding.dojo.fizzbuzz;

import java.util.Arrays;
import java.util.List;

public class Rules {
  public static List<Executable> all() {
    return Arrays.asList(FizzBuzzRule.build(3, "Fizz"), FizzBuzzRule.build(5, "Buzz"));
  }
}
