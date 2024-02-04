package ch08_인터페이스.Zoo_interface;

public class Zoo {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        // Tiger tiger = new Tiger();
        Predator tiger = new Tiger();   // 다형성
        zooKeeper.feed(tiger);

        Lion lion = new Lion();
        // Predator lion = new Lion();
        zooKeeper.feed(lion);

    }
}
