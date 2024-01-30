package whileExample;

public class ex1 {
    public static void main(String[] args) {
        // while문을 사용해서 1 ~ 10 홀수만 출력하기
        int i = 0;
        while (i * 2 + 1 < 10) {
            System.out.println(i * 2 + 1);
            i++;
        }
    }
}
