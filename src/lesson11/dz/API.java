package lesson11.dz;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();

    void BookingComAPI();



    void TripAdvisorAPI();



    void GoogleAPI();


}
