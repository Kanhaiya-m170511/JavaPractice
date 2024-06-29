package com.learn.oop.employee;

/**
 * 6. Write a Java program to create a class called "Employee"
 * with a name, job title, and salary attributes,
 * and methods to calculate and update salary.
 */

import java.time.LocalDate;
import java.time.Period;


/**
 * 9. Write a Java program to create a class called "Employee" with a name,
 * salary, and hire date attributes, and a method to calculate years of service.
 */
public class Employee {
    private String name;
    private String jobTitle;
    private Double salary;
    private LocalDate hireDate;
    public Employee(){}
    public Employee(String name, String jobTitle, Double salary, LocalDate hireDate){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void updateSalary(Double salary){
        this.salary += salary;
    }
    public void calculateSalary(Double per){
        this.salary += salary * per/100;
    }

    @Override
    public String toString(){
        return this.name+" - "+this.jobTitle+" - "+this.salary+" "+this.calculateYearOfService();
    }

    public Integer calculateYearOfService(){
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
}

class Test{
    public static void main(String[] args) {
        Employee employee = new Employee("Kanha","Sr. Engg",12.03, LocalDate.parse("2020-04-01"));
        System.out.println(employee);
        employee.calculateSalary(50.00);
        System.out.println(employee);

        Employee employee2 = new Employee("Kumar","Eng",21.03, LocalDate.parse("2010-04-01") );
        System.out.println(employee2);
        employee2.calculateSalary(51.00);
        System.out.println(employee2);
    }
}
