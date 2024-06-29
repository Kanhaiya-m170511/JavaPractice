package com.learn.oop.overloading;

public class MethodOverloading {

    public void getSum(int x){
        System.out.println(x+10);
        return;
    }
    public void getSum(int x, int y){
        System.out.println(x+10+y);
    }
    public void getSum(double x, int y){

    }

    public int getSum(double x, double y){
        return (int) (x+10);
    }

    public static void main(String[] args) {

    }
}
