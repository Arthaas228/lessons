package lesson8.zad1;

public class Demo {

    public static void main(String[] args) {
        Adder ar = new Adder();
        Arithmetic aa = new Arithmetic();

        System.out.println("RESULT METOD ADD: " + ar.add(10, 20));

        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 120);
        }

        System.out.println("RESULT METOD ARITHMETIC: " + aa.check(mas));
    }

}

