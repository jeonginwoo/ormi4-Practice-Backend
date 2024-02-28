package ch13_스트림.Quiz;

import java.util.Arrays;
import java.util.List;

public class Quiz2 {
    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(
                new Member("홍길동", "파란색", 30),
                new Member("고길동", "갈색", 40),
                new Member("둘리", "초록색", 25),
                new Member("마이콜", "빨간색", 32)
                );

        List<Person> personList = memberList.stream()
                .map(member -> new Person(member.getName(), member.getAge()))
                .toList();

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
