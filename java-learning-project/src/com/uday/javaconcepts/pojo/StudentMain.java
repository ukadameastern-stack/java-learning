package com.uday.javaconcepts.pojo;

import com.uday.javaconcepts.encapsulation.Student;

public class StudentMain {

    public static void main(String[] args) {

        StudentPojo student = new StudentPojo();

        // Setting values
        student.setId(101);
        student.setName("Uday");
        student.setAge(25);

        // Getting values
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}