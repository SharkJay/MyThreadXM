package 多线程_1.设置获取线程名称_4;

public class MyThread extends Thread {

    /*public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }*/

    public MyThread() {
        super();
    }

    public MyThread(String name) {
        //super调用Thread类中的带参数构造方法，将name赋值到Thread中，然后MyThread就可使用带参数赋值
        /*public Thread​(String name)分配一个新的Thread对象。
        此构造函数与Thread (null, null, name)具有相同的效果。*/
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName() + "----" + i);
        }
    }
}
