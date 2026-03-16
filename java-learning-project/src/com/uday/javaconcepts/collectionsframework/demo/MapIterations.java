package com.uday.javaconcepts.collectionsframework.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterations {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Uday");
        map.put(2,"Amol");
        map.put(3,"Balaji");

        /*
        1. Iterating Using entrySet() (Most Efficient)

            This is the recommended way because both key and value are accessed
            in one iteration
         */
        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        /*
            1 : Uday
            2 : Amol
            3 : Balaji
         */

        /*
        2. Iterating Using keySet()

            You iterate keys and fetch values using get().
         */
        for(Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        /*
            1 : Uday
            2 : Amol
            3 : Balaji
         */

        /*
        3. Iterating Using values()

            If you only need values, not keys.
         */
        for (String value : map.values()) {
            System.out.println(value);
        }
        /*
            Uday
            Amol
            Balaji
         */

        /*
        4. Using Iterator
         */

        Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        /*
            1 : Uday
            2 : Amol
            3 : Balaji
         */

        /*
        5. Using Java 8 forEach() (Lambda)
         */

        map.forEach((key,value) ->
                System.out.println(key + " : " + value)
        );
        /*
            1 : Uday
            2 : Amol
            3 : Balaji
         */

        /*
        6. Using Streams (Java 8+)
         */

        map.entrySet()
           .stream()
           .forEach(e ->
                   System.out.println(e.getKey() + " : " + e.getValue())
           );

        /*
            1 : Uday
            2 : Amol
            3 : Balaji
         */

        map.entrySet()
                .stream()
                .filter(e -> e.getKey() > 1)
                .forEach(System.out::println);
        /*
            2=Amol
            3=Balaji
         */
    }
}

/*
Performance Comparison

    | Method     | Performance  | Use Case         |
    | ---------- | ------------ | ---------------- |
    | entrySet() | ⭐ Fastest    | key + value      |
    | keySet()   | medium       | when keys needed |
    | values()   | fast         | only values      |
    | Iterator   | safe removal | modification     |
    | forEach()  | modern       | cleaner code     |
    | Stream     | flexible     | filtering        |

Interview Tip
If asked:

    Best way to iterate a Map?

Answer:

    Using entrySet() because it accesses both key and value without extra lookup.

Quick Summary:

    | Iteration | Syntax                                   |
    | --------- | ---------------------------------------- |
    | entrySet  | `for(Map.Entry<K,V> e : map.entrySet())` |
    | keySet    | `for(K key : map.keySet())`              |
    | values    | `for(V val : map.values())`              |
    | Iterator  | `Iterator<Map.Entry<K,V>>`               |
    | Lambda    | `map.forEach()`                          |

 */
