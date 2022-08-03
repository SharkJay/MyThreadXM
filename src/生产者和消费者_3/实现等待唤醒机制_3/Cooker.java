package 生产者和消费者_3.实现等待唤醒机制_3;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread {

    private ArrayBlockingQueue<String> list;
    //Cooker类的带参数构造方法
    public Cooker(ArrayBlockingQueue<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        //不停的做汉堡
        while (true) {
            try {
                list.put("汉堡包");
                System.out.println("厨师做好了一个汉堡");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
