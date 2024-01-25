# 📖7.4 메소드 재정의
> 메소드 오버라이딩, 메소드 오버로딩에 대한 개념 익히기

* [메소드 오버라이딩](#메소드-오버라이딩override)
* [메소드 오버로딩](#메소드-오버로딩)

## ✅메소드 오버라이딩(@Override)
어떤 메소드는 자식 클래스가 사용하기에 적합하지 않을 수 있다. 이 경우 상속된 일부 메소드는 자식 클래스에서 다시 수정해서 사용해야 한다.

메소드가 오버라이딩 되었다면 부모 객체의 메소드는 숨겨지기 때문에, 자식 객체에서 메소드를 호출하면 오버라이딩된 자식 메소드가 호출된다.
```java
public class Parent {
	void method1() {
		System.out.println("Parent의 method1 호출");
	}

	void method2() {
		System.out.println("Parent의 method2 호출");
	}
}
```
```java
public class Child extends Parent {
	void method2() {
		System.out.println("Child의 method2 호출");
	}

	void method3() {
		System.out.println("Child의 method3 호출");
	}
}
```
```java
public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();

		child.method1();
		child.method2();    // 재정의된 메소드 호출
		child.method3();
	}
}
```
```text
Parent의 method1 호출
Child의 method2 호출
Child의 method3 호출
```

메소드 오버라이딩 규칙
* 부모의 메소드와 동일한 시그니처(리턴타입, 메소드이름, 매개변수 리스트)를 가져야 한다.
* 접근 제한을 더 강하게 오버라이딩 할 수는 없다.
  * 부모 메소드가 public인데 자식에서 default나 private 접근제한으로 수정할 수 없다. (반대로는 가능)
* 새로운 예외(Exception)을 throws 할 수 없다. (예외처리 Part에서 배웁니다)

## ✅메소드 오버로딩
메소드의 이름은 동일하고 입력 항목이 다른 경우를 말한다.
```java
void sleep()
void sleep(int hour)
```
위 두 함수는 서로 다른 함수.

```java
public class Animal {
	String name;

	public void setName(String name) {
		this.name = name;
	}
}
```
```java
public class Dog extends Animal {
	void sleep() {
		System.out.println(this.name + " Zzz...");
	}
}
```
```java
public class HouseDog extends Dog {
	void sleep(int hour) {   // 메소드 오버로딩
		System.out.println(this.name + " Zzz... for " + hour + " hours");
	}

	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog();
		houseDog.setName("puppy");
		houseDog.sleep();
		houseDog.sleep(3);
	}
}
```
```text
puppy Zzz...
puppy Zzz... for 3 hours
```