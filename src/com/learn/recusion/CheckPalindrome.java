package com.learn.recusion;
/*
4. Write a Java recursive method to check if a given string is a palindrome.

 */
public class CheckPalindrome {

    public boolean isPalindrome(char[] str, int f, int l){
        if(str[f] != str[l])return false;
        if(l < f)return true;
        return isPalindrome(str,f+1,l-1);
    }

    public static void main(String[] args) {
        System.out.println(new CheckPalindrome().isPalindrome(new char[]{'a','b','a','a'},0,3));
    }
}
