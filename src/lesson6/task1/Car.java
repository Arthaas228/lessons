package lesson6;

public class Car {
    int price;
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;


    // 2 constructors

    public Car(int price, int yearOfManufacturing, String ownerName) {

        this.price = price;
        this.yearOfManufacturing = yearOfManufacturing;
        this.ownerName = ownerName;
    }


    //3 methods

    void startRun() {
        System.out.println("I am running....");
    }

    void stopRunning() {
        System.out.println("I am stopping....");
    }

    void changeOwner(String newOwnerName) {
        ownerName = newOwnerName;
    }
    // inner clas


}
