package com.learn.collection.employee;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Employee em;
        List<Employee> empList = new LinkedList<>();
        em = new Employee("1235","Kanhaiya");
        empList.add(em);
        em = new Employee("1234","Kanhaiya");
        empList.add(em);
        em = new Employee("1236","Ral");
        empList.add(em);
        em = new Employee("1237","Lam");
        empList.add(em);

        Collections.sort(empList);
        System.out.println(empList);

    }
}
