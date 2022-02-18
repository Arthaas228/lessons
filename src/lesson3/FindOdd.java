package lesson3;

public class FindOdd {
    public static void main(String args[]) {
        int NUM = 1000;
        int SUMM = 0;
        for (int i = 1; i <= NUM; i++) {
            if ((i % 2) != 0)
                System.out.println("Found");
            {
                SUMM = SUMM + i;
            }
        }

        System.out.println("Общая сумма нечетных чисел: " + SUMM);

        {


            {
                if (SUMM * 5 > 5000)
                    System.out.println("Bigger");
                else
                    System.out.println("Smaller or equal");


            }
        }
    }
}


