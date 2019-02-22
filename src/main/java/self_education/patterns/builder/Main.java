package self_education.patterns.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.createBuilder(new Ha_Phone1Builder());
        SmartPhone smartPhone = director.buildSmartPhone();
        System.out.println(smartPhone);
    }
}
