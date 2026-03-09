package com.uday.javaconcepts.accessmodifiers.differentpackage;

import com.uday.javaconcepts.accessmodifiers.AccessModifiersExample;

/*
=====================================================
SCENARIO 3 : DIFFERENT PACKAGE SUB CLASS
=====================================================

private      ❌
default      ❌
protected    ✅
public       ✅

Only PUBLIC members are accessible.
*/

public class DifferentPackageSubClassExample extends AccessModifiersExample{

    public static void main(String[] args) {

        DifferentPackageSubClassExample obj = new DifferentPackageSubClassExample();

         // System.out.println(obj.privateVar); ❌
         // System.out.println(obj.defaultVar); ❌

        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);

        // obj.defaultMethod(); // Cannot be accessed from outside package
        // obj.protectedMethod(); // Cannot be accessed from outside package
        obj.publicMethod();
        obj.protectedMethod();
    }
}

/*
========================
OUTPUT
========================

40
Public Method Executed
*/