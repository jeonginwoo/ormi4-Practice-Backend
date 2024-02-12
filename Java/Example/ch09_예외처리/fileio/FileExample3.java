package ch09_예외처리.fileio;

public class FileExample3 {
    public static void main(String[] args) {
        System.out.println();
        String fileName = System.getProperty("user.dir") + "/Java/Example/ch09_예외처리/test.txt";

        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            inputStream.read();
            inputStream.close();
            System.out.println("CodingTest");
            throw new Exception();

        } catch (Exception e) {
            System.out.println("Exception 처리");
        }
    }
}
