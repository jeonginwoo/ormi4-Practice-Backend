package Sample;

public class SampleClass {
    public static void main(String[] args) {
        int value = 10;
        if (value == 10) {
            int value2 = 11;
            System.out.println(value2);
        }   // value2의 생명주기

        for (int i = 0; i < 5; i++) {
            int value2 = 1; // 새로운 value2
            System.out.println(value + 1);
            System.out.println(value2 + 1);
        }   // 새로운 value2 생명주기

        System.out.println(value);
        // System.out.println(value2); // value2는 이미 생명주기가 끝난 상태
    }
}