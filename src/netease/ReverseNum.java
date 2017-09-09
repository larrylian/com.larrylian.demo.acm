package netease;


import java.util.Scanner;

/**
 * Created by Larry 09/09/2017
 */
public class ReverseNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int n = s.nextInt();
            String nStr = Integer.toString(n);
            String nStrReverse = new StringBuilder(nStr).reverse().toString();
            int nReverse = Integer.valueOf(nStrReverse);
            int sum = n + nReverse;
            System.out.println(sum);
        }
    }
}
