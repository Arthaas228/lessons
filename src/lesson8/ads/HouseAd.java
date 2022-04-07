package lesson8.ads;

public class HouseAd extends Ad{
    String address;
    double square;
    int floors;
    String ownerName;

    public HouseAd(long id, int price, String address, double square, int floors, String ownerName) {
        super(id, price);
        this.address = address;
        this.square = square;
        this.floors = floors;
        this.ownerName = ownerName;
    }

    boolean checkOwner(){
        Owners owners = new Owners();
        for(String owner : owners.owners){
            if (ownerName == owner)
                return true;
        }
        return false;

    }
}
