package 多线程_1.实现Runnable接口_2;

/*定义一个类MyRunnable实现Runnable接口
在MyRunnable类中重写run()方法
创建MyRunnable类的对象
创建Thread类的对象，把MyRunnable对象作为构造方法的参数
启动线程*/

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("实现多线程方式二" + i);
        }
    }
}
