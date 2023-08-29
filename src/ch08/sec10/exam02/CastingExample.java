package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus(); // 자동형변환
        vehicle.run(); // Vehicle 인터페이스 변수 수준에서 메서드 호출
        System.out.println();

        Bus bus = (Bus) vehicle; // 강제형변환
        bus.run(); // Bus 구현클래스 변수 수준에서 메서드 호출
        bus.checkFare(); // 강제형변환으로 해당수준의 메서드 호출 가능

    }
}
