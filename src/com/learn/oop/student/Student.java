package com.learn.oop.student;

import java.util.LinkedList;
import java.util.List;

/**
 * 10. Write a Java program to create a class called "Student" with a name,
 * grade, and courses attributes, and methods to add and remove courses.
 */
public class Student {
    private String name;
    private String rollNo;
    private String grade;
    private List<Course> courses;

    public Student(){
        courses = new LinkedList<>();
    }
    public Student(String name, String rollNo, String marks,List<Course> courses) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = marks;
        this.courses = courses;
    }

    public void addCourses(Course c){
        if(courses == null)
            courses = new LinkedList<>();
        courses.add(c);
    }

    public boolean removeCourse(Course c){
        if (!courses.contains(c)) return false;
        return courses.remove(c);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return this.rollNo+" - "+this.name+" - "+this.grade+" -- "+this.courses;
    }

}
class Course{
    private String name;
    private String code;
    public Course(String name, String code){
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString(){
        return this.name+" - "+this.code;
    }
}
