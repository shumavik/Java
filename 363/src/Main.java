import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int m = num.nextInt();
        int k = 0;
        int len = 0;

        int A[][] = new int[n][m];

        for (int i = 0 ; i < n ; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = k; k++;
                }
            }
            else{
                for (int j = m - 1 ; j >= 0 ; j--){
                    A[i][j] = k; k++;
                }
            }
        }
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                len = String.valueOf(A[i][j]).length();
                if ( len == 1)
                    System.out.print("  " + A[i][j]);
                else if (len == 2)
                    System.out.print(" " + A[i][j]);
                else
                    System.out.print(A[i][j]);
            }
        System.out.println();
        }
        //System.out.println("Hello World!");
    }
}
