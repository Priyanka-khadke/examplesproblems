package org.example;

public class CodingTest2 {

    public static void main(String[] args) {
        System.out.println(CodingTest2.solution("1010"));//9
    }

    public static int solution(String S) {
        int counter =0;
        int encodedValue = Integer.parseInt(S,2);

        //if value is even
        while(encodedValue !=0) {
            if(encodedValue%2==0) {
                encodedValue=encodedValue/2;
            }else{
                encodedValue=encodedValue-1;
            }counter++;
        }
        return counter;
    }
}
