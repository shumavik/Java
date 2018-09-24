import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        //float x = num.nextFloat();
        //System.out.println(x);
        //float y = num.nextFloat();
        float x = Float.parseFloat(num.nextFloat());
        float x = 1.5f;
        float y = 0.25f;
        if (x >= 0 && x <= Math.PI && y >= 0 &&  y <= 0.5 && y <= Math.sin(x))
            System.out.println("YES");
        else
            System.out.println("No");

    }
}
