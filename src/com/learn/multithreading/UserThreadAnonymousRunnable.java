package com.learn.multithreading;

public class UserThreadAnonymousRunnable {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Runnable started");
                System.out.println("Anonymous Runnable finished");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
