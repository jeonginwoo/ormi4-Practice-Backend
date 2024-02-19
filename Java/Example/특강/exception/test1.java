package 특강.exception;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int sum = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("정수를 입력하세요 (종료하려면 0 입력): ");
            while (true) {
                System.out.print("정수 입력: ");
                int num = 0;
                try {
                    num = Integer.parseInt(scanner.nextLine());

                    // 0 입력 시 반복문 종료
                    if (num == 0) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 입력입니다. " + e.getMessage());
                }
                sum += num;
            }
            System.out.println("입력한 정수의 합: " + sum);
        }
    }
}
