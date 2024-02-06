package ch09_예외처리.DailyQuiz;

public class NotExistsIdException extends Exception {
    public NotExistsIdException() {}

    public NotExistsIdException(String message) {
        super(message);
    }
}
