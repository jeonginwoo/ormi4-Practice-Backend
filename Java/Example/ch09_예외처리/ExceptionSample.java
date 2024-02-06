package ch09_예외처리;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionSample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Sample sample = new Sample();

        sample.test();

        String fileName = "C:/Users/jiw41/OneDrive/바탕 화면/ESTsoft/Project/ormi4-Practice-Backend/Java/Example/ch09_예외처리/test.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        br.close();
    }
}
