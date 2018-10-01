import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int [][] mas = new  int[n][n];
        for (int i = 0; i < n ; i++)
            for (int j = 0; j < n; j++)
                if ( i == n - j -1)
                    mas [i][j] = 1;
                else if ( i < n - j -1)
                    mas [i][j] = 0;
                else
                    mas [i][j] = 2;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - 1; j++)
                System.out.print(mas[i][j]+ " ");
            System.out.println(mas[i][n-1]);
        }


        //System.out.println("Hello World!");
    }
}
