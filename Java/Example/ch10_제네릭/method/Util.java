package ch10_제네릭.method;

import ch10_제네릭.box.Box;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>(t);
        return box;
    }
}
