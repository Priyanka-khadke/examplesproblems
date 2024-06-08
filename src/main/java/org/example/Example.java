package org.example;
import java.util.*;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);

       /* long count = numbers.stream()
                .distinct()
                .sorted()
                .map(num->num*num)
                .filter(num->(num>2)).count();
        System.out.println("cout"+count);*/

        numbers.stream().filter(e ->Collections.frequency(numbers,e)>1).distinct().forEach(System.out::println);
        String s ="abc";
       int[]A = new int[4];
        System.out.println(A[0]);

        /*public static boolean isPrime(int num){
            boolean flag = true;
            for (int i = 0; i < num; i++) {
                if (num % i != 0) {
                    flag = false;
                }
            }
        }*/


       /* Set<Integer> numberSet = new HashSet(numbers);
        for(Integer num : numberSet) {
            System.out.println(num);
        }*/

    }
}
