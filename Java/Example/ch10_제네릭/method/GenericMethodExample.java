package ch10_제네릭.method;

import ch10_제네릭.box.Box;
import static ch10_제네릭.method.Util.*;

public class GenericMethodExample {
    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.getObject();
        System.out.println(intValue);

        Box<String> box2 = boxing("홍길동");
        String strValue = box2.getObject();
        System.out.println(strValue);
    }
}
