package Car;

public class CarExample {
    public static void main(String[] args) {
        Car sonata1 = new Car("hyndai", 100);
        sonata1.changeSoftware("LG");
        sonata1.printSpec();

        Car sonata2 = new Car("kia");
        sonata2.printSpec();
    }
}
