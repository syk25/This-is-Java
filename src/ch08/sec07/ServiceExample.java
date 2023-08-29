package ch08.sec07;

public class ServiceExample {
    public static void main(String[] args) {

        Service service = new ServiceImpl();

        service.defaultMethod1(); // private method 호출 - 구현객체 전제
        System.out.println();

        service.defaultMethod2();
        System.out.println();

        Service.staticMethod1(); // private static method 호출 - 구현객체를 전제하지 않음
        System.out.println();

        Service.staticMethod2();
        System.out.println();
    }
}