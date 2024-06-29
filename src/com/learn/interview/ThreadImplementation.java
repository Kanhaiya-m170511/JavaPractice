package com.learn.interview;
//•If there is an infinite numbers
// coming from a stream (can have duplicates ranging from [1-5])
// and have 5 threads to process them, how will you ensure the same thread process the same number -
//
// If a number is executed by Thread 1 suppose,
// then it shd again gets executed by same thread


import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ThreadImplementation {
    public static void main(String[] args) {

        int[] arr={1,2,3,5,4,2,1,2,3,4,4,5,5};

        Arrays.stream(arr).max().getAsInt();
        Queue<Integer> queue = new LinkedList<>();
        queue.remove(0);

        UserThreadStream userThread = new UserThreadStream(arr);

        Thread thread1 = new Thread(userThread);
        thread1.setName("1");
        thread1.start();
        Thread thread2 = new Thread(userThread);
        thread2.setName("2");
        thread2.start();
        Thread thread3 = new Thread(userThread);
        thread3.setName("3");
        thread3.start();
        Thread thread4 = new Thread(userThread);
        thread4.setName("4");
        thread4.start();
        Thread thread5 = new Thread(userThread);
        thread5.setName("5");
        thread5.start();
    }

}

class UserThreadStream implements Runnable{
    static int[] arr;
    public UserThreadStream(int[] a){
        arr = a;
    }

    public void executeSameNumberAsThreadName(int x){
        String threadName = Thread.currentThread().getName();
        if(threadName.equals(String.valueOf(x))){
            System.out.println("Processing Number "+x+" with same name "+threadName);
        }
    }

    @Override
    public void run() {
        for(int i = 0; i < arr.length; i++) {
            executeSameNumberAsThreadName(arr[i]);
        }
    }
}
