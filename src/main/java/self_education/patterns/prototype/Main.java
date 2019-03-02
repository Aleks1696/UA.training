package self_education.patterns.prototype;

public class Main {
    public static void main(String[] args) {
        Pasport pasport = new Pasport("KP5645LD", "12/12/2020", "04/02/2050");
        PasportFactory pasportFactory = new PasportFactory();
        Pasport copy1 = pasportFactory.createCopy(pasport);
        Pasport copy2 = pasportFactory.createCopy(copy1);

    }
}
