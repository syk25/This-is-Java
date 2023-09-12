package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((x, y) -> { // action 메서드 내에 호출 된 추상메서드 calc에 람다식을 선언하여 주입
            double result = x + y;
            return result;
        }); // 추상메서드는 action 내에서 호출 됨. 결과적으로는 action 자체가 실행되는 것.

        person.action((x, y) -> x + y);

        person.action((x,y) -> sum(x, y));

    }
    public static double sum(double x, double y){
        return x + y;
    }
}
