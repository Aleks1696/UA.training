package self_education.patterns.prototype;

public class PasportFactory {

    public PasportFactory() {}

    public Pasport createCopy(Pasport pasport) {
        return (Pasport)pasport.copy();
    }

}
