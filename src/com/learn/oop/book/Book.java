package com.learn.oop.book;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Stack;
import java.util.LinkedList;

/**
 * 5. Write a Java program to create a class called "Book"
 * with attributes for title, author, and ISBN,
 * and methods to add and remove books from a collection.
 */
public class Book {
    private String title;
    private String author;
    private String isbn;

    private static ArrayList<Book> books = new ArrayList<>();

    public Book(String title, String author, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public static void addBook(Book book){
        books.add(book);
    }
    public static boolean removeBook(Book book){
        return books.remove(book);
    }
    public static ArrayList<Book> getBooks(){
        return books;
    }

    @Override
    public String toString(){
        return this.title+" "+this.author+" "+this.isbn;
    }

}
class Test{
    public static void main(String[] args) {
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");


        ArrayList<Book> bookCollection = Book.getBooks();

        Book.addBook(book1);
        Book.addBook(book2);

        for(Book b : bookCollection){
            System.out.println(b);
        }

        Book.removeBook(book2);

        for(Book b : bookCollection){
            System.out.println(b);
        }

//        LinkedList<Integer> list = new LinkedList<>();
//        list.add()
    }
}
