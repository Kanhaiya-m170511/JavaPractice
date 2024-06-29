package com.learn.oop.person;

/**
 *  Write a Java program to create a class called "Person" with a name and age attribute.
 *  Create two instances of the "Person" class, set their attributes using the constructor,
 *  and print their name and age.
 */
public class Person {
    private String name;
    private Integer age;
    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public Integer getAge() {
        return this.age;
    }
}
class Test{
    public static void main(String[] args) {

        Person p1 = new Person("Kanha",33);
        Person p2 = new Person("Kumar",22);
        System.out.println(p1.getName()+" - "+p1.getAge());
        System.out.println(p2.getName()+" - "+p2.getAge());
        int hash = p1.hashCode();
        System.out.println(p1+" "+String.format("%08x", hash));
        //System.out.println(Integer.toString(hash,9).toUpperCase());

    }
}
