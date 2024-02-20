package ch13_스트림.ex2_매핑;

import java.util.Arrays;
import java.util.List;

public class MappingTest {
    public static void main(String[] args) {
        // map
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("--------------");

        // flatMap
        List<String> list2 = Arrays.asList("Hello World", "Java stream", "HiStream");
        list2.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))  // [[Hello, World], [Java, stream], [HiStream]] ->(flatMap)-> [Hello, World, Java, stream, HiStream]
                .forEach(System.out::println);
    }
}
