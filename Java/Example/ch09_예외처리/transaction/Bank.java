package ch09_예외처리.transaction;

public class Bank {
    public static void main(String[] args) {
        Account sender = new Account(3000);    // 송금인 계좌
        Account receiver = new Account(3000);    // 수금인 계좌

        long backupBalance = sender.getBalance();

        try {
             sender.withdraw(2000);
             throw new Exception("에러 수동 발생!");
//             receiver.deposit(2000);
        } catch (Exception e) {
            // 에러발생! 모두 취소
            sender = new Account(backupBalance);
            throw new RuntimeException(e);
        }
    }
}
