package me.whiteship.java8to11;

public interface Foo {

    void printName();

    /**
    *@implSpec
     * 이 구현체는 대문자로 바꿔줍니다.
    */
    default void printNameUpperCase(){
        System.out.println(getName().toUpperCase());
    }
    static void printAnything(){
        System.out.println("Foo");
    }
    // 디폴트 메시지는 모든 구현체에다 제공하는 방법이라 클래스를 깨트리지 않고 기능을 추가할 수 있다.
    // 하지만 그만큼 리스크가 있어서 문서화(@implSpec) 이라는 자바독 태그를 사용해야 한다.
    // 디폴트가 문제가 되면 재정의해서 쓸수있다.
    // 하지만 toString()이나 이런 object 기본메소드들은 에러가 난다.

    String getName();
}