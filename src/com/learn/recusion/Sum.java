package com.learn.recusion;
/*
2. Write a Java recursive method to calculate the sum of all numbers from 1 to n.


 */

/*
9. Write a Java recursive method to find the sum
    of all odd numbers in an array.
 */
public class Sum {
    public int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }

    public int sum(int[] arr, int i){
        if(arr.length == i)return 0;
        int x = sum(arr,i+1);
        if(arr[i] % 2 != 0){
            x += arr[i];
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(new Sum().sum(10));
        System.out.println(new Sum().sum(new int[]{2,3,4,5,6},0));
    }
}
