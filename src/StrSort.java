import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Larry 18/09/2017
 */
public class StrSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String str = s.nextLine();
            char[] chars = str.toCharArray();
            List<Character> list = new LinkedList();
            for (int i = 0 ; i< chars.length; i++) {
                insert(chars[i], list);
            }
            char[] chars2 = new char[chars.length];
            for (int i =0; i < list.size(); i++) {
                chars2[i] = list.get(i);
            }
            System.out.println(new String(chars2));
        }
    }
    public static void insert(char s, List<Character> list) {
        if (Character.isLetter(s)) {
            if (list.isEmpty()){
                list.add(s);
                return;
            }
            for (int i =0; i< list.size(); i++) {
                if (!Character.isLetter(list.get(i))) {
                    list.add(i, s);
                    break;
                }
                if (Character.toUpperCase(s) < Character.toUpperCase(list.get(i))) {
                    list.add(i, s);
                    break;
                } else if (Character.toUpperCase(s) == Character.toUpperCase(list.get(i))) {
                    if (s >= list.get(i)) {
                        list.add(i, s);
                        break;
                    } else {
                        if (i == list.size() || Character.toUpperCase(s) < Character.toUpperCase(list.get(i+1))) {
                            list.add(i+1, s);
                        } else {
                            if (i == list.size()-1){
                                list.add(s);
                                break;
                            }
                            continue;
                        }
                    }
                }
            }
        }else {
            list.add(s);
        }
    }
}
