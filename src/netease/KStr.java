package netease;

import java.util.*;

/**
 * Created by Larry 09/09/2017
 */
public class KStr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            String str = s.nextLine();
            char[] strArray = str.toCharArray();
            Set map = new HashSet();
            map.add(str);
            char per = ' ';
            for (int i = 0; i< strArray.length-1; i++) {
                if (per == strArray[i]) {
                    continue;
                }
                for (int j =1 ; j < strArray.length; j++) {
                    if (strArray[j] != strArray[i]) {
                        String strTmp = insert(strArray, i, j);
                        if (!map.contains(strTmp)) {
                            if (isValid(strTmp)) {
                                map.add(strTmp);
                            }
                        }
                    }
                }
            }
            System.out.println(map.size()-1);
        }
    }
    public static String insert(char[] A, int start, int end) {
        char[] B = new char[A.length];
        int index = 0;
        for(int j = 0; j<A.length; j++) {
            if (j == start) {
                continue;
            } else if (j == end) {
                B[index] = A[start];
                index++;
                B[index] = A[j];
            } else {
                B[index] = A[j];
            }
            index++;
        }
        return String.valueOf(B);
    }
    public static boolean isValid(String str) {
        char[] chars = str.toCharArray();
        Stack stack = new Stack();
        for (char c : chars) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return true;
    }
}
