package self_education.abstractFactory.us;

import self_education.abstractFactory.PhoneNumber;

public class USPhoneNumber extends PhoneNumber {
    public static final String COUNTRY_CODE = "01";

    @Override
    public String getFullNumber() {
        return "(" + COUNTRY_CODE + ") " + getNumber();
    }
}
