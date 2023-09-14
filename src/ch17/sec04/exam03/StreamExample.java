package ch17.sec04.exam03;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamExample {
    public static int sum;
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(a -> sum+= a);
        System.out.println("총합: " + sum);

        sum = 0;

        LongStream stream2 = LongStream.rangeClosed(1, 100);
        stream2.forEach(p -> sum += p);
        System.out.println("총합: " + sum);
    }

}
