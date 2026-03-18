package com.uday.javaconcepts.methodreference;

@FunctionalInterface
public interface StudentEligibilityCheck {
    boolean isEligible(Student student);
}
