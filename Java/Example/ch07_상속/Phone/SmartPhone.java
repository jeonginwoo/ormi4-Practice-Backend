package ch07_상속.Phone;

public class SmartPhone extends Phone {
    public SmartPhone(String owner) {
        super(owner);
    }

    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
