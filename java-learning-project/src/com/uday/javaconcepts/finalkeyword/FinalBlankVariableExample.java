package com.uday.javaconcepts.finalkeyword;

/*

| Keyword Usage          | Meaning                    |
| ---------------------- | -------------------------- |
| final variable         | value cannot change        |
| blank final variable   | initialized in constructor |
| final method           | cannot be overridden       |
| final class            | cannot be inherited        |
| final object reference | reference cannot change    |
| static final           | constant value             |

 */

public class FinalBlankVariableExample {

    final int salary; // blank final variable

    FinalBlankVariableExample() {
        salary = 50000; // initialized in constructor
    }

    public static void main(String[] args) {

        FinalBlankVariableExample obj = new FinalBlankVariableExample();

        System.out.println("Salary: " + obj.salary);
    }
}

/*
Details:
- Blank final variable means it is declared but not initialized immediately.
- It must be initialized inside constructor.

Output:
Salary: 50000
*/