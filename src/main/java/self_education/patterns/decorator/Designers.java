package self_education.patterns.decorator;

abstract class Designers implements CarDesigner{
    CarDesigner designer;
    Car car;

    Designers(CarDesigner designer) {
        this.designer = designer;
    }
}
