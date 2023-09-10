package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import java.util.List;

public class Practise3 {

    public int sumsSquares(List<Integer> numbers) {
        // TODO: implement method that accepts list of integers and returns sum of their squares.

        //return numbers.stream().mapToInt(number -> number * number).sum();
        return numbers.stream().reduce(0, (subtotal, number) -> subtotal + number * number);
    }
}
