package com.packt.java.chapter22;

public class Example4 {
    public static void main(String[] args) {
        Thread threadA = new Thread(new MyOwnThread2());
        threadA.setName("A");
        threadA.setPriority(Thread.MAX_PRIORITY);
        Thread threadB = new Thread(new MyOwnThread2());
        threadB.setName("B");
        threadB.setPriority(Thread.MIN_PRIORITY);
        threadA.start();
        threadB.start();
    }

}

class MyOwnThread2 implements Runnable {
    public void run() {
            System.out.println(
                    Thread.currentThread().getName() +
                            ": Thread " +
                            Thread.currentThread().getName() +
                            " running"
            );
            System.out.println(
                    Thread.currentThread().getName() +
                            ": ID " +
                            Thread.currentThread().getId()
            );
        System.out.println(
                Thread.currentThread().getName() +
                        ": Priority " +
                        Thread.currentThread().getPriority()
        );
    }
}