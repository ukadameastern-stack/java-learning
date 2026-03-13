package com.uday.javaconcepts.collectionsframework;

import java.util.LinkedList;
import java.util.Queue;

/*
=========================================================
QUEUE INTERFACE
=========================================================

    Queue follows FIFO principle.

FIFO
----
    First In First Out

Common Implementations

    LinkedList
    PriorityQueue
*/

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue.poll());
        System.out.println(queue);
    }
}

/*
OUTPUT
--------------------------------
10
[20, 30]
*/