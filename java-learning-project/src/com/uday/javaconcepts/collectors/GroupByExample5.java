package com.uday.javaconcepts.collectors;

import com.uday.javaconcepts.collectors.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample5 {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Uday", "IT", 80000),
                new Employee(2, "Amol", "HR", 40000),
                new Employee(3, "Rahul", "IT", 90000)
        );

        Map<String, Map<String, String>> result =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.groupingBy(
                                        e -> e.getSalary() > 70000 ? "HIGH" : "LOW",
                                        Collectors.mapping(
                                                Employee::getName,
                                                Collectors.joining(", ")
                                        )
                                )


                        ));

        System.out.println(result);
    }
}

/*
OUTPUT:
{
    HR={LOW=Amol},
    IT={HIGH=Uday, Rahul}
}
 */
