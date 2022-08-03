package 线程池_4.volatile问题_3.synchronized解决_2;

public class Girl extends Thread {

    public Girl(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (true) {
            //同步代码块
            synchronized (Money.lock) {
                if (Money.money != 100000) {
                    System.out.println("结婚基金已经没有十万了！！！");
                    break;
                }
            }
        }

        /*while (Money.money == 100000){
        }
        System.out.println("存款已经不是十万了");*/
    }
}
