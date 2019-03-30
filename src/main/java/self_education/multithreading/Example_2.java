package self_education.multithreading;

import java.util.stream.Stream;

public class Example_2 {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(3000);
        Transaction[] transaction = new Transaction[]{
                new Transaction(account, 2200),
                new Transaction(account, 20),
                new Transaction(account, 300),
                new Transaction(account, 390),
                new Transaction(account, 80)
        };
        Stream.of(transaction).forEach(Thread::start);
        for (Transaction transaction1 : transaction) {
            transaction1.join();
        }

        System.out.println("Balance: " + account.getMoney());
    }
}

class Account {
    private int money;
    public Account(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
}

class Transaction extends Thread{
    private Account account;
    private int withdraw;

    public Transaction(Account account, int withdraw) {
        this.account = account;
        this.withdraw = withdraw;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (account) {
            System.out.println(Thread.currentThread().getId());
            int total = account.getMoney();
            if (total >= withdraw) {
                account.setMoney(total - withdraw);
            }
        }
    }


}
