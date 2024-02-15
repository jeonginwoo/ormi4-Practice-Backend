package 특강.class_and_interface.pokemon;

abstract public class Pokemon {
    private String name;
    private int level;
    private int exp = 0;
    private int hp;

    public Pokemon(int level) {
        this.level = level;
        this.hp = level * 20;
    }

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
        this.hp = level * 20;
    }

    public void expUp(int exp) {
        this.exp += exp;
        while (this.exp >= 100) {
            this.exp -= 100;
            levelUp();
        }
    }

    public void levelUp() {
        level++;
        hp = level * 20;
        System.out.println(name + "이(가) 레벨업을 하여 " + level + "레벨이 되었습니다");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
