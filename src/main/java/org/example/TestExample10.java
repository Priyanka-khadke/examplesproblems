package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestExample10 {

    public static void main(String[] args) {
        String random = "AAACCBEEE";
        List<Character>chList = random.chars().mapToObj(ch->(char)ch).collect(Collectors.toList());
        chList.stream().filter(ch->!(Collections.frequency(chList,ch)>1)).forEach(System.out::println);

        //Character c= getUniqueCharacter(random);
        //System.out.println(c);

    }


    public static Character getUniqueCharacter(String random) {
        char[] chArray = random.toCharArray();
        Map<Character, Integer> chMap = new HashMap<>();
        for (int i = 0; i < chArray.length; i++) {
            if (chMap.containsKey(chArray[i])) {
                chMap.put(chArray[i], chMap.get(chArray[i]) + 1);

            } else {
                chMap.put(chArray[i], 1);
            }
        }
        Iterator<Character> keys = chMap.keySet().iterator();
        while (keys.hasNext()) {
            Character c = keys.next();
            if (chMap.get(c) == 1) {
                return c;
            }
        }return 0;
    }
}

