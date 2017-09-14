import java.util.*;

/**
 * Created by Larry 14/09/2017
 */
public class MultiK {
    public static long n;
    public static long m;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            n = s.nextLong();
            m = s.nextLong();
            long k = s.nextLong();
            long sum = 1;
            if (k == 1) {
                System.out.println(1);
                continue;
            }
            for (long i = 2; i <=k;i++) {
                long num = getNum(i);
                sum +=num;
                if (k <= sum) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static long getNum(long x) {
        long count = 0;
        for (long i = 1; i < Math.sqrt(x); i++) {
            if (x%i == 0) {
                if (i <= n && x/i <= m) {
                    count++;
                }
                if (i <= m && x/i <= n) {
                    count++;
                }
            }
        }
        if (Math.sqrt(x) == Math.floor(Math.sqrt(x))) {
            count++;
        }
        return count;
    }
    public static void insertInt(List<Integer> list, int x) {
        if (list.isEmpty()) {
            list.add(x);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > x) {
                list.add(i, x);
                break;
            }
            if (i == list.size()-1) {
                list.add(i+1, x);
                break;
            }
        }
    }
}
