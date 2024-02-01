package Vehicle;

public class Motercycle extends Vehicle {
    void setSpeed(int speed) {
        this.speed = speed;
    }

    public void print() {
        System.out.println("Child(Motorcycle):" + model + ", " + speed + ", " + stop);
    }
}
