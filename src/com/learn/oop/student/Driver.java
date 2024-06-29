package com.learn.oop.student;

public class Driver {
    public static void main(String[] args) {
        Student st = new Student("Kanhaiya","M170513","123",null);
        System.out.println(st);
        st.addCourses(new Course("ABC","00001"));
        st.addCourses(new Course("DEF","00002"));
        System.out.println(st);
    }
}
