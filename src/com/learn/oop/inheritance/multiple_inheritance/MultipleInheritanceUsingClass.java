package com.learn.oop.inheritance.multiple_inheritance;

public class MultipleInheritanceUsingClass {
    public static void main(String[] args){
        Parrot1 p = new Parrot1();
        p.canFly();
    }
}

abstract class Bird{
    public void canFly(){
        System.out.println("I'm Word and can fly");
    }
}
abstract class FlyingBird{
    public void canFly(){
        System.out.println("I'm Flying Word and can fly");
    }
}

class Parrot extends Bird //, FlyingBird
{
    // This class can not resolve which canFly()
    // to call while extending two classes with same method
    // So java, do not Support Multiple Inheritance through classes
    //
    // Not even by abstract classes,
    // bcz abstract classes can have the implementation
    // that is, a class can not extend multiple class
    // when trying to extends two classes together gives -- java: '{' expected
}