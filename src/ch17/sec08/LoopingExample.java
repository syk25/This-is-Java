package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        Arrays.stream(intArr).filter(s -> s%2==0)
                .peek(System.out::println); // 최종처리가 없어 작동하지 않음

        int total = Arrays.stream(intArr).filter(a -> a%2 == 0)
                .peek(System.out::println) // 최종연산의 존재에 의해 중개연산으로서 동작함
                .sum(); // 최종연산(합계)
        System.out.println("총합: " + total + "\n");

        Arrays.stream(intArr).filter(b -> b%2 == 0)
                .forEach(System.out::println);
    }
}
