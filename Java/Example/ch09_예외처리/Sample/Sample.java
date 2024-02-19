package ch09_예외처리.Sample;

import java.io.FileNotFoundException;

public class Sample {
    // throws는 호출처로 에러 던지는 역할. (ExceptionSample 클래스)
    public void test() throws FileNotFoundException {
        throw new FileNotFoundException();  // 예외 발생
    }
}
