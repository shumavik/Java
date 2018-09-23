import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
       /* System.out.print((n%(60*20*10*5))+" "+(n%(60*20*10))/5 +" "+ (n%(60*20))/10+" "+(n%60)/20+" " +n/60);
        if (((n % 60 % 20 % 10 % 5) * 15 + (n % 60 % 20 % 10 / 5) * 70 + (n % 60 % 20 / 10) * 125 + ( n % 60 / 20 ) * 230 + ( n / 60) * 440) <= (( n / 60) * 440) && (n  / 60) != 0)
        System.out.print( ((n % 60) % 20 % 10 % 5) + " " + ((n % 60) % 20 % 10 / 5) + " " + ((n % 60) % 20 / 10) + " " + ( (n % 60) / 20 ) + " " + ( n / 60) );
        else
            //System.out.print(( n / 60));
            System.out.print( 0 + " " + 0 + " " + 0 + " " + 0 + " " + 1 );
        */
        final int p1 = 15, p5 = 70, p10 = 125, p20 = 230, p60 = 440;
        int k1 = 0,k5 = 0,k10 = 0,k20 = 0,k60 = 0;
        String res = "";
        k1 = n % 60 % 20 % 10 % 5;
        k5 = n % 60 % 20 % 10 / 5;
        k10 = n % 60 % 20 / 10;
        k20 = n % 60 / 20;
        k60 = n / 60;
        if((k1 * p1 + k5 * p5 + k10 * p10 + k20 * p20 + k60 * p60 - p60 * (k60 + 1)) >= 0){
            k60 += 1;
            k1 = k5 = k10 = k20 = 0;
        }
        if(k1 * p1 + k5 * p5 + k10 * p10 + k20 * p20 - p20 * (k20 + 1) >= 0 ){
            k20 += 1;
            k1 = k5 = k10 = 0;
        }
        if(k1 * p1 + k5 * p5 + k10 * p10 - p10 * (k10 +1 ) >= 0){
            k10 += 1;
            k1 = k5 = 0;
        }
        if(k1 * p1 + k5 * p5 - p5 * (k5 + 1) >= 0 ){
            k5 += 1;
        }


        res = k1 + " " + k5 + " " + k10 + " " + k20 + " " + k60;
        System.out.print(res);
    }
}

