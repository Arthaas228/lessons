package lesson5;

import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {
        int a;
        a = 10;

        int[] firtsArray = new int[4];
        System.out.println(Arrays.toString(firtsArray));

        firtsArray[0] = 11;
        firtsArray[1] = 444;
        firtsArray[2] = -10;

        for (int i = 0; i < firtsArray.length; i++) {
            System.out.println(firtsArray[i]);
        }
        System.out.println(Arrays.toString(firtsArray));


        int b = 10;
        int[] secondArray = {1, 10, 15, 20, -50};
        System.out.println(Arrays.toString(secondArray));

        for (int element : secondArray) {
            System.out.println(element);
        }

        for (int i = 0; i < firtsArray.length; i++) {
            int element = firtsArray[i];
            System.out.println(element);

    }
}
}