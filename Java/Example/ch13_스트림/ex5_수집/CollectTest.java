package ch13_스트림.ex5_수집;

import java.util.*;
import java.util.stream.*;

public class CollectTest {
    public static void main(String[] args) {
        // collect
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list2);  // [2, 4]

        List<String> list3 = Arrays.asList("a", "b", "c", "a", "b");
        List<String> list4 = list3.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list4);

        Set<Integer> set = Stream.of(1, 2, 2, 3, 4, 5)
                .filter(n -> n % 2 == 0)
                .peek(System.out::println)
                .collect(Collectors.toSet());
        System.out.println(set);

        // grouping
        List<Integer> list5 = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);
        Map<Integer, Long> map = list5.stream()
                .collect(
                        Collectors.groupingBy(
                                n -> n,     // key
                                Collectors.counting()   // value, 그루핑 후 집계하는 메소드
                        )
                );
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
