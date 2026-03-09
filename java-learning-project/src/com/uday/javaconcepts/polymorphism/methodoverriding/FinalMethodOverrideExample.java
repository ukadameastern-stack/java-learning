package com.uday.javaconcepts.polymorphism.methodoverriding;

class ParentSMO {

    final void show() {
        System.out.println("Final method in ParentSMO");
    }
}

class ChildSMO extends ParentSMO {

    // void show() { }
    // ❌ Compile-time error
}

public class FinalMethodOverrideExample {

    public static void main(String[] args) {

        ChildSMO c = new ChildSMO();

        c.show();
    }
}

/*
Details:
- final methods cannot be overridden.
- ChildSMO class can only inherit it.

Output:
Final method in ParentSMO
*/