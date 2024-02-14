package ch10_제네릭.box;

public class Box<T> {
    private T object;

    public Box() {
    }

    public Box(T object) {
        this.object = object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
