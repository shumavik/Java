import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final int s = 109;
        int v,t;
        Scanner num = new Scanner(System.in);
        v = num.nextInt();
        t = num.nextInt();
        if (v > 0) {
            System.out.println((v * t ) % s);
        }
        else if (v == 0 || t == 0 || (v * t) % s == 0){
            System.out.println(0);
        }
        else{
            System.out.println(s + (v * t) % s);
        }
    }
}
