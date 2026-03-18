package com.uday.javaconcepts.streamapi;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class RealTimeExamples {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Uday", 50000),
                new Employee(2, "Amol", 60000),
                new Employee(3, "Balaji", 70000),
                new Employee(4, "Vijay", 80000)
        );

        double avg =
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .orElse(0);

        System.out.println(avg);

        /*
        REALTIME USE CASE

        Calculate Average Salary

        Stream Flow

        Employee → Salary → Average

        OUTPUT
        60000.0
        */

        System.out.println("================Normal===============");
        for (Employee e : list) {
            if (e.getSalary() > 50000) {
                System.out.println(e);
            }
        }

        System.out.println("================Stream.===============");
        Stream<Employee> stream = list.stream();
        Predicate<Employee> salGt50k = e -> e.getSalary() > 50000;
        stream.filter(salGt50k)
                .forEach(System.out::println);

        System.out.println("================Stream===============");
        list.stream()
                .filter(e -> e.getSalary() > 50000)
                .filter(e -> e.getId() % 2 == 0)
                .forEach(System.out::println);
    }
}