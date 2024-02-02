package ch04_조건문과_반복문.forExample;

public class 구구단 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
