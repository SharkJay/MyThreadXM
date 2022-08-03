package 线程池_4.volatile问题_3.synchronized解决_2;

public class Boy extends Thread {

    public Boy() {
    }

    public Boy(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (Money.lock) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Money.money = 90000;
        }
    }
}
