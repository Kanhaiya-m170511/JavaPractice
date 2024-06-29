package com.learn.multithreading;

public class StopImplementationForThread {
    private boolean isStopped;
    public boolean isStopped(){
        return isStopped;
    }
    public void requestStop(){
        isStopped = true;
    }


    public static void main(String[] args) {
        StopImplementationForThread stop = new StopImplementationForThread();
        Runnable runnable = ()->{
            while(!stop.isStopped()){
                try {
                    Thread.sleep(1000);
                } catch (Exception e){}

                System.out.println("Thread is still running");
            }
            System.out.println("Thread is stopped");

        };
        Thread th = new Thread(runnable);
        th.start();
       // th.stop(); -- Deprecated
        try {
            Thread.sleep(10000);
        } catch (Exception e){}
        stop.requestStop();

    }

}
