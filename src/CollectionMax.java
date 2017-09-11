import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Larry 10/09/2017
 */
public class CollectionMax {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(1);
        int max = Collections.max(list, new ListComparator());
        System.out.println(max);
    }
    private static class ListComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return Integer.compare(a, b);
        }
    }
}
