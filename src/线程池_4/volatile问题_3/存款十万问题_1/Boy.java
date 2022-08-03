package 线程池_4.volatile问题_3.存款十万问题_1;

public class Boy extends Thread {

    public Boy() {
    }

    public Boy(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Money.money = 90000;
    }
}
