package dynamicProgramming;

/**
 * Created by Larry 09/09/2017
 */
public class AscentSequence {
    public int findLongest(int[] A, int n) {
        int[] state = new int[n];
        state[0] = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]) {
                    max = Math.max(max, state[j] +1);
                } else {
                    max = Math.max(max, 1);
                }
            }
            state[i] = max;
        }
        return getMax(state);
    }
    public static int getMax(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int i : A) {
            max = Math.max(i, max);
        }
        return max;
    }
}
