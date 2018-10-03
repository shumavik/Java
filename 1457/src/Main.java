import java.util.ArrayList;
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

        int [] mas = new int[N];
        int k = 0;

        for (int i = 0; i < N ; i++)
            P[i] = i + 1;

        for ( int i = B - 1 ; i >= A - 1; i-- ) {
            mas[k] = P[i]; k++;
        }

        for ( int i = B - 1 ; i >= A - 1; i-- ) {
            P[i] = mas[k - 1]; k--;
        }

        k = 0;

        for ( int i = D - 1 ; i >= C - 1; i-- ) {
            mas[k] = P[i]; k++;
        }

        for ( int i = D - 1 ; i >= C - 1; i-- ) {
            P[i] = mas[k - 1]; k--;
        }


        for (int item:P)
            System.out.print(item + " ");
    }
}
