package 生产者和消费者_3.实现等待唤醒机制_3;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {

        //创建一个阻塞队列、
        ArrayBlockingQueue<String> list = new ArrayBlockingQueue<String>(1);

        //创建线程对象(带参数构造），两个线程使用同一个队列
        //创建生产者线程和消费者线程对象,构造方法中传入阻塞队列对象
        Cooker c = new Cooker(list);
        Fooder f = new Fooder(list);

        c.start();
        f.start();
    }
}
