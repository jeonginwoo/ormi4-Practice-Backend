package ch08_인터페이스.test_abstract;

public class Sample {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        Tiger tiger = new Tiger();
        zooKeeper.feed(tiger);

        Lion lion = new Lion();
        zooKeeper.feed(lion);
    }
}

abstract class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }

    abstract String getFood();
}

class Tiger extends Animal {
    @Override
    public String getFood() {
        return "meat";
    }
}

class Lion extends Animal {
    @Override
    public String getFood() {
        return "fish";
    }
}

class ZooKeeper {
    void feed(Animal animal) {
        System.out.println("feed " + animal.getFood());
    }
}