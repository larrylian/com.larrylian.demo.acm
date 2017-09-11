/**
 *
 * Created by Larry 11/09/2017
 */

public class GenericMain {
    public static void main(String[] args) {
        Apple apple = new Apple(1, "apple", "yuan");
        Fruit fruit = new Fruit(4, "fruit");
        Generic<Apple> generic = new Generic<>(2, apple);
        generic.show();
        Generic<? extends Apple> generic1 = new Generic<>(3, apple);
        Generic<? super Fruit> generic2 = new Generic<Object>(4, fruit);
        generic2.show();
    }
}