package 生产者和消费者_3.代码实现_1;

public class Demo {
    public static void main(String[] args) {

        Desk desk = new Desk();

        Foodie f = new Foodie(desk);
        Cooker c = new Cooker(desk);

        f.start();
        c.start();
    }
}
