package ch10_제네릭.DailyQuiz.No4;

public class Util {
    public static <T extends Pair<K, V>, K, V> V getValue(T pair, K key) {
        if (pair.getKey().equals(key)) {
            return pair.getValue();
        } else {
            return null;
        }
    }
}
