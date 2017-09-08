import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

public class ArraySort {

    public static void main(String[] args) {
        int[] array = {1, 2, 6, 3, 7, 9};
        Arrays.sort(array);
        for (int i : array) {
            System.out.println(i);
        }
        Model[] modelArray = new Model[4];
        modelArray[0] = new Model(2, 15);
        modelArray[1] = new Model(1, 14);
        modelArray[2] = new Model(20, 3);
        modelArray[3] = new Model(14, 22);
        List<Model> modelList = new ArrayList<>();
        for (int i = 0; i <modelArray.length; i++) {
            modelList.add(modelArray[i]);
        }
        Arrays.sort(modelArray, new ModelComparator());
        printModel(modelArray);
        Collections.sort(modelList, new ModelComparator());
        printModelList(modelList);

    }
    public static void printModel(Model[] models) {
        for (Model model: models) {
            System.out.println(String.format("Model id: %d age: %d", model.getId(), model.getAge()));
        }
    }
    public static void printModelList(Collection<Model> modelList) {
        Iterator iterator = modelList.iterator();
        while (iterator.hasNext()) {
            Model model = (Model)iterator.next();
            System.out.println(String.format("Model id: %d age: %d", model.getId(), model.getAge()));
        }
    }
    public static class Model {
        private int id;
        private int age;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Model(int id, int age) {
            this.id = id;
            this.age = age;
        }
    }
    public static class ModelComparator implements Comparator<Model> {
        @Override
        public int compare(Model model1, Model model2) {
            return -Integer.compare(model1.getId(), model2.getId());
        }
    }
}
