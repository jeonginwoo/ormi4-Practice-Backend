package 특강.pokemon;

public class Pikachu extends Pokemon implements Movable, Jumpable {
    public Pikachu(int level) {
        super("피카츄", level);
    }

    public Pikachu(String name, int level) {
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
