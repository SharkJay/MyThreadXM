package 线程池_4.ThreadPoolExecutor_2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {

        /*创建线程池对象 :
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(核心线程数量,最大线程数量,空闲线程最
        大存活时间,任务队列,创建线程工厂,任务的拒绝策略);*/

        //自己利用ThreadPoolExecutor创建线程池

        // 参数一：核心线程数量
        // 参数二：最大线程数
        // 参数三：空闲线程最大存活时间
        // 参数四：时间单位
        // 参数五：任务队列（阻塞队列）static ThreadFactory defaultThreadFactory​() 返回用于创建新线程的默认线程工厂。
        // 参数六：创建线程工厂
        // 参数七：任务的拒绝策略（任务过多该怎么办）

        ThreadPoolExecutor tre = new ThreadPoolExecutor(
                1,
                2,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy());

        /*MyRunnable mr = new MyRunnable();

        tre.submit(mr);
        tre.submit(new MyRunnable());*/

        for (int i = 0; i < 4; i++) {
            int y = i;
            tre.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "---" + y);
            });
        }

        tre.shutdown();

    }
}
