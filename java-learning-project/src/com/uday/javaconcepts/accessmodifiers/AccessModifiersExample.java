package com.uday.javaconcepts.accessmodifiers;

/*
=====================================================
ACCESS MODIFIERS / ACCESS SPECIFIERS IN JAVA
=====================================================

Definition:
Access Modifiers control the VISIBILITY (access level)
of classes, variables, constructors and methods.

Java provides 4 Access Modifiers:

1. private
2. default (no modifier)
3. protected
4. public

-----------------------------------------------------
private
-----------------------------------------------------
Accessible only inside the SAME CLASS.

-----------------------------------------------------
default (package-private)
-----------------------------------------------------
Accessible only inside the SAME PACKAGE.

-----------------------------------------------------
protected
-----------------------------------------------------
Accessible:
1. Same Package
2. Subclass (Child class) even in different package

-----------------------------------------------------
public
-----------------------------------------------------
Accessible from ANYWHERE in the project.

=====================================================
*/

public class AccessModifiersExample {

    /*
    ----------------------------------------------
    private variable
    ----------------------------------------------
    private members are accessible ONLY inside
    the same class where they are declared.
    */

    private int privateVar = 10;


    /*
    ----------------------------------------------
    default variable (no modifier)
    ----------------------------------------------
    Accessible ONLY within same package.
    */

    int defaultVar = 20;


    /*
    ----------------------------------------------
    protected variable
    ----------------------------------------------
    Accessible in:
    1. Same package
    2. Child class in different package
    */

    protected int protectedVar = 30;


    /*
    ----------------------------------------------
    public variable
    ----------------------------------------------
    Accessible from ANY class anywhere.
    */

    public int publicVar = 40;


    /*
    ----------------------------------------------
    private method
    ----------------------------------------------
    Only callable within this class.
    */

    private void privateMethod() {
        System.out.println("Private Method Executed");
    }


    /*
    default method
    accessible within same package only
    */

    void defaultMethod() {
        System.out.println("Default Method Executed");
    }


    /*
    protected method
    accessible within same package
    and child classes
    */

    protected void protectedMethod() {
        System.out.println("Protected Method Executed");
    }


    /*
    public method
    accessible everywhere
    */

    public void publicMethod() {
        System.out.println("Public Method Executed");
    }


    /*
    ----------------------------------------------
    Scenario 1 : Access within SAME CLASS
    ----------------------------------------------

    Inside the same class ALL members
    can be accessed including private.
    */

    public void accessInsideSameClass() {

        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);

        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }


    /*
    main method to run the example
    */

    public static void main(String[] args) {

        AccessModifiersExample obj = new AccessModifiersExample();

        obj.accessInsideSameClass();

    }

}

/*
========================
OUTPUT
========================

10
20
30
40
Private Method Executed
Default Method Executed
Protected Method Executed
Public Method Executed

Explanation:
Inside the SAME CLASS all access modifiers work.
*/