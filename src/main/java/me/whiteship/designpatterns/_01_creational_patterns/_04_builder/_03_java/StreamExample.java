package me.whiteship.designpatterns._01_creational_patterns._04_builder._03_java;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream.Builder<String> stringStreamBuilder = Stream.builder();
        Stream<String> names = stringStreamBuilder.add("keesun").add("whiteship").build();
        names.forEach(System.out::println);
    }
}
