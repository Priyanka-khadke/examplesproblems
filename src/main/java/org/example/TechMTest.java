package org.example;

public class TechMTest {

    public static void main(String[] args){

         Cab cab =  (source,destination)->{
             return "Ola cab booked from"+source+"to"+destination;
         };
        System.out.println(cab.bookCab("Hyd","Mumbai"));

        }

}
