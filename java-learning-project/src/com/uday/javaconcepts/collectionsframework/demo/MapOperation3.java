package com.uday.javaconcepts.collectionsframework.demo;

import java.util.HashMap;
import java.util.Map;

public class MapOperation3 {

    public static void main(String[] args) throws Exception {

        Map<String,String> map = new HashMap<>();

        map.put(null, "Java");
        map.put(null, "Spring");   // replaces previous value

        map.put("A", null);
        map.put("B", null);

        System.out.println(map); // {null=Spring, A=null, B=null}

    }
}

/*
o/p:

{null=Spring, A=null, B=null}
 */