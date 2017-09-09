package netease;

import java.util.Scanner;

/**
 * Created by Larry 09/09/2017
 */
public class FourSequence {
    public final static String YES= "Yes";
    public final static String NO = "No";
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int t = s.nextInt();
            String[] result = new String[t];
            for (int i = 0; i < t; i++) {
                int n = s.nextInt();
                int[] seq = new int[n];
                for (int j = 0; j < n; j++) {
                    seq[j] = s.nextInt();
                }
                result[i] = isValid(seq);
            }
            for (String str: result) {
                System.out.println(str);
            }
        }
    }
    public static String isValid(int[] seq) {
        String reply = YES;
        if (seq.length == 1) {
            if (seq[0]%4 != 0) {
                reply = YES;
            }
            return reply;
        }
        int num = 0;
        int num_4 = 0;
        for (int i : seq) {
            if (i%2 != 0) {
                num++;
            } else {
                if (i%4 == 0) {
                   num_4 ++;
                }
            }

        }
        int num_2 = seq.length-num-num_4;
        if (num_2>0) {
            if (num_4 < num ) {
                reply = NO;
            }
        } else {
            if (num_4 < num-1) {
                reply = NO;
            }
        }
        return reply;
    }
}
