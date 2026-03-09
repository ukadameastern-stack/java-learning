package com.uday.javaconcepts.pojo;

/*
=====================================================
POJO CLASS IN JAVA
=====================================================

POJO = Plain Old Java Object

It is a simple Java class used to represent DATA.
One of the example for Encapsulation.
POJO class is a kind of Design pattern.

Characteristics:
1. Private variables only
2. Getter and Setter methods
3. Public constructor
4. No dependency on frameworks

POJO classes are commonly used in:
- Hibernate
- Spring Boot
- REST APIs
- DTO Objects

| Feature | POJO                   | DTO                          |
| ------- | ---------------------- | ---------------------------- |
| Meaning | Plain Old Java Object  | Data Transfer Object         |
| Purpose | Represent object data  | Transfer data between layers |
| Logic   | May contain logic      | Usually no logic             |
| Usage   | Model / Entity classes | API response/request         |


Design pattern: Represents a solution or a template for a solution.
    Design pattern provides steps to achieve a common problem/Or a better solution in real time application.
*/

public class StudentPojo {

    // Private variables
    private int id;
    private String name;
    private int age;

    // Default Constructor
    public StudentPojo() {

    }

    // Parameterized Constructor
    public StudentPojo(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter Methods
    /*
        2. Getter and Setter Methods
        Getter Method
        Used to read/access the value of a private variable.
     */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter Methods
    /*
        Setter Method should be public.
        Return type should be void.
        Used to modify/update the value of a private variable.
     */

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
        Why Getter & Setter are Important

        They support Encapsulation.

        Benefits:
        1. Controlled access to variables
        2. Data validation possible
        3. Improves security
        4. Easy maintenance

        Example with validation
     */
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }
}