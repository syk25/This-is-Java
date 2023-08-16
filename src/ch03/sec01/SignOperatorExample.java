package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        x=-x;
        System.out.println("x = " + x);

        // 정수형 연산 시 자동형변환
        byte b = 100;
        int y = -100;
        System.out.println("y = " + y);

    }
}
