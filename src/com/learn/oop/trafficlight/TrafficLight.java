package com.learn.oop.trafficlight;

/**
 * 8. Write a Java program to create class called "TrafficLight"
 * with attributes for color and duration,
 * and methods to change the color and check for red or green.
 */
public class TrafficLight {
    private String color;
    private Double duration;

    public TrafficLight(String color, Double duration){
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String color){
        this.color = color;
    }
    public boolean isRed(){
        return this.color.equals("RED");
    }
    public boolean isGreen(){
        return this.color.equals("GREEN");
    }
}

class Test{
    public static void main(String[] args) {
        TrafficLight tf = new TrafficLight("RED",1.00);
        if(tf.isGreen()){
            System.out.println("GO Green......");
        } else{
            System.out.println("Wait for few sec ......");
            tf.changeColor("GREEN");
        }


    }
}