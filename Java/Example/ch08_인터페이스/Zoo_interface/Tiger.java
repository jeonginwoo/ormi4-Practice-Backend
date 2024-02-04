package ch08_인터페이스.Zoo_interface;

public class Tiger extends Animal implements Predator {
    @Override
    public String getFood() {
        return "meat";
    }
}
