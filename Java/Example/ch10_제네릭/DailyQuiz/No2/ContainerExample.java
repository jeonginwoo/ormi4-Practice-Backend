package ch10_제네릭.DailyQuiz.No2;

public class ContainerExample {

    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        stringContainer.set("홍길동");
        String str = stringContainer.get();

        Container<Integer> intContainer = new Container<>();
        intContainer.set(6);
        int value = intContainer.get();

        System.out.println(str);
        System.out.println(value);
    }
}
