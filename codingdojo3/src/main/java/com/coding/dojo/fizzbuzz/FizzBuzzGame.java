package com.coding.dojo.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzGame {
    
    private Integer count;

    public FizzBuzzGame(Integer count) {
        this.count = count;
    }


    public List<String> play() {
        return IntStream.range(1,count+1).boxed().map(FizzBuzzNumber::new).map(this::turn).collect(Collectors.toList());
    }

    private String turn(FizzBuzzNumber number){
        if(number.isFizzBuzz()){
            return "FizzBuzz";
        }else if(number.isFizz()){
            return "Fizz";
        }else if(number.isBuzz()){
            return "Buzz";
        }
        return number.value().toString();

    }
}
