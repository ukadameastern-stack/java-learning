package com.uday.javaconcepts.methodreference;

public class StudentOperations {
    public boolean isEligible(Student student) {
        return student.getName().equals("Uday");
    }

    public static boolean isStudent(Student student) {
        return student.getName().equals("Uday");
    }

    public static void main(String[] args) {
        StudentOperations st = new StudentOperations();
        System.out.println(st.isEligible(new Student(101, "Uday")));
        System.out.println(st.isEligible(new Student(102, "Vijay")));

        // Lambda Expression
        StudentEligibilityCheck check = student -> student.getName().equals("Uday");
        System.out.println(check.isEligible(new Student(101, "Uday")));

        // Static MR
        StudentEligibilityCheck check2 = StudentOperations::isStudent;
        System.out.println(check2.isEligible(new Student(101, "Uday")));

        // Object/Instance MR
        StudentEligibilityCheck check3 = st::isEligible;
        System.out.println(check3.isEligible(new Student(101, "Uday")));


    }
}
