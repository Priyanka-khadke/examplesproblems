package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Collections.frequency;
import static java.util.Collections.synchronizedSortedMap;
import static java.util.stream.Collectors.groupingBy;

public class CodingTest9 {
    public static void main(String[] args) {


        Integer sum = IntStream.of(5, 10, 15, 20, 25).filter(e -> (e % 5 == 0 && e % 10 != 0)).sum();
        System.out.println(sum.toString());
        nonRepeatedInput("priyankakhadke");



    }

    public static void nonRepeatedInput(String input) {
        //input.chars().map(e->groupingBy()).collect(Collectors.toList());
        char[] arr = input.toCharArray();

        Map<Character, Integer> countMap = new HashMap<>();
        //int counter = 1;

        //find the count of each character in input string
        for (int i = 0; i < arr.length; i++) {
            if (countMap.containsKey(arr[i])) {
                int value = countMap.get(arr[i]).intValue();
                value++;
                countMap.put(arr[i], value);

            } else {
                countMap.put(arr[i], 1);
            }

        }
        System.out.println(countMap);
        String name ="";
        Iterator it = countMap.keySet().iterator();
        while(it.hasNext()) {
            Character ch = (Character)it.next();
            if(countMap.get(ch).intValue() == 1) {
                //name.concat(ch.toString());
                name = name+ch;

                //System.out.println(ch);
            }
        }
        System.out.println(name);


        ///using streams:
        List<Character> chList = input.chars().mapToObj(ch->(char)ch).collect(Collectors.toList());
        chList.stream()
                .filter(e-> Collections.frequency(chList,e)==1).forEach(System.out::println);


    }
}
