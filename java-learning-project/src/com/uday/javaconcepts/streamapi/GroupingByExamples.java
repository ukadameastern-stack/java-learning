package com.uday.javaconcepts.streamapi;

import java.util.*;
import java.util.stream.Collectors;

class EmployeeGroup {

    int id;
    String name;
    String dept;

    EmployeeGroup(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return name;
    }

}

public class GroupingByExamples {

    public static void main(String[] args) {

        List<EmployeeGroup> list = Arrays.asList(
                new EmployeeGroup(1, "Uday", "IT"),
                new EmployeeGroup(2, "Amol", "HR"),
                new EmployeeGroup(3, "Balaji", "IT")
        );

        Map<String, List<EmployeeGroup>> map =
                list.stream()
                        .collect(Collectors.groupingBy(EmployeeGroup::getDept));

        System.out.println(map);

        /*
        OUTPUT

        IT -> [Uday,Balaji]
        HR -> [Amol]
        */
    }
}