package ch11_컬렉션.list;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(30);  // Integer 객체 30개를 저장할 수 있는 용량
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
    }
}
