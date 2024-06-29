package com.learn.basic;

/**
 * 3. Write a Java program to divide two numbers and print them on the screen.
 * Test Data :
 * 50/3
 * Expected Output :
 * 16
 */
public class Divide {
    public int divide(int a, int b){
        return (a/b);
    }
    public static void main(String[] args) {
        System.out.println(new Divide().divide(3,2));
    }
}
