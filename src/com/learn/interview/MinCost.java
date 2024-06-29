package com.learn.interview;

import java.util.PriorityQueue;

/*
You are given an array A of integers that represent the lengths of ropes.

You need to connect these ropes into one rope. The cost of joining two ropes equals the sum of their lengths.

Find and return the minimum cost to connect these ropes into one rope.

1 <= length of the array <= 100000
1 <= A[i] <= 1000

 A = [1, 2, 3, 4, 5]
  33

 A = [5, 17, 100, 11]
182

 */
public class MinCost {

    public static void main(String[] args) {
        int[] arr= {5, 17, 100, 11};

        System.out.println(getMinCost(arr));
    }
    public  static int getMinCost(int[] arr){
        int cost = 0;

        if(arr.length == 1) return arr[0];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i< arr.length; i++){
            pq.offer(arr[i]);
        }

        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();

            cost+= a+b;
            pq.offer(a+b);
        }
        return cost;
    }

    /*
    There Temple in town, every day people come to pray here.
where all people keep there shoes or sandals outside a temple before going inside,
every day on thief come and steal one of the shoes or sandals of people
there is one police officer assign to check whose shoes or sandle gets stolen and report this every day to police station
Please help police officer to find this

given Days n, each day m people come to temple

Example:

Days = 3, TotalPeople = 3

Day 1 - 3, 3, 4, 5, 5
Day 2 - 7, 8, 8, 10, 10
Day 3 - 2, 2, 3, 3, 7

Report:
4, 7, 7

0<= n*(2*m-1)<=10^6

     */

//Day 1 - 3, 3, 4, 5, 5
//Day 2 - 7, 8, 8, 10, 10
//Day 3 - 2, 2, 3, 3, 7
//Day 4 - 1
//
//    int getMissing(int[] arr){
//        int left = 0, right = arr.length;
//        while (left < right) {
//            int mid = (left+right)/2;
//            if(mid % 2 == 0) {
//                if(mid+1 < arr.length && arr[mid] == arr[mid+1]){
//                    // search in right part
//                } else {
//                    // try to search in  right part
//                }
//            } else {
//                if(mid-1 >= 0 && arr[mid] == arr[mid-1]){
//                    // search in left part
//                } else {
//                    if(mid+1 < arr.length && arr[mid] != arr[mid+1]){
//                       //search in left part
//                    } else {
//                        return arr[mid-1];
//                    }
//                }
//            }
//
//        }
//    }

}
