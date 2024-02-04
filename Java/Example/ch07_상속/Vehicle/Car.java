package ch07_상속.Vehicle;

public class Car extends Vehicle {
    public void print() {
        System.out.println("Parent:" + model + ", " + speed + ", " + stop);
    }
}
