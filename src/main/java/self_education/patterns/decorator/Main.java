package self_education.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        CarDesigner car = new LogoMaker(new Painter(new InteriorDesigner(new CarFactory(new Car()))));
        car.addComponent();

        System.out.println("Another car ---------------------------------");

        CarDesigner car_2 = new InteriorDesigner(new LogoMaker(new Painter(new CarFactory(new Car()))));
        car_2.addComponent();
    }
}
