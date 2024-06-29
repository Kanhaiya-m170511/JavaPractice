package com.learn.recusion;
/*
10. Write a Java recursive method to find the length of a given string.
 */
public class StringRec {
    public int len(String s,int i){
        if(s.length() == i)return 0;
        return 1+len(s,i+1);
    }

    public static void main(String[] args) {
        System.out.println(new StringRec().len("hikanha",0));
    }
}
