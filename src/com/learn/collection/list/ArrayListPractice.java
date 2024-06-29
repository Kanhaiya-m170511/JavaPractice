package com.learn.collection.list;

import java.util.*;
import java.util.function.Predicate;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(9);
        list.add(80);
        list.add(91);
        list.add(1);

        list.set(3,99);
        list.add(3,80);
        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer % 2==0)
                    return true;
                return false;
            }
        };
        list.stream().filter(p).anyMatch(p);
        Object arr[]= list.toArray();

        list.sort((o1,o2)->{
                return o2.compareTo(o1);
        });

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        ListIterator<Integer> it1 = list.listIterator();
        while(it1.hasNext()){
            it1.next();
        }
        System.out.println(list);
    }
}
