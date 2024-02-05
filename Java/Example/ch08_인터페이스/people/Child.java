package ch08_인터페이스.people;

public class Child implements Walk, Run {
    @Override
    public void run() {
        System.out.println("어린 아이가 달립니다.");
    }

    @Override
    public void walk() {
        System.out.println("어린 아이가 걷습니다.");
    }
}
