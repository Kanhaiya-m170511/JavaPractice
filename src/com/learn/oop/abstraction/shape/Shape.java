package com.learn.oop.abstraction.shape;

/*
2. Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.

 */
public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape {
    public int radius;

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}

class Triangle extends Shape {
    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}