package com.uday.javaconcepts.collectionsframework.demo;

import java.util.TreeMap;

public class TreeMap1 {

    public static void main(String[] args) {

        TreeMap <String, String> map = new TreeMap<>();
        // map.put(null, null); // .NullPointerException
        map.put("Fox", null);
        map.put("Deva", "V4");
        map.put("Chandra", "V2");
        map.put("Balaji", "V1");
        map.put("Akash", "V3");

        System.out.println(map);
        // {Akash=V3, Balaji=V1, Chandra=V2, Deva=V4, Fox=null}
        // Keys are stored in the ascending order.
        for (String key : map.keySet()) {
            System.out.println(key  + " : " + map.get(key));
        }
        /*
            Akash : V3
            Balaji : V1
            Chandra : V2
            Deva : V4
            Fox : null
         */

        // [V3, V1, V2, V4, null]
        System.out.println(map.values());

        // [Akash, Balaji, Chandra, Deva, Fox]
        System.out.println(map.keySet());

        // Akash=V3
        System.out.println(map.firstEntry());
        // {Akash=V3, Balaji=V1, Chandra=V2, Deva=V4, Fox=null}
        System.out.println(map);
        // Fox=null
        System.out.println(map.lastEntry());
        // {Akash=V3, Balaji=V1, Chandra=V2, Deva=V4, Fox=null}
        System.out.println(map);

        // Akash=V3
        System.out.println(map.pollFirstEntry());
        // {Balaji=V1, Chandra=V2, Deva=V4, Fox=null}
        System.out.println(map);
        // Fox=null
        System.out.println(map.pollLastEntry());
        // {Balaji=V1, Chandra=V2, Deva=V4}
        System.out.println(map);
    }
}
