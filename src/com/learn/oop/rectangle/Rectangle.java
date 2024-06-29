package com.learn.oop.rectangle;

/**
 * 3. Write a Java program to create a class
 * called "Rectangle" with width and height attributes.
 * Calculate the area and perimeter of the rectangle.
 */
public class Rectangle {
    private Integer width;
    private Integer height;

    public Rectangle(Integer width, Integer height){
        this.width = width;
        this.height = height;
    }

    public Integer calculatePerimeter(){
        return (this.height+this.width)*2;
    }
    public Integer calculateArea(){
        return this.height*this.width;
    }
}

class Test{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,2);
        System.out.println(r.calculateArea());
        System.out.println(r.calculatePerimeter());
    }
}