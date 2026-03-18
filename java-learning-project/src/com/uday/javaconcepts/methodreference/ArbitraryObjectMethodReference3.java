package com.uday.javaconcepts.methodreference;

import java.util.Arrays;

public class ArbitraryObjectMethodReference3 {

    public static void main(String[] args) {
        String[] values = {"Uday", "Vijay", "Balaji", "amol", "Deepak", "chandan",};

        System.out.println("===========Actual values===========");
        System.out.println(Arrays.toString(values));
        // [Uday, Vijay, Balaji, amol, Deepak, chandan]

        System.out.println("===========Sorted Case Sensitive===========");
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        // [Balaji, Deepak, Uday, Vijay, amol, chandan]

        System.out.println("===========CASE_INSENSITIVE_ORDER===========");
        values = new String[]{"Yug", "Uday", "Vijay", "Balaji", "amol", "Deepak", "chandan",};
        Arrays.sort(values, (o1, o2) -> o1.compareToIgnoreCase(o2));
        System.out.println(Arrays.toString(values));
        // [amol, Balaji, chandan, Deepak, Uday, Vijay, Yug]

        System.out.println("===========CASE_INSENSITIVE_ORDER===========");
        values = new String[]{"Uday", "Yuvi", "Vijay", "Balaji", "amol", "Deepak", "chandan",};
        Arrays.sort(values, String::compareToIgnoreCase); // Arbitrary type
        System.out.println(Arrays.toString(values));
        // [amol, Balaji, chandan, Deepak, Uday, Vijay, Yuvi]
    }
}
