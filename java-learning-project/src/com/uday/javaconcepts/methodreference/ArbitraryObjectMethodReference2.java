package com.uday.javaconcepts.methodreference;

@FunctionalInterface
interface ConvertToUppCase {
    String uppCase(PrintClsName p);
}

class PrintClsName {
    public String printClassName() {
        return this.getClass().getName();
    }
}

public class ArbitraryObjectMethodReference2 {

    public static void main(String[] args) {

        PrintClsName p = new PrintClsName();
        ConvertToUppCase lc = PrintClsName::printClassName;

        System.out.println(lc.uppCase(p));
    }
}
