package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AccoliteStreamEx {

    public static void main(String[] args) {
        /*Using single line stream api get the output of unique sorted element list in desc order.
        List<List<Integer>> list = [[1,3,5,6], [2,4,5,7], [6, 8, 12, 1, 3]]
        Expected output = [12, 8, 7, 6, 5, 4, 3, 2, 1]*/
        List<List<Integer>> numList = Arrays.asList(Arrays.asList(1,3,5,6),Arrays.asList(2,4,5,7),Arrays.asList(6, 8, 12, 1, 3));
        List<Integer> result = numList.stream().flatMap(num -> num.stream()).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);

    }
}
