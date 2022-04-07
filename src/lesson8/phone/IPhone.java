package lesson8.phone;

public class IPhone extends Phone {

    boolean countryPriduced;

    public IPhone(int price, double weight, String countryProduced, boolean countryPriduced) {
        super(price, weight, countryProduced);
        this.countryPriduced = countryPriduced;
        System.out.println("IPhone constructor was invoked");
    }
    void deleteIPhoneFromDb(){
        System.out.println("deleteIPhoneFromDb invoked...");
    }
}


