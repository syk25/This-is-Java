package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car car = new Car();

        // Car 객체의 필드값 읽기, 초기값이 자동 설정 됨
        System.out.println("모델명: " + car.model);
        System.out.println("시동여부: " + car.start);
        System.out.println("현재속도: " + car.speed);
    }
}
