package com.learn.basic;

/**
 * 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
 * Test Data:
 * Input first number: 25
 * Input second number: 5
 * Expected Output :
 * 25 x 5 = 125
 */
public class Product {
    public long multiply(int a, int b){
        return Math.multiplyFull(a,b);
    }

    public static void main(String[] args) {
        System.out.println(new Product().multiply(3,4));
    }
}
