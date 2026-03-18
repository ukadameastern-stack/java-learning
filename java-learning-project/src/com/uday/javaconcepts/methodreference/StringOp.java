package com.uday.javaconcepts.methodreference;

public class StringOp {

    public String convertToLowerCase(String str) {
        return str.toLowerCase();
    }

    public String printClassName() {
        return this.getClass().getName();
    }
}
