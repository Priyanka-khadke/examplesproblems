package org.example;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest3 {
    public static void main(String[] args) {
       CodingTest3.solution("abda");

    }

    public static void solution(String S) {
        List<Character> chars = S.chars()
                .mapToObj(e->(char)e).collect(Collectors.toList());
        chars.stream().filter(c -> Collections.frequency(chars,c)>1).forEach(System.out::println);



       // S.chars().forEach(System.out::print);
    }

}
