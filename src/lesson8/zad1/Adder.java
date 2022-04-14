
package lesson8.zad1;

public class Adder extends Arithmetic {


    int add(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        Adder ac = new Adder();
        System.out.println(ac.add(x, y));
    }
}
