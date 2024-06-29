package com.learn.oop.polymorphism.shape;

import java.util.ArrayList;
import java.util.List;

public interface Shape {
    String name();
}
class Circle implements Shape{
    @Override
    public String name(){
        return "Circle";
    }
}

class Rectangle implements Shape{
    @Override
    public String name(){
        return "Rectangle";
    }
}
abstract class Triangle implements Shape{}


class Test{
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle(){
            @Override
            public String name(){
                return "Triangle";
            }
        });
        for(Shape shape : shapes){
            System.out.println(shape.name());
        }
    }
}