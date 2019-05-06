package com.coding.dojo.fizzbuzz;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FizzBuzzNumberTest {

    @Test(dataProvider = "number_is_fizz")
    public void should_return_true_when_number_is_divisible_by_3(Integer value){
        FizzBuzzNumber number=new FizzBuzzNumber(value);
        Assert.assertTrue(number.isFizz(),value.toString());
    }

    @Test(dataProvider = "number_is_buzz")
    public void should_return_true_when_number_is_divisible_by_5(Integer value){
        FizzBuzzNumber number = new FizzBuzzNumber(value);
        Assert.assertTrue(number.isBuzz(),value.toString());
    }

    @Test(dataProvider = "number_is_fizzbuzz")
    public void should_return_true_when_number_is_divisible_by_15(Integer value){
        FizzBuzzNumber number = new FizzBuzzNumber(value);
        Assert.assertTrue(number.isFizzBuzz(),value.toString());
    }

    @DataProvider
    public static Object[] number_is_fizz() {
        return new Integer[]{3,6,9,33};

    }

    @DataProvider
    public static Object[] number_is_buzz(){
        return new Integer[]{5,15,35};
    }

    @DataProvider
    public static Object[] number_is_fizzbuzz(){
        return new Integer[]{15, 30, 45, 60};
    }
}
