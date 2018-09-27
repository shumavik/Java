import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        boolean flag = false;
       while (N % 2 == 0){
           N >>= 1;
           if (N  == 1)
               flag = true;
       }
       if (flag == true || N == 1)
           System.out.println("YES");
       else
           System.out.println("NO");
    }
}
