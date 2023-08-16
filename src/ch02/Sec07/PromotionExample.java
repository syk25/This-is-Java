package ch02.Sec07;

public class PromotionExample {
    public static void main(String[] args) {
        // 자동타입변환
        // 바이트(8비트) - > 정수 int
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue = " + intValue);

        // char, int 자동형변환(유니코드 참조)
        char charValue = '가';
        intValue = charValue;
        System.out.println("\'가\'의 유니코드 Value = " + intValue);

        // int -> long 자동형변환
        intValue = 50;
        long longValue = intValue;

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue = " + floatValue);

        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue = " + doubleValue);
    }
}
