package netease;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Larry 09/09/2017
 */
public class Magic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int n = s.nextInt();
            Stack<String> stack = new Stack();
            int i = n;
            while (i > 0) {
                if (i%2 == 0) {
                    stack.push("2");
                    i = (i-2)/2;
                } else {
                    stack.push("1");
                    i = (i-1)/2;
                }
            }
            String result = "";
            while (!stack.isEmpty()) {
                result += stack.pop();
            }
            System.out.println(result);
        }
    }
}
