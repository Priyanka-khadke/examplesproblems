package org.example;

public class CodingExample8 {
    public static void main(String[] args) {
        //integer array,
        //has duplicates : {1,2,3,4,1,2,3,4}
        //variable k value =3;
        boolean flag = false;

        int[] numbers = new int[]{1, 1, 3, 4, 1, 2, 3, 4};
        int k = 3;
        for (int i = 0; i < numbers.length - k; i++) {
            int temp = numbers[i];
            for (int j = i + 1; j < i + k; j++) {
                if (temp == numbers[j]) {
                    flag = true;
                }
            }

        }
        System.out.println(flag);

    }
}
