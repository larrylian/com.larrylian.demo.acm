package netease;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Larry 09/09/2017
 */
public class Sequence {
    private static int n;
    private static int k;
    private static int[][] state;
    public final static int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            n = s.nextInt();
            k = s.nextInt();
            state = new int[n][k];

            for(int i = 0; i<k; i++) {
                state[0][i] = 1;
            }

            for(int i = 1; i<n; i++) {
                int sum = 0;
                for (int j = 0; j< k; j++) {
                    sum = (sum + state[i-1][j])%MOD;
                }
                for (int j = 1; j <= k; j++) {
                    int sumJ = sum;
                    int p = 2;
                    while (p*j <= k) {
                        sumJ = (sumJ - state[i-1][p*j-1] + MOD)%MOD;
                        p++;
                    }
                    state[i][j-1] = sumJ;
                }
            }
            long sumI = 0;
            for (int i = 0; i < k; i++) {
                sumI = (sumI + state[n-1][i])%MOD;
            }
            System.out.println(sumI);
        }
    }
    public static Set findPerNumSet(int b) {
        Set perNumSet = new HashSet();
        for(int i = 1; i <= b; i++) {
            perNumSet.add(i);
        }
        for(int i = b+1; i<= k; i++) {
            if (i%b != 0) {
                perNumSet.add(i);
            }
        }
        return perNumSet;
    }


}
