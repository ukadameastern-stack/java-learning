package com.uday.javaconcepts.constructorsinjava;

/*
Immutable Object + Builder Pattern Example

Important Characteristics:
1. Class is declared as final → cannot be subclassed
2. All fields are private and final → values cannot change after creation
3. No setter methods → prevents modification
4. Object creation happens only through Builder
5. Builder helps manage many optional parameters
*/

public final class EmployeeProfile {

    private final String employeeName;
    private final int employeeAge;
    private final String employeeDepartment;
    private final double employeeSalary;
    private final String employeeCity;

    /*
    Private constructor
    Only Builder can create the object
    */
    private EmployeeProfile(EmployeeProfileBuilder builderObject) {
        this.employeeName = builderObject.employeeName;
        this.employeeAge = builderObject.employeeAge;
        this.employeeDepartment = builderObject.employeeDepartment;
        this.employeeSalary = builderObject.employeeSalary;
        this.employeeCity = builderObject.employeeCity;
    }

    // Getter methods only (no setters)
    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    /*
    Static Builder Class
    Used to construct EmployeeProfile object
    */
    public static class EmployeeProfileBuilder {

        private String employeeName;
        private int employeeAge;
        private String employeeDepartment;
        private double employeeSalary;
        private String employeeCity;

        // Builder setter methods (return Builder for chaining)

        public EmployeeProfileBuilder setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public EmployeeProfileBuilder setEmployeeAge(int employeeAge) {
            this.employeeAge = employeeAge;
            return this;
        }

        public EmployeeProfileBuilder setEmployeeDepartment(String employeeDepartment) {
            this.employeeDepartment = employeeDepartment;
            return this;
        }

        public EmployeeProfileBuilder setEmployeeSalary(double employeeSalary) {
            this.employeeSalary = employeeSalary;
            return this;
        }

        public EmployeeProfileBuilder setEmployeeCity(String employeeCity) {
            this.employeeCity = employeeCity;
            return this;
        }

        /*
        build() method creates immutable object
        */
        public EmployeeProfile build() {
            return new EmployeeProfile(this);
        }
    }

    public static void main(String[] args) {

        EmployeeProfile employeeObject =
                new EmployeeProfile.EmployeeProfileBuilder()
                        .setEmployeeName("Uday")
                        .setEmployeeAge(30)
                        .setEmployeeDepartment("Engineering")
                        .setEmployeeSalary(5000)
                        .setEmployeeCity("Pune")
                        .build();

        System.out.println(employeeObject.getEmployeeName());
        System.out.println(employeeObject.getEmployeeDepartment());
        System.out.println(employeeObject.getEmployeeCity());
    }
}