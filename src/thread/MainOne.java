package thread;

/**
 * Created by Larry 17/09/2017
 */
public class MainOne {
    public static void main(String[] args) {
        ThreadOne thread1 = new ThreadOne();
        ThreadOne thread2 = new ThreadOne();
        ThreadOne thread3 = new ThreadOne();
        thread1.start();
        thread2.start();
        thread3.start();
//        ThreadTwo threadTwo1 = new ThreadTwo();
//        Thread th1 = new Thread(threadTwo1);
//        Thread th2 = new Thread(threadTwo1);
//        Thread th3 = new Thread(threadTwo1);
//        th1.start();
//        th2.start();
//        th3.start();

    }
}
