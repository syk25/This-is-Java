package ch17.sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("김자바", 30)
        );

        // 체이닝패턴 이용
        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        // 체이닝패턴 없이 이용
        Stream<Student> stream = list.stream();
        IntStream scoreStream = stream.mapToInt(student -> student.getScore());
        double avg2 = scoreStream.average().getAsDouble();

        System.out.println("평균점수: " + avg);
        System.out.println("평균점수: " + avg2);
    }
}
