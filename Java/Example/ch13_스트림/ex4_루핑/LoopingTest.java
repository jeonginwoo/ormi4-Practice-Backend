package ch13_스트림.ex4_루핑;

import java.util.Arrays;
import java.util.List;

public class LoopingTest {
    public static void main(String[] args) {
        // peek
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list.stream()
                .mapToInt(n -> n)
                .filter(n -> n % 2 == 0)
                .peek(System.out::println)   // [2, 4]
                .sum();  // sum을 사용하지 않으면 peek은 동작하지 않음
        System.out.println(sum);    // 6

        // forEach
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        list2.stream()
                .mapToInt(n -> n)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);   // [2, 4]
    }
}
