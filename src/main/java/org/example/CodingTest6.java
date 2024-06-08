package org.example;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class CodingTest6 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple","testt","banana");
        //List<String> tempList = new ArrayList<>();

        /*Map<Integer,List<String>> fruitMap = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            int length = words.get(i).length();
            String temp = words.get(i);
            //System.out.println(temp);

            if (fruitMap.containsKey(length)) {
                List<String> abc = fruitMap.get(length);
                abc.add(temp);
                fruitMap.put(length,abc);
            } else {
                List<String> tempList = new ArrayList<>();
                tempList.add(words.get(i));
                fruitMap.put(length, tempList);

            }




        }*/ //System.out.println(fruitMap);
        Map<Integer,List<String>>result = words.stream().collect(Collectors.groupingBy(e->e.length()));
        System.out.println(result);
//problem no 1:
       /* List<Character>chList = Arrays.asList('a','a','a','a','b','c','c','a','a','d','e','e');
        Set<Character>chSet = new HashSet<>(chList);
        List<Character>newChList = chSet.stream().collect(Collectors.toList());
        System.out.println(newChList);*/




    }
}
