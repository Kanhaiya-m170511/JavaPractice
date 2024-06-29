package com.learn.recusion;
/*
1. Write a Java recursive method to calculate the factorial of a given positive integer.


 */
public class Factorial {
    public int fact(int n){
        if( n == 0 )return 1;
        return fact(n-1)*n;
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().fact(6));
    }
}
