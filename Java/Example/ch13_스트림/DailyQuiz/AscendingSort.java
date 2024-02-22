package ch13_스트림.DailyQuiz;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AscendingSort {
    public int[] solution(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        // 코드 작성
        /*** not stream ***/
//        int i = 0, j = 0;
//        while (i < array1.length && j < array2.length) {
//            if (array1[i] < array2[j]) {
//                result[i + j] = array1[i++];
//            } else {
//                result[i + j] = array2[j++];
//            }
//        }
//        while (i < array1.length) {
//            result[i + j] = array1[i++];
//        }
//        while (j < array2.length) {
//            result[i + j] = array2[j++];
//        }

        /*** stream ***/
        int[] indices = {0, 0};
        IntStream.range(0, result.length)
                .forEach(i -> {
                    if (indices[0] < array1.length && (indices[1] >= array2.length || array1[indices[0]] < array2[indices[1]])) {
                        result[i] = array1[indices[0]++];
                    } else {
                        result[i] = array2[indices[1]++];
                    }
                });

        return result;
    }

    public static void main(String[] args) {
        AscendingSort ascendingSort = new AscendingSort();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}
