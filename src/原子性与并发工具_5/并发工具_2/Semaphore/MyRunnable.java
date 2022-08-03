package 原子性与并发工具_5.并发工具_2.Semaphore;

import java.util.concurrent.Semaphore;

public class MyRunnable implements Runnable {

    private Semaphore sp = new Semaphore(2);

    @Override
    public void run() {
        try {
            sp.acquire();
            System.out.println("获取通行证");
            Thread.sleep(1000);
            System.out.println("归还通行证");
            sp.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
