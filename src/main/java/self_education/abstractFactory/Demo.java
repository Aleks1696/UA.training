package self_education.abstractFactory;

import self_education.abstractFactory.ua.UAFactory;
import self_education.abstractFactory.us.USAddress;
import self_education.abstractFactory.us.USFactory;

public class Demo {
    public static void main(String[] args) {
        Factory usFactory = new USFactory();
        Address usAddress = usFactory.createAddress();
        ((USAddress)usAddress).setRegion("California");
        usAddress.setCity("New York");
        usAddress.setStreet("Time square");
        usAddress.setBuildingNumber("23");
        usAddress.setApartment("125");
        System.out.println(usAddress.getFullAddress());

        PhoneNumber usPhoneNumber = usFactory.createPhoneNumber();
        usPhoneNumber.setNumber("344-44-56-2");
        System.out.println(usPhoneNumber.getFullNumber());

        Factory uaFactory = new UAFactory();
        Address uaAddress = uaFactory.createAddress();
        uaAddress.setCity("Lviv");
        uaAddress.setStreet("Ploshcha Rynok");
        uaAddress.setBuildingNumber("35/1");
        uaAddress.setApartment("5");
        System.out.println(uaAddress.getFullAddress());

        PhoneNumber uaPhoneNumber = uaFactory.createPhoneNumber();
        uaPhoneNumber.setNumber("63-645-23-11");
        System.out.println(uaPhoneNumber.getFullNumber());
    }
}
