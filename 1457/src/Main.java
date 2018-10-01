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
        for (int i = 0; i < N ; i++)
            P[i] = i + 1;
        for ( int i = B - 1 ; i > A ; i-- )
            System.out.println(P[i]);

       // System.out.println("Hello World!");
    }
}
