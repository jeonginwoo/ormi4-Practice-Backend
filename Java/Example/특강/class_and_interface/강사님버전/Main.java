package 특강.class_and_interface.강사님버전;

import java.util.List;

interface Movable {
    void move();
}

interface Jumpable {
    void jump();
}

class Skill {
    private String name;
    private int power;

    public Skill(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
}

class Tackle extends Skill {

    public Tackle() {
        super("몸통박치기", 20);
    }
}

class Fly extends Skill {

    public Fly() {
        super("공중날기", 30);
    }
}

class Surf extends Skill {

    public Surf() {
        super("파도타기", 40);
    }
}

class Player implements Movable, Jumpable{
    private String name = "골드";

    public Player(){
    }

    public Player(String name){
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
abstract class Pokemon {
    private String name;
    private Skill skill;
    private int level;
    private int exp = 0;
    private int hp;

    public Pokemon(int level){
        this.level = level;
        this.hp = level * 20;
    }

    public Pokemon(String name, int level){
        this.name = name;
        this.level = level;
        this.hp = level * 20;
    }

    public void expUp(int exp){
        this.exp += exp;
        while (this.exp >= 100) {
            this.exp -= 100;
            levelUp();
        }
    }

    public void levelUp(){
        level++;
        hp = level * 20;
        System.out.println(name + "이(가) 레벨업을 하여 " + level + "레벨이 되었습니다");
    }
    public void addSkill(Skill skill){
        this.skill = skill;
    }

    public void useSkill(Pokemon target){
        System.out.println(name + "이(가) " + skill.getName() + "을 사용하여" + target.getName() + "에게 " + skill.getPower() + "의 피해를 입혔습니다.");
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public int getHp() {
        return hp;
    }
}

class Pikachu extends Pokemon implements Movable, Jumpable {

    public Pikachu(int level) {
        super(level);
        this.setName("피카츄");
    }

    public Pikachu(String name, int level) {
        super(name, level);
    }

    public void move() {
        System.out.println(this.getName() + "이(가) 움직입니다.");
    }

    public void jump() {
        System.out.println(this.getName() + "이(가) 점프합니다.");
    }
}

class Squirtle extends Pokemon implements Movable, Jumpable{

    public Squirtle(int level) {
        super(level);
        this.setName("꼬부기");
    }

    public Squirtle(String name, int level) {
        super(name, level);
    }

    public Pokemon evolve() {
        Blastoise blastoise = new Blastoise(getLevel());
        System.out.println(getName() + "이(가) 진화했습니다.");
        System.out.println(getName() + "이(가) 진화하여 " + blastoise.getName() + "이(가) 되었습니다.");
        blastoise.setName(getName());
        return blastoise;
    }

    public void move() {
        System.out.println(this.getName() + "이(가) 움직입니다.");
    }

    public void jump() {
        System.out.println(this.getName() + "이(가) 점프합니다.");
    }
}

class Charmander extends Pokemon implements Movable, Jumpable{

    private List<String> learnableSkills = List.of(new Tackle().getName());
    public Charmander(int level) {
        super(level);
        this.setName("파이리");
    }

    public Charmander(String name, int level) {
        super(name, level);
    }

    @Override
    public void addSkill(Skill skill){
        // 수정해야 하는 부분!
    }

    public Pokemon evolve() {
        Charizard charizard = new Charizard(getLevel());
        System.out.println(getName() + "이(가) 진화했습니다.");
        System.out.println(getName() + "이(가) 진화하여 " + charizard.getName() + "이(가) 되었습니다.");
        charizard.setName(getName());
        return charizard;
    }

    public void move() {
        System.out.println(this.getName() + "이(가) 움직입니다.");
    }

    public void jump() {
        System.out.println(this.getName() + "이(가) 점프합니다.");
    }
}

class Lapras extends Pokemon implements Movable{

    public Lapras(int level) {
        super(level);
        this.setName("라프라스");
    }

    public Lapras(String name, int level) {
        super(name, level);
    }

    public void move() {
        System.out.println(this.getName() + "이(가) 움직입니다.");
    }
}

class Metapod extends Pokemon {

    public Metapod(int level) {
        super(level);
        this.setName("단데기");
    }

    public Metapod(String name, int level) {
        super(name, level);
    }
}

class Blastoise extends Pokemon implements Movable, Jumpable {

    public Blastoise(int level) {
        super(level);
        this.setName("거북왕");
    }

    public Blastoise(String name, int level) {
        super(name, level);
    }

    public void move() {
        System.out.println(this.getName() + "이(가) 움직입니다.");
    }

    public void jump() {
        System.out.println(this.getName() + "이(가) 점프합니다.");
    }
}

class Charizard extends Pokemon implements Movable, Jumpable {

    public Charizard(int level) {
        super(level);
        this.setName("리자몽");
    }

    public Charizard(String name, int level) {
        super(name, level);
    }

    public void move() {
        System.out.println(this.getName() + "이(가) 움직입니다.");
    }

    public void jump() {
        System.out.println(this.getName() + "이(가) 점프합니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Charmander charmander = new Charmander(5);
        charmander.addSkill(new Tackle());

        Squirtle squirtle = new Squirtle(5);
        squirtle.addSkill(new Tackle());

        squirtle.useSkill(charmander);
    }
}