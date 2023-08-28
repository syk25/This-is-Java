package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HankookTire(); // 자동형변환
        myCar.run(); // 메서드 오버라이딩

        myCar.tire = new KumhoTire();
        myCar.run();

    }
}
