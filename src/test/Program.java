package test;

public class Program {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = {6,7,8,9, 10};

        int[] C = concatArray(A, B);

        for (var number: C) {
            System.out.println(number);
        }
    }
    public static int[] concatArray(int[] A, int[] B){
        int[] C = new int[2*A.length];
        int indexForArrayA = 0;
        int indexForArrayB = 0;
        for (int i = 0; i < C.length; i++) {
            if (i % 2 == 0){
                C[i] = A[indexForArrayA];
                indexForArrayA++;
            }
            else{
                C[i] = B[indexForArrayB];
                indexForArrayB++;
            }
        }

        return C;
    }
}
