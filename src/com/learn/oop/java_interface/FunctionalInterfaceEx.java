package com.learn.oop.java_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
public interface FunctionalInterfaceEx {
    void getX() ;

}
class Implements {
    public static void main(String[] args) {
        FunctionalInterfaceEx x = ()->
            System.out.println("Hii");

        x.getX();

        Consumer<Integer> Y = (y)->{
            System.out.println(y);
        };
        Y.accept(10);

        Supplier supplier= ()->{
            return 0;
        };
        System.out.println(supplier.get());

        Predicate<Integer> predicate= (p)->p %2 == 0 ;

        List<Integer> xxx = Arrays.asList(1,2,34,5,90).stream().filter(predicate).toList();
        System.out.println(xxx);
    }
}
