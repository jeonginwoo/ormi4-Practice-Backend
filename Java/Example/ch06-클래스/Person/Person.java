package Person;

public class Person {
    final String nation = "Korea";
    final String name;
    static final int PRICE = 10000;

    Person() {
        this.name = "초기 이름 생성";
    }

    Person(String name) {
        this.name = name;
    }
}
