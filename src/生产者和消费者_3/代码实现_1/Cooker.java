package 生产者和消费者_3.代码实现_1;

public class Cooker extends Thread {

    private Desk desk;

    public Cooker(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (desk.getLock()) {
                if (desk.getCount() == 0) {
                    //如果消费者还能吃的汉堡余额为0，生产者就跳出循环不生产
                    break;
                } else {
                    if (!desk.isFlag()) {
                        //桌子上没有汉堡包，生产
                        System.out.println("厨师正在生产汉堡");
                        //生产完放到桌子上，桌子上此时有汉堡了，修改flag状态
                        desk.setFlag(true);
                        //还得叫醒正在等待的消费者吃汉堡
                        desk.getLock().notifyAll();
                    } else {
                        //桌上有汉堡，等待
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
