package com.learn.multithreading;

public class UserThreadImplementsRunnable {

    public static class UserThread implements Runnable{

        public void run(){
            System.out.println("Runnable Thread started");
            System.out.println("Runnable Thread finished");
        }
    }

    public static void main(String[] args) {
        UserThread userThread = new UserThread();
        Thread thread = new Thread(userThread);
        thread.start();

    }
}
