package ch09.sec02.exam01;

public class A {
    /**
     * 인스턴스 멤버 클래스와 이를 선언한 클래스 간의 관계*/

    // 인스턴스 멤버 클래스
    class B {} // default 로 선언되어 같은 패키지 내에서만 멤버 클래스 사용 가능

    // 인스턴스 필드값으로 B 객체 대입
    B field = new B();

    // 생성자
    A(){
        B b = new B();
    }

    // 인스턴스 메서드
    void method(){
        B b = new B();
    }
}
