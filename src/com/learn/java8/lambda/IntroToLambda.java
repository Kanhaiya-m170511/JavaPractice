package com.learn.java8.lambda;

import com.learn.oop.java_interface.FunctionalInterfaceEx;

public class IntroToLambda {


    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet();
        X hii = (i) ->{
            System.out.println("Hii--"+i);
            int x = i;
            return;
        };
        hii.print(10);
    }
}

interface X{
    void print(int i);
}
class Greeter{
    public void greet(){
        System.out.println("Hii !!!");
    }
}