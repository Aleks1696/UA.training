package self_education.abstractFactory.us;

import self_education.abstractFactory.Address;
import self_education.abstractFactory.Factory;
import self_education.abstractFactory.PhoneNumber;

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
