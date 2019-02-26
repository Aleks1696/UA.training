package self_education.patterns.facade;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.turnOnComputer();

        //computer using

        computer.turnOffComputer();
    }
}
