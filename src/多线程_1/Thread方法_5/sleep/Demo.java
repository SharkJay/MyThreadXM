package 多线程_1.Thread方法_5.sleep;

public class Demo {
    public static void main(String[] args) {

        //创建Runnable实现类对象
        MyRunnable mr = new MyRunnable();

        //创建线程对象
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        //给线程命名
        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

    }
}
