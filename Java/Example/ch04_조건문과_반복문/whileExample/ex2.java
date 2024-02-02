package ch04_조건문과_반복문.whileExample;

public class ex2 {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 10);
    }
}
