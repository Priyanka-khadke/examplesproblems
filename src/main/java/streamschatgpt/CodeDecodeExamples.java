package streamschatgpt;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodeDecodeExamples {
    public static void main(String[] args) {
        int[] arry1 = {4, 2, 6, 1, 8, 5};
        int[] arry2 = {0, 7, 4, 2, 3, 5, 90};
        String[] fruits = {"apple","orange","avacado","pears","pineapple","apple","banana"};

        //find common elements from both arrays using java streams.

        //findCommon(arry1, arry2);
        //reverseArrayInPlace(arry2);
        //findLongestLengthFruit(fruits);
        removeDuplicateFruit(fruits);

    }

    public static void removeDuplicateFruit(String[] fruits){
       /* List<Map.Entry<String, Long>> collect = Arrays.stream(fruits).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().filter(entry -> entry.getValue() > 1).collect(Collectors.toList());
        System.out.println(collect);*/
        LinkedHashSet<String> collect = Arrays.stream(fruits).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(collect);

    }

    public static void findLongestLengthFruit(String[] fruits){
        String s = Arrays.stream(fruits).reduce((a, b) -> a.length() > b.length() ? a : b).get();
        System.out.println(s);
    }

    public static void findCommon(int[] arr1, int[] arry2) {
        List<Integer> collect = Arrays.stream(arr1).filter(i -> Arrays.stream(arry2).anyMatch(e -> e == i)).boxed().collect(Collectors.toList());
        System.out.println(collect);

    }

    public static void reverseArrayInPlace(int[] arry) {
        IntStream.range(0, arry.length / 2).forEach(i -> {
            int length = arry.length;
            int temp = arry[i];
            arry[i] = arry[length - 1 - i];
            arry[length - 1 - i] = temp;
        });
        System.out.println(Arrays.toString(arry));

    }
}
