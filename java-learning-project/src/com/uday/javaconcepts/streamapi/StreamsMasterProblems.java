package com.uday.javaconcepts.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsMasterProblems {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5,10,15,20,25,10,5,30);

        // 1️⃣ Find even numbers
        nums.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        /*
        filter() → keeps elements matching condition

        OUTPUT
        10
        20
        10
        30
        */


        // 2️⃣ Find odd numbers
        nums.stream()
                .filter(x -> x % 2 != 0)
                .forEach(System.out::println);

        /*
        OUTPUT
        5
        15
        25
        5
        */


        // 3️⃣ Remove duplicates
        nums.stream()
                .distinct()
                .forEach(System.out::println);

        /*
        distinct() removes duplicates

        OUTPUT
        5
        10
        15
        20
        25
        30
        */


        // 4️⃣ Sort numbers
        nums.stream()
                .sorted()
                .forEach(System.out::println);

        /*
        OUTPUT
        5
        5
        10
        10
        15
        20
        25
        30
        */


        // 5️⃣ Reverse sort
        nums.stream()
                .sorted((a,b)->b-a)
                .forEach(System.out::println);

        /*
        OUTPUT
        30
        25
        20
        15
        10
        10
        5
        5
        */


        // 6️⃣ Find maximum number
        int max = nums.stream()
                .max(Integer::compare)
                .get();

        System.out.println(max);

        // OUTPUT: 30


        // 7️⃣ Find minimum number
        int min = nums.stream()
                .min(Integer::compare)
                .get();

        System.out.println(min);

        // OUTPUT: 5


        // 8️⃣ Find second-highest number
        int secondHighest =
                nums.stream()
                        .distinct()
                        .sorted((a,b)->b-a)
                        .skip(1)
                        .findFirst()
                        .get();

        System.out.println(secondHighest);

        // OUTPUT: 25


        // 9️⃣ Count numbers
        long count = nums.stream().count();

        System.out.println(count);

        // OUTPUT: 8


        // 🔟 Sum of numbers
        int sum =
                nums.stream()
                        .reduce(0, Integer::sum);

        System.out.println(sum);

        // OUTPUT: 120


        // 1️⃣1️⃣ Average
        double avg =
                nums.stream()
                        .mapToInt(x -> x)
                        .average()
                        .orElse(0);

        System.out.println(avg);

        // OUTPUT: 15.0


        // 1️⃣2️⃣ Numbers greater than 10

        nums.stream()
                .filter(x -> x > 10)
                .forEach(System.out::println);

        /*
        OUTPUT
        15
        20
        25
        30
        */


        // 1️⃣3️⃣ Convert to square values

        nums.stream()
                .map(x -> x * x)
                .forEach(System.out::println);

        /*
        map() transforms data

        OUTPUT
        25
        100
        225
        400
        ...
        */


        // 1️⃣4️⃣ Limit elements

        nums.stream()
                .limit(3)
                .forEach(System.out::println);

        /*
        OUTPUT
        5
        10
        15
        */


        // 1️⃣5️⃣ Skip elements

        nums.stream()
                .skip(3)
                .forEach(System.out::println);

        /*
        OUTPUT
        20
        25
        10
        5
        30
        */


        // 1️⃣6️⃣ Check anyMatch

        boolean any =
                nums.stream()
                        .anyMatch(x -> x > 20);

        System.out.println(any);

        // OUTPUT: true


        // 1️⃣7️⃣ Check allMatch

        boolean all =
                nums.stream()
                        .allMatch(x -> x > 0);

        System.out.println(all);

        // OUTPUT: true


        // 1️⃣8️⃣ Find first element

        int first =
                nums.stream()
                        .findFirst()
                        .get();

        System.out.println(first);

        // OUTPUT: 5


        // 1️⃣9️⃣ Convert list to set

        Set<Integer> set =
                nums.stream()
                        .collect(Collectors.toSet());

        System.out.println(set);

        /*
        OUTPUT
        [5,10,15,20,25,30]
        */


        // 2️⃣0️⃣ Convert list to map

        Map<Integer,Integer> map =
                nums.stream()
                        .distinct()
                        .collect(Collectors.toMap(
                                x -> x,
                                x -> x*x
                        ));

        System.out.println(map);

        /*
        OUTPUT
        {5=25,10=100,15=225...}
        */


        // 2️⃣1️⃣ Count frequency of elements

        Map<Integer,Long> freq =
                nums.stream()
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));

        System.out.println(freq);

        /*
        OUTPUT
        {5=2,10=2,15=1,20=1,25=1,30=1}
        */


        // 2️⃣2️⃣ Find duplicate elements

        nums.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .forEach(System.out::println);

        /*
        OUTPUT
        5=2
        10=2
        */


        // 2️⃣3️⃣ Convert String to character frequency

        String str = "java";

        Map<Character,Long> charFreq =
                str.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));

        System.out.println(charFreq);

        /*
        OUTPUT
        {j=1,a=2,v=1}
        */


        // 2️⃣4️⃣ First non-repeated character

        Character firstNonRepeat =
                str.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .filter(x -> x.getValue()==1)
                        .findFirst()
                        .get()
                        .getKey();

        System.out.println(firstNonRepeat);

        // OUTPUT: j


        // 2️⃣5️⃣ Join strings

        List<String> names =
                Arrays.asList("Uday","Amol","Balaji");

        String result =
                names.stream()
                        .collect(Collectors.joining(","))
                        .formatted();

        System.out.println(result);

        // OUTPUT: Uday,Amol,Balaji
    }
}

/*
Most Important Stream Interview Problems

These 10 are asked very frequently:

    Find duplicate elements

    Find first non-repeated character

    Find second highest number

    Count frequency of elements

    Convert list to map

    Group employees by department

    Find highest salary employee

    Find average salary by department

    Flatten nested list (flatMap)

    String character frequency
 */