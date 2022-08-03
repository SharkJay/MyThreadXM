package 线程安全问题_2.锁对象唯一_2;

public class MyThread extends Thread {

    //被static关键字修饰的变量可以被类的所有对象共享
    //在类的对象创建之前就已经写入字节码文件
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket <= 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "正在卖票，还剩" + ticket + "张");
                }
            }
        }
    }
}
