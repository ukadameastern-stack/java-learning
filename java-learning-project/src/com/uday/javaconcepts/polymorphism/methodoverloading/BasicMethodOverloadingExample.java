package com.uday.javaconcepts.polymorphism.methodoverloading;

/*
------------------------------------------
| Rule        | Explanation              |
| ----------- | ------------------------ |
| Method name | Must be the same         |
| Parameters  | Must be different        |
| Return type | Can be same or different |
| Execution   | Decided at compile time  |
------------------------------------------

Invalid Method Overloading Example
void test(int a)
int test(int a)

❌ Not valid because only return type is different.

-------------------------------------------------------
| Feature                 | Method Overloading        |
| ----------------------- | ------------------------- |
| Polymorphism type       | Compile-time polymorphism |
| Method name             | Same                      |
| Parameter list          | Different                 |
| Return type only change | Not allowed               |
-------------------------------------------------------
 */
public class BasicMethodOverloadingExample {

    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    public static void main(String[] args) {

        BasicMethodOverloadingExample obj = new BasicMethodOverloadingExample();

        obj.add(10, 20);
        obj.add(10, 20, 30);

    }
}

/*
Details:
- Same method name: add()
- Different number of parameters.
- Java decides which method to call at compile time.

Output:
Sum: 30
Sum: 60
*/