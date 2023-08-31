package ch09.sec05.exam01;

public class A { // 바깥 클래스
    int field1;
    void method1(){}

    static int field2;
    static void method2(){}

    class B { // 중첩클래스(인스턴스멤버 클래스)
        void method(){
            field1 = 10; // 바깥 클래스의 멤버 접근
            method1(); // 바깥 클래스의 메서드 접근

            field2 = 10; // 바깥 클래스의 정적멤버 접근
            method2(); // 바깥 클래스의 정적 메서드 접근
        }
    }

    static class C{ // 정적 중첩클래스(정적멤버 클래스)
        void method(){
//            field1 = 10; // 바깥 클래스의 멤버 접근 - 정적멤버클래스에서는 인스턴스 멤버 접근 불가
//            method1(); // 바깥 클래스의 메서드 접근 - 정적멤버클래스에서는 인스턴스 메서드 접근 불가

            field2 = 10; // 바깥 클래스의 정적멤버 접근
            method2(); // 바깥 클래스의 정적 메서드 접근
        }
    }
}
