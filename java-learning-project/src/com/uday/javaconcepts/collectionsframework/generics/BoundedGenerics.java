package com.uday.javaconcepts.collectionsframework.generics;


/*
5. Bounded Generics

    You can restrict the type.

    Upper Bound

Allowed types:

    | Allowed | Reason             |
    | ------- | ------------------ |
    | Integer | subclass of Number |
    | Double  | subclass of Number |
    | Float   | subclass of Number |

Not allowed:

    Calculator<String> ❌

 */
class Calculator<T extends Number> {

    T number;

    Calculator(T number) {
        this.number = number;
    }

    double square() {
        return number.doubleValue() * number.doubleValue();
    }
}

public class BoundedGenerics {
    public static void main(String[] args) {
        Calculator<Integer> c = new Calculator<>(5);
        System.out.println(c.square());

        Calculator<Double> d = new Calculator<>(5.5);
        System.out.println(d.square());

        Calculator<Float> f = new Calculator<>(1.0505F);
        System.out.println(f.square());

        // Type parameter 'java.lang.String' is not within its bound;
        // should extend 'java.lang.Number'
        // Calculator<String> s = new Calculator<>("Test");
    }
}

/*
o/p:
25.0
30.25
1.1035503241357816
 */