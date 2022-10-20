package com.java8.functionalinterface.predefinedfunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// This is a demo for the Pre-Defined Functional Interface (Function) which has a single abstract boolean method called apply().
// It returns a single value of any type, It takes one parameter only.
public class FunctionDemo1 {
    public static void main(String[] args) {
        // Function<Integer,Integer> first argument represent the input type or the parameter type, second argument represent the return type.
        Function<Integer,Integer> function = n -> n*n;
        int result = function.apply(3);
        System.out.println(result);

        Function<String, Integer> fn = str->str.length();
        int length = fn.apply("welcome");
        System.out.println("Text length = " + length);

        Students obj = new Students("Maryam", 5589);
        Function<Students, String> studentFn = val -> {
             System.out.println("Student Id: " + val.studentId + ", Student Name: " + val.studentName);
             return val.studentName;
        };

        String info = studentFn.apply(obj);
        System.out.println(info);

        List<Books> books = new ArrayList<>();
        books.add(new Books(101, "C++"));
        books.add(new Books(102, "Object Oriented Programming"));
        books.add(new Books(103, "Data Structures"));

        Function<List<Books>, Integer> bookFn = val -> {
            for(Books index: val){
                if(!val.isEmpty())
                    System.out.println(index.bookId + " " + index.bookName);
            }
            return val.size();
        };
        int booksNum = bookFn.apply(books);
        System.out.println("Books Number: " + booksNum);
    }
}


class Students {
    String studentName;
    int studentId;

    Students(String name, int id){
        this.studentName = name;
        this.studentId = id;
    }
}

class Books {
    int bookId;
    String bookName;
    Books(int id, String name){
        this.bookId = id;
        this.bookName = name;
    }
}