package com.learn.interview;

/*
Given an array containing n distinct numbers taken from
0, 1, 2, ..., n, find the one that is missing from the array.

Write the algorithm in java

 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr={0,1,2,4,5,6};
        System.out.println(getMissing(arr));

        StringBuilder ss = new StringBuilder();
       ss.insert(0,1);
       ss.insert(0,'x');

       System.out.println(ss);
    }

    public static int getMissing(int[] arr){
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i< n; i++){
            sum +=arr[i];
        }
        int nthNat = n*(n+1)/2;
        return nthNat-sum;
    }
}
