package com.uday.javaconcepts.interfaces;

interface Animal {
    void sound();   // method declaration
    // void eat() {} // Interface abstract methods cannot have a body
}

public class BasicInterfaceExample {
    //class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        BasicInterfaceExample b = new BasicInterfaceExample();
        b.sound();

    }
}

/*
| Rule              | Explanation                  |
| ----------------- | ---------------------------- |
| All methods are   | `public abstract` by default |
| Variables are     | `public static final`        |
| Interface cannot  | create objects               |
| Class uses        | `implements` keyword         |
| Interface extends | only interfaces              |

Example of Interface Variable
interface Company {
    int EMPLOYEE_LIMIT = 100; // public static final
}

| Feature              | Interface     |
| -------------------- | ------------- |
| Multiple inheritance | ✔ Supported   |
| Constructors         | ❌ Not allowed |
| Instance variables   | ❌ Not allowed |
| Abstract methods     | ✔ Yes         |
| Default methods      | ✔ Yes         |
| Static methods       | ✔ Yes         |



Details:
- Interface Animal contains abstract method sound().
- Class Dog implements the interface.
- Dog must implement the method.

Output:
Dog barks
*/
