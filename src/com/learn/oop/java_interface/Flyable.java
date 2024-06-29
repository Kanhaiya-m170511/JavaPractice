package com.learn.oop.java_interface;
/*
3. Write a Java program to create an interface Flyable with a method called fly_obj().
Create three classes Spacecraft, Airplane,
and Helicopter that implement the Flyable interface.
Implement the fly_obj() method for each of the three classes.
 */
public interface Flyable {
    public void fly_obj();
}
class Spacecraft implements Flyable{
    public void fly_obj(){

    }
}
