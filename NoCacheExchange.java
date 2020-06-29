package OJ;

import java.util.Scanner;

public class NoCacheExchange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[]arr = {m,n};
        System.out.println(exchange(arr));
    }

    public static int[] exchange(int[]AB){
        AB[0] ^= AB[1];
        AB[1] ^= AB[0];
        AB[0] ^= AB[1];
        return AB;
    }
}
