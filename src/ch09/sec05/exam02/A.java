package ch09.sec05.exam02;

public class A {
    String field = "A-field"; // A의 인스턴스필드
    void method (){
        System.out.println("A-method"); // A의 인스턴스 메서드
    }
    class B { // 인스턴스멤버 클래스
        String field = "B-field"; // B의 인스턴스필드
        void method(){
            System.out.println("B-method"); // B의 인스턴스메서드
        }
        void print(){// this -> 클래스 B의 객체 지칭
            System.out.println(this.field);
            this.method();

            System.out.println(A.this.field); // A.this -> 외부클래스의 객체를 지칭할 때 쓰는 법
            A.this.method();
        }
    }
    void useB(){
        B b = new B();
        b.print();
    }
}
