package com.c0dethink;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionUtil {
    public static void main(String[] args) {
//        System.out.println(increseByOne(1));
//        System.out.println(add.apply(1));

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().map(FunctionUtil::increseByOne).collect(Collectors.toList());

        System.out.println(integers);
    }

    //    Funtion Util
//    static Function<Integer, Integer> add = n -> n + 1;

    static int increseByOne(int value) {
        return value + 1;
    }
}
