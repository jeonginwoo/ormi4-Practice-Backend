package Access2;

import Access.AccessSample;

public class ChildAccessSample extends AccessSample {

    void printNumber() {
//        System.out.println(number);   // 접근 불가
//        System.out.println(number2);  // 접근 불가
        System.out.println(number3);
        System.out.println(number4);
    }
}