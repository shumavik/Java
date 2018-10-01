import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        int arr[] = new int[N];
        boolean flag = false;

        for ( int i = 0; i<arr.length; i++)
            arr[i] = num.nextInt();

        for ( int i = 0 ; i<(arr.length - 1) ; i++ )
            if ((arr[i] >= 0 && arr[i+1] >=0) || (arr[i] <= 0 && arr[i+1] <=0))
                flag = true;
        if (flag == true)
            System.out.println("YES");
        else
            System.out.println("NO");

        //System.out.println("Hello World!");
    }
}
