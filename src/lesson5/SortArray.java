import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(Arrays.toString(sortDescending(array)));
        System.out.println(Arrays.toString(sortAscending(array)));
    }

    public static int[] sortAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
        return array;
    }

    public static int[] sortDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] < current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
        return array;
    }
}