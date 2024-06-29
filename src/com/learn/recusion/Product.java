package com.learn.recusion;
/*
13. Write a Java recursive method to calculate the product of all numbers in an array.

 */
public class Product {
    public int product(int[] arr, int i){
        if(arr.length == i)return 1;
        return arr[i]*product(arr,i+1);
    }

    public static void main(String[] args) {
        System.out.println(new Product().product(new int[]{2,3,4,5},0));
    }
}
