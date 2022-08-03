package 线程池_4.ThreadPoolExecutor_2;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("线程：" + Thread.currentThread().getName() + "执行了");
    }
}
