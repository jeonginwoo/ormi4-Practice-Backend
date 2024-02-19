package 특강.exception;

import java.util.LinkedList;
import java.util.Queue;

public class test2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[10] = 30 / 0;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("허용된 인덱스 범위가 아닙니다.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        Queue<Integer> queue = new LinkedList<>();
    }
}
