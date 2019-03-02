package self_education.patterns.prototype;

public class Pasport implements Copyable{
    private String serialNumber;
    private String releaseDate;
    private String expirationDate;

    public Pasport(String serialNumber, String releaseDate, String expirationDate) {
        this.serialNumber = serialNumber;
        this.releaseDate = releaseDate;
        this.expirationDate = expirationDate;
    }

    public Object copy() {
        return new Pasport(serialNumber, releaseDate, expirationDate);
    }
}
