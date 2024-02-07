package ch09_예외처리.transaction;

public class Account {
    private long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws BalanceInsufficientException { // 사용자 정의 예외 떠넘기기
        if (balance < money) {
            throw new BalanceInsufficientException("잔고가 부족합니다. " + (balance - money) + " 부족함");  // 사용자 정의 예외 발생
        }

        balance -= money;
    }
}