package com.uday.javaconcepts.collectionsframework.demo;

import java.util.ArrayList;

public class ArrayListOperations5 {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Uday"));
        students.add(new Student(102, "Vijay"));
        students.add(new Student(103, "Amol"));
        students.add(new Student());
        System.out.println(students.size() + " : " + students);

        students.add(1, new Student(104, "Amar"));
        System.out.println(students.size() + " : " + students);

        students.addAll(students);
        System.out.println(students.size() + " : " + students);
    }
}

/*
o/p:


 */