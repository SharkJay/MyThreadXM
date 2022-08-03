package 多线程_1.继承Thread_1;
/*实现步骤
定义一个类MyThread继承Thread类
在MyThread类中重写run()方法
创建MyThread类的对象
启动线程*/

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程运行了----" + i);
        }
    }

}
