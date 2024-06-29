package com.learn.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();
        payments.add(new Payment(100,"CREDIT"));
        payments.add(new Payment(101,"DEBIT"));

        payments.add(new Payment(101,"CREDIT"));

        payments.add(new Payment(110,"CREDIT"));

        payments.forEach(System.out::print);
        Collections.sort(payments);
        System.out.println();
        payments.forEach(System.out::print);
        //System.out.print(payments);

        Arrays.stream(new int[]{1,23,4}).min().getAsInt();

    }
}

class Payment implements Comparable<Payment>{
    protected Integer amount;
    protected String type;
    Payment(Integer amount, String type){
        this.amount = amount;
        this.type = type;
    }
    public String toString(){
        return amount+" "+type+"\n";
    }

    @Override
    public int compareTo(Payment p) {
        if(p.amount - this.amount == 0){
            return type.compareTo(p.type);
        }
        return   p.amount - this.amount;
    }
}