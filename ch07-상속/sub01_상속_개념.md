# 📖7.1 상속 개념

상속은 이미 잘 개발된 클래스를 재사용해서 새로운 클래스를 만들기 때문에 코드의 중복을 줄이고 효율적인 개발을 할 수 있다.   
공통되는 부분은 부모 클래스에서 한번만 수정해주면 모든 자식 클래스에 적용되기 때문에 유지 보수 시간을 최소화 시켜준다.

* 부모 클래스 InheritA
```java
public class InheritA {
    int field1;

    void method1() {
        System.out.println("InheritA.method1 field1 : " + field1);
    }
}
```
* InheritA를 상속한 InheritB 코드
```java
public class InheritB extends InheritA {
    String field2;

    void method2() {
        System.out.println("InheritB.method2 field2 : " + field2);
    }
}
```
```java
public class InheritanceExample {
    public static void main(String[] args) {
        InheritB b = new InheritB();
        b.field1 = 10;
        b.method1();    // -> InheritA로부터 물려받은 필드와 메소드

        b.field2 = "홍길동";
        b.method2();    // -> InheritB에서 추가한 필드와 메소드
    }
}
```
* 출력 결과
```text
InheritA.method1 field1 : 10
InheritB.method2 field2 : 홍길동
```

private 접근 제한을 갖는 필드와 메소드는 상속 대상에서 제외.
부모와 자식 클래스가 서로 다른 패키지에 존재한다면 default 접근 제한도 상속 대상에서 제외.