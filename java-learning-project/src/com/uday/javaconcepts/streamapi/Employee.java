package com.uday.javaconcepts.streamapi;

class Employee {

    private int id;
    private String name;
    private String gender;
    private String city;
    private double salary;
    private int age;
    private int yearOfJoining;

    Employee(int id, String name, String gender, String city, double salary, int age, int yearOfJoining) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.city = city;
        this.salary = salary;
        this.age = age;
        this.yearOfJoining = yearOfJoining;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }
}

