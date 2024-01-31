# 📖3. 연산자

# ✅ 연산자

연산자(Operator) : 값을 더하거나 빼는 등의 계산을 하기 위해 사용하는 기호 (+, -, *, /, %, … )

피연산자(Operand) : 연산에 필요한 값(=변수, 상수, 리터럴, 수식)

## ☑️ 연산자 종류

- 단항 연산자
- 이항 연산자
    - 산술
    - 비교
    - 논리
- 삼항 연산자
- 대입 연산자

| 구분 | 연산자 | 비고                       |
| --- | --- |--------------------------|
| 결과가 boolean | 숫자 비교 연산자 | <, <=, >, >=             |
|  | 숫자 동등 연산자 | ==, !=                   |
| 결과가 int 혹은 long | 기본 사칙 연산자 | +, -, *, /, %            |
|  | 증감 연산자 | ++, --                   |
|  | 비트 연산자 | &, \|, ^, ~, <<, >>, >>> |
| 기타 연산자 | 삼항 연산자 | ? :                      |
|  | 형 변환 연산자 | (타입)                     |
|  | 문자열 더하기 연산자 | +                        |

## ☑️ 연산자 우선순위

| 연산자                                  | 연산 방향 | 우선 순위 |
|--------------------------------------| --- | --- |
| 증감(++, --), 부호(+, -), 비트(~), 논리(!)   | ← | 높음 |
| 산술(*, /, %)                          | → |  |
| 산술(+, -)                             | → |  |
| 쉬프트(<<, >>, >>>)                     | → |  |
| 비교(<, >, <=, >=)                     | → |  |
| 비교(==, !=)                           | → |  |
| 논리(&)                                | → |  |
| 논리(^)                                | → |  |
| 논리(\|)                               | → |  |
| 논리(&&)                               | → |  |
| 논리(\|\|)                             | → |  |
| 조건(?:)                               | → |  |
| 대입(=, +=, -=, *=, /=, %=, &=, ^=, …) | ← | 낮음 |

## ☑️ 이항 연산자

피연산자들의 타입이 동일하지 않다면 아래와 같은 규칙으로 연산이 된다.

1. 피연산자들이 모두 int보다 크기가 작을 경우 int로 변환 후 연산
    1. byte + byte → int + int
2. 피연산자 중에 long 타입이 있을 경우 모두 long으로 변환 후 연산
    1. int + long → long + long
3. 피연산자 중에 float 혹은 double 타입이 있을 경우 크기가 큰 실수 타입으로 변환 후 연산
    1. int + float → float + float

- byte 타입 연산

    ```java
    byte a = 1;
    byte b = 1;
    byte c = a + b; // 에러. byte는 int로 변환 후 연산되기 때문
    ```

- int 타입 연산

    ```java
    int a = 10;
    int b = 4;
    int c = a / b;  // 2 -> 정수끼리의 연산은 정수
    ```

- char 타입 연산

    ```java
    char c1 = 'A' + 1;   // 'B' (유니코드 66은 문자 B)
    char c2 = 'A';
    char c3 = c2 + 1;   // 에러
    ```

  char 타입 연산은 유니코드 값으로 연산

- 오버플로우

    ```java
    int a = 1000000;
    int b = 1000000;
    int c = a * b;
    
    System.out.println(c);  // -727379968
    ```

- NaN, Infinity

    ```java
    double a = 10;
    double b = 0;
    
    System.out.println(a / b);  // Infinity
    System.out.println(a % b);  // NaN
    
    // NaN, Infinite 체크
    System.out.println(Double.isInfinite(a / b));  // true
    System.out.println(Double.isNaN(a % b));  // true
    ```

    ```java
    // inf값 활용해보기
    double inf = 10/0.0;
    System.out.println(Long.MAX_VALUE < inf);   // true
    System.out.println(Long.MAX_VALUE);         // 9223372036854775807
    ```

  코딩 문제에서 max변수 초기화할 때 유용할 듯 하다.

