package ch07_상속.ex02;
public class DogExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("happy");
        dog.sleep();
        dog.sleep(3);
    }
}