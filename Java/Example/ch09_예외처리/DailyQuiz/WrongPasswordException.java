package ch09_예외처리.DailyQuiz;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {}

    public WrongPasswordException(String message) {
        super(message);
    }
}
