package ch11_컬렉션.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableTest {
    public static void main(String[] args) {
        Map<String, String> table = new Hashtable<>();
        table.put("spring", "qwer");
        table.put("sumer", "qwer1234");
        table.put("fall", "qwer123");
        table.put("winter", "qwe123");

        Scanner scanner = new Scanner(System.in);    // 키보드로 부터 입력된 내용을 받기 위해 생성

        while (true) {
            System.out.println("아이디와 비밀번호를 입력해주세요");
            System.out.println("아이디: ");
            String id = scanner.nextLine();        // 키보드로 입력한 아이디를 읽는다

            System.out.println("비밀번호: ");
            String password = scanner.nextLine();
            System.out.println();

            // if 조건절
            if(table.containsKey(id)) {
                if (table.get(id).equals(password)) {
                    System.out.println("로그인 되었습니다");
                    break;
                } else {
                    System.out.println("잘못된 비밀번호 입니다.");
                }
            } else {
                System.out.println("존재하지 않는 아이디입니다.");
            }
        }
    }
}
