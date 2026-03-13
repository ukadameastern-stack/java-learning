package com.uday.javaconcepts.collectionsframework.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListOperations6 {

    public static void main(String[] args) {
        ArrayListOperations6 list = new ArrayListOperations6();
        System.out.println(list.getStudents());
        System.out.println(list.getSetStudents());
    }

    public List<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Uday"));
        students.add(new Student(102, "Vijay"));
        students.add(new Student(103, "Amol"));
        students.add(new Student(104, "Amar"));

        // An Interface can refer its implementation classes instances.
        return students;
    }

    public Set<Student> getSetStudents() {
        HashSet<Student> students = new HashSet<>();

        students.add(new Student(101, "Uday"));
        students.add(new Student(102, "Vijay"));
        students.add(new Student(103, "Amol"));
        students.add(new Student(103, "Amol"));

        // An Interface can refer its implementation classes instances.
        return students;
    }
}

/*
o/p:


 */