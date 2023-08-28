package ch07.sec06.package1;

public class B {
    public void method(){
        A a = new A(); // 동일 패키지여서 A 생성 가능
        a.field = "value";
        a.method();
    }
}
