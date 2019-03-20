package self_education.patterns.flyweight;

public class Vodafon implements Operator {

    public void sendSMS(String number) {
        System.out.println("Sending sms to: " + number + " from Vodafon operator");    }
}
