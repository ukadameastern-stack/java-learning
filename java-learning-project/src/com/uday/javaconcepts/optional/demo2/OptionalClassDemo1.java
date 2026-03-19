package com.uday.javaconcepts.optional.demo2;

import java.util.Optional;

public class OptionalClassDemo1 {
    public static void main(String[] args) {
        OptionalClassDemo1 demo1 = new OptionalClassDemo1();
        String value1 = demo1.getValue();
        if (value1 != null) {
            System.out.println(value1.toUpperCase()); // .NullPointerException
        } else  {
            System.out.println("Value is null");
        }

        Optional<String> value2 = demo1.getOptionalValue();
        // If don't have value: NoSuchElementException
        // String val = value2.get();
        if (value2.isPresent()) {
            String val = value2.get();
            System.out.println(val.toUpperCase());
        }

        // or
        value2.ifPresent(val -> System.out.println(val.toUpperCase()));




    }

    public String getValue() {
        return null;
        //return "Uday";
    }

    public Optional<String> getOptionalValue() {
        // If don't have value.
        return Optional.empty();

        // If have value
        //return Optional.of("Optional Value from OP function");
    }
}
