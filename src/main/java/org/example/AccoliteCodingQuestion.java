package org.example;

import java.util.Arrays;

public class AccoliteCodingQuestion {
    public static void main(String[] args) {
        int[] array = new int[]{1,0,2,3,1,2,0,4};
        //Expected output : [1,2,3,1,2,4,0,0]
        for(int i=0;i<array.length-1;i++){
            for(int j = i+1;j<array.length-1;j++) {
                if (array[j] == 0) {
                    array[j] = array[j + 1];
                    array[j + 1] = 0;

                }
            }

        }
        Arrays.stream(array).boxed().forEach(System.out::println);

    }
}
