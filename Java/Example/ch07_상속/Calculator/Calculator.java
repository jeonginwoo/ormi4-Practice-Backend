package ch07_상속.Calculator;

public class Calculator {
    private static final double PI = 3.141592;

    double areaCircle(int r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return PI * r * r;
    }
}
