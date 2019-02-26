package self_education.patterns.facade;

public class Computer {
    private Keybord keybord = new Keybord();
    private Monitor monitor = new Monitor();
    private Processor processor = new Processor();

    public void turnOnComputer() {
        keybord.turnOn();
        monitor.turnOn();
        processor.turnOn();
    }
    public void turnOffComputer() {
        keybord.turnOff();
        monitor.turnOff();
        processor.turnOff();
    }

}
