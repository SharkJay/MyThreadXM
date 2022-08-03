package 多线程_1.实现Callable接口_3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*V call() 计算结果，如果无法计算结果，则抛出一个异常
FutureTask(Callable callable) 创建一个 FutureTask，一旦运行就执行给定的 Callable
V get() 如有必要，等待计算完成，然后获取其结果
参数类型
V - 该FutureTask的 get方法返回的结果类型
*/
public class MyCallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyCallable mc = new MyCallable();

        //FutureTask是Future的实现类，也是Runnable接口的实现类，既然是Runnable的实现类，
        // 就可以直接传入Thread的带参数构造方法中

        //FutureTask​(Callable<V> callable) 创建一个 FutureTask ，它将在运行时执行给定的 Callable 。
        FutureTask<String> ft = new FutureTask<String>(mc);

        //ft是Runnable的实现类，传入即可
        Thread t1 = new Thread(ft);
        t1.start();

        //V get​() 等待计算完成，然后检索其结果。
        String s = ft.get();
        System.out.println(s);
    }
}

/*定义一个类MyCallable实现Callable接口
在MyCallable类中重写call()方法
创建MyCallable类的对象
创建Future的实现类FutureTask对象，把MyCallable对象作为构造方法的参数
创建Thread类的对象，把FutureTask对象作为构造方法的参数
启动线程
再调用get方法，就可以获取线程结束之后的结果。*/