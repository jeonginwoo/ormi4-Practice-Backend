package ch13_스트림.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class IfPresentTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        OptionalDouble average = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        average.ifPresent(System.out::println);
    }
}
