package me.whiteship.java8to11;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {


//        Foo foo = new DefaultFoo("keesun");
//        foo.printName();
//        foo.printNameUpperCase();
//
//        // Static을 정의하면 아무렇게나 쓸수 있다.
//        Foo.printAnything();


        // 메소드 레퍼런스란 ?  아래와 같이 참조되는 함수에 콜론 두번찍는것을 의미
//        Greeting greeting = new Greeting();
//        UnaryOperator<String> hi = greeting::hello;
//        Supplier<Greeting> newGreeting = Greeting::new;
//        newGreeting.get();
//        Greeting greeting = new Greeting();
//        UnaryOperator<String> hello = greeting::hello;
//        System.out.println(hello.apply("keesun"))
//        Function<String, Greeting> keesunGreeting = Greeting::new;
//        keesunGreeting.apply("keesun");
//        System.out.println();
//        Supplier<Greeting> newGreeting = Greeting::new;


//        Iterable의 기본메소드
//        forEach(), spliterator()

//        Collection의 기본메소드
//        stream() / parallelStream()
//        removeIf(Predicate)
//        spliterator()

//        Comprarator의 기본메소드 및 스태틱 메소드
//        reversed()
//        thenComparing()
//        static reverseOrder() / naturalOrder()
//        static nullsFirst() / nullsLast()
//        static comparing()


        List<String> name = new ArrayList<>();

        name.add("keesun");
        name.add("whiteship");
        name.add("toby");
        name.add("foo");

        name.forEach(System.out::println);

        // 스프린트레이터를 쓰고있는걸 확인할수있다.
        // 자주 쓰이는 함수다.
//        name.stream().map(String::toUpperCase).filter(s->s.startsWith("K")).count();
//
//        name.removeIf(s -> s.startsWith("k"));
//        name.forEach(System.out::println);

//        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
//        name.sort(compareToIgnoreCase.reversed());
//        name.forEach(System.out::println);

        // 예전에는 Abstract 함수를 썼던 이유는 밑에서 구현할때 각각으로 구현할 수도 있고 몇개만 선택해서 구할 수도 있어서 편의성제공을 위해 만들어졌다.
        // 현재는 인터페이스에다 함수를 정의하고 인터페이스를 i mperlments 하게 된다.

    // 으잉? 뒤로 나누어졌네. 오호 순서가 중요하지 않을때 쓰겠죠
//        Spliterator<String> spliterator = name.spliterator();
//        Spliterator<String> spliterator1 = spliterator.trySplit();
//        while (spliterator.tryAdvance(System.out::println));
//        System.out.println("==============================");
//        while (spliterator1.tryAdvance(System.out::println));












    }

}
