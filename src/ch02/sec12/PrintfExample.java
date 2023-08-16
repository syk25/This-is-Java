package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격: %d원\n", value);
        System.out.printf("상품의 가격: %6d원\n", value);
        System.out.printf("상품의 가격: %-6d원\n", value);
        System.out.printf("상품의 가격: %06d원\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이: %010.2f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%06d | %-10s | %10s\n", 1, name,job);


        // 홍길동의 직업은 도적입니다. 한달에 000100.3원 법니다.
        System.out.printf("%s의 직업은 %s입니다. 한달에 %10.5f원 법니다.", name,job,area);
    }
}
