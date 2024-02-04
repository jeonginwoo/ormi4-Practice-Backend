package ch08_인터페이스.Zoo_interface;

import ch08_인터페이스.Zoo_abstract.Lion;
import ch08_인터페이스.Zoo_abstract.Tiger;

public class ZooKeeper {

//    void feed(Tiger tiger) {
//        System.out.println("feed meat");
//    }
//
//    void feed(Lion lion) {
//        System.out.println("feed fish");
//    }

    void feed(Predator predator) {
        System.out.println("feed meat");
    }
}
