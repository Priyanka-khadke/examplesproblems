package org.example;

import java.util.HashSet;
import java.util.Set;

public class CodingQuestions {

    public static void main(String[] args) {

        //1. find the ascii value of each character in string

        String s = "priyanka";
        String[] arry = s.split("");
        char[] ch = s.toCharArray();

        /*s.chars().forEach(System.out::println);*/

        //2.find sum of pairs that sum to a number in array
       /* int[] a = {1, 3, 2, 4, 7, 5, 0};
        int sum = 5;

        Set<Integer> mp = new HashSet<>();


        for (int i = 0; i < a.length; i++) {
            if (mp.contains(sum - a[i])) {
                System.out.println(a[i]);
                System.out.println(sum - a[i]);
            }
            mp.add(a[i]);
        }*/

    }
}
