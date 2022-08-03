package 多线程_1.Thread方法_5.守护线程;

public class MyThread1 extends Thread {

    public MyThread1() {
    }

    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + "---" + i);
        }
    }
}
