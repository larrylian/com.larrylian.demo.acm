import java.util.Scanner;

/**
 * Created by Larry 18/09/2017
 */
public class Read {
    public static int num = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        num = 0;
        while (s.hasNext()) {
            String str = s.nextLine();
            if (str.contains("u51")) {
                num++;
            }
        }
        System.out.println(num);
    }
}
