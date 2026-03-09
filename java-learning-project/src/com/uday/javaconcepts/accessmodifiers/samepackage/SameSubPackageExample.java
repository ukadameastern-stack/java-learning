package com.uday.javaconcepts.accessmodifiers.samepackage;

import com.uday.javaconcepts.accessmodifiers.AccessModifiersExample;

/*
=====================================================
SCENARIO 2 : SAME SUB PACKAGE (Different Class)
=====================================================

private      ❌ Not Accessible
default      ❌ Not Accessible
protected    ❌ Not Accessible
public       ✅ Accessible

Reason:
Classes inside a subpackage cannot access default members of a class in the parent package.
However, they can access protected members only through inheritance.
*/

public class SameSubPackageExample {

    public static void main(String[] args) {

        AccessModifiersExample obj = new AccessModifiersExample();

        // System.out.println(obj.privateVar); ❌ Compile Error

        // System.out.println(obj.defaultVar); // Cannot be accessed from outside package
        // System.out.println(obj.protectedVar); // Cannot be accessed from outside package
        System.out.println(obj.publicVar);

        // obj.defaultMethod(); // Cannot be accessed from outside package
        // obj.protectedMethod(); // Cannot be accessed from outside package
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