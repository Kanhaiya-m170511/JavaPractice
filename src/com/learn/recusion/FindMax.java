package com.learn.recusion;
/*
12. Write a Java recursive method to find the maximum element in an array.
 */
public class FindMax {
    public int getMax(int[] arr, int i){
        if(i == arr.length)return Integer.MIN_VALUE;

        int max = getMax(arr,i+1);

        if(max < arr[i])
            max = arr[i];
        return max;
    }
    public static void main(String[] args) {
        System.out.println(new FindMax().getMax(new int[]{8,90,9},0));
    }
}
