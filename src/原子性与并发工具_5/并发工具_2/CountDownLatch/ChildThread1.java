package 原子性与并发工具_5.并发工具_2.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class ChildThread1 extends Thread {
    private CountDownLatch countDownLatch;
    //private String name;

    public ChildThread1(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        //this.name = name;
    }

    @Override
    public void run() {


        //吃饺子
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "正在吃第" + i + "个饺子");
        }
        //吃完汇报
        countDownLatch.countDown();
    }
}
