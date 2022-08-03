package 线程安全问题_2.lock_4;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {

    //
    private int ticket = 100;

    private Object obj = new Object();
    private ReentrantLock r = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //synchronized (obj) {
            try {
                r.lock();
                if (ticket <= 0) {
                    break;
                } else {
                    Thread.sleep(100);
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "正在卖票，还剩" + ticket + "张");
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
                //finally中的语句一定会执行
            } finally {
                r.unlock();
            }
        }
    }

}
