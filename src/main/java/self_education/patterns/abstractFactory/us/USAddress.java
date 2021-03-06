package self_education.patterns.abstractFactory.us;

import self_education.patterns.abstractFactory.Address;

public class USAddress extends Address {
    private static final String COUNTRY = "United States";
    private String region;

    @Override
    public String getFullAddress() {
        return COUNTRY + ", " + getRegion() + ", " + getCity() + ", " + getStreet() + ", " +
                getBuildingNumber() + ", " + getApartment();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
