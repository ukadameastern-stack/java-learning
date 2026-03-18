package com.uday.javaconcepts.methodreference;

import java.util.Arrays;
import java.util.List;

class MathUtils {

    public static int square(int x) {
        return x * x;
    }
}

public class StaticMethodReference {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,4,5);

        list.stream()
                .map(MathUtils::square)
                .forEach(System.out::println);

        /*
        map(MathUtils::square)

        Equivalent Lambda:
        x -> MathUtils.square(x)

        OUTPUT
        4
        9
        16
        25
        */
    }
}