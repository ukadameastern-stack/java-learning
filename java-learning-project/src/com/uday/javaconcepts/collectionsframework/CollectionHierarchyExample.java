package com.uday.javaconcepts.collectionsframework;

import java.util.*;

public class CollectionHierarchyExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        Map<Integer,String> map = new HashMap<>();

        list.add("Java");
        set.add("Collections");
        queue.add("QueueElement");
        map.put(1, "HashMapValue");

        System.out.println(list);
        System.out.println(set);
        System.out.println(queue);
        System.out.println(map);
    }
}

    /*
    OUTPUT
    [Java]
    [Collections]
    [QueueElement]
    {1=HashMapValue}
    */
