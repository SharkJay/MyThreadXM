package 线程安全问题_2.同步方法_3;

public class tickets implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {

        while (true) {
            if ("窗口一".equals(Thread.currentThread().getName())) {
                //同步方法
                boolean result = synchronizedMethod();
                if (result) {
                    //true表示最后一张，结束循环
                    break;
                }
            }

            if ("窗口二".equals(Thread.currentThread().getName())) {
                //同步代码块
                //同步方法的锁对象是this 所以这里的同步代码块对象要与同步方法的对象保持一致
                synchronized (this) {
                    if (ticket == 0) {
                        //如果是最后一张票
                        break;
                    } else {
                        //不是最后一张
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticket--;
                        System.out.println(Thread.currentThread().getName() + "正在卖票，还剩" + ticket + "张");
                    }
                }
            }
        }
    }

    //同步方法
    private synchronized boolean synchronizedMethod() {
        if (ticket == 0) {
            //如果是最后一张票
            return true;
        } else {
            //不是最后一张
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName() + "正在卖票，还剩" + ticket + "张");
            return false;
        }
    }
}
