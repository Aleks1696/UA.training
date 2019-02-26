package self_education.patterns.abstractFactory.us;

import self_education.patterns.abstractFactory.PhoneNumber;

public class USPhoneNumber extends PhoneNumber {
    public static final String COUNTRY_CODE = "01";

    @Override
    public String getFullNumber() {
        return "(" + COUNTRY_CODE + ") " + getNumber();
    }
}
