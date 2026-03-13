package com.uday.javaconcepts.collectionsframework.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
=========================================================
GENERIC TYPE PARAMETERS COMPLETE EXAMPLE
=========================================================

This example demonstrates common generic type parameters.

    T → Type
    E → Element
    K → Key
    V → Value
    N → Number

Concepts Covered
----------------
    1 Generic Class
    2 Generic Method
    3 Bounded Generics
    4 Generics with Collections
    5 Multiple Type Parameters
*/


/*
Generic Class using T (Type)
*/
class Box2<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}


/*
Generic Class with Multiple Type Parameters
K → Key
V → Value
*/
class KeyValuePair<K, V> {

    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void print() {
        System.out.println(key + " : " + value);
    }
}


/*
Bounded Generic Class
N → Number
*/
class Calculator2<N extends Number> {

    private N number;

    public Calculator2(N number) {
        this.number = number;
    }

    public double square() {
        return number.doubleValue() * number.doubleValue();
    }
}


/*
Main Class Demonstrating All Generic Type Parameters
*/
public class GenericTypeParametersExample {

    /*
    Generic Method using T
    */
    public static <T> void printValue(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {

        // T → Type
        Box2<String> box = new Box2<>();
        box.setValue("Hello Generics");
        System.out.println("Box Value: " + box.getValue());


        // K → Key, V → Value
        KeyValuePair<Integer, String> pair =
                new KeyValuePair<>(1, "Java");

        pair.print();


        // N → Number
        Calculator2<Integer> calc =
                new Calculator2<>(5);

        System.out.println("Square: " + calc.square());


        // E → Element (Collection)
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Go");

        for(String lang : list) {
            System.out.println("Language: " + lang);
        }


        // Map with K and V
        Map<Integer,String> map = new HashMap<>();

        map.put(101,"Uday");
        map.put(102,"Rahul");

        System.out.println("Map Data: " + map);


        // Generic Method
        printValue("Generic Method Example");
        printValue(100);
        printValue(3.14);
    }
}


/*
=========================================================
OUTPUT
=========================================================

Box2 Value: Hello Generics
1 : Java
Square: 25.0
Language: Java
Language: Python
Language: Go
Map Data: {101=Uday, 102=Rahul}
Value: Generic Method Example
Value: 100
Value: 3.14

=========================================================
*/