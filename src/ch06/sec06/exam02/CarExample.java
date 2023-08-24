package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Car 객체의 필드값 읽기
        System.out.println("제조회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색: " + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);

        // Car 객체의 필드값 변경
        myCar.speed = 60;
        System.out.println("수정 된 속도: " + myCar.speed);
    }
}
