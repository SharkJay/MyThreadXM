package 原子性与并发工具_5.原子性_1.AtomicInteger_1.内存解析_2;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable implements Runnable {

    AtomicInteger ac = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            int count = ac.incrementAndGet();

            System.out.println("已经送了：" + count + "个冰淇淋");
        }
    }
}
