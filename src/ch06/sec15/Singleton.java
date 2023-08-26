package ch06.sec15;

public class Singleton {

    private static Singleton singleton = new Singleton(); // 클래스 수준에서 정적멤버 객체를 이미 하나 선언

    private Singleton(){ // 생성자를 private 으로 제한
    }

    public static Singleton getInstance(){ // 정적멤버 호출 -> 사실상 하나의 객체만 사용
        return singleton;
    }
}
