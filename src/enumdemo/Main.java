package enumdemo;

import org.omg.CORBA.Object;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by lianjw22529 20/09/2017
 */
public class Main {
    public static void main(String[] args) {
//        Class[] classes = new Class[ReqStatus.values().length];
//        int i =0;
//        for (ReqStatus item : ReqStatus.values()) {
//            classes[i] = item.getClass();
//            i++;
//        }
//        Map<String,String> map = enumToMap(ReqStatus.values());
//        List<String> lit = new ArrayList();
//        test(lit);
        return;
    }
    public static <T> Map<String, String> enumToMap (Class<T>[] enumClassArray) {
        Map<String, String> map = new TreeMap<>();
        for(Class<T> item: enumClassArray) {
            try {
                Method codeMethod = item.getMethod("getCode", null);
                String code = (String)codeMethod.invoke(null, null);
                map.put(code, code);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map;
    }
    public static Map<String, String> enumToMap (java.lang.Object[] objects) {
        Map<String, String> map = new TreeMap<>();
        for (java.lang.Object object: objects) {
            try {
                Class cla = object.getClass();
                Method codeMethod = cla.getMethod("getCode");
                String code = (String)codeMethod.invoke(object);
                map.put(code, code);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return map;
    }
//    public static <K> void test(K obj) {
//        K.add("ddd");
//    }
}
