package com.uday.javaconcepts.collectionsframework.demo;

import java.util.HashMap;
import java.util.Map;

public class MapOperation4 {

    public static void main(String[] args) throws Exception {

        Map<Student,String> map = new HashMap<>();

        Student s1 = new Student(101, "Kadam");

        map.put(s1,"Uday");
        System.out.println(map); // {Student{id=101, name='Kadam'}=Uday}
        System.out.println(map.get(s1)); // Uday

        s1.id = 200;   // key modified

        System.out.println(map.get(s1)); // null
        System.out.println(map); // {Student{id=200, name='Kadam'}=Uday}

    }
}

/*
o/p:

{Student{id=101, name='Kadam'}=Uday}
Uday
null
{Student{id=200, name='Kadam'}=Uday}
 */