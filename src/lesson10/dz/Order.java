package lesson10.dz;

import java.util.Date;

public class Order {
    String itemName;
    Date dateCreated;
    Date dateConfirmed;
    Date dateShipped;
    String shipToCity;
    int basePrice;
    Double totalPrice;
    Customer customerOwned;

    public Order(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned) {
        this.itemName = itemName;
        this.dateCreated = dateCreated;
        this.shipToCity = shipToCity;
        this.basePrice = basePrice;
        this.customerOwned = customerOwned;
    }

    public String getItemName() {
        return itemName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setDateConfirmed(Date dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomerOwned() {

        return customerOwned;
    }

    void validateOrder(){

    }
    void calculatePrice(){

    }
    void confirmShipping(){


    }

}
