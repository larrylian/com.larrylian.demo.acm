package dynamicProgramming;

/**
 * Created by Larry 09/09/2017
 */
public class LCSMain {
    public static void main(String[] args) {
        String A1 = "1A2C3D4B56";
        String B1 = "B1D23CA45B6A";
        test(A1, B1);
    }
    public static void test(String A, String B) {
        LCS lcs = new LCS();
        System.out.println(lcs.findLCS(A, A.length(), B, B.length()));
    }
}
