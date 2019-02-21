package self_education.abstractFactory.ua;

import self_education.abstractFactory.Address;
import self_education.abstractFactory.Factory;
import self_education.abstractFactory.PhoneNumber;

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
