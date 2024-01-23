# 7.3 부모 생성자 호출

자바에서는 자식 객체를 생성하면 부모 객체가 먼저 생성되고 자식 객체가 그 다음에 생성된다.
```java
Dog dog = new Dog();
```
모든 객체는 클래스의 생성자를 호출해야만 생성된다.
부모 생성자는 자식 생성자의 맨 첫 줄에서 호출된다.
```java
public Dog {
    super();    // 컴파일러가 자동으로 생성한 생성자
}
```
`super()`는 부모의 기본 생성자를 호출. 즉 Animal 클래스의 다음 생성자를 호출.
```java
public Animal() {
}
```
Animal 소스 코드에서도 Animal의 생성자가 선언되지 않았지만, 컴파일러에 의해 기본 생성자가 만들어지므로 문제없이 실행됨.

명시적으로 부모 생성자를 호출하려면
```java
자식클래스(매개변수선언, ...) {
    super(매개값, ...);
    ...
}
```
위와 같이 작성하면 된다.

부모 클래스에 기본 생성자가 없고 매개 변수가 있는 생성자만 있으면 자식 생성자에서 반드시 명시적으로 부모 생성자를 호출해야 한다.

* 예시
```java
public class Person {
	String name;
	String ssn;

	public Person(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
```
```java
public class Student extends Person {
	int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
```
```java
public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("길동", "123456-1234567", 1);

		System.out.println("name: " + student.name);	// 부모에게서 물려받은 필드 출력
		System.out.println("ssn: " + student.ssn);		// 부모에게서 물려받은 필드 출력
		System.out.println("studentNo: " + student.studentNo);
	}
}
```
* 출력 결과
```text
name: 길동
ssn: 123456-1234567
studentNo: 1
```