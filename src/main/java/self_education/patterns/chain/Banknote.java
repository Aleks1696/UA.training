package self_education.patterns.chain;

public abstract class Banknote {
    Integer equivalent;
    Banknote next;

    public void setNext(Banknote banknote) {
        this.next = banknote;
    }

    public void withdrawSomeMoney(int sum) {
        int numberOfBanknotes = sum / getEquivalent();
        int remainder = sum % getEquivalent();
        System.out.println(String.format("Number of %d banknotes: %d", getEquivalent(), numberOfBanknotes));
        if (remainder > 0 && next != null) {
            next.withdrawSomeMoney(remainder);
        } else {
            System.out.println("Money that can not be withdrawn " + remainder);
        }
    }

    public Integer getEquivalent() {
        return equivalent;
    }
}
