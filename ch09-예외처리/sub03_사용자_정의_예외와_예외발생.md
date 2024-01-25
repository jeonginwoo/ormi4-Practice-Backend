# 📖9.3 사용자 정의 예외와 예외발생

프로그램을 개발하다 보면 자바 표준 API에서 제공하는 예외 클래스만으로는 부족할 수 있다.
애플리케이션과 관련된 예외는 개발자가 직접 정의해서 만들어야 하므로 사용자 정의 예외가 필요하다.

## ✅사용자 정의 예외 클래스 선언
```java
public class XXXException extends Exception { // 일반 예외 선언
	public XXXException() { }
	public XXXException(String message) {  super(message);  }
}

or 

public class XXXException extends RuntimeException { // 실행 예외 선언
	public XXXException() { }
	public XXXException(String message) {  super(message);  }
}
```

일반 예외
실행 예외

네이밍 Exception으로 끝내면 좋음


생성자는 두 개 선언이 기본.
    * 매개변수 없는거 하나
    * String 타입 매개변수 있는거 하나
        * 예외 발생 원인 메시지 전달용


