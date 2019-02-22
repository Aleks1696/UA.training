package self_education.patterns.builder;

public class Director {
    private AbstractBuilder builder;
    void createBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }

    SmartPhone buildSmartPhone() {
        builder.createSmartPhone();
        builder.buildBrand();
        builder.buildSize();
        builder.buildRam();
        return builder.getSmartPhone();
    }

}
