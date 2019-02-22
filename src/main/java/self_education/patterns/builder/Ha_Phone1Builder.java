package self_education.patterns.builder;

public class Ha_Phone1Builder extends AbstractBuilder{

    void buildBrand() {
        smartPhone.setBrand("ha-Phone");
    }
    void buildSize() {
        smartPhone.setSize(5.4);
    }
    void buildRam() {
        smartPhone.setRam(8);
    }
}
