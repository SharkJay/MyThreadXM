package 线程池_4.executors默认线程池_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        //static ExecutorService newCachedThreadPool() 创建一个默认的线程池
        //static newFixedThreadPool(int nThreads) 创建一个指定最多线程数量的线程池

        ExecutorService executorService = Executors.newCachedThreadPool();

        /*Lamdba表达式：
        有一个接口
        接口中有且仅有一个抽象方法*/
        executorService.submit(() -> {
            System.out.println("线程：" + Thread.currentThread().getName() + "执行了！");
        });

        //Thread.sleep(100);

        executorService.submit(() -> {
            System.out.println("线程：" + Thread.currentThread().getName() + "执行！");
        });

        //启动有序关闭，其中先前提交的任务将被执行，但不会接受任何新任务。
        executorService.shutdown();
    }
}
