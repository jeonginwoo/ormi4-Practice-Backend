package ch07_상속.Calculator;

public class Computer extends Calculator {

    @Override
    double areaCircle(int r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
