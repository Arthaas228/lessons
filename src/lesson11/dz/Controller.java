package lesson11.dz;

public class Controller implements API {
    API[] apis;

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }

    @Override
    public void BookingComAPI() {

    }

    @Override
    public void TripAdvisorAPI() {

    }

    @Override
    public void GoogleAPI() {

    }

}

