package com.learn.recusion;
/*
8. Write a Java recursive method to count the
number of occurrences of a specific element in an array.
 */
public class CountOccurances {
    public int count(int key, int arr[],int i){
        if(i == arr.length) return 0;
        int x = 0;
        if(arr[i] == key){
          x = 1;
        }
        return x+count(key,arr,i+1);
    }

    public < T > int count(T key, T[] arr, int i){
        if(i == arr.length)
            return 0 ;
        int count = count(key,arr,i+1);
        if(arr[i].equals(key))
            count++;
        return count;
    }
    public static void main(String[] args) {
        System.out.println(new CountOccurances().count(4,new int[]{2,3,4,4,5,5,4,7,4},0));
        Integer[] numbers = {
                10,
                20,
                30,
                40,
                20,
                50,
                20,
                60
        };
        Integer target = 20;
        Integer occurrences = new CountOccurances().count( target,numbers,0);
        System.out.println(occurrences);
    }
}
