package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl(); // 구현클래스타입의 구현객체 생성

        InterfaceA ia = impl; // 자동형변환?
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
        System.out.println();

    }
}
