package com.uday.javaconcepts.arraysinjava;

import java.util.*;

/*
Iterable
   |
   |---- Collection
   |        |
   |        |---- List
   |        |       |---- ArrayList
   |        |       |---- LinkedList
   |        |       |---- Vector
   |        |              |---- Stack
   |        |
   |        |---- Set
   |        |       |---- HashSet
   |        |       |       |---- LinkedHashSet
   |        |       |
   |        |       |---- SortedSet
   |        |               |---- TreeSet
   |        |
   |        |---- Queue
   |                |---- PriorityQueue
   |                |---- Deque
   |                        |---- ArrayDeque
   |                        |---- LinkedList
   |
   |
   |---- Map   (Not part of Collection interface)
            |
            |---- HashMap
            |       |---- LinkedHashMap
            |
            |---- SortedMap
                    |---- TreeMap

Java Collections Framework Examples with Details

Collection Categories Covered:

1. List
2. Set
3. Queue
4. Map
*/

public class CollectionTypesWithDetails {

    public static void main(String[] args) {

        arrayListExample();
        linkedListExample();
        vectorExample();
        stackExample();

        hashSetExample();
        linkedHashSetExample();
        treeSetExample();

        priorityQueueExample();

        hashMapExample();
        linkedHashMapExample();
        treeMapExample();
    }

    /*
    =====================================================
    ARRAYLIST
    =====================================================

    What is ArrayList?
    - A dynamic array implementation in Java.
    - Allows duplicate elements.
    - Maintains insertion order.

    Internal Structure:
    - Resizable array

    When to Use:
    - When frequent reading operations are required.
    - When order of elements must be preserved.
    - Most commonly used List implementation.

    Performance:
    - Fast random access (O(1))
    - Slower insert/delete in middle

    Not Thread Safe
    */

    public static void arrayListExample() {

        List<String> employeeNameArrayList = new ArrayList<>();

        employeeNameArrayList.add("Uday");
        employeeNameArrayList.add("Rahul");
        employeeNameArrayList.add("Uday");

        System.out.println("ArrayList Data: " + employeeNameArrayList);
    }

    /*
    =====================================================
    LINKEDLIST
    =====================================================

    What is LinkedList?
    - Doubly linked list implementation of List interface.

    Structure:
    - Each element stores reference to next and previous node.

    When to Use:
    - When frequent insertions/deletions occur.
    - Not ideal for random access.

    Performance:
    - Insert/Delete → Fast
    - Random Access → Slow
    */

    public static void linkedListExample() {

        List<String> projectTaskLinkedList = new LinkedList<>();

        projectTaskLinkedList.add("Requirement");
        projectTaskLinkedList.add("Development");
        projectTaskLinkedList.add("Testing");

        System.out.println("LinkedList Data: " + projectTaskLinkedList);
    }

    /*
    =====================================================
    VECTOR
    =====================================================

    What is Vector?
    - Legacy class similar to ArrayList.
    - Thread-safe (synchronized).

    When to Use:
    - Rarely used today.
    - Use when thread safety is required but modern alternative is better.

    Modern Alternative:
    - Collections.synchronizedList()
    */

    public static void vectorExample() {

        Vector<String> departmentVector = new Vector<>();

        departmentVector.add("HR");
        departmentVector.add("Finance");

        System.out.println("Vector Data: " + departmentVector);
    }

    /*
    =====================================================
    STACK
    =====================================================

    What is Stack?
    - Last In First Out (LIFO) collection.

    Common Use Cases:
    - Undo operations
    - Browser history
    - Expression evaluation

    Important Methods:
    - push()
    - pop()
    - peek()
    */

    public static void stackExample() {

        Stack<String> browserHistoryStack = new Stack<>();

        browserHistoryStack.push("google.com");
        browserHistoryStack.push("github.com");
        browserHistoryStack.push("stackoverflow.com");

        System.out.println("Stack Top Element: " + browserHistoryStack.peek());
    }

    /*
    =====================================================
    HASHSET
    =====================================================

    What is HashSet?
    - Collection that stores unique elements.
    - Uses hashing mechanism.

    Characteristics:
    - No duplicates
    - No guaranteed order

    When to Use:
    - When uniqueness is required.

    Example:
    - Unique email list
    */

