package ch08_인터페이스.Zoo_abstract_test;

public class Zoo {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        Tiger tiger = new Tiger();
        zooKeeper.feed(tiger);

        Lion lion = new Lion();
        zooKeeper.feed(lion);
    }
}