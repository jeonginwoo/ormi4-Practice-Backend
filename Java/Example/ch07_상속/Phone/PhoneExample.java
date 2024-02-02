package ch07_상속.Phone;

public class PhoneExample {
    public static void main(String[] args) {
        // Phone phone = new Phone(); 추상클래스만으로 객체 생성 불가능
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
