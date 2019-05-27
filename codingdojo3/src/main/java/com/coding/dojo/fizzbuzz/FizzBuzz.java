package com.coding.dojo.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
  public String say(int number) {
    if (number % 3 == 0 && number % 5 == 0) {
        return "FizzBuzz";
    }
    if (number % 3 == 0) {
      return "Fizz";
    }
    if (number % 5 == 0) {
      return "Buzz";
    }

    return String.valueOf(number);
  }

  public String print() {
    return IntStream.range(1, 101).mapToObj(this::say).collect(Collectors.joining("\n"));
  }
}
