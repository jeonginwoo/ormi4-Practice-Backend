package Sample;

public class Boxing {
    public static void main(String[] args) {
        long startTimeMs1 = System.currentTimeMillis();
        Long sum1 = 0L;
        for (int i = 0; i < 1000000000; i++) {
            sum1 = sum1 + 1;
        }
        System.out.println("실행 시간: " + (System.currentTimeMillis() - startTimeMs1) + "ms");

        long startTimeMs2 = System.currentTimeMillis();
        long sum2 = 0L;
        for (int i = 0; i < 1000000000; i++) {
            sum2 = sum2 + 1;
        }
        System.out.println("실행 시간: " + (System.currentTimeMillis() - startTimeMs2) + "ms");
    }
}

// 실행 시간: 37ms