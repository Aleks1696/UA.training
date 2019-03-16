package self_education.patterns.decorator;

public class Painter extends Designers {

    public Painter(CarDesigner designer) {
        super(designer);
    }

    public Car addComponent() {
        car = designer.addComponent();
        car.setColor(Color.BLACK);
        System.out.println("Car after painting: " + car);
        return car;
    }

}
