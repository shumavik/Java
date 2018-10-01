import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int [][] mas = new int[n][n];
        boolean flag = true;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n ; j++)
                mas[i][j] = num.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if (mas[i][j] != mas[j][i]3)
                 flag = false;
            }
        }

        if (flag == true)
            System.out.println("YES");
        else
            System.out.println("NO");
        //System.out.println("Hello World!");
    }
}
