package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("김자바");
        list.add("람다식");
        list.add("박상렬");

        Stream<String> parallelStream = list.parallelStream(); // 컬렉션의 메서드를 이용해 스트림 생성
        parallelStream.forEach((name) -> {
            System.out.println(name + ": " + Thread.currentThread().getName());
        });
    }
}
