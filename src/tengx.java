import java.util.Scanner;
public class tengx{
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[][] dis = new int[n][n];
            for (int i = 0; i< n; i++) {
                String str = s.nextLine();
                char[] chars = str.toCharArray();
                for (int j = 0; j< chars.length;j++) {
                    dis[i][j] = Integer.valueOf(chars[j]);
                }
            }

        }
    }
}