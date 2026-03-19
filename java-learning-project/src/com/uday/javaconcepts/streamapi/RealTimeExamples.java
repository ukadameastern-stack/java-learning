package com.uday.javaconcepts.streamapi;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class RealTimeExamples {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Uday", "Male", "Pune", 60000, 25, 2011),
                new Employee(2, "Vijay", "Male", "Barshi", 80000, 20, 2020),
                new Employee(2, "Archana", "Female", "Pune", 90000, 22, 2022)
        );

        double avg =
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .orElse(0);

        System.out.println(avg); // 65000.0


        list.stream()
                .filter(e -> e.getSalary() > 70000)
                .forEach(System.out::println); // Employee [id=4, name=Vijay, salary=80000.0]

        List<String> names = list.stream()
                .filter(e -> e.getSalary() > 60000)
                .map(Employee::getName).toList();
        System.out.println(names); // [Balaji, Vijay]

        String fName = list.stream()
                .filter(e -> e.getSalary() > 60000)
                .map(Employee::getName)
                .findFirst().orElse("");
        System.out.println(fName); // Balaji

        Long countSalGt60k = list.stream().filter(e -> e.getSalary() > 60000).count();
        System.out.println(countSalGt60k); // 2

        List<String> emp = list.stream()
                .filter(e -> e.getSalary() >= 60000 && e.getSalary() < 80000)
                .map(Employee::getName)
                .toList();

        System.out.println(emp); // [Amol, Balaji]

        List<Employee> emp2 = list.stream()
                .filter(e -> e.getSalary() >= 60000 && e.getSalary() < 80000)
                .toList();

        System.out.println(emp2);
        // [Employee [id=2, name=Amol, salary=60000.0], Employee [id=3, name=Balaji, salary=70000.0]]



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