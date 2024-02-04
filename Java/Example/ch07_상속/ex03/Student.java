package ch07_상속.ex03;

public class Student extends Person {
    int studentNo;

    public Student(String name, String ssn, int studentNo){
        super(name, ssn);
        this.studentNo = studentNo;
    }
}
