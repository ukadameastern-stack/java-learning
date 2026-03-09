package com.uday.javaconcepts.dto;

/*
=====================================================
DTO CLASS (DATA TRANSFER OBJECT)
=====================================================

DTO is used to transfer data between
different layers of an application.

Example:
Controller → Service → Repository

DTO usually contains:
- Private variables
- Getter and Setter
- No business logic

| Feature | POJO                   | DTO                          |
| ------- | ---------------------- | ---------------------------- |
| Meaning | Plain Old Java Object  | Data Transfer Object         |
| Purpose | Represent object data  | Transfer data between layers |
| Logic   | May contain logic      | Usually no logic             |
| Usage   | Model / Entity classes | API response/request         |

*/

public class StudentDTO {

    private int id;
    private String name;

    public StudentDTO() {

    }

    public StudentDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}