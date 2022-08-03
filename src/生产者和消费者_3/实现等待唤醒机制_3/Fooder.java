package 生产者和消费者_3.实现等待唤醒机制_3;

import java.util.concurrent.ArrayBlockingQueue;

public class Fooder extends Thread {

    private ArrayBlockingQueue<String> list;

    public Fooder(ArrayBlockingQueue<String> list) {
        this.list = list;
    }

    @Override
    public void run() {

        while (true) {
            try {
                String take = list.take();
                System.out.println("吃货从队列中获取了：" + take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
