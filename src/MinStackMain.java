/**
 * Created by Larry 09/09/2017
 */
public class MinStackMain {
    public static void main(String[] args) {

        int[] num1 = {1, 3, 5, 2, 1, 7, 11};
        int[] num2 = {44, 22, 21, 3};
        testMinStatck(num1);
        testMinStatck(num2);
    }

    public static void testMinStatck(int[] nums) {
        MinStack minStack = new MinStack();
        for (int i : nums) {
            minStack.push(i);
        }
        System.out.println(minStack.min());
    }
}
