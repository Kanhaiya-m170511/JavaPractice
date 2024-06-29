package com.learn.oop.encapsulation;
/*
1. Write a Java program to create a class called Person with private instance variables name, age. and country.
Provide public getter and setter methods to access and modify these variables.


 */
public class Person {
    private String name;
    private Integer age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString(){
        return this.name +" "+this.age+" "+this.country;
    }
}

class Test{
    public static void main(String[] args) {
        Person p = new Person();
        //p.setName("Kanhaiya");
        System.out.println(p);
    }
}