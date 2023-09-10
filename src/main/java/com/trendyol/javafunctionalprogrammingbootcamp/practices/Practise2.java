package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import java.util.List;

public class Practise2 {

    public List<String> filterByFirstCharacter(List<String> strings, char c) {
        // TODO: implement method that accepts list of strings and returns the ones which starts with given character.

        return strings.stream().filter(string -> string.charAt(0) == Character.toLowerCase(c) || string.charAt(0) == Character.toUpperCase(c)).toList();
    }
}
