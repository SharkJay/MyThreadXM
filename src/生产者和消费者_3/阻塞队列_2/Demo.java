package 生产者和消费者_3.阻塞队列_2;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        // 创建阻塞队列的对象,容量为 1
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<String>(1);

        //存储元素
        arrayBlockingQueue.put("汉堡包");

        //取元素
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());

        System.out.println("程序结束了");
    }
}
