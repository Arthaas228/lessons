package test;

public class test1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        int c = inFunc(a, b);
        System.out.println(c);

    }


    public static int inFunc(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;



    }
}

