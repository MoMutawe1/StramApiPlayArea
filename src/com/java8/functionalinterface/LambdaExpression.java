package com.java8.functionalinterface;

@FunctionalInterface  // explicitly defining a functional interface (Optional) - introduced in Java 7
interface I {
    public void call(); // single abstract method
}

interface N{
    public String buy(String x, double y);
}

/*
class C implements I {
    @Override
    public void call() {
        System.out.println("this is just an implementation for call method..");
    }
}
*/

public class LambdaExpression {
    public static void main(String[] args) {
        /*
        // this is a normal way for implementing abstract methods..
        C obj = new C();
        obj.call();

        System.out.println();

        // child class objects can be hold inside parent interface using polymorphism
        I i = new C();
        i.call();
         */

        // using Lambda Expression to implement abstract method from a functional interface
        I i = () -> System.out.println("this is just an implementation for call method using lambda expression..");
        i.call();

        N n = (msg, price) ->{
            String val = msg + price + " USD";
            return val;
        };

        String str = n.buy("buying a mobile phone that cost ", 1300.0);
        System.out.println(str);
    }
}
