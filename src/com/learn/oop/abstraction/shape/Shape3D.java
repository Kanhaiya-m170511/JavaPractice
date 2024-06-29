package com.learn.oop.abstraction.shape;
/*
6. Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea().
Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape.

 */
public abstract class Shape3D {
    abstract public double calculateVolume();
    abstract public double calculateSurfaceArea();
}
class Sphere extends Shape3D{

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public double calculateSurfaceArea() {
        return 0;
    }
}

class Cube extends Shape3D{

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public double calculateSurfaceArea() {
        return 0;
    }
}
