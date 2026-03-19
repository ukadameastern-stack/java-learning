package com.uday.javaconcepts.collectors;

import com.uday.javaconcepts.collectors.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample2 {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Uday", "IT", 80000),
                new Employee(2, "Amol", "HR", 40000),
                new Employee(3, "Rahul", "IT", 80000)
        );

        Map<String, Long> countByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()
                        ));

        System.out.println(countByDept);

        Map<Double, Long> sameSalaries =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getSalary,
                                Collectors.counting()
                        ));
        System.out.println(sameSalaries);
    }
}

/*
OUTPUT:
{HR=1, IT=2}
{40000.0=1, 80000.0=2}
*/