package ch10_제네릭.DailyQuiz.No2;

public class Container<T> {
    private T container;

    public T get() {
        return container;
    }

    public void set(T container) {
        this.container = container;
    }
}
