package org.example;

public class Test{




    public static void main(String[] args) {
        final  String resource1 = "test1";
        final  String resource2 = "test2";
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
               synchronized (resource1) {
                   try {
                       Thread.sleep(500);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   synchronized (resource2){
                       System.out.println("resource2 executing");
                   }
               }

            }
        } );
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource2) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (resource1){
                        System.out.println("resource1 executing");
                    }
                }

            }
        } );
                t1.start();
                t2.start();

    }
}
