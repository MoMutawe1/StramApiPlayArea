package com.java8.functionalinterface.predefinedfunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// This is a demo for the Pre-Defined Functional Interface (Predicate) which has a single abstract boolean method called test().
// Use only if you have a conditional checks in your program, It takes one parameter only.
public class PredicateDemo1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = val -> val>10;
        System.out.println(predicate.test(100));


        Predicate<String> length = len -> len.length()>5;
        System.out.println(length.test("Temo"));


        Employee employee = new Employee("Mo", 1000000, 5);
        Predicate<Employee> emp = val -> {
            if (val.empSalary > 500000 && val.empExperience > 3)
                return true;
            return false;
        };
        if(emp.test(employee)) {
            System.out.println("Yaaay!");
        }

        List<String> myList = Arrays.asList("Java", "Python", "C#", "C++", "C");
        System.out.println();

        for(String index: myList){
            Predicate<String> str = val -> val.startsWith("C");
            if(str.test(index))
                System.out.println(index);
        }
    }
}

class Employee{
    String empName;
    double empSalary;
    int empExperience;

    Employee(String name, double salary, int experience){
        this.empName = name;
        this.empSalary = salary;
        this.empExperience = experience;
    }
}
