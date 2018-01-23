package com.joantolos.kata.fizz.buzz;

import java.util.stream.IntStream;

public class Game {

    public String play(){
        StringBuilder result = new StringBuilder("");
        IntStream.range(1, 101).mapToObj(this::resolve).forEach(result::append);
        return result.toString();
    }

    private String resolve(int candidate) {
        if(candidate % 3 == 0) {
            if(candidate % 5 == 0) {
                return "\nFizzBuzz";
            } else {
                return "\nFizz";
            }
        } else if (candidate % 5 == 0){
            return "\nBuzz";
        }
        return String.valueOf("\n" + candidate);
    }

}
