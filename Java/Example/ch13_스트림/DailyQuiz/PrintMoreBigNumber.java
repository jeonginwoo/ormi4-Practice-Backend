package ch13_스트림.DailyQuiz;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintMoreBigNumber {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();

        // 코드 작성
        // for (int i = 0; i < n; i++) {
        //     if (i == 0 || array[i] > array[i - 1]) {
        //         answer.add(array[i]);
        //     }
        // }

        answer = IntStream.range(0, n)
                .filter(i -> i == 0 || array[i] > array[i - 1])
                .mapToObj(i -> array[i])
                .collect(Collectors.toList());

        return answer;
    }

    public static void main(String[] args) {
        PrintMoreBigNumber printMoreBigNumber = new PrintMoreBigNumber();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        for (int x : printMoreBigNumber.solution(number, array)) {
            System.out.print(x + " ");
        }
    }
}
