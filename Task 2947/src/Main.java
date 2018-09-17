import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        System.out.println((n % (1440 * 60)) / 3600 + ":" + (n / 60 % 60 /10) + (n / 60 % 60 %10) + ":" + n % 60 /10 +  n % 60 %10);
    }
}
