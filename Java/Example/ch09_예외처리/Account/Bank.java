package ch09_예외처리.Account;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();

        // 예금하기
        account.deposit(30000);
        System.out.println("예금액: " + account.getBalance());

        // 출금하기
        try {
            account.withdraw(100000);
        } catch (BalanceInsufficientException e) {
            // 예외 발생 경로를 추적
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
