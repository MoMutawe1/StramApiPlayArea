package com.java8.functionalinterface.predefinedfunction;

import java.util.function.Predicate;

// Joining Predicates - AND / OR / Negate
public class PredicateDemo2 {
    public static void main(String[] args) {

        // predicate1 - checks for even numbers
        // predicate2 - checks if value greater than 50

        int[] arr = {0, 13, 24, 82, 105, 7, 202, 5};
        Predicate<int[]> myArr = val -> {
            boolean flag = false;
            for (int counter = 0; counter < val.length; counter++) {
                if (val[counter]%2==0 && val[counter]>50) {
                    System.out.println(val[counter]);
                    flag = true;
                }
            }
            return flag;
        };


        if(myArr.test(arr))
            System.out.println("Array myArr has some even numbers which is greater than 50");
        else
            System.out.println("Array myArr doesn't has any even numbers which is greater than 50");
    }
}
