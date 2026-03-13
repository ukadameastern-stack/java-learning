package com.uday.javaconcepts.collectionsframework.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();

        // Adding values
        namesList.add("Dada");
        namesList.add("BalajiRav");
        namesList.add("Balaji");
        namesList.add("Dada");
        namesList.add("Amol");
        namesList.add("Cobra");

        // How to get the values? -> .get(index number)
        String name = namesList.get(0);
        System.out.println(name); // Dada

        name = namesList.get(1);
        System.out.println(name); // Amol

        // How to know the size of an ArrayList
        int size = namesList.size();
        System.out.println("Size of ArrayList: " + size);

        // What if we try to access ArrayList element greater than size?
        // Wil get java.lang.IndexOutOfBoundsException
        try {
            System.out.println("Greater than size element: " + namesList.get(size));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Print all values
        System.out.print("\n".repeat(2));
        System.out.println("======== Print all values =========");
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }

        // Convert all value to UPPERCASE
        System.out.print("\n".repeat(2));
        System.out.println("======== Convert all value to UPPERCASE =========");
        for (String n : namesList) {
            System.out.println(n.toUpperCase());
        }

        // With iterator example
        System.out.println("\n".repeat(2) + "======== With iterator example =========");
        Iterator<String> it = namesList.iterator();
        System.out.println(it);
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Removing values
        System.out.println("\n".repeat(2) + "======== Removing values =========");
        System.out.println("Before remove Dada: " + namesList);
        // [Dada, Dada, Balaji, Balaji, Amol, Cobra]
        namesList.remove("Dada"); // It removes first occurrence
        // We can pass value or index namesList.remove(4);
        System.out.println("Removed Dada: " + namesList);
        System.out.println("Removed First: " + namesList.removeFirst() + " : " + namesList);
        System.out.println("Removed Last: " + namesList.removeLast() + " : " + namesList);


        // Reverse values
        System.out.println("\n".repeat(2) + "======== reverse values =========");
        System.out.println(namesList.reversed());

        // Place a value at Index position
        System.out.println("\n".repeat(2) + "======== add Uday =========");
        namesList.add(0, "Uday");
        System.out.println(namesList);

        System.out.println("\n".repeat(2) + "======== Get index of Amol =========");
        System.out.println(namesList.indexOf("Amol"));

    }
}

/*
o/p:

Dada
BalajiRav
Size of ArrayList: 6
Index 6 out of bounds for length 6


======== Print all values =========
Dada
BalajiRav
Balaji
Dada
Amol
Cobra


======== Convert all value to UPPERCASE =========
DADA
BALAJIRAV
BALAJI
DADA
AMOL
COBRA


======== With iterator example =========
java.util.ArrayList$Itr@312b1dae
Dada
BalajiRav
Balaji
Dada
Amol
Cobra


======== Removing values =========
Before remove Dada: [Dada, BalajiRav, Balaji, Dada, Amol, Cobra]
Removed Dada: [BalajiRav, Balaji, Dada, Amol, Cobra]
Removed First: BalajiRav : [Balaji, Dada, Amol, Cobra]
Removed Last: Cobra : [Balaji, Dada, Amol]


======== reverse values =========
[Amol, Dada, Balaji]


======== add Uday =========
[Uday, Balaji, Dada, Amol]


======== Get index of Amol =========
3
 */