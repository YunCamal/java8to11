package me.whiteship.java8to11;


// 추상메소드
@FunctionalInterface
public interface RunSomething {

    // abstract가 생략되어 있다. 추상메소드는 하나만 선언 할 수 있다.
    int doIt(int number);


    // void doAgain(); // 어기면(추상메소드는 하나만 선언) FunctionalInterface 에러 (java standard library 제공)


    // static 메소드 정의 가능
    static void printName() {
        System.out.println("keesun");
    }

    // default 메소드 정의 가능
    default void printAge() {
        System.out.println("40");
    }
}
