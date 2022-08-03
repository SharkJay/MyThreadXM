package 多线程_1.Thread方法_5.sleep;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                //static void sleep(long millis) 使当前正在执行的线程停留（暂停执行）指定的毫秒数
                /*注意点：
                 * 如果一个类或接口中的方法没有抛出异常，则他们的实现类也不能抛出异常
                 * 比如这里的Runnable接口中的run方法就没有抛出异常，所以sleep遇到异常只能通过try catch解决*/
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //getName方法要在Thread类中或其子类中使用，这里的MyRunnable没有继承Thread
            //所以只能使用currentThread方法使用
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}
