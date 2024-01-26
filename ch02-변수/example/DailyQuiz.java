public class DailyQuiz {
    public static void main(String[] args) {
        /*
        * 1.
        * serialNo는 15자리의 숫자로 이루어져 있습니다.
        * serialNo 변수를 선언하는 한 줄의 코드를 적으세요.
        */
        long serialNo = 123456789012345L;
        System.out.println(serialNo);

        /*
        * 2.
        * 다음 문장들의 출력 결과를 확인해보세요
        */
        System.out.println("10" + "10");
        // 1010
        System.out.println("" + false);
        // false
        System.out.println('a' + 100);
        // a100 (x)

        /*
        * 3.
        * 에러가 발생하는 부분을 고쳐보세요.
        */
        // byte a = 999;
        int a3 = 999;
        // char b = 'abc';
        String b3 = "abc";
        // float c = 1.23d;
        float c3 = 1.23f;

        /*
        * 4.
        * 다음 중 기본 자료형(primitive type)이 아닌 것은?
        * 1) int
        * 2) String
        * 3) boolean
        * 4) short
        * 답 : 2번
        */

        /*
        * 5.
        * char 타입에 저장할 수 있는 정수 값의 범위는?
        * : char 타입은 2바이트 양의 정수, 즉 [0, 2^16-1]
        */
        char a5 = 65535;

        /*
        * 6.
        * 다음 중 변수를 잘못 초기화한 것을 모두 고르세요.
        * 1) int a = 1;
        * 2) char b = '';       // char형은
        * 3) char c = 'Hello';  // char형은 문자만 가능
        * 4) byte d = 12345;    // byte형은 1byte 정수 [-2^7, 2^7-1]
        * 답 : 2, 3, 4번
        */

        /*
        * 7.
        * 다음 수식의 결과 값과 타입은?
        * 1) 100 + 10.5
        * : 110.5 (double)
        * 2) 100 / 5
        * : 20 (int)
        * 3) 10.0 / 5
        * : 2.0 (double)
        */
        System.out.println(100 + 10.5);
        System.out.println(100 / 5);
        System.out.println(10.0 / 5);

        /*
        * 8. '가'라는 한글 문자의 유니코드를 찾아서 char 타입의 변수로 만들어봅시다.
        */
        char a8 = '가';
        System.out.println((int) a8);
        char b8 = 44032;
        System.out.println(b8);

        /*
        * 9.
        * 아래 코드는 변수 x, y, z의 값을 서로 바꾸는 예제입니다.
        * 실행 결과처럼 출력되도록 빈칸에 알맞은 코드를 넣어주세요.
        *
        * 실행 결과
        * x = 20
        * y = 300
        * z = 1
        */
        int x = 1;
        int y = 20;
        int z = 300;

        // 코드를 작성해주세요
        int temp = x;
        x = y;
        y = z;
        z = temp;
        // ----------------

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
