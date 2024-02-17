package ch11_컬렉션.quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "레드향");
        map.put(2, "사과");
        map.put(3, "바나나");
        map.put(4, "샤인머스켓");

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int key = iterator.next();
            String value = map.get(key);
            System.out.println("[Key]:" + key + " [Value]:" + value);
        }

    }
}
