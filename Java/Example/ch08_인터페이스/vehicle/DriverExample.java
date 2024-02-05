package ch08_인터페이스.vehicle;

public class DriverExample {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle taxi = new Taxi();

        Driver driver = new Driver();
        driver.drive(bus);
        driver.drive(taxi);
    }
}
