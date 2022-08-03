package 线程安全问题_2.同步方法_3;

public class Demo {
    public static void main(String[] args) {

        tickets t = new tickets();

        //tickets对象只创建一次，接下来创建两个线程Thread对象，把tickets对象传入，两个线程对象操作一个tickets
        //synchronized中的this是同一个
        Thread t1 = new Thread(t, "窗口一");
        Thread t2 = new Thread(t, "窗口二");

        t1.start();
        t2.start();
    }
}
