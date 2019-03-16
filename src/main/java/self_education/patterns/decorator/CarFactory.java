package self_education.patterns.decorator;

public class CarFactory implements CarDesigner {
    private Car car;

    public CarFactory(Car car) {
        this.car = car;
    }

    public Car addComponent() {
        System.out.println("Car after manufacturing: " + car);
        return car;
    }

}
