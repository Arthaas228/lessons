package lesson10.dz;

import java.util.Arrays;
import java.util.Date;

public class Demo{

    public static void main (String[] args) {


        Customer customer1 = new Customer("Женя", "Харьков", "Мужчина");
        Customer customer2 = new Customer("Тест", "Киев", "Мужчина");


        ElectronicsOrder order1 = new ElectronicsOrder("Phone", new Date(), "Киев", 1000, customer1, 1);
        FurnitureOrder order2 = new FurnitureOrder("Chair", new Date(), "Киев", 600, customer2, "097689");

    }
}
