package ch06_클래스.Car;

public class Car {
    String company;     // 필드(속성), 멤버 변수
    private int speed;
    String sw;
    Sheet sheet;
    String wheel;
    String color;

    Car(String company){
        this.company = company;
        speed = 100;
        sw = "samsung";
        sheet = new Sheet();
        wheel = "tire";
        color = "white";
    }

    Car(String company,  int speed) {      // 생성자
        this.company = company;
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    public double getSpeed() {
        double km = speed * 1.6;
        return km;
    }

    void changeSoftware(String sw) {    // 메소드(행위/기능)
        this.sw = sw;
    }

    void changeSheet(Sheet sheet) {
        this.sheet = sheet;
    }

    void changeWheel(String wheel) {
        this.wheel = wheel;
    }

    void changeColor(String color) {
        this.color = color;
    }

    void printSpec() {
        System.out.println("company: " + company + ", speed: " + speed + ", sw: " + sw + ", sheet: " + sheet.sheetType + ", color: " + color);
    }
}
