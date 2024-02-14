package ch10_제네릭.DailyQuiz.No4;

public class ChildPair<K, V> extends Pair<K, V> {
    public ChildPair(K key, V value) {
        super(key, value);
    }
}
