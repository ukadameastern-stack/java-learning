package com.uday.javaconcepts.objectclass;

/*
    CONCEPT: == vs equals()

    == operator
        compares memory reference

    equals()
        compares object content (if overridden)
*/

public class EqualsVsOperator {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Uday");
        Student s2 = new Student(1, "Uday");
        Student s3 =  s2;

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // false
        System.out.println("HashCode of s1: " + s1.hashCode()); // HashCode of s1: 2065951873
        System.out.println("HashCode of s2: " + s2.hashCode()); // HashCode of s2: 1922154895
        System.out.println("HashCode of s3: " + s3.hashCode()); // HashCode of s2: 1922154895
//        System.out.println("Identity HashCode of s1: " + System.identityHashCode(s1));
//        System.out.println("Identity HashCode of s2: " + System.identityHashCode(s2));
//        System.out.println("Identity HashCode of s3: " + System.identityHashCode(s3));

        System.out.println(s2 == s3); // true
        System.out.println(s2.equals(s3)); // true

    }
}

/*
OUTPUT:

false
false
HashCode of s1: 2065951873
HashCode of s2: 1922154895
HashCode of s3: 1922154895
true
true

Explanation:

s1 == s2  -> false because they are different objects

1️⃣ Memory Creation

When Java runs this:

    Student s1 = new Student(1, "Uday");

Java creates a new object in Heap memory.

Example:

    Heap Memory
    -------------------
    Object A
    id = 1
    name = "Uday"
    -------------------

    s1 -----> Object A

Now this line runs:

    Student s2 = new Student(1, "Uday");

Java creates another new object even if the values are same.

    Heap Memory
    -------------------
    Object A
    id = 1
    name = "Uday"

    Object B
    id = 1
    name = "Uday"
    -------------------

    s1 -----> Object A
    s2 -----> Object B

So now:

    s1 → Object A

    s2 → Object B

They are two different objects in memory.

2️⃣ == Operator

== compares memory reference (address).

    System.out.println(s1 == s2);

Java checks:

    Is Object A address == Object B address ?

Answer: false
Output:false
------------------------------------------------
equals()  -> true because values are same

3️⃣ equals() Method

We overrode equals() to compare values:

    return id == s.id && name.equals(s.name);

Now Java checks:

    1 == 1
    "Uday" == "Uday"

Both true → so result: true
Output: true

| Comparison      | What it checks   | Result |
| --------------- | ---------------- | ------ |
| `s1 == s2`      | Memory reference | false  |
| `s1.equals(s2)` | Object values    | true   |

5️⃣ When == becomes true

Example:

    Student s1 = new Student(1, "Uday");
    Student s2 = s1;

    System.out.println(s1 == s2);

Memory:

    s1 ----\
            ---> Object A
    s2 ----/

Both point to same object.

Output: true

6️⃣ Visual Summary
    Case 1 (new objects)

        s1 ---> Object A
        s2 ---> Object B

        s1 == s2  → false


    Case 2 (same reference)

        s1 ---> Object A
        s2 ---^

        s1 == s2  → true
*/