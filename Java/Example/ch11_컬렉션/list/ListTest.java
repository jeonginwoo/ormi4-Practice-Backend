package ch11_컬렉션.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    static <T> void printList(List<T> list) {
        System.out.print("[");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println(list.get(list.size() - 1) + "]");
    }

    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();

        listStr.add("첫번째");
        listStr.add("두번째");
        listStr.add("세번째");
        printList(listStr);
        System.out.println(listStr.contains("두번째"));

        System.out.println("-----------------");
        listStr.remove(1);
        printList(listStr);
        System.out.println(listStr.contains("두번째"));

        System.out.println("-----------------");
        System.out.println(listStr.isEmpty());
        listStr.clear();
        System.out.println(listStr.isEmpty());

        listStr = null;
        if (listStr == null || listStr.isEmpty()) {
            System.out.println("list가 비어있습니다.");
        }
    }
}
