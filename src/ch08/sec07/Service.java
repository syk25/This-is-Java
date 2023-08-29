package ch08.sec07;

public interface Service {
    // default method : 메서드의 선언부뿐만 아니라 정의부도 작성해야 함
    // static : static 키워드는 인터페이스 준위에서 메서드 호출을 가능하게 함 -> 별도의 구현객체는 필요하지 않음
    // private : 외부에 코드를 노출시키지 않으면서도 중복코드를 작성을 막기 위해 쓰는 키워드

    default void defaultMethod1(){
        System.out.println("defaultMethod1 종속코드");
        defaultCommon();
    }
    default void defaultMethod2(){
        System.out.println("defaultMethod2 종속코드");
        defaultCommon();
    }

    private void defaultCommon(){
        System.out.println("defaultMethod 중복코드 A");
        System.out.println("defaultMethod 중복코드 B");
    }

    static void staticMethod1(){
        System.out.println("staticMethod1 종속코드");
        staticCommon();
    }
    static void staticMethod2(){
        System.out.println("staticMethod2 종속코드");
        staticCommon();
    }

    private static void staticCommon(){
        System.out.println("staticMethod 중복코드 C");
        System.out.println("staticMethod 중복코드 D");
    }
}
