package ch13_스트림.ex3_정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedTest {
    public static void main(String[] args) {
        // Integer sort
        List<Integer> list = Arrays.asList(12, 4, 2, 8, 11);
        list.stream()
                .sorted()
                .forEach(a -> System.out.print(a+" "));
        System.out.println("\n---------------");

        List<Integer> list2 = Arrays.asList(15, 6, 7, 8, 2, 1);
        list.stream()
                .sorted()
                .forEach(a -> System.out.print(a+" "));
        System.out.println("\n---------------");

        // String sort
        List<String> list3 = Arrays.asList("다", "마", "가", "라", "나");
        list3.stream()
                .sorted()
                .forEach(a -> System.out.print(a+" "));
        System.out.println("\n---------------");

        // 역순 정렬
        list3.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(a -> System.out.print(a+" "));
    }
}
