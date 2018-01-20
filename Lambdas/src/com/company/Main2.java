package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Employee2 john = new Employee2("John Doe", 30);
        Employee2 tony = new Employee2("Tony Baloney", 22);
        Employee2 tom = new Employee2("Tom Sanders", 23);
        Employee2 snow = new Employee2("President Snow", 60);

        List<Employee2> employees2 = new ArrayList<>();
        employees2.add(john);
        employees2.add(tony);
        employees2.add(tom);
        employees2.add(snow);

//        for (Employee2 employee2 : employees2) {
//            System.out.println(employee2.getName());
//            System.out.println(employee2.getAge());
////            new Thread(() -> System.out.println(employee2.getAge())).start();
//        }

        employees2.forEach(employee2 -> {
            System.out.println(employee2.getName());
            System.out.println(employee2.getAge());
        });

//        System.out.println("====================================================");
//
//        for (int i = 0; i < employees2.size(); i++) {
//            Employee2 employee2 = employees2.get(i);
//            System.out.println(employee2.getName());
//            new Thread(() -> System.out.println(employee2.getAge())).start();
//        }
    }
}

class Employee2 {
    private String name;
    private int age;

    public Employee2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}