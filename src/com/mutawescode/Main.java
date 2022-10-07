package com.mutawescode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //printWithoutStreamsApi();
        //printWithStreamsApi();
        printNotNullValues();

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
}
