package com.uday.javaconcepts.interfaceconcepts;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionMachine implements Printer, Scanner {

    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }

    public static void main(String[] args) {

        MultiFunctionMachine m = new MultiFunctionMachine();

        m.print();
        m.scan();
    }
}

/*
Details:
- A class can implement multiple interfaces.
- This allows multiple inheritance in Java.

Output:
Printing document
Scanning document
*/