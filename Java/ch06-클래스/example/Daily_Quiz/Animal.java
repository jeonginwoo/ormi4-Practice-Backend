package Daily_Quiz;

public class Animal {
    String name = "";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println(name+"(이)가 잠을 잡니다.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("호랑이");
        System.out.println(animal.getName());
        animal.sleep();
    }
}
