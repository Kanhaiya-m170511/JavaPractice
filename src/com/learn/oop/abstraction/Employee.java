package com.learn.oop.abstraction;

/*
5. Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.
 */
public abstract class Employee {
    public abstract double calculateSalary();
    public abstract void displayInfo();

}

class Manager extends Employee{

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public void displayInfo() {

    }
}

class Programmer extends Employee{

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public void displayInfo() {

    }
}
