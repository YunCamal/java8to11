package me.whiteship.java8to11;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {

        // 메소드 레퍼런스란 ?  아래와 같이 참조되는 함수에 콜론 두번찍는것을 의미
//        Greeting greeting = new Greeting();
//        UnaryOperator<String> hi = greeting::hello;
//        Supplier<Greeting> newGreeting = Greeting::new;
//        newGreeting.get();
//        Greeting greeting = new Greeting();
//        UnaryOperator<String> hello = greeting::hello;
//        System.out.println(hello.apply("keesun"))

        Function<String, Greeting> keesunGreeting = Greeting::new;


        keesunGreeting.apply("keesun");
        System.out.println();
        Supplier<Greeting> newGreeting = Greeting::new;
    }
}
