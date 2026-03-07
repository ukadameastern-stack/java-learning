package com.uday.javaconcepts.inheritance;

/*
Multiple Inheritance via Interfaces

InterfaceA
      \
       ChildClass
      /
InterfaceB
*/

interface CameraFeature {

    void takePhoto();
}

interface MusicFeature {

    void playMusic();
}

class SmartPhone implements CameraFeature, MusicFeature {

    public void takePhoto() {
        System.out.println("Taking photo using camera");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }
}

public class MultipleInheritanceUsingInterfaceExample {

    public static void main(String[] args) {

        SmartPhone phoneObject = new SmartPhone();

        phoneObject.takePhoto();
        phoneObject.playMusic();
    }
}

/*
OUTPUT

Taking photo using camera
Playing music
*/