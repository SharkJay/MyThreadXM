package 多线程_1.实现Runnable接口_2;
/*定义一个类MyRunnable实现Runnable接口
在MyRunnable类中重写run()方法
创建MyRunnable类的对象
创建Thread类的对象，把MyRunnable对象作为构造方法的参数
启动线程*/
public class MyRunnableDemo {
    public static void main(String[] args) {

        MyRunnable mr1 = new MyRunnable();
        MyRunnable mr2 = new MyRunnable();

        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);

        t1.start();
        t2.start();
    }
}
