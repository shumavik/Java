import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        System.out.print((n%(60*20*10*5))+" "+(n%(60*20*10))/5 +" "+ (n%(60*20))/10+" "+(n%60)/20+" " +n/60);
    }
}

