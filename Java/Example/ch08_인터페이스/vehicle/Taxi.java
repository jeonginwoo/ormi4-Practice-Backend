package ch08_인터페이스.vehicle;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시 달립니다.");
    }
}