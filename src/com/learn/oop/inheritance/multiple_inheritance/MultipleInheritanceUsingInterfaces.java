package com.learn.oop.inheritance.multiple_inheritance;

public class MultipleInheritanceUsingInterfaces {
    public static void main(String[] args){
        FlyingBird1 p = new Parrot1();
        p.canFly();
        p.isBird();

        System.out.println(p instanceof Bird1); // true
        System.out.println(p instanceof FlyingBird1); // true
        System.out.println(p instanceof Parrot1); // true
    }
}

interface Bird1{
    void canFly();
    void isBird();
    Integer x=10;
}
interface FlyingBird1 extends Bird1{
    void canFly();
}

class Parrot1 implements  FlyingBird1
{


    public void canFly(){
        System.out.println("I'm Word and can fly");
    }
    public void isBird(){
        System.out.println("Yes");
    }
    // This class must give implementation of canFly()
    // If canFly() exists in all the implemented interfaces,
    // it will give the implementation to all methods of all interfaces
    // So java, do Support Multiple Inheritance through classes
    //
    // bcz Interfaces do not have the implementation,
    // and the implementing class must provide the implementation,
    // So, JVM can easily figure it out, which method implementation to call
    // that is, a class can not implements multiple interfaces
    // An Interface can extends one or multiple interfaces
    // Extending interface will inherit all the methods of parent interface
    // But not the variables, bcz it by default final and static
    // when trying to extends two classes together gives -- java: '{' expected
}