package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import java.util.List;

public class Practise1 {

    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        // TODO: implement method that accepts list of integers and returns even numbers.

        return numbers.stream().filter(number -> number % 2 == 0).toList();
    }
}
