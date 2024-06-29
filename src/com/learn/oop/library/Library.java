package com.learn.oop.library;

import com.learn.oop.book.Book;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 11. Write a Java program to create a class called "Library"
 * with a collection of books and methods to add and remove books.
 */
public class Library {
    List<Book> books;
    public Library(){
        books = new LinkedList<>();
    }
    public void addBook(Book b){
        books.add(b);
    }
    public boolean removeBook(Book b){
       return books.remove(b);
    }
    @Override
    public String toString(){
        String s = new String();
        Iterator<Book> it = books.iterator();
        while (it.hasNext()){
            s+=it.next()+"\n";

        }
        return s;
    }
}

class Test{
    public static void main(String[] args) {
        Library lb = new Library();
        Book b = new Book("Java","C. Redd","IS998L");
        lb.addBook(b);
        lb.addBook(new Book("C","R. Reddy","IS990L"));
        System.out.println(lb);
        lb.removeBook(b);
        System.out.println(lb);
    }
}
