package lesson2;

public class SumOfNumbers {
    public static void main(String[] args) {

        int total = 0;
        int b = 1234;
        int c = total;
        int d = total;

        for (int value = 1; value <= 1000; value++) {


            total = total + value;
        }
        c = total / b;
        d = total % b;
        boolean res = d > c;
        System.out.println(res);

    }

}