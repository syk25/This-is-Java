package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("김자바");
        list.add("신민철");
        list.add("신용권");

        // 중복 제거 후 출력
        list.stream().distinct().forEach(System.out::println);
        System.out.println();

        // "신"으로 시작하는 데이터를 따로 모아 출력
        list.stream().filter(n -> n.startsWith("신")).forEach(System.out::println);
        System.out.println();

        // 중복제거 후 "신"으로 시작하는 데이터를 따로 모아 출력
        list.stream().distinct().filter(n -> n.startsWith("신")).forEach(System.out::println);
    }
}
