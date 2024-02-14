package WeeklyQuiz.Week3;

public class Contact {
    private String name;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("이름: %s, 전화번호: %s", name, phoneNumber);
    }
}
