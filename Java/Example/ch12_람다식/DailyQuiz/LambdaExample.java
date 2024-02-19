package ch12_람다식.DailyQuiz;

import java.util.function.*;

public class LambdaExample {
    public static int method(int x, int y) {
        ToIntBiFunction<Integer, Integer> supplier = (a, b) -> {
            a *= 10;
            int result = a + b;
            return result;
        };
        int result = supplier.applyAsInt(x, y);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(method(3, 5));
    }
}
