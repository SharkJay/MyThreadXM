package 多线程_1.设置获取线程名称_4;

public class Demo {
    public static void main(String[] args) {

        //通过MyThread的带参数构造方法传入到其继承的Thread方法中
        /*MyThread mt1 = new MyThread("线程1");
        MyThread mt2 = new MyThread("线程2");*/

        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("牛逼");
        mt2.setName("加油");

        mt1.start();
        mt2.start();
    }
}
