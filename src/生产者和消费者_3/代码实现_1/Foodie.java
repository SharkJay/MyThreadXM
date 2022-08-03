package 生产者和消费者_3.代码实现_1;

public class Foodie extends Thread {

    private Desk desk;

    //构造方法
    public Foodie(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        //吃货是不是要吃多次汉堡包？所以写while死循环
        while (true) {
            //同步代码块把多条语句操作共享数据的代码给锁起来，让任意时刻只能有一个线程执行即可
            //锁对象必须唯一
            synchronized (desk.getLock()) {
                //判断汉堡包有没有吃到10个，吃到十个，剩余机会为0就跳出while循环
                if (desk.getCount() == 0) {
                    break;
                } else {
                    //还没有吃到10个
                    if (desk.isFlag()) {
                        //桌子上有汉堡包
                        //那就吃呗
                        System.out.println("消费者吃汉堡包！");
                        //桌子上的那个汉堡吃完了没有了，就把flag标记修改为false
                        desk.setFlag(false);
                        //汉堡吃完了，叫醒等待的生产者继续生产
                        desk.getLock().notifyAll();
                        //叫醒生产者，还可以吃的汉堡余额减一
                        desk.setCount(desk.getCount() - 1);
                    } else {
                        //桌子上没有汉堡包，消费者开始等待
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
