package com.uday.javaconcepts.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOp1 {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Uday", "Male", "Pune", 60000, 25, 2011),
                new Employee(2, "Vijay", "Male", "Barshi", 80000, 20, 2020),
                new Employee(3, "Archana", "Female", "Pune", 90000, 22, 2022),
                new Employee(4, "Neha", "Female", "Mumbai", 75000, 24, 2018),
                new Employee(5, "Rohit", "Male", "Delhi", 50000, 28, 2015),
                new Employee(6, "Sneha", "Female", "Pune", 65000, 23, 2019),
                new Employee(7, "Amit", "Male", "Hyderabad", 72000, 26, 2017),
                new Employee(8, "Priya", "Female", "Bangalore", 88000, 21, 2021),
                new Employee(9, "Vijay", "Male", "Pune", 95000, 27, 2013),
                new Employee(10, "Kiran", "Male", "Chennai", 40000, 30, 2010)
        );

        System.out.println("================Female Emp List================");
        employeeList.stream()
                //.filter(e -> e.getGender().equals("Female"))
                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
                .forEach(System.out::println);
        /*
        Employee{id=3, name='Archana', gender='Female', city='Pune', salary=90000.0, age=22, yearOfJoining=2022}
        Employee{id=4, name='Neha', gender='Female', city='Mumbai', salary=75000.0, age=24, yearOfJoining=2018}
        Employee{id=6, name='Sneha', gender='Female', city='Pune', salary=65000.0, age=23, yearOfJoining=2019}
        Employee{id=8, name='Priya', gender='Female', city='Bangalore', salary=88000.0, age=21, yearOfJoining=2021}
         */

        System.out.println("================Female Emp count================");
        Long countOfFemaleEmp = employeeList.stream()
                .filter(e -> e.getGender().equals("Female"))
                .count();

        System.out.println(countOfFemaleEmp);
        //================Female Emp count================
        //4

        System.out.println("================All male emp name================");
        employeeList.stream()
                .filter(e -> e.getGender().equals("Male"))
                .map(Employee::getName)
                //.forEach(e->System.out.println(e));
                .forEach(System.out::println);
        //================All male emp name================
        //Uday
        //Vijay
        //Rohit
        //Amit
        //Vijay
        //Kiran

        System.out.println("================All emp join after 2015================");
        employeeList.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .forEach(employee -> System.out.println(employee.getName() + " :  " + employee.getYearOfJoining()));

        //================All emp join after 2015================
        //Vijay :  2020
        //Archana :  2022
        //Neha :  2018
        //Sneha :  2019
        //Amit :  2017
        //Priya :  2021

        System.out.println("================Total salary of Pune employees================");

        Double totalSalaryOfPuneEmp = employeeList.stream()
                //.filter(employee -> "Pune".equals(employee.getCity()))
                .filter(employee -> employee.getCity().equals("Pune"))
                //.map(employee -> employee.getSalary())
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println(totalSalaryOfPuneEmp);
        //================Total salary of Pune employees================
        //310000.0

        System.out.println("================Group by city================");
        Map<String, List<Employee>> map =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getCity));

        for (Map.Entry<String, List<Employee>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().stream().map(Employee::getName).toList());
        }
        //================Group by city================
        //Delhi : [Rohit]
        //Chennai : [Kiran]
        //Pune : [Uday, Archana, Sneha, Vijay]
        //Mumbai : [Neha]
        //Barshi : [Vijay]
        //Hyderabad : [Amit]
        //Bangalore : [Priya]

        for (Map.Entry<String, List<Employee>> entry:  map.entrySet()) {
            System.out.println(
                    entry.getKey() + " : " + entry.getValue().stream()
                            .map(Employee::getName)
                            .collect(Collectors.joining(","))
            );
        }
        //================Group by city================
        //Delhi : Rohit
        //Chennai : Kiran
        //Pune : Uday,Archana,Sneha,Vijay
        //Mumbai : Neha
        //Barshi : Vijay
        //Hyderabad : Amit
        //Bangalore : Priya

        System.out.println("================Highest salary employee================");
        Employee employee1 = employeeList.stream()
                //.max(Comparator.comparing(e -> e.getSalary())) // Lambda Expression
                .max(Comparator.comparing(Employee::getSalary))// Method Reference
                .orElse(null);
        System.out.println(employee1);
        //================Highest salary employee================
        //Employee{id=9, name='Vijay', gender='Male', city='Pune', salary=95000.0, age=27, yearOfJoining=2013}

        System.out.println("================Partition by gender================");
        Map<Boolean, List<Employee>> emp3 = employeeList.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getGender().equals("Male")));

        for (Map.Entry<Boolean, List<Employee>> entry : emp3.entrySet()) {
            System.out.println(
                    (entry.getKey() ? "Male" : "Female")
                            + " : " + entry.getValue().stream()
                    .map(Employee::getName)
                    .collect(Collectors.joining(","))
            );
        }
        //================Partition by gender================
        //Female : Archana,Neha,Sneha,Priya
        //Male : Uday,Vijay,Rohit,Amit,Vijay,Kiran
    }
}
