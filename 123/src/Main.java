import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int k = 1;
        for (int i = 0; i < n; i++) {
            k = k << 1;
        }
        System.out.println(k);
    }
}
