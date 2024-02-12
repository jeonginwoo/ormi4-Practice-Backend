package ch09_예외처리.fileio;

import java.io.*;

public class FileExample2 {
    public static void main(String[] args) {
        System.out.println();
        String fileName = System.getProperty("user.dir") + "/Java/Example/ch09_예외처리/test.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            System.out.println(br.readLine());
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("예외처리 로직");
        }
        // close() 없음. 자동 호출
        // 정말 자동호출이 되나? -> FileExample3 확인
    }
}
