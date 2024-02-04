package ch08_인터페이스.Zoo_abstract;

public class ZooKeeper {
    void feed(Tiger tiger) {
        System.out.println("feed meat");
    }

    void feed(Lion lion) {
        System.out.println("feed fish");
    }
}
