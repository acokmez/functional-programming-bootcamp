package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import java.util.Comparator;
import java.util.List;

public class Practise4 {

    public List<String> orderByLength(List<String> strings, boolean decreasing) {
        // TODO: implement method that accepts list of strings and a boolean which indicates order way
        // TODO: returns them ordering by their length.

        return strings.stream().sorted(Comparator.comparing(String::length, decreasing ? Comparator.reverseOrder() : Comparator.naturalOrder())).toList();
    }
}
