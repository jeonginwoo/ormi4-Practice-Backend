package ch09_예외처리.fileio;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        String fileName = "C:/Users/jiw41/OneDrive/바탕 화면/ESTsoft/Project/ormi4-Practice-Backend/Java/Example/ch09_예외처리/test.txt";
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(fileName));
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            // 예외처리
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // 예외처리
                }
            }
        }
        // try-catch 지옥
    }
}
