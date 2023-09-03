package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>(); // Generic의 타입매개변수의 선언
        product1.setKind(new Tv());
        product1.setModel("스마트 Tv");
        System.out.println(product1.getKind());
        System.out.println(product1.getModel());

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("SUV 자동차");

        System.out.println(product2.getKind());
        System.out.println(product2.getModel());

    }
}
