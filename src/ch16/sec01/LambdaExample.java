package ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        action((x,y) -> { // 람다식 : 함수의 형태로 제공되는 매개변수
            int result = x + y; // 인터페이스의 추상메서드가 구체화 됨
            System.out.println("result = " + result); // 람다식은 익명구현객체로
        }); // 자바 컴파일러는 람다식을 익명구현객체로 변환

        action((x,y) -> {
            int result = x - y;
            System.out.println("result = " + result);
        });

    }
    public static void action(Calculable calculable){ // 람다식이 매개변수로 쓰인 예시함수 , 매개변수는 익명구현객체
        // 입력 받을 데이터
        int x = 10;
        int y = 4;
        calculable.calculate(x, y); // 추상메서드의 사용
    }
}
