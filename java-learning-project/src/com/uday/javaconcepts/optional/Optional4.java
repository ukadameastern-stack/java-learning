package com.uday.javaconcepts.optional;

import java.util.Optional;

public class Optional4 {

    public static void main(String[] args) {
        Optional<String> nameContainer = getName();

        System.out.println(nameContainer);

        // If value is present, return it
        // If value is not present, then supplier functionality will produce another
        System.out.println(
                nameContainer.or(
                        () -> {
                            return Optional.of("Optional value: XYZ");
                        }
                ).get()
        );

        String name = nameContainer.or(
                () -> Optional.of("Uday")
        ).get();

        System.out.println(name);

        String n = nameContainer.or(()-> Optional.of("USKAL")).get();
        System.out.println( n);

        System.out.println(
                nameContainer.or(() -> {
                    return Optional.of("No Data");
                }).get()
        );

        System.out.println(nameContainer.or(
                () -> {
                    return Optional.of("NNNNNN");
                }
        ).get());

        System.out.println(
                nameContainer.or(
                        () -> {
                            return Optional.of("========");
                        }
                ).get()
        );

        System.out.println(nameContainer.or(() -> Optional.of("KKKKKK")).get());

        System.out.println(nameContainer.or(
                () -> {
                  return Optional.of("----------------");
                }
        ).get());

        String name1 = nameContainer.or(
                () -> {
                    return Optional.of("HIHI");
                }
        ).get();

        System.out.println(name1);

        System.out.println(nameContainer.or(
                () -> Optional.of("KKKK")
        ).get());

        System.out.println(nameContainer.orElse("Or else message"));
        System.out.println(
                nameContainer.orElseGet(
                        () -> {
                            return "Or else get";
                        }
                )
        );

    }

    private static Optional<String> getName() {

        String name = null;
        Optional<String> value;
        if (name == null) {
            value = Optional.empty();
        } else {
            value = Optional.of(name);
        }

        return value;
    }
}
