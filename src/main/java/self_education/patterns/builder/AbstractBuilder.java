package self_education.patterns.builder;

public abstract class AbstractBuilder {
    SmartPhone smartPhone;
    void createSmartPhone() {
       smartPhone = new SmartPhone();
    }

    abstract void buildBrand();
    abstract void buildSize();
    abstract void buildRam();

    SmartPhone getSmartPhone() {
        return smartPhone;
    }

}
