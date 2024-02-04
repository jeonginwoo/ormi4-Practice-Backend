package ch08_인터페이스.Zoo_abstract2;

public class ZooKeeper {
//    void feed(Tiger tiger) {
//        System.out.println("feed meat");
//    }
//
//    void feed(Lion lion) {
//        System.out.println("feed fish");
//    }
    void feed(Animal animal) {
        System.out.println("feed " + animal.getFood());
    }
}
