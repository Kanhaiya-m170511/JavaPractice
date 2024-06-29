package com.learn.multithreading;

public class UserThreadRunnableLambdaExp {
    public static void main(String[] args) throws Exception{
        Runnable runnable = ()->{
            // Getting Thread Reference and printing Name
            String thName = Thread.currentThread().getName();
            System.out.println("Thread Name "+ thName);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }

        };
        Thread th1 = new Thread(runnable,"Th-1");
        th1.start();
        Thread th2 = new Thread(runnable,"Th-2");
        th2.start();
    }


}
