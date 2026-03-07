package com.uday.javaconcepts.arraysinjava;

import java.util.*;

/*
This class demonstrates the most commonly used collection types in Java.

Java Collection Hierarchy Covered:

1. List
   - ArrayList
   - LinkedList
   - Vector
   - Stack

2. Set
   - HashSet
   - LinkedHashSet
   - TreeSet

3. Queue
   - PriorityQueue

4. Map
   - HashMap
   - LinkedHashMap
   - TreeMap
*/

public class CollectionTypesExamples {

    public static void main(String[] args) {

        listExamples();
        setExamples();
        queueExample();
        mapExamples();
    }

    /*
    LIST COLLECTION EXAMPLES
    Ordered collection
    Allows duplicate values
    */
    public static void listExamples() {

        System.out.println("---- List Examples ----");

        // ArrayList Example (Most commonly used list)
        List<String> employeeNameArrayList = new ArrayList<>();

        employeeNameArrayList.add("Uday");
        employeeNameArrayList.add("Rahul");
        employeeNameArrayList.add("Uday");

        System.out.println("ArrayList: " + employeeNameArrayList); // ArrayList: [Uday, Rahul, Uday]

        // LinkedList Example
        List<String> projectTaskLinkedList = new LinkedList<>();

        projectTaskLinkedList.add("Design");
        projectTaskLinkedList.add("Development");
        projectTaskLinkedList.add("Testing");

        System.out.println("LinkedList: " + projectTaskLinkedList); // LinkedList: [Design, Development, Testing]

        // Vector Example (Thread safe but rarely used today)
        Vector<String> departmentVector = new Vector<>();

        departmentVector.add("HR");
        departmentVector.add("Finance");

        System.out.println("Vector: " + departmentVector); // Vector: [HR, Finance]

        // Stack Example (LIFO)
        Stack<String> browserHistoryStack = new Stack<>();

        browserHistoryStack.push("google.com");
        browserHistoryStack.push("github.com");
        browserHistoryStack.push("stackoverflow.com");

        System.out.println("Stack (Get Top element): " + browserHistoryStack.peek()); // Stack (Top element): stackoverflow.com
        System.out.println("Stack (All element): " + browserHistoryStack); // Stack (All element): [google.com, github.com, stackoverflow.com]
        System.out.println("Stack (Get N Remove element): " + browserHistoryStack.pop()); // Stack (Get N Remove element): stackoverflow.com
        System.out.println("Stack (All element): " + browserHistoryStack); // Stack (All element): [google.com, github.com]

    }

    /*
    SET COLLECTION EXAMPLES
    Does NOT allow duplicate values
    */
    public static void setExamples() {

        System.out.println("---- Set Examples ----");

        // HashSet (Most commonly used set)
        Set<String> uniqueCityHashSet = new HashSet<>();

        uniqueCityHashSet.add("Pune");
        uniqueCityHashSet.add("Mumbai");
        uniqueCityHashSet.add("Pune");

        System.out.println("HashSet: " + uniqueCityHashSet); // HashSet: [Pune, Mumbai]

        // LinkedHashSet (Maintains insertion order)
        Set<String> orderedCityLinkedHashSet = new LinkedHashSet<>();

        orderedCityLinkedHashSet.add("Delhi");
        orderedCityLinkedHashSet.add("Bangalore");
        orderedCityLinkedHashSet.add("Hyderabad");

        System.out.println("LinkedHashSet: " + orderedCityLinkedHashSet); // LinkedHashSet: [Delhi, Bangalore, Hyderabad]

        // TreeSet (Sorted set)
        Set<Integer> sortedEmployeeIdTreeSet = new TreeSet<>();

        sortedEmployeeIdTreeSet.add(105);
        sortedEmployeeIdTreeSet.add(101);
        sortedEmployeeIdTreeSet.add(103);

        System.out.println("TreeSet (Sorted): " + sortedEmployeeIdTreeSet); // TreeSet (Sorted): [101, 103, 105]
    }

    /*
    QUEUE COLLECTION EXAMPLE
    FIFO (First In First Out)
    */
    public static void queueExample() {

        System.out.println("---- Queue Example ----");

        Queue<String> supportTicketQueue = new PriorityQueue<>();

        supportTicketQueue.add("Ticket-3");
        supportTicketQueue.add("Ticket-1");
        supportTicketQueue.add("Ticket-2");

        System.out.println("Next Ticket: " + supportTicketQueue.poll());
    }

    /*
    MAP COLLECTION EXAMPLES
    Stores key-value pairs
    Keys must be unique
    */
    public static void mapExamples() {

        System.out.println("---- Map Examples ----");

        // HashMap (Most commonly used map)
        Map<Integer, String> employeeHashMap = new HashMap<>();

        employeeHashMap.put(101, "Uday");
        employeeHashMap.put(102, "Rahul");
        employeeHashMap.put(103, "Anita");

        System.out.println("HashMap: " + employeeHashMap);

        // LinkedHashMap (Maintains insertion order)
        Map<Integer, String> orderedEmployeeLinkedHashMap = new LinkedHashMap<>();

        orderedEmployeeLinkedHashMap.put(201, "Amit");
        orderedEmployeeLinkedHashMap.put(202, "Priya");

        System.out.println("LinkedHashMap: " + orderedEmployeeLinkedHashMap);

        // TreeMap (Sorted keys)
        Map<Integer, String> sortedEmployeeTreeMap = new TreeMap<>();

        sortedEmployeeTreeMap.put(305, "Ravi");
        sortedEmployeeTreeMap.put(301, "Neha");
        sortedEmployeeTreeMap.put(303, "Kiran");

        System.out.println("TreeMap (Sorted): " + sortedEmployeeTreeMap);
    }
}

/*
Sample Output

---- List Examples ----
ArrayList: [Uday, Rahul, Uday]
LinkedList: [Design, Development, Testing]
Vector: [HR, Finance]
Stack (Top element): stackoverflow.com

---- Set Examples ----
HashSet: [Pune, Mumbai]
LinkedHashSet: [Delhi, Bangalore, Hyderabad]
TreeSet (Sorted): [101, 103, 105]

---- Queue Example ----
Next Ticket: Ticket-1

---- Map Examples ----
HashMap: {101=Uday, 102=Rahul, 103=Anita}
LinkedHashMap: {201=Amit, 202=Priya}
TreeMap (Sorted): {301=Neha, 303=Kiran, 305=Ravi}
*/