package org.example;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int max =0;
        int[] numbers = new int[]{4,3,7,3,6,2};
        for(int i = 0;i< numbers.length;i++) {
            if(max<numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(Arrays.stream(numbers).max().getAsInt());
    }

    public void isPalindrome(int numb){
        




    }
}
