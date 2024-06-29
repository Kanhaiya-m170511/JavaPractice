package com.learn.recusion;
/*
3. Write a Java recursive method to calculate the nth Fibonacci number.
 */
public class Fibonacci {
    public int getNthFibonacci(int n){
        if(n <= 1)return n;
        return getNthFibonacci(n-1)+getNthFibonacci(n-2);

    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().getNthFibonacci(5));
    }
}
