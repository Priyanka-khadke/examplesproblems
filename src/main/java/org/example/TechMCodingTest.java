package org.example;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//
////1.merge two arrays
//2.find max,min,second max from array
//3.sort the array

public class TechMCodingTest {



    public static void main(String[] args)
        {
/*
            List<Employee> empList = new ArrayList<>();
            empList.add(new Employee(1,"e8",1000L));
            empList.add(new Employee(2,"e2",10001L));
            empList.add(new Employee(3,"e9",10002L));
            empList.add(new Employee(4,"e4",10003L));
            empList.add(new Employee(5,"e5",10004L));
            List<Employee> collect = empList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
            System.out.println(collect);*/

            int[]arry = {2,5,4,3,8,6,7};
//sum of all odd numbers
            int sum = Arrays.stream(arry).filter(num -> (num % 2 != 0)).sum();
            System.out.println(sum);

            // first array
            /*int a[] = { 30, 25, 40 };
            // second array
            int b[] = { 45, 50, 55, 60, 65 };

            // determining length of first array
            int a1 = a.length;
            // determining length of second array
            int b1 = b.length;

            // resultant array size
            int c1 = a1 + b1;

            // Creating a new array
            int[] c = new int[c1];

            // Loop to store the elements of first
            // array into resultant array
             for(int i=0;i<a1;i++){
                    c[i] = a[i];

                }

                for(int j=0;j<b1;j++){
                c[a1+j] = b[j];
                }
                for(int n:c){
                System.out.println(n);
            }*/

            /*int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};
            TechMCodingTest test = new TechMCodingTest();
            test.findMaxMin(numbers);*/


           /* int[] arr = {64, 34, 25, 12, 22, 11, 90};
            //Arrays.sort(arr);

            for(int i=0;i<arr.length;i++){
                int temp = 0;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]>arr[i]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }



            }
            for(int n:arr){
                System.out.println(n);
            }*/





        }

        /*public void findMaxMin(int[] nums){
        int length = nums.length;
        int max=nums[0];
        int secondMax=nums[0];
        int min =nums[0];

        for(int i=0;i<length;i++) {

            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                secondMax = max;
                max=nums[i];

            }
            else if(secondMax<nums[i]){
                secondMax = nums[i];
                //System.out.println(secondMax);
            }


        }
            System.out.println("Max: "+max +" secondMax: "+secondMax+" min: "+min);

        }*/




}
