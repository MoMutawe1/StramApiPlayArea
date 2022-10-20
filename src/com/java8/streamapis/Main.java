package com.java8.streamapis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //printWithoutStreamsApi();
        //printWithStreamsApi();
        //printNotNullValues();
        //laptopList();
        //toUpperCaseNoStreams();
        //toUpperCaseStreams();
        //printLength();
        // printLengthStreamApi();
        filterEmpWithMap();
    }

    public static void printWithoutStreamsApi(){
        // print elements without streams
        List<Integer> myList = Arrays.asList(12,23,34,55,40);
        for(int i: myList){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        // Print even elements without streams
        for(int i: myList)
            if(i%2==0)
                System.out.print(i + " ");
    }

    public static void printWithStreamsApi(){
        List<Integer> myList = Arrays.asList(12,23,34,55,40);
        List<Integer> evenNumberList;

        evenNumberList=myList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.print(evenNumberList+" ");

        System.out.println();
        myList.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));

        System.out.println();
        System.out.println();
        myList.stream().filter(n->n%2==0).forEach(System.out::println);
    }

    public static void printNotNullValues(){
        List<String> myList = Arrays.asList("one", "two", null, "three", null, "four");
        List notNullList = myList.stream().filter(w->w!=null).collect(Collectors.toList());
        System.out.println(notNullList);
    }

    public static void laptopList(){
        List<Item> items = new ArrayList<>();
        items.add(new Item(1,"Mac Laptop", 3000.0));
        items.add(new Item(2, "Windows Laptop", 2450.0));
        items.add(new Item(3, "HP Laptop", 1600.0));

        items.stream()
                .filter(i->i.price<2500)
                .forEach(pr->System.out.println(pr.price));
    }

    public static void toUpperCaseNoStreams(){
        List<String> myList = Arrays.asList("one", "two", "three", "four", "five", "Six");
        List<String> toUpper = new ArrayList<>();

        for(int i=0; i<myList.size(); i++){
            toUpper.add(myList.get(i).toUpperCase());
        }
        for(String i: toUpper)
            System.out.print(i + " ");

    }

    public static void toUpperCaseStreams(){
        List<String> myList = Arrays.asList("one", "two", "three", "four", "five", "Six");
        List<String> toUpper = myList.stream().map(m->m.toUpperCase()).collect(Collectors.toList());

        for(String i: toUpper)
            System.out.print(i + " ");
    }

    public static void printLengthStreamApi(){
        List<String> vehicles = Arrays.asList("bus", "car", "boat", "bicycle", "flight", "train");
        vehicles.stream().map(m->m.length()).forEach(System.out::println);
    }

    public static void printLength(){
        List<String> vehicles = Arrays.asList("bus", "car", "boat", "bicycle", "flight", "train");
        for(String i: vehicles)
            System.out.println(i + " : " + i.length());
    }

    public static void filterEmpWithMap(){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101, "Tarek", 40000));
        emp.add(new Employee(102, "Omar", 30000));
        emp.add(new Employee(103, "Sa'ad", 50000));

        List<Integer> empList = emp.stream().filter(e->e.empSalary>40000).map(m->m.empSalary).collect(Collectors.toList());
        System.out.println(empList);
    }
}

class Item{
    int id;
    String itemName;
    double price;

    Item(int id, String name, double price){
        this.id = id;
        this.itemName = name;
        this.price = price;
    }
}

class Employee{
    int empId;
    String empName;
    int empSalary;

    Employee(int id, String name, int salary){
        this.empId = id;
        this.empName = name;
        this.empSalary = salary;
    }
}
