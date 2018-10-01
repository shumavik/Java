import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        int[] P = new int[N];
        int A = num.nextInt();
        int B = num.nextInt();
        int C = num.nextInt();
        int D = num.nextInt();
        int k = P[0];
        int j = 0;

        for (int i = 0; i < N ; i++)
            P[i] = i + 1;
        for ( int i = A ; i < B; i++ ) {
            System.out.println(P[i]);
            k = P[i];
            P[i] = P[B - i];
            P[B - i] = k;

        }
        for (int item:P)
            System.out.println(item);
       /* for ( int i = D - 1 ; i >= (C + 1) ; i-- ) {
            k = P[i];
            P[i] = P[i - 1];
            P[i - 1] = k;
        }
        */


       // System.out.println("Hello World!");
    }
}
