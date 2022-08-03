package 原子性与并发工具_5.并发工具_2.Semaphore;

public class Demo {
    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();

        for (int i = 0; i < 10; i++) {
            new Thread(mr).start();
        }
    }
}
