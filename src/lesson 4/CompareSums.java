public class CompareSums {

    public static int sum(int from, int to) {
        if (to <= from)
            return 0;
        int res = 0;
        for (int i = from; i <= to; i++) {
            res += i;
        }
        return res;
    }

    public static boolean compareSums(int a, int b, int c, int d) {
        return sum(a, b) > sum(c, d);
    }

    public static void main(String[] args) {
        CompareSums sums = new CompareSums();
        System.out.println(sums.compareSums(0, 10, 11, 20));
        System.out.println(sums.compareSums(11, 20, 0, 10));
    }
}
