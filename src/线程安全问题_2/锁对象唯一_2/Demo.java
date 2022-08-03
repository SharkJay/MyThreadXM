package 线程安全问题_2.锁对象唯一_2;

public class Demo {
    public static void main(String[] args) {

        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("窗口一");
        mt2.setName("窗口二");

        mt1.start();
        mt2.start();
    }
}
