package 특강.pokemon;

public class Squirtle extends Pokemon implements Movable, Jumpable {
    public Squirtle(int level) {
        super("꼬부기", level);
    }

    public Squirtle(String name, int level) {
        super(name, level);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + "이(가) 움직입니다.");
    }

    @Override
    public void jump() {
        System.out.println(this.getName() + "이(가) 점프합니다.");
    }
}
