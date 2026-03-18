package com.uday.javaconcepts.methodreference;

import java.util.Arrays;
import java.util.List;

class Printer {

    public void print(String s) {
        System.out.println(s);
    }
}

public class InstanceMethodReference {

    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("Java","Spring","Docker");

        Printer printer = new Printer();

        list.forEach(printer::print);

        /*
        Equivalent Lambda

        x -> printer.print(x)

        OUTPUT
        Java
        Spring
        Docker
        */
    }
}