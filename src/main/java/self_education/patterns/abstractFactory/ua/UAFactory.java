package self_education.patterns.abstractFactory.ua;

import self_education.patterns.abstractFactory.Address;
import self_education.patterns.abstractFactory.Factory;
import self_education.patterns.abstractFactory.PhoneNumber;

public class UAFactory implements Factory {
    @Override
    public Address createAddress() {
        return new UAAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new UAPhoneNumber();
    }
}
