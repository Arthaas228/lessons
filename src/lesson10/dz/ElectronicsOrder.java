package lesson10.dz;

import java.util.Date;

public abstract class ElectronicsOrder extends Order{
    int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }
}
