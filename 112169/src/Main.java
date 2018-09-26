import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float x = num.nextFloat();
        float y = num.nextFloat();
        if ( (y <= Math.sqrt(1 - x*x) && y >= x) || (y <= 0 && y >= (-1)*Math.sqrt(1 - x*x) && x <= 0 ) )
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
