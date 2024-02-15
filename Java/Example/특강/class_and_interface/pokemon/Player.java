package 특강.class_and_interface.pokemon;

public class Player implements Movable, Jumpable {
    private String name = "골드";

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(name + "이(가) 움직입니다.");
    }

    @Override
    public void jump() {
        System.out.println(name + "이(가) 점프합니다.");
    }
}
