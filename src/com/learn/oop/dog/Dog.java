package com.learn.oop.dog;

/**
 * 2. Write a Java program to create a class called "Dog" with a name and breed attribute.
 * Create two instances of the "Dog" class,
 * set their attributes using the constructor and modify
 * the attributes using the setter methods and print the updated values.
 */
public class Dog {
    private String name;
    private String breed;
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }

}

class Test{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tommy","Indian");
        Dog dog2 = new Dog("Doggy","Ladhs");

        dog2.setBreed("Jerman Shephard");

        System.out.println(dog2.getName()+" "+dog2.getBreed());
    }
}
