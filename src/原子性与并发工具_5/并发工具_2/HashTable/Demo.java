package 原子性与并发工具_5.并发工具_2.HashTable;

import java.util.Hashtable;

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        Hashtable<Integer, Integer> ht = new Hashtable<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 25; i++) {
                ht.put(i, i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 25; i < 51; i++) {
                ht.put(i, i);
            }
        });

        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName());

        Thread.sleep(1000);

        for (int i = 0; i < 51; i++) {
            System.out.println(ht.get(i));
        }
    }
}
