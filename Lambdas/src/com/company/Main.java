package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        new Thread(() -> System.out.println("Printing from the Runnable")).start();

//        new Thread(() -> {
//            System.out.println("Printing from the Runnable");
//            System.out.println("Line 2");
//            System.out.format("This is line %d\n", 3);
//        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee tony = new Employee("Tony Baloney", 22);
        Employee tom = new Employee("Tom Sanders", 23);
        Employee snow = new Employee("President Snow", 60);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tony);
        employees.add(tom);
        employees.add(snow);

////        Collections.sort(employees, new Comparator<Employee>() {
////            @Override
////            public int compare(Employee employee1, Employee employee2) {
////                return employee1.getName().compareTo(employee2.getName());
////            }
////        });
//
////        Collections.sort(employees, (Employee employee1, Employee employee2) ->
////                employee1.getName().compareTo(employee2.getName()));
//
//        Collections.sort(employees, (employee1, employee2) ->
//                employee1.getName().compareTo(employee2.getName()));
//
//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//        }
//
////        String testString = doStringStuff(new UpperConcat() {
////            @Override
////            public String upperAndConcat(String s1, String s2) {
////                return s1.toUpperCase() + s2.toUpperCase();
////            }
////        }, employees.get(0).getName(), employees.get(1).getName());
////        System.out.println(testString);
//
//        UpperConcat uc = (s1, s2) -> {
//            String result = s1.toUpperCase() + s2.toUpperCase();
//            return result;
//        };
//        String testString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(testString);
//    }

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
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

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething() {
//        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The anonymous class's name is: " + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2");

//        UpperConcat uc = (s1, s2) -> {
//            System.out.println("The lambda expression's class is " + getClass().getSimpleName());
//            String result = s1.toUpperCase() + s2.toUpperCase();
//            return result;
//        };

        int i = 0;
//        {
//            UpperConcat uc = new UpperConcat() {
//                @Override
//                public String upperAndConcat(String s1, String s2) {
//                    System.out.println("i (within anonymous class) = " + i);
//                    return s1.toUpperCase() + s2.toUpperCase();
//                }
//            };
//
//            System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
////            i++;
//            System.out.println("i = " + i);
//            return Main.doStringStuff(uc, "String1", "String2");
//        }

        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expression's class is " + getClass().getSimpleName());
            System.out.println("i in the lambda expression = " + i);
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");

//        System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
//        return Main.doStringStuff(uc, "String1", "String2");
    }

    public void printValue() {
        int number = 25;
        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value is + " + number);
        };

        new Thread(r).start();
    }
}