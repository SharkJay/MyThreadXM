package 多线程_1.Thread方法_5.守护线程;
/*public final void setDaemon​(boolean on)将此线程标记为daemon线程或用户线程。
当运行的唯一线程都是守护进程线程时，Java虚拟机将退出。
线程启动前必须调用此方法。
*/
public class Demo {
    public static void main(String[] args) {

        MyThread1 mt1 = new MyThread1("女神线程1");
        MyThread2 mt2 = new MyThread2("备胎线程2");

        //将备胎线程设置为守护线程
        //女神线程执行完毕后，备胎线程会再挣扎一会才关闭
        mt2.setDaemon(true);

        mt1.start();
        mt2.start();

    }
}
