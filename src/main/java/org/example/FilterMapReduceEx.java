package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterMapReduceEx {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,6,4,1,9,3);
        //System.out.println(numbers.stream().mapToInt(i->i).sum());
        //System.out.println(numbers.stream().reduce(0,(a,b)->a+b));
        //System.out.println(numbers.stream().reduce(0,(a,b)->a>b?a:b));
        String longestString = Stream.of("java","spring","hibernate","sdfsdfhgsfgsdjfhbsdf").reduce((str1,str2)->str1.length()>str2.length()?str1:str2).get();
        System.out.println(longestString);
    }
}
