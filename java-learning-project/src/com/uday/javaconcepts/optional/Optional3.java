package com.uday.javaconcepts.optional;

import java.util.Optional;

public class Optional3 {

    public static void main(String[] args) {
        Optional<String> nameContainer = getName();

        nameContainer.ifPresent(val -> System.out.println(val.toUpperCase()));

        nameContainer.ifPresent(name -> System.out.println(name.toLowerCase()));
        nameContainer.ifPresent(val -> System.out.println(val));
        nameContainer.ifPresent(v -> System.out.println(v));
        nameContainer.ifPresent(n -> System.out.println("::" + n));
        nameContainer.ifPresent(k-> System.out.println("----"));

        nameContainer.ifPresentOrElse(
                val -> System.out.println(val.toUpperCase()),
                () -> System.out.println("No name present") // No name present
        );
        
        nameContainer.ifPresentOrElse(
                (v) -> System.out.println(v),
                () -> System.out.println("No name present")
        );

        nameContainer.ifPresentOrElse(
                (v) -> System.out.println("====" + v),
                () -> System.out.println("N")
        );

        nameContainer.ifPresentOrElse(
                (v) -> System.out.println(v),
                () -> System.out.println("v")
        );


    }

    private static Optional<String> getName() {

        String name = "Uday Kadam";
         name = null;
        Optional<String> value;
        if (name == null) {
            value = Optional.empty();
        } else {
            value = Optional.of(name);
        }

        return value;
    }
}
