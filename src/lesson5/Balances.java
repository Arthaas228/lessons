import java.util.Arrays;

public class Balances {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina"};
        int[] balances = {100, 500, 8432, 99, 12000, -54};
        System.out.println(Arrays.toString(findClientsByBalance(names, balances, -100)));
        System.out.println(Arrays.toString(findClientsWithNegativeBalance(names, balances)));


        depositMoney(names, balances, "Ann", 2000);
        System.out.println(Arrays.toString(balances));
    }

    public static String[] findClientsByBalance(String[] clients, int[] balances, int n) {

        //1
        int count = 0;
        for (int balance : balances) {
            if (balance >= n)
                count++;
        }
        //2
        String[] results = new String[count];
        //3
        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance >= n) {
                results[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }

        return results;


    }

    public static String[] findClientsWithNegativeBalance(String[] clients, int[] balances) {

        //1
        int count = 0;
        for (int balance : balances) {
            if (balance < 0)
                count++;
        }
        //2
        String[] results = new String[count];
        //3
        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance < 0) {
                results[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }

        return results;


    }

    public static int depositMoney(String[] clients, int[] balances, String client, int money) {
        int index = findClientsIndexByName(clients,client);
        balances[index] += money;
        return balances[index];


    }
    public static int findClientsIndexByName(String[] clients, String client){
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }
    public static int calculateDepositAmountAfterCommission(int money){
        return money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);
    }
    public static int withdrawMoney(String[] clients, int[] balances, String client, int money) {
        int index = findClientsIndexByName(clients, client);
        int balance = balances[index];
        if (balance <= money)
            balance -= money;
        else
            balance=-1;
        return balance;

    }


}
