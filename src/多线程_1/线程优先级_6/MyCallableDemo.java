package 多线程_1.线程优先级_6;

import java.util.concurrent.FutureTask;
/*final int getPriority() 返回此线程的优先级
final void setPriority(int newPriority)更改此线程的优先级线程默认优先级是5；
线程优先级的范围是：1-10*/
public class MyCallableDemo {
    public static void main(String[] args) {

        //创建两个Callable接口实现类
        MyCallable mc1 = new MyCallable();
        MyCallable mc2 = new MyCallable();

        FutureTask<String> ft1 = new FutureTask<String>(mc1);
        FutureTask<String> ft2 = new FutureTask<String>(mc2);

        //创建两个线程对象
        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        //设置线程名称
        t1.setName("飞机");
        t2.setName("坦克");

        //设置优先级
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();

    }
}
