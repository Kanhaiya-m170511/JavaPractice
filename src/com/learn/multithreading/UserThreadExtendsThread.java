package com.learn.multithreading;

public class UserThreadExtendsThread {
    public static class UserThread extends Thread{
        public void run(){
            System.out.println("UserThread running");
            System.out.println("UserThread finished");
        }
    }

    public static void main(String[] args) {

        UserThread userThread= new UserThread();
        userThread.start();

    }
}
