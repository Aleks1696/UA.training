package self_education.abstractFactory.ua;

import self_education.abstractFactory.Address;

public class UAAddress extends Address {
    private static final String COUNTRY = "Ukraine";

    @Override
    public String getFullAddress() {
        return COUNTRY + ", " + getCity() + ", " + getStreet() + ", " +
                getBuildingNumber() + ", " + getApartment();
    }
}
