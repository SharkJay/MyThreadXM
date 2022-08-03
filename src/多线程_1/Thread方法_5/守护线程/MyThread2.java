package 多线程_1.Thread方法_5.守护线程;

public class MyThread2 extends Thread {

    public MyThread2() {
    }

    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName() + "---" + i);
        }
    }
}
