package com.java8.functionalinterface.predefinedfunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// Consumer interface just consume vales and print them, it doesn't return any values.
//Consumer<T>
//Consumer Interface has single abstract method called accept()
public class ConsumerClass {
    public static void main(String[] args) {

        List<Programmers> programmers = new ArrayList<>();
        programmers.add(new Programmers("Mo", 982975492, "Male"));
        programmers.add(new Programmers("Suna", 2837429, "Female"));
        programmers.add(new Programmers("Temo", 900000, "Male"));
        programmers.add(new Programmers("Meme", 900000, "Female"));

        //Function
        Function<Programmers, Integer> f = val -> (val.salary*10)/100;
        //Predicate
        Predicate<Integer> p = val -> val >= 90000;
        //Consumer
        Consumer<Programmers> c = val -> {
            System.out.println(val.name);
            System.out.println(val.salary);
            System.out.println(val.gender);
        };
        for(Programmers pr: programmers){
            int bonus=f.apply(pr);  // calculate bonus
            if(p.test(bonus)){  // invoked Predicate
                c.accept(pr);  // invoked consumer
                System.out.println("bonus: "+bonus);
            }
        }
    }
}


class Programmers {
    String name;
    int salary;
    String gender;

    public Programmers(String name, int salary, String gender){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }
}
