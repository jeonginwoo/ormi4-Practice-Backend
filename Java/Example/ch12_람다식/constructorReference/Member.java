package ch12_람다식.constructorReference;

public class Member {
    private String name;
    private String id;

    public Member(String id) {
        System.out.println("Member(id) 생성자 실행");
        this.id = id;
    }

    public Member(String name, String id) {
        System.out.println("Member(id, name) 생성자 실행");
        this.name = name;
        this.id = id;
    }
}
