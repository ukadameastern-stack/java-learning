package com.uday.javaconcepts.inheritance;

public class SingleInheritanceExample {
    public static void main(String[] args) {

        Car carObject = new Car();

        carObject.startVehicle();
        carObject.openSunroof();
    }
}
/*
Single Inheritance

Parent → Child

Example:
Vehicle → Car
*/

class Vehicle {

    public int vpub = 10;
    protected int vpro = 20;
    private int vpri = 30;

    void startVehicle() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    void openSunroof() {
        System.out.println(vpub);
        System.out.println(vpro);
        // System.out.println(vpri); Cant access the private variables and methods.
        System.out.println("Sunroof opened");
    }
}

/*
OUTPUT

Vehicle is starting
Sunroof opened
*/
