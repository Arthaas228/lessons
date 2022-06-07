package lesson10.dz;
import java.util.Date;

public class FurnitureOrder extends Order {
    String furnitureCode;
    private static int guaranteeMonths;
    private String customerCity = getCustomerOwned().getCity();
    private String customerName = getCustomerOwned().getName();
    private int basePrice = getBasePrice();
    private String itemName;
    private Date dateCreated;
    private String shipToCity;
    private double fullPrice;

    public FurnitureOrder(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
        this.itemName = itemName;
        this.dateCreated = dateCreated;
        this.shipToCity = shipToCity;
        this.basePrice = basePrice;

        if (customerName == "Тест" || basePrice<500) {
            System.out.println("<----------------------------------------------------------------------------->");
            System.out.println("Price for the product must be higher then 500 hrn and your name can't be 'Тест'");
            System.out.println("<----------------------------------------------------------------------------->");
        }
        else {
            validateOrder();
            calculatePrice(basePrice);
        }
    }
    @Override
    void validateOrder() {
        if (customerCity == "Киев") {
            System.out.println("<-------------------------------------------------->");
            System.out.println("We're happy to say the package is on the way to Kiev");
            System.out.println("Full price: " + calculatePrice(basePrice));
            System.out.println("<-------------------------------------------------->");
        } else if (customerCity == "Львов") {
            System.out.println("<----------------------------------------------------->");
            System.out.println("We're happy to say the package is on the way to Lviv");
            System.out.println("Full price: " + calculatePrice(basePrice));
            System.out.println("<----------------------------------------------------->");
        }
        else {
            System.out.println("Your purchase can't be processed");
        }
    }
    @Override
    double calculatePrice(int basePrice) {
        double fullPrice;
        if (basePrice<5000) {
            return fullPrice = basePrice + basePrice * 0.05;
        }
        else {
            return fullPrice = basePrice + basePrice * 0.02;
        }
    }

    @Override
    public Date getDateCreated() {
        return dateCreated;
    }
    @Override
    public int getBasePrice() {
        return basePrice;
    }
    @Override
    public String getItemName() {
        return itemName;
    }
    @Override
    public String getShipToCity() {
        return shipToCity;
    }
    public double getFullPrice() {
        return fullPrice;
    }

}