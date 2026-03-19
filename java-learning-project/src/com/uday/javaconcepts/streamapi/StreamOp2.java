package com.uday.javaconcepts.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOp2 {

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

        System.out.println("==============Female List==============");
        List<Employee> femaleList = employeeList.stream()
                .filter(employee -> employee.getGender().equals("Female"))
                .toList();

        femaleList.forEach(System.out::println);
        //Employee{id=3, name='Archana', gender='Female', city='Pune', salary=90000.0, age=22, yearOfJoining=2022}
        //Employee{id=4, name='Neha', gender='Female', city='Mumbai', salary=75000.0, age=24, yearOfJoining=2018}
        //Employee{id=6, name='Sneha', gender='Female', city='Pune', salary=65000.0, age=23, yearOfJoining=2019}
        //Employee{id=8, name='Priya', gender='Female', city='Bangalore', salary=88000.0, age=21, yearOfJoining=2021}

        System.out.println("==============Female Set==============");
        Set<Employee> femaleSet = employeeList.stream()
                .filter(employee -> employee.getGender().equals("Female"))
                .collect(Collectors.toSet());

        femaleSet.forEach(System.out::println);
        //Employee{id=3, name='Archana', gender='Female', city='Pune', salary=90000.0, age=22, yearOfJoining=2022}
        //Employee{id=8, name='Priya', gender='Female', city='Bangalore', salary=88000.0, age=21, yearOfJoining=2021}
        //Employee{id=6, name='Sneha', gender='Female', city='Pune', salary=65000.0, age=23, yearOfJoining=2019}
        //Employee{id=4, name='Neha', gender='Female', city='Mumbai', salary=75000.0, age=24, yearOfJoining=2018}

        System.out.println("==============Set of Emp Id's Who's Sal > 80000==============");
        Set<Integer> empSalGt80k = employeeList.stream()
                .filter(employee -> employee.getSalary() > 80000)
                .map(employee -> employee.getId())
                .collect(Collectors.toSet());
        empSalGt80k.forEach(System.out::println);
        //==============Set of Emp Id's Who's Sal > 80000==============
        //3
        //8
        //9

        System.out.println("==============Id->Name==============");

        Map<Integer, String> idName = employeeList.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Employee::getName,
                        (existing, replacement) -> existing // keep first
                ));

        System.out.println(idName);
        //==============Id->Name==============
        //{1=Uday, 2=Vijay, 3=Archana, 4=Neha, 5=Rohit, 6=Sneha, 7=Amit, 8=Priya, 9=Vijay, 10=Kiran}

        System.out.println("==============Id->Salary of Male==============");
        Map<Integer, Double> idSalaryMale = employeeList.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.toMap(
                        Employee::getId,
                        Employee::getSalary
                ));

        System.out.println(idSalaryMale);
        //==============Id->Salary of Male==============
        //{1=60000.0, 2=80000.0, 5=50000.0, 7=72000.0, 9=95000.0, 10=40000.0}

        System.out.println("==============cityWiseEmpCount==============");
        Map<String, Long> cityWiseEmpCount = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getCity,
                                Collectors.counting()
                        )
                );

        System.out.println(cityWiseEmpCount);
        //==============cityWiseEmpCount==============
        //{Delhi=1, Chennai=1, Pune=4, Mumbai=1, Barshi=1, Hyderabad=1, Bangalore=1}

        System.out.println("==============genderWiseEmpCount==============");
        Map<String, Long> genderWiseEmpCount = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.counting()
                        )
                );
        System.out.println(genderWiseEmpCount);
        //==============genderWiseEmpCount==============
        //{Female=4, Male=6}
        System.out.println("==============genderWiseEmpSalarySum==============");
        Map<String, Double> genderWiseEmpSalarySum = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.summingDouble(Employee::getSalary)
                        )
                );

        System.out.println(genderWiseEmpSalarySum);
        //==============genderWiseEmpSalarySum==============
        //{Female=318000.0, Male=397000.0}

        System.out.println("==============genderWiseEmpAvgSalary==============");
        Map<String, Double> genderWiseEmpAvgSalary = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.averagingDouble(Employee::getSalary)
                        )
                );

        System.out.println(genderWiseEmpAvgSalary);
        //==============genderWiseEmpAvgSalary==============
        //{Female=79500.0, Male=66166.66666666667}

        System.out.println("==============genderWiseEmpAvgAge==============");
        Map<String, Double> genderWiseEmpAvgAge = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.averagingDouble(Employee::getAge)
                        )
                );

        System.out.println(genderWiseEmpAvgAge);
        //==============genderWiseEmpAvgAge==============
        //{Female=22.5, Male=26.0}

        System.out.println("==============sumOfEmpSalary===============");
        Double sumOfEmpSalary = employeeList.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));

        System.out.println(sumOfEmpSalary);
        //==============sumOfEmpSalary===============
        //715000.0

        System.out.println("==============joinOfEmpCity===============");
        String joinOfEmpCity = employeeList.stream()
                .map(Employee::getCity)
                .collect(Collectors.joining(","));

        System.out.println(joinOfEmpCity);
        //==============joinOfEmpCity===============
        //Pune,Barshi,Pune,Mumbai,Delhi,Pune,Hyderabad,Bangalore,Pune,Chennai

    }
}
