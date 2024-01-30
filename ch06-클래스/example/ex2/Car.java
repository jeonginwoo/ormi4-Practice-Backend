package ex2;

public class Car {
    String company;     // 필드(속성), 멤버 변수
    int speed = 100;
    String sw = "samsung";
    Sheet sheet;

    public Car(){}

    public Car(String company,  int speed) {      // 생성자
        this.company = company;
        this.speed = speed;
    }

    void changeSoftware(String str) {    // 메소드(행위/기능)
        sw = str;
    }
}
