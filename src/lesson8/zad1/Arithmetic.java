package lesson8.zad1;

public class Arithmetic {

    boolean s;

    boolean check(int[] array) {
        int max = array[0];
        int min = array[0];
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
            }
            if (max > array[i]) {
                max = array[i];
            }
        }
        suma = max + min;
        if (suma > 100) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Arithmetic g = new Arithmetic();
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 120);
        }
        System.out.println("RESULT: " + g.check(mas));
    }

}
