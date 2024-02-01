# 📖7.5 추상클래스

* [개념](#개념)  
* [용도](#용도)  
* [선언](#선언)  
* [오버라이딩](#오버라이딩)  


## ✅개념
실체들의 공통되는 특성을 가지고 있는 것을 클래스로 따로 빼놓은 것.  
추상클래스는 실제 클래스의 공통되는 필드와 메소드를 추출해서 만들었기 때문에 일반 클래스와는 달리 객체를 직접 생성해서 사용할 수 없다. (new 연산자로 인스턴스 생성 못함)
```java
Animal animal = new Animal(); (X)
```
추상 클래스는 새로운 실체 클래스를 만들기 위해 부모 클래스로만 사용된다.
```java
class Ant extends Animal { ... }
```

## ✅용도
1. 실체 클래스들의 공통된 필드와 메소드의 이름을 통일할 목적   
   
2. 실체 클래스를 작성할 때 시간 절약

## ✅선언
```java
public abstract class 클래스명 {
    // 필드
    // 생성자
    // 메소드
}
```
```java
// Phone.java 추상클래스
public abstract class Phone {
    private String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
```
```java
// SmartPhone.java 실체 클래스
public class SmartPhone extends Phone {
    // 생성자
    public SmartPhonme(String owner) {
        super(owner);
    }
    
    // 메소드
    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
```
```java
public class PhoneExample {
    public static void main(String[] args) {
        // Phone phone = new Phone();
        
        SmartPhone smartPhone = new SmartPhone("홍길동");
        
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
```
```text
폰 전원을 켭니다.
인터넷 검색을 합니다.
폰 전원을 끕니다.
```

## ✅오버라이딩
추상클래스는 실체 클래스가 공통적으로 가져야 할 필드와 메소드들을 정의해 놓은 추상적인 클래스이므로 실체 클래스의 멤버(필드, 메소드)를 통일하는데 목적이 있다.
간혹 메소드의 선언만 통일하고, 실행 내용은 샐체 클래스마다 달라야 하는 경우가 있다. 이런 경우 **오버라이딩**으로 재정의 한다.
```java
public abstract class Animal {
    private String kind;
    
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }
    
    // 추상메소드 : 메소드의 타입과 이름만 정의
    public abstract void sound();
}
```
```java
public class Dog extends Animal {
    public Dog() {
        this.kind = "포유류";
    }
    
    @Override
    public void sound() {   
        System.out.println("멍멍");
    }
}
```
```java
public class Cat extends Animal {
    public Cat() {
        this.kind = "포유류";
    }
    
    @Override
    public void sound() {   // 추상 메소드 재정의
        System.out.println("야옹");
    }
}
```

추상 메소드를 정의했음에도 실체(자식)클래스에서 해당 메소드를 구현하지 않으면 컴파일 오류가 발생한다.