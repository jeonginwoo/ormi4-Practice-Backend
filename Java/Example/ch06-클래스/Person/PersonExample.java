package Person;

public class PersonExample {
    static final int AA = 10;

    public static void main(String[] args) {
        Person person = new Person("계백");

        System.out.println(person.nation);
        System.out.println(person.name);
        System.out.println(Person.PRICE);
        System.out.println(AA);

        // person.nation = "을지문덕";     // 오류. final 필드는 수정 불가
    }
}
