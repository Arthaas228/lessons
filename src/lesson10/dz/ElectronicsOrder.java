package lesson10.dz;



import java.util.Date;



public class ElectronicsOrder extends Order{
    private int guaranteeMonths;
    private String customerCity = getCustomerOwned().getCity();
    private String customerName = getCustomerOwned().getName();
    private int basePrice = getBasePrice();
    private Date dateCreated = new Date();
    private String itemName = getItemName();
    private String shipToCity = getShipToCity();

    private double fullPrice;

    @Override
    public void validateOrder() {
        if (customerCity == "Киев") {
            System.out.println("<-------------------------------------------------->");
            System.out.println("We're happy to say the package is on the way to Kiev");
            System.out.println("Full price: " + calculatePrice(basePrice));
            System.out.println("<-------------------------------------------------->");
        } else if (customerCity == "Одесса") {
            System.out.println("<---------------------------------------------------->");
            System.out.println("We're happy to say the package is on the way to Odessa");
            System.out.println("Full price: " + calculatePrice(basePrice));
            System.out.println("<---------------------------------------------------->");
        } else if (customerCity == "Днепр") {
            System.out.println("<--------------------------------------------------->");
            System.out.println("We're happy to say the package is on the way to Dnepr");
            System.out.println("Full price: " + calculatePrice(basePrice));
            System.out.println("<--------------------------------------------------->");
        } else if (customerCity == "Харьков") {
            System.out.println("<----------------------------------------------------->");
            System.out.println("We're happy to say the package is on the way to Kharkov");
            System.out.println("Full price: " + calculatePrice(basePrice));
            System.out.println("<----------------------------------------------------->");
        } else {
            System.out.println("<------------------------------------------------------------------------->");
            System.out.println("We're sorry to say but there's no opportunity to deliver you're electronics");
            System.out.println("<------------------------------------------------------------------------->");
        }
    }

    @Override
    public double calculatePrice(int basePrice) {
        double fullPrice = basePrice;
        if (basePrice>1000) {
            fullPrice = basePrice * 0.05;
        } else if (customerCity == "Киев") {
            fullPrice = basePrice + basePrice * 0.15;
        } else if (customerCity == "Одесса") {
            fullPrice = basePrice + basePrice * 0.15;
        } else {
            fullPrice = basePrice + basePrice * 0.10;
        }
        return fullPrice;
    }

    public ElectronicsOrder(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
        this.itemName = itemName;
        this.dateCreated = dateCreated;
        this.shipToCity = shipToCity;
        this.basePrice = basePrice;

        if (customerOwned.getGender() == "Мужчина"){
            System.out.println("<--------------------------------------->");
            System.out.println("Delivery is not available for your gender");
            System.out.println("<--------------------------------------->");
        }
        else {
            validateOrder();
            calculatePrice(basePrice);
        }


    }

    public int getGuaranteeMonths() {
        return guaranteeMonths;
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
