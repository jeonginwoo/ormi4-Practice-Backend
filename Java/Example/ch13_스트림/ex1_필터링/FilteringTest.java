package ch13_스트림.ex1_필터링;

import java.util.Arrays;
import java.util.List;

public class FilteringTest {
    public static void main(String[] args) {
        // distinct
        List<Integer> list = Arrays.asList(1, 10, 4, 5, 1, 2);
        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("----------------");

        // filter
        List<String> list2 = Arrays.asList("김밥", "김밥", "김치", "나비", "나방");
        list2.stream()
                .filter(str -> str.startsWith("김"))
                .forEach(System.out::println);
        System.out.println("----------------");

        // 동시 적용
        list2.stream()
                .filter(str -> str.startsWith("김"))
                .distinct()
                .forEach(System.out::println);
    }
}
