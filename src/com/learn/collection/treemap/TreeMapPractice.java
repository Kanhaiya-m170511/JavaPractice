package com.learn.collection.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {


    public static void main(String[] args) {
        Map<Integer,String> map = getVal();
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        /*
        2. Write a Java program to copy Tree Map's content to another Tree Map.
         */
        Map<Integer,String > copiedMap = Map.copyOf(map);
        System.out.println();
        for(Map.Entry<Integer,String> entry : copiedMap.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        System.out.println(searchByKey(copiedMap,21));
        System.out.println(searchByValue(copiedMap,"Kanha"));
    }

    /*
        1. Write a Java program to associate the specified
            value with the specified key in a Tree Map.
     */
    public static Map<Integer,String> getVal(){
        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"Red");
        treeMap.put(21,"Green");
        treeMap.put(3,"Yellow");
        treeMap.put(4,"marron");
        return treeMap;
    }

    /*
    4. Write a Java program to search for a value in a Tree Map.
     */

    public static boolean searchByKey(Map<Integer,String> map,Integer key){
       return map.containsKey(key);
    }
    public static boolean searchByValue(Map<Integer,String> map,String value){
        return map.containsValue(value);
    }

}
