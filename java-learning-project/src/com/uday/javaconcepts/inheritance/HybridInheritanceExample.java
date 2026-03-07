package com.uday.javaconcepts.inheritance;

/*
Hybrid Inheritance

Combination of:
Hierarchical + Multiple (interfaces)

        Device
        /   \
   Laptop  Tablet
        \   /
     InternetFeature
*/

class Device {

    void powerOnDevice() {
        System.out.println("Device powered on");
    }
}

interface InternetFeature {

    void connectToInternet();
}

class Laptop extends Device implements InternetFeature {

    public void connectToInternet() {
        System.out.println("Laptop connected to WiFi");
    }
}

class Tablet extends Device implements InternetFeature {

    public void connectToInternet() {
        System.out.println("Tablet connected to mobile data");
    }
}

public class HybridInheritanceExample {

    public static void main(String[] args) {

        Laptop laptopObject = new Laptop();
        laptopObject.powerOnDevice();
        laptopObject.connectToInternet();

        Tablet tabletObject = new Tablet();
        tabletObject.powerOnDevice();
        tabletObject.connectToInternet();
    }
}

/*
OUTPUT

Device powered on
Laptop connected to WiFi
Device powered on
Tablet connected to mobile data
*/