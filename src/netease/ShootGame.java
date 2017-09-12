package netease;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Larry 12/09/2017
 */
public class ShootGame {
    public static int[] xx;
    public static int[] yy;
    public static int[][][] state;
    public static int count;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int n = s.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i< n; i++) {
                x[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                y[i] = s.nextInt();
            }
            xx = x;
            yy = y;
            state = new int[n][n][n];
            count = n;
            if (count <= 3) {
                System.out.println(count);
                continue;
            }
            if (isLine()) {
                System.out.println(count);
                continue;
            }
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    for (int g = 0; g < n; g++) {
                        if (getK(i,j) == getK(i,g)) {
                            state[i][j][g] = -1;
                            continue;
                        }
                        if (state[i][j][g] != -1) {
                            state[i][j][g] = findNum(i,j,g);
                        }
                    }
                }
            }
            int max= 0;
            for (int i = 0; i <n; i++) {
                for(int j = i+1; j < n; j++) {
                    for (int g =0; g< n; g++) {
                        if (state[i][j][g] > max) {
                            max = state[i][j][g];
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
    public static int findNum(int i, int j, int g) {
        if (g == i || g == j) {
            return -1;
        }
        int point = 0;
        int allCount = 3;
        while (point < count){
            if (point == i || point ==j || point == g) {
                point++;
                continue;
            }
            if (isValied(i, j, g, point)) {
                allCount ++;
            }
            point++;
        }
        return allCount;
    }
    public static boolean isValied(int i, int j, int g, int point) {
        float k = getK(i, j);
        float k2 = getK(point, j);
        if (k == k2) {
            state[i][point][g] = -1;
            state[j][point][g] = -1;
            state[point][i][g] = -1;
            state[point][j][g] = -1;
            return true;
        }
        float k3 = getK(g, point);
        float kV;
        if (k==0) {
            kV = Integer.MAX_VALUE;
        } else if (k == Integer.MAX_VALUE) {
            kV = 0;
        }else {
            kV = -1/k;
        }
        if (kV == k3) {
            return true;
        } else {
            return false;
        }
    }
    public static float getK(int x1, int x2) {
        if ((xx[x1] - xx[x2]) == 0) {
            return Integer.MAX_VALUE;
        }
        int y = yy[x1] - yy[x2];
        int x = xx[x1] - xx[x2];
        float k = (float)y/x;
        return k;
    }
    public static boolean isLine() {
        boolean isXSame = true;
        boolean isYSame = true;
        for (int i = 1; i < count; i++) {
            if (xx[i] != xx[0]) {
                isXSame = false;
            }
            if (yy[i] != yy[0]) {
                isYSame = false;
            }
        }
        return (isXSame||isYSame);
    }
}
