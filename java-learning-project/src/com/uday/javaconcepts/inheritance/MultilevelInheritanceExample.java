package com.uday.javaconcepts.inheritance;

/*
Multilevel Inheritance

Grandparent → Parent → Child

Example:
Person → Employee → Manager
*/

class Person {

    void displayPersonInformation() {
        System.out.println("Person has name and age");
    }
}

class Employee extends Person {

    void displayEmployeeInformation() {
        System.out.println("Employee has employeeId and salary");
    }
}

class Manager extends Employee {

    void displayManagerRole() {
        System.out.println("Manager manages a team");
    }
}

public class MultilevelInheritanceExample {

    public static void main(String[] args) {

        Manager managerObject = new Manager();

        managerObject.displayPersonInformation();
        managerObject.displayEmployeeInformation();
        managerObject.displayManagerRole();
    }
}

/*
OUTPUT

Person has name and age
Employee has employeeId and salary
Manager manages a team
*/