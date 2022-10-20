package com.java8.functionalinterface.predefinedfunction;

import java.util.Date;
import java.util.function.Supplier;

//Supplier Interface does not take any input, but it returns some value.
//Supplier<ReturnType>
//Supplier Interface has single abstract method called get()
public class SupplierClass {
    public static void main(String[] args) {
        Supplier<Date> s = ()->new Date();
        System.out.println(s.get());
    }
}
