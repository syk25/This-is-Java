package ch09.sec04.exam01;

public class A {
    A(){
        class B{} // 생성자 내에서 클래스 선언 -> 로컬클래스

        B b = new B();
    }
    void method(){
        class B {} // 메서드 내에서 클래스 선언 -> 로컬클래스

        B b = new B();
    }
    // 로컬클래스의 스코프는 소속 된 코드블럭이다.
}
