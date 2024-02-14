package ch10_제네릭.bounded;

public class BoundedExample {
    public static void main(String[] args) {
        int result = Util.compare(10, 20);
        System.out.println(result);

        int result2 = Util.compare(5.2, 3.5);
        System.out.println(result2);

        int result3 = Util.compare(8, 8);
        System.out.println(result3);
    }
}
