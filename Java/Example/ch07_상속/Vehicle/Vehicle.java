package ch07_상속.Vehicle;

public class Vehicle {
    String model;
    int speed;
    boolean stop;
    String color;
    int wheelCount;
    Boolean onOff;

    public void print() {
        System.out.println("Parent:" + model + ", " + speed + ", " + stop);
    }
}
