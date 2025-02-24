package com.c0dethink;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class forEach {
    public static void main(String[] args) {
        List<String> names = List.of("John Doe", "Jane Doe", "Jane Doe", "Jane Doe2", "Jane Doe1");
//
        Consumer<String> stringConsumer = name -> System.out.println(name);
//
//        names.forEach(stringConsumer);
        names.forEach(System.out::println);
    }
}
