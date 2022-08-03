package 线程池_4.volatile问题_3.存款十万问题_1;

public class Girl extends Thread {


    public Girl(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (Money.money == 100000){

        }

        System.out.println("存款已经不是十万了");
    }
}
