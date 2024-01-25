package ex05;

public class Dog extends Animal {

    @Override
    public void sound() {           // 추상 메소드 재정의
        System.out.println("멍멍");
    }
}
