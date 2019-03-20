package self_education.patterns.flyweight;

public class Kyivstar implements Operator {

    public void sendSMS(String number) {
        System.out.println("Sending sms to: " + number + " from Kyivstar operator");
    }
}
