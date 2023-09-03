package ch12.sec06;

public class BoxingUnboxingExample {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("obj.intValue() = " + obj.intValue());

        int value = obj; // 언박싱
        System.out.println("value = " + value);

        int result = obj + 100; // 언박싱
        System.out.println("result = " + result);
    }
}
