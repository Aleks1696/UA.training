package self_education.patterns.flyweight;

public class Lifecell implements Operator {

    public void sendSMS(String number) {
        System.out.println("Sending sms to: " + number + " from Lifecell operator");
    }
}
