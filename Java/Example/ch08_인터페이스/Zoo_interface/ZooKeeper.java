package ch08_인터페이스.Zoo_interface;

import ch08_인터페이스.Zoo_abstract.Lion;
import ch08_인터페이스.Zoo_abstract.Tiger;

public class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}
