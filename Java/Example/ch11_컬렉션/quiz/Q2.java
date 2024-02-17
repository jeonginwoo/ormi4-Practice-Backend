package ch11_컬렉션.quiz;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = Arrays.asList(3, 3, 5, 8, 2, 2);

        for (Integer num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
