package ch12_람다식.constructorReference;

import java.util.function.*;

public class ConstructorReferenceTest {
    public static void main(String[] args) {
        Function<String, Member> f1 = Member::new;
        Member member1 = f1.apply("아이디");

        BiFunction<String, String, Member> f2 = Member::new;
        Member member2 = f2.apply("이름", "아이디");
    }
}
