package com.uday.javaconcepts.methodreference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Employee {
    Employee(String name) {
        System.out.println("Employee name: " + name);
    }

    public Employee() {
        System.out.println("Employee object created");
    }
}

public class ConstructorReference {

    public static void main(String[] args) {

        Supplier<Employee> supplier = () -> new Employee();
        Employee employee = supplier.get();
        Employee employee2 = supplier.get();
        Employee employee3 = supplier.get();
        System.out.println(employee + " " + employee2  + " " + employee3);



        Supplier<Employee> supplier2 = Employee::new;
        Employee emp1 = supplier2.get();
        Employee emp2 = supplier2.get();
        Employee emp3 = supplier2.get();
        System.out.println(emp1 + " " + emp2 + " " + emp3);

        Function<String, Employee> function1 = Employee::new;
        function1.apply("Uday");



        /*
        Equivalent Lambda

        () -> new Employee()

        OUTPUT
        Employee object created
        */
    }
}