package self_education.patterns.abstractFactory;

public abstract class PhoneNumber {
    private String number;

    public abstract String getFullNumber();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
