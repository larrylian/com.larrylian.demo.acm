package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Larry 17/09/2017
 */
public class ThreadOne  extends Thread{
    public static int i = 0;
    public static Lock lock  = new ReentrantLock();
    @Override
    public void run() {
        synchronized (this.getClass()) {
            try {
                while (i < 100) {
                    System.out.println(String.format("class1:%s ThreadOne i = %d", this.toString(), i));
                    Thread.sleep(100);
                    i++;
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
