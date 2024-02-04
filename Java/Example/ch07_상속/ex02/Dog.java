package ch07_상속.ex02;

public class Dog extends Animal {
    void sleep(int num){
        System.out.println(this.name + " slept " + num + " times.");
    }
}