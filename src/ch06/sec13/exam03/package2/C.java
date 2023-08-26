package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;


public class C {
    public void method() {
        A a = new A();

        a.field1 = 1;
//        a.field2 = 1; // default 접근제한 상태
//        a.field3 = 1; // private 접근제한 상태

        a.method1();
//        a.method2(); // default 접근제한 상태
//        a.method3(); // private 접근제한 상태

    }


}
