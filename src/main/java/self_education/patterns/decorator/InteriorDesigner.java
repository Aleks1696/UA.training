package self_education.patterns.decorator;

public class InteriorDesigner extends Designers {

    public InteriorDesigner(CarDesigner designer) {
        super(designer);
    }

    public Car addComponent() {
        car = designer.addComponent();
        car.setInterier(Interier.LEATHER);
        System.out.println("Car after designing it's interior: " + car);
        return car;
    }
}
