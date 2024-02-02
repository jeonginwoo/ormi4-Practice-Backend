package ch02_변수.Sample;

import java.util.Arrays;

public class SampleString {
    public static void main(String[] args) {
        String s = "HelloJava";
        String[] strs = s.split("J");
        System.out.println(Arrays.toString(strs));
        System.out.println(s.charAt(6));

        /* ------------------------------------- */

        String tim = "tim";
        int timAge = 20;

        String anna = "Anna";
        int annaAge = 42;

        String format = String.format("%s의 나이는 %d세 입니다.", tim, timAge);
        String format2 = String.format("%s의 나이는 %d세 입니다.", anna, annaAge);



        /* ------------------------------------- */

        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append("World!");

        System.out.println(buffer);

        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append("World");

        System.out.println(builder);


        /* ------------------------------------- */
        // 시간 비교

        long time = System.currentTimeMillis();
        String a = "Hello" + " World!";


        long time2 = System.currentTimeMillis();
        StringBuffer buffer2 = new StringBuffer();
        buffer.append("Hello");
        buffer.append("World!");
        System.out.println(buffer);
        System.out.println(System.currentTimeMillis() - time2);
    }
}
