package ch07_상속.ex02;

public class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(this.name + " Zzz...");
    }
}
