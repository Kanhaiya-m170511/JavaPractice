package com.learn.oop.abstraction.animal;
/*

1. Write a Java program to create an abstract class Animal with an abstract method called sound().
Create subclasses Lion and Tiger that extend the Animal class
and implement the sound() method to make a specific sound for each animal.

 */

/*
4. Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.

 */
public abstract class Animal {
    public abstract void sound();
    public abstract void eat();
    public abstract void sleep();
}
class Lion extends Animal{

    @Override
    public void sound() {
        System.out.println("Lion roars!");

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}

class Tiger extends Animal{

    @Override
    public void sound() {
        System.out.println("Tiger growls!");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}

abstract class Deer extends Animal{

  public abstract void sound();

    @Override
    public void eat() {
        System.out.println(" Deer Eating ....");

    }

    @Override
    public void sleep() {

    }
}

class Test{
    public static void main(String[] args) {
        Animal animal = new Tiger();
        animal.sound();
        animal = new Lion();
        animal.sound();

        Animal t = (Animal) animal;
        t.sound();
        Deer d = new Deer() {
            @Override
            public void sound() {

            }
        };
        d.eat();
    }
}
