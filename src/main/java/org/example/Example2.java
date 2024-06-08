package org.example;

public class Example2 {

    public void m(Object o){
        System.out.println("obj method");
    }

    public void m(String s){
        System.out.println("string method");
    }

    public static void main(String[] args) {
        Example2 p= new Example2();
        p.m("i will");
        p.m(new String("select the "));
        String st = new String("company ");

        p.m((Object)st);
        p.m((Object)null);
        p.m(null);
    }
}
