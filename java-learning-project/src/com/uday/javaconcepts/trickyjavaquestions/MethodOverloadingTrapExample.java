package com.uday.javaconcepts.trickyjavaquestions;

public class MethodOverloadingTrapExample {

    void show(long a) {
        System.out.println("Widening method");
    }

    void show(Integer a) {
        System.out.println("Autoboxing method");
    }

    public static void main(String[] args) {

        MethodOverloadingTrapExample obj = new MethodOverloadingTrapExample();

        obj.show(10);
    }
}

/*
Details:
Java priority:
1 Exact match
2 Widening
3 Autoboxing
4 Varargs

Output:
Widening method
*/