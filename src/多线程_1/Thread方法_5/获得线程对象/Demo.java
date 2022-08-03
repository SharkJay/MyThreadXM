package 多线程_1.Thread方法_5.获得线程对象;

public class Demo {
    public static void main(String[] args) {
        /*void setName(String name) 将此线程的名称更改为等于参数name
String getName() 返回此线程的名称
Thread currentThread() 返回对当前正在执行的线程对象的引用*/

        //Thread.currentThread()先获得当前正在执行的线程的对象
        //Thread.currentThread().getName()用线程对象调用getName方法获取线程名称
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
