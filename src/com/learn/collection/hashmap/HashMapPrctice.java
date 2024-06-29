package com.learn.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrctice {
    public static void main(String[] args) {
        HashMap<Integer,Integer> x = new HashMap<>(6);
        x.put(1,2);
        x.put(2,1);
        x.put(3,12);
        x.put(9,12);
        x.put(0,12);
        x.put(4,5);
        x.put(14,5);
        System.out.println(x);


        for(Map.Entry<Integer,Integer> y : x.entrySet()){
            System.out.println(y.getKey()+" "+y.getValue());
        }


        System.out.println(x.size());
    }

}
