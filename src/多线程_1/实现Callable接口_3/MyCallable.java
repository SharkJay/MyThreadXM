package 多线程_1.实现Callable接口_3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 20; i++) {
            System.out.println("跟女孩表白" + i + "次");
        }
        return "答应了";
    }
}
