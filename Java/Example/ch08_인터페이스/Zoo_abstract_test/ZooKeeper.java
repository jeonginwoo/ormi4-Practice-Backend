package ch08_인터페이스.Zoo_abstract_test;

public class ZooKeeper {
    void feed(Animal animal) {
        System.out.println("feed " + animal.getFood());
    }
}
