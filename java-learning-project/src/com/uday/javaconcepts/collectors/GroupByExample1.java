package com.uday.javaconcepts.collectors;

import com.uday.javaconcepts.collectors.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample1 {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Uday", "IT", 80000),
                new Employee(2, "Amol", "HR", 40000),
                new Employee(3, "Rahul", "IT", 90000)
        );

        Map<String, List<Employee>> grouped =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(grouped);

        for (Map.Entry<String, List<Employee>> entry: grouped.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().stream()
                    .map(Employee::getName)
                    .collect(Collectors.joining(", ")));
        }
    }
}

/*
OUTPUT:
{HR=[Employee{id=2, name='Amol', department='HR', salary=40000.0}], IT=[Employee{id=1, name='Uday', department='IT', salary=80000.0}, Employee{id=3, name='Rahul', department='IT', salary=90000.0}]}
HR : Amol
IT : Uday, Rahul
*/