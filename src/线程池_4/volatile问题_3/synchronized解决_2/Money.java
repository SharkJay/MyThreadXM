package 线程池_4.volatile问题_3.synchronized解决_2;

public class Money {

    //锁对象
    public static Object lock = new Object();
    public static volatile int money = 100000;

}
