package com.learn.oop.abstraction.vehical;
/*
7. Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine().
Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.

 */
public abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();

}
