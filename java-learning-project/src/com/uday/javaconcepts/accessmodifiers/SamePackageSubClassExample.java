package com.uday.javaconcepts.accessmodifiers;

/*
=====================================================
SCENARIO 2 : SAME PACKAGE SUB CLASS
=====================================================

private      ❌ Not Accessible
default      ✅ Accessible
protected    ✅ Accessible
public       ✅ Accessible


*/

public class SamePackageSubClassExample extends AccessModifiersExample {

    public static void main(String[] args) {
        System.out.println("===== From main: =====");
        SamePackageSubClassExample obj = new SamePackageSubClassExample();

        // System.out.println(obj.privateVar); ❌ Compile Error

        System.out.println(obj.defaultVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.publicVar);

        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();
        obj.printData();
    }

    public void printData() {
        // System.out.println(privateVar); ❌ Compile Error
        System.out.println("===== From print data method: =====");
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);

        defaultMethod();
        protectedMethod();
        publicMethod();
    }

}

/*
========================
OUTPUT
========================
===== From main: =====
20
30
40
Default Method Executed
Protected Method Executed
Public Method Executed
===== From print data method: =====
20
30
40
Default Method Executed
Protected Method Executed
Public Method Executed

*/