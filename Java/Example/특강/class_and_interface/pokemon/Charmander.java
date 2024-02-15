package 특강.class_and_interface.pokemon;

public class Charmander extends Pokemon implements Movable, Jumpable {
    public Charmander(int level) {
        super("파이리", level);
    }

    public Charmander(String name, int level) {
        super(name, level);
    }

//    public Pokemon evolve() {
//        Charizard charizard = new Charizard(getLevel());
//        System.out.println(getName() + "이(가) 진화했습니다.");
//        System.out.println(getName() + "이(가) 진화하여 " + charizard.getName() + "이(가) 되었습니다");
//        System.out.println(getName());
//        return charizard;
//    }

    @Override
    public void move() {
        System.out.println(this.getName() + "이(가) 움직입니다.");
    }

    @Override
    public void jump() {
        System.out.println(this.getName() + "이(가) 점프합니다.");
    }
}
