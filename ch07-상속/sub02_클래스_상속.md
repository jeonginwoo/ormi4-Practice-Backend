# 📖7.2 클래스 상속

```java
class 자식클래스 extends 부모클래스 {
    // 필드
    // 생성자
    // 메소드
}
```
자식 클래스를 선언할 때 어떤 부모 클래스를 상속받을지 결정.
Java에서는 다중상속 지원하지 않음.

* 부모 클래스
```java
public class Animal {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public void sleep() {
		System.out.println(this.name + " Zzz...");
	}
}
```
* 자식 클래스
```java
public class Dog extends Animal {
    void sleep(int num){
        System.out.println(this.name + " slept " + num + " times.");
    }
}
```
```java
public class DogExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("happy");
        dog.sleep();
        dog.sleep(3);
    }
}
```
* 출력 결과
```text
happy Zzz...
happy sleep 3 times.
```