package self_education.patterns.decorator;

public class LogoMaker extends Designers {

    public LogoMaker(CarDesigner designer) {
        super(designer);
    }

    public Car addComponent() {
        car = designer.addComponent();
        car.setLabeles(Labeles.VOLKSWAGEN);
        System.out.println("Car after putting logos on it: " + car);
        return car;
    }
}
