package netease;

import java.util.Scanner;

/**
 * Created by Larry 09/09/2017
 */
public class StringChip {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String str = s.nextLine();
            char[] chars = str.toCharArray();
            char per = chars[0];
            int num = 0;
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] != per) {
                    num++;
                }
                per = chars[i];
            }
            num++;
            double average = (double)chars.length/num;
            System.out.println(String.format("%.2f", average));
        }
    }
}
