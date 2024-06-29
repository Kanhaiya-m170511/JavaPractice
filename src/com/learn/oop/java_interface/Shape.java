package com.learn.oop.java_interface;

/*
1. Write a Java program to create an interface Shape with the getArea() method.
Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
Implement the getArea() method for each of the three classes.

 */
public interface Shape {
    public int getArea();
}
class Rectangle implements Shape{
    private Integer l;
    private Integer b;
    public int getArea(){
        return l*b;
    }

}
class Circle implements Shape{
    private Integer r;
    public int getArea(){
        return (int)(2*Math.PI*r);
    }

}
class Triangle implements Shape{
    public int getArea(){
        return 0;
    }
}
