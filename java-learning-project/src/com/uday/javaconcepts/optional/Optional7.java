package com.uday.javaconcepts.optional;

import java.util.Optional;

public class Optional7 {

    public static void main(String[] args) {
        Optional<String> nameContainer = Optional.of("Uday Kadam");


        // Upper case value
        String result = nameContainer.map( value -> value.toUpperCase()).get();
        System.out.println(result); // UDAY KADAM

        nameContainer.map(String::toUpperCase).ifPresent(System.out::println); // UDAY KADAM

        // Nested Optional Object
        Optional<Optional<String>> nameContainer2 = Optional.of(Optional.of("Uday Kadam"));

        Optional<String> nestedObj = nameContainer2.map(val -> val.get());
        System.out.println(nestedObj.get()); // Uday Kadam
        String nestedResult = nestedObj.map(val -> val.toUpperCase()).get(); // UDAY KADAM

        System.out.println(nestedResult);





    }
}
