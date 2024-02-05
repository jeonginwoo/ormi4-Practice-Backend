package ch08_인터페이스.Zoo_abstract_test;

abstract public class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }

    abstract String getFood();
}
