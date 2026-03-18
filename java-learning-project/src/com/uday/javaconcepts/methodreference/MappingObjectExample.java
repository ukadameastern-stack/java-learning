package com.uday.javaconcepts.methodreference;

import java.util.Arrays;
import java.util.List;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Object getId() {
        return id;
    }
}

public class MappingObjectExample {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student(1, "Uday"),
                new Student(2, "Amol"),
                new Student(3, "Balaji")
        );

        list.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        /*
        Equivalent Lambda

        e -> e.getName()

        OUTPUT
        Uday
        Amol
        Balaji
        */
    }
}