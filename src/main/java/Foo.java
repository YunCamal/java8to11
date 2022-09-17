
import me.whiteship.java8to11.RunSomething;

import java.util.function.*;

public class Foo {

//    public static void main(String[] args) {
//        // 만약 외부의 값을 참조할경우 퓨어한 값이 아니다. 순수한 함수(함수 내부의 값)라고 보기 어렵다.
//
//
//          // 익명 내부 클래스 annoymous inner class
////          final int baseNumber = 10; // 참조는 되지만 변경은 안된다.  final이 생략되어 있다.
//
//
////        RunSomething runSomething = new RunSomething() {
////            @Override
////            public void doIt() {
////                System.out.println("Hello");
////            }
////        };
//
//        // alt + Enter 누르면 람다로 자동으로 변환해준다.(위랑 같은 식)
////        RunSomething runSomething = (number) -> {
////            //System.out.println("Hello");
////            return number + 10;
////        };
////
////            System.out.println(runSomething.doIt(1));
////            System.out.println(runSomething.doIt(1));
////            System.out.println(runSomething.doIt(1));
////
////            System.out.println(runSomething.doIt(2));
////            System.out.println(runSomething.doIt(2));
////            System.out.println(runSomething.doIt(2));
//
//        // 이 버전은 일반적인 자바 호출
////        Plus10 plus10 = new Plus10();
//
//        // 1.8에선 람다함수로 사용할 수 있다.
////        Function<Integer, Integer> plus10 = (i) -> i + 10;
////        Function<Integer, Integer> multiply2 = (i) -> i * 2;
//
////        System.out.println(plus10.apply(1));
////        System.out.println(multiply2.apply(1));
////        System.out.println(plus10.compose(multiply2));
//
//        // Function<T,U> =>   고차 함수(High-Order Function)
////        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
////        System.out.println(multiply2AndPlus10.apply(2));
////
////        System.out.println(plus10.andThen(multiply2).apply(2));
//
//        //  Consumer<T> =>   T 타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스
////        Consumer<Integer> printT = (i) -> System.out.println(i);
////        printT.accept(10);
//
//        // Supplier<T> => 인자값을 받지 않고  T타입의 값을 제공하는 함수 인터페이스
////        Supplier<Integer> get10 = () -> 10;
////        System.out.println(get10);
//
//        // Predicate<T> =>    T 타입의 값을 받아서 true, false를 제공해주는 함수 인터페이스 (조합가능)
////        Predicate<String> startWithKeesun = (s) -> s.startsWith("keesun");
////        Predicate<Integer> isEven = (i) -> i%2 == 0;
//
//        // UnaryOperator<T> => 입력값과 결과값이 같으면 UnaryOperator를 쓴다. Function<T,R> -> UnaryOperator<T>
////        UnaryOperator<Integer> plus10 = (i) -> i +10;
//
//        // BinaryOperator<T> => 입력값1,입력값2 결과값이 3개가 같으면 BinaryOperator를 쓴다. BiFunction<T,T,T> -> BinaryOperator<T>
////        BinaryOperator<Integer> plus100 = (i,ii) -> i +10;
//
//        Foo foo = new Foo();
//        foo.run();
//    }

    private void run(){
        // 캡처기능을 사용할 수 있다.
        // final을 써야지 익명함수로 사용할 수 있다.
        // final을 쓰지 않아도 변경사항이 없으면 사실상 final이기 때문에 final을 생략할  수 있고, 다른 함수에서 참조해서 쓸 수 있다.
        final int baseNumber = 10;

//        class LocalClass {
//            void printBaseNumber(){
//                // 이게 로컬클래스
//            }
//        }


//        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                // 이게 익명클래스
//                System.out.println(baseNumber);
//            }
//        }
        
        
        // 람다
        // 람다가 위에 2개 클래스랑 다른 점 : 람다는 스콥을 따로 먹지 않고 run()메소드랑 같은 라인에 있다.(따라서 baseNumber 재정의 불가능)
        // 참조하는 함수가 expected final 이여야 한다.
//        IntConsumer printInt  = (i) -> {
//            System.out.println(i);
//        };
//
//        printInt.accept(10);


    }
}
