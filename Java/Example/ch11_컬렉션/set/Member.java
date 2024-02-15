package ch11_컬렉션.set;

public class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + age;  // name값과 age 값이 같으면 해시코드 같도록
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Member) {
            Member member = (Member)object;
            return member.name.equals(this.name) && member.age == this.age;
        } else {
            return false;
        }
    }
}
