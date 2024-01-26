# 📖1. 자바 기초

## 자바로 할 수 있는 일
1. 안드로이드 개발
2. 데이터베이스 처리
3. 대규모 데이터 처리

## 자바의 특징
1. 객체 지향 언어
2. 메모리 자동 관리
3. 풍부한 라이브러리
4. 운영체제에 독립적
   * JVM (Java Virtual Machine)

[자바 표준 API 문서 사이트](https://docs.oracle.com/javase/8/docs/api/index.html?overview-summary.html)

## 자바 코드 구조

* 파일 구조
```java
package ex02;       // 첫 번째 줄은 패키지명

import java.util.ArrayList;     // 사용하는 클래스 import
import java.util.List;

public class Main {     // 클래스

    int num = 1;       // 전역 변수

    public static void main(String[] args) {    // 메소드
        System.out.println("Hello World!");
    }
}
```

* 일반적인 코드 형태
```java
/* 클래스 블록 */
public class 클래스명 {

    /* 메서드 블록 */
    [public|private|protected] [static] (리턴자료형|void) 메서드명1(입력자료형 매개변수, ...) {
        명령문(statement);
        ...
    }

    /* 메서드 블록 */
    [public|private|protected] [static] (리턴자료형|void) 메서드명2(입력자료형 매개변수, ...) {
        명령문(statement);
        ...
    }

    ...
}
```

* 클래스에 들어가는 내용
```java
public class ClassExample {
    
    // 필드
   int fieldName;
   
   // 생성자
   public ClassExample() {
       
   }
   
   // 메소드
   void methodName() {
       
   }
}
```

* 코딩 컨벤션   
프로그래머들 사이에서 정해놓은 **코드 작성 규칙**
  - **camelCase**
     - 변수 명
  - **PascalCase**
     - 클래스 명
  - **kebab-case**
     - 프로젝트 명
  - **snake_case**
     - SNAKE_CASE : 상수 (전부 대문자)

  [Google Java Style Guide 번역본](https://github.com/JunHoPark93/google-java-styleguide)