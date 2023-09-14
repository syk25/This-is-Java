package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("I am the best developer");
        Stream<String> stream = list1.stream();
        stream.flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(System.out::println);

        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        Stream<String> stream2 = list2.stream();
        stream2.flatMapToInt(data -> {
                    String[] strArray = data.split(",");
                    int[] intArray = new int[strArray.length];
                    for (int i = 0; i < strArray.length; i++) {
                        intArray[i] = Integer.parseInt(strArray[i].trim());
                    }
                    return Arrays.stream(intArray);
                }
        ).forEach(System.out::println);
    }
}
