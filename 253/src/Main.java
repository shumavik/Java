import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt(); // столбец
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
        System.out.print("YES");
        else
        System.out.print("NO");
    }
}
