package dynamicProgramming;

/**
 * Created by Larry 09/09/2017
 */
public class AscentSequenceMain {
    public static void main(String[] args) {
        int[] num1 = {2 , 1, 4, 3, 1, 5, 6};
        int[] num2 = {203,39,186,207,83,80,89,237,247};
        test(num1);
        test(num2);

    }
    public static void test(int[] A) {
        AscentSequence ascentSequence = new AscentSequence();
        System.out.println(ascentSequence.findLongest(A, A.length));
    }
}
