package self_education.abstractFactory.ua;

import self_education.abstractFactory.PhoneNumber;

public class UAPhoneNumber extends PhoneNumber {
    public static final String COUNTRY_CODE = "+380";

    @Override
    public String getFullNumber() {
        return "(" + COUNTRY_CODE + ") " + getNumber();
    }
}
