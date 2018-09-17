import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt(); // столбец
        int b = num.nextInt(); // строка
        int a2 = num.nextInt(); // 2 столбец
        int b2 = num.nextInt(); // 2 строка
        if ((Math.abs(a-a2)==1&&b==b2) || (Math.abs(b-b2)==1&& a==a2)||(Math.abs(b-b2)==1&& Math.abs(a-a2)==1))  {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}
