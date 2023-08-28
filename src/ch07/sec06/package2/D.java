package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
    public D (){
        super();
    }

    public void method1(){
        this.field = "value";
        this.method();
    }

    public void method2(){ // 부모클래스의 생성자, 필드, 메서드가 protected 되어 있더라도 새 객체를 생성해서 작업을 할 수는 없다.
//        A a = new A();
//        a.field = "value";
//        a.method();
    }

}
