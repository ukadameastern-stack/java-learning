package com.uday.javaconcepts.objectclass;

/*
    CONCEPT: java.lang.Object Class

    Object is the root class of Java.
    Every class in Java implicitly extends Object class.

    Example:
        class Student {}

    is internally treated as

        class Student extends Object {}

    Because of this inheritance, every class automatically gets
    methods like:

        toString()
        equals()
        hashCode()
        getClass()
        clone()
        wait()
        notify()
        notifyAll()

    In this class we override some of those methods to understand
    how they work.
*/

public class Student implements Cloneable {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
        CONCEPT: toString()

        Defined in Object class.

        Signature:
            public String toString()

        Purpose:
        Converts object into readable string representation.

        Default implementation prints:
            ClassName@HashCode

        Example default output:
            com.uday.javaconcepts.object.Student@36baf30c

        So we override it to print meaningful data.
    */
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    /*
        CONCEPT: equals()

        Defined in Object class.

        Signature:
            public boolean equals(Object obj)

        Purpose:
        Compares two objects logically.

        Default behavior:
        It behaves like == operator (reference comparison).

        When we override equals() we compare object values.
    */
    /*
    // We can Override the equals2 method
    @Override
    public boolean equals2(Object obj) {

        // if both references point to same object
        if (this == obj)
            return true;

        // check null and class type
        if (obj == null || getClass() != obj.getClass())
            return false;

        Student s = (Student) obj;

        return id == s.id && name.equals(s.name);
    }
    */

    /*
        CONCEPT: hashCode()

        Defined in Object class.

        Signature:
            public int hashCode()

        Purpose:
        Returns integer hash value of object.

        IMPORTANT RULE:
        If two objects are equal using equals(),
        they MUST return same hashCode.

        Used heavily in:
            HashMap
            HashSet
            Hashtable
    */
    // We can Override the hashCode method
    /*@Override
    public int hashCode() {
        return id + name.hashCode();
    }*/

    /*
        CONCEPT: clone()

        Defined in Object class.

        Signature:
            protected Object clone()

        Purpose:
        Creates copy of object.

        To use clone():
            1. Class must implement Cloneable interface
            2. Override clone() method
    */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}