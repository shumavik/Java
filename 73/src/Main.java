import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        int arr[] = new int[N];


        for ( int i = 0; i<arr.length; i++)
            arr[i] = num.nextInt();

        int k = 1;

        for (int i = 0; i < (arr.length-1); i++)
            if (arr[1] != arr[i+1])
                k +=1;

        System.out.println(k);
        //System.out.println("Hello World!");
    }
}
