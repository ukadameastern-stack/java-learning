package com.uday.college;

public class Student {

    private String name;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String collegeName = "VMHS";
    public static String principal = "KK";

    // Constructor
    public Student(String name) {
        System.out.println("Student constructor");
        this.name = name;
        College c =  new College();
        this.setCollegeName(c.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String area() {
        //return 123; // error: incompatible types: int cannot be converted to String
        return "";
    }

    public static void main(String[] args) {
        System.out.println("Student main");
        System.out.println("Student object: ");
        Student s1 = new Student("Uday");
        System.out.println(s1.getName() + "(" + s1.collegeName + " : " + principal + ")" );
        s1.collegeName = "VP";
        principal = "DD";
        System.out.println(s1.getName() + "(" + s1.collegeName + " : " + principal + ")" );
        System.out.println("Student object: ");
        Student s2 = new Student("Vijay");
        System.out.println(s2.getName() + "(" + s2.collegeName + " : " + principal + ")" );
    }
}