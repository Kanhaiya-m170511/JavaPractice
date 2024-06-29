package com.learn.generics.methods;

import java.util.*;

/*
1. Write a Java program to create a generic method that
takes two arrays of the same type and checks if they have the same elements in the same order.


 */
public class GenericMethodExample {
    public static <K extends Object,V extends String> void main(String[] args) {
        Integer[] arr1 = {1,2,3};
        Integer[] arr2 = {2,3,4};

        String[] str1 = {"Hii", "Kanhaiya", "Kumar"};
        String[] str2 = {"Hii", "Kanhaiya", "Kumar"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(checkIfHasSameElements(arr1,arr2));
        System.out.println(checkIfHasSameElements(str1,str2));
        System.out.println(checkIfHasSameElements(arr1,str2));


        //-----------------------------------------------------------

        new GenericMethodExample().getSumOfOddAndEven(List.of(3,4,5,7.90,8,5));
        Integer idx = getIndexOfFirstOcc(List.of("Hii",'C'),"Kan");
        System.out.println(idx);

        //-----------------

        List<K> list = (List<K>) new GenericMethodExample().getReversed(List.of("hii","jello",3));
        System.out.println(list);


        //-------------------------------------

        Map<String,String> map = new HashMap<>();
        Object o = new String("Hii");
        map.put(o.toString(),"Hello");
        new GenericMethodExample().printHash(map);
    }
    public static <T> boolean checkIfHasSameElements(T[] arr1, T[] arr2){
        if (arr1.length != arr2.length)
            return false;
        for(int i = 0; i < arr1.length; i++){
            if(!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }
    /*
    2. Write a Java program to create a generic method that takes a list of numbers
        and returns the sum of all the even and odd numbers.
     */
    public <T extends Number> void getSumOfOddAndEven(List<T> list){
        int oddSum = 0;
        int evenSum = 0;
        for(T number : list){
            if(number.intValue() % 2 == 0){
                evenSum+= number.intValue();
            } else {
                oddSum+= number.intValue();
            }
        }
        System.out.println("Odd Numbers Sum = "+oddSum);
        System.out.println("Even Numbers Sum = "+evenSum);

    }

    /*
    3. Write a Java program to create a generic method that takes a list of any type and a target element.
    It returns the index of the first occurrence of the target element in the list.
    Return -1 if the target element cannot be found.


     */
    public static <T> Integer getIndexOfFirstOcc(List<T> list, T target){
        Integer idx = 0;
        for(T ele : list){
            if(ele.equals(target)){
                return idx;
            }
            idx++;
        }
        return -1;
    }
    /*
    4. Write a Java program to create a generic method
    that takes a list of any type and returns
    it as a new list with the elements in reverse order.
     */
    public <T>  List<T>getReversed(List<T> list){
        List<T> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    /*
    Write a Java program to create a generic method that takes a
    list of any type and a predicate. It returns an array list
    containing only elements that satisfy the predicate.
     */


    /*
    Write a Java program to create a generic method
    that takes a map of any type and prints each key-value pair.
     */
    public <K extends Object,V extends String> void printHash(Map<K,V> map){
        for(Map.Entry<K,V> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
