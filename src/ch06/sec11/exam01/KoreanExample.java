package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("990919-1099999", "홍길동");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // k1.nation ="USA";
        // k1.ssn = "880818-1088888";
        // final 로 선언 된 필드의 값을 변경할 수 없다.

        k1.name = "감자바";
    }
}
