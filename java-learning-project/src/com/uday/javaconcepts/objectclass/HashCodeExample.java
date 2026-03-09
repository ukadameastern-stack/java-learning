package com.uday.javaconcepts.objectclass;

/*
    CONCEPT: hashCode()

    Used for fast searching in hash-based collections.

    Example collections:
        HashMap
        HashSet
        HashTable

    Contract rule:

        if a.equals(b) == true
        then
        a.hashCode() == b.hashCode()
*/

public class HashCodeExample {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Uday");
        Student s2 = new Student(1, "Uday");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}

/*
OUTPUT (example):

2640212
2640212

Both objects return same hashCode because they are equal.
If two objects are equal → hashCode must be same
*/