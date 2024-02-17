package ch11_컬렉션.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("안녕하세요");
        set.add("안녕하세요");   // 중복값 저장 안됨
        set.add("정인우");
        set.add("입니다");
        System.out.println(set);    // 순서대로 저장 안됨

        System.out.println("---itertator 사용---");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            // 중간에 삭제 연산 가능
            System.out.println(iterator.next());
        }
        System.out.println("---for each 사용---");
        for (String s : set) {
            // 중간에 삭제 연산 불가능
            System.out.println(s);
        }
        System.out.println(set.size());

        boolean isRemoved = set.remove("없는요소");
        System.out.println("isRemoved = " + isRemoved);
        isRemoved = set.remove("안녕하세요");
        System.out.println("isRemoved = " + isRemoved);
        System.out.println(set);

        set.clear();
        System.out.println(set);
    }
}
