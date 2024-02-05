package ch08_인터페이스.people;

public class Adult implements Walk, Run {
    @Override
    public void run() {
        System.out.println("어른이 달립니다.");
    }

    @Override
    public void walk() {
        System.out.println("어른이 걷습니다.");
    }
}