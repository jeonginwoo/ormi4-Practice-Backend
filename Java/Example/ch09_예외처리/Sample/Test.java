package ch09_예외처리.Sample;

public class Test {
    static int test1() {
        int result = 3;

        try {
            return result;
        } catch (Exception e) {
            System.out.println("에러 발생: " + e);
        } finally {
            System.out.println("try문의 return은 무시된다.");
            return 0;
        }
    }

    static int test2() {
        int result = 3;

        try {
            return result;
        } catch (Exception e) {
            System.out.println("에러 발생: " + e);
        } finally {
            System.out.println("try문의 return은 무시된다.");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("---test1---");
        System.out.println(test1());
        System.out.println();
        System.out.println("---test2---");
        System.out.println(test2());
    }
}
