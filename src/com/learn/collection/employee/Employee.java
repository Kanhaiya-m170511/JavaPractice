package com.learn.collection.employee;

import java.util.Comparator;

public class Employee  implements Comparable {
    private String  id;
    private String name;
    public Employee(){}
    public Employee(String id, String name){
        this.id = id;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return this.id+"-"+this.name+"\n";
    }

    @Override
    public int compareTo(Object o) {
        Employee emp = (Employee) o;
        return this.getName().compareTo(emp.getName());
    }


//    @Override
//    public int compare(Object o1, Object o2) {
//        Employee employee1 = (Employee) o1;
//        Employee employee2 = (Employee) o2;
//        return employee2.getId().compareTo(employee1.getId());
//    }

    public void abc(){
        StringBuilder sb = new StringBuilder();
        sb.append(1);
       sb.deleteCharAt(sb.length()-1);
    }

}
