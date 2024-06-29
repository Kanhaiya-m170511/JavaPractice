package com.learn.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1. Write a Java program to create an array list,
 * add some colors (strings) and print out the collection.
 */
/*
2. Write a Java program to iterate through all elements in an array list.
 */
public class StringList {
    public static void main(String[] args){

//        List<String> colorList = new ArrayList<>();
//
//        colorList.add("RED");
//        colorList.add("GREEN");
//        colorList.add("BLUE");
//
//        System.out.println(colorList);
//
//        for(int i = 0; i < colorList.size(); i++){
//            System.out.print(colorList.get(i)+" ");
//        }
//        // Enhanced For loop
//
//        for(String color : colorList){
//            System.out.print(color+" - ");
//        }
//        System.out.println();
//
//        // Using Iterator
//
//        Iterator<String> it = colorList.iterator();
//        while (it.hasNext()){
//            System.out.print(it.next()+" -- ");
//        }
//        System.out.println();
//
//        // Java 1.8 forEach()
//
//        colorList.forEach(color->{System.out.print(color+" --- ");});
//        System.out.println();
//        //colorList.stream().forEachOrdered(System.out::print);


        // Insert at first pos


        List<String> colorList1 = new ArrayList<>();

        System.out.println(colorList1.hashCode());

        insertAtFirst(colorList1,"YELLOW");

        System.out.println(colorList1);


        Iterator<String> listIt = colorList1.listIterator();










//        while(listIt.hasNext()){
//            System.out.print(listIt.next()+" ");
//        }
//        System.out.println();
//
//        System.out.println(getElementFromSpecificIndex(colorList,4));

    }

    /*
    3. Write a Java method to insert an element into the array list
        at the first position.
     */

    public static void  insertAtFirst(List<String> list, String key){

        //list = new ArrayList<>();
//        if(list == null) {
//            list = new ArrayList<>();
//            System.out.println(list.hashCode());
//        }

        list.add(key);
    }

    /*
    4. Write a Java program to retrieve an element (at a specified index) from a given array list.
     */
    public static  String getElementFromSpecificIndex(List<String> list, int i){
        if(list == null){
            return "";
        }
        if(list.size() > i)
            return list.get(i);
        return "IndexOutOfBound";
    }
    /*
    5. Write a Java program to update an array element by the given element.
     */
    public void  updateList(List<String> list, int idx, String s){
       list.set(idx,s);
    }
}
