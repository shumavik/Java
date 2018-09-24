import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float x = num.nextFloat();
        float y = num.nextFloat();
        if (x >= 0 && x <= Math.PI && y >= 0 &&  y <= 0.5 && y <= Math.sin(x))
            System.out.println("YES");
        else
            System.out.println("No");

    }
}
