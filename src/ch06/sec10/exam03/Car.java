package ch06.sec10.exam03;

public class Car {
    // 인스턴스 필드 선언
    int speed;

    // 인스턴스 메서드 선언
    void run(){
        System.out.println(speed + "으로 달립니다.");
    }

    static void simulate(){
        Car myCar = new Car();
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate();

        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
