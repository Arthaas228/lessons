package lesson5;


import java.util.Arrays;

public class Withdraw {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina"};
        int[] balances = {100, 500, 8432, 99, 12000, -54};


        System.out.println(withdraw(names, balances, "Ann", 300));
        System.out.println(Arrays.toString(balances));

    }
    public static int withdraw(String[] clients, int[] balances, String client, int money) {
        int index = findClientsIndexByName(clients, client);

        if (balances[index] >= money)

            balances[index] -= money;
        else
            balances[index] = -1;
        return balances[index];

    }

    public static int findClientsIndexByName(String[] clients, String client) {
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }

}