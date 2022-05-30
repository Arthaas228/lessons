package lesson10.dz;

import java.util.Date;

public abstract class FurnitureOrder extends Order{
    String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }
}
