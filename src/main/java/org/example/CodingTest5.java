package org.example;

public class CodingTest5 {

    public static void main(String[] args) {
        int[] a = new int[]{23,242,15,-2,24,51,35,4};
        //int[]a2 = new int[]{2,6,1,3,8};

        /*for(int i=0;i<a1.length;i++) {
            for(int j=0;j<a2.length;j++){
                if(a1[i] == a2[j]) {
                    System.out.println(a1[i]);
  09

            }
        }*/
        int largest = 0;
        int secondLargest = 0;
        int thirdSmallest = 0;

        for (int i = 0; i < a.length; i++) {
            if (largest < a[i]) {
                secondLargest = largest;
                largest = a[i];

            }
            else if (secondLargest < a[i]) {
                secondLargest = a[i];

            }
        }
        /*for (int i = 0; i < a.length; i++) {
            if (secondSmallest < a[i]) {
                thirdSmallest = secondSmallest;
                secondSmallest = a[i];

            }
        }
        for (int i = 0; i < a.length; i++) {
            if (thirdSmallest < a[i]) {
                thirdSmallest = a[i];

            }
        }*/

        System.out.println("largest: "+largest);
        System.out.println("secondLargest: "+secondLargest);
       // System.out.println(thirdSmallest);

    }

}



