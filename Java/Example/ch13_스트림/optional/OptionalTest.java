package ch13_스트림.optional;

import java.util.*;

public class OptionalTest {
    public static void main(String[] args) {
        // null이 아닌 값을 갖는 Optional 객체 반환
        // String str = null;
        String str = "str";

        Optional<String> emptyOpt = Optional.empty();
        Optional<String> of = Optional.of(str);

        // null을 허용하는 Optional 객체 반환
        Optional<String> nullableOpt = Optional.ofNullable("str");
        System.out.println(nullableOpt.orElse("default"));
        Optional<String> nullableOpt2 = Optional.ofNullable(null);
        System.out.println(nullableOpt2.orElse("default"));

        Optional<List<String>> optionalList = Optional.ofNullable(null);
        if (optionalList.isPresent()) {
            List<String> stringList = optionalList.get();
        }

        List<Integer> list = new ArrayList<>();

        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        // 1. isPresent()로 방어 처리

    }
}
