package ch08_인터페이스.Zoo_abstract2;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        System.out.println("Abstract Test");
        System.out.println("--------------");

        Tiger tiger = new Tiger();
        zooKeeper.feed(tiger);

        Lion lion = new Lion();
        zooKeeper.feed(lion);

    }
}
