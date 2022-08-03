package 原子性与并发工具_5.并发工具_2.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Demo {
    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(3);

        MotherThread motherThread = new MotherThread(countDownLatch);
        motherThread.setName("妈妈");
        motherThread.start();

        ChildThread1 childThread1 = new ChildThread1(countDownLatch);
        childThread1.start();

        ChildThread2 childThread2 = new ChildThread2(countDownLatch);
        childThread2.start();

        ChildThread3 childThread3 = new ChildThread3(countDownLatch);
        childThread3.start();
    }
}
