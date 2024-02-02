package ch07_상속.Animal;

public abstract class Animal {
    String kind;

    public void breath() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();   // 추상 메소드
}
