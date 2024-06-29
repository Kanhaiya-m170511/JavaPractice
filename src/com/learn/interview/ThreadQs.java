package com.learn.interview;

import java.util.concurrent.atomic.AtomicInteger;

/*
Increment a counter using multiple threads
increment till 1000.

10 threads

 */
public class ThreadQs {
    public static void main(String[] args) throws Exception {
        UserThread ut = new UserThread();
        Thread  th1 = new Thread(ut);
        th1.start();
        Thread  th2 = new Thread(ut);
        th2.start();
        Thread  th3 = new Thread(ut);
        th3.start();
        Thread  th4 = new Thread(ut);
        th4.start();
        Thread  th5 = new Thread(ut);
        th5.start();
        Thread  th6 = new Thread(ut);
        th6.start();
        Thread  th7 = new Thread(ut);
        th7.start();
        Thread  th8 = new Thread(ut);
        th8.start();
        Thread  th9= new Thread(ut);
        th9.start();
        Thread  th10 = new Thread(ut);
        th10.start();
        Thread.sleep(1000);
        System.out.println(UserThread.counter.get());
    }

}
class UserThread implements Runnable {

    static AtomicInteger counter = new AtomicInteger(0);
    public static void incrementCounter(){
        System.out.println(Thread.currentThread().getName() + ": " + counter.getAndIncrement());

    }

    @Override
    public void run() {
        while (counter.get() < 1000){
            incrementCounter();
        }
    }
}