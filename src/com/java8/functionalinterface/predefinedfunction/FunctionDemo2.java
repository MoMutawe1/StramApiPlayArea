package com.java8.functionalinterface.predefinedfunction;

import java.util.function.Function;

//Function Chaining
//——————————————————
// andThen()
// compose()
public class FunctionDemo2 {
    public static void main(String[] args) {

        Function<Integer, Integer> f1 = val -> val*2;
        Function<Integer, Integer> f2 = val -> val*val*val;

        System.out.println(f1.andThen(f2).apply(4));  // 8   512
        System.out.println(f1.compose(f2).apply(4));  // 64  128
    }
}
