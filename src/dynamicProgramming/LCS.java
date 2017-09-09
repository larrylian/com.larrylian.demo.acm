package dynamicProgramming;

import com.sun.deploy.util.StringUtils;

/**
 * Created by Larry 09/09/2017
 */
public class LCS {
    private int[][] state;
    public int findLCS(String A, int n, String B, int m) {
        this.state = new int[n+1][m+1];
        initArray(state);
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        return findLCS(charA, n, charB, m);
    }
    public int findLCS(char[] A, int n, char[] B, int m) {
        if (n == 0 || m == 0) {
            state[n][m] = 0;
            return 0;
        } else if (state[n][m] != Integer.MIN_VALUE) {
            return state[n][m];
        } else if (A[n-1] == B[m-1]) {
            int num = findLCS(A, n-1, B, m-1) + 1;
            state[n][m] = num;
            return num;
        } else {
            int num = Math.max(findLCS(A, n, B, m-1), findLCS(A, n-1, B, m));
            state[n][m] = num;
            return num;
        }

    }
    public void initArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = Integer.MIN_VALUE;
            }
        }
    }
}
