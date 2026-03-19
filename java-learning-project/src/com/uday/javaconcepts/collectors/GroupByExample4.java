package com.uday.javaconcepts.collectors;

import com.uday.javaconcepts.collectors.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample4 {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Uday", "IT", 80000),
                new Employee(2, "Amol", "HR", 40000),
                new Employee(3, "Rahul", "IT", 90000)
        );

        Map<String, List<String>> namesByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.mapping(Employee::getName, Collectors.toList())
                        ));

        System.out.println(namesByDept);

        Map<String, String> namesByDept2 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(
                                Employee::getName,
                                Collectors.joining(", ")
                        )
                ));
        System.out.println(namesByDept2);
    }
}

/*
OUTPUT:
{HR=[Amol], IT=[Uday, Rahul]}
{HR=Amol, IT=Uday, Rahul}
*/