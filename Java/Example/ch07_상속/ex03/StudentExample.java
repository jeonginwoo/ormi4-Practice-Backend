package ch07_상속.ex03;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("길동", "123456-1234567", 1);

        System.out.println("name: " + student.name);
        System.out.println("ssn: " + student.ssn);
        System.out.println("studentNo: " + student.studentNo);
    }
}
