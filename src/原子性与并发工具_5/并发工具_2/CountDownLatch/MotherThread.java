package 原子性与并发工具_5.并发工具_2.CountDownLatch;

import java.util.concurrent.CountDownLatch;

/*public CountDownLatch(int count) 参数传递线程数，表示等待线程数量
public void await() 让线程等待
public void countDown() 当前线程执行完毕*/
public class MotherThread extends Thread {

    private CountDownLatch countDownLatch;


    public MotherThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;

    }

    @Override
    public void run() {
        //等待

        try {
            countDownLatch.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //收拾
        System.out.println("收拾碗筷");
    }
}
