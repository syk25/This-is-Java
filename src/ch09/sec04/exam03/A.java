package ch09.sec04.exam03;

public class A {
    public void method1(int arg) {

        int var = 1;

        class B {
            void method2() {
                System.out.println("arg = " + arg);
                System.out.println("var = " + var);

//            var = 3; // 로컬클래스에서 로컬변수 사용 시 로컬변수는 final로 자동 선언 됨
//            arg = 4; //
            }
        }
        B b = new B();
        b.method2();

//        var = 3;
//        arg = 4;
    }
}
