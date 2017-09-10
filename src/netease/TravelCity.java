package netease;


import java.util.Scanner;

/**
 * Created by Larry 10/09/2017
 */
public class TravelCity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int n = s.nextInt();
            int l = s.nextInt();
            int numVisted = 0;
            int[] city = new int[n];
            for (int i = 1; i <n; i++) {
                city[i] = s.nextInt();
            }

            int deep = findDeep(city, 0);
            if (l <= deep) {
                numVisted = l+1;
            } else {
                numVisted = deep+1+(l-deep)/2;
            }
            System.out.println(numVisted);
        }
    }
    public static int findDeep(int[] city, int index) {
        int max = 0;
        int num = 0;
        for (int i = 1; i < city.length; i++) {
            if (city[i] == index) {
                num++;
                int tmp = findDeep(city, i);
                if (tmp > max) {
                    max = tmp;
                }
            }
        }
        if (num == 0) {
            return 0;
        } else {
            return max+1;
        }
    }
}
