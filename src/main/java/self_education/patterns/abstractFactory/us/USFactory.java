package self_education.patterns.abstractFactory.us;

import self_education.patterns.abstractFactory.Address;
import self_education.patterns.abstractFactory.Factory;
import self_education.patterns.abstractFactory.PhoneNumber;

public class USFactory implements Factory {
    @Override
    public Address createAddress() {
        return new USAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new USPhoneNumber();
    }
}
