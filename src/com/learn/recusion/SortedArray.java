package com.learn.recusion;

public class SortedArray {

    public boolean isSorted(int[] arr, int i){
        if(i == arr.length-1)return true;
        if(arr[i] > arr[i+1])return false;
        return isSorted(arr,i+1);
    }

    public static void main(String[] args) {
        System.out.println(new SortedArray().isSorted(new int[]{2,13,4,5},0));
    }
}
