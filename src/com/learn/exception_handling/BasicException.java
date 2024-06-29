package com.learn.exception_handling;

import java.util.LinkedList;
import java.util.List;

/*
1. Write a Java program that throws an exception and catch it using a try-catch block.


 */
public class BasicException {
    public int divide(int a, int b){
        try {
            return a/b;
        } catch (Exception e){
            System.out.println("Exception occurs while dividing");
        }
        return -1;
    }
    /*
    2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

     */
    public int throwExceptionIfOdd(int n){
        try {
            if(n % 2 != 0)
                throw new Exception();
        } catch (Exception e){
            System.out.println("Given Integer is Odd");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(new BasicException().divide(2,1));
        System.out.println(new BasicException().divide(2,0));
        System.out.println(new BasicException().throwExceptionIfOdd(3));

        List<Integer> list = new LinkedList<>();


    }
}
