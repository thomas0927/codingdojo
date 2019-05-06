package com.coding.dojo.fizzbuzz;

public class FizzBuzzNumber {
    private Integer value;

    public FizzBuzzNumber(Integer number) {
        this.value = number;
    }

    public boolean isFizz() {
        return isDivisibleBy(3);
    }

    private boolean isDivisibleBy(Integer number) {
        return value % number == 0;
    }

    public boolean isBuzz() {
        return isDivisibleBy(5);
    }

    public boolean isFizzBuzz() {
        return isDivisibleBy(15);
    }

    public Integer value() {
        return value;
    }
}
