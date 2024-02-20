package ch13_스트림.Quiz;

public class Member {
    private String name;
    private String favoriteColor;
    private int age;

    public Member(String name, String favoriteColor, int age) {
        this.name = name;
        this.favoriteColor = favoriteColor;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public int getAge() {
        return age;
    }
}
