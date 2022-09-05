import me.whiteship.java8to11.RunSomething;

public class Foo {

    public static void main(String[] args) {
        // 만약 외부의 값을 참조할경우 퓨어한 값이 아니다. 순수한 함수(함수 내부의 값)라고 보기 어렵다.


          // 익명 내부 클래스 annoymous inner class
          final int baseNumber = 10; // 참조는 되지만 변경은 안된다.  final이 생략되어 있다.

//        RunSomething runSomething = new RunSomething() {
//            @Override
//            public void doIt() {
//                System.out.println("Hello");
//            }
//        };

        // alt + Enter 누르면 람다로 자동으로 변환해준다.(위랑 같은 식)
        RunSomething runSomething = (number) -> {
            //System.out.println("Hello");
            return number + 10;
        };

            System.out.println(runSomething.doIt(1));
            System.out.println(runSomething.doIt(1));
            System.out.println(runSomething.doIt(1));

            System.out.println(runSomething.doIt(2));
            System.out.println(runSomething.doIt(2));
            System.out.println(runSomething.doIt(2));
    }
}
