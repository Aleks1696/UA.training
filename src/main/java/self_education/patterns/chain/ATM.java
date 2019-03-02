package self_education.patterns.chain;

public class ATM {
    public void withdraw(int sum) {
        Banknote banknote_500 = new Banknote_500();
        Banknote banknote_200 = new Banknote_200();
        Banknote banknote_100 = new Banknote_100();
        Banknote banknote_50 = new Banknote_50();

        banknote_500.setNext(banknote_200);
        banknote_200.setNext(banknote_100);
        banknote_100.setNext(banknote_50);

        banknote_500.withdrawSomeMoney(sum);
    }
}
