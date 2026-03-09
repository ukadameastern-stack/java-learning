package com.uday.javaconcepts.accessmodifiers;

/*
=====================================================
SCENARIO 2 : SAME PACKAGE NON SUB CLASS
=====================================================

private      ❌ Not Accessible
default      ✅ Accessible
protected    ✅ Accessible
public       ✅ Accessible


*/

public class SamePackageNonSubClassExample {

    public static void main(String[] args) {

        AccessModifiersExample obj = new AccessModifiersExample();

        // System.out.println(obj.privateVar); ❌ Compile Error

        System.out.println(obj.defaultVar);
        System.out.println(obj.protectedVar); 
        System.out.println(obj.publicVar);

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