    public static void hashSetExample() {

        Set<String> uniqueCityHashSet = new HashSet<>();

        uniqueCityHashSet.add("Pune");
        uniqueCityHashSet.add("Mumbai");
        uniqueCityHashSet.add("Pune");

        System.out.println("HashSet Data: " + uniqueCityHashSet);
    }

    /*
    =====================================================
    LINKEDHASHSET
    =====================================================

    What is LinkedHashSet?
    - HashSet that maintains insertion order.

    Characteristics:
    - No duplicates
    - Maintains order
    */

    public static void linkedHashSetExample() {

        Set<String> orderedCityLinkedHashSet = new LinkedHashSet<>();

        orderedCityLinkedHashSet.add("Delhi");
        orderedCityLinkedHashSet.add("Bangalore");
        orderedCityLinkedHashSet.add("Hyderabad");

        System.out.println("LinkedHashSet Data: " + orderedCityLinkedHashSet);
    }

    /*
    =====================================================
    TREESET
    =====================================================

    What is TreeSet?
    - Sorted Set implementation.

    Characteristics:
    - Elements stored in sorted order
    - Uses Red-Black Tree internally

    When to Use:
    - When sorted unique elements are required.
    */

    public static void treeSetExample() {

        Set<Integer> sortedEmployeeIdTreeSet = new TreeSet<>();

        sortedEmployeeIdTreeSet.add(105);
        sortedEmployeeIdTreeSet.add(101);
        sortedEmployeeIdTreeSet.add(103);

        System.out.println("TreeSet Data: " + sortedEmployeeIdTreeSet);
    }

    /*
    =====================================================
    PRIORITY QUEUE
    =====================================================

    What is PriorityQueue?
    - Queue that processes elements based on priority.

    Characteristics:
    - Elements sorted internally
    - Lowest value processed first (default)

    Use Cases:
    - Task scheduling
    - Job processing systems
    */

    public static void priorityQueueExample() {

        Queue<String> supportTicketQueue = new PriorityQueue<>();

        supportTicketQueue.add("Ticket-3");
        supportTicketQueue.add("Ticket-1");
        supportTicketQueue.add("Ticket-2");

        System.out.println("Next Ticket: " + supportTicketQueue.poll());
    }

    /*
    =====================================================
    HASHMAP
    =====================================================

    What is HashMap?
    - Key-value data structure.

    Characteristics:
    - Unique keys
    - No order guarantee

    Most commonly used Map implementation.

    Use Cases:
    - Database caching
    - API responses
    */

    public static void hashMapExample() {

        Map<Integer, String> employeeHashMap = new HashMap<>();

        employeeHashMap.put(101, "Uday");
        employeeHashMap.put(102, "Rahul");

        System.out.println("HashMap Data: " + employeeHashMap);
    }

    /*
    =====================================================
    LINKEDHASHMAP
    =====================================================

    What is LinkedHashMap?
    - HashMap that maintains insertion order.
    */

    public static void linkedHashMapExample() {

        Map<Integer, String> orderedEmployeeLinkedHashMap = new LinkedHashMap<>();

        orderedEmployeeLinkedHashMap.put(201, "Amit");
        orderedEmployeeLinkedHashMap.put(202, "Priya");

        System.out.println("LinkedHashMap Data: " + orderedEmployeeLinkedHashMap);
    }

    /*
    =====================================================
    TREEMAP
    =====================================================

    What is TreeMap?
    - Sorted Map implementation.

    Characteristics:
    - Keys stored in sorted order.
    - Implemented using Red-Black Tree.

    When to Use:
    - When sorted keys are required.
    */

    public static void treeMapExample() {

        Map<Integer, String> sortedEmployeeTreeMap = new TreeMap<>();

        sortedEmployeeTreeMap.put(305, "Ravi");
        sortedEmployeeTreeMap.put(301, "Neha");
        sortedEmployeeTreeMap.put(303, "Kiran");

        System.out.println("TreeMap Data: " + sortedEmployeeTreeMap);
    }
}