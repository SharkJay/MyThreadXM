package 原子性与并发工具_5.原子性_1.AtomicInteger_1.内存解析_2;

public class Demo {
    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();

        for (int i = 0; i < 100; i++) {
            new Thread(mr).start();
        }
    }
}
