package org.example;

public class Ola implements Cab{

    public String bookCab(String source, String destination){

        System.out.println("Ola cab is booked from"+source+"To"+destination);

        return("Price:5000 Rs");

    }
}
