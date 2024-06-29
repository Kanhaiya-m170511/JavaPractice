package com.learn.basic;

/**
 * 2. Write a Java program to print the sum of two numbers.
 * Test Data:
 * 74 + 36
 * Expected Output :
 * 110
 */
public class Sum {
    public Integer sum(Integer a, Integer b){
        return Math.addExact(a,b);
    }

    public static void main(String[] args) {
        System.out.println(new Sum().sum(2,4));
    }
}
