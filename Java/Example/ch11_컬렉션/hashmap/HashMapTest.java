package ch11_컬렉션.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        // 1. Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();
        map.put("홍길동", 28);
        map.put("고길동", 35);
        map.put("둘리", 20);

        // 2. 객체 찾기
        System.out.println(map.containsKey("마이콜"));
        System.out.println(map.get("홍길동"));
        System.out.println();

        // 3. 객체를 하나씩 처리
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.getOrDefault(key, 0);
            System.out.println("key: " + key + ", value: " + value);
        }
        System.out.println();

        // 4. 객체 삭제
        map.remove("홍길동");
        System.out.println(map);
        System.out.println();

        // 5. 객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();

        // 6. 모든 Map.Entry 삭제
        entrySet.clear();
        System.out.println(entrySet.isEmpty());
    }
}
