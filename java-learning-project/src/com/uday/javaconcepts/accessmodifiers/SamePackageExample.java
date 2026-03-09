package com.uday.javaconcepts.accessmodifiers;

/*
=====================================================
SCENARIO 2 : SAME PACKAGE (Different Class)
=====================================================
----------------------------------------------------
access M     Same Package       Outside Package
----------------------------------------------------
private      ❌ Not Accessible   ❌ Not Accessible
default      ✅ Accessible       ❌ Not Accessible
protected    ✅ Accessible       ❌ Not Accessible
public       ✅ Accessible       ✅ Accessible
----------------------------------------------------
Reason:
Classes inside same package can access
default and protected members.
*/

public class SamePackageExample {

    public static void main(String[] args) {

        AccessModifiersExample obj = new AccessModifiersExample();

        // System.out.println(obj.privateVar); ❌ Compile Error

        System.out.println(obj.defaultVar); // Same package accessible, Cannot be accessed from outside package
        System.out.println(obj.protectedVar); // Same package accessible, Cannot be accessed from outside package
        System.out.println(obj.publicVar); // Same package accessible and outside package accessible

        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();
    }

}

/*
========================
OUTPUT
========================

20
30
40
Default Method Executed
Protected Method Executed
Public Method Executed
*/