- 문자열 연결 연산자

    ```java
    System.out.println("Hello!" + "Nice to meet you");  // Hello!Nice to meet you
    ```

  StringBuffer, StringBuilder도 사용 가능.

- 비교 연산자

    ```java
    ('A' < 'B') -> (65 < 66)	// char 타입이면 유니코드 값으로 비교 연산 수행
    	
    0.1 == 0.1f		// false. 부동 소수점에서 0.1을 정확히 표기할 수 없다. 2진수로 변환하는 과정에서 무한반복 됨.
    ```

    ```java
    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");
    
    System.out.println(str1 == str2);  // true
    System.out.println(str1 == str3);  // false
    System.out.println(str1.equals(str2));  // true
    System.out.println(str1.equals(str3));  // true
    ```


# ✅ 질문

- **java.lang에서 자주 사용하는 클래스**

  Math

  …Exception : 예외 처리할 때 많이 사용

  OutOfMemoryError : 가끔 만나는 에러. 메모리 가득 찼을 때(heap영역). 안 만나는 게 가장 좋음

  Wrapper 클래스들 (Integer, Double, …)

- 단축 평가 논리 계산법
- 클래스명 길이 제한이 있나?
    - 제한은 없지만 컨벤션 상에서 25자 제한 있음.

# ✅ Daily Quiz

### ✔️ 1. 아래 2개의 변수 number1, number2의 사칙 연산 결과(result1 ~ result4)를 정수로 출력하세요. (사칙연산: +, -, *, /) 주석처리 된 곳에 코드를 채우면 됩니다.

```java
public class Question {
    public static void main(String args[]) {
        int number1 = 10;
        double number2 = 2.0;
        
        // 사칙연산 코드 추가
				int result1 = number1 + (int)number2;
        int result2 = number1 - (int)number2;
        int result3 = number1 * (int)number2;
        int result4 = number1 / (int)number2;
				//
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
```

### ✔️ 2. 아래 코드의 출력값은 무엇일까요? 코드를 돌려보기 전에 예측해보세요.

2-1.

```java
public class Question {
    public static void main(String args[]) {
        // 아래 코드의 출력값은 무엇일까요?
        System.out.println(10 / 2 + 3 * 4);
    }
}
```

```
17
```

2-2.

```java
public class Question {
    public static void main(String args[]) {
        // 아래 코드의 출력값은 무엇일까요?
        int number = 10;
        
        int result1 = number + 1;
        int result2 = number++;
        int result3 = number;
        int result4 = --number;
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
```

```
11
10
11
10
```

2-3.

```java
public class Question {
    public static void main(String args[]) {
        // 아래 코드의 출력값은 무엇일까요?
        int num1 = 5;
        int num2 = 7;

        System.out.println((num1 > 5) && (num2 > 5));
        System.out.println((num1 > 5) || (num2 > 5));
        System.out.println(!((num1 > 5) && (num2 > 5)));
    }
}
```

```
false
true
true
```

### ✔️ 3. 다음의 내용을 연산식(조건식)으로 표현해보세요.

- i는 2의 배수 또는 3의 배수이다.

```java
i % 2 == 0 || i % 3 == 0
```

### ✔️ 4. 아래 코드의 실행 결과가 true가 되도록 수정해보세요.

```java
public class Question {
    public static void main(String args[]) {
        // 아래 코드의 실행 결과가 true가 되도록 수정해보세요.
        String str1 = new String("Hello world!");
        String str2 = new String("Hello world!");
        
        // System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
```

### ✔️ 5. 프로그래머스 문제

기초 트레이닝 > ‘연산’, ‘조건문’ 관련 문제

### 5.1 [공배수](https://school.programmers.co.kr/learn/courses/30/lessons/181936)

### 5.2 [n의 배수](https://school.programmers.co.kr/learn/courses/30/lessons/181937)

### 5.3 [flag에 따라 값 반환하기](https://school.programmers.co.kr/learn/courses/30/lessons/181933)