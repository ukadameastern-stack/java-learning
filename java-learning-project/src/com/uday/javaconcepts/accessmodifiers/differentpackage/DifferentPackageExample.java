package com.uday.javaconcepts.accessmodifiers.differentpackage;

import com.uday.javaconcepts.accessmodifiers.AccessModifiersExample;

/*
=====================================================
SCENARIO 3 : DIFFERENT PACKAGE (NO INHERITANCE)
=====================================================

private      ❌
default      ❌
protected    ❌
public       ✅

Only PUBLIC members are accessible.
*/

public class DifferentPackageExample {

    public static void main(String[] args) {

        AccessModifiersExample obj = new AccessModifiersExample();

         // System.out.println(obj.privateVar); ❌
         // System.out.println(obj.defaultVar); ❌
         // System.out.println(obj.protectedVar); ❌

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

40
Public Method Executed
*/