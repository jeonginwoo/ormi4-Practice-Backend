package ch02_변수.Sample;

public class VariableExample {
    public static void main(String[] args) {
        int a = 123;
        double b = 3.15;

        // long 타입은 뒤에 L 붙여서 명시해주기. 명확하게 써 주는 것이 좋음
        long var1 = 10;     // long 타입으로 자동 형변환.
        long var2 = 20L;
        // long var3 = 10000000000; // 오류. L을 안붙이면 int형으로 인식하는데, int형의 범의를 벗어남.
        long var4 = 10000000000L;

        // 실수형 값의 default 자료형은 double.

        // float var5 = 3.14;   // 오류. float형보다 double형의 범위가 더 크므로 자동 형변환이 안된다.
        float var5 = 3.14F;     //
    }
}
