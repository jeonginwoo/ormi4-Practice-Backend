package 특강.pokemon;

public class Lapras extends Pokemon implements Movable {
    public Lapras(int level) {
        super("라프라스", level);
    }

    public Lapras(String name, int level) {
        super(name, level);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + "이(가) 움직입니다.");
    }
}
