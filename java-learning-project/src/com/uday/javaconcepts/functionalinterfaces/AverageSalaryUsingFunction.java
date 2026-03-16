package com.uday.javaconcepts.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AverageSalaryUsingFunction {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(101, "Uday", 50000),
                new Employee(102, "Amol", 60000),
                new Employee(103, "Balaji", 70000),
                new Employee(104, "Kadam", 80000)
        );

        Function<Employee, Double> salaryFunction = e -> e.getSalary();

        double sum = 0;

        for (Employee employee : list) {
            System.out.println(salaryFunction.apply(employee));
            sum += salaryFunction.apply(employee);
        }

        System.out.println("Sum: " + sum);
        double averageSalary = sum / list.size();
        System.out.println("Size: " + list.size());
        System.out.println("Average salary: " + averageSalary);
    }
}
