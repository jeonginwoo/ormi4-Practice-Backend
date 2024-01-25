package ex04.ex04_2;

public class HouseDog extends Dog {
    void sleep(int hour) {   // 메소드 오버로딩
        System.out.println(this.name + " Zzz... for " + hour + " hours");
    }

    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("puppy");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}