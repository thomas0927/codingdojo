package com.coding.dojo.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
  public String say(int number) {

    if (isDivisible(number, 3) && isDivisible(number, 5)) {
      return "FizzBuzz";
    }
    if (contains(number, 3) || isDivisible(number, 3)) {
      return "Fizz";
    }
    if (contains(number, 5) || isDivisible(number, 5)) {
      return "Buzz";
    }

    return String.valueOf(number);
  }

  private boolean contains(int number, int i) {
    return number / 10 == i || number % 10 == i;
  }

  private boolean isDivisible(int number, int i) {
    return number % i == 0;
  }

  public String print() {
    return IntStream.range(1, 101).mapToObj(this::say).collect(Collectors.joining("\n"));
  }
}
